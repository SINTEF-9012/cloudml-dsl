/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.InternalComponent#getRequiredPorts <em>Required Ports</em>}</li>
 *   <li>{@link cloudml.core.InternalComponent#getCompositeInternalComponents <em>Composite Internal Components</em>}</li>
 *   <li>{@link cloudml.core.InternalComponent#getRequiredExecutionPlatform <em>Required Execution Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getInternalComponent()
 * @model
 * @generated
 */
public interface InternalComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Required Ports</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.RequiredPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Ports</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getInternalComponent_RequiredPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredPort> getRequiredPorts();

	/**
	 * Returns the value of the '<em><b>Composite Internal Components</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.InternalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Internal Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Internal Components</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getInternalComponent_CompositeInternalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalComponent> getCompositeInternalComponents();

	/**
	 * Returns the value of the '<em><b>Required Execution Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Execution Platform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Execution Platform</em>' containment reference.
	 * @see #setRequiredExecutionPlatform(RequiredExecutionPlatform)
	 * @see cloudml.core.CorePackage#getInternalComponent_RequiredExecutionPlatform()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RequiredExecutionPlatform getRequiredExecutionPlatform();

	/**
	 * Sets the value of the '{@link cloudml.core.InternalComponent#getRequiredExecutionPlatform <em>Required Execution Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Execution Platform</em>' containment reference.
	 * @see #getRequiredExecutionPlatform()
	 * @generated
	 */
	void setRequiredExecutionPlatform(RequiredExecutionPlatform value);

} // InternalComponent
