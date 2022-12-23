
package amlValidationSuite;


import CAEX.CAEXFile;
import CAEX.CAEXPackage;
import CAEX.util.CAEXResourceFactoryImpl;
import CAEX.util.CaexSerializer;
import GenericAnyType.GenericAnyTypePackage;
import ValidationModel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emc.emf.xml.XmlModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.epsilon.evl.execute.context.EvlContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.eclipse.epsilon.eol.types.EolModelType;
import amlValidationSuite.util.AMLValidationConfigWrapper;
import amlValidationSuite.util.AMLExternalReference;

import org.apache.commons.cli.*;

public class AMLValidationSuite {
	
	private EvlModule module = new EvlModule();
	
	private String rootModelName;
	private HashMap<String, EmfModel> mapModels = new HashMap<String, EmfModel>();
	private HashMap<String, CAEXFile> mapAliasToCAEXObj = new HashMap<String, CAEXFile>();

	private ValidationExecution valExec = ValidationModelFactory.eINSTANCE.createValidationExecution();
	private static String XMLExtension = ".aml";
	private static String XMIExtension = ".xmi";
	ResourceSet resourceSet = null;
	
	
	public AMLValidationSuite(Map<String, String> params) throws FileNotFoundException 
	{
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();	
						
		config.Init(params);
		
		EPackage.Registry.INSTANCE.put(CAEXPackage.eINSTANCE.getNsURI(), CAEXPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(GenericAnyTypePackage.eINSTANCE.getNsURI(), GenericAnyTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ValidationModelPackage.eINSTANCE.getNsURI(), ValidationModelPackage.eINSTANCE);		
		
		

		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
		.put("aml", new XMLResourceFactoryImpl()); 
		
	//	ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
	//	.put("aml", new CAEXResourceFactoryImpl()); 
				
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
		.put("xmi", new XMIResourceFactoryImpl());
		
		resourceSet = new ResourceSetImpl();
	}
	
	private boolean preProcessModels(String modelSubPath, String modelName) throws IOException
	{		
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		boolean validModel = false;
		String aktModelPath;		
		
		aktModelPath = config.getModelPath();
		if(!modelSubPath.isEmpty())
			aktModelPath += modelSubPath;
		
		validModel = validateCAEXConformity(modelName, aktModelPath, valExec);
		
		if(validModel)
		{
			rootModelName = modelName;
		
			transformModelsToXMI(aktModelPath, "", aktModelPath, modelName, "", mapModels);
			
		}
		
		return validModel;		
	}
	
	
	private void transformModelsToXMI(String modelRootXML, String subPathRefModel, String modelXMIDir, String model, String subModelAlias, HashMap<String, EmfModel> mapModels) throws IOException
	{
		CaexSerializer serializer = new CaexSerializer();		
		File xmlFile = new File(modelRootXML + subPathRefModel + model + XMLExtension);
		File xmiFile = new File(modelXMIDir + model + XMIExtension);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		String mapModelKey;
		
		dbf.setValidating(false);		
		
		try
		{
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document actModelXML = null;
			NodeList listExternalReferences = null;
			
			serializer.writeXMI(xmlFile, resourceSet, xmiFile);	
			
			try 
			{
				EmfModel emfModel = createEmfModelByURI("CAEX", modelXMIDir + model + XMIExtension, "http://caex", true, true);		
				
				mapModels.put(model, emfModel);		
				
				if(!subModelAlias.isEmpty()) //linked Model
					mapModelKey = subModelAlias;
				else 
					mapModelKey = "RootModel";
				
				mapAliasToCAEXObj.put(mapModelKey, getCAEXFile(emfModel));
			}
			catch (EolModelLoadingException | URISyntaxException e) {
				e.printStackTrace();
				
				throw new FileNotFoundException("ModelFile " + model + " not found or invalid");
			}			
					
			actModelXML = db.parse(new FileInputStream(xmlFile));
			listExternalReferences = actModelXML.getElementsByTagName("ExternalReference");			
			
			for(int i = 0; i < listExternalReferences.getLength(); i++)
			{
				AMLExternalReference externalRef = parseExternalReference((Element) listExternalReferences.item(i));			
				
				validateCAEXConformity(externalRef.getRefModel(), modelRootXML + subPathRefModel + externalRef.getModelPath(), valExec);
				transformModelsToXMI(modelRootXML, subPathRefModel + externalRef.getModelPath(), modelRootXML + subPathRefModel + externalRef.getModelPath(), externalRef.getRefModel(), externalRef.getAlias(), mapModels);				
			}
		}
		catch(IOException e)
		{
			throw new IOException("XMIFile " + xmiFile + " could not be created");
		}
		catch(ParserConfigurationException ex)
		{
			throw new IllegalArgumentException("Problem parsing " + xmlFile + " file");			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}	
	
	private CAEXFile getCAEXFile(IModel model)
	{
		CAEXFile ret = null;
		Iterator<CAEXFile> it = null;		
		List<CAEXFile> listCAEX;
		
		try {
			listCAEX = (List<CAEXFile>) model.getAllOfType("CAEXFile");			
			ret = listCAEX.get(0);			
			
			
		} catch (EolModelElementTypeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return ret;	
	}
	
	
	public void createValidationModel(HashMap<String, EmfModel> mapModels) throws FileNotFoundException
	{
		
		try {
			EmfModel model = createEmfModelByURI("ValidationModel", "", "http://ValidationModel", false, false);
			mapModels.put("ValidationModel", model);
		} catch (EolModelLoadingException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	private EmfModel createEmfModelByURI(String metaModelName, String modelPath, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();		
		StringProperties properties = new StringProperties();			
		String modelUri = "";
		
				
		if(!modelPath.isEmpty())
		{
			org.eclipse.emf.common.util.URI URIModel = org.eclipse.emf.common.util.URI.createFileURI(modelPath);			
			modelUri = URIModel.toString();
			
		}
		else
			readOnLoad = false;			
		
		properties.put(EmfModel.PROPERTY_NAME, metaModelName);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, modelUri);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		properties.put(EmfModel.PROPERTY_EXPAND, true + "");
	    properties.put(EmfModel.PROPERTY_CACHED, false + "");
				
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}
	
	
	private XmlModel createEmfModelByURIXML(String metaModelName, String modelPath, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		XmlModel model = new XmlModel();
		//StringProperties properties = new StringProperties();
		StringProperties propertiesXML = new StringProperties();	
		String modelUri = "";
		String xsdUri = "";
				
		if(!modelPath.isEmpty())
		{
			org.eclipse.emf.common.util.URI URIModel = org.eclipse.emf.common.util.URI.createFileURI(modelPath);
			org.eclipse.emf.common.util.URI URIXsd = org.eclipse.emf.common.util.URI.createFileURI(config.getCaexSchema());
			modelUri = URIModel.toString();
			xsdUri = URIXsd.toString();
		}
		else
			readOnLoad = false;		
		
		
		
		
		propertiesXML.put(EmfModel.PROPERTY_NAME, metaModelName);
		propertiesXML.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		propertiesXML.put(EmfModel.PROPERTY_MODEL_URI, modelUri);
		//propertiesXML.put(EmfModel.PROPERTY_MODEL_FILE, modelPath);
		propertiesXML.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		//propertiesXML.put(XmlModel.PROPERTY_XSD_URI, xsdUri);
		propertiesXML.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		propertiesXML.put(EmfModel.PROPERTY_EXPAND, true + "");
		propertiesXML.put(EmfModel.PROPERTY_CACHED, false + "");
		propertiesXML.put(XmlModel.PROPERTY_XSD_URI, xsdUri);
		
		model.load(propertiesXML, (IRelativePathResolver)null);
		
		
		
		
		
		return model;
	}
	
	
	
	private AMLExternalReference parseExternalReference(Element xmlExternalRef)
	{
		AMLExternalReference amlExternalReference = new AMLExternalReference();
		String modelPath;
		String refModel;
		String attrib = xmlExternalRef.getAttribute("Path");
		
		if(attrib.contains("/"))
		{
			modelPath = attrib.substring(0, attrib.lastIndexOf("/")+1);
			refModel = attrib.substring(attrib.lastIndexOf("/")+1);
						
		}
		else
		{
			refModel = attrib;
			modelPath = "";			
		}
		
		refModel = refModel.substring(0, refModel.length()-4); //.aml abschneiden
		
		amlExternalReference.setModelPath(modelPath);
		amlExternalReference.setRefModel(refModel);
		amlExternalReference.setAlias(xmlExternalRef.getAttribute("Alias"));		
		
		return amlExternalReference;
	}
	
	
	
	
	
	private boolean validateCAEXConformity(String model, String modelFilePath, ValidationExecution valEx) throws FileNotFoundException
	{
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		SchemaFactory factory = null;
		Schema schema = null;
		Validator validator = null;
		File modelFile = null; 	
		boolean validModel = true;				
		
		try
		{
			modelFile = new File(modelFilePath + model + XMLExtension);
			factory =	SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		    schema = factory.newSchema(new File(config.getCaexSchema()));
		    
		    validator = schema.newValidator();
		    validator.validate(new StreamSource(modelFile));			
		}
		catch(SAXException ex)
		{
			ValidationError saxError = ValidationModelFactory.eINSTANCE.createValidationError();
			saxError.setConstraintName("CAEX Schema Validation");
			saxError.setAdditionalInformation(ex.getMessage());		
			saxError.setModelFileName(model+".aml");
			
			valEx.getValidationErrors().add(saxError);	
			validModel = false;
		} 
		catch(IOException ex)
		{
			throw new FileNotFoundException("Model input file " + model + " not found");
		}		
		
		return validModel;
	}
	
	
	
	private void setParametersToEVL(Map<String, Object> parameter)
	{
		Iterator<Entry<String, Object>> it = parameter.entrySet().iterator();
		Variable actVar = null;
				
		while(it.hasNext())
		{
			Entry<String, Object> entry = it.next();
			
			actVar = Variable.createReadOnlyVariable(entry.getKey(), entry.getValue());			
			module.getContext().getFrameStack().put(actVar);
			
		}
		
		actVar = new Variable("ValidationExecution", valExec, new EolModelType());	
		module.getContext().getFrameStack().put(actVar);
	}
	
	
	private void registerModelsAtModule() throws FileNotFoundException 
	{
		Map<String, Object> mapEVLParameter = null;			
	
		module = new EvlModule();
		mapModels.remove("ValidationModel");
		
		mapEVLParameter = readParameterForEVL(mapModels.get(rootModelName), rootModelName);
		
		addAllModelsToCommonResourceSet();
		
		createValidationModel(mapModels);
		
		module.getContext().getModelRepository().addModel(mapModels.get(rootModelName));
		module.getContext().getModelRepository().addModel(mapModels.get("ValidationModel"));

		setParametersToEVL(mapEVLParameter);
	}
	
	
	private void addAllModelsToCommonResourceSet()
	{
		ResourceSet commonResourceSet = null;
		
		commonResourceSet = mapModels.get(rootModelName).getResource().getResourceSet();
		
		Iterator<Entry<String, EmfModel>> it = mapModels.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<String, EmfModel> akt = it.next();
			commonResourceSet.getResources().add(akt.getValue().getResource());
		}
	}
	
	private Map<String, Object> readParameterForEVL(EmfModel rootModel, String rootModelName)
	{
		HashMap<String, Object> variables = new HashMap<String, Object>();
				
		variables.put("mapAliasToCAEXObj", mapAliasToCAEXObj);
		
		return variables;
	}
	
	
	
	
	public void initializeEVLSource(String filename) throws IllegalArgumentException
	{
		StringBuffer err = new StringBuffer();
		File evlFile = null;
		
		try
		{
			evlFile = new File(filename);
			module.parse(evlFile);
		
			if (module.getParseProblems().size() > 0) {
				err.append("Parse errors occured...:\n");
				for (ParseProblem problem : module.getParseProblems()) {
					err.append(problem.toString() + "\n");
				}
			}
		}		
		catch(Exception ex)
		{
			throw new IllegalArgumentException("EVL Sourcefile " + filename + " is invalid: \n" + err.toString());
		}
	}
	
	
	
	
	public ValidationExecution execute(String modelSubDir, String modelName) throws IOException, EolRuntimeException 
	{	
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
			
		boolean bValidModel = preProcessModels(modelSubDir, modelName);
		
		if(bValidModel)
		{	
			registerModelsAtModule();
			Set<UnsatisfiedConstraint> ret;
			initializeEVLSource(config.getEvlScrFilePhaseOne());			
			
			ret = execute(module);			
						
			if (ret.isEmpty())
			{
				registerModelsAtModule();							
				initializeEVLSource(config.getEvlScrFilePhaseTwo());
				ret = execute(module);
			}
			
			if (ret.isEmpty())
			{
				registerModelsAtModule();							
				initializeEVLSource(config.getEvlScrFilePhaseThree());
				ret = execute(module);
			}
			
			if (ret.isEmpty())
			{
				registerModelsAtModule();							
				initializeEVLSource(config.getEvlScrFilePhaseFour());
				ret = execute(module);
			}
			
			if (ret.isEmpty())
			{
				registerModelsAtModule();							
				initializeEVLSource(config.getEvlScrFilePhaseFive());
				ret = execute(module);
			}
			
			if (ret.isEmpty())
			{
				registerModelsAtModule();							
				initializeEVLSource(config.getEvlScrFilePhaseSix());
				ret = execute(module);
			}	
		}
		
		postProcess();		
		return getValExec();
	}
	
	
	private void postProcess()
	{
		
		//ToDo: Aufräumen
		//referencedModels.removeAll(models); //already disposed
		//helper.disposeModels(referencedModels, mapModels);			
		module.getContext().getModelRepository().dispose();
		
	}	
	
	
	private void showValidationResult(Collection<UnsatisfiedConstraint> unsatisfied)
	{
		if (unsatisfied.size() > 0) {
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			for (UnsatisfiedConstraint uc : unsatisfied) {
				System.err.println(uc.getMessage());
			}
		}
		else {
			System.out.println("All constraints have been satisfied");
		}		
	}
	
	
	private Collection<UnsatisfiedConstraint> getUnsatisfiedConstraints()
	{
		return module.getContext().getUnsatisfiedConstraints();	
		
		
	}
	
	
	
	private Set<UnsatisfiedConstraint> execute(IEvlModule module) 
			throws EolRuntimeException {
		
		Set<UnsatisfiedConstraint> a = module.execute();
		System.out.println(a.toString());
		return a;
	}
	
	public ValidationExecution getValExec() {
		return valExec;
	}
	
	
	public static void main(String[] args) throws Exception			 
	{	
		Map<String, String> params = parseParam(args);
		
		try
		{
								
			AMLValidationSuite validationSuite = new AMLValidationSuite(params);	
			
			validationSuite.execute(params.get("modelSubDir"), params.get("model"));
		}
		catch(IOException | IllegalArgumentException e)
		{
			e.printStackTrace();			
		} catch (EolRuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
	
	private void disposeModels(List<String> models, HashMap<String, EmfModel> mapModels)
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
	
	
	public static Map<String, String> parseParam(String[] args) throws URISyntaxException
	{
		Map<String, String> params = new HashMap<>();
		Options options = new Options();

        Option property = new Option("p", "property", true, "property file");
        property.setRequired(true);
        options.addOption(property);
        
        
        Option modelSubDir = new Option("d", "modelSubdir", true, "property file");
        modelSubDir.setRequired(false);
        options.addOption(property);
        

        Option model = new Option("m", "model", true, "model file");
        model.setRequired(true);
        options.addOption(model);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd = null;//not a good practice, it serves it purpose 

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
        }
        
        Path root = Paths.get(AMLValidationSuite.class.getResource("").toURI());

        params.put("property", cmd.getOptionValue("property"));
        
        params.put("modelSubDir", cmd.getOptionValue("modelSubdir", ""));
        params.put("model", cmd.getOptionValue("model"));
        params.put("classPath", root.toString() + "\\");
        params.put("basePath", root.getParent().toString() + "\\");
        
        return params;		
	}
}