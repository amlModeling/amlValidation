/**
 */
package ValidationModel.impl;

import ValidationModel.ValidationError;
import ValidationModel.ValidationModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ValidationModel.impl.ValidationErrorImpl#getModelFileName <em>Model File Name</em>}</li>
 *   <li>{@link ValidationModel.impl.ValidationErrorImpl#getExpectedValue <em>Expected Value</em>}</li>
 *   <li>{@link ValidationModel.impl.ValidationErrorImpl#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link ValidationModel.impl.ValidationErrorImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link ValidationModel.impl.ValidationErrorImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationErrorImpl extends MinimalEObjectImpl.Container implements ValidationError {
	/**
	 * The default value of the '{@link #getModelFileName() <em>Model File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFileName() <em>Model File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFileName()
	 * @generated
	 * @ordered
	 */
	protected String modelFileName = MODEL_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedValue() <em>Expected Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedValue() <em>Expected Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedValue()
	 * @generated
	 * @ordered
	 */
	protected String expectedValue = EXPECTED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
	protected String actualValue = ACTUAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintName()
	 * @generated
	 * @ordered
	 */
	protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected String additionalInformation = ADDITIONAL_INFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationModelPackage.Literals.VALIDATION_ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelFileName() {
		return modelFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelFileName(String newModelFileName) {
		String oldModelFileName = modelFileName;
		modelFileName = newModelFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_ERROR__MODEL_FILE_NAME, oldModelFileName, modelFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpectedValue() {
		return expectedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedValue(String newExpectedValue) {
		String oldExpectedValue = expectedValue;
		expectedValue = newExpectedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_ERROR__EXPECTED_VALUE, oldExpectedValue, expectedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActualValue() {
		return actualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualValue(String newActualValue) {
		String oldActualValue = actualValue;
		actualValue = newActualValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_ERROR__ACTUAL_VALUE, oldActualValue, actualValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintName(String newConstraintName) {
		String oldConstraintName = constraintName;
		constraintName = newConstraintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_ERROR__CONSTRAINT_NAME, oldConstraintName, constraintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalInformation(String newAdditionalInformation) {
		String oldAdditionalInformation = additionalInformation;
		additionalInformation = newAdditionalInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationModelPackage.VALIDATION_ERROR__ADDITIONAL_INFORMATION, oldAdditionalInformation, additionalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ValidationError))
			 return false;
		 if (obj == this)
	         return true;		
		 
		 ValidationError rhs = (ValidationError) obj;
		 
		 //Hier kommt die Fehlermeldung vom SAX-Parser - vermutlich abhängig von Spracheinstellungen, etc.
		 //deshalb geben wir uns in dem Fall mit dieser Prüfung zufrieden
		/*
		 if(this.getModelFileName().equals(rhs.getModelFileName()) &&
		    this.getConstraintName().equals(rhs.getConstraintName()) &&
		    this.getConstraintName().equals("CAEX Schema Validation"))
				 return true;
				 */
		 
		 return this.getModelFileName().equals(rhs.getModelFileName()) &&
				this.getConstraintName().equals(rhs.getConstraintName()) &&
				this.getAdditionalInformation().equals(rhs.getAdditionalInformation()) &&
				this.getExpectedValue().equals(rhs.getExpectedValue()) && 
				this.getActualValue().equals(rhs.getActualValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationModelPackage.VALIDATION_ERROR__MODEL_FILE_NAME:
				return getModelFileName();
			case ValidationModelPackage.VALIDATION_ERROR__EXPECTED_VALUE:
				return getExpectedValue();
			case ValidationModelPackage.VALIDATION_ERROR__ACTUAL_VALUE:
				return getActualValue();
			case ValidationModelPackage.VALIDATION_ERROR__CONSTRAINT_NAME:
				return getConstraintName();
			case ValidationModelPackage.VALIDATION_ERROR__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
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
			case ValidationModelPackage.VALIDATION_ERROR__MODEL_FILE_NAME:
				setModelFileName((String)newValue);
				return;
			case ValidationModelPackage.VALIDATION_ERROR__EXPECTED_VALUE:
				setExpectedValue((String)newValue);
				return;
			case ValidationModelPackage.VALIDATION_ERROR__ACTUAL_VALUE:
				setActualValue((String)newValue);
				return;
			case ValidationModelPackage.VALIDATION_ERROR__CONSTRAINT_NAME:
				setConstraintName((String)newValue);
				return;
			case ValidationModelPackage.VALIDATION_ERROR__ADDITIONAL_INFORMATION:
				setAdditionalInformation((String)newValue);
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
			case ValidationModelPackage.VALIDATION_ERROR__MODEL_FILE_NAME:
				setModelFileName(MODEL_FILE_NAME_EDEFAULT);
				return;
			case ValidationModelPackage.VALIDATION_ERROR__EXPECTED_VALUE:
				setExpectedValue(EXPECTED_VALUE_EDEFAULT);
				return;
			case ValidationModelPackage.VALIDATION_ERROR__ACTUAL_VALUE:
				setActualValue(ACTUAL_VALUE_EDEFAULT);
				return;
			case ValidationModelPackage.VALIDATION_ERROR__CONSTRAINT_NAME:
				setConstraintName(CONSTRAINT_NAME_EDEFAULT);
				return;
			case ValidationModelPackage.VALIDATION_ERROR__ADDITIONAL_INFORMATION:
				setAdditionalInformation(ADDITIONAL_INFORMATION_EDEFAULT);
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
			case ValidationModelPackage.VALIDATION_ERROR__MODEL_FILE_NAME:
				return MODEL_FILE_NAME_EDEFAULT == null ? modelFileName != null : !MODEL_FILE_NAME_EDEFAULT.equals(modelFileName);
			case ValidationModelPackage.VALIDATION_ERROR__EXPECTED_VALUE:
				return EXPECTED_VALUE_EDEFAULT == null ? expectedValue != null : !EXPECTED_VALUE_EDEFAULT.equals(expectedValue);
			case ValidationModelPackage.VALIDATION_ERROR__ACTUAL_VALUE:
				return ACTUAL_VALUE_EDEFAULT == null ? actualValue != null : !ACTUAL_VALUE_EDEFAULT.equals(actualValue);
			case ValidationModelPackage.VALIDATION_ERROR__CONSTRAINT_NAME:
				return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
			case ValidationModelPackage.VALIDATION_ERROR__ADDITIONAL_INFORMATION:
				return ADDITIONAL_INFORMATION_EDEFAULT == null ? additionalInformation != null : !ADDITIONAL_INFORMATION_EDEFAULT.equals(additionalInformation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ValidationModelPackage.VALIDATION_ERROR___EQUALS__OBJECT:
				return equals(arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ModelFileName: ");
		result.append(modelFileName);
		result.append(", ExpectedValue: ");
		result.append(expectedValue);
		result.append(", ActualValue: ");
		result.append(actualValue);
		result.append(", ConstraintName: ");
		result.append(constraintName);
		result.append(", AdditionalInformation: ");
		result.append(additionalInformation);
		result.append(')');
		return result.toString();
	}

} //ValidationErrorImpl
