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

import ValidationModel.ValidationError;
import ValidationModel.ValidationExecution;
import amlValidationSuite.AMLValidationSuite;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraint;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;

public class AMLCommon {
	private String TestModelPath = ".\\TestModels\\AMLCommon\\";
	
	private AMLValidationSuite validationSuite = null;
	private ArrayList<ValidationError> expected = null;
	private ValidationExecution actual = null;	

	@Before
	public void setUp() throws Exception {
		validationSuite = new AMLValidationSuite("configUnitTest.properties");		
		expected = new ArrayList<ValidationError>();		
	}

	@After
	public void tearDown() throws Exception {
		if(!actual.getValidationErrors().containsAll(expected) && expected.containsAll(actual.getValidationErrors()))
		{
			System.out.println("ACTUAL: " + actual.getValidationErrors().toString()); 
			System.out.println("EXPECTED: " + expected.toString());
	
		}
	}	
	

//	@Test
//	public void Test_AMLCommon_001_NoElementAdditionalInformation() throws Exception 
//	{
//		/*  The CAEX root element “CAEXFile” of each AML top level document shall have the CAEX
//			child element “AdditionalInformation”.
//		 */
//		
//		String modelPath = TestModelPath + "001_NoElementAdditionalInformation\\";
//		
//		expected.addExpectedConstraint("HasElementAdditionalInformation", "Testcase.aml: No element <AdditionalInformation> defined");
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
	
	
	
	
}
