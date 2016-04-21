package amlValidationSuite.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;

import CAEX.AdditionalInformation;
import CAEX.CAEXFile;
import CAEX.ExternalReference;
import GenericAnyType.GenericAttribute;
import amlValidationSuite.AMLValidationSuite;

public class AMLValidationSuiteHelper {
	private static AMLValidationSuiteHelper instance = null;
	private static String XMLExtension = ".aml";
	private static String XMIExtension = ".xmi";
	
	private AMLValidationSuiteHelper()
	{
		
	}
	
	public static AMLValidationSuiteHelper getInstance()
	{
		if(instance == null)
			instance = new AMLValidationSuiteHelper();
		
		return instance;
	}
	
	
	
	
	
	
	private static List<Variable> parameters = new ArrayList<Variable>();
	
	/*
	public EmfModel createEmfModel(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		
		
		
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				getFileURI(metamodel).toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
				getFileURI(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
	}
	*/

	public EmfModel createEmfModelByURI(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, config.getModelPath() + model);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");
		properties.put(EmfModel.PROPERTY_EXPAND, 
				true + "");
	    properties.put(EmfModel.PROPERTY_CACHED, false + "");
				
		emfModel.load(properties, (IRelativePathResolver) null);
		
		
		return emfModel;
	}
	
/*
	
	public static IEolExecutableModule createModule() throws URISyntaxException, Exception {
		EvlModule module = new EvlModule();
		
		module.parse(AMLValidationSuiteHelper.getFileURI(AMLValidationSuiteHelper.getSource()));
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return null;
		}
		
		for (IModel model : AMLValidationSuiteHelper.getModels()) {
			module.getContext().getModelRepository().addModel(model);
			
			module.getContext().getModelRepository().
		}
		
		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}
		
		
		
		return module;
	}
	
	
	
	*/
	
	
	public boolean checkParam(String model) throws FileNotFoundException
	{
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		String modelFilePath = config.getModelPath();
		
		File f = new File(modelFilePath + model + XMLExtension);
		
		//ToDo: Eventuell CAEX Schema Validierung aufrufen
		
		if(!f.exists())
		{
			throw new FileNotFoundException("Model input file " + model + " not found");
		}
		
		return true;
	}
	
	public EvlModule initializeEVLSource() throws IllegalArgumentException
	{
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		EvlModule module = new EvlModule();
		StringBuffer err = new StringBuffer();
		File evlFile = new File(config.getSrcDir() + config.getEvlSrcFile());
		
		try
		{
			module.parse(evlFile);				
			
			if (module.getParseProblems().size() > 0) {
				err.append("Parse errors occured...:\n");
				for (ParseProblem problem : module.getParseProblems()) {
					err.append(problem.toString() + "\n");
				}
			}
		}catch(Exception ex)
		{		
			throw new IllegalArgumentException("EVL Sourcefile " + evlFile.getAbsolutePath() + " is invalid: \n" + err.toString());
		}
		
		return module;
	}
	
	
	public void createModels(List<String> models, HashMap<String, EmfModel> mapModels) throws FileNotFoundException
	{
		Iterator<String> it = models.iterator();
		String modelName;
		
		while(it.hasNext())
		{
			modelName = it.next();
			
			if(!mapModels.containsKey(modelName))
			{
				EmfModel model;
				try 
				{					
					model = createEmfModelByURI("CAEX", modelName + ".xmi", "http://caex", true, true);					
				}
				catch (EolModelLoadingException | URISyntaxException e) {
					
					throw new FileNotFoundException("ModelFile " + modelName + " not found or invalid");
				}
				mapModels.put(modelName, model);
			}
		}		
	}
	
	
	public void interlinkModels(List<String> models, HashMap<String, EmfModel> mapModels, AMLModelHierarchy modelHierarchy) 
	{
		Iterator<String> itModels = models.iterator();
		Iterator<ExternalReference> itExtRef = null;
		
		String modelName;
		String referencedModelName;
		EmfModel model = null;
		IModel iModel = null;
		List<ExternalReference> listExtRef = null;
		ExternalReference extRef = null;
		List<CAEXFile> list = null;
			
		try 
		{		
			while(itModels.hasNext())
			{
				modelName = itModels.next();
				
				model = mapModels.get(modelName);
				iModel = model;
				listExtRef = (List<ExternalReference>) iModel.getAllOfKind("ExternalReference");			
				itExtRef = listExtRef.iterator();
				
				while(itExtRef.hasNext())
				{
					extRef = itExtRef.next();
					
					referencedModelName = modelHierarchy.getReferencedModelNameForModel(modelName, extRef.getAlias());
					list = (List<CAEXFile>) ((IModel)mapModels.get(referencedModelName)).getAllOfKind("CAEXFile");					
					extRef.setLinkedModel(list.get(0));					
					model.store();				
				}
			}
		}
		catch (EolModelElementTypeNotFoundException e) {
			throw new IllegalStateException("Interlink of models failed");
		}
	}
	
	
	
	public void disposeModels(List<String> models, HashMap<String, EmfModel> mapModels)
	{
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		Iterator<String> it = models.iterator();
		String modelName;		
		
		while(it.hasNext())
		{
			modelName = it.next();	
			
			EmfModel model = mapModels.get(modelName);			
			model.dispose();			
			
			mapModels.remove(modelName);		
		}				
	}
	

	public void refreshLinkedModels(List<String> models, HashMap<String, EmfModel> mapModels) throws FileNotFoundException
	{
		disposeModels(models, mapModels);		
		createModels(models, mapModels);		
	}
	
	public Map<String, Object> readParameterForEVL(EmfModel rootModel)
	{
		HashMap<String, Object> variables = new HashMap<String, Object>();
		List<GenericAttribute> listAdditionalInf = null;
		Iterator<GenericAttribute> itAdditionalInf = null;
		List<CAEXFile> listCAEXFile = null;
		Iterator<CAEXFile> itCAEXFile = null;
		IModel model = rootModel;
		GenericAttribute actAddInf = null;
		CAEXFile caexFile = null;
		
		try {
			listAdditionalInf = (List<GenericAttribute>) model.getAllOfType("GenericAttribute");
			itAdditionalInf = listAdditionalInf.iterator();
			
			while(itAdditionalInf.hasNext())
			{
				actAddInf = itAdditionalInf.next();
				
				if(actAddInf.getName().equals("AutomationMLVersion"))
					variables.put("RootModelAutomationMLVersion", actAddInf.getValue());				
			}
			
			listCAEXFile = (List<CAEXFile>) model.getAllOfType("CAEXFile");
			itCAEXFile = listCAEXFile.iterator();
			
			while(itCAEXFile.hasNext())
			{
				caexFile = itCAEXFile.next();
				
				variables.put("RootModelCAEXSchemaVersion", caexFile.getSchemaVersion());
				
			}
		} catch (EolModelElementTypeNotFoundException e) {
			//No additionalInformation in rootModel -> EVL will report that
		
		}
		
		
		return variables;
	}
		
	public CAEXFile getRootCAEXFile(String rootModel, HashMap<String, EmfModel> mapModels)
	{
		CAEXFile ret = null;
		Iterator<CAEXFile> it = null;
		IModel model = (IModel)mapModels.get(rootModel);
		
		
		List<CAEXFile> listCAEX;
		try {
			listCAEX = (List<CAEXFile>) model.getAllOfType("CAEXFile");
			
			it = listCAEX.iterator();
			
			while(it.hasNext())
			{
				CAEXFile akt = it.next(); 
				if(akt.getFileName() == rootModel + ".aml")
				{
					ret = akt;
					break;
				}
			}
			
		} catch (EolModelElementTypeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return ret;	
	}
}



