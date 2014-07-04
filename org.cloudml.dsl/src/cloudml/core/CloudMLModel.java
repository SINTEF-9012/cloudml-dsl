/**
 */
package cloudml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud ML Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cloudml.core.CloudMLModel#getProviders <em>Providers</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getComponents <em>Components</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getClouds <em>Clouds</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getInternalComponents <em>Internal Components</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getExternalComponents <em>External Components</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getInternalComponentInstances <em>Internal Component Instances</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getExternalComponentInstances <em>External Component Instances</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getVms <em>Vms</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getVmInstances <em>Vm Instances</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getRelationshipInstances <em>Relationship Instances</em>}</li>
 *   <li>{@link cloudml.core.CloudMLModel#getExecutesInstances <em>Executes Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see cloudml.core.CorePackage#getCloudMLModel()
 * @model
 * @generated
 */
public interface CloudMLModel extends CloudMLElementWithProperties {
	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provider> getProviders();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Clouds</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.Cloud}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clouds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clouds</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_Clouds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cloud> getClouds();

	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_ComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstances();

	/**
	 * Returns the value of the '<em><b>Internal Components</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.InternalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Components</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_InternalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalComponent> getInternalComponents();

	/**
	 * Returns the value of the '<em><b>External Components</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.ExternalComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Components</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_ExternalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalComponent> getExternalComponents();

	/**
	 * Returns the value of the '<em><b>Internal Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.InternalComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Component Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Component Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_InternalComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalComponentInstance> getInternalComponentInstances();

	/**
	 * Returns the value of the '<em><b>External Component Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.ExternalComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Component Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Component Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_ExternalComponentInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalComponentInstance> getExternalComponentInstances();

	/**
	 * Returns the value of the '<em><b>Vms</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.VM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vms</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_Vms()
	 * @model containment="true"
	 * @generated
	 */
	EList<VM> getVms();

	/**
	 * Returns the value of the '<em><b>Vm Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.VMInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_VmInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<VMInstance> getVmInstances();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Relationship Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.RelationshipInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_RelationshipInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationshipInstance> getRelationshipInstances();

	/**
	 * Returns the value of the '<em><b>Executes Instances</b></em>' containment reference list.
	 * The list contents are of type {@link cloudml.core.ExecuteInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executes Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executes Instances</em>' containment reference list.
	 * @see cloudml.core.CorePackage#getCloudMLModel_ExecutesInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecuteInstance> getExecutesInstances();

} // CloudMLModel
