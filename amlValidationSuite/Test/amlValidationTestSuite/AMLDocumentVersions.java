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
		String modelPath = TestModelPath + "001_NoAttributeAutomationMLVersion\\";	
		addExpectedTestResult("Testcase.aml", "HasAttributeAutomationMLVersion", "", "", "No Attribute <AdditionalInformation>.AutomationMLVersion defined");
				
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	@Test
	public void Test_002_WrongAutomationMLVersion() throws Exception 
	{
		String modelPath = TestModelPath + "002_WrongAutomationMLVersion\\";		
		addExpectedTestResult("Testcase.aml", "HasCorrectAutomationMLVersion", "3.0", "2.0", "");
					
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void Test_003_InconsistentAMLVersionReferencedCAEXDoc() throws Exception 
	{
		String modelPath = TestModelPath + "003_InconsistentAMLVersionReferencedCAEXDoc\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "HasCorrectAutomationMLVersion", "3.0", "2.0", "");
		addExpectedTestResult("ReferencedLib.aml", "HasAutomationMLVersionOfRootModel", "3.0", "2.0", "<AdditionalInformation>.AutomationMLVersion not consistent with RootModel-AutomationMLVersion");
				
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}	
	
	@Test
	public void Test_004_WrongCAEXSchemaVersion() throws Exception 
	{
		String modelPath = TestModelPath + "004_WrongCAEXSchemaVersion\\";	
		
		addExpectedTestResult("Testcase.aml", "CAEX Schema Validation", "", "", "");
		
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
	
		
	@Test
	public void Test_005_WrongCAEXSchemaVersionInReferencedCAEXDoc() throws Exception 
	{
		String modelPath = TestModelPath + "005_WrongCAEXSchemaVersionInReferencedCAEXDoc\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "CAEX Schema Validation", "", "", "");		
				
		Assert.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	
	
	@Test
	public void Test_006_NoLibraryVersions() throws Exception 
	{
		String modelPath = TestModelPath + "006_NoLibraryVersions\\";
		
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<InterfaceClassLib>.Version is not defined");
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<SystemUnitClassLib>.Version is not defined");
		addExpectedTestResult("Testcase.aml", "HasLibraryVersion", "", "", "<RoleClassLib>.Version is not defined");
				
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
