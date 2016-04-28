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
	public void Test_001_SUCL_NotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "001_SUCL_NotExisting_SameFile\\";		
		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClassLib SystemUnitClassLib3 not found");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_002_SUC_NotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "002_SUC_NotExisting_SameFile\\";		
		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClass SystemUnitClass100 not found");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_003_SUC_Existing_OneHierarchyAbove() throws Exception 
	{
		String modelPath = TestModelPath + "003_SUC_Existing_OneHierarchyAbove\\";		
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_004_SUC_NotExisting_OneHierarchyAbove() throws Exception 
	{
		String modelPath = TestModelPath + "004_SUC_NotExisting_OneHierarchyAbove\\";		
		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClass NotExistingRobot not found");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_005_SUCL_Existing_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "005_SUCL_Existing_MultipleModels\\";		
		//expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClass NotExistingRobot not found");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_006_SUCL_NotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "006_SUCL_NotExisting_MultipleModels\\";		
		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClassLib ReferencedSUCLNotExisting not found");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_007_SUC_NotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "007_SUC_NotExisting_MultipleModels\\";		
		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClass ReferencedSUCNotExisting not found");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
}
