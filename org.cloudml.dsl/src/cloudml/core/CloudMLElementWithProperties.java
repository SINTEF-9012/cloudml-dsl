/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud ML Element With Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.CloudMLElementWithProperties#getProperties <em>Properties</em>}</li>
 *   <li>{@link cloudml.core.CloudMLElementWithProperties#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getCloudMLElementWithProperties()
 * @model abstract="true"
 * @generated
 */
public interface CloudMLElementWithProperties extends CloudMLElement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLElementWithProperties_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLElementWithProperties_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // CloudMLElementWithProperties
