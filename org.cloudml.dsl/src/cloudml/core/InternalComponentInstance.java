/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.InternalComponentInstance#getRequiredPortInstances <em>Required Port Instances</em>}</li>
 *   <li>{@link cloudml.core.InternalComponentInstance#getRequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getInternalComponentInstance()
 * @model
 * @generated
 */
public interface InternalComponentInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Required Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.RequiredPortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Port Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Port Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getInternalComponentInstance_RequiredPortInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredPortInstance> getRequiredPortInstances();

	/**
	 * Returns the value of the '<em><b>Required Execution Platform Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Execution Platform Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Execution Platform Instance</em>' containment reference.
	 * @see #setRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance)
	 * @see cloudml.core.CorePackage#getInternalComponentInstance_RequiredExecutionPlatformInstance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RequiredExecutionPlatformInstance getRequiredExecutionPlatformInstance();

	/**
	 * Sets the value of the '{@link cloudml.core.InternalComponentInstance#getRequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Execution Platform Instance</em>' containment reference.
	 * @see #getRequiredExecutionPlatformInstance()
	 * @generated
	 */
	void setRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance value);

} // InternalComponentInstance
