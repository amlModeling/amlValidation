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
		expected.addExpectedConstraint("IsNameUnique", "Testcase.aml: Classname not unique: MyInterfaces: 'Interface1'");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_005_RoleClassesNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "005_RoleClassesNotUnique\\";		
		expected.addExpectedConstraint("IsNameUnique", "Testcase.aml: Classname not unique: ManufacturingRoleClasses: 'Roleclass1'");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
	
	@Test
	public void Test_006_SystemClassesNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "006_SystemClassesNotUnique\\";		
		expected.addExpectedConstraint("IsNameUnique", "Testcase.aml: Classname not unique: LibOfCommonTools: 'SystemUnitClass1'");
		
		actual = new AMLExpectedUnsatisfiedConstraints(validationSuite.execute(modelPath, "Testcase"));
		
		Assert.assertTrue(actual.containsAll(expected)&& expected.containsAll(actual));		
	}
		
	

}
