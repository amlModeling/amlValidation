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
	
	@Test
	public void Test_003_NoWriterID() throws Exception 
	{
		String modelPath = TestModelPath + "003_NoWriterID\\";		
		expected.addExpectedConstraint("HasWriterID", "Testcase.aml: No Element <WriterID> defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_004_NoWriterVendor() throws Exception 
	{
		String modelPath = TestModelPath + "004_NoWriterVendor\\";		
		expected.addExpectedConstraint("HasVendor", "Testcase.aml: No Element <WriterVendor> defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_005_NoWriterVendorURL() throws Exception 
	{
		String modelPath = TestModelPath + "005_NoWriterVendorURL\\";		
		expected.addExpectedConstraint("HasVendorURL", "Testcase.aml: No Element <WriterVendorURL> defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_006_NoWriterVersion() throws Exception 
	{
		String modelPath = TestModelPath + "006_NoWriterVersion\\";		
		expected.addExpectedConstraint("HasVersion", "Testcase.aml: No Element <WriterVersion> defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_007_NoWriterRelease() throws Exception 
	{
		String modelPath = TestModelPath + "007_NoWriterRelease\\";		
		expected.addExpectedConstraint("HasWriterRelease", "Testcase.aml: No Element <WriterRelease> defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_008_LastWritingDateTimeWrongFormated() throws Exception 
	{
		String modelPath = TestModelPath + "008_LastWritingDateTimeWrongFormated\\";		
		expected.addExpectedConstraint("IsLastWritingDateTimeCorrectFormated", "Testcase.aml: LastWritingDateTime '20161-04-11T23:57:35' is not of type DateTime");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	
	

}
