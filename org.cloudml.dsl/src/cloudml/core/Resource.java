/**
 */
package cloudml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.Resource#getDownloadCommand <em>Download Command</em>}</li>
 *   <li>{@link cloudml.core.Resource#getUploadCommand <em>Upload Command</em>}</li>
 *   <li>{@link cloudml.core.Resource#getInstallCommand <em>Install Command</em>}</li>
 *   <li>{@link cloudml.core.Resource#getConfigureCommand <em>Configure Command</em>}</li>
 *   <li>{@link cloudml.core.Resource#getStartCommand <em>Start Command</em>}</li>
 *   <li>{@link cloudml.core.Resource#getStopCommand <em>Stop Command</em>}</li>
 *   <li>{@link cloudml.core.Resource#isRequireCredentials <em>Require Credentials</em>}</li>
 *   <li>{@link cloudml.core.Resource#isExecuteLocally <em>Execute Locally</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Download Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Download Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Command</em>' attribute.
	 * @see #setDownloadCommand(String)
	 * @see cloudml.core.CorePackage#getResource_DownloadCommand()
	 * @model
	 * @generated
	 */
	String getDownloadCommand();

	/**
	 * Sets the value of the '{@link cloudml.core.Resource#getDownloadCommand <em>Download Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Command</em>' attribute.
	 * @see #getDownloadCommand()
	 * @generated
	 */
	void setDownloadCommand(String value);

	/**
	 * Returns the value of the '<em><b>Upload Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upload Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upload Command</em>' attribute.
	 * @see #setUploadCommand(String)
	 * @see cloudml.core.CorePackage#getResource_UploadCommand()
	 * @model
	 * @generated
	 */
	String getUploadCommand();

	/**
	 * Sets the value of the '{@link cloudml.core.Resource#getUploadCommand <em>Upload Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upload Command</em>' attribute.
	 * @see #getUploadCommand()
	 * @generated
	 */
	void setUploadCommand(String value);

	/**
	 * Returns the value of the '<em><b>Install Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Install Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Install Command</em>' attribute.
	 * @see #setInstallCommand(String)
	 * @see cloudml.core.CorePackage#getResource_InstallCommand()
	 * @model
	 * @generated
	 */
	String getInstallCommand();

	/**
	 * Sets the value of the '{@link cloudml.core.Resource#getInstallCommand <em>Install Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Install Command</em>' attribute.
	 * @see #getInstallCommand()
	 * @generated
	 */
	void setInstallCommand(String value);

	/**
	 * Returns the value of the '<em><b>Configure Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configure Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configure Command</em>' attribute.
	 * @see #setConfigureCommand(String)
	 * @see cloudml.core.CorePackage#getResource_ConfigureCommand()
	 * @model
	 * @generated
	 */
	String getConfigureCommand();

	/**
	 * Sets the value of the '{@link cloudml.core.Resource#getConfigureCommand <em>Configure Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configure Command</em>' attribute.
	 * @see #getConfigureCommand()
	 * @generated
	 */
	void setConfigureCommand(String value);

	/**
	 * Returns the value of the '<em><b>Start Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Command</em>' attribute.
	 * @see #setStartCommand(String)
	 * @see cloudml.core.CorePackage#getResource_StartCommand()
	 * @model
	 * @generated
	 */
	String getStartCommand();

	/**
	 * Sets the value of the '{@link cloudml.core.Resource#getStartCommand <em>Start Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Command</em>' attribute.
	 * @see #getStartCommand()
	 * @generated
	 */
	void setStartCommand(String value);

	/**
	 * Returns the value of the '<em><b>Stop Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Command</em>' attribute.
	 * @see #setStopCommand(String)
	 * @see cloudml.core.CorePackage#getResource_StopCommand()
	 * @model
	 * @generated
	 */
	String getStopCommand();

	/**
	 * Sets the value of the '{@link cloudml.core.Resource#getStopCommand <em>Stop Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Command</em>' attribute.
	 * @see #getStopCommand()
	 * @generated
	 */
	void setStopCommand(String value);

	/**
	 * Returns the value of the '<em><b>Require Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Credentials</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Credentials</em>' attribute.
	 * @see #setRequireCredentials(boolean)
	 * @see cloudml.core.CorePackage#getResource_RequireCredentials()
	 * @model
	 * @generated
	 */
	boolean isRequireCredentials();

	/**
	 * Sets the value of the '{@link cloudml.core.Resource#isRequireCredentials <em>Require Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Credentials</em>' attribute.
	 * @see #isRequireCredentials()
	 * @generated
	 */
	void setRequireCredentials(boolean value);

	/**
	 * Returns the value of the '<em><b>Execute Locally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute Locally</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Locally</em>' attribute.
	 * @see #setExecuteLocally(boolean)
	 * @see cloudml.core.CorePackage#getResource_ExecuteLocally()
	 * @model
	 * @generated
	 */
	boolean isExecuteLocally();

	/**
	 * Sets the value of the '{@link cloudml.core.Resource#isExecuteLocally <em>Execute Locally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Locally</em>' attribute.
	 * @see #isExecuteLocally()
	 * @generated
	 */
	void setExecuteLocally(boolean value);

} // Resource
