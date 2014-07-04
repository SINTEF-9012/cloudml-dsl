/**
 */
package cloudml.core.impl;

import cloudml.core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.PROPERTY: return createProperty();
			case CorePackage.RESOURCE: return createResource();
			case CorePackage.CLOUD_ML_MODEL: return createCloudMLModel();
			case CorePackage.VM: return createVM();
			case CorePackage.VM_PORT: return createVMPort();
			case CorePackage.PROVIDER: return createProvider();
			case CorePackage.INTERNAL_COMPONENT: return createInternalComponent();
			case CorePackage.REQUIRED_PORT: return createRequiredPort();
			case CorePackage.PROVIDED_PORT: return createProvidedPort();
			case CorePackage.RELATIONSHIP: return createRelationship();
			case CorePackage.CLOUD: return createCloud();
			case CorePackage.VM_INSTANCE: return createVMInstance();
			case CorePackage.VM_PORT_INSTANCE: return createVMPortInstance();
			case CorePackage.INTERNAL_COMPONENT_INSTANCE: return createInternalComponentInstance();
			case CorePackage.PORT_INSTANCE: return createPortInstance();
			case CorePackage.REQUIRED_PORT_INSTANCE: return createRequiredPortInstance();
			case CorePackage.PROVIDED_PORT_INSTANCE: return createProvidedPortInstance();
			case CorePackage.RELATIONSHIP_INSTANCE: return createRelationshipInstance();
			case CorePackage.EXTERNAL_COMPONENT: return createExternalComponent();
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE: return createExternalComponentInstance();
			case CorePackage.PROVIDED_EXECUTION_PLATFORM: return createProvidedExecutionPlatform();
			case CorePackage.PROVIDED_EXECUTION_PLATFORM_INSTANCE: return createProvidedExecutionPlatformInstance();
			case CorePackage.REQUIRED_EXECUTION_PLATFORM: return createRequiredExecutionPlatform();
			case CorePackage.REQUIRED_EXECUTION_PLATFORM_INSTANCE: return createRequiredExecutionPlatformInstance();
			case CorePackage.EXECUTE_INSTANCE: return createExecuteInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudMLModel createCloudMLModel() {
		CloudMLModelImpl cloudMLModel = new CloudMLModelImpl();
		return cloudMLModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VM createVM() {
		VMImpl vm = new VMImpl();
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMPort createVMPort() {
		VMPortImpl vmPort = new VMPortImpl();
		return vmPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComponent createInternalComponent() {
		InternalComponentImpl internalComponent = new InternalComponentImpl();
		return internalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort createRequiredPort() {
		RequiredPortImpl requiredPort = new RequiredPortImpl();
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort createProvidedPort() {
		ProvidedPortImpl providedPort = new ProvidedPortImpl();
		return providedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud createCloud() {
		CloudImpl cloud = new CloudImpl();
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMInstance createVMInstance() {
		VMInstanceImpl vmInstance = new VMInstanceImpl();
		return vmInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VMPortInstance createVMPortInstance() {
		VMPortInstanceImpl vmPortInstance = new VMPortInstanceImpl();
		return vmPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalComponentInstance createInternalComponentInstance() {
		InternalComponentInstanceImpl internalComponentInstance = new InternalComponentInstanceImpl();
		return internalComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance createPortInstance() {
		PortInstanceImpl portInstance = new PortInstanceImpl();
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPortInstance createRequiredPortInstance() {
		RequiredPortInstanceImpl requiredPortInstance = new RequiredPortInstanceImpl();
		return requiredPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPortInstance createProvidedPortInstance() {
		ProvidedPortInstanceImpl providedPortInstance = new ProvidedPortInstanceImpl();
		return providedPortInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipInstance createRelationshipInstance() {
		RelationshipInstanceImpl relationshipInstance = new RelationshipInstanceImpl();
		return relationshipInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalComponent createExternalComponent() {
		ExternalComponentImpl externalComponent = new ExternalComponentImpl();
		return externalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalComponentInstance createExternalComponentInstance() {
		ExternalComponentInstanceImpl externalComponentInstance = new ExternalComponentInstanceImpl();
		return externalComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedExecutionPlatform createProvidedExecutionPlatform() {
		ProvidedExecutionPlatformImpl providedExecutionPlatform = new ProvidedExecutionPlatformImpl();
		return providedExecutionPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedExecutionPlatformInstance createProvidedExecutionPlatformInstance() {
		ProvidedExecutionPlatformInstanceImpl providedExecutionPlatformInstance = new ProvidedExecutionPlatformInstanceImpl();
		return providedExecutionPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredExecutionPlatform createRequiredExecutionPlatform() {
		RequiredExecutionPlatformImpl requiredExecutionPlatform = new RequiredExecutionPlatformImpl();
		return requiredExecutionPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredExecutionPlatformInstance createRequiredExecutionPlatformInstance() {
		RequiredExecutionPlatformInstanceImpl requiredExecutionPlatformInstance = new RequiredExecutionPlatformInstanceImpl();
		return requiredExecutionPlatformInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteInstance createExecuteInstance() {
		ExecuteInstanceImpl executeInstance = new ExecuteInstanceImpl();
		return executeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
