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

public class AMLCommon extends AMLTest{
	private String TestModelPath = ".\\TestModels\\AMLCommon\\";	

	@Test
	public void Test_AMLCommon_001_NoElementAdditionalInformation() throws Exception 
	{
		/*  The CAEX root element “CAEXFile” of each AML top level document shall have the CAEX
			child element “AdditionalInformation”.
		 */
		
		String modelPath = TestModelPath + "001_NoElementAdditionalInformation\\";
		
		addExpectedTestResult("Testcase.aml", "HasElementAdditionalInformation", "", "", "No element <AdditionalInformation> defined");	
		
		Assert.assertTrue(executeAndValidateTest(modelPath));		
	}
}
