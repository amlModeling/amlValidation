//package amlValidationTestSuite;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import amlValidationSuite.AMLValidationSuite;
//import amlValidationTestSuite.util.AMLExpectedUnsatisfiedConstraints;
//
//public class AMLReferences {
//
//	private String TestModelPath = ".\\TestModels\\AMLReferences\\";
//	
//	private AMLValidationSuite validationSuite = null;
//	private AMLExpectedUnsatisfiedConstraints expected = null;
//	private AMLExpectedUnsatisfiedConstraints actual = null;	
//
//	@Before
//	public void setUp() throws Exception {
//		validationSuite = new AMLValidationSuite("configUnitTest.properties");
//		
//		expected = new AMLExpectedUnsatisfiedConstraints();		
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		if(!(actual.containsAll(expected)&& expected.containsAll(actual)))
//		{
//			System.out.println("ACTUAL: \n" + actual.toString()); 
//			System.out.println("EXPECTED: \n" + expected.toString());
//	
//		}
//	}
//	
//	
//	@Test
//	public void Test_001_SUCL_NotExisting_SameFile() throws Exception 
//	{
//		String modelPath = TestModelPath + "001_SUCL_NotExisting_SameFile\\";		
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClassLib SystemUnitClassLib3 not found");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_002_SUC_NotExisting_SameFile() throws Exception 
//	{
//		String modelPath = TestModelPath + "002_SUC_NotExisting_SameFile\\";		
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClass SystemUnitClass100 not found");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_003_SUC_Existing_OneHierarchyAbove() throws Exception 
//	{
//		String modelPath = TestModelPath + "003_SUC_Existing_OneHierarchyAbove\\";		
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_004_SUC_NotExisting_OneHierarchyAbove() throws Exception 
//	{
//		String modelPath = TestModelPath + "004_SUC_NotExisting_OneHierarchyAbove\\";		
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClass NotExistingRobot not found");
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_005_SUCL_Existing_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "005_SUCL_Existing_MultipleModels\\";		
//		//expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClass NotExistingRobot not found");
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_006_SUCL_NotExisting_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "006_SUCL_NotExisting_MultipleModels\\";		
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClassLib ReferencedSUCLNotExisting not found");
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_007_SUC_NotExisting_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "007_SUC_NotExisting_MultipleModels\\";		
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: SystemUnitClass ReferencedSUCNotExisting not found");
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_008_RC_NotExisting_SameFile() throws Exception 
//	{
//		String modelPath = TestModelPath + "008_RC_NotExisting_SameFile\\";		
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: RoleClass RoleClassNotExisting not found");
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_009_RCL_NotExisting_SameFile() throws Exception 
//	{
//		String modelPath = TestModelPath + "009_RCL_NotExisting_SameFile\\";		
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: RoleClassLib RoleClassLibNotExisting not found");
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_010_RC_Existing_OneHierarchyAbove() throws Exception 
//	{
//		String modelPath = TestModelPath + "010_RC_Existing_OneHierarchyAbove\\";		
//		
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_011_RC_NotExisting_OneHierarchyAbove() throws Exception 
//	{
//		String modelPath = TestModelPath + "011_RC_NotExisting_OneHierarchyAbove\\";		
//		
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: RoleClass RobotNotExisting not found");		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_012_RCL_Existing_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "012_RCL_Existing_MultipleModels\\";		
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_013_RCL_NotExisting_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "013_RCL_NotExisting_MultipleModels\\";
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: RoleClassLib ReferencedRCLNotExisting not found");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_014_RC_NotExisting_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "014_RC_NotExisting_MultipleModels\\";
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: RoleClass ReferencedRCNotExisting not found");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//
//	@Test
//	public void Test_015_IC_NotExisting_SameFile() throws Exception 
//	{
//		String modelPath = TestModelPath + "015_IC_NotExisting_SameFile\\";
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: InterfaceClass NotExistingIC not found");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_016_ICL_NotExisting_SameFile() throws Exception 
//	{
//		String modelPath = TestModelPath + "016_ICL_NotExisting_SameFile\\";
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: InterfaceClassLib InterfaceClassLibNotExisting not found");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_017_IC_Existing_OneHierarchyAbove() throws Exception 
//	{
//		String modelPath = TestModelPath + "017_IC_Existing_OneHierarchyAbove\\";
//			
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_018_IC_NotExisting_OneHierarchyAbove() throws Exception 
//	{
//		String modelPath = TestModelPath + "018_IC_NotExisting_OneHierarchyAbove\\";
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: InterfaceClass RobotNotExisting not found");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_019_ICL_Existing_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "019_ICL_Existing_MultipleModels\\";
//		
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_020_ICL_NotExisting_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "020_ICL_NotExisting_MultipleModels\\";
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: InterfaceClassLib ReferencedICLNotExisting not found");
//				
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_021_IC_NotExisting_MultipleModels() throws Exception 
//	{
//		String modelPath = TestModelPath + "021_IC_NotExisting_MultipleModels\\";
//		expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: InterfaceClass ReferencedICNotExisting not found");
//		
//		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
//		
//		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
//	}
//	
//	@Test
//	public void Test_022_NoInheritanceBetweenInstancesAndClasses() throws Exception 
//	{
//		String modelPath = TestModelPath + "022_NoInheritanceBetweenInstancesAndClasses\\";
//		//expected.addExpectedConstraint("IsRefBaseClassPathValid", "File=Testcase.aml - RefBaseClassPath not valid: InterfaceClass ReferencedICNotExisting not found");
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
//}
