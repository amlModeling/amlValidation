package amlValidationTestSuite;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class AMLInstanceRequirements extends AMLTest{

	private String TestModelPath = "AMLInstanceRequirements\\";
	
	
	
	/************************************************************************************************************************/
	
	/*  TEST CASES FACETS
	 *  
	 */
	
	@Test
	public void AMLFacetAttributInvalid() throws Exception 
	{
		String modelPath = TestModelPath + "Facet\\AMLFacetAttributInvalid\\";		
		
		addExpectedTestResult("Testcase.aml", "AreFacetAttributesValid", "", "", "Facet Attributes not defined: WRONG ATTRIBUTE ");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void AMLFacetInterfaceInvalid() throws Exception 
	{
		String modelPath = TestModelPath + "Facet\\AMLFacetInterfaceInvalid\\";		
		
		addExpectedTestResult("Testcase.aml", "AreFacetInterfacesValid", "", "", "Facet Interfaces not defined: WRONG INTERFACE ");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void AMLFacetInvalidIEChild() throws Exception 
	{
		String modelPath = TestModelPath + "Facet\\AMLFacetInvalidIEChild\\";		
		
		addExpectedTestResult("Testcase.aml", "NoAdditionalChildElementsInFacets", "", "", "Invalid childs in Facet HMIFacet: InternalElement");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	

	@Test
	public void AMLFacetNameNotUnique() throws Exception 
	{
		String modelPath = TestModelPath + "Facet\\AMLFacetNameNotUnique\\";		
		
		addExpectedTestResult("Testcase.aml", "FacetNameIsUniqueWithinSiblings", "", "", "Duplicate Facet name detected");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void ValidAMLFacet() throws Exception 
	{
		String modelPath = TestModelPath + "Facet\\ValidAMLFacet\\";
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	


	
	
	
	
/************************************************************************************************************************/
	
	/*  TEST CASES GROUP
	 *  
	 */
	
		
	@Test
	public void ValidAMLGroup() throws Exception 
	{
		String modelPath = TestModelPath + "Group\\ValidAMLGroup\\";		
		
		//addExpectedTestResult("Testcase.aml", "IsDerivedFromAMLBaseClass", "", "", "Class not derived from AMLInterfaceclass: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void AMLGroupWrongIENoMirror() throws Exception 
	{
		String modelPath = TestModelPath + "Group\\AMLGroupWrongIENoMirror\\";		
		
		addExpectedTestResult("Testcase.aml", "AreGroupChildrenValid", "", "", "Invalid child object detected");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
/************************************************************************************************************************/	
	/*  TEST CASES ORDER
	 *  
	 */	
	
	
	@Test
	public void IE_OrderWithoutDirection() throws Exception 
	{
		String modelPath = TestModelPath + "Order\\IE_OrderWithoutDirection\\";		
		
		addExpectedTestResult("Testcase.aml", "HasOrderInstanceDirection", "", "", "Instance of Type Order doesn't have attribute Direction: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void ValidIE_CorrectOrder() throws Exception 
	{
		String modelPath = TestModelPath + "Order\\ValidIE_CorrectOrder\\";		
				
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	@Test
	public void IE_OrderWithWrongDirectionAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "Order\\IE_OrderWithWrongDirectionAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasOrderInstanceDirectionCorrectValue", "", "", "Instance of Type Order has invalid value Instance: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_OrderWithoutDirection() throws Exception 
	{
		String modelPath = TestModelPath + "Order\\SUC_OrderWithoutDirection\\";		
		
		addExpectedTestResult("Testcase.aml", "HasOrderInstanceDirection", "", "", "Instance of Type Order doesn't have attribute Direction: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_OrderWithWrongDirectionAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "Order\\SUC_OrderWithWrongDirectionAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasOrderInstanceDirectionCorrectValue", "", "", "Instance of Type Order has invalid value Instance: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	/************************************************************************************************************************/	
	/*  TEST CASES PORT
	 *  
	 */	
	
	
	@Test
	public void IE_ConnectedPortsWithDifferentCategories() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\IE_ConnectedPortsWithDifferentCategories\\";		
		
		addExpectedTestResult("Testcase.aml", "AreConnectedPortOfSameCategory", "", "", "Non matching Categories: Category MaterialFlow doesn't match AnotherMaterialFlow");
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}	
	
	
	@Test
	public void ValidIE_InteralLinkPort() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\ValidIE_InteralLinkPort\\";		
			
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}	
	
	@Test
	public void SUC_PortWithInteralElementChilds() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\SUC_PortWithInteralElementChilds\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortNoChildInternalElements", "", "", "Instance of Type Port has child elements InternalElement: SystemUnitClass1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_PortWithoutExternalInterface() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\IE_PortWithoutExternalInterface\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortExternalInterface", "", "", "Port without ExternalInterface (exkl PortConnector): InternalElement10000");		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void SUC_PortWithoutPortConnector() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\SUC_PortWithoutPortConnector\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortConnector", "", "", "Instance of Type Port has no ExternalInterface PortConnector: SystemUnitClass1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_PortWithWrongCardinalityAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\IE_PortWithWrongCardinalityAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortCardinalityCorrectValue", "", "", "Instance of Type Port has invalid value Cardinality Instance: InternalElement1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_PortWithWrongDirectionAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\IE_PortWithWrongDirectionAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortDirectionCorrectValue", "", "", "Instance of Type Port has invalid value Instance: InternalElement1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	

	@Test
	public void IE_PortWithInteralElementChilds() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\IE_PortWithInteralElementChilds\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortNoChildInternalElements", "", "", "Instance of Type Port has child elements InternalElement: InternalElement1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_PortWithoutPortConnector() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\IE_PortWithoutPortConnector\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortConnector", "", "", "Instance of Type Port has no ExternalInterface PortConnector: InternalElement1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}	
	

	@Test
	public void SUC_PortWithWrongCardinalityAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\SUC_PortWithWrongCardinalityAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortCardinalityCorrectValue", "", "", "Instance of Type Port has invalid value Cardinality Instance: SystemUnitClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void SUC_PortWithWrongDirectionAttribute() throws Exception 
	{
		String modelPath = TestModelPath + "Port\\SUC_PortWithWrongDirectionAttribute\\";		
		
		addExpectedTestResult("Testcase.aml", "HasPortDirectionCorrectValue", "", "", "Instance of Type Port has invalid value Instance: SystemUnitClass1");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
/***************************************************************************************************************************************************/
	/*
	@Test
	public void PropertySetInvalidIEChild() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySet\\PropertySetInvalidIEChild\\";		
		
		addExpectedTestResult("Testcase.aml", "tbd", "", "", "Invalid childs in PropertySet Maﬂe: InternalElement");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void PropertySetInvalidAttribut() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySet\\PropertySetInvalidAttribut\\";		
		
		addExpectedTestResult("Testcase.aml", "tbd", "", "", "Invalid childs in PropertySet Maﬂe: Attribut");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	

	@Test
	public void PropertySetInvalidInterface() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySet\\PropertySetInvalidInterface\\";		
		
		addExpectedTestResult("Testcase.aml", "tbd", "", "", "Invalid childs in PropertySet Maﬂe: Interface");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	*/
	
	@Test
	public void PropertySetAttributeNotFoundInIE() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySet\\PropertySetAttributeNotFoundInIE\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePropertySetMappingsValid", "", "", "x not found in IE");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void PropertySetAttributeNotFoundInRoleReq() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySet\\PropertySetAttributeNotFoundInRoleReq\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePropertySetMappingsValid", "", "", "Laenge not found in RoleRequirements");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void PropertySetAttributeNotFoundInRC() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySet\\PropertySetAttributeNotFoundInRC\\";		
		
		addExpectedTestResult("Testcase.aml", "ArePropertySetMappingsValid", "", "", "Laenge not found in RC");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	@Test
	public void PropertySetValid() throws Exception 
	{
		String modelPath = TestModelPath + "PropertySet\\Valid\\";		
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	/***************************************************************************************************************************************************/	
	
	@Test
	public void IE_ExternalDataConnector_EmptyRefUI() throws Exception 
	{
		String modelPath = TestModelPath + "ExternalDataCon\\IE_ExternalDataConnector_EmptyRefUI\\";		
		
		addExpectedTestResult("Testcase.aml", "HasExternalDataConnectorRefURI", "", "", "Instance of Type ExternalDataConnector has empty refURI: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	@Test
	public void IE_ExternalDataConnector_WithoutRefUI() throws Exception 
	{
		String modelPath = TestModelPath + "ExternalDataCon\\IE_ExternalDataConnector_WithoutRefUI\\";		
		
		addExpectedTestResult("Testcase.aml", "HasExternalDataConnectorRefURI", "", "", "Instance of Type ExternalDataConnector doesn't have attribute refURI: InterfaceClass");
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	@Test
	public void ValidIE_CorrectExternalDataConnector() throws Exception 
	{
		String modelPath = TestModelPath + "ExternalDataCon\\ValidIE_CorrectExternalDataConnector\\";
		
		Assertions.assertTrue(executeAndValidateTest(modelPath));		
	}
	
	
	
	
	
}



