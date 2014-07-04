/**
 */
package cloudml.core.impl;

import cloudml.core.CorePackage;
import cloudml.core.ExecuteInstance;
import cloudml.core.ProvidedExecutionPlatformInstance;
import cloudml.core.RequiredExecutionPlatformInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.ExecuteInstanceImpl#getProvidedExecutionPlatformInstance <em>Provided Execution Platform Instance</em>}</li>
 *   <li>{@link cloudml.core.impl.ExecuteInstanceImpl#getRequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecuteInstanceImpl extends CloudMLElementWithPropertiesImpl implements ExecuteInstance {
	/**
	 * The cached value of the '{@link #getProvidedExecutionPlatformInstance() <em>Provided Execution Platform Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedExecutionPlatformInstance()
	 * @generated
	 * @ordered
	 */
	protected ProvidedExecutionPlatformInstance providedExecutionPlatformInstance;

	/**
	 * The cached value of the '{@link #getRequiredExecutionPlatformInstance() <em>Required Execution Platform Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredExecutionPlatformInstance()
	 * @generated
	 * @ordered
	 */
	protected RequiredExecutionPlatformInstance requiredExecutionPlatformInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXECUTE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedExecutionPlatformInstance getProvidedExecutionPlatformInstance() {
		if (providedExecutionPlatformInstance != null && providedExecutionPlatformInstance.eIsProxy()) {
			InternalEObject oldProvidedExecutionPlatformInstance = (InternalEObject)providedExecutionPlatformInstance;
			providedExecutionPlatformInstance = (ProvidedExecutionPlatformInstance)eResolveProxy(oldProvidedExecutionPlatformInstance);
			if (providedExecutionPlatformInstance != oldProvidedExecutionPlatformInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE, oldProvidedExecutionPlatformInstance, providedExecutionPlatformInstance));
			}
		}
		return providedExecutionPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedExecutionPlatformInstance basicGetProvidedExecutionPlatformInstance() {
		return providedExecutionPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedExecutionPlatformInstance(ProvidedExecutionPlatformInstance newProvidedExecutionPlatformInstance) {
		ProvidedExecutionPlatformInstance oldProvidedExecutionPlatformInstance = providedExecutionPlatformInstance;
		providedExecutionPlatformInstance = newProvidedExecutionPlatformInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE, oldProvidedExecutionPlatformInstance, providedExecutionPlatformInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredExecutionPlatformInstance getRequiredExecutionPlatformInstance() {
		if (requiredExecutionPlatformInstance != null && requiredExecutionPlatformInstance.eIsProxy()) {
			InternalEObject oldRequiredExecutionPlatformInstance = (InternalEObject)requiredExecutionPlatformInstance;
			requiredExecutionPlatformInstance = (RequiredExecutionPlatformInstance)eResolveProxy(oldRequiredExecutionPlatformInstance);
			if (requiredExecutionPlatformInstance != oldRequiredExecutionPlatformInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE, oldRequiredExecutionPlatformInstance, requiredExecutionPlatformInstance));
			}
		}
		return requiredExecutionPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredExecutionPlatformInstance basicGetRequiredExecutionPlatformInstance() {
		return requiredExecutionPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance newRequiredExecutionPlatformInstance) {
		RequiredExecutionPlatformInstance oldRequiredExecutionPlatformInstance = requiredExecutionPlatformInstance;
		requiredExecutionPlatformInstance = newRequiredExecutionPlatformInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE, oldRequiredExecutionPlatformInstance, requiredExecutionPlatformInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE:
				if (resolve) return getProvidedExecutionPlatformInstance();
				return basicGetProvidedExecutionPlatformInstance();
			case CorePackage.EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
				if (resolve) return getRequiredExecutionPlatformInstance();
				return basicGetRequiredExecutionPlatformInstance();
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
			case CorePackage.EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE:
				setProvidedExecutionPlatformInstance((ProvidedExecutionPlatformInstance)newValue);
				return;
			case CorePackage.EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
				setRequiredExecutionPlatformInstance((RequiredExecutionPlatformInstance)newValue);
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
			case CorePackage.EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE:
				setProvidedExecutionPlatformInstance((ProvidedExecutionPlatformInstance)null);
				return;
			case CorePackage.EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
				setRequiredExecutionPlatformInstance((RequiredExecutionPlatformInstance)null);
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
			case CorePackage.EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE:
				return providedExecutionPlatformInstance != null;
			case CorePackage.EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
				return requiredExecutionPlatformInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecuteInstanceImpl
