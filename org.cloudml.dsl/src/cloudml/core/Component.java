/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.Component#getProvidedPorts <em>Provided Ports</em>}</li>
 *   <li>{@link cloudml.core.Component#getProvidedExecutionPlatforms <em>Provided Execution Platforms</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Provided Ports</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.ProvidedPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Ports</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getComponent_ProvidedPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedPort> getProvidedPorts();

	/**
	 * Returns the value of the '<em><b>Provided Execution Platforms</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.ProvidedExecutionPlatform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Execution Platforms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Execution Platforms</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getComponent_ProvidedExecutionPlatforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedExecutionPlatform> getProvidedExecutionPlatforms();

} // Component
