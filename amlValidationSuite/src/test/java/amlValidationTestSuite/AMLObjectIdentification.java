package amlValidationTestSuite;




import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class AMLObjectIdentification extends AMLTest{

	private String TestModelPath = "AMLObjectIdentification\\";
	
	@Test
	public void DuplicateInterfaceClassLibNames() throws Exception 
	{
		String modelPath = TestModelPath + "LibraryNames\\DuplicateInterfaceClassLibNames\\";		
		
		addExpectedTestResult("Testcase.aml", "IsInterfaceClassLibUnique", "", "", "InterfaceClassLibNames not unique: Duplicates: InterfaceClassLib1");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void DuplicateRoleClassLibNames() throws Exception 
	{
		String modelPath = TestModelPath + "LibraryNames\\DuplicateRoleClassLibNames\\";
		
		addExpectedTestResult("Testcase.aml", "IsRoleClassLibUnique", "", "", "RoleClassLibNames not unique: Duplicates: RoleClassLib1");				
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void DuplicateSystemUnitClassLibNames() throws Exception 
	{
		String modelPath = TestModelPath + "LibraryNames\\DuplicateSystemUnitClassLibNames\\";		
		
		addExpectedTestResult("Testcase.aml", "IsSystemUnitClassLibUnique", "", "", "SystemUnitClassLibNames not unique: Duplicates: SystemUnitClassLib1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}	
	
/*****************************************************************************************************/	
	
	@Test
	public void InterfaceClassesNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "ClassNames\\InterfaceClassesNotUnique\\";		
		
		addExpectedTestResult("Testcase.aml", "IsInterfaceClassNameUnique", "", "", "InterfaceClassLib=MyInterfaces: Duplicate Class Names: Interface1");
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}	
	
	@Test
	public void RoleClassesNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "ClassNames\\RoleClassesNotUnique\\";		
				
		addExpectedTestResult("Testcase.aml", "IsRoleClassNameUnique", "", "", "RoleClassLib=ManufacturingRoleClasses: Duplicate Class Names: Roleclass1");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void SystemClassesNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "ClassNames\\SystemClassesNotUnique\\";		
				
		addExpectedTestResult("Testcase.aml", "IsSystemUnitClassNameUnique", "", "", "SystemUnitClassLib=LibOfCommonTools: Duplicate Class Names: SystemUnitClass1");		
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	/*****************************************************************************************************/
	
	
	
	@Test
	public void ExternalInterface_EmptyID() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterface_EmptyID\\";		
		
		addExpectedTestResult("Testcase.aml", "HasID", "", "", "ExternalInterface ExternalInterface1 without ID defined");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void ExternalInterface_NoID() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterface_NoID\\";		
		
		addExpectedTestResult("Testcase.aml", "HasID", "", "", "ExternalInterface ExternalInterface1 without ID defined");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
		
	}

		
	@Test
	public void InternalElements_DuplicateIDSameIH_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\InternalElements_DuplicateIDSameIH_NotNested\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement11 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement21 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void InternalElements_DuplicateIDSameIH_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\InternalElements_DuplicateIDSameIH_Nested\\";	
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement1 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement3 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
				
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void InternalElements_DuplicateIDDifferentIH_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\InternalElements_DuplicateIDDifferentIH_NotNested\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement1 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement2 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	@Test
	public void InternalElements_DuplicateIDDifferentIH_Nested1() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\InternalElements_DuplicateIDDifferentIH_Nested1\\";		

		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement2 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement3 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");

		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void InternalElements_DuplicateIDDifferentIH_Nested2() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\InternalElements_DuplicateIDDifferentIH_Nested2\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement1 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement2 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void InternalElements_MultipleModelsDuplicateID() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\InternalElements_MultipleModelsDuplicateID\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement11 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement12 has a non unique ID: 8e362e89-2c88-4bb6-827a-a26f48e29ada");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement13 has a non unique ID: 7a16a017-350d-478f-8f75-6d471c25a278");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement21 has a non unique ID: e56339ec-1ddf-41b0-8d70-139c606ce916");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement22 has a non unique ID: f5973236-6c1f-43d1-ac7f-cf8b34f33021");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement31 has a non unique ID: 3e402fb2-ca24-4016-8771-ae5f17a482a4");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement51 has a non unique ID: 1a51459a-539e-4197-b506-e304ee51e5c4");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement52 has a non unique ID: c9be9315-5a25-4cf3-aea6-859db743636d");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement53 has a non unique ID: 72ae2ad5-312e-42a1-b90f-b208f1e9aadd");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement61 has a non unique ID: 98fe215b-ecb0-48b8-938b-084686663a9a");
		
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement511 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement512 has a non unique ID: 8e362e89-2c88-4bb6-827a-a26f48e29ada");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement513 has a non unique ID: 7a16a017-350d-478f-8f75-6d471c25a278");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement521 has a non unique ID: e56339ec-1ddf-41b0-8d70-139c606ce916");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement522 has a non unique ID: f5973236-6c1f-43d1-ac7f-cf8b34f33021");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement531 has a non unique ID: 3e402fb2-ca24-4016-8771-ae5f17a482a4");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement551 has a non unique ID: 1a51459a-539e-4197-b506-e304ee51e5c4");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement552 has a non unique ID: c9be9315-5a25-4cf3-aea6-859db743636d");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement553 has a non unique ID: 72ae2ad5-312e-42a1-b90f-b208f1e9aadd");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "InternalElement InternalElement561 has a non unique ID: 98fe215b-ecb0-48b8-938b-084686663a9a");
		
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}

	
	
	@Test
	public void InternalElement_NoID() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\InternalElement_NoID\\";		
		
		addExpectedTestResult("Testcase.aml", "HasID", "", "", "InternalElement InternalElement11 without ID defined");
		

		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void ExternalInterfaceInInternalElement_DuplicateIDSameIE_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInInternalElement_DuplicateIDSameIE_NotNested\\";
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: b99d7d6a-b6a3-4278-8ba9-635ff37a0d13");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: b99d7d6a-b6a3-4278-8ba9-635ff37a0d13");
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));
				
	}
	
	@Test
	public void ExternalInterfaceInInternalElement_DuplicateIDDifferentIE_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInInternalElement_DuplicateIDDifferentIE_NotNested\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: b99d7d6a-b6a3-4278-8ba9-635ff37a0d13");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: b99d7d6a-b6a3-4278-8ba9-635ff37a0d13");
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ExternalInterfaceInInternalElement_DuplicateIDSameIE_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInInternalElement_DuplicateIDSameIE_Nested\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: b99d7d6a-b6a3-4278-8ba9-635ff37a0d13");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: b99d7d6a-b6a3-4278-8ba9-635ff37a0d13");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ExternalInterfaceInInternalElement_DuplicateIDDifferentIH() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInInternalElement_DuplicateIDDifferentIH\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: b99d7d6a-b6a3-4278-8ba9-635ff37a0d13");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: b99d7d6a-b6a3-4278-8ba9-635ff37a0d13");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void ExternalInterfaceInInternalElement_DuplicateIDIntElemExtInt() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInInternalElement_DuplicateIDIntElemExtInt\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement11 has a non unique ID: 9022e364-dc65-467c-9711-003ac4887064");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 9022e364-dc65-467c-9711-003ac4887064");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void ExternalInterfaceInInternalElements_MultipleModelsDuplicateIDs() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInInternalElements_MultipleModelsDuplicateIDs\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement13 has a non unique ID: 5096a7e5-b712-4e36-82fc-8890555e1d9d");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement61 has a non unique ID: c05fdc3f-eb92-45c2-98f6-1486669703e0");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "ExternalInterface DupicateID2 has a non unique ID: 5096a7e5-b712-4e36-82fc-8890555e1d9d");
		addExpectedTestResult("ReferencedLib.aml", "IsIDGUID", "", "", "ExternalInterface DupicateID1 has a non unique ID: c05fdc3f-eb92-45c2-98f6-1486669703e0");	

		Assertions.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	@Test
	public void ExternalInterfaceInRoleClass_DuplicateIDSameRC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInRoleClass_DuplicateIDSameRC_NotNested\\";	
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");

		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void ExternalInterfaceInRoleClass_DuplicateIDDifferentRC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInRoleClass_DuplicateIDDifferentRC_NotNested\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ExternalInterfaceInRoleClass_DuplicateIDSameRC_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInRoleClass_DuplicateIDSameRC_Nested\\";
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");

		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ExternalInterfaceInRoleClass_DuplicateIDDifferentRoleClassLib() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInRoleClass_DuplicateIDDifferentRoleClassLib\\";		

		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");

		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ExternalInterfaceInRoleClass_DuplicateIDExternalInterfaceIntElementRoleClass() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInRoleClass_DuplicateIDExternalInterfaceIntElementRoleClass\\";		

		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");

		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ExternalInterfaceInRoleClass_DuplicateIDInternalElementIntElementRoleClasss() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInRoleClass_DuplicateIDInternalElementIntElementRoleClass\\";		

		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement1 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 070068e2-47b3-4f2c-a4f1-52aca710ada2");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ExternalInterfaceInSystemUnitClass_DuplicateIDSameSUC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInSystemUnitClass_DuplicateIDSameSUC_NotNested\\";
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 1ec43e7d-2fb2-4482-9266-c7ba87debc2f");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 1ec43e7d-2fb2-4482-9266-c7ba87debc2f");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));	
	}
	
	@Test
	public void ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_NotNested\\";		

		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 1ec43e7d-2fb2-4482-9266-c7ba87debc2f");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 1ec43e7d-2fb2-4482-9266-c7ba87debc2f");

		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void ExternalInterfaceInSystemUnitClass_DuplicateIDSameSUC_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInSystemUnitClass_DuplicateIDSameSUC_Nested\\";		

		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 1ec43e7d-2fb2-4482-9266-c7ba87debc2f");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 1ec43e7d-2fb2-4482-9266-c7ba87debc2f");

		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_Nested\\";		

		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface1 has a non unique ID: 1ec43e7d-2fb2-4482-9266-c7ba87debc2f");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 1ec43e7d-2fb2-4482-9266-c7ba87debc2f");

		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	@Test
	public void ExternalInterfaceInRoleRequirements() throws Exception 
	{
		/* Funktioniert nicht, da External Interface im RoleRequirement als InterfaceClass modelliert ist!?!*/
		
		String modelPath = TestModelPath + "InstanceID\\ExternalInterfaceInRoleRequirements\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement1 has a non unique ID: 879ad56c-a983-47d1-b00c-c7d021922353");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "ExternalInterface Interface2 has a non unique ID: 879ad56c-a983-47d1-b00c-c7d021922353");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	@Test
	public void InternalElements_DuplicateIDInstanceHierarchy_SystemUnitClass() throws Exception 
	{
		String modelPath = TestModelPath + "InstanceID\\InternalElements_DuplicateIDInstanceHierarchy_SystemUnitClass\\";		
		
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement11 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");
		addExpectedTestResult("Testcase.aml", "IsIDGUID", "", "", "InternalElement InternalElement2 has a non unique ID: 9c99111a-937d-402e-8941-a390a0b5bb3e");

		Assertions.assertTrue(executeAndValidateTest(modelPath));
	}
	
	
	
	
	


}
