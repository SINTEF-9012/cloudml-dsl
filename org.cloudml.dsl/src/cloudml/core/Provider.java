/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.Provider#getCredentials <em>Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credentials</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' attribute.
	 * @see #setCredentials(String)
	 * @see cloudml.core.CorePackage#getProvider_Credentials()
	 * @model required="true"
	 * @generated
	 */
	String getCredentials();

	/**
	 * Sets the value of the '{@link cloudml.core.Provider#getCredentials <em>Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentials</em>' attribute.
	 * @see #getCredentials()
	 * @generated
	 */
	void setCredentials(String value);

} // Provider
