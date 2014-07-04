/**
 */
package cloudml.core.impl;

import cloudml.core.CorePackage;
import cloudml.core.InternalComponent;
import cloudml.core.RequiredExecutionPlatform;
import cloudml.core.RequiredPort;

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
 * An implementation of the model object '<em><b>Internal Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.InternalComponentImpl#getRequiredPorts <em>Required Ports</em>}</li>
 *   <li>{@link cloudml.core.impl.InternalComponentImpl#getCompositeInternalComponents <em>Composite Internal Components</em>}</li>
 *   <li>{@link cloudml.core.impl.InternalComponentImpl#getRequiredExecutionPlatform <em>Required Execution Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalComponentImpl extends ComponentImpl implements InternalComponent {
	/**
	 * The cached value of the '{@link #getRequiredPorts() <em>Required Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredPort> requiredPorts;

	/**
	 * The cached value of the '{@link #getCompositeInternalComponents() <em>Composite Internal Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeInternalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalComponent> compositeInternalComponents;

	/**
	 * The cached value of the '{@link #getRequiredExecutionPlatform() <em>Required Execution Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExecutionPlatform()
	 * @generated
	 * @ordered
	 */
	protected RequiredExecutionPlatform requiredExecutionPlatform;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERNAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredPort> getRequiredPorts() {
		if (requiredPorts == null) {
			requiredPorts = new EObjectContainmentEList<RequiredPort>(RequiredPort.class, this, CorePackage.INTERNAL_COMPONENT__REQUIRED_PORTS);
		}
		return requiredPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalComponent> getCompositeInternalComponents() {
		if (compositeInternalComponents == null) {
			compositeInternalComponents = new EObjectContainmentEList<InternalComponent>(InternalComponent.class, this, CorePackage.INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS);
		}
		return compositeInternalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredExecutionPlatform getRequiredExecutionPlatform() {
		return requiredExecutionPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredExecutionPlatform(RequiredExecutionPlatform newRequiredExecutionPlatform, NotificationChain msgs) {
		RequiredExecutionPlatform oldRequiredExecutionPlatform = requiredExecutionPlatform;
		requiredExecutionPlatform = newRequiredExecutionPlatform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM, oldRequiredExecutionPlatform, newRequiredExecutionPlatform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredExecutionPlatform(RequiredExecutionPlatform newRequiredExecutionPlatform) {
		if (newRequiredExecutionPlatform != requiredExecutionPlatform) {
			NotificationChain msgs = null;
			if (requiredExecutionPlatform != null)
				msgs = ((InternalEObject)requiredExecutionPlatform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM, null, msgs);
			if (newRequiredExecutionPlatform != null)
				msgs = ((InternalEObject)newRequiredExecutionPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM, null, msgs);
			msgs = basicSetRequiredExecutionPlatform(newRequiredExecutionPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM, newRequiredExecutionPlatform, newRequiredExecutionPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_PORTS:
				return ((InternalEList<?>)getRequiredPorts()).basicRemove(otherEnd, msgs);
			case CorePackage.INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS:
				return ((InternalEList<?>)getCompositeInternalComponents()).basicRemove(otherEnd, msgs);
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM:
				return basicSetRequiredExecutionPlatform(null, msgs);
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
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_PORTS:
				return getRequiredPorts();
			case CorePackage.INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS:
				return getCompositeInternalComponents();
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM:
				return getRequiredExecutionPlatform();
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
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_PORTS:
				getRequiredPorts().clear();
				getRequiredPorts().addAll((Collection<? extends RequiredPort>)newValue);
				return;
			case CorePackage.INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS:
				getCompositeInternalComponents().clear();
				getCompositeInternalComponents().addAll((Collection<? extends InternalComponent>)newValue);
				return;
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM:
				setRequiredExecutionPlatform((RequiredExecutionPlatform)newValue);
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
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_PORTS:
				getRequiredPorts().clear();
				return;
			case CorePackage.INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS:
				getCompositeInternalComponents().clear();
				return;
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM:
				setRequiredExecutionPlatform((RequiredExecutionPlatform)null);
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
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_PORTS:
				return requiredPorts != null && !requiredPorts.isEmpty();
			case CorePackage.INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS:
				return compositeInternalComponents != null && !compositeInternalComponents.isEmpty();
			case CorePackage.INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM:
				return requiredExecutionPlatform != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalComponentImpl
