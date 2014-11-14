/**
 */
package cloudml.core.impl;

import cloudml.CloudmlPackage;

import cloudml.core.Cloud;
import cloudml.core.CloudMLElement;
import cloudml.core.CloudMLElementWithProperties;
import cloudml.core.CloudMLModel;
import cloudml.core.Component;
import cloudml.core.ComponentInstance;
import cloudml.core.CoreFactory;
import cloudml.core.CorePackage;
import cloudml.core.ExecuteInstance;
import cloudml.core.ExecutionPlatform;
import cloudml.core.ExecutionPlatformInstance;
import cloudml.core.ExternalComponent;
import cloudml.core.ExternalComponentInstance;
import cloudml.core.InternalComponent;
import cloudml.core.InternalComponentInstance;
import cloudml.core.Port;
import cloudml.core.PortInstance;
import cloudml.core.Property;
import cloudml.core.ProvidedExecutionPlatform;
import cloudml.core.ProvidedExecutionPlatformInstance;
import cloudml.core.ProvidedPort;
import cloudml.core.ProvidedPortInstance;
import cloudml.core.Provider;
import cloudml.core.Relationship;
import cloudml.core.RelationshipInstance;
import cloudml.core.RequiredExecutionPlatform;
import cloudml.core.RequiredExecutionPlatformInstance;
import cloudml.core.RequiredPort;
import cloudml.core.RequiredPortInstance;
import cloudml.core.Resource;
import cloudml.core.VMInstance;
import cloudml.core.VMPort;
import cloudml.core.VMPortInstance;

