/**
 */
package cloudml.core.impl;

import cloudml.core.CorePackage;
import cloudml.core.ProvidedPortInstance;
import cloudml.core.Relationship;
import cloudml.core.RelationshipInstance;
import cloudml.core.RequiredPortInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.RelationshipInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link cloudml.core.impl.RelationshipInstanceImpl#getRequiredPortInstance <em>Required Port Instance</em>}</li>
 *   <li>{@link cloudml.core.impl.RelationshipInstanceImpl#getProvidedPortInstance <em>Provided Port Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipInstanceImpl extends CloudMLElementWithPropertiesImpl implements RelationshipInstance {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Relationship type;

	/**
	 * The cached value of the '{@link #getRequiredPortInstance() <em>Required Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPortInstance()
	 * @generated
	 * @ordered
	 */
	protected RequiredPortInstance requiredPortInstance;

	/**
	 * The cached value of the '{@link #getProvidedPortInstance() <em>Provided Port Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPortInstance()
	 * @generated
	 * @ordered
	 */
	protected ProvidedPortInstance providedPortInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RELATIONSHIP_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Relationship)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATIONSHIP_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Relationship newType) {
		Relationship oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPortInstance getRequiredPortInstance() {
		if (requiredPortInstance != null && requiredPortInstance.eIsProxy()) {
			InternalEObject oldRequiredPortInstance = (InternalEObject)requiredPortInstance;
			requiredPortInstance = (RequiredPortInstance)eResolveProxy(oldRequiredPortInstance);
			if (requiredPortInstance != oldRequiredPortInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE, oldRequiredPortInstance, requiredPortInstance));
			}
		}
		return requiredPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPortInstance basicGetRequiredPortInstance() {
		return requiredPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPortInstance(RequiredPortInstance newRequiredPortInstance) {
		RequiredPortInstance oldRequiredPortInstance = requiredPortInstance;
		requiredPortInstance = newRequiredPortInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE, oldRequiredPortInstance, requiredPortInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPortInstance getProvidedPortInstance() {
		if (providedPortInstance != null && providedPortInstance.eIsProxy()) {
			InternalEObject oldProvidedPortInstance = (InternalEObject)providedPortInstance;
			providedPortInstance = (ProvidedPortInstance)eResolveProxy(oldProvidedPortInstance);
			if (providedPortInstance != oldProvidedPortInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE, oldProvidedPortInstance, providedPortInstance));
			}
		}
		return providedPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPortInstance basicGetProvidedPortInstance() {
		return providedPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedPortInstance(ProvidedPortInstance newProvidedPortInstance) {
		ProvidedPortInstance oldProvidedPortInstance = providedPortInstance;
		providedPortInstance = newProvidedPortInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE, oldProvidedPortInstance, providedPortInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RELATIONSHIP_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CorePackage.RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE:
				if (resolve) return getRequiredPortInstance();
				return basicGetRequiredPortInstance();
			case CorePackage.RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE:
				if (resolve) return getProvidedPortInstance();
				return basicGetProvidedPortInstance();
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
			case CorePackage.RELATIONSHIP_INSTANCE__TYPE:
				setType((Relationship)newValue);
				return;
			case CorePackage.RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE:
				setRequiredPortInstance((RequiredPortInstance)newValue);
				return;
			case CorePackage.RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE:
				setProvidedPortInstance((ProvidedPortInstance)newValue);
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
			case CorePackage.RELATIONSHIP_INSTANCE__TYPE:
				setType((Relationship)null);
				return;
			case CorePackage.RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE:
				setRequiredPortInstance((RequiredPortInstance)null);
				return;
			case CorePackage.RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE:
				setProvidedPortInstance((ProvidedPortInstance)null);
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
			case CorePackage.RELATIONSHIP_INSTANCE__TYPE:
				return type != null;
			case CorePackage.RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE:
				return requiredPortInstance != null;
			case CorePackage.RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE:
				return providedPortInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipInstanceImpl
