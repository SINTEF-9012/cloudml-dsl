/**
 */
package cloudml.core.impl;

import cloudml.core.CorePackage;
import cloudml.core.ProvidedPort;
import cloudml.core.Relationship;
import cloudml.core.RequiredPort;
import cloudml.core.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.RelationshipImpl#getRequiredPort <em>Required Port</em>}</li>
 *   <li>{@link cloudml.core.impl.RelationshipImpl#getProvidedPort <em>Provided Port</em>}</li>
 *   <li>{@link cloudml.core.impl.RelationshipImpl#getRequiredPortResource <em>Required Port Resource</em>}</li>
 *   <li>{@link cloudml.core.impl.RelationshipImpl#getProvidedPortResource <em>Provided Port Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends CloudMLElementWithPropertiesImpl implements Relationship {
	/**
	 * The cached value of the '{@link #getRequiredPort() <em>Required Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPort()
	 * @generated
	 * @ordered
	 */
	protected RequiredPort requiredPort;

	/**
	 * The cached value of the '{@link #getProvidedPort() <em>Provided Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPort()
	 * @generated
	 * @ordered
	 */
	protected ProvidedPort providedPort;

	/**
	 * The cached value of the '{@link #getRequiredPortResource() <em>Required Port Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPortResource()
	 * @generated
	 * @ordered
	 */
	protected Resource requiredPortResource;

	/**
	 * The cached value of the '{@link #getProvidedPortResource() <em>Provided Port Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPortResource()
	 * @generated
	 * @ordered
	 */
	protected Resource providedPortResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort getRequiredPort() {
		if (requiredPort != null && requiredPort.eIsProxy()) {
			InternalEObject oldRequiredPort = (InternalEObject)requiredPort;
			requiredPort = (RequiredPort)eResolveProxy(oldRequiredPort);
			if (requiredPort != oldRequiredPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATIONSHIP__REQUIRED_PORT, oldRequiredPort, requiredPort));
			}
		}
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort basicGetRequiredPort() {
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPort(RequiredPort newRequiredPort) {
		RequiredPort oldRequiredPort = requiredPort;
		requiredPort = newRequiredPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__REQUIRED_PORT, oldRequiredPort, requiredPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort getProvidedPort() {
		if (providedPort != null && providedPort.eIsProxy()) {
			InternalEObject oldProvidedPort = (InternalEObject)providedPort;
			providedPort = (ProvidedPort)eResolveProxy(oldProvidedPort);
			if (providedPort != oldProvidedPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.RELATIONSHIP__PROVIDED_PORT, oldProvidedPort, providedPort));
			}
		}
		return providedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort basicGetProvidedPort() {
		return providedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedPort(ProvidedPort newProvidedPort) {
		ProvidedPort oldProvidedPort = providedPort;
		providedPort = newProvidedPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__PROVIDED_PORT, oldProvidedPort, providedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getRequiredPortResource() {
		return requiredPortResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredPortResource(Resource newRequiredPortResource, NotificationChain msgs) {
		Resource oldRequiredPortResource = requiredPortResource;
		requiredPortResource = newRequiredPortResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE, oldRequiredPortResource, newRequiredPortResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPortResource(Resource newRequiredPortResource) {
		if (newRequiredPortResource != requiredPortResource) {
			NotificationChain msgs = null;
			if (requiredPortResource != null)
				msgs = ((InternalEObject)requiredPortResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE, null, msgs);
			if (newRequiredPortResource != null)
				msgs = ((InternalEObject)newRequiredPortResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE, null, msgs);
			msgs = basicSetRequiredPortResource(newRequiredPortResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE, newRequiredPortResource, newRequiredPortResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getProvidedPortResource() {
		return providedPortResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedPortResource(Resource newProvidedPortResource, NotificationChain msgs) {
		Resource oldProvidedPortResource = providedPortResource;
		providedPortResource = newProvidedPortResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE, oldProvidedPortResource, newProvidedPortResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedPortResource(Resource newProvidedPortResource) {
		if (newProvidedPortResource != providedPortResource) {
			NotificationChain msgs = null;
			if (providedPortResource != null)
				msgs = ((InternalEObject)providedPortResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE, null, msgs);
			if (newProvidedPortResource != null)
				msgs = ((InternalEObject)newProvidedPortResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE, null, msgs);
			msgs = basicSetProvidedPortResource(newProvidedPortResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE, newProvidedPortResource, newProvidedPortResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE:
				return basicSetRequiredPortResource(null, msgs);
			case CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE:
				return basicSetProvidedPortResource(null, msgs);
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
			case CorePackage.RELATIONSHIP__REQUIRED_PORT:
				if (resolve) return getRequiredPort();
				return basicGetRequiredPort();
			case CorePackage.RELATIONSHIP__PROVIDED_PORT:
				if (resolve) return getProvidedPort();
				return basicGetProvidedPort();
			case CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE:
				return getRequiredPortResource();
			case CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE:
				return getProvidedPortResource();
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
			case CorePackage.RELATIONSHIP__REQUIRED_PORT:
				setRequiredPort((RequiredPort)newValue);
				return;
			case CorePackage.RELATIONSHIP__PROVIDED_PORT:
				setProvidedPort((ProvidedPort)newValue);
				return;
			case CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE:
				setRequiredPortResource((Resource)newValue);
				return;
			case CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE:
				setProvidedPortResource((Resource)newValue);
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
			case CorePackage.RELATIONSHIP__REQUIRED_PORT:
				setRequiredPort((RequiredPort)null);
				return;
			case CorePackage.RELATIONSHIP__PROVIDED_PORT:
				setProvidedPort((ProvidedPort)null);
				return;
			case CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE:
				setRequiredPortResource((Resource)null);
				return;
			case CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE:
				setProvidedPortResource((Resource)null);
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
			case CorePackage.RELATIONSHIP__REQUIRED_PORT:
				return requiredPort != null;
			case CorePackage.RELATIONSHIP__PROVIDED_PORT:
				return providedPort != null;
			case CorePackage.RELATIONSHIP__REQUIRED_PORT_RESOURCE:
				return requiredPortResource != null;
			case CorePackage.RELATIONSHIP__PROVIDED_PORT_RESOURCE:
				return providedPortResource != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipImpl
