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
import org.junit.Test;

import amlValidationSuite.AMLValidationSuite;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraint;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;

public class AllTestsTest {
	
	AMLValidationSuite validationSuite = null;
	AMLExpectedUnsatisfiedConstraints expected = null;
	AMLExpectedUnsatisfiedConstraints actual = null;
	

	@Before
	public void setUp() throws Exception {
		validationSuite = new AMLValidationSuite("configUnitTest.properties");
		
		expected = new AMLExpectedUnsatisfiedConstraints();
				
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Test_001AMLDocumentVersions_001HasAdditionalInformation_002_NoAdditionalInformationAtAll() throws Exception 
	{
		String modelPath = ".\\TestModels\\001AMLDocumentVersions\\001HasAdditionalInformation\\002_NoAdditionalInformationAtAll\\";
		
		expected.addExpectedConstraint("HasAdditionalInformation", "Testcase.aml: No element <AdditionalInformation> available");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_001AMLDocumentVersions_001HasAdditionalInformation_003_AdditionalInformationAvailable_NoAutomationMLVersion() throws Exception 
	{
		String modelPath = ".\\TestModels\\001AMLDocumentVersions\\001HasAdditionalInformation\\003_AdditionalInformationAvailable_NoAutomationMLVersion\\";
		
		expected.addExpectedConstraint("HasAutomationMLVersionAttribute", "Testcase.aml: No Attribute <AdditionalInformation>.AutomationMLVersion available");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_001AMLDocumentVersions_001HasAdditionalInformation_004_AdditionalInformationAvailable_WrongAutomationMLVersion() throws Exception 
	{
		String modelPath = ".\\TestModels\\001AMLDocumentVersions\\001HasAdditionalInformation\\004_AdditionalInformationAvailable_WrongAutomationMLVersion\\";
		
		expected.addExpectedConstraint("HasCorrectAutomationMLVersion", "Testcase.aml: <AdditionalInformation>.AutomationMLVersion wrong");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	
	
	/*
	@Test
	public void Test_001AMLDocumentVersions_001HasAdditionalInformation_002InValid() throws Exception 
	{
		String modelPath = ".\\TestModels\\001AMLDocumentVersions\\001HasAdditionalInformation\\002_InValid\\";
		
		expected.addExpectedConstraint("HasAdditionalInformation", "Testcase.aml: <AdditionalInformation> missing");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	*/

	
	
	/*
	private void compareExpectedToActualUnsatisfied(Collection<ExpectedUnsatisfiedConstraint> expected, Collection<EvlUnsatisfiedConstraint> actual)
	{
		Assert.assertEquals(expected.size(), actual.size());		
		Iterator<ExpectedUnsatisfiedConstraint> it = expected.iterator();
		ExpectedUnsatisfiedConstraint exp = null;
		
	
		
		while(it.hasNext())
		{
			exp = it.next();
			
			actual.
			
			
			
		}
		
	}
	
	*/
	
	
}
