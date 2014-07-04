/**
 */
package cloudml.core.impl;

import cloudml.core.CorePackage;
import cloudml.core.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.ResourceImpl#getDownloadCommand <em>Download Command</em>}</li>
 *   <li>{@link cloudml.core.impl.ResourceImpl#getUploadCommand <em>Upload Command</em>}</li>
 *   <li>{@link cloudml.core.impl.ResourceImpl#getInstallCommand <em>Install Command</em>}</li>
 *   <li>{@link cloudml.core.impl.ResourceImpl#getConfigureCommand <em>Configure Command</em>}</li>
 *   <li>{@link cloudml.core.impl.ResourceImpl#getStartCommand <em>Start Command</em>}</li>
 *   <li>{@link cloudml.core.impl.ResourceImpl#getStopCommand <em>Stop Command</em>}</li>
 *   <li>{@link cloudml.core.impl.ResourceImpl#isRequireCredentials <em>Require Credentials</em>}</li>
 *   <li>{@link cloudml.core.impl.ResourceImpl#isExecuteLocally <em>Execute Locally</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends CloudMLElementWithPropertiesImpl implements Resource {
	/**
	 * The default value of the '{@link #getDownloadCommand() <em>Download Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloadCommand() <em>Download Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadCommand()
	 * @generated
	 * @ordered
	 */
	protected String downloadCommand = DOWNLOAD_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUploadCommand() <em>Upload Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String UPLOAD_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUploadCommand() <em>Upload Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadCommand()
	 * @generated
	 * @ordered
	 */
	protected String uploadCommand = UPLOAD_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstallCommand() <em>Install Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTALL_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstallCommand() <em>Install Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallCommand()
	 * @generated
	 * @ordered
	 */
	protected String installCommand = INSTALL_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigureCommand() <em>Configure Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigureCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURE_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigureCommand() <em>Configure Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigureCommand()
	 * @generated
	 * @ordered
	 */
	protected String configureCommand = CONFIGURE_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartCommand() <em>Start Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String START_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartCommand() <em>Start Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCommand()
	 * @generated
	 * @ordered
	 */
	protected String startCommand = START_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopCommand() <em>Stop Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopCommand() <em>Stop Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopCommand()
	 * @generated
	 * @ordered
	 */
	protected String stopCommand = STOP_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireCredentials() <em>Require Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCredentials()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_CREDENTIALS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireCredentials() <em>Require Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCredentials()
	 * @generated
	 * @ordered
	 */
	protected boolean requireCredentials = REQUIRE_CREDENTIALS_EDEFAULT;

	/**
	 * The default value of the '{@link #isExecuteLocally() <em>Execute Locally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecuteLocally()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTE_LOCALLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecuteLocally() <em>Execute Locally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecuteLocally()
	 * @generated
	 * @ordered
	 */
	protected boolean executeLocally = EXECUTE_LOCALLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDownloadCommand() {
		return downloadCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloadCommand(String newDownloadCommand) {
		String oldDownloadCommand = downloadCommand;
		downloadCommand = newDownloadCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__DOWNLOAD_COMMAND, oldDownloadCommand, downloadCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUploadCommand() {
		return uploadCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploadCommand(String newUploadCommand) {
		String oldUploadCommand = uploadCommand;
		uploadCommand = newUploadCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__UPLOAD_COMMAND, oldUploadCommand, uploadCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallCommand() {
		return installCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallCommand(String newInstallCommand) {
		String oldInstallCommand = installCommand;
		installCommand = newInstallCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__INSTALL_COMMAND, oldInstallCommand, installCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigureCommand() {
		return configureCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigureCommand(String newConfigureCommand) {
		String oldConfigureCommand = configureCommand;
		configureCommand = newConfigureCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__CONFIGURE_COMMAND, oldConfigureCommand, configureCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartCommand() {
		return startCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartCommand(String newStartCommand) {
		String oldStartCommand = startCommand;
		startCommand = newStartCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__START_COMMAND, oldStartCommand, startCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopCommand() {
		return stopCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopCommand(String newStopCommand) {
		String oldStopCommand = stopCommand;
		stopCommand = newStopCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__STOP_COMMAND, oldStopCommand, stopCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireCredentials() {
		return requireCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireCredentials(boolean newRequireCredentials) {
		boolean oldRequireCredentials = requireCredentials;
		requireCredentials = newRequireCredentials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__REQUIRE_CREDENTIALS, oldRequireCredentials, requireCredentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecuteLocally() {
		return executeLocally;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteLocally(boolean newExecuteLocally) {
		boolean oldExecuteLocally = executeLocally;
		executeLocally = newExecuteLocally;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RESOURCE__EXECUTE_LOCALLY, oldExecuteLocally, executeLocally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RESOURCE__DOWNLOAD_COMMAND:
				return getDownloadCommand();
			case CorePackage.RESOURCE__UPLOAD_COMMAND:
				return getUploadCommand();
			case CorePackage.RESOURCE__INSTALL_COMMAND:
				return getInstallCommand();
			case CorePackage.RESOURCE__CONFIGURE_COMMAND:
				return getConfigureCommand();
			case CorePackage.RESOURCE__START_COMMAND:
				return getStartCommand();
			case CorePackage.RESOURCE__STOP_COMMAND:
				return getStopCommand();
			case CorePackage.RESOURCE__REQUIRE_CREDENTIALS:
				return isRequireCredentials();
			case CorePackage.RESOURCE__EXECUTE_LOCALLY:
				return isExecuteLocally();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.RESOURCE__DOWNLOAD_COMMAND:
				setDownloadCommand((String)newValue);
				return;
			case CorePackage.RESOURCE__UPLOAD_COMMAND:
				setUploadCommand((String)newValue);
				return;
			case CorePackage.RESOURCE__INSTALL_COMMAND:
				setInstallCommand((String)newValue);
				return;
			case CorePackage.RESOURCE__CONFIGURE_COMMAND:
				setConfigureCommand((String)newValue);
				return;
			case CorePackage.RESOURCE__START_COMMAND:
				setStartCommand((String)newValue);
				return;
			case CorePackage.RESOURCE__STOP_COMMAND:
				setStopCommand((String)newValue);
				return;
			case CorePackage.RESOURCE__REQUIRE_CREDENTIALS:
				setRequireCredentials((Boolean)newValue);
				return;
			case CorePackage.RESOURCE__EXECUTE_LOCALLY:
				setExecuteLocally((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.RESOURCE__DOWNLOAD_COMMAND:
				setDownloadCommand(DOWNLOAD_COMMAND_EDEFAULT);
				return;
			case CorePackage.RESOURCE__UPLOAD_COMMAND:
				setUploadCommand(UPLOAD_COMMAND_EDEFAULT);
				return;
			case CorePackage.RESOURCE__INSTALL_COMMAND:
				setInstallCommand(INSTALL_COMMAND_EDEFAULT);
				return;
			case CorePackage.RESOURCE__CONFIGURE_COMMAND:
				setConfigureCommand(CONFIGURE_COMMAND_EDEFAULT);
				return;
			case CorePackage.RESOURCE__START_COMMAND:
				setStartCommand(START_COMMAND_EDEFAULT);
				return;
			case CorePackage.RESOURCE__STOP_COMMAND:
				setStopCommand(STOP_COMMAND_EDEFAULT);
				return;
			case CorePackage.RESOURCE__REQUIRE_CREDENTIALS:
				setRequireCredentials(REQUIRE_CREDENTIALS_EDEFAULT);
				return;
			case CorePackage.RESOURCE__EXECUTE_LOCALLY:
				setExecuteLocally(EXECUTE_LOCALLY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.RESOURCE__DOWNLOAD_COMMAND:
				return DOWNLOAD_COMMAND_EDEFAULT == null ? downloadCommand != null : !DOWNLOAD_COMMAND_EDEFAULT.equals(downloadCommand);
			case CorePackage.RESOURCE__UPLOAD_COMMAND:
				return UPLOAD_COMMAND_EDEFAULT == null ? uploadCommand != null : !UPLOAD_COMMAND_EDEFAULT.equals(uploadCommand);
			case CorePackage.RESOURCE__INSTALL_COMMAND:
				return INSTALL_COMMAND_EDEFAULT == null ? installCommand != null : !INSTALL_COMMAND_EDEFAULT.equals(installCommand);
			case CorePackage.RESOURCE__CONFIGURE_COMMAND:
				return CONFIGURE_COMMAND_EDEFAULT == null ? configureCommand != null : !CONFIGURE_COMMAND_EDEFAULT.equals(configureCommand);
			case CorePackage.RESOURCE__START_COMMAND:
				return START_COMMAND_EDEFAULT == null ? startCommand != null : !START_COMMAND_EDEFAULT.equals(startCommand);
			case CorePackage.RESOURCE__STOP_COMMAND:
				return STOP_COMMAND_EDEFAULT == null ? stopCommand != null : !STOP_COMMAND_EDEFAULT.equals(stopCommand);
			case CorePackage.RESOURCE__REQUIRE_CREDENTIALS:
				return requireCredentials != REQUIRE_CREDENTIALS_EDEFAULT;
			case CorePackage.RESOURCE__EXECUTE_LOCALLY:
				return executeLocally != EXECUTE_LOCALLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (downloadCommand: ");
		result.append(downloadCommand);
		result.append(", uploadCommand: ");
		result.append(uploadCommand);
		result.append(", installCommand: ");
		result.append(installCommand);
		result.append(", configureCommand: ");
		result.append(configureCommand);
		result.append(", startCommand: ");
		result.append(startCommand);
		result.append(", stopCommand: ");
		result.append(stopCommand);
		result.append(", requireCredentials: ");
		result.append(requireCredentials);
		result.append(", executeLocally: ");
		result.append(executeLocally);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
