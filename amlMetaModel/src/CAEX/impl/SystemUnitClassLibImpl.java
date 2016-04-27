/**
 */
package CAEX.impl;

import CAEX.CAEXPackage;
import CAEX.SystemUnitClass;
import CAEX.SystemUnitClassLib;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit Class Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CAEX.impl.SystemUnitClassLibImpl#getSystemUnitClass <em>System Unit Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemUnitClassLibImpl extends CAEXObjectImpl implements SystemUnitClassLib {
	/**
	 * The cached value of the '{@link #getSystemUnitClass() <em>System Unit Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitClass> systemUnitClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitClassLibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.SYSTEM_UNIT_CLASS_LIB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitClass> getSystemUnitClass() {
		if (systemUnitClass == null) {
			systemUnitClass = new EObjectContainmentEList<SystemUnitClass>(SystemUnitClass.class, this, CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS);
		}
		return systemUnitClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SystemUnitClass> getAllSystemUnitClasses() {
		EList<SystemUnitClass> ret = new BasicEList<SystemUnitClass>();
		Iterator<SystemUnitClass> it = systemUnitClass.iterator();
		
		while(it.hasNext())
		{
			ret.addAll(it.next().getAllSystemUnitClasses());				
		}
		
		return ret;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SystemUnitClass getSystemUnitClass(String name) {
		EList<SystemUnitClass> listSUC = getSystemUnitClass();
		Iterator<SystemUnitClass> itSUC = listSUC.iterator();
		SystemUnitClass ret = null;
		
		while(itSUC.hasNext())
		{
			SystemUnitClass SUC = itSUC.next();
			
			if(SUC.getName().equals(name))
			{
				ret = SUC;
				break;
			}
		}
				
		return ret;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				return ((InternalEList<?>)getSystemUnitClass()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				return getSystemUnitClass();
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
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				getSystemUnitClass().addAll((Collection<? extends SystemUnitClass>)newValue);
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
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
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
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				return systemUnitClass != null && !systemUnitClass.isEmpty();
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
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB___GET_ALL_SYSTEM_UNIT_CLASSES:
				return getAllSystemUnitClasses();
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB___GET_SYSTEM_UNIT_CLASS__STRING:
				return getSystemUnitClass((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SystemUnitClassLibImpl
