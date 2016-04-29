package amlValidationSuite.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import CAEX.util.CAEXResourceFactoryImpl;
import CAEX.util.CaexSerializer;
import CAEX.InstanceHierarchy;
import CAEX.InternalElement;

public class AMLModelTransformer {
	
	

	private ResourceSet resourceSet = null;
	private String amlExtension = "aml";
	private String xmiExtension = "xmi";
	
	public AMLModelTransformer()
	{
		resourceSet = new ResourceSetImpl();
		
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put(amlExtension, new CAEXResourceFactoryImpl());
	
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
			.put(xmiExtension, new XMIResourceFactoryImpl());
		
	}	
	
	public void transformModelsToXMI(String modelXMLDir, String model, AMLModelHierarchy modelHierarchy) throws IOException
	{	
		AMLValidationConfigWrapper config = AMLValidationConfigWrapper.getInstance();
		AMLValidationSuiteHelper helper = AMLValidationSuiteHelper.getInstance();
		
		String modelXMIDir = config.getModelPath();
		File xmlFile = new File(modelXMLDir + model + "." + amlExtension);
		File xmiFile = new File(modelXMIDir + model + "." + xmiExtension);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(false);
		
		
		//CaexPreprocessor.removeAdditionalInformation("examples/01_Topology/ExampleTopology.aml");
		CaexSerializer serializer = new CaexSerializer();
		
		try
		{
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			serializer.writeXMI(xmlFile, resourceSet, xmiFile);			
		
			Document doc = db.parse(new FileInputStream(xmlFile));
			
			modelHierarchy.addModel(model);
			
			NodeList list = doc.getElementsByTagName("ExternalReference");			
			
			for(int i = 0; i < list.getLength(); i++)
			{
				AMLExternalReference externalRef = parseExternalReference((Element) list.item(i));			
				
				helper.checkParam(externalRef.getRefModel(), config.getModelPath() + externalRef.getModelPath());
				
				
				modelHierarchy.addExternalReferenceToModel(model, externalRef);								
				transformModelsToXMI(modelXMLDir + externalRef.getModelPath(), externalRef.getRefModel(), modelHierarchy);				
			}
		}
		catch(IOException e)
		{
			throw new IOException("XMIFile " + xmiFile + " could not be created");
		}
		catch(ParserConfigurationException | SAXException e)
		{
			throw new IllegalArgumentException("Problem parsing " + xmlFile + " file");			
		}
				
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

}
