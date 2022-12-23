package amlValidationTestSuite;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class AMLInstanceRequirements extends AMLTest{

	private String TestModelPath = "AMLInstanceRequirements\\";
	
	@Test
	public void AMLFacetAttributInvalid() throws Exception 
	{
		String modelPath = TestModelPath + "AMLFacetAttributInvalid\\";		
		
		addExpectedTestResult("Testcase.aml", "AreFacetAttributesValid", "", "", "Facet Attributes not defined: WRONG ATTRIBUTE ");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void AMLFacetInterfaceInvalid() throws Exception 
	{
		String modelPath = TestModelPath + "AMLFacetInterfaceInvalid\\";		
		
		addExpectedTestResult("Testcase.aml", "AreFacetInterfacesValid", "", "", "Facet Interfaces not defined: WRONG INTERFACE ");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void AMLFacetInvalidIEChild() throws Exception 
	{
		String modelPath = TestModelPath + "AMLFacetInvalidIEChild\\";		
		
		addExpectedTestResult("Testcase.aml", "NoAdditionalChildElementsInFacets", "", "", "Invalid childs in Facet HMIFacet: InternalElement");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	

	@Test
	public void AMLFacetNameNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "AMLFacetNameNotUnique\\";		
		
		addExpectedTestResult("Testcase.aml", "FacetNameIsUniqueWithinSiblings", "", "", "Duplicate Facet name detected");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void AMLFacetValid() throws Exception 
	{
		String modelPath = TestModelPath + "AMLFacetValid\\";
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void PropertySetAttributeNotFoundInIE() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySetAttributeNotFoundInIE\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePropertySetMappingsValid", "", "", "x not found in IE");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void PropertySetAttributeNotFoundInRoleReq() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySetAttributeNotFoundInRoleReq\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePropertySetMappingsValid", "", "", "Laenge not found in RoleRequirements");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void PropertySetAttributeNotFoundInRC() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySetAttributeNotFoundInRC\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePropertySetMappingsValid", "", "", "Laenge not found in RC");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void BigModelValid() throws Exception 
	{
		String modelPath = TestModelPath + "BigModelValid\\";		
		
		//addExpectedTestResult("Testcase.aml", "ArePropertySetMappingsValid", "", "", "Laenge not found in RC");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	
	
/************************************************************************************************************************/
	
	
		
	@Test
	public void AMLGroupValid() throws Exception 
	{
		String modelPath = TestModelPath + "AMLGroupValid\\";		
		
		//addExpectedTestResult("Testcase.aml", "IsDerivedFromAMLBaseClass", "", "", "Class not derived from AMLInterfaceclass: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void AMLGroupWrongIENoMirror() throws Exception 
	{
		String modelPath = TestModelPath + "AMLGroupWrongIENoMirror\\";		
		
		addExpectedTestResult("Testcase.aml", "AreGroupChildrenValid", "", "", "Invalid child object detected");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	/************************************************************************************************************************/	
	
	@Test
	public void IE_ConnectedPortsWithDifferentCategories() throws Exception 
	{
		String modelPath = TestModelPath + "IE_ConnectedPortsWithDifferentCategories\\";		
		
		addExpectedTestResult("Testcase.aml", "AreConnectedPortOfSameCategory", "", "", "Non matching Categories: Category MaterialFlow doesn't match AnotherMaterialFlow");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_ExternalDataConnector_EmptyRefUI() throws Exception 
	{
		String modelPath = TestModelPath + "IE_ExternalDataConnector_EmptyRefUI\\";		
		
		addExpectedTestResult("Testcase.aml", "HasExternalDataConnectorRefURI", "", "", "Instance of Type ExternalDataConnector has empty refURI: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_ExternalDataConnector_WithoutRefUI() throws Exception 
	{
		String modelPath = TestModelPath + "IE_ExternalDataConnector_WithoutRefUI\\";		
		
		addExpectedTestResult("Testcase.aml", "HasExternalDataConnectorRefURI", "", "", "Instance of Type ExternalDataConnector doesn't have attribute refURI: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void IE_InteralLinkPortCorrect() throws Exception 
	{
		String modelPath = TestModelPath + "IE_InteralLinkPortCorrect\\";		
			
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void IE_OrderWithoutDirection() throws Exception 
	{
		String modelPath = TestModelPath + "IE_OrderWithoutDirection\\";		
		
		addExpectedTestResult("Testcase.aml", "HasOrderInstanceDirection", "", "", "Instance of Type Order doesn't have attribute Direction: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_OrderWithWrongDirectionAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "IE_OrderWithWrongDirectionAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasOrderInstanceDirectionCorrectValue", "", "", "Instance of Type Order has invalid value Instance: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_PortWithInteralElementChilds() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_PortWithInteralElementChilds\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortNoChildInternalElements", "", "", "Instance of Type Port has child elements InternalElement: SystemUnitClass1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_PortWithoutExternalInterface() throws Exception 
	{
		String modelPath = TestModelPath + "IE_PortWithoutExternalInterface\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortExternalInterface", "", "", "Port without ExternalInterface (exkl PortConnector): InternalElement10000");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_PortWithoutPortConnector() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_PortWithoutPortConnector\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortConnector", "", "", "Instance of Type Port has no ExternalInterface PortConnector: SystemUnitClass1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_PortWithWrongCardinalityAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "IE_PortWithWrongCardinalityAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortCardinalityCorrectValue", "", "", "Instance of Type Port has invalid value Cardinality Instance: InternalElement1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_PortWithWrongDirectionAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "IE_PortWithWrongDirectionAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortDirectionCorrectValue", "", "", "Instance of Type Port has invalid value Instance: InternalElement1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_OrderWithoutDirection() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_OrderWithoutDirection\\";		
		
		addExpectedTestResult("Testcase.aml", "HasOrderInstanceDirection", "", "", "Instance of Type Order doesn't have attribute Direction: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_OrderWithWrongDirectionAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_OrderWithWrongDirectionAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasOrderInstanceDirectionCorrectValue", "", "", "Instance of Type Order has invalid value Instance: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	

	@Test
	public void IE_PortWithInteralElementChilds() throws Exception 
	{
		String modelPath = TestModelPath + "IE_PortWithInteralElementChilds\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortNoChildInternalElements", "", "", "Instance of Type Port has child elements InternalElement: InternalElement1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_PortWithoutPortConnector() throws Exception 
	{
		String modelPath = TestModelPath + "IE_PortWithoutPortConnector\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortConnector", "", "", "Instance of Type Port has no ExternalInterface PortConnector: InternalElement1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	

	@Test
	public void SUC_PortWithWrongCardinalityAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_PortWithWrongCardinalityAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortCardinalityCorrectValue", "", "", "Instance of Type Port has invalid value Cardinality Instance: SystemUnitClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void SUC_PortWithWrongDirectionAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "SUC_PortWithWrongDirectionAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortDirectionCorrectValue", "", "", "Instance of Type Port has invalid value Instance: SystemUnitClass1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
/***************************************************************************************************************************************************/
	
	@Test
	public void PropertySetInvalidIEChild() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySetInvalidIEChild\\";		
		
		addExpectedTestResult("Testcase.aml", "NoAdditionalChildElementsInFacets", "", "", "Invalid childs in PropertySet Maﬂe: InternalElement");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void PropertySetInvalidAttribut() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySetInvalidAttribut\\";		
		
		addExpectedTestResult("Testcase.aml", "NoAdditionalChildElementsInFacets", "", "", "Invalid childs in PropertySet Maﬂe: Attribut");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	

	@Test
	public void PropertySetInvalidInterface() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySetInvalidInterface\\";		
		
		addExpectedTestResult("Testcase.aml", "NoAdditionalChildElementsInFacets", "", "", "Invalid childs in PropertySet Maﬂe: Interface");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void PropertySetValid() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySetIValid\\";		
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	
	
}



