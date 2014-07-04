/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.ExternalComponent#getProvider <em>Provider</em>}</li>
 *   <li>{@link cloudml.core.ExternalComponent#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link cloudml.core.ExternalComponent#getProvide <em>Provide</em>}</li>
 *   <li>{@link cloudml.core.ExternalComponent#getLogin <em>Login</em>}</li>
 *   <li>{@link cloudml.core.ExternalComponent#getPasswd <em>Passwd</em>}</li>
 *   <li>{@link cloudml.core.ExternalComponent#getLocation <em>Location</em>}</li>
 *   <li>{@link cloudml.core.ExternalComponent#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link cloudml.core.ExternalComponent#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getExternalComponent()
 * @model
 * @generated
 */
public interface ExternalComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Provider)
	 * @see cloudml.core.CorePackage#getExternalComponent_Provider()
	 * @model
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link cloudml.core.ExternalComponent#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(String)
	 * @see cloudml.core.CorePackage#getExternalComponent_EndPoint()
	 * @model
	 * @generated
	 */
	String getEndPoint();

	/**
	 * Sets the value of the '{@link cloudml.core.ExternalComponent#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(String value);

	/**
	 * Returns the value of the '<em><b>Provide</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.VMPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getExternalComponent_Provide()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMPort> getProvide();

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see cloudml.core.CorePackage#getExternalComponent_Login()
	 * @model
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link cloudml.core.ExternalComponent#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passwd</em>' attribute.
	 * @see #setPasswd(String)
	 * @see cloudml.core.CorePackage#getExternalComponent_Passwd()
	 * @model
	 * @generated
	 */
	String getPasswd();

	/**
	 * Sets the value of the '{@link cloudml.core.ExternalComponent#getPasswd <em>Passwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passwd</em>' attribute.
	 * @see #getPasswd()
	 * @generated
	 */
	void setPasswd(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see cloudml.core.CorePackage#getExternalComponent_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link cloudml.core.ExternalComponent#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see #setServiceType(String)
	 * @see cloudml.core.CorePackage#getExternalComponent_ServiceType()
	 * @model
	 * @generated
	 */
	String getServiceType();

	/**
	 * Sets the value of the '{@link cloudml.core.ExternalComponent#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see cloudml.core.CorePackage#getExternalComponent_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link cloudml.core.ExternalComponent#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

} // ExternalComponent
