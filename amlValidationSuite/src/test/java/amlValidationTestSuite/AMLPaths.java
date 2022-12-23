package amlValidationTestSuite;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class AMLPaths extends AMLTest{

	private String TestModelPath = "AMLPaths\\";
	
	@Test
	public void IC_Existing_OneHierarchyAbove() throws Exception 
	{
		String modelPath = TestModelPath + "IC_Existing_OneHierarchyAbove\\";
						
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	@Test
	public void IC_NotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "IC_NotExisting_MultipleModels\\";
				
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClass ReferencedICNotExisting not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void IC_NotExisting_OneHierarchyAbove() throws Exception 
	{
		String modelPath = TestModelPath + "IC_NotExisting_OneHierarchyAbove\\";
				
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClass RobotNotExisting not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	

	@Test
	public void IC_NotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "IC_NotExisting_SameFile\\";
				
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClass NotExistingIC not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void IC_NotExistingExternalInterface_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "IC_NotExistingExternalInterface_SameFile\\";
				
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClass InterfaceClass1 not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void IC_NotExistingInDeepModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "IC_NotExistingInDeepModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClass ReferencedICDeep not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void IC_NotExistingInMiddleModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "IC_NotExistingInMiddleModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClass ReferencedIC not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void ICL_Existing_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "ICL_Existing_MultipleModels\\";
							
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ICL_NotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "ICL_NotExisting_MultipleModels\\";
						
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClassLib ReferencedICLNotExisting not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	@Test
	public void ICL_NotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "ICL_NotExisting_SameFile\\";
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClassLib InterfaceClassLibNotExisting not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	@Test
	public void ICL_NotExistingInDeepModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "ICL_NotExistingInDeepModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClassLib ReferencedICLDeep not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ICL_NotExistingInMiddleModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "ICL_NotExistingInMiddleModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: InterfaceClassLib ReferencedICL not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	

	@Test
	public void IE_InteralLinkCorrect() throws Exception 
	{
		String modelPath = TestModelPath + "IE_InteralLinkCorrect\\";		
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_InteralLinkIESideANotCorrect() throws Exception 
	{
		String modelPath = TestModelPath + "IE_InteralLinkIESideANotCorrect\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePartnerSidePathsValid", "", "", "InternalLinkPaths not valid: Element not found");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_InteralLinkIESideBNotCorrect() throws Exception 
	{
		String modelPath = TestModelPath + "IE_InteralLinkIESideBNotCorrect\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePartnerSidePathsValid", "", "", "InternalLinkPaths not valid: Element not found");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_InteralLinkInterfaceSideANotCorrect() throws Exception 
	{
		String modelPath = TestModelPath + "IE_InteralLinkInterfaceSideANotCorrect\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePartnerSidePathsValid", "", "", "InternalLinkPaths not valid: Interface not found");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_InteralLinkInterfaceSideBNotCorrect() throws Exception 
	{
		String modelPath = TestModelPath + "IE_InteralLinkInterfaceSideBNotCorrect\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePartnerSidePathsValid", "", "", "InternalLinkPaths not valid: Interface not found");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void IE_MirrorExisting_DifferentFile() throws Exception 
	{
		String modelPath = TestModelPath + "IE_MirrorExisting_DifferentFile\\";
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void IE_MirrorNotExisting_DifferentFile() throws Exception 
	{
		String modelPath = TestModelPath + "IE_MirrorNotExisting_DifferentFile\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: Internal Element with ID = REFERENCEDGUID not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void IE_MirrorNotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "IE_MirrorNotExisting_SameFile\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: Internal Element with ID = 96abc29a-9834-475b-904e-4142f4f35d74 not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void RC_Existing_OneHierarchyAbove() throws Exception 
	{
		String modelPath = TestModelPath + "RC_Existing_OneHierarchyAbove\\";	
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void RC_NotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "RC_NotExisting_MultipleModels\\";
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClass ReferencedRCNotExisting not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	

	@Test
	public void RC_NotExisting_OneHierarchyAbove() throws Exception 
	{
		String modelPath = TestModelPath + "RC_NotExisting_OneHierarchyAbove\\";		
						
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClass RobotNotExisting not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void RC_NotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "RC_NotExisting_SameFile\\";		
				
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClass RoleClassNotExisting not found");				
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void RC_NotExistingInDeepModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "RC_NotExistingInDeepModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClass ReferencedRCDeep not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void RC_NotExistingInMiddleModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "RC_NotExistingInMiddleModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClass ReferencedRC not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void RCL_Existing_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "RCL_Existing_MultipleModels\\";		
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void RCL_NotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "RCL_NotExisting_MultipleModels\\";
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClassLib ReferencedRCLNotExisting not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	

	@Test
	public void RCL_NotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "RCL_NotExisting_SameFile\\";		
				
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClassLib RoleClassLibNotExisting not found");				
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void RCL_NotExisting_SameFile_RRQ() throws Exception 
	{
		String modelPath = TestModelPath + "RCL_NotExisting_SameFile_RRQ\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseRoleClassPathValid", "", "", "RefBaseRoleClassPath not valid: RoleClassLib RoleClassLib1 not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void RCL_NotExisting_SameFile_SRC() throws Exception 
	{
		String modelPath = TestModelPath + "RCL_NotExisting_SameFile_SRC\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefRoleClassPathValid", "", "", "RefRoleClassPath not valid: RoleClassLib RoleClassLibMissing not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void RCL_NotExistingInDeepModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "RCL_NotExistingInDeepModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClassLib ReferencedRCLDeep not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void RCL_NotExistingInMiddleModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "RCL_NotExistingInMiddleModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: RoleClassLib ReferencedRCL not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void SUC_Existing_OneHierarchyAbove() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_Existing_OneHierarchyAbove\\";		
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	

	@Test
	public void SUC_InheritanceNotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_InheritanceNotExisting_MultipleModels\\";		
				
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClass ReferencedSUCNotExisting not found");				
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	

	@Test
	public void SUC_InheritanceNotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_InheritanceNotExisting_SameFile\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClass SystemUnitClass100 not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void SUC_InheritanceNotExistingInDeepModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_InheritanceNotExistingInDeepModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClass ReferencedSUCDeep not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void SUC_InheritanceNotExistingInMiddleModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_InheritanceNotExistingInMiddleModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClass ReferencedSUC not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void SUC_NotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_NotExisting_MultipleModels\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: SystemUnitClass ReferencedSUC not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
		
	}
	
	@Test
	public void SUC_NotExisting_OneHierarchyAbove() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_NotExisting_OneHierarchyAbove\\";		
						
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClass NotExistingRobot not found");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void SUC_NotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_NotExisting_SameFile\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: SystemUnitClass SystemUnitClass1 not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	

	@Test
	public void SUC_NotExistingInDeepModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_NotExistingInDeepModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: SystemUnitClass ReferencedSUCDeep not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_NotExistingInMiddleModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_NotExistingInMiddleModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: SystemUnitClass ReferencedSUC not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));				
	}
	
	@Test
	public void SUCL_Existing_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_Existing_MultipleModels\\";		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void SUCL_InheritanceNotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_InheritanceNotExisting_MultipleModels\\";		
				
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClassLib ReferencedSUCLNotExisting not found");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	@Test
	public void SUCL_InheritanceNotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_InheritanceNotExisting_SameFile\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClassLib SystemUnitClassLib3 not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));				
	}	
	
	@Test
	public void SUCL_InheritanceNotExistingInDeepModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_InheritanceNotExistingInDeepModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClassLib ReferencedSUCLDeep not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void SUCL_InheritanceNotExistingInMiddleModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_InheritanceNotExistingInMiddleModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseClassPathValid", "", "", "RefBaseClassPath not valid: SystemUnitClassLib ReferencedSUCL not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void SUCL_NotExisting_MultipleModels() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_NotExisting_MultipleModels\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: SystemUnitClassLib ReferencedSUCL not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void SUCL_NotExisting_SameFile() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_NotExisting_SameFile\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: SystemUnitClassLib SystemUnitClassLib1 not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUCL_NotExistingInDeepModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_NotExistingInDeepModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("ReferencedLib.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: SystemUnitClassLib ReferencedSUCLDeep not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void SUCL_NotExistingInMiddleModel_ThreeModelHierarchy() throws Exception 
	{
		String modelPath = TestModelPath + "SUCL_NotExistingInMiddleModel_ThreeModelHierarchy\\";		
		
		addExpectedTestResult("Testcase.aml", "IsRefBaseSystemUnitPathValid", "", "", "RefBaseSystemUnitPath not valid: SystemUnitClassLib ReferencedSUCL not found");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
		
	}
	
}
