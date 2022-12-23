package amlValidationTestSuite;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AMLDocumentVersions extends AMLTest{	
	
	private String TestModelPath = "AMLDocumentVersions/";	
	

	@Test
	public void InconsistentAMLVersionReferencedCAEXDoc() throws Exception 
	{
		/* Every referenced CAEX document shall follow the same AML version of the root document.
		   Mixing of documents with different AML versions is explicitly forbidden.
		*/
		
		String modelPath = TestModelPath + "InconsistentAMLVersionReferencedCAEXDoc/";		
		
		addExpectedTestResult("ReferencedLib.aml", "HasCorrectAutomationMLVersion", "3.0", "2.0", "");
		addExpectedTestResult("ReferencedLib.aml", "HasAutomationMLVersionOfRootModel", "3.0", "2.0", "<AdditionalInformation>.AutomationMLVersion not consistent with RootModel-AutomationMLVersion");
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}	
		
	
	@Test
	public void NoAttributeAutomationMLVersion() throws Exception 
	{
		/* The element “AdditionalInformation” shall have an attribute “AutomationMLVersion”. */
		String modelPath = TestModelPath + "NoAttributeAutomationMLVersion/";	
		
		addExpectedTestResult("Testcase.aml", "HasAttributeAutomationMLVersion", "", "", "No or multiple Attributes <AdditionalInformation>.AutomationMLVersion defined");				
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void NoAttributLibraryVersions() throws Exception 
	{
		String modelPath = TestModelPath + "NoAttributLibraryVersions\\";
		
		addExpectedTestResult("Testcase.aml", "HasAttributLibraryVersion", "", "", "<InterfaceClassLib>InterfaceClassLib1.Version not found");
		addExpectedTestResult("Testcase.aml", "HasAttributLibraryVersion", "", "", "<SystemUnitClassLib>SystemUnitClassLib1.Version not found");
		addExpectedTestResult("Testcase.aml", "HasAttributLibraryVersion", "", "", "<RoleClassLib>RoleClassLib1.Version not found");
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void NoLibraryVersions() throws Exception 
	{
		String modelPath = TestModelPath + "NoLibraryVersions\\";
		
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<InterfaceClassLib>InterfaceClassLib1.Version empty");
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<SystemUnitClassLib>SystemUnitClassLib1.Version empty");
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<RoleClassLib>RoleClassLib1.Version empty");
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void Valid() throws Exception 
	{
		String modelPath = TestModelPath + "Valid\\";
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
		
	@Test
	public void WrongAutomationMLVersion() throws Exception 
	{
		/* The value of this attribute “AutomationMLVersion” shall be stored in the XML document. It
		   shall be “2.0” to correspond to this standard. 
		*/ 
		
		String modelPath = TestModelPath + "WrongAutomationMLVersion/";		
		addExpectedTestResult("Testcase.aml", "HasCorrectAutomationMLVersion", "3.0", "2.0", "");
					
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
