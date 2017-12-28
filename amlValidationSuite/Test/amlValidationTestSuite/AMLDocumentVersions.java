package amlValidationTestSuite;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import ValidationModel.ValidationExecution;
import amlValidationSuite.AMLValidationSuite;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraint;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;

public class AMLDocumentVersions extends AMLTest{	
	
	private String TestModelPath = ".\\TestModels\\AMLDocumentVersions\\";
	
	
	@Test
	public void Test_001_NoAttributeAutomationMLVersion() throws Exception 
	{
		/* The element “AdditionalInformation” shall have an attribute “AutomationMLVersion”. */
		String modelPath = TestModelPath + "001_NoAttributeAutomationMLVersion\\";	
		addExpectedTestResult("Testcase.aml", "HasAttributeAutomationMLVersion", "", "", "No Attribute <AdditionalInformation>.AutomationMLVersion defined");
				
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
		
	@Test
	public void Test_002_WrongAutomationMLVersion() throws Exception 
	{
		/* The value of this attribute “AutomationMLVersion” shall be stored in the XML document. It
		   shall be “2.0” to correspond to this standard. 
		*/ 
		
		String modelPath = TestModelPath + "002_WrongAutomationMLVersion\\";		
		addExpectedTestResult("Testcase.aml", "HasCorrectAutomationMLVersion", "3.0", "2.0", "");
					
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void Test_003_InconsistentAMLVersionReferencedCAEXDoc() throws Exception 
	{
		/* Every referenced CAEX document shall follow the same AML version of the root document.
		   Mixing of documents with different AML versions is explicitly forbidden.
		*/
		
		String modelPath = TestModelPath + "003_InconsistentAMLVersionReferencedCAEXDoc\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "HasCorrectAutomationMLVersion", "3.0", "2.0", "");
		addExpectedTestResult("ReferencedLib.aml", "HasAutomationMLVersionOfRootModel", "3.0", "2.0", "<AdditionalInformation>.AutomationMLVersion not consistent with RootModel-AutomationMLVersion");
				
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}	
	
	@Test
	public void Test_004_WrongCAEXSchemaVersion() throws Exception 
	{
		/*Every referenced external document shall also follow the named schema versions specified
		in the above AML version specification. Mixing of external document versions outside
		of one AML version specification is explicitly forbidden. */
		
		String modelPath = TestModelPath + "004_WrongCAEXSchemaVersion\\";	
		
		addExpectedTestResult("Testcase.aml", "CAEX Schema Validation", "", "", "");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
		
	@Test
	public void Test_005_WrongCAEXSchemaVersionInReferencedCAEXDoc() throws Exception 
	{
		/*Every referenced external document shall also follow the named schema versions specified
		in the above AML version specification. Mixing of external document versions outside
		of one AML version specification is explicitly forbidden. */
		
		String modelPath = TestModelPath + "005_WrongCAEXSchemaVersionInReferencedCAEXDoc\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "CAEX Schema Validation", "", "", "");
						
		Assert.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	
	
	@Test
	public void Test_006_NoAttributLibraryVersions() throws Exception 
	{
		String modelPath = TestModelPath + "006_NoAttributLibraryVersions\\";
		
		addExpectedTestResult("Testcase.aml", "HasAttributLibraryVersion", "", "", "<InterfaceClassLib>InterfaceClassLib1.Version not found");
		addExpectedTestResult("Testcase.aml", "HasAttributLibraryVersion", "", "", "<SystemUnitClassLib>SystemUnitClassLib1.Version not found");
		addExpectedTestResult("Testcase.aml", "HasAttributLibraryVersion", "", "", "<RoleClassLib>RoleClassLib1.Version not found");
				
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void Test_007_NoLibraryVersions() throws Exception 
	{
		String modelPath = TestModelPath + "007_NoLibraryVersions\\";
		
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<InterfaceClassLib>InterfaceClassLib1.Version empty");
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<SystemUnitClassLib>SystemUnitClassLib1.Version empty");
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<RoleClassLib>RoleClassLib1.Version empty");
				
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	/*
	
	@Test
	public void Test_100_Valid() throws Exception 
	{
		String modelPath = TestModelPath + "100_Valid\\";		
		testName = name.getMethodName();
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	
//	
//	
//	@Test
//	public void Test_AMLDocumentVersions_Valid() throws Exception 
//	{
//		String modelPath = TestModelPath + "Valid\\";
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	
//
//	
//	

//	

//	
//	
//	
//	
//	@Test
//	public void Test_001AMLDocumentVersions_001HasAdditionalInformation_002InValid() throws Exception 
//	{
//		String modelPath = ".\\TestModels\\001AMLDocumentVersions\\001HasAdditionalInformation\\002_InValid\\";
//		
//		expected.addExpectedConstraint("HasAdditionalInformation", "Testcase.aml: <AdditionalInformation> missing");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	

	
	
	*/
	
}
