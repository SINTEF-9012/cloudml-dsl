/**
 */
package cloudml.core.impl;

import cloudml.core.CorePackage;
import cloudml.core.VM;
import cloudml.core.VMPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.VMImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getMinRam <em>Min Ram</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getMaxRam <em>Max Ram</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getMaxStorage <em>Max Storage</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getOs <em>Os</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#isIs64os <em>Is64os</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getSshKey <em>Ssh Key</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link cloudml.core.impl.VMImpl#getGroupName <em>Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMImpl extends ExternalComponentImpl implements VM {
	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<VMPort> provided;

	/**
	 * The default value of the '{@link #getMinRam() <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRam()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinRam() <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRam()
	 * @generated
	 * @ordered
	 */
	protected int minRam = MIN_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRam() <em>Max Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRam()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRam() <em>Max Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRam()
	 * @generated
	 * @ordered
	 */
	protected int maxRam = MAX_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinCores() <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCores()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCores() <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCores()
	 * @generated
	 * @ordered
	 */
	protected int minCores = MIN_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCores() <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCores()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCores() <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCores()
	 * @generated
	 * @ordered
	 */
	protected int maxCores = MAX_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinStorage() <em>Min Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStorage()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_STORAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinStorage() <em>Min Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStorage()
	 * @generated
	 * @ordered
	 */
	protected int minStorage = MIN_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxStorage() <em>Max Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStorage()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_STORAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxStorage() <em>Max Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStorage()
	 * @generated
	 * @ordered
	 */
	protected int maxStorage = MAX_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs64os() <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs64os()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS64OS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIs64os() <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs64os()
	 * @generated
	 * @ordered
	 */
	protected boolean is64os = IS64OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected String imageId = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityGroup() <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected String securityGroup = SECURITY_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshKey() <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshKey() <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshKey()
	 * @generated
	 * @ordered
	 */
	protected String sshKey = SSH_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String privateKey = PRIVATE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VMPort> getProvided() {
		if (provided == null) {
			provided = new EObjectContainmentEList<VMPort>(VMPort.class, this, CorePackage.VM__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinRam() {
		return minRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRam(int newMinRam) {
		int oldMinRam = minRam;
		minRam = newMinRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__MIN_RAM, oldMinRam, minRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRam() {
		return maxRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRam(int newMaxRam) {
		int oldMaxRam = maxRam;
		maxRam = newMaxRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__MAX_RAM, oldMaxRam, maxRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinCores() {
		return minCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCores(int newMinCores) {
		int oldMinCores = minCores;
		minCores = newMinCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__MIN_CORES, oldMinCores, minCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCores() {
		return maxCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCores(int newMaxCores) {
		int oldMaxCores = maxCores;
		maxCores = newMaxCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__MAX_CORES, oldMaxCores, maxCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinStorage() {
		return minStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStorage(int newMinStorage) {
		int oldMinStorage = minStorage;
		minStorage = newMinStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__MIN_STORAGE, oldMinStorage, minStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxStorage() {
		return maxStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStorage(int newMaxStorage) {
		int oldMaxStorage = maxStorage;
		maxStorage = newMaxStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__MAX_STORAGE, oldMaxStorage, maxStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs64os() {
		return is64os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs64os(boolean newIs64os) {
		boolean oldIs64os = is64os;
		is64os = newIs64os;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__IS64OS, oldIs64os, is64os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageId() {
		return imageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageId(String newImageId) {
		String oldImageId = imageId;
		imageId = newImageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__IMAGE_ID, oldImageId, imageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroup() {
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroup(String newSecurityGroup) {
		String oldSecurityGroup = securityGroup;
		securityGroup = newSecurityGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__SECURITY_GROUP, oldSecurityGroup, securityGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSshKey() {
		return sshKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshKey(String newSshKey) {
		String oldSshKey = sshKey;
		sshKey = newSshKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__SSH_KEY, oldSshKey, sshKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateKey(String newPrivateKey) {
		String oldPrivateKey = privateKey;
		privateKey = newPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__PRIVATE_KEY, oldPrivateKey, privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VM__PROVIDED:
				return ((InternalEList<?>)getProvided()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.VM__PROVIDED:
				return getProvided();
			case CorePackage.VM__MIN_RAM:
				return getMinRam();
			case CorePackage.VM__MAX_RAM:
				return getMaxRam();
			case CorePackage.VM__MIN_CORES:
				return getMinCores();
			case CorePackage.VM__MAX_CORES:
				return getMaxCores();
			case CorePackage.VM__MIN_STORAGE:
				return getMinStorage();
			case CorePackage.VM__MAX_STORAGE:
				return getMaxStorage();
			case CorePackage.VM__OS:
				return getOs();
			case CorePackage.VM__IS64OS:
				return isIs64os();
			case CorePackage.VM__IMAGE_ID:
				return getImageId();
			case CorePackage.VM__SECURITY_GROUP:
				return getSecurityGroup();
			case CorePackage.VM__SSH_KEY:
				return getSshKey();
			case CorePackage.VM__PRIVATE_KEY:
				return getPrivateKey();
			case CorePackage.VM__GROUP_NAME:
				return getGroupName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.VM__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends VMPort>)newValue);
				return;
			case CorePackage.VM__MIN_RAM:
				setMinRam((Integer)newValue);
				return;
			case CorePackage.VM__MAX_RAM:
				setMaxRam((Integer)newValue);
				return;
			case CorePackage.VM__MIN_CORES:
				setMinCores((Integer)newValue);
				return;
			case CorePackage.VM__MAX_CORES:
				setMaxCores((Integer)newValue);
				return;
			case CorePackage.VM__MIN_STORAGE:
				setMinStorage((Integer)newValue);
				return;
			case CorePackage.VM__MAX_STORAGE:
				setMaxStorage((Integer)newValue);
				return;
			case CorePackage.VM__OS:
				setOs((String)newValue);
				return;
			case CorePackage.VM__IS64OS:
				setIs64os((Boolean)newValue);
				return;
			case CorePackage.VM__IMAGE_ID:
				setImageId((String)newValue);
				return;
			case CorePackage.VM__SECURITY_GROUP:
				setSecurityGroup((String)newValue);
				return;
			case CorePackage.VM__SSH_KEY:
				setSshKey((String)newValue);
				return;
			case CorePackage.VM__PRIVATE_KEY:
				setPrivateKey((String)newValue);
				return;
			case CorePackage.VM__GROUP_NAME:
				setGroupName((String)newValue);
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
			case CorePackage.VM__PROVIDED:
				getProvided().clear();
				return;
			case CorePackage.VM__MIN_RAM:
				setMinRam(MIN_RAM_EDEFAULT);
				return;
			case CorePackage.VM__MAX_RAM:
				setMaxRam(MAX_RAM_EDEFAULT);
				return;
			case CorePackage.VM__MIN_CORES:
				setMinCores(MIN_CORES_EDEFAULT);
				return;
			case CorePackage.VM__MAX_CORES:
				setMaxCores(MAX_CORES_EDEFAULT);
				return;
			case CorePackage.VM__MIN_STORAGE:
				setMinStorage(MIN_STORAGE_EDEFAULT);
				return;
			case CorePackage.VM__MAX_STORAGE:
				setMaxStorage(MAX_STORAGE_EDEFAULT);
				return;
			case CorePackage.VM__OS:
				setOs(OS_EDEFAULT);
				return;
			case CorePackage.VM__IS64OS:
				setIs64os(IS64OS_EDEFAULT);
				return;
			case CorePackage.VM__IMAGE_ID:
				setImageId(IMAGE_ID_EDEFAULT);
				return;
			case CorePackage.VM__SECURITY_GROUP:
				setSecurityGroup(SECURITY_GROUP_EDEFAULT);
				return;
			case CorePackage.VM__SSH_KEY:
				setSshKey(SSH_KEY_EDEFAULT);
				return;
			case CorePackage.VM__PRIVATE_KEY:
				setPrivateKey(PRIVATE_KEY_EDEFAULT);
				return;
			case CorePackage.VM__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
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
			case CorePackage.VM__PROVIDED:
				return provided != null && !provided.isEmpty();
			case CorePackage.VM__MIN_RAM:
				return minRam != MIN_RAM_EDEFAULT;
			case CorePackage.VM__MAX_RAM:
				return maxRam != MAX_RAM_EDEFAULT;
			case CorePackage.VM__MIN_CORES:
				return minCores != MIN_CORES_EDEFAULT;
			case CorePackage.VM__MAX_CORES:
				return maxCores != MAX_CORES_EDEFAULT;
			case CorePackage.VM__MIN_STORAGE:
				return minStorage != MIN_STORAGE_EDEFAULT;
			case CorePackage.VM__MAX_STORAGE:
				return maxStorage != MAX_STORAGE_EDEFAULT;
			case CorePackage.VM__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case CorePackage.VM__IS64OS:
				return is64os != IS64OS_EDEFAULT;
			case CorePackage.VM__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
			case CorePackage.VM__SECURITY_GROUP:
				return SECURITY_GROUP_EDEFAULT == null ? securityGroup != null : !SECURITY_GROUP_EDEFAULT.equals(securityGroup);
			case CorePackage.VM__SSH_KEY:
				return SSH_KEY_EDEFAULT == null ? sshKey != null : !SSH_KEY_EDEFAULT.equals(sshKey);
			case CorePackage.VM__PRIVATE_KEY:
				return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
			case CorePackage.VM__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
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
		result.append(" (minRam: ");
		result.append(minRam);
		result.append(", maxRam: ");
		result.append(maxRam);
		result.append(", minCores: ");
		result.append(minCores);
		result.append(", maxCores: ");
		result.append(maxCores);
		result.append(", minStorage: ");
		result.append(minStorage);
		result.append(", maxStorage: ");
		result.append(maxStorage);
		result.append(", os: ");
		result.append(os);
		result.append(", is64os: ");
		result.append(is64os);
		result.append(", imageId: ");
		result.append(imageId);
		result.append(", securityGroup: ");
		result.append(securityGroup);
		result.append(", sshKey: ");
		result.append(sshKey);
		result.append(", privateKey: ");
		result.append(privateKey);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(')');
		return result.toString();
	}

} //VMImpl
