package amlValidationTestSuite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import amlValidationSuite.AMLValidationSuite;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;

public class AMLMetaInformation {

	private String TestModelPath = ".\\TestModels\\AMLMetaInformation\\";
	
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
			System.out.println("ACTUAL: " + actual.toString()); 
			System.out.println("EXPECTED: " + expected.toString());
	
		}
	}
	
	
	@Test
	public void Test_001_NoElementWriterHeader() throws Exception 
	{
		String modelPath = TestModelPath + "001_NoElementWriterHeader\\";		
		expected.addExpectedConstraint("HasElementWriterHeader", "Testcase.aml: No Element <WriterHeader> defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_002_NoWriterName() throws Exception 
	{
		String modelPath = TestModelPath + "002_NoWriterName\\";		
		expected.addExpectedConstraint("HasWriterName", "Testcase.aml: No Element <WriterName> defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}

}
