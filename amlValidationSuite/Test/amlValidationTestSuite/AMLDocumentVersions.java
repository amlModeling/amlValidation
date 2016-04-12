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

import amlValidationSuite.AMLValidationSuite;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraint;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;

public class AMLDocumentVersions {
	@Rule public TestName name = new TestName();
	
	
	private String TestModelPath = ".\\TestModels\\AMLDocumentVersions\\";
	
	private AMLValidationSuite validationSuite = null;
	private AMLExpectedUnsatisfiedConstraints expected = null;
	private AMLExpectedUnsatisfiedConstraints actual = null;
	private String testName = null; 
	

	

	@Before
	public void setUp() throws Exception {
		validationSuite = new AMLValidationSuite("configUnitTest.properties");
		
		expected = new AMLExpectedUnsatisfiedConstraints();		
	}

	@After
	public void tearDown() throws Exception {
		if(!(actual.containsAll(expected)&& expected.containsAll(actual)))
		{
			System.out.println("Testcase: " + testName);
			System.out.println("ACTUAL: " + actual.toString()); 
			System.out.println("EXPECTED: " + expected.toString());
	
		}
	}
	
	
	@Test
	public void Test_001_NoAttributeAutomationMLVersion() throws Exception 
	{
		String modelPath = TestModelPath + "001_NoAttributeAutomationMLVersion\\";		
		testName = name.getMethodName();
		
		expected.addExpectedConstraint("HasAttributeAutomationMLVersion", "Testcase.aml: No Attribute <AdditionalInformation>.AutomationMLVersion defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_002_WrongAutomationMLVersion() throws Exception 
	{
		String modelPath = TestModelPath + "002_WrongAutomationMLVersion\\";		
		testName = name.getMethodName();
		
		expected.addExpectedConstraint("HasCorrectAutomationMLVersion", "Testcase.aml: <AdditionalInformation>.AutomationMLVersion '3.0' found - Expected: '2.0'");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_003_InconsistentAMLVersionReferencedCAEXDoc() throws Exception 
	{
		String modelPath = TestModelPath + "003_InconsistentAMLVersionReferencedCAEXDoc\\";		
		testName = name.getMethodName();
		
		expected.addExpectedConstraint("HasCorrectAutomationMLVersion", "ReferencedLib.aml: <AdditionalInformation>.AutomationMLVersion '3.0' found - Expected: '2.0'");
		expected.addExpectedConstraint("HasAutomationMLVersionOfRootModel", "ReferencedLib.aml: <AdditionalInformation>.AutomationMLVersion '3.0' not consistent with RootModel-AutomationMLVersion - Expected: '2.0'");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_004_WrongCAEXSchemaVersion() throws Exception 
	{
		String modelPath = TestModelPath + "004_WrongCAEXSchemaVersion\\";		
		testName = name.getMethodName();
		
		expected.addExpectedConstraint("HasCorrectCAEXSchemaVersion", "Testcase.aml: <CAEXFile>.SchemaVersion '2.16' found - Expected: '2.15'");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_005_InconsistentCAEXSchemaVersionReferencedCAEXDoc() throws Exception 
	{
		String modelPath = TestModelPath + "005_InconsistentCAEXSchemaVersionReferencedCAEXDoc\\";
		testName = name.getMethodName();
		
		expected.addExpectedConstraint("HasCorrectCAEXSchemaVersion", "ReferencedLib.aml: <CAEXFile>.SchemaVersion '2.16' found - Expected: '2.15'");
		expected.addExpectedConstraint("HasCAEXSchemaVersionOfRootModel", "ReferencedLib.aml: <CAEXFile>.SchemaVersion '2.16' not consistent with RootModel-SchemaVersion - Expected: '2.15'");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_006_NoLibraryVersions() throws Exception 
	{
		String modelPath = TestModelPath + "006_NoLibraryVersions\\";
		testName = name.getMethodName();
		
		expected.addExpectedConstraint("HasLibraryVersion", "Testcase.aml: <InterfaceClassLib>.Version is not defined");
		expected.addExpectedConstraint("HasLibraryVersion", "Testcase.aml: <SystemUnitClassLib>.Version is not defined");
		expected.addExpectedConstraint("HasLibraryVersion", "Testcase.aml: <RoleClassLib>.Version is not defined");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
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

	
	
	
	
}
