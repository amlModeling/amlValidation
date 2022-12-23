/**
 */
package ValidationModel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ValidationModel.ValidationExecution#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link ValidationModel.ValidationExecution#getValidationErrors <em>Validation Errors</em>}</li>
 * </ul>
 *
 * @see ValidationModel.ValidationModelPackage#getValidationExecution()
 * @model extendedMetaData="name='ValidationExecution' kind='elementOnly'"
 * @generated
 */
public interface ValidationExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time</em>' attribute.
	 * @see #setExecutionTime(Date)
	 * @see ValidationModel.ValidationModelPackage#getValidationExecution_ExecutionTime()
	 * @model
	 * @generated
	 */
	Date getExecutionTime();

	/**
	 * Sets the value of the '{@link ValidationModel.ValidationExecution#getExecutionTime <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' attribute.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(Date value);

	/**
	 * Returns the value of the '<em><b>Validation Errors</b></em>' containment reference list.
	 * The list contents are of type {@link ValidationModel.ValidationError}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Errors</em>' containment reference list.
	 * @see ValidationModel.ValidationModelPackage#getValidationExecution_ValidationErrors()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValidationError> getValidationErrors();

} // ValidationExecution
