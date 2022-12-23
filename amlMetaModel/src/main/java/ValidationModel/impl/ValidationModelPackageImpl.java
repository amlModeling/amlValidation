/**
 */
package ValidationModel.impl;

import ValidationModel.ValidationError;
import ValidationModel.ValidationExecution;
import ValidationModel.ValidationModelFactory;
import ValidationModel.ValidationModelPackage;

import ValidationModel.ValidationResult;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationModelPackageImpl extends EPackageImpl implements ValidationModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationResultEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ValidationModel.ValidationModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValidationModelPackageImpl() {
		super(eNS_URI, ValidationModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ValidationModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValidationModelPackage init() {
		if (isInited) return (ValidationModelPackage)EPackage.Registry.INSTANCE.getEPackage(ValidationModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredValidationModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ValidationModelPackageImpl theValidationModelPackage = registeredValidationModelPackage instanceof ValidationModelPackageImpl ? (ValidationModelPackageImpl)registeredValidationModelPackage : new ValidationModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theValidationModelPackage.createPackageContents();

		// Initialize created meta-data
		theValidationModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValidationModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValidationModelPackage.eNS_URI, theValidationModelPackage);
		return theValidationModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationError() {
		return validationErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationError_ModelFileName() {
		return (EAttribute)validationErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationError_ExpectedValue() {
		return (EAttribute)validationErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationError_ActualValue() {
		return (EAttribute)validationErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationError_ConstraintName() {
		return (EAttribute)validationErrorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationError_AdditionalInformation() {
		return (EAttribute)validationErrorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidationError__Equals__Object() {
		return validationErrorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationExecution() {
		return validationExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationExecution_ExecutionTime() {
		return (EAttribute)validationExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationExecution_ValidationErrors() {
		return (EReference)validationExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationResult() {
		return validationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationResult_IsValid() {
		return (EAttribute)validationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationResult_WrongElements() {
		return (EAttribute)validationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidationResult_WrongAttributes() {
		return (EAttribute)validationResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationModelFactory getValidationModelFactory() {
		return (ValidationModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		validationErrorEClass = createEClass(VALIDATION_ERROR);
		createEAttribute(validationErrorEClass, VALIDATION_ERROR__MODEL_FILE_NAME);
		createEAttribute(validationErrorEClass, VALIDATION_ERROR__EXPECTED_VALUE);
		createEAttribute(validationErrorEClass, VALIDATION_ERROR__ACTUAL_VALUE);
		createEAttribute(validationErrorEClass, VALIDATION_ERROR__CONSTRAINT_NAME);
		createEAttribute(validationErrorEClass, VALIDATION_ERROR__ADDITIONAL_INFORMATION);
		createEOperation(validationErrorEClass, VALIDATION_ERROR___EQUALS__OBJECT);

		validationExecutionEClass = createEClass(VALIDATION_EXECUTION);
		createEAttribute(validationExecutionEClass, VALIDATION_EXECUTION__EXECUTION_TIME);
		createEReference(validationExecutionEClass, VALIDATION_EXECUTION__VALIDATION_ERRORS);

		validationResultEClass = createEClass(VALIDATION_RESULT);
		createEAttribute(validationResultEClass, VALIDATION_RESULT__IS_VALID);
		createEAttribute(validationResultEClass, VALIDATION_RESULT__WRONG_ELEMENTS);
		createEAttribute(validationResultEClass, VALIDATION_RESULT__WRONG_ATTRIBUTES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(validationErrorEClass, ValidationError.class, "ValidationError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationError_ModelFileName(), ecorePackage.getEString(), "ModelFileName", null, 0, 1, ValidationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationError_ExpectedValue(), ecorePackage.getEString(), "ExpectedValue", null, 0, 1, ValidationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationError_ActualValue(), ecorePackage.getEString(), "ActualValue", null, 0, 1, ValidationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationError_ConstraintName(), ecorePackage.getEString(), "ConstraintName", null, 0, 1, ValidationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidationError_AdditionalInformation(), ecorePackage.getEString(), "AdditionalInformation", null, 0, 1, ValidationError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getValidationError__Equals__Object(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(validationExecutionEClass, ValidationExecution.class, "ValidationExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationExecution_ExecutionTime(), ecorePackage.getEDate(), "ExecutionTime", null, 0, 1, ValidationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationExecution_ValidationErrors(), this.getValidationError(), null, "ValidationErrors", null, 0, -1, ValidationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationResultEClass, ValidationResult.class, "ValidationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidationResult_IsValid(), ecorePackage.getEBoolean(), "isValid", null, 0, 1, ValidationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getValidationResult_WrongElements(), g1, "wrongElements", null, 0, 1, ValidationResult.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getValidationResult_WrongAttributes(), g1, "wrongAttributes", null, 0, 1, ValidationResult.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (validationErrorEClass,
		   source,
		   new String[] {
			   "name", "ValidationError",
			   "kind", "simple"
		   });
		addAnnotation
		  (validationExecutionEClass,
		   source,
		   new String[] {
			   "name", "ValidationExecution",
			   "kind", "elementOnly"
		   });
	}

} //ValidationModelPackageImpl
