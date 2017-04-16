package amlValidationTestSuite;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import ValidationModel.ValidationError;
import ValidationModel.ValidationExecution;
import ValidationModel.ValidationModelFactory;
import amlValidationSuite.AMLValidationSuite;

public class AMLTest {
	@Rule 
	public TestName name = new TestName();
	
	protected AMLValidationSuite validationSuite = null;
	protected EList<ValidationError> expected = null;
	protected EList<ValidationError> actual = null;
	protected ValidationExecution validationResult = null;	
	
	
	
	@Before
	public void setUp() throws Exception {
		validationSuite = new AMLValidationSuite("configUnitTest.properties");		
		expected = new BasicEList<ValidationError>();		
	}

	@After
	public void tearDown() throws Exception {
		if(!validateTest())
		{
			System.out.println("Testcase: " + name.getMethodName());
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
		actual = (EList<ValidationError>) validationResult.getValidationErrors();
				
		return validateTest();		
	}
	
	
	private boolean validateTest()
	{
		return actual.containsAll(expected) && expected.containsAll(actual);
	}
	
	

}
