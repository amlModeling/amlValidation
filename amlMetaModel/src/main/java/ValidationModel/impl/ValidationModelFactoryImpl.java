/**
 */
package ValidationModel.impl;

import ValidationModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationModelFactoryImpl extends EFactoryImpl implements ValidationModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValidationModelFactory init() {
		try {
			ValidationModelFactory theValidationModelFactory = (ValidationModelFactory)EPackage.Registry.INSTANCE.getEFactory(ValidationModelPackage.eNS_URI);
			if (theValidationModelFactory != null) {
				return theValidationModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValidationModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ValidationModelPackage.VALIDATION_ERROR: return createValidationError();
			case ValidationModelPackage.VALIDATION_EXECUTION: return createValidationExecution();
			case ValidationModelPackage.VALIDATION_RESULT: return createValidationResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationError createValidationError() {
		ValidationErrorImpl validationError = new ValidationErrorImpl();
		return validationError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationExecution createValidationExecution() {
		ValidationExecutionImpl validationExecution = new ValidationExecutionImpl();
		return validationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationResult createValidationResult() {
		ValidationResultImpl validationResult = new ValidationResultImpl();
		return validationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationModelPackage getValidationModelPackage() {
		return (ValidationModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValidationModelPackage getPackage() {
		return ValidationModelPackage.eINSTANCE;
	}

} //ValidationModelFactoryImpl
