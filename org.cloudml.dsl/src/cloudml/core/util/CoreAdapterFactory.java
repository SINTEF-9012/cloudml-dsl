/**
 */
package cloudml.core.util;

import cloudml.core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cloudml.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseCloudMLElement(CloudMLElement object) {
				return createCloudMLElementAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseCloudMLElementWithProperties(CloudMLElementWithProperties object) {
				return createCloudMLElementWithPropertiesAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseCloudMLModel(CloudMLModel object) {
				return createCloudMLModelAdapter();
			}
			@Override
			public Adapter caseVM(VM object) {
				return createVMAdapter();
			}
			@Override
			public Adapter caseVMPort(VMPort object) {
				return createVMPortAdapter();
			}
			@Override
			public Adapter caseProvider(Provider object) {
				return createProviderAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseInternalComponent(InternalComponent object) {
				return createInternalComponentAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseRequiredPort(RequiredPort object) {
				return createRequiredPortAdapter();
			}
			@Override
			public Adapter caseProvidedPort(ProvidedPort object) {
				return createProvidedPortAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseCloud(Cloud object) {
				return createCloudAdapter();
			}
			@Override
			public Adapter caseVMInstance(VMInstance object) {
				return createVMInstanceAdapter();
			}
			@Override
			public Adapter caseVMPortInstance(VMPortInstance object) {
				return createVMPortInstanceAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter caseInternalComponentInstance(InternalComponentInstance object) {
				return createInternalComponentInstanceAdapter();
			}
			@Override
			public Adapter casePortInstance(PortInstance object) {
				return createPortInstanceAdapter();
			}
			@Override
			public Adapter caseRequiredPortInstance(RequiredPortInstance object) {
				return createRequiredPortInstanceAdapter();
			}
			@Override
			public Adapter caseProvidedPortInstance(ProvidedPortInstance object) {
				return createProvidedPortInstanceAdapter();
			}
			@Override
			public Adapter caseRelationshipInstance(RelationshipInstance object) {
				return createRelationshipInstanceAdapter();
			}
			@Override
			public Adapter caseExternalComponent(ExternalComponent object) {
				return createExternalComponentAdapter();
			}
			@Override
			public Adapter caseExternalComponentInstance(ExternalComponentInstance object) {
				return createExternalComponentInstanceAdapter();
			}
			@Override
			public Adapter caseExecutionPlatform(ExecutionPlatform object) {
				return createExecutionPlatformAdapter();
			}
			@Override
			public Adapter caseExecutionPlatformInstance(ExecutionPlatformInstance object) {
				return createExecutionPlatformInstanceAdapter();
			}
			@Override
			public Adapter caseProvidedExecutionPlatform(ProvidedExecutionPlatform object) {
				return createProvidedExecutionPlatformAdapter();
			}
			@Override
			public Adapter caseProvidedExecutionPlatformInstance(ProvidedExecutionPlatformInstance object) {
				return createProvidedExecutionPlatformInstanceAdapter();
			}
			@Override
			public Adapter caseRequiredExecutionPlatform(RequiredExecutionPlatform object) {
				return createRequiredExecutionPlatformAdapter();
			}
			@Override
			public Adapter caseRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance object) {
				return createRequiredExecutionPlatformInstanceAdapter();
			}
			@Override
			public Adapter caseExecuteInstance(ExecuteInstance object) {
				return createExecuteInstanceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.CloudMLElement <em>Cloud ML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.CloudMLElement
	 * @generated
	 */
	public Adapter createCloudMLElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.CloudMLElementWithProperties <em>Cloud ML Element With Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.CloudMLElementWithProperties
	 * @generated
	 */
	public Adapter createCloudMLElementWithPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.CloudMLModel <em>Cloud ML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.CloudMLModel
	 * @generated
	 */
	public Adapter createCloudMLModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.VM
	 * @generated
	 */
	public Adapter createVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.VMPort <em>VM Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.VMPort
	 * @generated
	 */
	public Adapter createVMPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.InternalComponent <em>Internal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.InternalComponent
	 * @generated
	 */
	public Adapter createInternalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.RequiredPort
	 * @generated
	 */
	public Adapter createRequiredPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ProvidedPort
	 * @generated
	 */
	public Adapter createProvidedPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.Cloud
	 * @generated
	 */
	public Adapter createCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.VMInstance <em>VM Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.VMInstance
	 * @generated
	 */
	public Adapter createVMInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.VMPortInstance <em>VM Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.VMPortInstance
	 * @generated
	 */
	public Adapter createVMPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.InternalComponentInstance <em>Internal Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.InternalComponentInstance
	 * @generated
	 */
	public Adapter createInternalComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.PortInstance
	 * @generated
	 */
	public Adapter createPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.RequiredPortInstance <em>Required Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.RequiredPortInstance
	 * @generated
	 */
	public Adapter createRequiredPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ProvidedPortInstance <em>Provided Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ProvidedPortInstance
	 * @generated
	 */
	public Adapter createProvidedPortInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.RelationshipInstance <em>Relationship Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.RelationshipInstance
	 * @generated
	 */
	public Adapter createRelationshipInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ExternalComponent <em>External Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ExternalComponent
	 * @generated
	 */
	public Adapter createExternalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ExternalComponentInstance <em>External Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ExternalComponentInstance
	 * @generated
	 */
	public Adapter createExternalComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ExecutionPlatform <em>Execution Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ExecutionPlatform
	 * @generated
	 */
	public Adapter createExecutionPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ExecutionPlatformInstance <em>Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ExecutionPlatformInstance
	 * @generated
	 */
	public Adapter createExecutionPlatformInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ProvidedExecutionPlatform <em>Provided Execution Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ProvidedExecutionPlatform
	 * @generated
	 */
	public Adapter createProvidedExecutionPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ProvidedExecutionPlatformInstance <em>Provided Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ProvidedExecutionPlatformInstance
	 * @generated
	 */
	public Adapter createProvidedExecutionPlatformInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.RequiredExecutionPlatform <em>Required Execution Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.RequiredExecutionPlatform
	 * @generated
	 */
	public Adapter createRequiredExecutionPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.RequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.RequiredExecutionPlatformInstance
	 * @generated
	 */
	public Adapter createRequiredExecutionPlatformInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudml.core.ExecuteInstance <em>Execute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudml.core.ExecuteInstance
	 * @generated
	 */
	public Adapter createExecuteInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
