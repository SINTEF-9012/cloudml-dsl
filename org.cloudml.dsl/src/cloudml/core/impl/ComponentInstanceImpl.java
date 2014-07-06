/**
 */
package cloudml.core.impl;

import cloudml.core.Component;
import cloudml.core.ComponentInstance;
import cloudml.core.CoreFactory;
import cloudml.core.CorePackage;
import cloudml.core.ProvidedExecutionPlatform;
import cloudml.core.ProvidedExecutionPlatformInstance;
import cloudml.core.ProvidedPort;
import cloudml.core.ProvidedPortInstance;

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
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.ComponentInstanceImpl#getProvidedPortInstances <em>Provided Port Instances</em>}</li>
 *   <li>{@link cloudml.core.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link cloudml.core.impl.ComponentInstanceImpl#getProvidedExecutionPlatformInstances <em>Provided Execution Platform Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentInstanceImpl extends CloudMLElementWithPropertiesImpl implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getProvidedPortInstances() <em>Provided Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedPortInstance> providedPortInstances;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Component type;

	/**
	 * The cached value of the '{@link #getProvidedExecutionPlatformInstances() <em>Provided Execution Platform Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedExecutionPlatformInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedExecutionPlatformInstance> providedExecutionPlatformInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedPortInstance> getProvidedPortInstances() {
		if (providedPortInstances == null) {
			providedPortInstances = new EObjectContainmentEList<ProvidedPortInstance>(ProvidedPortInstance.class, this, CorePackage.COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES);
		}
		return providedPortInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Component)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.COMPONENT_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setType(Component newType) {
		Component oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT_INSTANCE__TYPE, oldType, type));
		
		if(type == null)
			return;
		if (type.getProvidedPorts()!=null){
			this.getProvidedPortInstances().clear();
			for(ProvidedPort provided : newType.getProvidedPorts()){
				ProvidedPortInstance providedInstance = CoreFactory.eINSTANCE.createProvidedPortInstance();
				providedInstance.setName(provided.getName());
				providedInstance.setComponentInstance(this);
				providedInstance.setType(provided);
				this.getProvidedPortInstances().add(providedInstance);
			}
		}
		if(type.getProvidedExecutionPlatforms()!=null){
			this.getProvidedExecutionPlatformInstances().clear();
			for(ProvidedExecutionPlatform execution : type.getProvidedExecutionPlatforms()){
				ProvidedExecutionPlatformInstance executionInstance = CoreFactory.eINSTANCE.createProvidedExecutionPlatformInstance();
				executionInstance.setType(execution);
				executionInstance.setName(execution.getName());
				executionInstance.setOwner(this);
				this.getProvidedExecutionPlatformInstances().add(executionInstance);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedExecutionPlatformInstance> getProvidedExecutionPlatformInstances() {
		if (providedExecutionPlatformInstances == null) {
			providedExecutionPlatformInstances = new EObjectContainmentEList<ProvidedExecutionPlatformInstance>(ProvidedExecutionPlatformInstance.class, this, CorePackage.COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES);
		}
		return providedExecutionPlatformInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES:
				return ((InternalEList<?>)getProvidedPortInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES:
				return ((InternalEList<?>)getProvidedExecutionPlatformInstances()).basicRemove(otherEnd, msgs);
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
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES:
				return getProvidedPortInstances();
			case CorePackage.COMPONENT_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES:
				return getProvidedExecutionPlatformInstances();
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
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES:
				getProvidedPortInstances().clear();
				getProvidedPortInstances().addAll((Collection<? extends ProvidedPortInstance>)newValue);
				return;
			case CorePackage.COMPONENT_INSTANCE__TYPE:
				setType((Component)newValue);
				return;
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES:
				getProvidedExecutionPlatformInstances().clear();
				getProvidedExecutionPlatformInstances().addAll((Collection<? extends ProvidedExecutionPlatformInstance>)newValue);
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
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES:
				getProvidedPortInstances().clear();
				return;
			case CorePackage.COMPONENT_INSTANCE__TYPE:
				setType((Component)null);
				return;
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES:
				getProvidedExecutionPlatformInstances().clear();
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
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES:
				return providedPortInstances != null && !providedPortInstances.isEmpty();
			case CorePackage.COMPONENT_INSTANCE__TYPE:
				return type != null;
			case CorePackage.COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES:
				return providedExecutionPlatformInstances != null && !providedExecutionPlatformInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	


} //ComponentInstanceImpl
