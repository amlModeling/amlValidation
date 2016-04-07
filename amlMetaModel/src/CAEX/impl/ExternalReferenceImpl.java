/**
 */
package CAEX.impl;

import CAEX.CAEXFile;
import CAEX.CAEXPackage;
import CAEX.ExternalReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CAEX.impl.ExternalReferenceImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link CAEX.impl.ExternalReferenceImpl#getPath <em>Path</em>}</li>
 *   <li>{@link CAEX.impl.ExternalReferenceImpl#getLinkedModel <em>Linked Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalReferenceImpl extends CAEXBasicObjectImpl implements ExternalReference {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkedModel() <em>Linked Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedModel()
	 * @generated
	 * @ordered
	 */
	protected CAEXFile linkedModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.EXTERNAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.EXTERNAL_REFERENCE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.EXTERNAL_REFERENCE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile getLinkedModel() {
		if (linkedModel != null && linkedModel.eIsProxy()) {
			InternalEObject oldLinkedModel = (InternalEObject)linkedModel;
			linkedModel = (CAEXFile)eResolveProxy(oldLinkedModel);
			if (linkedModel != oldLinkedModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.EXTERNAL_REFERENCE__LINKED_MODEL, oldLinkedModel, linkedModel));
			}
		}
		return linkedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFile basicGetLinkedModel() {
		return linkedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedModel(CAEXFile newLinkedModel) {
		CAEXFile oldLinkedModel = linkedModel;
		linkedModel = newLinkedModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.EXTERNAL_REFERENCE__LINKED_MODEL, oldLinkedModel, linkedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.EXTERNAL_REFERENCE__ALIAS:
				return getAlias();
			case CAEXPackage.EXTERNAL_REFERENCE__PATH:
				return getPath();
			case CAEXPackage.EXTERNAL_REFERENCE__LINKED_MODEL:
				if (resolve) return getLinkedModel();
				return basicGetLinkedModel();
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
			case CAEXPackage.EXTERNAL_REFERENCE__ALIAS:
				setAlias((String)newValue);
				return;
			case CAEXPackage.EXTERNAL_REFERENCE__PATH:
				setPath((String)newValue);
				return;
			case CAEXPackage.EXTERNAL_REFERENCE__LINKED_MODEL:
				setLinkedModel((CAEXFile)newValue);
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
			case CAEXPackage.EXTERNAL_REFERENCE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case CAEXPackage.EXTERNAL_REFERENCE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CAEXPackage.EXTERNAL_REFERENCE__LINKED_MODEL:
				setLinkedModel((CAEXFile)null);
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
			case CAEXPackage.EXTERNAL_REFERENCE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case CAEXPackage.EXTERNAL_REFERENCE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CAEXPackage.EXTERNAL_REFERENCE__LINKED_MODEL:
				return linkedModel != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alias: ");
		result.append(alias);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //ExternalReferenceImpl
