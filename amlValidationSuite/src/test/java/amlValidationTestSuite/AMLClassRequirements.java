package amlValidationTestSuite;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class AMLClassRequirements extends AMLTest{

	private String TestModelPath = "AMLClassRequirements\\";
	
	@Test
	public void IE_ExistingAMLBaseClass_MultipeFiles() throws Exception 
	{
		String modelPath = TestModelPath + "IE_ExistingAMLBaseClass_MultipeFiles\\";		
	
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}	
	
	@Test
	public void IE_WithoutAMLBaseClass_MultipeFiles() throws Exception 
	{
		String modelPath = TestModelPath + "IE_WithoutAMLBaseClass_MultipeFiles\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsDerivedFromAMLBaseClass", "", "", "Class not derived from AMLInterfaceclass: ReferencedICLChild");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
		
	
	@Test
	public void IE_WithoutAMLBaseClass_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "IE_WithoutAMLBaseClass_SameFile\\";		
		
		addExpectedTestResult("Testcase.aml", "IsDerivedFromAMLBaseClass", "", "", "Class not derived from AMLInterfaceclass: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_WithAMLRoleClassInBaseClass() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_WithAMLRoleClassInBaseClass\\";		
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	

	
		
	
	@Test
	public void SUC_WithoutAMLRoleClass() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_WithoutAMLRoleClass\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRelatedToAMLBaseRoleClass", "", "", "SystemUnitClass without assigned AML Roleclass: SystemUnitClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
}



