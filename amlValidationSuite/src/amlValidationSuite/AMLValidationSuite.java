/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package amlValidationSuite;


import CAEX.CAEXFile;
import CAEX.CAEXPackage;
import CAEX.ExternalReference;
import CAEX.RoleClassLib;
import GenericAnyType.GenericAnyTypePackage;
import ValidationModel.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelElementTypeNotFoundException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.epsilon.eol.types.EolAnyType;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.epsilon.eol.types.EolModelType;
import org.eclipse.epsilon.eol.types.EolPrimitiveType;
import org.eclipse.epsilon.eol.types.EolType;
import org.xml.sax.SAXException;

import amlValidationSuite.util.AMLValidationConfigWrapper;
import amlValidationSuite.util.AMLValidationSuiteHelper;
import amlValidationSuite.util.AMLModelHierarchy;
import amlValidationSuite.util.AMLModelTransformer;



public class AMLValidationSuite {
	
	private EvlModule module = null;
	private String rootModel;
	private AMLModelHierarchy modelHierarchy = null;
	private HashMap<String, EmfModel> mapModels = null;
	private List<String> models = null;
	private List<String> referencedModels = null;
	private ValidationExecution valExec = ValidationModelFactory.eINSTANCE.createValidationExecution();
	
	
	public AMLValidationSuite(String propertyFile) throws FileNotFoundException, IllegalArgumentException
	{
		AMLValidationSuiteHelper helper = AMLValidationSuiteHelper.getInstance();
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();	
		
		config.setPropertyFile(propertyFile);
				
		modelHierarchy = new AMLModelHierarchy();
		mapModels = new HashMap<String, EmfModel>();
		models = new ArrayList<String>();
		referencedModels = new ArrayList<String>();
				
		config.Init();		
			
		module = helper.initializeEVLSource();		
		EPackage.Registry.INSTANCE.put(CAEXPackage.eINSTANCE.getNsURI(), CAEXPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(GenericAnyTypePackage.eINSTANCE.getNsURI(), GenericAnyTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ValidationModelPackage.eINSTANCE.getNsURI(), ValidationModelPackage.eINSTANCE);
		
		
		
	}
	
	private boolean preProcessModels(String modelPath, String model)  throws IOException
	{		
		AMLValidationSuiteHelper helper = AMLValidationSuiteHelper.getInstance();
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		boolean bValidModel = false;
				
		AMLModelTransformer transformer = new AMLModelTransformer(valExec);
		
		config.setModelPath(modelPath);
		
		bValidModel = helper.checkParam(model, modelPath, valExec);
		
		if(bValidModel)
		{
			this.rootModel = model;
		
			transformer.transformModelsToXMI(config.getModelPath(), model, modelHierarchy);		
			registerModelsAtModule();	
		}
		
		return bValidModel;		
	};
	
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
		AMLValidationSuiteHelper helper = AMLValidationSuiteHelper.getInstance();
		IModel iRootModel = null, iValidationModel = null;
		Map<String, Object> parameter = null;
		
		models = modelHierarchy.getModels();
		referencedModels = modelHierarchy.getReferencedModels();
		
		
		helper.createModels(models, mapModels);
		helper.createModels(referencedModels, mapModels);	
		
		
		
		
		helper.interlinkModels(models, mapModels, modelHierarchy);		
		helper.refreshLinkedModels(models, mapModels);		
		
		parameter = helper.readParameterForEVL(mapModels.get(rootModel), this.rootModel);
		
		iRootModel = mapModels.get(rootModel);		
		iValidationModel = mapModels.get("ValidationModel");
			
		module.getContext().getModelRepository().addModel(iRootModel);
		module.getContext().getModelRepository().addModel(iValidationModel);
		
		
		
		setParametersToEVL(parameter);
	}
	
	
	
	
	public ValidationExecution execute(String modelPath, String model) throws IOException, EolRuntimeException 
	{	
			
		boolean bValidModel = preProcessModels(modelPath, model);
		
		if(bValidModel)
		{
			execute(module);				
		}
		
		postProcess();		
		return getValExec();
	}
	
	
	private void postProcess()
	{
		AMLValidationSuiteHelper helper = AMLValidationSuiteHelper.getInstance();
		
		helper.disposeModels(models, mapModels);		
		referencedModels.removeAll(models); //already disposed
		helper.disposeModels(referencedModels, mapModels);			
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
	
	
	
	private Object execute(IEolExecutableModule module) 
			throws EolRuntimeException {
		return module.execute();
	}
	
	public ValidationExecution getValExec() {
		return valExec;
	}
	
	
	public static void main(String[] args) throws Exception 
	{		
		String propertyFile = args[0];
		String modelPath = args[1];
		String paramModelXML = args[2];		 
		
		try
		{
			AMLValidationSuite validationSuite = new AMLValidationSuite(propertyFile);	
			//Collection<UnsatisfiedConstraint> unsatisfied = validationSuite.execute(modelPath, paramModelXML);
			//validationSuite.showValidationResult(unsatisfied);
		}
		catch(IOException | IllegalArgumentException e)
		{
			e.printStackTrace();			
		}
		
		
	}
	
	
	
}