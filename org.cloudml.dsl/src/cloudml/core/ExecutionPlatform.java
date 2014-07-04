/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.ExecutionPlatform#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getExecutionPlatform()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionPlatform extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Component)
	 * @see cloudml.core.CorePackage#getExecutionPlatform_Owner()
	 * @model required="true"
	 * @generated
	 */
	Component getOwner();

	/**
	 * Sets the value of the '{@link cloudml.core.ExecutionPlatform#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Component value);

} // ExecutionPlatform
