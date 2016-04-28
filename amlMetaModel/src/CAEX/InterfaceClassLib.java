/**
 */
package CAEX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CAEX.InterfaceClassLib#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 *
 * @see CAEX.CAEXPackage#getInterfaceClassLib()
 * @model extendedMetaData="name='InterfaceClassLib' kind='elementOnly'"
 * @generated
 */
public interface InterfaceClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class definition for interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getInterfaceClassLib_InterfaceClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfaceClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceClass> getInterfaceClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	InterfaceClass getInterfaceClass(String name);

} // InterfaceClassLib
