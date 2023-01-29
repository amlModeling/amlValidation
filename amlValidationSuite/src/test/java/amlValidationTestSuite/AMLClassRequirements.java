package amlValidationTestSuite;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class AMLClassRequirements extends AMLTest{

	private String TestModelPath = "AMLClassRequirements\\";
	
	@Test
	public void ValidIE_ExistingAMLBaseClass_MultipeFiles() throws Exception 
	{
		String modelPath = TestModelPath + "InterfaceClass\\ValidIE_ExistingAMLBaseClass_MultipeFiles\\";		
	
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}	
	
	@Test
	public void IE_WithoutAMLBaseClass_MultipeFiles() throws Exception 
	{
		String modelPath = TestModelPath + "InterfaceClass\\IE_WithoutAMLBaseClass_MultipeFiles\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsDerivedFromAMLBaseClass", "", "", "Class not derived from AMLInterfaceclass: ReferencedICLChild");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
		
	
	@Test
	public void IE_WithoutAMLBaseClass_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "InterfaceClass\\IE_WithoutAMLBaseClass_SameFile\\";		
		
		addExpectedTestResult("Testcase.aml", "IsDerivedFromAMLBaseClass", "", "", "Class not derived from AMLInterfaceclass: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	/*********************************************************************************/
	
	
	@Test
	public void ValidSUC_WithAMLRoleClassInBaseClass() throws Exception 
	{
		String modelPath = TestModelPath + "SystemUnitClass\\ValidSUC_WithAMLRoleClassInBaseClass\\";		
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}

		
	
	@Test
	public void SUC_WithoutAMLRoleClass() throws Exception 
	{
		String modelPath = TestModelPath + "SystemUnitClass\\SUC_WithoutAMLRoleClass\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRelatedToAMLBaseRoleClass", "", "", "SystemUnitClass without assigned AML Roleclass: SystemUnitClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	/*********************************************************************************/
	
	
	
	@Test
	public void ValidRCL_DerivedFromBaseClass() throws Exception 
	{
		String modelPath = TestModelPath + "RoleClass\\ValidRCL_DerivedFromBaseClass\\";		
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}

		
	@Test
	public void RCL_NotDerivedFromBaseClass() throws Exception 
	{
		String modelPath = TestModelPath + "RoleClass\\RCL_NotDerivedFromBaseClass\\";	
		
		addExpectedTestResult("Testcase.aml", "isDerivedFromAMLBaseRoleClass", "", "", "Class not derived from AMLRoleclass: RoleClass");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
}



