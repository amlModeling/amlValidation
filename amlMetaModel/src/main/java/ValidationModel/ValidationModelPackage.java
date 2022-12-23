/**
 */
package ValidationModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ValidationModel.ValidationModelFactory
 * @model kind="package"
 * @generated
 */
public interface ValidationModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ValidationModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ValidationModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ValidationModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationModelPackage eINSTANCE = ValidationModel.impl.ValidationModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ValidationModel.impl.ValidationErrorImpl <em>Validation Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ValidationModel.impl.ValidationErrorImpl
	 * @see ValidationModel.impl.ValidationModelPackageImpl#getValidationError()
	 * @generated
	 */
	int VALIDATION_ERROR = 0;

	/**
	 * The feature id for the '<em><b>Model File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR__MODEL_FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Expected Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR__EXPECTED_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR__ACTUAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR__CONSTRAINT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR__ADDITIONAL_INFORMATION = 4;

	/**
	 * The number of structural features of the '<em>Validation Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR___EQUALS__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Validation Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ValidationModel.impl.ValidationExecutionImpl <em>Validation Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ValidationModel.impl.ValidationExecutionImpl
	 * @see ValidationModel.impl.ValidationModelPackageImpl#getValidationExecution()
	 * @generated
	 */
	int VALIDATION_EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_EXECUTION__EXECUTION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Validation Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_EXECUTION__VALIDATION_ERRORS = 1;

	/**
	 * The number of structural features of the '<em>Validation Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_EXECUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Validation Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_EXECUTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ValidationModel.impl.ValidationResultImpl <em>Validation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ValidationModel.impl.ValidationResultImpl
	 * @see ValidationModel.impl.ValidationModelPackageImpl#getValidationResult()
	 * @generated
	 */
	int VALIDATION_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT__IS_VALID = 0;

	/**
	 * The feature id for the '<em><b>Wrong Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT__WRONG_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Wrong Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT__WRONG_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Validation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Validation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RESULT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ValidationModel.ValidationError <em>Validation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Error</em>'.
	 * @see ValidationModel.ValidationError
	 * @generated
	 */
	EClass getValidationError();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationError#getModelFileName <em>Model File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model File Name</em>'.
	 * @see ValidationModel.ValidationError#getModelFileName()
	 * @see #getValidationError()
	 * @generated
	 */
	EAttribute getValidationError_ModelFileName();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationError#getExpectedValue <em>Expected Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Value</em>'.
	 * @see ValidationModel.ValidationError#getExpectedValue()
	 * @see #getValidationError()
	 * @generated
	 */
	EAttribute getValidationError_ExpectedValue();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationError#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Value</em>'.
	 * @see ValidationModel.ValidationError#getActualValue()
	 * @see #getValidationError()
	 * @generated
	 */
	EAttribute getValidationError_ActualValue();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationError#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see ValidationModel.ValidationError#getConstraintName()
	 * @see #getValidationError()
	 * @generated
	 */
	EAttribute getValidationError_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationError#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Information</em>'.
	 * @see ValidationModel.ValidationError#getAdditionalInformation()
	 * @see #getValidationError()
	 * @generated
	 */
	EAttribute getValidationError_AdditionalInformation();

	/**
	 * Returns the meta object for the '{@link ValidationModel.ValidationError#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see ValidationModel.ValidationError#equals(java.lang.Object)
	 * @generated
	 */
	EOperation getValidationError__Equals__Object();

	/**
	 * Returns the meta object for class '{@link ValidationModel.ValidationExecution <em>Validation Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Execution</em>'.
	 * @see ValidationModel.ValidationExecution
	 * @generated
	 */
	EClass getValidationExecution();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationExecution#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time</em>'.
	 * @see ValidationModel.ValidationExecution#getExecutionTime()
	 * @see #getValidationExecution()
	 * @generated
	 */
	EAttribute getValidationExecution_ExecutionTime();

	/**
	 * Returns the meta object for the containment reference list '{@link ValidationModel.ValidationExecution#getValidationErrors <em>Validation Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation Errors</em>'.
	 * @see ValidationModel.ValidationExecution#getValidationErrors()
	 * @see #getValidationExecution()
	 * @generated
	 */
	EReference getValidationExecution_ValidationErrors();

	/**
	 * Returns the meta object for class '{@link ValidationModel.ValidationResult <em>Validation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Result</em>'.
	 * @see ValidationModel.ValidationResult
	 * @generated
	 */
	EClass getValidationResult();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationResult#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see ValidationModel.ValidationResult#isIsValid()
	 * @see #getValidationResult()
	 * @generated
	 */
	EAttribute getValidationResult_IsValid();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationResult#getWrongElements <em>Wrong Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrong Elements</em>'.
	 * @see ValidationModel.ValidationResult#getWrongElements()
	 * @see #getValidationResult()
	 * @generated
	 */
	EAttribute getValidationResult_WrongElements();

	/**
	 * Returns the meta object for the attribute '{@link ValidationModel.ValidationResult#getWrongAttributes <em>Wrong Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrong Attributes</em>'.
	 * @see ValidationModel.ValidationResult#getWrongAttributes()
	 * @see #getValidationResult()
	 * @generated
	 */
	EAttribute getValidationResult_WrongAttributes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidationModelFactory getValidationModelFactory();

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
		 * The meta object literal for the '{@link ValidationModel.impl.ValidationErrorImpl <em>Validation Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ValidationModel.impl.ValidationErrorImpl
		 * @see ValidationModel.impl.ValidationModelPackageImpl#getValidationError()
		 * @generated
		 */
		EClass VALIDATION_ERROR = eINSTANCE.getValidationError();

		/**
		 * The meta object literal for the '<em><b>Model File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR__MODEL_FILE_NAME = eINSTANCE.getValidationError_ModelFileName();

		/**
		 * The meta object literal for the '<em><b>Expected Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR__EXPECTED_VALUE = eINSTANCE.getValidationError_ExpectedValue();

		/**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR__ACTUAL_VALUE = eINSTANCE.getValidationError_ActualValue();

		/**
		 * The meta object literal for the '<em><b>Constraint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR__CONSTRAINT_NAME = eINSTANCE.getValidationError_ConstraintName();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR__ADDITIONAL_INFORMATION = eINSTANCE.getValidationError_AdditionalInformation();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATION_ERROR___EQUALS__OBJECT = eINSTANCE.getValidationError__Equals__Object();

		/**
		 * The meta object literal for the '{@link ValidationModel.impl.ValidationExecutionImpl <em>Validation Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ValidationModel.impl.ValidationExecutionImpl
		 * @see ValidationModel.impl.ValidationModelPackageImpl#getValidationExecution()
		 * @generated
		 */
		EClass VALIDATION_EXECUTION = eINSTANCE.getValidationExecution();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_EXECUTION__EXECUTION_TIME = eINSTANCE.getValidationExecution_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Validation Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_EXECUTION__VALIDATION_ERRORS = eINSTANCE.getValidationExecution_ValidationErrors();

		/**
		 * The meta object literal for the '{@link ValidationModel.impl.ValidationResultImpl <em>Validation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ValidationModel.impl.ValidationResultImpl
		 * @see ValidationModel.impl.ValidationModelPackageImpl#getValidationResult()
		 * @generated
		 */
		EClass VALIDATION_RESULT = eINSTANCE.getValidationResult();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RESULT__IS_VALID = eINSTANCE.getValidationResult_IsValid();

		/**
		 * The meta object literal for the '<em><b>Wrong Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RESULT__WRONG_ELEMENTS = eINSTANCE.getValidationResult_WrongElements();

		/**
		 * The meta object literal for the '<em><b>Wrong Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_RESULT__WRONG_ATTRIBUTES = eINSTANCE.getValidationResult_WrongAttributes();

	}

} //ValidationModelPackage
