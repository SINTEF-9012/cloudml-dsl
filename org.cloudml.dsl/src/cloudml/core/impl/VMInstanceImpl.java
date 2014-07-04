/**
 */
package cloudml.core.impl;

import cloudml.core.CorePackage;
import cloudml.core.VMInstance;
import cloudml.core.VMPortInstance;

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
 * An implementation of the model object '<em><b>VM Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.VMInstanceImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link cloudml.core.impl.VMInstanceImpl#getPublicAddress <em>Public Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VMInstanceImpl extends ExternalComponentInstanceImpl implements VMInstance {
	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<VMPortInstance> provided;

	/**
	 * The default value of the '{@link #getPublicAddress() <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicAddress() <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicAddress()
	 * @generated
	 * @ordered
	 */
	protected String publicAddress = PUBLIC_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VMInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VMPortInstance> getProvided() {
		if (provided == null) {
			provided = new EObjectContainmentEList<VMPortInstance>(VMPortInstance.class, this, CorePackage.VM_INSTANCE__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicAddress() {
		return publicAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicAddress(String newPublicAddress) {
		String oldPublicAddress = publicAddress;
		publicAddress = newPublicAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VM_INSTANCE__PUBLIC_ADDRESS, oldPublicAddress, publicAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VM_INSTANCE__PROVIDED:
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
			case CorePackage.VM_INSTANCE__PROVIDED:
				return getProvided();
			case CorePackage.VM_INSTANCE__PUBLIC_ADDRESS:
				return getPublicAddress();
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
			case CorePackage.VM_INSTANCE__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends VMPortInstance>)newValue);
				return;
			case CorePackage.VM_INSTANCE__PUBLIC_ADDRESS:
				setPublicAddress((String)newValue);
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
			case CorePackage.VM_INSTANCE__PROVIDED:
				getProvided().clear();
				return;
			case CorePackage.VM_INSTANCE__PUBLIC_ADDRESS:
				setPublicAddress(PUBLIC_ADDRESS_EDEFAULT);
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
			case CorePackage.VM_INSTANCE__PROVIDED:
				return provided != null && !provided.isEmpty();
			case CorePackage.VM_INSTANCE__PUBLIC_ADDRESS:
				return PUBLIC_ADDRESS_EDEFAULT == null ? publicAddress != null : !PUBLIC_ADDRESS_EDEFAULT.equals(publicAddress);
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
		result.append(" (publicAddress: ");
		result.append(publicAddress);
		result.append(')');
		return result.toString();
	}

} //VMInstanceImpl
