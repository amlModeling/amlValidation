/**
 */
package ValidationModel.impl;

import ValidationModel.ValidationError;
import ValidationModel.ValidationExecution;
import ValidationModel.ValidationModelPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ValidationModel.impl.ValidationExecutionImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link ValidationModel.impl.ValidationExecutionImpl#getValidationErrors <em>Validation Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationExecutionImpl extends MinimalEObjectImpl.Container implements ValidationExecution {
	/**
	 * The default value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXECUTION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected Date executionTime = EXECUTION_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValidationErrors() <em>Validation Errors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationErrors()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidationError> validationErrors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationModelPackage.Literals.VALIDATION_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ValidationError> getValidationErrors() {
		if (validationErrors == null) {
			validationErrors = new EObjectContainmentEList<ValidationError>(ValidationError.class, this, ValidationModelPackage.VALIDATION_EXECUTION__VALIDATION_ERRORS)
			{
				@Override 
				protected boolean useEquals(){
					return true;
				}				
			};
		}
		return validationErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValidationModelPackage.VALIDATION_EXECUTION__VALIDATION_ERRORS:
				return ((InternalEList<?>)getValidationErrors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExecutionTime() {
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionTime(Date newExecutionTime) {
		Date oldExecutionTime = executionTime;
		executionTime = newExecutionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_EXECUTION__EXECUTION_TIME, oldExecutionTime, executionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationModelPackage.VALIDATION_EXECUTION__EXECUTION_TIME:
				return getExecutionTime();
			case ValidationModelPackage.VALIDATION_EXECUTION__VALIDATION_ERRORS:
				return getValidationErrors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValidationModelPackage.VALIDATION_EXECUTION__EXECUTION_TIME:
				setExecutionTime((Date)newValue);
				return;
			case ValidationModelPackage.VALIDATION_EXECUTION__VALIDATION_ERRORS:
				getValidationErrors().clear();
				getValidationErrors().addAll((Collection<? extends ValidationError>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ValidationModelPackage.VALIDATION_EXECUTION__EXECUTION_TIME:
				setExecutionTime(EXECUTION_TIME_EDEFAULT);
				return;
			case ValidationModelPackage.VALIDATION_EXECUTION__VALIDATION_ERRORS:
				getValidationErrors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ValidationModelPackage.VALIDATION_EXECUTION__EXECUTION_TIME:
				return EXECUTION_TIME_EDEFAULT == null ? executionTime != null : !EXECUTION_TIME_EDEFAULT.equals(executionTime);
			case ValidationModelPackage.VALIDATION_EXECUTION__VALIDATION_ERRORS:
				return validationErrors != null && !validationErrors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ExecutionTime: ");
		result.append(executionTime);
		result.append(')');
		return result.toString();
	}

} //ValidationExecutionImpl
