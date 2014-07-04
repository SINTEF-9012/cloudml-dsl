/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.ExecuteInstance#getProvidedExecutionPlatformInstance <em>Provided Execution Platform Instance</em>}</li>
 *   <li>{@link cloudml.core.ExecuteInstance#getRequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getExecuteInstance()
 * @model
 * @generated
 */
public interface ExecuteInstance extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Provided Execution Platform Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Execution Platform Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Execution Platform Instance</em>' reference.
	 * @see #setProvidedExecutionPlatformInstance(ProvidedExecutionPlatformInstance)
	 * @see cloudml.core.CorePackage#getExecuteInstance_ProvidedExecutionPlatformInstance()
	 * @model required="true"
	 * @generated
	 */
	ProvidedExecutionPlatformInstance getProvidedExecutionPlatformInstance();

	/**
	 * Sets the value of the '{@link cloudml.core.ExecuteInstance#getProvidedExecutionPlatformInstance <em>Provided Execution Platform Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Execution Platform Instance</em>' reference.
	 * @see #getProvidedExecutionPlatformInstance()
	 * @generated
	 */
	void setProvidedExecutionPlatformInstance(ProvidedExecutionPlatformInstance value);

	/**
	 * Returns the value of the '<em><b>Required Execution Platform Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Execution Platform Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Execution Platform Instance</em>' reference.
	 * @see #setRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance)
	 * @see cloudml.core.CorePackage#getExecuteInstance_RequiredExecutionPlatformInstance()
	 * @model required="true"
	 * @generated
	 */
	RequiredExecutionPlatformInstance getRequiredExecutionPlatformInstance();

	/**
	 * Sets the value of the '{@link cloudml.core.ExecuteInstance#getRequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Execution Platform Instance</em>' reference.
	 * @see #getRequiredExecutionPlatformInstance()
	 * @generated
	 */
	void setRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance value);

} // ExecuteInstance
