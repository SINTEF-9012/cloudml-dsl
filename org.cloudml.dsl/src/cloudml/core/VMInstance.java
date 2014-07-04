/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.VMInstance#getProvided <em>Provided</em>}</li>
 *   <li>{@link cloudml.core.VMInstance#getPublicAddress <em>Public Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getVMInstance()
 * @model
 * @generated
 */
public interface VMInstance extends ExternalComponentInstance {
	/**
	 * Returns the value of the '<em><b>Provided</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.VMPortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getVMInstance_Provided()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMPortInstance> getProvided();

	/**
	 * Returns the value of the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Address</em>' attribute.
	 * @see #setPublicAddress(String)
	 * @see cloudml.core.CorePackage#getVMInstance_PublicAddress()
	 * @model
	 * @generated
	 */
	String getPublicAddress();

	/**
	 * Sets the value of the '{@link cloudml.core.VMInstance#getPublicAddress <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Address</em>' attribute.
	 * @see #getPublicAddress()
	 * @generated
	 */
	void setPublicAddress(String value);

} // VMInstance
