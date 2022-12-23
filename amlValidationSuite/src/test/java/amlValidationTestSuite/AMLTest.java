package amlValidationTestSuite;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

import ValidationModel.ValidationError;
import ValidationModel.ValidationExecution;
import ValidationModel.ValidationModelFactory;
import amlValidationSuite.AMLValidationSuite;

public class AMLTest {
	 
	protected AMLValidationSuite validationSuite = null;
	protected EList<ValidationError> expected = null;
	protected EList<ValidationError> actual = null;
	protected ValidationExecution validationResult = null;	
	protected Map<String, String> params = null;
	
	
	public AMLTest()
	{
		
		
		
		
	}
	
	
	
	@BeforeEach
	public void setUp() throws Exception {
		Properties prop = new Properties();
		params = new HashMap<String, String>();
		Path root = Paths.get(AMLTest.class.getResource("").toURI());
		Path rootSuite = Paths.get(AMLValidationSuite.class.getResource("").toURI());
		
		params.put("property", "configUnitTest.properties");
		params.put("classPathSuite", rootSuite.getParent().toString() + "\\");
		params.put("basePath", root.getParent().toString() + "\\");
		//prop.load(AMLTest.class.getResourceAsStream(propFile));
		
		validationSuite = new AMLValidationSuite(params);		
		expected = new BasicEList<ValidationError>();	
		actual = new BasicEList<ValidationError>();
		
	}

	@AfterEach
	public void tearDown(TestInfo testInfo) throws Exception {
		if(!validateTest())
		{
			System.out.println("Testcase: " + testInfo.getDisplayName());
			System.out.println("ACTUAL: " + validationResult.getValidationErrors().toString()); 
			System.out.println("EXPECTED: " + expected.toString());
	
		}
	}
	
	
	
	public void addExpectedTestResult(String modelFileName, String constraintName, String actualValue, String expectedValue, String additionalInformation)
	{
		ValidationError valError = ValidationModelFactory.eINSTANCE.createValidationError();
		
		valError.setModelFileName(modelFileName);
		valError.setConstraintName(constraintName);
		valError.setActualValue(actualValue);
		valError.setExpectedValue(expectedValue);
		valError.setAdditionalInformation(additionalInformation);
		
		expected.add(valError);
	}
	
	
	public boolean executeAndValidateTest(String modelPath) throws IOException, EolRuntimeException
	{		
		validationResult = validationSuite.execute(modelPath, "Testcase");
		actual.addAll(validationResult.getValidationErrors());
				
		return validateTest();		
	}
	
	
	private boolean validateTest()
	{
		return actual.containsAll(expected) && expected.containsAll(actual);
	}
	
	

}
