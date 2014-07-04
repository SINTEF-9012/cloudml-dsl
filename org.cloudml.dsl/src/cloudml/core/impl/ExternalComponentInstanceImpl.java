/**
 */
package cloudml.core.impl;

import cloudml.core.CorePackage;
import cloudml.core.ExternalComponentInstance;
import cloudml.core.VMPortInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.ExternalComponentInstanceImpl#getIps <em>Ips</em>}</li>
 *   <li>{@link cloudml.core.impl.ExternalComponentInstanceImpl#getProvide <em>Provide</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalComponentInstanceImpl extends ComponentInstanceImpl implements ExternalComponentInstance {
	/**
	 * The cached value of the '{@link #getIps() <em>Ips</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIps()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ips;

	/**
	 * The cached value of the '{@link #getProvide() <em>Provide</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvide()
	 * @generated
	 * @ordered
	 */
	protected EList<VMPortInstance> provide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXTERNAL_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIps() {
		if (ips == null) {
			ips = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.EXTERNAL_COMPONENT_INSTANCE__IPS);
		}
		return ips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VMPortInstance> getProvide() {
		if (provide == null) {
			provide = new EObjectContainmentEList<VMPortInstance>(VMPortInstance.class, this, CorePackage.EXTERNAL_COMPONENT_INSTANCE__PROVIDE);
		}
		return provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__PROVIDE:
				return ((InternalEList<?>)getProvide()).basicRemove(otherEnd, msgs);
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
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__IPS:
				return getIps();
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__PROVIDE:
				return getProvide();
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
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__IPS:
				getIps().clear();
				getIps().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__PROVIDE:
				getProvide().clear();
				getProvide().addAll((Collection<? extends VMPortInstance>)newValue);
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
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__IPS:
				getIps().clear();
				return;
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__PROVIDE:
				getProvide().clear();
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
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__IPS:
				return ips != null && !ips.isEmpty();
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE__PROVIDE:
				return provide != null && !provide.isEmpty();
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
		result.append(" (ips: ");
		result.append(ips);
		result.append(')');
		return result.toString();
	}

} //ExternalComponentInstanceImpl
