/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.RelationshipInstance#getType <em>Type</em>}</li>
 *   <li>{@link cloudml.core.RelationshipInstance#getRequiredPortInstance <em>Required Port Instance</em>}</li>
 *   <li>{@link cloudml.core.RelationshipInstance#getProvidedPortInstance <em>Provided Port Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getRelationshipInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='Relationship_Required_Port_Should_Match_Its_Type Relationship_Provided_Port_Should_Match_Its_Type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG Relationship_Required_Port_Should_Match_Its_Type='if (not type.oclIsUndefined()) and (not requiredPortInstance.oclIsUndefined()) then requiredPortInstance.type = type.requiredPort else true endif' Relationship_Provided_Port_Should_Match_Its_Type='if (not type.oclIsUndefined()) and (not providedPortInstance.oclIsUndefined()) then providedPortInstance.type = type.providedPort else true endif'"
 * @generated
 */
public interface RelationshipInstance extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Relationship)
	 * @see cloudml.core.CorePackage#getRelationshipInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Relationship getType();

	/**
	 * Sets the value of the '{@link cloudml.core.RelationshipInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Relationship value);

	/**
	 * Returns the value of the '<em><b>Required Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Port Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Port Instance</em>' reference.
	 * @see #setRequiredPortInstance(RequiredPortInstance)
	 * @see cloudml.core.CorePackage#getRelationshipInstance_RequiredPortInstance()
	 * @model required="true"
	 * @generated
	 */
	RequiredPortInstance getRequiredPortInstance();

	/**
	 * Sets the value of the '{@link cloudml.core.RelationshipInstance#getRequiredPortInstance <em>Required Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Port Instance</em>' reference.
	 * @see #getRequiredPortInstance()
	 * @generated
	 */
	void setRequiredPortInstance(RequiredPortInstance value);

	/**
	 * Returns the value of the '<em><b>Provided Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Port Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Port Instance</em>' reference.
	 * @see #setProvidedPortInstance(ProvidedPortInstance)
	 * @see cloudml.core.CorePackage#getRelationshipInstance_ProvidedPortInstance()
	 * @model required="true"
	 * @generated
	 */
	ProvidedPortInstance getProvidedPortInstance();

	/**
	 * Sets the value of the '{@link cloudml.core.RelationshipInstance#getProvidedPortInstance <em>Provided Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Port Instance</em>' reference.
	 * @see #getProvidedPortInstance()
	 * @generated
	 */
	void setProvidedPortInstance(ProvidedPortInstance value);

} // RelationshipInstance
