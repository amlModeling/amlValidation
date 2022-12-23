/**
 */
package ValidationModel.impl;

import ValidationModel.ValidationModelPackage;
import ValidationModel.ValidationResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ValidationModel.impl.ValidationResultImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link ValidationModel.impl.ValidationResultImpl#getWrongElements <em>Wrong Elements</em>}</li>
 *   <li>{@link ValidationModel.impl.ValidationResultImpl#getWrongAttributes <em>Wrong Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationResultImpl extends MinimalEObjectImpl.Container implements ValidationResult {
	/**
	 * The default value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected boolean isValid = IS_VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWrongElements() <em>Wrong Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrongElements()
	 * @generated
	 * @ordered
	 */
	protected EList<?> wrongElements;

	/**
	 * The cached value of the '{@link #getWrongAttributes() <em>Wrong Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrongAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<?> wrongAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationModelPackage.Literals.VALIDATION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsValid() {
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsValid(boolean newIsValid) {
		boolean oldIsValid = isValid;
		isValid = newIsValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_RESULT__IS_VALID, oldIsValid, isValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<?> getWrongElements() {
		return wrongElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrongElements(EList<?> newWrongElements) {
		EList<?> oldWrongElements = wrongElements;
		wrongElements = newWrongElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_RESULT__WRONG_ELEMENTS, oldWrongElements, wrongElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<?> getWrongAttributes() {
		return wrongAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrongAttributes(EList<?> newWrongAttributes) {
		EList<?> oldWrongAttributes = wrongAttributes;
		wrongAttributes = newWrongAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_RESULT__WRONG_ATTRIBUTES, oldWrongAttributes, wrongAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationModelPackage.VALIDATION_RESULT__IS_VALID:
				return isIsValid();
			case ValidationModelPackage.VALIDATION_RESULT__WRONG_ELEMENTS:
				return getWrongElements();
			case ValidationModelPackage.VALIDATION_RESULT__WRONG_ATTRIBUTES:
				return getWrongAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValidationModelPackage.VALIDATION_RESULT__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case ValidationModelPackage.VALIDATION_RESULT__WRONG_ELEMENTS:
				setWrongElements((EList<?>)newValue);
				return;
			case ValidationModelPackage.VALIDATION_RESULT__WRONG_ATTRIBUTES:
				setWrongAttributes((EList<?>)newValue);
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
			case ValidationModelPackage.VALIDATION_RESULT__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case ValidationModelPackage.VALIDATION_RESULT__WRONG_ELEMENTS:
				setWrongElements((EList<?>)null);
				return;
			case ValidationModelPackage.VALIDATION_RESULT__WRONG_ATTRIBUTES:
				setWrongAttributes((EList<?>)null);
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
			case ValidationModelPackage.VALIDATION_RESULT__IS_VALID:
				return isValid != IS_VALID_EDEFAULT;
			case ValidationModelPackage.VALIDATION_RESULT__WRONG_ELEMENTS:
				return wrongElements != null;
			case ValidationModelPackage.VALIDATION_RESULT__WRONG_ATTRIBUTES:
				return wrongAttributes != null;
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
		result.append(" (isValid: ");
		result.append(isValid);
		result.append(", wrongElements: ");
		result.append(wrongElements);
		result.append(", wrongAttributes: ");
		result.append(wrongAttributes);
		result.append(')');
		return result.toString();
	}

} //ValidationResultImpl
