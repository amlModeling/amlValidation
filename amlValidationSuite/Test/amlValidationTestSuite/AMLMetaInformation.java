package amlValidationTestSuite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import amlValidationSuite.AMLValidationSuite;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;

public class AMLMetaInformation extends AMLTest{

	private String TestModelPath = ".\\TestModels\\AMLMetaInformation\\";
	
		
	@Test
	public void Test_001_NoElementWriterHeader() throws Exception 
	{
		String modelPath = TestModelPath + "001_NoElementWriterHeader\\";		
				
		addExpectedTestResult("Testcase.aml", "HasElementWriterHeader", "", "", "No Element <WriterHeader> defined");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));				
	}
	
	@Test
	public void Test_002_NoWriterName() throws Exception 
	{
		String modelPath = TestModelPath + "002_NoWriterName\\";
		
		addExpectedTestResult("Testcase.aml", "HasWriterName", "", "", "No Element <WriterName> defined");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));				
	}
	
	@Test
	public void Test_003_NoWriterID() throws Exception 
	{
		String modelPath = TestModelPath + "003_NoWriterID\\";		
		
		addExpectedTestResult("Testcase.aml", "HasWriterID", "", "", "No Element <WriterID> defined");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void Test_004_NoWriterVendor() throws Exception 
	{
		String modelPath = TestModelPath + "004_NoWriterVendor\\";	
		
		addExpectedTestResult("Testcase.aml", "HasVendor", "", "", "No Element <WriterVendor> defined");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void Test_005_NoWriterVendorURL() throws Exception 
	{
		String modelPath = TestModelPath + "005_NoWriterVendorURL\\";	
		
		addExpectedTestResult("Testcase.aml", "HasVendorURL", "", "", "No Element <WriterVendorURL> defined");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void Test_006_NoWriterVersion() throws Exception 
	{
		String modelPath = TestModelPath + "006_NoWriterVersion\\";		
		
		addExpectedTestResult("Testcase.aml", "HasVersion", "", "", "No Element <WriterVersion> defined");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void Test_007_NoWriterRelease() throws Exception 
	{
		String modelPath = TestModelPath + "007_NoWriterRelease\\";	
		
		addExpectedTestResult("Testcase.aml", "HasWriterRelease", "", "", "No Element <WriterRelease> defined");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	/*
	
	@Test
	public void Test_008_LastWritingDateTimeWrongFormated() throws Exception 
	{
		String modelPath = TestModelPath + "008_LastWritingDateTimeWrongFormated\\";		
		expected.addExpectedConstraint("IsLastWritingDateTimeCorrectFormated", "Testcase.aml: LastWritingDateTime '20161-04-11T23:57:35' is not of type DateTime");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_010_WrongElementOrder() throws Exception 
	{
		String modelPath = TestModelPath + "010_WrongElementOrder\\";		
		expected.addExpectedConstraint("OrderOfWriterHeaderCorrect", "Testcase.aml: Order of <WriterHeader> elements not correct");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	
*/	

}
