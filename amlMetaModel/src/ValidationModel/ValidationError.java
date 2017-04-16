/**
 */
package ValidationModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ValidationModel.ValidationError#getModelFileName <em>Model File Name</em>}</li>
 *   <li>{@link ValidationModel.ValidationError#getExpectedValue <em>Expected Value</em>}</li>
 *   <li>{@link ValidationModel.ValidationError#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link ValidationModel.ValidationError#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link ValidationModel.ValidationError#getAdditionalInformation <em>Additional Information</em>}</li>
 * </ul>
 *
 * @see ValidationModel.ValidationModelPackage#getValidationError()
 * @model extendedMetaData="name='ValidationError' kind='simple'"
 * @generated
 */
public interface ValidationError extends EObject {
	/**
	 * Returns the value of the '<em><b>Model File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model File Name</em>' attribute.
	 * @see #setModelFileName(String)
	 * @see ValidationModel.ValidationModelPackage#getValidationError_ModelFileName()
	 * @model
	 * @generated
	 */
	String getModelFileName();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationError#getModelFileName <em>Model File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model File Name</em>' attribute.
	 * @see #getModelFileName()
	 * @generated
	 */
	void setModelFileName(String value);

	/**
	 * Returns the value of the '<em><b>Expected Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Value</em>' attribute.
	 * @see #setExpectedValue(String)
	 * @see ValidationModel.ValidationModelPackage#getValidationError_ExpectedValue()
	 * @model
	 * @generated
	 */
	String getExpectedValue();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationError#getExpectedValue <em>Expected Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Value</em>' attribute.
	 * @see #getExpectedValue()
	 * @generated
	 */
	void setExpectedValue(String value);

	/**
	 * Returns the value of the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Value</em>' attribute.
	 * @see #setActualValue(String)
	 * @see ValidationModel.ValidationModelPackage#getValidationError_ActualValue()
	 * @model
	 * @generated
	 */
	String getActualValue();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationError#getActualValue <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' attribute.
	 * @see #getActualValue()
	 * @generated
	 */
	void setActualValue(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Name</em>' attribute.
	 * @see #setConstraintName(String)
	 * @see ValidationModel.ValidationModelPackage#getValidationError_ConstraintName()
	 * @model
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationError#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information</em>' attribute.
	 * @see #setAdditionalInformation(String)
	 * @see ValidationModel.ValidationModelPackage#getValidationError_AdditionalInformation()
	 * @model
	 * @generated
	 */
	String getAdditionalInformation();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationError#getAdditionalInformation <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' attribute.
	 * @see #getAdditionalInformation()
	 * @generated
	 */
	void setAdditionalInformation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	@Override
	boolean equals(Object obj);

} // ValidationError
