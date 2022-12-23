package amlValidationTestSuite;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class AMLMetaInformation extends AMLTest{

	private String TestModelPath = "AMLMetaInformation\\";
	
	@Test
	public void NoElementAdditionalInformation() throws Exception 
	{
		/*  The CAEX root element “CAEXFile” of each AML top level document shall have the CAEX
			child element “AdditionalInformation”.
		 */
		
		String modelPath = TestModelPath + "NoElementAdditionalInformation/";
		
		addExpectedTestResult("Testcase.aml", "HasElementAdditionalInformation", "", "", "No element <AdditionalInformation> defined");	
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void NoElementWriterHeader() throws Exception 
	{
		String modelPath = TestModelPath + "NoElementWriterHeader\\";		
				
		addExpectedTestResult("Testcase.aml", "HasElementWriterHeader", "", "", "No Element <WriterHeader> defined");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));				
	}
	
	@Test
	public void NoWriterName() throws Exception 
	{
		String modelPath = TestModelPath + "NoWriterName\\";
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "WriterName not defined");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));				
	}
	
	
	
	@Test
	public void NoWriterID() throws Exception 
	{
		String modelPath = TestModelPath + "NoWriterID\\";		
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "WriterID not defined");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	@Test
	public void NoWriterVendor() throws Exception 
	{
		String modelPath = TestModelPath + "NoWriterVendor\\";	
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "WriterVendor not defined");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	@Test
	public void NoWriterVendorURL() throws Exception 
	{
		String modelPath = TestModelPath + "NoWriterVendorURL\\";	
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "WriterVendorURL not defined");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	@Test
	public void NoWriterVersion() throws Exception 
	{
		String modelPath = TestModelPath + "NoWriterVersion\\";		
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "WriterVersion not defined");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
		
	
	@Test
	public void NoWriterRelease() throws Exception 
	{
		String modelPath = TestModelPath + "NoWriterRelease\\";	
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "WriterRelease not defined");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	
	
	@Test
	public void LastWritingDateTimeWrongFormated() throws Exception 
	{
		String modelPath = TestModelPath + "LastWritingDateTimeWrongFormated\\";		
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "LastWritingDateTime '20161-04-11T23:57:35' is not of type DateTime");		
			
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void WrongElementOrder() throws Exception 
	{
		String modelPath = TestModelPath + "WrongElementOrder\\";		
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "Order of <WriterHeader> elements not correct");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
				
	}
	
	@Test
	public void DuplicateMetaInformation() throws Exception 
	{
		String modelPath = TestModelPath + "DuplicateMetaInformation\\";		
		
		addExpectedTestResult("Testcase.aml", "ValidateWriterHeader", "", "", "Order of <WriterHeader> elements not correct");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
				
	}
	
	
	@Test
	public void MultipleWriterHeader() throws Exception 
	{
		String modelPath = TestModelPath + "MultipleWriterHeader\\";		
		
		//addExpectedTestResult("Testcase.aml", "OrderOfWriterHeaderCorrect", "", "", "Order of <WriterHeader> elements not correct");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
		
				
	}
	
	
	
	

}
