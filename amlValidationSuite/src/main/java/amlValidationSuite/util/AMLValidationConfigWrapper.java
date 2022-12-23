package amlValidationSuite.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

import amlValidationSuite.AMLValidationSuite;

public class AMLValidationConfigWrapper {
	
	private static AMLValidationConfigWrapper configWrapper = null;
	
	private String basePath;
	private String propertyFile;
	private String modelPath;
	private String caexSchema;	
	private String evlScrFilePhaseOne;
	private String evlScrFilePhaseTwo;
	private String evlScrFilePhaseThree;
	private String evlScrFilePhaseFour;
	private String evlScrFilePhaseFive;
	private String evlScrFilePhaseSix;
	
	private String classPathSuite;
	

	public String getClassPathSuite() {
		return classPathSuite;
	}

	public void setClassPathSuite(String classPathSuite) {
		this.classPathSuite = classPathSuite;
	}

	private AMLValidationConfigWrapper() {
				
	}
	
	public static AMLValidationConfigWrapper getInstance()
	{
		if(configWrapper == null)
		{
			configWrapper = new AMLValidationConfigWrapper();			
		}
		
		return configWrapper;
	}	
	
	public void Init(Map<String, String> params) throws FileNotFoundException 
	{	
		
		setBasePath(params.get("basePath"));
		setClassPathSuite(params.get("classPathSuite"));
		
		
		try (InputStream input = new FileInputStream(getBasePath() + params.get("property"))) {           

			Properties prop = new Properties();
            prop.load(input);
            
            setCaexSchema(getClassPathSuite() + prop.getProperty("CAEXSchema"));
    		setModelPath(prop.getProperty("modelPath"));
    		setEvlScrFilePhaseOne(getClassPathSuite()  + prop.getProperty("evlSrcFilePhaseOne"));		
    		setEvlScrFilePhaseTwo(getClassPathSuite()  + prop.getProperty("evlSrcFilePhaseTwo"));
    		setEvlScrFilePhaseThree(getClassPathSuite()  + prop.getProperty("evlSrcFilePhaseThree"));
    		setEvlScrFilePhaseFour(getClassPathSuite()  + prop.getProperty("evlSrcFilePhaseFour"));
    		setEvlScrFilePhaseFive(getClassPathSuite()  + prop.getProperty("evlSrcFilePhaseFive"));
    		setEvlScrFilePhaseSix(getClassPathSuite()  + prop.getProperty("evlSrcFilePhaseSix"));
		}
		catch (IOException ex) {
            ex.printStackTrace();
        }
						
	}
	
	
	
	
	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getPropertyFile() {
		return propertyFile;
	}

	public void setPropertyFile(String propertyFile) {
		this.propertyFile = propertyFile;
	}

	public String getModelPath() {
		return modelPath;
	}

	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
	}
	
	public String getCaexSchema() {
		return caexSchema;
	}

	public void setCaexSchema(String caexSchema) {
		this.caexSchema = caexSchema;
	}

	public String getEvlScrFilePhaseOne() {
		return evlScrFilePhaseOne;
	}

	public void setEvlScrFilePhaseOne(String evlScrFilePhaseOne) {
		this.evlScrFilePhaseOne = evlScrFilePhaseOne;
	}
	
	public String getEvlScrFilePhaseTwo() {
		return evlScrFilePhaseTwo;
	}

	public void setEvlScrFilePhaseTwo(String evlScrFilePhaseTwo) {
		this.evlScrFilePhaseTwo = evlScrFilePhaseTwo;
	}
	
	public String getEvlScrFilePhaseThree() {
		return evlScrFilePhaseThree;
	}

	public void setEvlScrFilePhaseThree(String evlScrFilePhaseThree) {
		this.evlScrFilePhaseThree = evlScrFilePhaseThree;
	}
	
	public String getEvlScrFilePhaseFour() {
		return evlScrFilePhaseFour;
	}

	public void setEvlScrFilePhaseFour(String evlScrFilePhaseFour) {
		this.evlScrFilePhaseFour = evlScrFilePhaseFour;
	}
	
	public String getEvlScrFilePhaseFive() {
		return evlScrFilePhaseFive;
	}

	public void setEvlScrFilePhaseFive(String evlScrFilePhaseFive) {
		this.evlScrFilePhaseFive = evlScrFilePhaseFive;
	}

	public String getEvlScrFilePhaseSix() {
		return evlScrFilePhaseSix;
	}

	public void setEvlScrFilePhaseSix(String evlScrFilePhaseSix) {
		this.evlScrFilePhaseSix = evlScrFilePhaseSix;
	}


	

	
	
	
	
	

}
