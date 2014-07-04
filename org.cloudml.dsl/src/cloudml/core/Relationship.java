/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.Relationship#getRequiredPort <em>Required Port</em>}</li>
 *   <li>{@link cloudml.core.Relationship#getProvidedPort <em>Provided Port</em>}</li>
 *   <li>{@link cloudml.core.Relationship#getRequiredPortResource <em>Required Port Resource</em>}</li>
 *   <li>{@link cloudml.core.Relationship#getProvidedPortResource <em>Provided Port Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Required Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Port</em>' reference.
	 * @see #setRequiredPort(RequiredPort)
	 * @see cloudml.core.CorePackage#getRelationship_RequiredPort()
	 * @model required="true"
	 * @generated
	 */
	RequiredPort getRequiredPort();

	/**
	 * Sets the value of the '{@link cloudml.core.Relationship#getRequiredPort <em>Required Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Port</em>' reference.
	 * @see #getRequiredPort()
	 * @generated
	 */
	void setRequiredPort(RequiredPort value);

	/**
	 * Returns the value of the '<em><b>Provided Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Port</em>' reference.
	 * @see #setProvidedPort(ProvidedPort)
	 * @see cloudml.core.CorePackage#getRelationship_ProvidedPort()
	 * @model required="true"
	 * @generated
	 */
	ProvidedPort getProvidedPort();

	/**
	 * Sets the value of the '{@link cloudml.core.Relationship#getProvidedPort <em>Provided Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Port</em>' reference.
	 * @see #getProvidedPort()
	 * @generated
	 */
	void setProvidedPort(ProvidedPort value);

	/**
	 * Returns the value of the '<em><b>Required Port Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Port Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Port Resource</em>' containment reference.
	 * @see #setRequiredPortResource(Resource)
	 * @see cloudml.core.CorePackage#getRelationship_RequiredPortResource()
	 * @model containment="true"
	 * @generated
	 */
	Resource getRequiredPortResource();

	/**
	 * Sets the value of the '{@link cloudml.core.Relationship#getRequiredPortResource <em>Required Port Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Port Resource</em>' containment reference.
	 * @see #getRequiredPortResource()
	 * @generated
	 */
	void setRequiredPortResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Provided Port Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Port Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Port Resource</em>' containment reference.
	 * @see #setProvidedPortResource(Resource)
	 * @see cloudml.core.CorePackage#getRelationship_ProvidedPortResource()
	 * @model containment="true"
	 * @generated
	 */
	Resource getProvidedPortResource();

	/**
	 * Sets the value of the '{@link cloudml.core.Relationship#getProvidedPortResource <em>Provided Port Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Port Resource</em>' containment reference.
	 * @see #getProvidedPortResource()
	 * @generated
	 */
	void setProvidedPortResource(Resource value);

} // Relationship
