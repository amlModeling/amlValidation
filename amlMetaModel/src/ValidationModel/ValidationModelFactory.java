/**
 */
package ValidationModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ValidationModel.ValidationModelPackage
 * @generated
 */
public interface ValidationModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationModelFactory eINSTANCE = ValidationModel.impl.ValidationModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Validation Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Error</em>'.
	 * @generated
	 */
	ValidationError createValidationError();

	/**
	 * Returns a new object of class '<em>Validation Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Execution</em>'.
	 * @generated
	 */
	ValidationExecution createValidationExecution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValidationModelPackage getValidationModelPackage();

} //ValidationModelFactory
