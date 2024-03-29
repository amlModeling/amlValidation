/**
 */
package CAEX;

import GenericAnyType.GenericAnyTypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CAEX.CAEXFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface CAEXPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CAEX";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://caex";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CAEX";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CAEXPackage eINSTANCE = CAEX.impl.CAEXPackageImpl.init();

	/**
	 * The meta object id for the '{@link CAEX.impl.CAEXBasicObjectImpl <em>Basic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.CAEXBasicObjectImpl
	 * @see CAEX.impl.CAEXPackageImpl#getCAEXBasicObject()
	 * @generated
	 */
	int CAEX_BASIC_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__REVISION = 2;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__COPYRIGHT = 3;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT__CHANGE_MODE = 5;

	/**
	 * The number of structural features of the '<em>Basic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Basic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_BASIC_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.AttributeNameMappingImpl <em>Attribute Name Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.AttributeNameMappingImpl
	 * @see CAEX.impl.CAEXPackageImpl#getAttributeNameMapping()
	 * @generated
	 */
	int ATTRIBUTE_NAME_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Role Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Unit Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_NAME_MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.CAEXObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.CAEXObjectImpl
	 * @see CAEX.impl.CAEXPackageImpl#getCAEXObject()
	 * @generated
	 */
	int CAEX_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__ID = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT__NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_OBJECT_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.AttributeImpl
	 * @see CAEX.impl.CAEXPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REF_SEMANTIC = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTRAINT = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNIT = CAEX_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attribute Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_DATA_TYPE = CAEX_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.AttributeValueRequirementImpl <em>Attribute Value Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.AttributeValueRequirementImpl
	 * @see CAEX.impl.CAEXPackageImpl#getAttributeValueRequirement()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Ordinal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nominal Scaled Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unknown Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT__NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Value Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Attribute Value Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_REQUIREMENT_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.CAEXFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.CAEXFileImpl
	 * @see CAEX.impl.CAEXPackageImpl#getCAEXFile()
	 * @generated
	 */
	int CAEX_FILE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__EXTERNAL_REFERENCE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Hierarchy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__INSTANCE_HIERARCHY = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__INTERFACE_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__ROLE_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System Unit Class Lib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__SYSTEM_UNIT_CLASS_LIB = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__FILE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE__SCHEMA_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAEX_FILE_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.CopyrightImpl <em>Copyright</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.CopyrightImpl
	 * @see CAEX.impl.CAEXPackageImpl#getCopyright()
	 * @generated
	 */
	int COPYRIGHT = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Copyright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Copyright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.DescriptionImpl
	 * @see CAEX.impl.CAEXPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.DocumentRootImpl
	 * @see CAEX.impl.CAEXPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>CAEX File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAEX_FILE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.InterfaceClassImpl <em>Interface Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.InterfaceClassImpl
	 * @see CAEX.impl.CAEXPackageImpl#getInterfaceClass()
	 * @generated
	 */
	int INTERFACE_CLASS = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__REF_BASE_CLASS_PATH = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__BASE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__INTERFACE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.ExternalInterfaceImpl <em>External Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.ExternalInterfaceImpl
	 * @see CAEX.impl.CAEXPackageImpl#getExternalInterface()
	 * @generated
	 */
	int EXTERNAL_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__DESCRIPTION = INTERFACE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__VERSION = INTERFACE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__REVISION = INTERFACE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__COPYRIGHT = INTERFACE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ADDITIONAL_INFORMATION = INTERFACE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__CHANGE_MODE = INTERFACE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ID = INTERFACE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__NAME = INTERFACE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__ATTRIBUTE = INTERFACE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__REF_BASE_CLASS_PATH = INTERFACE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__BASE_CLASS = INTERFACE_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE__INTERFACE_CLASS = INTERFACE_CLASS__INTERFACE_CLASS;

	/**
	 * The number of structural features of the '<em>External Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE_FEATURE_COUNT = INTERFACE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INTERFACE_OPERATION_COUNT = INTERFACE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.ExternalReferenceImpl
	 * @see CAEX.impl.CAEXPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__ALIAS = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linked Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__LINKED_MODEL = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.InstanceHierarchyImpl <em>Instance Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.InstanceHierarchyImpl
	 * @see CAEX.impl.CAEXPackageImpl#getInstanceHierarchy()
	 * @generated
	 */
	int INSTANCE_HIERARCHY = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY__INTERNAL_ELEMENT = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_HIERARCHY_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.InterfaceClassLibImpl <em>Interface Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.InterfaceClassLibImpl
	 * @see CAEX.impl.CAEXPackageImpl#getInterfaceClassLib()
	 * @generated
	 */
	int INTERFACE_CLASS_LIB = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB__INTERFACE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.InterfaceFamilyImpl <em>Interface Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.InterfaceFamilyImpl
	 * @see CAEX.impl.CAEXPackageImpl#getInterfaceFamily()
	 * @generated
	 */
	int INTERFACE_FAMILY = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__DESCRIPTION = INTERFACE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__VERSION = INTERFACE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__REVISION = INTERFACE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__COPYRIGHT = INTERFACE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ADDITIONAL_INFORMATION = INTERFACE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__CHANGE_MODE = INTERFACE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ID = INTERFACE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__NAME = INTERFACE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__ATTRIBUTE = INTERFACE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__REF_BASE_CLASS_PATH = INTERFACE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__BASE_CLASS = INTERFACE_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Interface Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY__INTERFACE_CLASS = INTERFACE_CLASS__INTERFACE_CLASS;

	/**
	 * The number of structural features of the '<em>Interface Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY_FEATURE_COUNT = INTERFACE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAMILY_OPERATION_COUNT = INTERFACE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.InterfaceNameMappingImpl <em>Interface Name Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.InterfaceNameMappingImpl
	 * @see CAEX.impl.CAEXPackageImpl#getInterfaceNameMapping()
	 * @generated
	 */
	int INTERFACE_NAME_MAPPING = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Role Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Unit Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Name Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_NAME_MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.SystemUnitClassImpl <em>System Unit Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.SystemUnitClassImpl
	 * @see CAEX.impl.CAEXPackageImpl#getSystemUnitClass()
	 * @generated
	 */
	int SYSTEM_UNIT_CLASS = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__INTERNAL_LINK = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH = CAEX_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__BASE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS = CAEX_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>System Unit Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>System Unit Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.InternalElementImpl <em>Internal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.InternalElementImpl
	 * @see CAEX.impl.CAEXPackageImpl#getInternalElement()
	 * @generated
	 */
	int INTERNAL_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__DESCRIPTION = SYSTEM_UNIT_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__VERSION = SYSTEM_UNIT_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__REVISION = SYSTEM_UNIT_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__COPYRIGHT = SYSTEM_UNIT_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ADDITIONAL_INFORMATION = SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__CHANGE_MODE = SYSTEM_UNIT_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ID = SYSTEM_UNIT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__NAME = SYSTEM_UNIT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ATTRIBUTE = SYSTEM_UNIT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__EXTERNAL_INTERFACE = SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__INTERNAL_ELEMENT = SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__SUPPORTED_ROLE_CLASS = SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__INTERNAL_LINK = SYSTEM_UNIT_CLASS__INTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__REF_BASE_CLASS_PATH = SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__BASE_CLASS = SYSTEM_UNIT_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__SYSTEM_UNIT_CLASS = SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS;

	/**
	 * The feature id for the '<em><b>Role Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__ROLE_REQUIREMENTS = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__MAPPING_OBJECT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Base System Unit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base System Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT__BASE_SYSTEM_UNIT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Internal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT_FEATURE_COUNT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Internal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ELEMENT_OPERATION_COUNT = SYSTEM_UNIT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.InternalLinkImpl <em>Internal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.InternalLinkImpl
	 * @see CAEX.impl.CAEXPackageImpl#getInternalLink()
	 * @generated
	 */
	int INTERNAL_LINK = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Partner Side A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REF_PARTNER_SIDE_A = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Partner Side B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__REF_PARTNER_SIDE_B = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partner Side A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__PARTNER_SIDE_A = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partner Side B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK__PARTNER_SIDE_B = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Internal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_LINK_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.MappingImpl
	 * @see CAEX.impl.CAEXPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Attribute Name Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ATTRIBUTE_NAME_MAPPING = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Name Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__INTERFACE_NAME_MAPPING = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.NominalScaledImpl <em>Nominal Scaled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.NominalScaledImpl
	 * @see CAEX.impl.CAEXPackageImpl#getNominalScaled()
	 * @generated
	 */
	int NOMINAL_SCALED = 19;

	/**
	 * The feature id for the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED__REQUIRED_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Nominal Scaled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nominal Scaled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMINAL_SCALED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.OrdinalScaledImpl <em>Ordinal Scaled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.OrdinalScaledImpl
	 * @see CAEX.impl.CAEXPackageImpl#getOrdinalScaled()
	 * @generated
	 */
	int ORDINAL_SCALED = 20;

	/**
	 * The feature id for the '<em><b>Required Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED__REQUIRED_MAX_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED__REQUIRED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Required Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED__REQUIRED_MIN_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Ordinal Scaled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ordinal Scaled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDINAL_SCALED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.RefSemanticImpl <em>Ref Semantic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.RefSemanticImpl
	 * @see CAEX.impl.CAEXPackageImpl#getRefSemantic()
	 * @generated
	 */
	int REF_SEMANTIC = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Corresponding Attribute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Semantic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Semantic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SEMANTIC_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.RevisionImpl
	 * @see CAEX.impl.CAEXPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_DATE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__OLD_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__NEW_VERSION = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__AUTHOR_NAME = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__COMMENT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.RoleClassLibImpl <em>Role Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.RoleClassLibImpl
	 * @see CAEX.impl.CAEXPackageImpl#getRoleClassLib()
	 * @generated
	 */
	int ROLE_CLASS_LIB = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB__ROLE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.RoleClassImpl <em>Role Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.RoleClassImpl
	 * @see CAEX.impl.CAEXPackageImpl#getRoleClass()
	 * @generated
	 */
	int ROLE_CLASS = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ATTRIBUTE = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__EXTERNAL_INTERFACE = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__REF_BASE_CLASS_PATH = CAEX_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__BASE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS__ROLE_CLASS = CAEX_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_CLASS_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.RoleFamilyImpl <em>Role Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.RoleFamilyImpl
	 * @see CAEX.impl.CAEXPackageImpl#getRoleFamily()
	 * @generated
	 */
	int ROLE_FAMILY = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__DESCRIPTION = ROLE_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__VERSION = ROLE_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__REVISION = ROLE_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__COPYRIGHT = ROLE_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ADDITIONAL_INFORMATION = ROLE_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__CHANGE_MODE = ROLE_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ID = ROLE_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__NAME = ROLE_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ATTRIBUTE = ROLE_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__EXTERNAL_INTERFACE = ROLE_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__REF_BASE_CLASS_PATH = ROLE_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__BASE_CLASS = ROLE_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY__ROLE_CLASS = ROLE_CLASS__ROLE_CLASS;

	/**
	 * The number of structural features of the '<em>Role Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY_FEATURE_COUNT = ROLE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FAMILY_OPERATION_COUNT = ROLE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.RoleRequirementsImpl <em>Role Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.RoleRequirementsImpl
	 * @see CAEX.impl.CAEXPackageImpl#getRoleRequirements()
	 * @generated
	 */
	int ROLE_REQUIREMENTS = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__ATTRIBUTE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__EXTERNAL_INTERFACE = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ref Base Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Role Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_REQUIREMENTS_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.SupportedRoleClassImpl <em>Supported Role Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.SupportedRoleClassImpl
	 * @see CAEX.impl.CAEXPackageImpl#getSupportedRoleClass()
	 * @generated
	 */
	int SUPPORTED_ROLE_CLASS = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__DESCRIPTION = CAEX_BASIC_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__VERSION = CAEX_BASIC_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__REVISION = CAEX_BASIC_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__COPYRIGHT = CAEX_BASIC_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__ADDITIONAL_INFORMATION = CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__CHANGE_MODE = CAEX_BASIC_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__MAPPING_OBJECT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH = CAEX_BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS__ROLE_CLASS = CAEX_BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Supported Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS_FEATURE_COUNT = CAEX_BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Supported Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_ROLE_CLASS_OPERATION_COUNT = CAEX_BASIC_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.SystemUnitClassLibImpl <em>System Unit Class Lib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.SystemUnitClassLibImpl
	 * @see CAEX.impl.CAEXPackageImpl#getSystemUnitClassLib()
	 * @generated
	 */
	int SYSTEM_UNIT_CLASS_LIB = 28;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__DESCRIPTION = CAEX_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__VERSION = CAEX_OBJECT__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__REVISION = CAEX_OBJECT__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__COPYRIGHT = CAEX_OBJECT__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__ADDITIONAL_INFORMATION = CAEX_OBJECT__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__CHANGE_MODE = CAEX_OBJECT__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__ID = CAEX_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__NAME = CAEX_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS = CAEX_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Unit Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB_FEATURE_COUNT = CAEX_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Unit Class Lib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_CLASS_LIB_OPERATION_COUNT = CAEX_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.SystemUnitFamilyImpl <em>System Unit Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.SystemUnitFamilyImpl
	 * @see CAEX.impl.CAEXPackageImpl#getSystemUnitFamily()
	 * @generated
	 */
	int SYSTEM_UNIT_FAMILY = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__DESCRIPTION = SYSTEM_UNIT_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__VERSION = SYSTEM_UNIT_CLASS__VERSION;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__REVISION = SYSTEM_UNIT_CLASS__REVISION;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__COPYRIGHT = SYSTEM_UNIT_CLASS__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ADDITIONAL_INFORMATION = SYSTEM_UNIT_CLASS__ADDITIONAL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__CHANGE_MODE = SYSTEM_UNIT_CLASS__CHANGE_MODE;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ID = SYSTEM_UNIT_CLASS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__NAME = SYSTEM_UNIT_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__ATTRIBUTE = SYSTEM_UNIT_CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>External Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__EXTERNAL_INTERFACE = SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE;

	/**
	 * The feature id for the '<em><b>Internal Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__INTERNAL_ELEMENT = SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Supported Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__SUPPORTED_ROLE_CLASS = SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS;

	/**
	 * The feature id for the '<em><b>Internal Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__INTERNAL_LINK = SYSTEM_UNIT_CLASS__INTERNAL_LINK;

	/**
	 * The feature id for the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__REF_BASE_CLASS_PATH = SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__BASE_CLASS = SYSTEM_UNIT_CLASS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>System Unit Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY__SYSTEM_UNIT_CLASS = SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS;

	/**
	 * The number of structural features of the '<em>System Unit Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY_FEATURE_COUNT = SYSTEM_UNIT_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Unit Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_UNIT_FAMILY_OPERATION_COUNT = SYSTEM_UNIT_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.UnknownTypeImpl
	 * @see CAEX.impl.CAEXPackageImpl#getUnknownType()
	 * @generated
	 */
	int UNKNOWN_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE__REQUIREMENTS = 0;

	/**
	 * The number of structural features of the '<em>Unknown Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unknown Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.VersionImpl
	 * @see CAEX.impl.CAEXPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Change Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__CHANGE_MODE = 1;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CAEX.impl.AdditionalInformationImpl <em>Additional Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.impl.AdditionalInformationImpl
	 * @see CAEX.impl.CAEXPackageImpl#getAdditionalInformation()
	 * @generated
	 */
	int ADDITIONAL_INFORMATION = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__NAME = GenericAnyTypePackage.GENERIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__VALUE = GenericAnyTypePackage.GENERIC_ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Nested Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__NESTED_ELEMENTS = GenericAnyTypePackage.GENERIC_ELEMENT__NESTED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__ATTRIBUTES = GenericAnyTypePackage.GENERIC_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Element Feature Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__ELEMENT_FEATURE_MAP = GenericAnyTypePackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP;

	/**
	 * The feature id for the '<em><b>Attribute Feature Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION__ATTRIBUTE_FEATURE_MAP = GenericAnyTypePackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP;

	/**
	 * The number of structural features of the '<em>Additional Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION_FEATURE_COUNT = GenericAnyTypePackage.GENERIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Additional Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_INFORMATION_OPERATION_COUNT = GenericAnyTypePackage.GENERIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CAEX.ChangeMode <em>Change Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.ChangeMode
	 * @see CAEX.impl.CAEXPackageImpl#getChangeMode()
	 * @generated
	 */
	int CHANGE_MODE = 34;

	/**
	 * The meta object id for the '<em>Attribute Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see CAEX.impl.CAEXPackageImpl#getAttributeDataType()
	 * @generated
	 */
	int ATTRIBUTE_DATA_TYPE = 35;

	/**
	 * The meta object id for the '<em>Change Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CAEX.ChangeMode
	 * @see CAEX.impl.CAEXPackageImpl#getChangeModeObject()
	 * @generated
	 */
	int CHANGE_MODE_OBJECT = 36;


	/**
	 * Returns the meta object for class '{@link CAEX.AttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Name Mapping</em>'.
	 * @see CAEX.AttributeNameMapping
	 * @generated
	 */
	EClass getAttributeNameMapping();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.AttributeNameMapping#getRoleAttributeName <em>Role Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Attribute Name</em>'.
	 * @see CAEX.AttributeNameMapping#getRoleAttributeName()
	 * @see #getAttributeNameMapping()
	 * @generated
	 */
	EAttribute getAttributeNameMapping_RoleAttributeName();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.AttributeNameMapping#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Unit Attribute Name</em>'.
	 * @see CAEX.AttributeNameMapping#getSystemUnitAttributeName()
	 * @see #getAttributeNameMapping()
	 * @generated
	 */
	EAttribute getAttributeNameMapping_SystemUnitAttributeName();

	/**
	 * Returns the meta object for class '{@link CAEX.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see CAEX.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see CAEX.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CAEX.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.Attribute#getRefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ref Semantic</em>'.
	 * @see CAEX.Attribute#getRefSemantic()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_RefSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.Attribute#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see CAEX.Attribute#getConstraint()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.Attribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see CAEX.Attribute#getAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Attribute#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see CAEX.Attribute#getUnit()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Unit();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Attribute#getAttributeDataType <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Data Type</em>'.
	 * @see CAEX.Attribute#getAttributeDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeDataType();

	/**
	 * Returns the meta object for class '{@link CAEX.AttributeValueRequirement <em>Attribute Value Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Requirement</em>'.
	 * @see CAEX.AttributeValueRequirement
	 * @generated
	 */
	EClass getAttributeValueRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.AttributeValueRequirement#getOrdinalScaledType <em>Ordinal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ordinal Scaled Type</em>'.
	 * @see CAEX.AttributeValueRequirement#getOrdinalScaledType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_OrdinalScaledType();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.AttributeValueRequirement#getNominalScaledType <em>Nominal Scaled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nominal Scaled Type</em>'.
	 * @see CAEX.AttributeValueRequirement#getNominalScaledType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_NominalScaledType();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.AttributeValueRequirement#getUnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unknown Type</em>'.
	 * @see CAEX.AttributeValueRequirement#getUnknownType()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EReference getAttributeValueRequirement_UnknownType();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.AttributeValueRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CAEX.AttributeValueRequirement#getName()
	 * @see #getAttributeValueRequirement()
	 * @generated
	 */
	EAttribute getAttributeValueRequirement_Name();

	/**
	 * Returns the meta object for class '{@link CAEX.CAEXBasicObject <em>Basic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Object</em>'.
	 * @see CAEX.CAEXBasicObject
	 * @generated
	 */
	EClass getCAEXBasicObject();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.CAEXBasicObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see CAEX.CAEXBasicObject#getDescription()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Description();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.CAEXBasicObject#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see CAEX.CAEXBasicObject#getVersion()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.CAEXBasicObject#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revision</em>'.
	 * @see CAEX.CAEXBasicObject#getRevision()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Revision();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.CAEXBasicObject#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright</em>'.
	 * @see CAEX.CAEXBasicObject#getCopyright()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_Copyright();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.CAEXBasicObject#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Information</em>'.
	 * @see CAEX.CAEXBasicObject#getAdditionalInformation()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EReference getCAEXBasicObject_AdditionalInformation();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.CAEXBasicObject#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see CAEX.CAEXBasicObject#getChangeMode()
	 * @see #getCAEXBasicObject()
	 * @generated
	 */
	EAttribute getCAEXBasicObject_ChangeMode();

	/**
	 * Returns the meta object for class '{@link CAEX.CAEXFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see CAEX.CAEXFile
	 * @generated
	 */
	EClass getCAEXFile();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.CAEXFile#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Reference</em>'.
	 * @see CAEX.CAEXFile#getExternalReference()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_ExternalReference();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.CAEXFile#getInstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Hierarchy</em>'.
	 * @see CAEX.CAEXFile#getInstanceHierarchy()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_InstanceHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.CAEXFile#getInterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class Lib</em>'.
	 * @see CAEX.CAEXFile#getInterfaceClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_InterfaceClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.CAEXFile#getRoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class Lib</em>'.
	 * @see CAEX.CAEXFile#getRoleClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_RoleClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.CAEXFile#getSystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class Lib</em>'.
	 * @see CAEX.CAEXFile#getSystemUnitClassLib()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EReference getCAEXFile_SystemUnitClassLib();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.CAEXFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see CAEX.CAEXFile#getFileName()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EAttribute getCAEXFile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.CAEXFile#getSchemaVersion <em>Schema Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Version</em>'.
	 * @see CAEX.CAEXFile#getSchemaVersion()
	 * @see #getCAEXFile()
	 * @generated
	 */
	EAttribute getCAEXFile_SchemaVersion();

	/**
	 * Returns the meta object for class '{@link CAEX.CAEXObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see CAEX.CAEXObject
	 * @generated
	 */
	EClass getCAEXObject();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.CAEXObject#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see CAEX.CAEXObject#getID()
	 * @see #getCAEXObject()
	 * @generated
	 */
	EAttribute getCAEXObject_ID();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.CAEXObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CAEX.CAEXObject#getName()
	 * @see #getCAEXObject()
	 * @generated
	 */
	EAttribute getCAEXObject_Name();

	/**
	 * Returns the meta object for class '{@link CAEX.Copyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copyright</em>'.
	 * @see CAEX.Copyright
	 * @generated
	 */
	EClass getCopyright();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Copyright#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CAEX.Copyright#getValue()
	 * @see #getCopyright()
	 * @generated
	 */
	EAttribute getCopyright_Value();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Copyright#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see CAEX.Copyright#getChangeMode()
	 * @see #getCopyright()
	 * @generated
	 */
	EAttribute getCopyright_ChangeMode();

	/**
	 * Returns the meta object for class '{@link CAEX.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see CAEX.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Description#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CAEX.Description#getValue()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Value();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Description#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see CAEX.Description#getChangeMode()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_ChangeMode();

	/**
	 * Returns the meta object for class '{@link CAEX.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see CAEX.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link CAEX.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see CAEX.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link CAEX.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see CAEX.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link CAEX.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see CAEX.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.DocumentRoot#getCAEXFile <em>CAEX File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CAEX File</em>'.
	 * @see CAEX.DocumentRoot#getCAEXFile()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CAEXFile();

	/**
	 * Returns the meta object for class '{@link CAEX.ExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Interface</em>'.
	 * @see CAEX.ExternalInterface
	 * @generated
	 */
	EClass getExternalInterface();

	/**
	 * Returns the meta object for class '{@link CAEX.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see CAEX.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.ExternalReference#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see CAEX.ExternalReference#getAlias()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Alias();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.ExternalReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see CAEX.ExternalReference#getPath()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Path();

	/**
	 * Returns the meta object for the reference '{@link CAEX.ExternalReference#getLinkedModel <em>Linked Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Model</em>'.
	 * @see CAEX.ExternalReference#getLinkedModel()
	 * @see #getExternalReference()
	 * @generated
	 */
	EReference getExternalReference_LinkedModel();

	/**
	 * Returns the meta object for class '{@link CAEX.InstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Hierarchy</em>'.
	 * @see CAEX.InstanceHierarchy
	 * @generated
	 */
	EClass getInstanceHierarchy();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.InstanceHierarchy#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Element</em>'.
	 * @see CAEX.InstanceHierarchy#getInternalElement()
	 * @see #getInstanceHierarchy()
	 * @generated
	 */
	EReference getInstanceHierarchy_InternalElement();

	/**
	 * Returns the meta object for class '{@link CAEX.InterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Class Lib</em>'.
	 * @see CAEX.InterfaceClassLib
	 * @generated
	 */
	EClass getInterfaceClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.InterfaceClassLib#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class</em>'.
	 * @see CAEX.InterfaceClassLib#getInterfaceClass()
	 * @see #getInterfaceClassLib()
	 * @generated
	 */
	EReference getInterfaceClassLib_InterfaceClass();

	/**
	 * Returns the meta object for class '{@link CAEX.InterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Class</em>'.
	 * @see CAEX.InterfaceClass
	 * @generated
	 */
	EClass getInterfaceClass();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.InterfaceClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see CAEX.InterfaceClass#getAttribute()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EReference getInterfaceClass_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see CAEX.InterfaceClass#getRefBaseClassPath()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EAttribute getInterfaceClass_RefBaseClassPath();

	/**
	 * Returns the meta object for the reference '{@link CAEX.InterfaceClass#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see CAEX.InterfaceClass#getBaseClass()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EReference getInterfaceClass_BaseClass();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.InterfaceClass#getInterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Class</em>'.
	 * @see CAEX.InterfaceClass#getInterfaceClass()
	 * @see #getInterfaceClass()
	 * @generated
	 */
	EReference getInterfaceClass_InterfaceClass();

	/**
	 * Returns the meta object for class '{@link CAEX.InterfaceFamily <em>Interface Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Family</em>'.
	 * @see CAEX.InterfaceFamily
	 * @generated
	 */
	EClass getInterfaceFamily();

	/**
	 * Returns the meta object for class '{@link CAEX.InterfaceNameMapping <em>Interface Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Name Mapping</em>'.
	 * @see CAEX.InterfaceNameMapping
	 * @generated
	 */
	EClass getInterfaceNameMapping();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.InterfaceNameMapping#getRoleInterfaceName <em>Role Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Interface Name</em>'.
	 * @see CAEX.InterfaceNameMapping#getRoleInterfaceName()
	 * @see #getInterfaceNameMapping()
	 * @generated
	 */
	EAttribute getInterfaceNameMapping_RoleInterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.InterfaceNameMapping#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Unit Interface Name</em>'.
	 * @see CAEX.InterfaceNameMapping#getSystemUnitInterfaceName()
	 * @see #getInterfaceNameMapping()
	 * @generated
	 */
	EAttribute getInterfaceNameMapping_SystemUnitInterfaceName();

	/**
	 * Returns the meta object for class '{@link CAEX.InternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Element</em>'.
	 * @see CAEX.InternalElement
	 * @generated
	 */
	EClass getInternalElement();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.InternalElement#getRoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Requirements</em>'.
	 * @see CAEX.InternalElement#getRoleRequirements()
	 * @see #getInternalElement()
	 * @generated
	 */
	EReference getInternalElement_RoleRequirements();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.InternalElement#getMappingObject <em>Mapping Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Object</em>'.
	 * @see CAEX.InternalElement#getMappingObject()
	 * @see #getInternalElement()
	 * @generated
	 */
	EReference getInternalElement_MappingObject();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base System Unit Path</em>'.
	 * @see CAEX.InternalElement#getRefBaseSystemUnitPath()
	 * @see #getInternalElement()
	 * @generated
	 */
	EAttribute getInternalElement_RefBaseSystemUnitPath();

	/**
	 * Returns the meta object for the reference '{@link CAEX.InternalElement#getBaseSystemUnit <em>Base System Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base System Unit</em>'.
	 * @see CAEX.InternalElement#getBaseSystemUnit()
	 * @see #getInternalElement()
	 * @generated
	 */
	EReference getInternalElement_BaseSystemUnit();

	/**
	 * Returns the meta object for class '{@link CAEX.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Link</em>'.
	 * @see CAEX.InternalLink
	 * @generated
	 */
	EClass getInternalLink();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Partner Side A</em>'.
	 * @see CAEX.InternalLink#getRefPartnerSideA()
	 * @see #getInternalLink()
	 * @generated
	 */
	EAttribute getInternalLink_RefPartnerSideA();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Partner Side B</em>'.
	 * @see CAEX.InternalLink#getRefPartnerSideB()
	 * @see #getInternalLink()
	 * @generated
	 */
	EAttribute getInternalLink_RefPartnerSideB();

	/**
	 * Returns the meta object for the reference '{@link CAEX.InternalLink#getPartnerSideA <em>Partner Side A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Side A</em>'.
	 * @see CAEX.InternalLink#getPartnerSideA()
	 * @see #getInternalLink()
	 * @generated
	 */
	EReference getInternalLink_PartnerSideA();

	/**
	 * Returns the meta object for the reference '{@link CAEX.InternalLink#getPartnerSideB <em>Partner Side B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Side B</em>'.
	 * @see CAEX.InternalLink#getPartnerSideB()
	 * @see #getInternalLink()
	 * @generated
	 */
	EReference getInternalLink_PartnerSideB();

	/**
	 * Returns the meta object for class '{@link CAEX.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see CAEX.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.Mapping#getAttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Name Mapping</em>'.
	 * @see CAEX.Mapping#getAttributeNameMapping()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_AttributeNameMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.Mapping#getInterfaceNameMapping <em>Interface Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Name Mapping</em>'.
	 * @see CAEX.Mapping#getInterfaceNameMapping()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_InterfaceNameMapping();

	/**
	 * Returns the meta object for class '{@link CAEX.NominalScaled <em>Nominal Scaled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nominal Scaled</em>'.
	 * @see CAEX.NominalScaled
	 * @generated
	 */
	EClass getNominalScaled();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.NominalScaled#getRequiredValue <em>Required Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Value</em>'.
	 * @see CAEX.NominalScaled#getRequiredValue()
	 * @see #getNominalScaled()
	 * @generated
	 */
	EAttribute getNominalScaled_RequiredValue();

	/**
	 * Returns the meta object for class '{@link CAEX.OrdinalScaled <em>Ordinal Scaled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordinal Scaled</em>'.
	 * @see CAEX.OrdinalScaled
	 * @generated
	 */
	EClass getOrdinalScaled();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.OrdinalScaled#getRequiredMaxValue <em>Required Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Max Value</em>'.
	 * @see CAEX.OrdinalScaled#getRequiredMaxValue()
	 * @see #getOrdinalScaled()
	 * @generated
	 */
	EAttribute getOrdinalScaled_RequiredMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.OrdinalScaled#getRequiredValue <em>Required Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Value</em>'.
	 * @see CAEX.OrdinalScaled#getRequiredValue()
	 * @see #getOrdinalScaled()
	 * @generated
	 */
	EAttribute getOrdinalScaled_RequiredValue();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.OrdinalScaled#getRequiredMinValue <em>Required Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Min Value</em>'.
	 * @see CAEX.OrdinalScaled#getRequiredMinValue()
	 * @see #getOrdinalScaled()
	 * @generated
	 */
	EAttribute getOrdinalScaled_RequiredMinValue();

	/**
	 * Returns the meta object for class '{@link CAEX.RefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Semantic</em>'.
	 * @see CAEX.RefSemantic
	 * @generated
	 */
	EClass getRefSemantic();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.RefSemantic#getCorrespondingAttributePath <em>Corresponding Attribute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Attribute Path</em>'.
	 * @see CAEX.RefSemantic#getCorrespondingAttributePath()
	 * @see #getRefSemantic()
	 * @generated
	 */
	EAttribute getRefSemantic_CorrespondingAttributePath();

	/**
	 * Returns the meta object for class '{@link CAEX.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see CAEX.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Revision#getRevisionDate <em>Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Date</em>'.
	 * @see CAEX.Revision#getRevisionDate()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_RevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Revision#getOldVersion <em>Old Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Version</em>'.
	 * @see CAEX.Revision#getOldVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_OldVersion();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Revision#getNewVersion <em>New Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Version</em>'.
	 * @see CAEX.Revision#getNewVersion()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_NewVersion();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Revision#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see CAEX.Revision#getAuthorName()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_AuthorName();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Revision#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see CAEX.Revision#getComment()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Comment();

	/**
	 * Returns the meta object for class '{@link CAEX.RoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Class Lib</em>'.
	 * @see CAEX.RoleClassLib
	 * @generated
	 */
	EClass getRoleClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.RoleClassLib#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class</em>'.
	 * @see CAEX.RoleClassLib#getRoleClass()
	 * @see #getRoleClassLib()
	 * @generated
	 */
	EReference getRoleClassLib_RoleClass();

	/**
	 * Returns the meta object for class '{@link CAEX.RoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Class</em>'.
	 * @see CAEX.RoleClass
	 * @generated
	 */
	EClass getRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.RoleClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see CAEX.RoleClass#getAttribute()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.RoleClass#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see CAEX.RoleClass#getExternalInterface()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_ExternalInterface();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.RoleClass#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see CAEX.RoleClass#getRefBaseClassPath()
	 * @see #getRoleClass()
	 * @generated
	 */
	EAttribute getRoleClass_RefBaseClassPath();

	/**
	 * Returns the meta object for the reference '{@link CAEX.RoleClass#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see CAEX.RoleClass#getBaseClass()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_BaseClass();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.RoleClass#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Class</em>'.
	 * @see CAEX.RoleClass#getRoleClass()
	 * @see #getRoleClass()
	 * @generated
	 */
	EReference getRoleClass_RoleClass();

	/**
	 * Returns the meta object for class '{@link CAEX.RoleFamily <em>Role Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Family</em>'.
	 * @see CAEX.RoleFamily
	 * @generated
	 */
	EClass getRoleFamily();

	/**
	 * Returns the meta object for class '{@link CAEX.RoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Requirements</em>'.
	 * @see CAEX.RoleRequirements
	 * @generated
	 */
	EClass getRoleRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.RoleRequirements#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see CAEX.RoleRequirements#getAttribute()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EReference getRoleRequirements_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.RoleRequirements#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see CAEX.RoleRequirements#getExternalInterface()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EReference getRoleRequirements_ExternalInterface();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Role Class Path</em>'.
	 * @see CAEX.RoleRequirements#getRefBaseRoleClassPath()
	 * @see #getRoleRequirements()
	 * @generated
	 */
	EAttribute getRoleRequirements_RefBaseRoleClassPath();

	/**
	 * Returns the meta object for class '{@link CAEX.SupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Role Class</em>'.
	 * @see CAEX.SupportedRoleClass
	 * @generated
	 */
	EClass getSupportedRoleClass();

	/**
	 * Returns the meta object for the containment reference '{@link CAEX.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping Object</em>'.
	 * @see CAEX.SupportedRoleClass#getMappingObject()
	 * @see #getSupportedRoleClass()
	 * @generated
	 */
	EReference getSupportedRoleClass_MappingObject();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Role Class Path</em>'.
	 * @see CAEX.SupportedRoleClass#getRefRoleClassPath()
	 * @see #getSupportedRoleClass()
	 * @generated
	 */
	EAttribute getSupportedRoleClass_RefRoleClassPath();

	/**
	 * Returns the meta object for the reference '{@link CAEX.SupportedRoleClass#getRoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Class</em>'.
	 * @see CAEX.SupportedRoleClass#getRoleClass()
	 * @see #getSupportedRoleClass()
	 * @generated
	 */
	EReference getSupportedRoleClass_RoleClass();

	/**
	 * Returns the meta object for class '{@link CAEX.SystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Class Lib</em>'.
	 * @see CAEX.SystemUnitClassLib
	 * @generated
	 */
	EClass getSystemUnitClassLib();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.SystemUnitClassLib#getSystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class</em>'.
	 * @see CAEX.SystemUnitClassLib#getSystemUnitClass()
	 * @see #getSystemUnitClassLib()
	 * @generated
	 */
	EReference getSystemUnitClassLib_SystemUnitClass();

	/**
	 * Returns the meta object for class '{@link CAEX.SystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Class</em>'.
	 * @see CAEX.SystemUnitClass
	 * @generated
	 */
	EClass getSystemUnitClass();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.SystemUnitClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see CAEX.SystemUnitClass#getAttribute()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.SystemUnitClass#getExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Interface</em>'.
	 * @see CAEX.SystemUnitClass#getExternalInterface()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_ExternalInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.SystemUnitClass#getInternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Element</em>'.
	 * @see CAEX.SystemUnitClass#getInternalElement()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_InternalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.SystemUnitClass#getSupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Role Class</em>'.
	 * @see CAEX.SystemUnitClass#getSupportedRoleClass()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_SupportedRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.SystemUnitClass#getInternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Link</em>'.
	 * @see CAEX.SystemUnitClass#getInternalLink()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_InternalLink();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.SystemUnitClass#getRefBaseClassPath <em>Ref Base Class Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Base Class Path</em>'.
	 * @see CAEX.SystemUnitClass#getRefBaseClassPath()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EAttribute getSystemUnitClass_RefBaseClassPath();

	/**
	 * Returns the meta object for the reference '{@link CAEX.SystemUnitClass#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see CAEX.SystemUnitClass#getBaseClass()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_BaseClass();

	/**
	 * Returns the meta object for the containment reference list '{@link CAEX.SystemUnitClass#getSystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Unit Class</em>'.
	 * @see CAEX.SystemUnitClass#getSystemUnitClass()
	 * @see #getSystemUnitClass()
	 * @generated
	 */
	EReference getSystemUnitClass_SystemUnitClass();

	/**
	 * Returns the meta object for class '{@link CAEX.SystemUnitFamily <em>System Unit Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Unit Family</em>'.
	 * @see CAEX.SystemUnitFamily
	 * @generated
	 */
	EClass getSystemUnitFamily();

	/**
	 * Returns the meta object for class '{@link CAEX.UnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Type</em>'.
	 * @see CAEX.UnknownType
	 * @generated
	 */
	EClass getUnknownType();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.UnknownType#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirements</em>'.
	 * @see CAEX.UnknownType#getRequirements()
	 * @see #getUnknownType()
	 * @generated
	 */
	EAttribute getUnknownType_Requirements();

	/**
	 * Returns the meta object for class '{@link CAEX.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see CAEX.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Version#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CAEX.Version#getValue()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Value();

	/**
	 * Returns the meta object for the attribute '{@link CAEX.Version#getChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Mode</em>'.
	 * @see CAEX.Version#getChangeMode()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_ChangeMode();

	/**
	 * Returns the meta object for class '{@link CAEX.AdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Information</em>'.
	 * @see CAEX.AdditionalInformation
	 * @generated
	 */
	EClass getAdditionalInformation();

	/**
	 * Returns the meta object for enum '{@link CAEX.ChangeMode <em>Change Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Change Mode</em>'.
	 * @see CAEX.ChangeMode
	 * @generated
	 */
	EEnum getChangeMode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Attribute Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attribute Data Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='AttributeDataType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getAttributeDataType();

	/**
	 * Returns the meta object for data type '{@link CAEX.ChangeMode <em>Change Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Change Mode Object</em>'.
	 * @see CAEX.ChangeMode
	 * @model instanceClass="CAEX.ChangeMode"
	 *        extendedMetaData="name='ChangeMode:Object' baseType='ChangeMode'"
	 * @generated
	 */
	EDataType getChangeModeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CAEXFactory getCAEXFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CAEX.impl.AttributeNameMappingImpl <em>Attribute Name Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.AttributeNameMappingImpl
		 * @see CAEX.impl.CAEXPackageImpl#getAttributeNameMapping()
		 * @generated
		 */
		EClass ATTRIBUTE_NAME_MAPPING = eINSTANCE.getAttributeNameMapping();

		/**
		 * The meta object literal for the '<em><b>Role Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME = eINSTANCE.getAttributeNameMapping_RoleAttributeName();

		/**
		 * The meta object literal for the '<em><b>System Unit Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME = eINSTANCE.getAttributeNameMapping_SystemUnitAttributeName();

		/**
		 * The meta object literal for the '{@link CAEX.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.AttributeImpl
		 * @see CAEX.impl.CAEXPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Ref Semantic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__REF_SEMANTIC = eINSTANCE.getAttribute_RefSemantic();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONSTRAINT = eINSTANCE.getAttribute_Constraint();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE = eINSTANCE.getAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UNIT = eINSTANCE.getAttribute_Unit();

		/**
		 * The meta object literal for the '<em><b>Attribute Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_DATA_TYPE = eINSTANCE.getAttribute_AttributeDataType();

		/**
		 * The meta object literal for the '{@link CAEX.impl.AttributeValueRequirementImpl <em>Attribute Value Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.AttributeValueRequirementImpl
		 * @see CAEX.impl.CAEXPackageImpl#getAttributeValueRequirement()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_REQUIREMENT = eINSTANCE.getAttributeValueRequirement();

		/**
		 * The meta object literal for the '<em><b>Ordinal Scaled Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE = eINSTANCE.getAttributeValueRequirement_OrdinalScaledType();

		/**
		 * The meta object literal for the '<em><b>Nominal Scaled Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE = eINSTANCE.getAttributeValueRequirement_NominalScaledType();

		/**
		 * The meta object literal for the '<em><b>Unknown Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE = eINSTANCE.getAttributeValueRequirement_UnknownType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_REQUIREMENT__NAME = eINSTANCE.getAttributeValueRequirement_Name();

		/**
		 * The meta object literal for the '{@link CAEX.impl.CAEXBasicObjectImpl <em>Basic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.CAEXBasicObjectImpl
		 * @see CAEX.impl.CAEXPackageImpl#getCAEXBasicObject()
		 * @generated
		 */
		EClass CAEX_BASIC_OBJECT = eINSTANCE.getCAEXBasicObject();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__DESCRIPTION = eINSTANCE.getCAEXBasicObject_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__VERSION = eINSTANCE.getCAEXBasicObject_Version();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__REVISION = eINSTANCE.getCAEXBasicObject_Revision();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__COPYRIGHT = eINSTANCE.getCAEXBasicObject_Copyright();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION = eINSTANCE.getCAEXBasicObject_AdditionalInformation();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_BASIC_OBJECT__CHANGE_MODE = eINSTANCE.getCAEXBasicObject_ChangeMode();

		/**
		 * The meta object literal for the '{@link CAEX.impl.CAEXFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.CAEXFileImpl
		 * @see CAEX.impl.CAEXPackageImpl#getCAEXFile()
		 * @generated
		 */
		EClass CAEX_FILE = eINSTANCE.getCAEXFile();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__EXTERNAL_REFERENCE = eINSTANCE.getCAEXFile_ExternalReference();

		/**
		 * The meta object literal for the '<em><b>Instance Hierarchy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__INSTANCE_HIERARCHY = eINSTANCE.getCAEXFile_InstanceHierarchy();

		/**
		 * The meta object literal for the '<em><b>Interface Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__INTERFACE_CLASS_LIB = eINSTANCE.getCAEXFile_InterfaceClassLib();

		/**
		 * The meta object literal for the '<em><b>Role Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__ROLE_CLASS_LIB = eINSTANCE.getCAEXFile_RoleClassLib();

		/**
		 * The meta object literal for the '<em><b>System Unit Class Lib</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAEX_FILE__SYSTEM_UNIT_CLASS_LIB = eINSTANCE.getCAEXFile_SystemUnitClassLib();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_FILE__FILE_NAME = eINSTANCE.getCAEXFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Schema Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_FILE__SCHEMA_VERSION = eINSTANCE.getCAEXFile_SchemaVersion();

		/**
		 * The meta object literal for the '{@link CAEX.impl.CAEXObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.CAEXObjectImpl
		 * @see CAEX.impl.CAEXPackageImpl#getCAEXObject()
		 * @generated
		 */
		EClass CAEX_OBJECT = eINSTANCE.getCAEXObject();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_OBJECT__ID = eINSTANCE.getCAEXObject_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAEX_OBJECT__NAME = eINSTANCE.getCAEXObject_Name();

		/**
		 * The meta object literal for the '{@link CAEX.impl.CopyrightImpl <em>Copyright</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.CopyrightImpl
		 * @see CAEX.impl.CAEXPackageImpl#getCopyright()
		 * @generated
		 */
		EClass COPYRIGHT = eINSTANCE.getCopyright();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT__VALUE = eINSTANCE.getCopyright_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT__CHANGE_MODE = eINSTANCE.getCopyright_ChangeMode();

		/**
		 * The meta object literal for the '{@link CAEX.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.DescriptionImpl
		 * @see CAEX.impl.CAEXPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__CHANGE_MODE = eINSTANCE.getDescription_ChangeMode();

		/**
		 * The meta object literal for the '{@link CAEX.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.DocumentRootImpl
		 * @see CAEX.impl.CAEXPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>CAEX File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CAEX_FILE = eINSTANCE.getDocumentRoot_CAEXFile();

		/**
		 * The meta object literal for the '{@link CAEX.impl.ExternalInterfaceImpl <em>External Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.ExternalInterfaceImpl
		 * @see CAEX.impl.CAEXPackageImpl#getExternalInterface()
		 * @generated
		 */
		EClass EXTERNAL_INTERFACE = eINSTANCE.getExternalInterface();

		/**
		 * The meta object literal for the '{@link CAEX.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.ExternalReferenceImpl
		 * @see CAEX.impl.CAEXPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__ALIAS = eINSTANCE.getExternalReference_Alias();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__PATH = eINSTANCE.getExternalReference_Path();

		/**
		 * The meta object literal for the '<em><b>Linked Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_REFERENCE__LINKED_MODEL = eINSTANCE.getExternalReference_LinkedModel();

		/**
		 * The meta object literal for the '{@link CAEX.impl.InstanceHierarchyImpl <em>Instance Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.InstanceHierarchyImpl
		 * @see CAEX.impl.CAEXPackageImpl#getInstanceHierarchy()
		 * @generated
		 */
		EClass INSTANCE_HIERARCHY = eINSTANCE.getInstanceHierarchy();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_HIERARCHY__INTERNAL_ELEMENT = eINSTANCE.getInstanceHierarchy_InternalElement();

		/**
		 * The meta object literal for the '{@link CAEX.impl.InterfaceClassLibImpl <em>Interface Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.InterfaceClassLibImpl
		 * @see CAEX.impl.CAEXPackageImpl#getInterfaceClassLib()
		 * @generated
		 */
		EClass INTERFACE_CLASS_LIB = eINSTANCE.getInterfaceClassLib();

		/**
		 * The meta object literal for the '<em><b>Interface Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS_LIB__INTERFACE_CLASS = eINSTANCE.getInterfaceClassLib_InterfaceClass();

		/**
		 * The meta object literal for the '{@link CAEX.impl.InterfaceClassImpl <em>Interface Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.InterfaceClassImpl
		 * @see CAEX.impl.CAEXPackageImpl#getInterfaceClass()
		 * @generated
		 */
		EClass INTERFACE_CLASS = eINSTANCE.getInterfaceClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS__ATTRIBUTE = eINSTANCE.getInterfaceClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_CLASS__REF_BASE_CLASS_PATH = eINSTANCE.getInterfaceClass_RefBaseClassPath();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS__BASE_CLASS = eINSTANCE.getInterfaceClass_BaseClass();

		/**
		 * The meta object literal for the '<em><b>Interface Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CLASS__INTERFACE_CLASS = eINSTANCE.getInterfaceClass_InterfaceClass();

		/**
		 * The meta object literal for the '{@link CAEX.impl.InterfaceFamilyImpl <em>Interface Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.InterfaceFamilyImpl
		 * @see CAEX.impl.CAEXPackageImpl#getInterfaceFamily()
		 * @generated
		 */
		EClass INTERFACE_FAMILY = eINSTANCE.getInterfaceFamily();

		/**
		 * The meta object literal for the '{@link CAEX.impl.InterfaceNameMappingImpl <em>Interface Name Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.InterfaceNameMappingImpl
		 * @see CAEX.impl.CAEXPackageImpl#getInterfaceNameMapping()
		 * @generated
		 */
		EClass INTERFACE_NAME_MAPPING = eINSTANCE.getInterfaceNameMapping();

		/**
		 * The meta object literal for the '<em><b>Role Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME = eINSTANCE.getInterfaceNameMapping_RoleInterfaceName();

		/**
		 * The meta object literal for the '<em><b>System Unit Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME = eINSTANCE.getInterfaceNameMapping_SystemUnitInterfaceName();

		/**
		 * The meta object literal for the '{@link CAEX.impl.InternalElementImpl <em>Internal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.InternalElementImpl
		 * @see CAEX.impl.CAEXPackageImpl#getInternalElement()
		 * @generated
		 */
		EClass INTERNAL_ELEMENT = eINSTANCE.getInternalElement();

		/**
		 * The meta object literal for the '<em><b>Role Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ELEMENT__ROLE_REQUIREMENTS = eINSTANCE.getInternalElement_RoleRequirements();

		/**
		 * The meta object literal for the '<em><b>Mapping Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ELEMENT__MAPPING_OBJECT = eINSTANCE.getInternalElement_MappingObject();

		/**
		 * The meta object literal for the '<em><b>Ref Base System Unit Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH = eINSTANCE.getInternalElement_RefBaseSystemUnitPath();

		/**
		 * The meta object literal for the '<em><b>Base System Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ELEMENT__BASE_SYSTEM_UNIT = eINSTANCE.getInternalElement_BaseSystemUnit();

		/**
		 * The meta object literal for the '{@link CAEX.impl.InternalLinkImpl <em>Internal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.InternalLinkImpl
		 * @see CAEX.impl.CAEXPackageImpl#getInternalLink()
		 * @generated
		 */
		EClass INTERNAL_LINK = eINSTANCE.getInternalLink();

		/**
		 * The meta object literal for the '<em><b>Ref Partner Side A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_LINK__REF_PARTNER_SIDE_A = eINSTANCE.getInternalLink_RefPartnerSideA();

		/**
		 * The meta object literal for the '<em><b>Ref Partner Side B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_LINK__REF_PARTNER_SIDE_B = eINSTANCE.getInternalLink_RefPartnerSideB();

		/**
		 * The meta object literal for the '<em><b>Partner Side A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK__PARTNER_SIDE_A = eINSTANCE.getInternalLink_PartnerSideA();

		/**
		 * The meta object literal for the '<em><b>Partner Side B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_LINK__PARTNER_SIDE_B = eINSTANCE.getInternalLink_PartnerSideB();

		/**
		 * The meta object literal for the '{@link CAEX.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.MappingImpl
		 * @see CAEX.impl.CAEXPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Attribute Name Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ATTRIBUTE_NAME_MAPPING = eINSTANCE.getMapping_AttributeNameMapping();

		/**
		 * The meta object literal for the '<em><b>Interface Name Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__INTERFACE_NAME_MAPPING = eINSTANCE.getMapping_InterfaceNameMapping();

		/**
		 * The meta object literal for the '{@link CAEX.impl.NominalScaledImpl <em>Nominal Scaled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.NominalScaledImpl
		 * @see CAEX.impl.CAEXPackageImpl#getNominalScaled()
		 * @generated
		 */
		EClass NOMINAL_SCALED = eINSTANCE.getNominalScaled();

		/**
		 * The meta object literal for the '<em><b>Required Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMINAL_SCALED__REQUIRED_VALUE = eINSTANCE.getNominalScaled_RequiredValue();

		/**
		 * The meta object literal for the '{@link CAEX.impl.OrdinalScaledImpl <em>Ordinal Scaled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.OrdinalScaledImpl
		 * @see CAEX.impl.CAEXPackageImpl#getOrdinalScaled()
		 * @generated
		 */
		EClass ORDINAL_SCALED = eINSTANCE.getOrdinalScaled();

		/**
		 * The meta object literal for the '<em><b>Required Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED__REQUIRED_MAX_VALUE = eINSTANCE.getOrdinalScaled_RequiredMaxValue();

		/**
		 * The meta object literal for the '<em><b>Required Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED__REQUIRED_VALUE = eINSTANCE.getOrdinalScaled_RequiredValue();

		/**
		 * The meta object literal for the '<em><b>Required Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDINAL_SCALED__REQUIRED_MIN_VALUE = eINSTANCE.getOrdinalScaled_RequiredMinValue();

		/**
		 * The meta object literal for the '{@link CAEX.impl.RefSemanticImpl <em>Ref Semantic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.RefSemanticImpl
		 * @see CAEX.impl.CAEXPackageImpl#getRefSemantic()
		 * @generated
		 */
		EClass REF_SEMANTIC = eINSTANCE.getRefSemantic();

		/**
		 * The meta object literal for the '<em><b>Corresponding Attribute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH = eINSTANCE.getRefSemantic_CorrespondingAttributePath();

		/**
		 * The meta object literal for the '{@link CAEX.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.RevisionImpl
		 * @see CAEX.impl.CAEXPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__REVISION_DATE = eINSTANCE.getRevision_RevisionDate();

		/**
		 * The meta object literal for the '<em><b>Old Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__OLD_VERSION = eINSTANCE.getRevision_OldVersion();

		/**
		 * The meta object literal for the '<em><b>New Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__NEW_VERSION = eINSTANCE.getRevision_NewVersion();

		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__AUTHOR_NAME = eINSTANCE.getRevision_AuthorName();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__COMMENT = eINSTANCE.getRevision_Comment();

		/**
		 * The meta object literal for the '{@link CAEX.impl.RoleClassLibImpl <em>Role Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.RoleClassLibImpl
		 * @see CAEX.impl.CAEXPackageImpl#getRoleClassLib()
		 * @generated
		 */
		EClass ROLE_CLASS_LIB = eINSTANCE.getRoleClassLib();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS_LIB__ROLE_CLASS = eINSTANCE.getRoleClassLib_RoleClass();

		/**
		 * The meta object literal for the '{@link CAEX.impl.RoleClassImpl <em>Role Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.RoleClassImpl
		 * @see CAEX.impl.CAEXPackageImpl#getRoleClass()
		 * @generated
		 */
		EClass ROLE_CLASS = eINSTANCE.getRoleClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__ATTRIBUTE = eINSTANCE.getRoleClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__EXTERNAL_INTERFACE = eINSTANCE.getRoleClass_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_CLASS__REF_BASE_CLASS_PATH = eINSTANCE.getRoleClass_RefBaseClassPath();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__BASE_CLASS = eINSTANCE.getRoleClass_BaseClass();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_CLASS__ROLE_CLASS = eINSTANCE.getRoleClass_RoleClass();

		/**
		 * The meta object literal for the '{@link CAEX.impl.RoleFamilyImpl <em>Role Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.RoleFamilyImpl
		 * @see CAEX.impl.CAEXPackageImpl#getRoleFamily()
		 * @generated
		 */
		EClass ROLE_FAMILY = eINSTANCE.getRoleFamily();

		/**
		 * The meta object literal for the '{@link CAEX.impl.RoleRequirementsImpl <em>Role Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.RoleRequirementsImpl
		 * @see CAEX.impl.CAEXPackageImpl#getRoleRequirements()
		 * @generated
		 */
		EClass ROLE_REQUIREMENTS = eINSTANCE.getRoleRequirements();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENTS__ATTRIBUTE = eINSTANCE.getRoleRequirements_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_REQUIREMENTS__EXTERNAL_INTERFACE = eINSTANCE.getRoleRequirements_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Ref Base Role Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH = eINSTANCE.getRoleRequirements_RefBaseRoleClassPath();

		/**
		 * The meta object literal for the '{@link CAEX.impl.SupportedRoleClassImpl <em>Supported Role Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.SupportedRoleClassImpl
		 * @see CAEX.impl.CAEXPackageImpl#getSupportedRoleClass()
		 * @generated
		 */
		EClass SUPPORTED_ROLE_CLASS = eINSTANCE.getSupportedRoleClass();

		/**
		 * The meta object literal for the '<em><b>Mapping Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_ROLE_CLASS__MAPPING_OBJECT = eINSTANCE.getSupportedRoleClass_MappingObject();

		/**
		 * The meta object literal for the '<em><b>Ref Role Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH = eINSTANCE.getSupportedRoleClass_RefRoleClassPath();

		/**
		 * The meta object literal for the '<em><b>Role Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_ROLE_CLASS__ROLE_CLASS = eINSTANCE.getSupportedRoleClass_RoleClass();

		/**
		 * The meta object literal for the '{@link CAEX.impl.SystemUnitClassLibImpl <em>System Unit Class Lib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.SystemUnitClassLibImpl
		 * @see CAEX.impl.CAEXPackageImpl#getSystemUnitClassLib()
		 * @generated
		 */
		EClass SYSTEM_UNIT_CLASS_LIB = eINSTANCE.getSystemUnitClassLib();

		/**
		 * The meta object literal for the '<em><b>System Unit Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitClassLib_SystemUnitClass();

		/**
		 * The meta object literal for the '{@link CAEX.impl.SystemUnitClassImpl <em>System Unit Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.SystemUnitClassImpl
		 * @see CAEX.impl.CAEXPackageImpl#getSystemUnitClass()
		 * @generated
		 */
		EClass SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitClass();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__ATTRIBUTE = eINSTANCE.getSystemUnitClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>External Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE = eINSTANCE.getSystemUnitClass_ExternalInterface();

		/**
		 * The meta object literal for the '<em><b>Internal Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT = eINSTANCE.getSystemUnitClass_InternalElement();

		/**
		 * The meta object literal for the '<em><b>Supported Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS = eINSTANCE.getSystemUnitClass_SupportedRoleClass();

		/**
		 * The meta object literal for the '<em><b>Internal Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__INTERNAL_LINK = eINSTANCE.getSystemUnitClass_InternalLink();

		/**
		 * The meta object literal for the '<em><b>Ref Base Class Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH = eINSTANCE.getSystemUnitClass_RefBaseClassPath();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__BASE_CLASS = eINSTANCE.getSystemUnitClass_BaseClass();

		/**
		 * The meta object literal for the '<em><b>System Unit Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS = eINSTANCE.getSystemUnitClass_SystemUnitClass();

		/**
		 * The meta object literal for the '{@link CAEX.impl.SystemUnitFamilyImpl <em>System Unit Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.SystemUnitFamilyImpl
		 * @see CAEX.impl.CAEXPackageImpl#getSystemUnitFamily()
		 * @generated
		 */
		EClass SYSTEM_UNIT_FAMILY = eINSTANCE.getSystemUnitFamily();

		/**
		 * The meta object literal for the '{@link CAEX.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.UnknownTypeImpl
		 * @see CAEX.impl.CAEXPackageImpl#getUnknownType()
		 * @generated
		 */
		EClass UNKNOWN_TYPE = eINSTANCE.getUnknownType();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_TYPE__REQUIREMENTS = eINSTANCE.getUnknownType_Requirements();

		/**
		 * The meta object literal for the '{@link CAEX.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.VersionImpl
		 * @see CAEX.impl.CAEXPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__VALUE = eINSTANCE.getVersion_Value();

		/**
		 * The meta object literal for the '<em><b>Change Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__CHANGE_MODE = eINSTANCE.getVersion_ChangeMode();

		/**
		 * The meta object literal for the '{@link CAEX.impl.AdditionalInformationImpl <em>Additional Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.impl.AdditionalInformationImpl
		 * @see CAEX.impl.CAEXPackageImpl#getAdditionalInformation()
		 * @generated
		 */
		EClass ADDITIONAL_INFORMATION = eINSTANCE.getAdditionalInformation();

		/**
		 * The meta object literal for the '{@link CAEX.ChangeMode <em>Change Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.ChangeMode
		 * @see CAEX.impl.CAEXPackageImpl#getChangeMode()
		 * @generated
		 */
		EEnum CHANGE_MODE = eINSTANCE.getChangeMode();

		/**
		 * The meta object literal for the '<em>Attribute Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see CAEX.impl.CAEXPackageImpl#getAttributeDataType()
		 * @generated
		 */
		EDataType ATTRIBUTE_DATA_TYPE = eINSTANCE.getAttributeDataType();

		/**
		 * The meta object literal for the '<em>Change Mode Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CAEX.ChangeMode
		 * @see CAEX.impl.CAEXPackageImpl#getChangeModeObject()
		 * @generated
		 */
		EDataType CHANGE_MODE_OBJECT = eINSTANCE.getChangeModeObject();

	}

} //CAEXPackage
