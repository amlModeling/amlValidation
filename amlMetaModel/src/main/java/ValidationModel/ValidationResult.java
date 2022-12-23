/**
 */
package ValidationModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ValidationModel.ValidationResult#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link ValidationModel.ValidationResult#getWrongElements <em>Wrong Elements</em>}</li>
 *   <li>{@link ValidationModel.ValidationResult#getWrongAttributes <em>Wrong Attributes</em>}</li>
 * </ul>
 *
 * @see ValidationModel.ValidationModelPackage#getValidationResult()
 * @model
 * @generated
 */
public interface ValidationResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 * @see #setIsValid(boolean)
	 * @see ValidationModel.ValidationModelPackage#getValidationResult_IsValid()
	 * @model
	 * @generated
	 */
	boolean isIsValid();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationResult#isIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #isIsValid()
	 * @generated
	 */
	void setIsValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Wrong Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrong Elements</em>' attribute.
	 * @see #setWrongElements(EList)
	 * @see ValidationModel.ValidationModelPackage#getValidationResult_WrongElements()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getWrongElements();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationResult#getWrongElements <em>Wrong Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrong Elements</em>' attribute.
	 * @see #getWrongElements()
	 * @generated
	 */
	void setWrongElements(EList<?> value);

	/**
	 * Returns the value of the '<em><b>Wrong Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrong Attributes</em>' attribute.
	 * @see #setWrongAttributes(EList)
	 * @see ValidationModel.ValidationModelPackage#getValidationResult_WrongAttributes()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getWrongAttributes();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationResult#getWrongAttributes <em>Wrong Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrong Attributes</em>' attribute.
	 * @see #getWrongAttributes()
	 * @generated
	 */
	void setWrongAttributes(EList<?> value);

} // ValidationResult
