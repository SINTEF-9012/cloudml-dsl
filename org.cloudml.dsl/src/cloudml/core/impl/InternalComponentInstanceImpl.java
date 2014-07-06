/**
 */
package cloudml.core.impl;

import cloudml.core.Component;
import cloudml.core.CoreFactory;
import cloudml.core.CorePackage;
import cloudml.core.InternalComponent;
import cloudml.core.InternalComponentInstance;
import cloudml.core.RequiredExecutionPlatform;
import cloudml.core.RequiredExecutionPlatformInstance;
import cloudml.core.RequiredPort;
import cloudml.core.RequiredPortInstance;
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
 * An implementation of the model object '<em><b>Internal Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.InternalComponentInstanceImpl#getRequiredPortInstances <em>Required Port Instances</em>}</li>
 *   <li>{@link cloudml.core.impl.InternalComponentInstanceImpl#getRequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalComponentInstanceImpl extends ComponentInstanceImpl implements InternalComponentInstance {
	/**
	 * The cached value of the '{@link #getRequiredPortInstances() <em>Required Port Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPortInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredPortInstance> requiredPortInstances;

	/**
	 * The cached value of the '{@link #getRequiredExecutionPlatformInstance() <em>Required Execution Platform Instance</em>}' containment reference.
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
	protected InternalComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.INTERNAL_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredPortInstance> getRequiredPortInstances() {
		if (requiredPortInstances == null) {
			requiredPortInstances = new EObjectContainmentEList<RequiredPortInstance>(RequiredPortInstance.class, this, CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES);
		}
		return requiredPortInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredExecutionPlatformInstance getRequiredExecutionPlatformInstance() {
		return requiredExecutionPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance newRequiredExecutionPlatformInstance, NotificationChain msgs) {
		RequiredExecutionPlatformInstance oldRequiredExecutionPlatformInstance = requiredExecutionPlatformInstance;
		requiredExecutionPlatformInstance = newRequiredExecutionPlatformInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE, oldRequiredExecutionPlatformInstance, newRequiredExecutionPlatformInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance newRequiredExecutionPlatformInstance) {
		if (newRequiredExecutionPlatformInstance != requiredExecutionPlatformInstance) {
			NotificationChain msgs = null;
			if (requiredExecutionPlatformInstance != null)
				msgs = ((InternalEObject)requiredExecutionPlatformInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE, null, msgs);
			if (newRequiredExecutionPlatformInstance != null)
				msgs = ((InternalEObject)newRequiredExecutionPlatformInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE, null, msgs);
			msgs = basicSetRequiredExecutionPlatformInstance(newRequiredExecutionPlatformInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE, newRequiredExecutionPlatformInstance, newRequiredExecutionPlatformInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES:
				return ((InternalEList<?>)getRequiredPortInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
				return basicSetRequiredExecutionPlatformInstance(null, msgs);
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
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES:
				return getRequiredPortInstances();
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
				return getRequiredExecutionPlatformInstance();
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
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES:
				getRequiredPortInstances().clear();
				getRequiredPortInstances().addAll((Collection<? extends RequiredPortInstance>)newValue);
				return;
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
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
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES:
				getRequiredPortInstances().clear();
				return;
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
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
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES:
				return requiredPortInstances != null && !requiredPortInstances.isEmpty();
			case CorePackage.INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE:
				return requiredExecutionPlatformInstance != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public void setType(Component newType) {
		super.setType(newType);
		
		if(newType==null)
			return;
		if(!(newType instanceof InternalComponent))
			return;
		InternalComponent internalType = (InternalComponent) newType;
		if(internalType.getRequiredPorts()!=null){
			this.getRequiredPortInstances().clear();
			for(RequiredPort required : internalType.getRequiredPorts()){
				RequiredPortInstance requiredInstance = CoreFactory.eINSTANCE.createRequiredPortInstance();
				requiredInstance.setName(required.getName());
				requiredInstance.setComponentInstance(this);
				requiredInstance.setType(required);
				this.getRequiredPortInstances().add(requiredInstance);
			}
		}
		RequiredExecutionPlatform execution = internalType.getRequiredExecutionPlatform();
		if(execution!=null){
			RequiredExecutionPlatformInstance executionInstance = CoreFactory.eINSTANCE.createRequiredExecutionPlatformInstance();
			executionInstance.setType(execution);
			executionInstance.setName(execution.getName());
			executionInstance.setOwner(this);
			this.setRequiredExecutionPlatformInstance(executionInstance);
		}
	}

} //InternalComponentInstanceImpl
