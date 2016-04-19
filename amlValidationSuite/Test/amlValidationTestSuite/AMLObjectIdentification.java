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
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement11'" 
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement21'\n");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_008_InternalElements_DuplicateIDSameIH_Nested() throws Exception 
	{
		String modelPath = TestModelPath + "008_InternalElements_DuplicateIDSameIH_Nested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement3'\n");
				
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_009_InternalElements_DuplicateIDDifferentIH_NotNested() throws Exception 
	{
		String modelPath = TestModelPath + "009_InternalElements_DuplicateIDDifferentIH_NotNested\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement2'\n");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_010_InternalElements_DuplicateIDDifferentIH_Nested1() throws Exception 
	{
		String modelPath = TestModelPath + "010_InternalElements_DuplicateIDDifferentIH_Nested1\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement2'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement3'\n");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_011_InternalElements_DuplicateIDDifferentIH_Nested2() throws Exception 
	{
		String modelPath = TestModelPath + "011_InternalElements_DuplicateIDDifferentIH_Nested2\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement1'"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement2'\n");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_012_InternalElements_MultipleModelsDuplicateID() throws Exception 
	{
		String modelPath = TestModelPath + "012_InternalElements_MultipleModelsDuplicateID\\";		
		expected.addExpectedConstraint("IsIDGUID", "Testcase.aml Duplicate ID(s) found: "
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='8e362e89-2c88-4bb6-827a-a26f48e29ada' Name='InternalElement12'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 ID='8e362e89-2c88-4bb6-827a-a26f48e29ada' Name='InternalElement512'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='f5973236-6c1f-43d1-ac7f-cf8b34f33021' Name='InternalElement22'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 ID='f5973236-6c1f-43d1-ac7f-cf8b34f33021' Name='InternalElement522'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 ID='c9be9315-5a25-4cf3-aea6-859db743636d' Name='InternalElement52'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 ID='c9be9315-5a25-4cf3-aea6-859db743636d' Name='InternalElement552'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 ID='72ae2ad5-312e-42a1-b90f-b208f1e9aadd' Name='InternalElement53'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 ID='72ae2ad5-312e-42a1-b90f-b208f1e9aadd' Name='InternalElement553'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 ID='1a51459a-539e-4197-b506-e304ee51e5c4' Name='InternalElement51'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 ID='1a51459a-539e-4197-b506-e304ee51e5c4' Name='InternalElement551'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='3e402fb2-ca24-4016-8771-ae5f17a482a4' Name='InternalElement31'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 ID='3e402fb2-ca24-4016-8771-ae5f17a482a4' Name='InternalElement531'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement11'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 ID='9c99111a-937d-402e-8941-a390a0b5bb3e' Name='InternalElement511'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='7a16a017-350d-478f-8f75-6d471c25a278' Name='InternalElement13'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 ID='7a16a017-350d-478f-8f75-6d471c25a278' Name='InternalElement513'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy1 ID='e56339ec-1ddf-41b0-8d70-139c606ce916' Name='InternalElement21'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy51 ID='e56339ec-1ddf-41b0-8d70-139c606ce916' Name='InternalElement521'\n"
				+ "\nFile=Testcase.aml InstanceHierarchy=InstanceHierarchy2 ID='98fe215b-ecb0-48b8-938b-084686663a9a' Name='InternalElement61'"
				+ "\nFile=ReferencedLib.aml InstanceHierarchy=InstanceHierarchy52 ID='98fe215b-ecb0-48b8-938b-084686663a9a' Name='InternalElement561'\n");
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
		
	

}