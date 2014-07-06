/**
 */
package cloudml.core.impl;

import cloudml.core.Component;
import cloudml.core.CorePackage;
import cloudml.core.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.PortImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link cloudml.core.impl.PortImpl#isIsLocal <em>Is Local</em>}</li>
 *   <li>{@link cloudml.core.impl.PortImpl#getPortNumber <em>Port Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortImpl extends CloudMLElementWithPropertiesImpl implements Port {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The default value of the '{@link #isIsLocal() <em>Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocal() <em>Is Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocal = IS_LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.PORT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component basicGetComponent() {
		Object container = eContainer();
		if(container!=null && container instanceof Component)
			setComponent((Component) container);
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PORT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocal() {
		return isLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocal(boolean newIsLocal) {
		boolean oldIsLocal = isLocal;
		isLocal = newIsLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PORT__IS_LOCAL, oldIsLocal, isLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNumber(int newPortNumber) {
		int oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PORT__PORT_NUMBER, oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PORT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case CorePackage.PORT__IS_LOCAL:
				return isIsLocal();
			case CorePackage.PORT__PORT_NUMBER:
				return getPortNumber();
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
			case CorePackage.PORT__COMPONENT:
				setComponent((Component)newValue);
				return;
			case CorePackage.PORT__IS_LOCAL:
				setIsLocal((Boolean)newValue);
				return;
			case CorePackage.PORT__PORT_NUMBER:
				setPortNumber((Integer)newValue);
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
			case CorePackage.PORT__COMPONENT:
				setComponent((Component)null);
				return;
			case CorePackage.PORT__IS_LOCAL:
				setIsLocal(IS_LOCAL_EDEFAULT);
				return;
			case CorePackage.PORT__PORT_NUMBER:
				setPortNumber(PORT_NUMBER_EDEFAULT);
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
			case CorePackage.PORT__COMPONENT:
				return component != null;
			case CorePackage.PORT__IS_LOCAL:
				return isLocal != IS_LOCAL_EDEFAULT;
			case CorePackage.PORT__PORT_NUMBER:
				return portNumber != PORT_NUMBER_EDEFAULT;
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
		result.append(" (isLocal: ");
		result.append(isLocal);
		result.append(", portNumber: ");
		result.append(portNumber);
		result.append(')');
		return result.toString();
	}

} //PortImpl
