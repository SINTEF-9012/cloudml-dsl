/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.ExternalComponentInstance#getIps <em>Ips</em>}</li>
 *   <li>{@link cloudml.core.ExternalComponentInstance#getProvide <em>Provide</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getExternalComponentInstance()
 * @model
 * @generated
 */
public interface ExternalComponentInstance extends ComponentInstance {
	/**
	 * Returns the value of the '<em><b>Ips</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ips</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ips</em>' attribute list.
	 * @see cloudml.core.CorePackage#getExternalComponentInstance_Ips()
	 * @model
	 * @generated
	 */
	EList<String> getIps();

	/**
	 * Returns the value of the '<em><b>Provide</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.VMPortInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getExternalComponentInstance_Provide()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMPortInstance> getProvide();

} // ExternalComponentInstance
