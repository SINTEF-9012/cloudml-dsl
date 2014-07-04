/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.Cloud#getVmInstances <em>Vm Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getCloud()
 * @model
 * @generated
 */
public interface Cloud extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Vm Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.VMInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloud_VmInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMInstance> getVmInstances();

} // Cloud
