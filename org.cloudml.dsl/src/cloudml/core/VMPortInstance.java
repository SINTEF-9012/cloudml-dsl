/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VM Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.VMPortInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getVMPortInstance()
 * @model
 * @generated
 */
public interface VMPortInstance extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(VMPort)
	 * @see cloudml.core.CorePackage#getVMPortInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	VMPort getType();

	/**
	 * Sets the value of the '{@link cloudml.core.VMPortInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VMPort value);

} // VMPortInstance