import cloudml.core.util.CoreValidator;
import cloudml.impl.CloudmlPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudMLElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudMLElementWithPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudMLModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedPortInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionPlatformInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedExecutionPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedExecutionPlatformInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredExecutionPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredExecutionPlatformInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executeInstanceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cloudml.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CloudmlPackageImpl theCloudmlPackage = (CloudmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CloudmlPackage.eNS_URI) instanceof CloudmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CloudmlPackage.eNS_URI) : CloudmlPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theCloudmlPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theCloudmlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCorePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CoreValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudMLElement() {
		return cloudMLElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudMLElement_Name() {
		return (EAttribute)cloudMLElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudMLElementWithProperties() {
		return cloudMLElementWithPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLElementWithProperties_Properties() {
		return (EReference)cloudMLElementWithPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLElementWithProperties_Resources() {
		return (EReference)cloudMLElementWithPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_DownloadCommand() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_UploadCommand() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_InstallCommand() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ConfigureCommand() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_StartCommand() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_StopCommand() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_RequireCredentials() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_ExecuteLocally() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudMLModel() {
		return cloudMLModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_Providers() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_Components() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_Clouds() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_ComponentInstances() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_InternalComponents() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_ExternalComponents() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_InternalComponentInstances() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_ExternalComponentInstances() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_Vms() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_VmInstances() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_Relationships() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_RelationshipInstances() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudMLModel_ExecutesInstances() {
		return (EReference)cloudMLModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVM() {
		return vmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVM_Provided() {
		return (EReference)vmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_MinRam() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_MaxRam() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_MinCores() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_MaxCores() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_MinStorage() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_MaxStorage() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_Os() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_Is64os() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_ImageId() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_SecurityGroup() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_SshKey() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_PrivateKey() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVM_GroupName() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMPort() {
		return vmPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Credentials() {
		return (EAttribute)providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvidedPorts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvidedExecutionPlatforms() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalComponent() {
		return internalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponent_RequiredPorts() {
		return (EReference)internalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponent_CompositeInternalComponents() {
		return (EReference)internalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponent_RequiredExecutionPlatform() {
		return (EReference)internalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Component() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsLocal() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_PortNumber() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredPort() {
		return requiredPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequiredPort_IsMandatory() {
		return (EAttribute)requiredPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedPort() {
		return providedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_RequiredPort() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_ProvidedPort() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_RequiredPortResource() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_ProvidedPortResource() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloud() {
		return cloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloud_VmInstances() {
		return (EReference)cloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMInstance() {
		return vmInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMInstance_Provided() {
		return (EReference)vmInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVMInstance_PublicAddress() {
		return (EAttribute)vmInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVMPortInstance() {
		return vmPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVMPortInstance_Type() {
		return (EReference)vmPortInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ProvidedPortInstances() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Type() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ProvidedExecutionPlatformInstances() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalComponentInstance() {
		return internalComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponentInstance_RequiredPortInstances() {
		return (EReference)internalComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalComponentInstance_RequiredExecutionPlatformInstance() {
		return (EReference)internalComponentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortInstance() {
		return portInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_Type() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortInstance_ComponentInstance() {
		return (EReference)portInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredPortInstance() {
		return requiredPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedPortInstance() {
		return providedPortInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipInstance() {
		return relationshipInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipInstance_Type() {
		return (EReference)relationshipInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipInstance_RequiredPortInstance() {
		return (EReference)relationshipInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipInstance_ProvidedPortInstance() {
		return (EReference)relationshipInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalComponent() {
		return externalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalComponent_Provider() {
		return (EReference)externalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalComponent_EndPoint() {
		return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalComponent_Provide() {
		return (EReference)externalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalComponent_Login() {
		return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalComponent_Passwd() {
		return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalComponent_Location() {
		return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalComponent_ServiceType() {
		return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalComponent_Region() {
		return (EAttribute)externalComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalComponentInstance() {
		return externalComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalComponentInstance_Ips() {
		return (EAttribute)externalComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalComponentInstance_Provide() {
		return (EReference)externalComponentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionPlatform() {
		return executionPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionPlatform_Owner() {
		return (EReference)executionPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionPlatformInstance() {
		return executionPlatformInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionPlatformInstance_Owner() {
		return (EReference)executionPlatformInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionPlatformInstance_Type() {
		return (EReference)executionPlatformInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedExecutionPlatform() {
		return providedExecutionPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedExecutionPlatform_Offers() {
		return (EReference)providedExecutionPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedExecutionPlatformInstance() {
		return providedExecutionPlatformInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredExecutionPlatform() {
		return requiredExecutionPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredExecutionPlatform_Demands() {
		return (EReference)requiredExecutionPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredExecutionPlatformInstance() {
		return requiredExecutionPlatformInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecuteInstance() {
		return executeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecuteInstance_ProvidedExecutionPlatformInstance() {
		return (EReference)executeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecuteInstance_RequiredExecutionPlatformInstance() {
		return (EReference)executeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cloudMLElementEClass = createEClass(CLOUD_ML_ELEMENT);
		createEAttribute(cloudMLElementEClass, CLOUD_ML_ELEMENT__NAME);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		cloudMLElementWithPropertiesEClass = createEClass(CLOUD_ML_ELEMENT_WITH_PROPERTIES);
		createEReference(cloudMLElementWithPropertiesEClass, CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES);
		createEReference(cloudMLElementWithPropertiesEClass, CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__DOWNLOAD_COMMAND);
		createEAttribute(resourceEClass, RESOURCE__UPLOAD_COMMAND);
		createEAttribute(resourceEClass, RESOURCE__INSTALL_COMMAND);
		createEAttribute(resourceEClass, RESOURCE__CONFIGURE_COMMAND);
		createEAttribute(resourceEClass, RESOURCE__START_COMMAND);
		createEAttribute(resourceEClass, RESOURCE__STOP_COMMAND);
		createEAttribute(resourceEClass, RESOURCE__REQUIRE_CREDENTIALS);
		createEAttribute(resourceEClass, RESOURCE__EXECUTE_LOCALLY);

		cloudMLModelEClass = createEClass(CLOUD_ML_MODEL);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__PROVIDERS);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__COMPONENTS);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__CLOUDS);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__COMPONENT_INSTANCES);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__INTERNAL_COMPONENTS);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__EXTERNAL_COMPONENTS);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__VMS);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__VM_INSTANCES);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__RELATIONSHIPS);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES);
		createEReference(cloudMLModelEClass, CLOUD_ML_MODEL__EXECUTES_INSTANCES);

		vmEClass = createEClass(VM);
		createEReference(vmEClass, VM__PROVIDED);
		createEAttribute(vmEClass, VM__MIN_RAM);
		createEAttribute(vmEClass, VM__MAX_RAM);
		createEAttribute(vmEClass, VM__MIN_CORES);
		createEAttribute(vmEClass, VM__MAX_CORES);
		createEAttribute(vmEClass, VM__MIN_STORAGE);
		createEAttribute(vmEClass, VM__MAX_STORAGE);
		createEAttribute(vmEClass, VM__OS);
		createEAttribute(vmEClass, VM__IS64OS);
		createEAttribute(vmEClass, VM__IMAGE_ID);
		createEAttribute(vmEClass, VM__SECURITY_GROUP);
		createEAttribute(vmEClass, VM__SSH_KEY);
		createEAttribute(vmEClass, VM__PRIVATE_KEY);
		createEAttribute(vmEClass, VM__GROUP_NAME);

		vmPortEClass = createEClass(VM_PORT);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__CREDENTIALS);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__PROVIDED_PORTS);
		createEReference(componentEClass, COMPONENT__PROVIDED_EXECUTION_PLATFORMS);

		internalComponentEClass = createEClass(INTERNAL_COMPONENT);
		createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIRED_PORTS);
		createEReference(internalComponentEClass, INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS);
		createEReference(internalComponentEClass, INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__COMPONENT);
		createEAttribute(portEClass, PORT__IS_LOCAL);
		createEAttribute(portEClass, PORT__PORT_NUMBER);

		requiredPortEClass = createEClass(REQUIRED_PORT);
		createEAttribute(requiredPortEClass, REQUIRED_PORT__IS_MANDATORY);

		providedPortEClass = createEClass(PROVIDED_PORT);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__REQUIRED_PORT);
		createEReference(relationshipEClass, RELATIONSHIP__PROVIDED_PORT);
		createEReference(relationshipEClass, RELATIONSHIP__REQUIRED_PORT_RESOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__PROVIDED_PORT_RESOURCE);

		cloudEClass = createEClass(CLOUD);
		createEReference(cloudEClass, CLOUD__VM_INSTANCES);

		vmInstanceEClass = createEClass(VM_INSTANCE);
		createEReference(vmInstanceEClass, VM_INSTANCE__PROVIDED);
		createEAttribute(vmInstanceEClass, VM_INSTANCE__PUBLIC_ADDRESS);

		vmPortInstanceEClass = createEClass(VM_PORT_INSTANCE);
		createEReference(vmPortInstanceEClass, VM_PORT_INSTANCE__TYPE);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__TYPE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES);

		internalComponentInstanceEClass = createEClass(INTERNAL_COMPONENT_INSTANCE);
		createEReference(internalComponentInstanceEClass, INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES);
		createEReference(internalComponentInstanceEClass, INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE);

		portInstanceEClass = createEClass(PORT_INSTANCE);
		createEReference(portInstanceEClass, PORT_INSTANCE__TYPE);
		createEReference(portInstanceEClass, PORT_INSTANCE__COMPONENT_INSTANCE);

		requiredPortInstanceEClass = createEClass(REQUIRED_PORT_INSTANCE);

		providedPortInstanceEClass = createEClass(PROVIDED_PORT_INSTANCE);

		relationshipInstanceEClass = createEClass(RELATIONSHIP_INSTANCE);
		createEReference(relationshipInstanceEClass, RELATIONSHIP_INSTANCE__TYPE);
		createEReference(relationshipInstanceEClass, RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE);
		createEReference(relationshipInstanceEClass, RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE);

		externalComponentEClass = createEClass(EXTERNAL_COMPONENT);
		createEReference(externalComponentEClass, EXTERNAL_COMPONENT__PROVIDER);
		createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__END_POINT);
		createEReference(externalComponentEClass, EXTERNAL_COMPONENT__PROVIDE);
		createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__LOGIN);
		createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__PASSWD);
		createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__LOCATION);
		createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__SERVICE_TYPE);
		createEAttribute(externalComponentEClass, EXTERNAL_COMPONENT__REGION);

		externalComponentInstanceEClass = createEClass(EXTERNAL_COMPONENT_INSTANCE);
		createEAttribute(externalComponentInstanceEClass, EXTERNAL_COMPONENT_INSTANCE__IPS);
		createEReference(externalComponentInstanceEClass, EXTERNAL_COMPONENT_INSTANCE__PROVIDE);

		executionPlatformEClass = createEClass(EXECUTION_PLATFORM);
		createEReference(executionPlatformEClass, EXECUTION_PLATFORM__OWNER);

		executionPlatformInstanceEClass = createEClass(EXECUTION_PLATFORM_INSTANCE);
		createEReference(executionPlatformInstanceEClass, EXECUTION_PLATFORM_INSTANCE__OWNER);
		createEReference(executionPlatformInstanceEClass, EXECUTION_PLATFORM_INSTANCE__TYPE);

		providedExecutionPlatformEClass = createEClass(PROVIDED_EXECUTION_PLATFORM);
		createEReference(providedExecutionPlatformEClass, PROVIDED_EXECUTION_PLATFORM__OFFERS);

		providedExecutionPlatformInstanceEClass = createEClass(PROVIDED_EXECUTION_PLATFORM_INSTANCE);

		requiredExecutionPlatformEClass = createEClass(REQUIRED_EXECUTION_PLATFORM);
		createEReference(requiredExecutionPlatformEClass, REQUIRED_EXECUTION_PLATFORM__DEMANDS);

		requiredExecutionPlatformInstanceEClass = createEClass(REQUIRED_EXECUTION_PLATFORM_INSTANCE);

		executeInstanceEClass = createEClass(EXECUTE_INSTANCE);
		createEReference(executeInstanceEClass, EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE);
		createEReference(executeInstanceEClass, EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		propertyEClass.getESuperTypes().add(this.getCloudMLElement());
		cloudMLElementWithPropertiesEClass.getESuperTypes().add(this.getCloudMLElement());
		resourceEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		cloudMLModelEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		vmEClass.getESuperTypes().add(this.getExternalComponent());
		vmPortEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		providerEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		componentEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		internalComponentEClass.getESuperTypes().add(this.getComponent());
		portEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		requiredPortEClass.getESuperTypes().add(this.getPort());
		providedPortEClass.getESuperTypes().add(this.getPort());
		relationshipEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		cloudEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		vmInstanceEClass.getESuperTypes().add(this.getExternalComponentInstance());
		vmPortInstanceEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		componentInstanceEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		internalComponentInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		portInstanceEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		requiredPortInstanceEClass.getESuperTypes().add(this.getPortInstance());
		providedPortInstanceEClass.getESuperTypes().add(this.getPortInstance());
		relationshipInstanceEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		externalComponentEClass.getESuperTypes().add(this.getComponent());
		externalComponentInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		executionPlatformEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		executionPlatformInstanceEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());
		providedExecutionPlatformEClass.getESuperTypes().add(this.getExecutionPlatform());
		providedExecutionPlatformInstanceEClass.getESuperTypes().add(this.getExecutionPlatformInstance());
		requiredExecutionPlatformEClass.getESuperTypes().add(this.getExecutionPlatform());
		requiredExecutionPlatformInstanceEClass.getESuperTypes().add(this.getExecutionPlatformInstance());
		executeInstanceEClass.getESuperTypes().add(this.getCloudMLElementWithProperties());

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudMLElementEClass, CloudMLElement.class, "CloudMLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudMLElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, CloudMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudMLElementWithPropertiesEClass, CloudMLElementWithProperties.class, "CloudMLElementWithProperties", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudMLElementWithProperties_Properties(), this.getProperty(), null, "properties", null, 0, -1, CloudMLElementWithProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLElementWithProperties_Resources(), this.getResource(), null, "resources", null, 0, -1, CloudMLElementWithProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_DownloadCommand(), ecorePackage.getEString(), "downloadCommand", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_UploadCommand(), ecorePackage.getEString(), "uploadCommand", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_InstallCommand(), ecorePackage.getEString(), "installCommand", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ConfigureCommand(), ecorePackage.getEString(), "configureCommand", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_StartCommand(), ecorePackage.getEString(), "startCommand", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_StopCommand(), ecorePackage.getEString(), "stopCommand", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_RequireCredentials(), ecorePackage.getEBoolean(), "requireCredentials", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_ExecuteLocally(), ecorePackage.getEBoolean(), "executeLocally", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudMLModelEClass, CloudMLModel.class, "CloudMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudMLModel_Providers(), this.getProvider(), null, "providers", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_Components(), this.getComponent(), null, "components", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_Clouds(), this.getCloud(), null, "clouds", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_ComponentInstances(), this.getComponentInstance(), null, "componentInstances", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_InternalComponents(), this.getInternalComponent(), null, "internalComponents", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_ExternalComponents(), this.getExternalComponent(), null, "externalComponents", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_InternalComponentInstances(), this.getInternalComponentInstance(), null, "internalComponentInstances", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_ExternalComponentInstances(), this.getExternalComponentInstance(), null, "externalComponentInstances", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_Vms(), this.getVM(), null, "vms", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_VmInstances(), this.getVMInstance(), null, "vmInstances", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_Relationships(), this.getRelationship(), null, "relationships", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_RelationshipInstances(), this.getRelationshipInstance(), null, "relationshipInstances", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudMLModel_ExecutesInstances(), this.getExecuteInstance(), null, "executesInstances", null, 0, -1, CloudMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmEClass, cloudml.core.VM.class, "VM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVM_Provided(), this.getVMPort(), null, "provided", null, 0, -1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_MinRam(), ecorePackage.getEInt(), "minRam", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_MaxRam(), ecorePackage.getEInt(), "maxRam", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_MinCores(), ecorePackage.getEInt(), "minCores", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_MaxCores(), ecorePackage.getEInt(), "maxCores", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_MinStorage(), ecorePackage.getEInt(), "minStorage", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_MaxStorage(), ecorePackage.getEInt(), "maxStorage", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_Os(), ecorePackage.getEString(), "os", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_Is64os(), ecorePackage.getEBoolean(), "is64os", "true", 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_ImageId(), ecorePackage.getEString(), "imageId", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_SecurityGroup(), ecorePackage.getEString(), "securityGroup", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_SshKey(), ecorePackage.getEString(), "sshKey", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_PrivateKey(), ecorePackage.getEString(), "privateKey", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVM_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, cloudml.core.VM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmPortEClass, VMPort.class, "VMPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_Credentials(), ecorePackage.getEString(), "credentials", null, 1, 1, Provider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_ProvidedPorts(), this.getProvidedPort(), null, "providedPorts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProvidedExecutionPlatforms(), this.getProvidedExecutionPlatform(), null, "providedExecutionPlatforms", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalComponentEClass, InternalComponent.class, "InternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalComponent_RequiredPorts(), this.getRequiredPort(), null, "requiredPorts", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalComponent_CompositeInternalComponents(), this.getInternalComponent(), null, "compositeInternalComponents", null, 0, -1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalComponent_RequiredExecutionPlatform(), this.getRequiredExecutionPlatform(), null, "requiredExecutionPlatform", null, 1, 1, InternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Component(), this.getComponent(), null, "component", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_IsLocal(), ecorePackage.getEBoolean(), "isLocal", "false", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_PortNumber(), ecorePackage.getEInt(), "portNumber", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredPortEClass, RequiredPort.class, "RequiredPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredPort_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 1, 1, RequiredPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedPortEClass, ProvidedPort.class, "ProvidedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RequiredPort(), this.getRequiredPort(), null, "requiredPort", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_ProvidedPort(), this.getProvidedPort(), null, "providedPort", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_RequiredPortResource(), this.getResource(), null, "requiredPortResource", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_ProvidedPortResource(), this.getResource(), null, "providedPortResource", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudEClass, Cloud.class, "Cloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloud_VmInstances(), this.getVMInstance(), null, "vmInstances", null, 0, -1, Cloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmInstanceEClass, VMInstance.class, "VMInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMInstance_Provided(), this.getVMPortInstance(), null, "provided", null, 0, -1, VMInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVMInstance_PublicAddress(), ecorePackage.getEString(), "publicAddress", null, 0, 1, VMInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmPortInstanceEClass, VMPortInstance.class, "VMPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVMPortInstance_Type(), this.getVMPort(), null, "type", null, 1, 1, VMPortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_ProvidedPortInstances(), this.getProvidedPortInstance(), null, "providedPortInstances", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Type(), this.getComponent(), null, "type", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_ProvidedExecutionPlatformInstances(), this.getProvidedExecutionPlatformInstance(), null, "providedExecutionPlatformInstances", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalComponentInstanceEClass, InternalComponentInstance.class, "InternalComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalComponentInstance_RequiredPortInstances(), this.getRequiredPortInstance(), null, "requiredPortInstances", null, 0, -1, InternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalComponentInstance_RequiredExecutionPlatformInstance(), this.getRequiredExecutionPlatformInstance(), null, "requiredExecutionPlatformInstance", null, 1, 1, InternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portInstanceEClass, PortInstance.class, "PortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortInstance_Type(), this.getPort(), null, "type", null, 1, 1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPortInstance_ComponentInstance(), this.getComponentInstance(), null, "componentInstance", null, 1, 1, PortInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredPortInstanceEClass, RequiredPortInstance.class, "RequiredPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedPortInstanceEClass, ProvidedPortInstance.class, "ProvidedPortInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipInstanceEClass, RelationshipInstance.class, "RelationshipInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipInstance_Type(), this.getRelationship(), null, "type", null, 1, 1, RelationshipInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipInstance_RequiredPortInstance(), this.getRequiredPortInstance(), null, "requiredPortInstance", null, 1, 1, RelationshipInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipInstance_ProvidedPortInstance(), this.getProvidedPortInstance(), null, "providedPortInstance", null, 1, 1, RelationshipInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalComponentEClass, ExternalComponent.class, "ExternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalComponent_Provider(), this.getProvider(), null, "provider", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalComponent_EndPoint(), ecorePackage.getEString(), "endPoint", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalComponent_Provide(), this.getVMPort(), null, "provide", null, 0, -1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalComponent_Login(), ecorePackage.getEString(), "login", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalComponent_Passwd(), ecorePackage.getEString(), "passwd", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalComponent_Location(), ecorePackage.getEString(), "location", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalComponent_ServiceType(), ecorePackage.getEString(), "serviceType", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalComponent_Region(), ecorePackage.getEString(), "Region", null, 0, 1, ExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalComponentInstanceEClass, ExternalComponentInstance.class, "ExternalComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalComponentInstance_Ips(), ecorePackage.getEString(), "ips", null, 0, -1, ExternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalComponentInstance_Provide(), this.getVMPortInstance(), null, "provide", null, 0, -1, ExternalComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionPlatformEClass, ExecutionPlatform.class, "ExecutionPlatform", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionPlatform_Owner(), this.getComponent(), null, "owner", null, 1, 1, ExecutionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionPlatformInstanceEClass, ExecutionPlatformInstance.class, "ExecutionPlatformInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionPlatformInstance_Owner(), this.getComponentInstance(), null, "owner", null, 1, 1, ExecutionPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionPlatformInstance_Type(), this.getExecutionPlatform(), null, "type", null, 1, 1, ExecutionPlatformInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedExecutionPlatformEClass, ProvidedExecutionPlatform.class, "ProvidedExecutionPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedExecutionPlatform_Offers(), this.getProperty(), null, "offers", null, 0, -1, ProvidedExecutionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedExecutionPlatformInstanceEClass, ProvidedExecutionPlatformInstance.class, "ProvidedExecutionPlatformInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredExecutionPlatformEClass, RequiredExecutionPlatform.class, "RequiredExecutionPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredExecutionPlatform_Demands(), this.getProperty(), null, "demands", null, 0, -1, RequiredExecutionPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredExecutionPlatformInstanceEClass, RequiredExecutionPlatformInstance.class, "RequiredExecutionPlatformInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executeInstanceEClass, ExecuteInstance.class, "ExecuteInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecuteInstance_ProvidedExecutionPlatformInstance(), this.getProvidedExecutionPlatformInstance(), null, "providedExecutionPlatformInstance", null, 1, 1, ExecuteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecuteInstance_RequiredExecutionPlatformInstance(), this.getRequiredExecutionPlatformInstance(), null, "requiredExecutionPlatformInstance", null, 1, 1, ExecuteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/LPG
		createLPGAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG"
		   });	
		addAnnotation
		  (cloudMLElementWithPropertiesEClass, 
		   source, 
		   new String[] {
			 "constraints", "Properties_Names_Duplicated"
		   });	
		addAnnotation
		  (vmEClass, 
		   source, 
		   new String[] {
			 "constraints", "VM_Name_Upper Max_Core_Bigger_Than_Min"
		   });	
		addAnnotation
		  (relationshipInstanceEClass, 
		   source, 
		   new String[] {
			 "constraints", "Relationship_Required_Port_Should_Match_Its_Type Relationship_Provided_Port_Should_Match_Its_Type"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/LPG</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLPGAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG";	
		addAnnotation
		  (cloudMLElementWithPropertiesEClass, 
		   source, 
		   new String[] {
			 "Properties_Names_Duplicated", "properties->forAll(p1, p2 | p1 <> p2 implies p1.name <> p2.name)"
		   });	
		addAnnotation
		  (vmEClass, 
		   source, 
		   new String[] {
			 "VM_Name_Upper", "name.at(1)=name.at(1).toUpperCase()\r\n",
			 "Max_Core_Bigger_Than_Min", "minCores <=0 or maxCores <=0 or minCores <= maxCores"
		   });	
		addAnnotation
		  (relationshipInstanceEClass, 
		   source, 
		   new String[] {
			 "Relationship_Required_Port_Should_Match_Its_Type", "if (not type.oclIsUndefined()) and (not requiredPortInstance.oclIsUndefined()) then requiredPortInstance.type = type.requiredPort else true endif",
			 "Relationship_Provided_Port_Should_Match_Its_Type", "if (not type.oclIsUndefined()) and (not providedPortInstance.oclIsUndefined()) then providedPortInstance.type = type.providedPort else true endif"
		   });
	}

} //CorePackageImpl
