/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Platform Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.ExecutionPlatformInstance#getOwner <em>Owner</em>}</li>
 *   <li>{@link cloudml.core.ExecutionPlatformInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getExecutionPlatformInstance()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionPlatformInstance extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ComponentInstance)
	 * @see cloudml.core.CorePackage#getExecutionPlatformInstance_Owner()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getOwner();

	/**
	 * Sets the value of the '{@link cloudml.core.ExecutionPlatformInstance#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ExecutionPlatform)
	 * @see cloudml.core.CorePackage#getExecutionPlatformInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	ExecutionPlatform getType();

	/**
	 * Sets the value of the '{@link cloudml.core.ExecutionPlatformInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ExecutionPlatform value);

} // ExecutionPlatformInstance
