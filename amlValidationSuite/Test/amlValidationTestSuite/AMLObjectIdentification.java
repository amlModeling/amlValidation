package amlValidationTestSuite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import amlValidationSuite.AMLValidationSuite;
import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;

public class AMLObjectIdentification {

	private String TestModelPath = ".\\TestModels\\AMLObjectIdentification\\";
	
	private AMLValidationSuite validationSuite = null;
	private AMLExpectedUnsatisfiedConstraints expected = null;
	private AMLExpectedUnsatisfiedConstraints actual = null;	

	@Before
	public void setUp() throws Exception {
		validationSuite = new AMLValidationSuite("configUnitTest.properties");
		
		expected = new AMLExpectedUnsatisfiedConstraints();		
	}

	@After
	public void tearDown() throws Exception {
		if(!(actual.containsAll(expected)&& expected.containsAll(actual)))
		{
			System.out.println("ACTUAL: \n" + actual.toString()); 
			System.out.println("EXPECTED: \n" + expected.toString());
	
		}
	}
	
	
	@Test
	public void Test_001_NoRoleClassName() throws Exception 
	{
		String modelPath = TestModelPath + "001_NoRoleClassName\\";		
		expected.addExpectedConstraint("HasName", "Testcase.aml - RoleClassLib ManufacturingRoleClasses: RoleClass without attribute 'name' defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_002_NoInterfaceClassName() throws Exception 
	{
		String modelPath = TestModelPath + "002_NoInterfaceClassName\\";		
		expected.addExpectedConstraint("HasName", "Testcase.aml - InterfaceClassLib MyInterfaces: InterfaceClass without attribute 'name' defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_003_NoSystemUnitClassName() throws Exception 
	{
		String modelPath = TestModelPath + "003_NoSystemUnitClassName\\";		
		expected.addExpectedConstraint("HasName", "Testcase.aml - SystemUnitClassLib LibOfCommonTools: SystemUnitClass without attribute 'name' defined");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	@Test
	public void Test_004_InterfaceClassesNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "004_InterfaceClassesNotUnique\\";		
		expected.addExpectedConstraint("IsNameUnique", "File=Testcase.aml InterfaceClassLib=MyInterfaces: Duplicate Class Names: [Interface1]");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_005_RoleClassesNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "005_RoleClassesNotUnique\\";		
		expected.addExpectedConstraint("IsNameUnique", "File=Testcase.aml RoleClassLib=ManufacturingRoleClasses: Duplicate Class Names: [Roleclass1]");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_006_SystemClassesNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "006_SystemClassesNotUnique\\";		
		expected.addExpectedConstraint("IsNameUnique", "File=Testcase.aml SystemUnitClassLib=LibOfCommonTools: Duplicate Class Names: [SystemUnitClass1]");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_007_InternalElements_DuplicateIDSameIH_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "007_InternalElements_DuplicateIDSameIH_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement11'" 
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement21'\n");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_008_InternalElements_DuplicateIDSameIH_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "008_InternalElements_DuplicateIDSameIH_Nested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement3'\n");
				
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_009_InternalElements_DuplicateIDDifferentIH_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "009_InternalElements_DuplicateIDDifferentIH_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement2'\n");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_010_InternalElements_DuplicateIDDifferentIH_Nested1() throws Exception 
	{
		String modelPath = TestModelPath + "010_InternalElements_DuplicateIDDifferentIH_Nested1\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement2'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement3'\n");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_011_InternalElements_DuplicateIDDifferentIH_Nested2() throws Exception 
	{
		String modelPath = TestModelPath + "011_InternalElements_DuplicateIDDifferentIH_Nested2\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement2'\n");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_012_InternalElements_MultipleModelsDuplicateID() throws Exception 
	{
		String modelPath = TestModelPath + "012_InternalElements_MultipleModelsDuplicateID\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='8e362e89-2c88-4bb6-827a-a26f48e29ada' Name='InternalElement12'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 type=InternalElement ID='8e362e89-2c88-4bb6-827a-a26f48e29ada' Name='InternalElement512'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='f5973236-6c1f-43d1-ac7f-cf8b34f33021' Name='InternalElement22'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 type=InternalElement ID='f5973236-6c1f-43d1-ac7f-cf8b34f33021' Name='InternalElement522'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=InternalElement ID='c9be9315-5a25-4cf3-aea6-859db743636d' Name='InternalElement52'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 type=InternalElement ID='c9be9315-5a25-4cf3-aea6-859db743636d' Name='InternalElement552'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=InternalElement ID='72ae2ad5-312e-42a1-b90f-b208f1e9aadd' Name='InternalElement53'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 type=InternalElement ID='72ae2ad5-312e-42a1-b90f-b208f1e9aadd' Name='InternalElement553'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=InternalElement ID='1a51459a-539e-4197-b506-e304ee51e5c4' Name='InternalElement51'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 type=InternalElement ID='1a51459a-539e-4197-b506-e304ee51e5c4' Name='InternalElement551'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='3e402fb2-ca24-4016-8771-ae5f17a482a4' Name='InternalElement31'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 type=InternalElement ID='3e402fb2-ca24-4016-8771-ae5f17a482a4' Name='InternalElement531'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement11'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement511'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='7a16a017-350d-478f-8f75-6d471c25a278' Name='InternalElement13'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 type=InternalElement ID='7a16a017-350d-478f-8f75-6d471c25a278' Name='InternalElement513'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='e56339ec-1ddf-41b0-8d70-139c606ce916' Name='InternalElement21'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 type=InternalElement ID='e56339ec-1ddf-41b0-8d70-139c606ce916' Name='InternalElement521'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=InternalElement ID='98fe215b-ecb0-48b8-938b-084686663a9a' Name='InternalElement61'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 type=InternalElement ID='98fe215b-ecb0-48b8-938b-084686663a9a' Name='InternalElement561'\n");
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_013_InternalElement_NoID() throws Exception 
	{
		String modelPath = TestModelPath + "013_InternalElement_NoID\\";		
		expected.addExpectedConstraint("HasID", "File=Testcase.aml InstanceHierarchy=InstanceHierarchy1 InternalElement 'InternalElement11' without ID defined");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_014_ExternalInterfaceInInternalElement_DuplicateIDSameIE_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "014_ExternalInterfaceInInternalElement_DuplicateIDSameIE_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='b99d7d6a-b6a3-4278-8ba9-635ff37a0d13' Name='Interface1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='b99d7d6a-b6a3-4278-8ba9-635ff37a0d13' Name='Interface2'\n");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_015_ExternalInterfaceInInternalElement_DuplicateIDDifferentIE_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "015_ExternalInterfaceInInternalElement_DuplicateIDDifferentIE_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='b99d7d6a-b6a3-4278-8ba9-635ff37a0d13' Name='Interface1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='b99d7d6a-b6a3-4278-8ba9-635ff37a0d13' Name='Interface2'\n");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_016_ExternalInterfaceInInternalElement_DuplicateIDSameIE_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "016_ExternalInterfaceInInternalElement_DuplicateIDSameIE_Nested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='b99d7d6a-b6a3-4278-8ba9-635ff37a0d13' Name='Interface1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='b99d7d6a-b6a3-4278-8ba9-635ff37a0d13' Name='Interface2'\n");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_017_ExternalInterfaceInInternalElement_DuplicateIDDifferentIH() throws Exception 
	{
		String modelPath = TestModelPath + "017_ExternalInterfaceInInternalElement_DuplicateIDDifferentIH\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='b99d7d6a-b6a3-4278-8ba9-635ff37a0d13' Name='Interface1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=ExternalInterface ID='b99d7d6a-b6a3-4278-8ba9-635ff37a0d13' Name='Interface2'\n");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_018_ExternalInterfaceInInternalElement_DuplicateIDIntElemExtInt() throws Exception 
	{
		String modelPath = TestModelPath + "018_ExternalInterfaceInInternalElement_DuplicateIDIntElemExtInt\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9022e364-dc65-467c-9711-003ac4887064' Name='InternalElement11'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='9022e364-dc65-467c-9711-003ac4887064' Name='Interface1'\n");
				
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	@Test
	public void Test_019_ExternalInterfaceInInternalElements_MultipleModelsDuplicateIDs() throws Exception 
	{
		String modelPath = TestModelPath + "019_ExternalInterfaceInInternalElements_MultipleModelsDuplicateIDs\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='5096a7e5-b712-4e36-82fc-8890555e1d9d' Name='InternalElement13'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 type=ExternalInterface ID='5096a7e5-b712-4e36-82fc-8890555e1d9d' Name='DupicateID2'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 type=InternalElement ID='c05fdc3f-eb92-45c2-98f6-1486669703e0' Name='InternalElement61'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 type=ExternalInterface ID='c05fdc3f-eb92-45c2-98f6-1486669703e0' Name='DupicateID1'\n");

		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_020_ExternalInterfaceInRoleClass_DuplicateIDSameRC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "020_ExternalInterfaceInRoleClass_DuplicateIDSameRC_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface1'"
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface2'\n");

		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	@Test
	public void Test_021_ExternalInterfaceInRoleClass_DuplicateIDDifferentRC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "021_ExternalInterfaceInRoleClass_DuplicateIDDifferentRC_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface1'"
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface2'\n");

		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_022_ExternalInterfaceInRoleClass_DuplicateIDSameRC_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "022_ExternalInterfaceInRoleClass_DuplicateIDSameRC_Nested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface1'"
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface2'\n");

		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_023_ExternalInterfaceInRoleClass_DuplicateIDDifferentRoleClassLib() throws Exception 
	{
		String modelPath = TestModelPath + "023_ExternalInterfaceInRoleClass_DuplicateIDDifferentRoleClassLib\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface1'"
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib2 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface2'\n");

		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_024_ExternalInterfaceInRoleClass_DuplicateIDExternalInterfaceIntElementRoleClass() throws Exception 
	{
		String modelPath = TestModelPath + "024_ExternalInterfaceInRoleClass_DuplicateIDExternalInterfaceIntElementRoleClass\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+"\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface1'"
				+"\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface2'\n");

		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_025_ExternalInterfaceInRoleClass_DuplicateIDInternalElementIntElementRoleClasss() throws Exception 
	{
		String modelPath = TestModelPath + "025_ExternalInterfaceInRoleClass_DuplicateIDInternalElementIntElementRoleClass\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='InternalElement1'"
				+ "\nFile=Testcase.aml RoleClassLib=RoleClassLib1 type=ExternalInterface ID='070068e2-47b3-4f2c-a4f1-52aca710ada2' Name='Interface2'\n");


		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_026_ExternalInterfaceInSystemUnitClass_DuplicateIDSameSUC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "026_ExternalInterfaceInSystemUnitClass_DuplicateIDSameSUC_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface1'"
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface2'\n");


		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_027_ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "027_ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface1'"
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface2'\n");


		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	@Test
	public void Test_028_ExternalInterfaceInSystemUnitClass_DuplicateIDSameSUC_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "028_ExternalInterfaceInSystemUnitClass_DuplicateIDSameSUC_Nested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface2'"
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface1'\n");


		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	@Test
	public void Test_029_ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "029_ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface2'"
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib2 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface1'\n");


		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	@Test
	public void Test_030_ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "030_ExternalInterfaceInSystemUnitClass_DuplicateIDDifferentSUC_Nested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface2'"
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib2 type=ExternalInterface ID='1ec43e7d-2fb2-4482-9266-c7ba87debc2f' Name='Interface1'\n");


		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	@Test
	public void Test_031_ExternalInterfaceInRoleRequirements() throws Exception 
	{
		String modelPath = TestModelPath + "031_ExternalInterfaceInRoleRequirements\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='879ad56c-a983-47d1-b00c-c7d021922353' Name='InternalElement1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InterfaceClass ID='879ad56c-a983-47d1-b00c-c7d021922353' Name='Interface2'\n");


		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_032_InternalElements_DuplicateIDInstanceHierarchy_SystemUnitClass() throws Exception 
	{
		String modelPath = TestModelPath + "032_InternalElements_DuplicateIDInstanceHierarchy_SystemUnitClass\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "  
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement11'"
				+ "\nFile=Testcase.aml SystemUnitClassLib=SystemUnitClassLib1 type=InternalElement ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement2'\n");


		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	
	
	
	
	
	
	
	

}
