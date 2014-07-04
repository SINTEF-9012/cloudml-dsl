/**
 */
package cloudml.core.impl;

import cloudml.core.Cloud;
import cloudml.core.CloudMLModel;
import cloudml.core.Component;
import cloudml.core.ComponentInstance;
import cloudml.core.CorePackage;
import cloudml.core.ExecuteInstance;
import cloudml.core.ExternalComponent;
import cloudml.core.ExternalComponentInstance;
import cloudml.core.InternalComponent;
import cloudml.core.InternalComponentInstance;
import cloudml.core.Provider;
import cloudml.core.Relationship;
import cloudml.core.RelationshipInstance;
import cloudml.core.VM;
import cloudml.core.VMInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud ML Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getClouds <em>Clouds</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getInternalComponents <em>Internal Components</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getExternalComponents <em>External Components</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getInternalComponentInstances <em>Internal Component Instances</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getExternalComponentInstances <em>External Component Instances</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getVms <em>Vms</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getVmInstances <em>Vm Instances</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getRelationshipInstances <em>Relationship Instances</em>}</li>
 *   <li>{@link cloudml.core.impl.CloudMLModelImpl#getExecutesInstances <em>Executes Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudMLModelImpl extends CloudMLElementWithPropertiesImpl implements CloudMLModel {
	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> providers;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getClouds() <em>Clouds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClouds()
	 * @generated
	 * @ordered
	 */
	protected EList<Cloud> clouds;

	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstances;

	/**
	 * The cached value of the '{@link #getInternalComponents() <em>Internal Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalComponent> internalComponents;

	/**
	 * The cached value of the '{@link #getExternalComponents() <em>External Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalComponent> externalComponents;

	/**
	 * The cached value of the '{@link #getInternalComponentInstances() <em>Internal Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalComponentInstance> internalComponentInstances;

	/**
	 * The cached value of the '{@link #getExternalComponentInstances() <em>External Component Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalComponentInstance> externalComponentInstances;

	/**
	 * The cached value of the '{@link #getVms() <em>Vms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVms()
	 * @generated
	 * @ordered
	 */
	protected EList<VM> vms;

	/**
	 * The cached value of the '{@link #getVmInstances() <em>Vm Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<VMInstance> vmInstances;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * The cached value of the '{@link #getRelationshipInstances() <em>Relationship Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipInstance> relationshipInstances;

	/**
	 * The cached value of the '{@link #getExecutesInstances() <em>Executes Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutesInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecuteInstance> executesInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudMLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CLOUD_ML_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provider> getProviders() {
		if (providers == null) {
			providers = new EObjectContainmentEList<Provider>(Provider.class, this, CorePackage.CLOUD_ML_MODEL__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, CorePackage.CLOUD_ML_MODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cloud> getClouds() {
		if (clouds == null) {
			clouds = new EObjectContainmentEList<Cloud>(Cloud.class, this, CorePackage.CLOUD_ML_MODEL__CLOUDS);
		}
		return clouds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, CorePackage.CLOUD_ML_MODEL__COMPONENT_INSTANCES);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalComponent> getInternalComponents() {
		if (internalComponents == null) {
			internalComponents = new EObjectContainmentEList<InternalComponent>(InternalComponent.class, this, CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENTS);
		}
		return internalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalComponent> getExternalComponents() {
		if (externalComponents == null) {
			externalComponents = new EObjectContainmentEList<ExternalComponent>(ExternalComponent.class, this, CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENTS);
		}
		return externalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalComponentInstance> getInternalComponentInstances() {
		if (internalComponentInstances == null) {
			internalComponentInstances = new EObjectContainmentEList<InternalComponentInstance>(InternalComponentInstance.class, this, CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES);
		}
		return internalComponentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalComponentInstance> getExternalComponentInstances() {
		if (externalComponentInstances == null) {
			externalComponentInstances = new EObjectContainmentEList<ExternalComponentInstance>(ExternalComponentInstance.class, this, CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES);
		}
		return externalComponentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VM> getVms() {
		if (vms == null) {
			vms = new EObjectContainmentEList<VM>(VM.class, this, CorePackage.CLOUD_ML_MODEL__VMS);
		}
		return vms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VMInstance> getVmInstances() {
		if (vmInstances == null) {
			vmInstances = new EObjectContainmentEList<VMInstance>(VMInstance.class, this, CorePackage.CLOUD_ML_MODEL__VM_INSTANCES);
		}
		return vmInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, CorePackage.CLOUD_ML_MODEL__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipInstance> getRelationshipInstances() {
		if (relationshipInstances == null) {
			relationshipInstances = new EObjectContainmentEList<RelationshipInstance>(RelationshipInstance.class, this, CorePackage.CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES);
		}
		return relationshipInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecuteInstance> getExecutesInstances() {
		if (executesInstances == null) {
			executesInstances = new EObjectContainmentEList<ExecuteInstance>(ExecuteInstance.class, this, CorePackage.CLOUD_ML_MODEL__EXECUTES_INSTANCES);
		}
		return executesInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CLOUD_ML_MODEL__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__CLOUDS:
				return ((InternalEList<?>)getClouds()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__COMPONENT_INSTANCES:
				return ((InternalEList<?>)getComponentInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENTS:
				return ((InternalEList<?>)getInternalComponents()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENTS:
				return ((InternalEList<?>)getExternalComponents()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES:
				return ((InternalEList<?>)getInternalComponentInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES:
				return ((InternalEList<?>)getExternalComponentInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__VMS:
				return ((InternalEList<?>)getVms()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__VM_INSTANCES:
				return ((InternalEList<?>)getVmInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES:
				return ((InternalEList<?>)getRelationshipInstances()).basicRemove(otherEnd, msgs);
			case CorePackage.CLOUD_ML_MODEL__EXECUTES_INSTANCES:
				return ((InternalEList<?>)getExecutesInstances()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CLOUD_ML_MODEL__PROVIDERS:
				return getProviders();
			case CorePackage.CLOUD_ML_MODEL__COMPONENTS:
				return getComponents();
			case CorePackage.CLOUD_ML_MODEL__CLOUDS:
				return getClouds();
			case CorePackage.CLOUD_ML_MODEL__COMPONENT_INSTANCES:
				return getComponentInstances();
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENTS:
				return getInternalComponents();
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENTS:
				return getExternalComponents();
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES:
				return getInternalComponentInstances();
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES:
				return getExternalComponentInstances();
			case CorePackage.CLOUD_ML_MODEL__VMS:
				return getVms();
			case CorePackage.CLOUD_ML_MODEL__VM_INSTANCES:
				return getVmInstances();
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIPS:
				return getRelationships();
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES:
				return getRelationshipInstances();
			case CorePackage.CLOUD_ML_MODEL__EXECUTES_INSTANCES:
				return getExecutesInstances();
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
			case CorePackage.CLOUD_ML_MODEL__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends Provider>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__CLOUDS:
				getClouds().clear();
				getClouds().addAll((Collection<? extends Cloud>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENTS:
				getInternalComponents().clear();
				getInternalComponents().addAll((Collection<? extends InternalComponent>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENTS:
				getExternalComponents().clear();
				getExternalComponents().addAll((Collection<? extends ExternalComponent>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES:
				getInternalComponentInstances().clear();
				getInternalComponentInstances().addAll((Collection<? extends InternalComponentInstance>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES:
				getExternalComponentInstances().clear();
				getExternalComponentInstances().addAll((Collection<? extends ExternalComponentInstance>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__VMS:
				getVms().clear();
				getVms().addAll((Collection<? extends VM>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__VM_INSTANCES:
				getVmInstances().clear();
				getVmInstances().addAll((Collection<? extends VMInstance>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES:
				getRelationshipInstances().clear();
				getRelationshipInstances().addAll((Collection<? extends RelationshipInstance>)newValue);
				return;
			case CorePackage.CLOUD_ML_MODEL__EXECUTES_INSTANCES:
				getExecutesInstances().clear();
				getExecutesInstances().addAll((Collection<? extends ExecuteInstance>)newValue);
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
			case CorePackage.CLOUD_ML_MODEL__PROVIDERS:
				getProviders().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__COMPONENTS:
				getComponents().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__CLOUDS:
				getClouds().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENTS:
				getInternalComponents().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENTS:
				getExternalComponents().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES:
				getInternalComponentInstances().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES:
				getExternalComponentInstances().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__VMS:
				getVms().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__VM_INSTANCES:
				getVmInstances().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIPS:
				getRelationships().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES:
				getRelationshipInstances().clear();
				return;
			case CorePackage.CLOUD_ML_MODEL__EXECUTES_INSTANCES:
				getExecutesInstances().clear();
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
			case CorePackage.CLOUD_ML_MODEL__PROVIDERS:
				return providers != null && !providers.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__COMPONENTS:
				return components != null && !components.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__CLOUDS:
				return clouds != null && !clouds.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENTS:
				return internalComponents != null && !internalComponents.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENTS:
				return externalComponents != null && !externalComponents.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES:
				return internalComponentInstances != null && !internalComponentInstances.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES:
				return externalComponentInstances != null && !externalComponentInstances.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__VMS:
				return vms != null && !vms.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__VM_INSTANCES:
				return vmInstances != null && !vmInstances.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES:
				return relationshipInstances != null && !relationshipInstances.isEmpty();
			case CorePackage.CLOUD_ML_MODEL__EXECUTES_INSTANCES:
				return executesInstances != null && !executesInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudMLModelImpl
