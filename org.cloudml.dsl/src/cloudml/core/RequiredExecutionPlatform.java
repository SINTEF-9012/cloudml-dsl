/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Execution Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.RequiredExecutionPlatform#getDemands <em>Demands</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getRequiredExecutionPlatform()
 * @model
 * @generated
 */
public interface RequiredExecutionPlatform extends ExecutionPlatform {
	/**
	 * Returns the value of the '<em><b>Demands</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demands</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getRequiredExecutionPlatform_Demands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getDemands();

} // RequiredExecutionPlatform
