package amlValidationTestSuite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import amlValidationSuite.AMLValidationSuite;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;

public class AMLReferences {

	private String TestModelPath = ".\\TestModels\\AMLReferences\\";
	
	private AMLValidationSuite validationSuite = null;
	private AMLExpectedUnsatisfiedConstraints expected = null;
	private AMLExpectedUnsatisfiedConstraints actual = null;	

	@Before
	public void setUp() throws Exception {
		validationSuite = new AMLValidationSuite("configUnitTest.properties");
		
		expected = new AMLExpectedUnsatisfiedConstraints();		
	}

	@After
	public void tearDown() throws Exception {
		if(!(actual.containsAll(expected)&& expected.containsAll(actual)))
		{
			System.out.println("ACTUAL: \n" + actual.toString()); 
			System.out.println("EXPECTED: \n" + expected.toString());
	
		}
	}
	
	
	@Test
	public void Test_001_SUC() throws Exception 
	{
		String modelPath = TestModelPath + "001_SUC\\";		
		//expected.addExpectedConstraint("HasName", "Testcase.aml - RoleClassLib ManufacturingRoleClasses: RoleClass without attribute 'name' defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
}
