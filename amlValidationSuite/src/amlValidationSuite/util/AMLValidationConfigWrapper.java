package amlValidationSuite.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AMLValidationConfigWrapper {
	
	private static AMLValidationConfigWrapper configWrapper = null;

	private String srcDir;
	private String evlSrcFile;
	private String propertyFile;
	private String modelPath;
	private String caexSchema;
	
		
	
	

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
	
	
	public void Init() throws FileNotFoundException
	{
		Properties prop = new Properties();
		InputStream inputStream = null;
		
		String propFileName = getPropertyFile();
		 
		inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		try
		{
			prop.load(inputStream);
		}
		catch(IOException | NullPointerException e)
		{			
			throw new FileNotFoundException("Property file '" + propFileName + "' not found in the classpath");
		}

		setSrcDir(prop.getProperty("srcDir"));		
		setEvlSrcFile(prop.getProperty("evlSrcFile"));
		setCaexSchema(prop.getProperty("CAEXSchema"));
				
	}
	
	
	
	public String getEvlSrcFile() {
		return evlSrcFile;
	}
	public void setEvlSrcFile(String evlSrcFile) {
		this.evlSrcFile = evlSrcFile;
	}

	public String getSrcDir() {
		return srcDir;
	}

	public void setSrcDir(String srcDir) {
		this.srcDir = srcDir;
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

	

	
	
	
	
	

}
