/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.ComponentInstance#getProvidedPortInstances <em>Provided Port Instances</em>}</li>
 *   <li>{@link cloudml.core.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link cloudml.core.ComponentInstance#getProvidedExecutionPlatformInstances <em>Provided Execution Platform Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getComponentInstance()
 * @model abstract="true"
 * @generated
 */
public interface ComponentInstance extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Provided Port Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.ProvidedPortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Port Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Port Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getComponentInstance_ProvidedPortInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedPortInstance> getProvidedPortInstances();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see cloudml.core.CorePackage#getComponentInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link cloudml.core.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

	/**
	 * Returns the value of the '<em><b>Provided Execution Platform Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.ProvidedExecutionPlatformInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Execution Platform Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Execution Platform Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getComponentInstance_ProvidedExecutionPlatformInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedExecutionPlatformInstance> getProvidedExecutionPlatformInstances();

} // ComponentInstance
