/**
 */
package cloudml.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cloudml.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cloudml.net/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.cloudml.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = cloudml.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link cloudml.core.impl.CloudMLElementImpl <em>Cloud ML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.CloudMLElementImpl
	 * @see cloudml.core.impl.CorePackageImpl#getCloudMLElement()
	 * @generated
	 */
	int CLOUD_ML_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Cloud ML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud ML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.PropertyImpl
	 * @see cloudml.core.impl.CorePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = CLOUD_ML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = CLOUD_ML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = CLOUD_ML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = CLOUD_ML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.CloudMLElementWithPropertiesImpl <em>Cloud ML Element With Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.CloudMLElementWithPropertiesImpl
	 * @see cloudml.core.impl.CorePackageImpl#getCloudMLElementWithProperties()
	 * @generated
	 */
	int CLOUD_ML_ELEMENT_WITH_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME = CLOUD_ML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES = CLOUD_ML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES = CLOUD_ML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cloud ML Element With Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT = CLOUD_ML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cloud ML Element With Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT = CLOUD_ML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ResourceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Download Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOWNLOAD_COMMAND = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upload Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__UPLOAD_COMMAND = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Install Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__INSTALL_COMMAND = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configure Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONFIGURE_COMMAND = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__START_COMMAND = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stop Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__STOP_COMMAND = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Require Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__REQUIRE_CREDENTIALS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Execute Locally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXECUTE_LOCALLY = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.CloudMLModelImpl <em>Cloud ML Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.CloudMLModelImpl
	 * @see cloudml.core.impl.CorePackageImpl#getCloudMLModel()
	 * @generated
	 */
	int CLOUD_ML_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__PROVIDERS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__COMPONENTS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clouds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__CLOUDS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__COMPONENT_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Internal Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__INTERNAL_COMPONENTS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__EXTERNAL_COMPONENTS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Internal Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>External Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Vms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__VMS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Vm Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__VM_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__RELATIONSHIPS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Relationship Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Executes Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL__EXECUTES_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Cloud ML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Cloud ML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ML_MODEL_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ComponentImpl
	 * @see cloudml.core.impl.CorePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_PORTS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Execution Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_EXECUTION_PLATFORMS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ExternalComponentImpl <em>External Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ExternalComponentImpl
	 * @see cloudml.core.impl.CorePackageImpl#getExternalComponent()
	 * @generated
	 */
	int EXTERNAL_COMPONENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__RESOURCES = COMPONENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__PROVIDED_PORTS = COMPONENT__PROVIDED_PORTS;

	/**
	 * The feature id for the '<em><b>Provided Execution Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__PROVIDED_EXECUTION_PLATFORMS = COMPONENT__PROVIDED_EXECUTION_PLATFORMS;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__PROVIDER = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__END_POINT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__PROVIDE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__LOGIN = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__PASSWD = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__LOCATION = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__SERVICE_TYPE = COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT__REGION = COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>External Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>External Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.VMImpl <em>VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.VMImpl
	 * @see cloudml.core.impl.CorePackageImpl#getVM()
	 * @generated
	 */
	int VM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__NAME = EXTERNAL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROPERTIES = EXTERNAL_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__RESOURCES = EXTERNAL_COMPONENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROVIDED_PORTS = EXTERNAL_COMPONENT__PROVIDED_PORTS;

	/**
	 * The feature id for the '<em><b>Provided Execution Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROVIDED_EXECUTION_PLATFORMS = EXTERNAL_COMPONENT__PROVIDED_EXECUTION_PLATFORMS;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROVIDER = EXTERNAL_COMPONENT__PROVIDER;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__END_POINT = EXTERNAL_COMPONENT__END_POINT;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROVIDE = EXTERNAL_COMPONENT__PROVIDE;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__LOGIN = EXTERNAL_COMPONENT__LOGIN;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PASSWD = EXTERNAL_COMPONENT__PASSWD;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__LOCATION = EXTERNAL_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SERVICE_TYPE = EXTERNAL_COMPONENT__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__REGION = EXTERNAL_COMPONENT__REGION;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROVIDED = EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MIN_RAM = EXTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MAX_RAM = EXTERNAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MIN_CORES = EXTERNAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MAX_CORES = EXTERNAL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MIN_STORAGE = EXTERNAL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MAX_STORAGE = EXTERNAL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OS = EXTERNAL_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is64os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__IS64OS = EXTERNAL_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__IMAGE_ID = EXTERNAL_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SECURITY_GROUP = EXTERNAL_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SSH_KEY = EXTERNAL_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PRIVATE_KEY = EXTERNAL_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__GROUP_NAME = EXTERNAL_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = EXTERNAL_COMPONENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = EXTERNAL_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.VMPortImpl <em>VM Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.VMPortImpl
	 * @see cloudml.core.impl.CorePackageImpl#getVMPort()
	 * @generated
	 */
	int VM_PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The number of structural features of the '<em>VM Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VM Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ProviderImpl
	 * @see cloudml.core.impl.CorePackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__CREDENTIALS = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.InternalComponentImpl <em>Internal Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.InternalComponentImpl
	 * @see cloudml.core.impl.CorePackageImpl#getInternalComponent()
	 * @generated
	 */
	int INTERNAL_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__PROPERTIES = COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__RESOURCES = COMPONENT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__PROVIDED_PORTS = COMPONENT__PROVIDED_PORTS;

	/**
	 * The feature id for the '<em><b>Provided Execution Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__PROVIDED_EXECUTION_PLATFORMS = COMPONENT__PROVIDED_EXECUTION_PLATFORMS;

	/**
	 * The feature id for the '<em><b>Required Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__REQUIRED_PORTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite Internal Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Execution Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Internal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Internal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.PortImpl
	 * @see cloudml.core.impl.CorePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPONENT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_LOCAL = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_NUMBER = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.RequiredPortImpl <em>Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.RequiredPortImpl
	 * @see cloudml.core.impl.CorePackageImpl#getRequiredPort()
	 * @generated
	 */
	int REQUIRED_PORT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__PROPERTIES = PORT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__RESOURCES = PORT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__COMPONENT = PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Is Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__IS_LOCAL = PORT__IS_LOCAL;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__PORT_NUMBER = PORT__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__IS_MANDATORY = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ProvidedPortImpl
	 * @see cloudml.core.impl.CorePackageImpl#getProvidedPort()
	 * @generated
	 */
	int PROVIDED_PORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__PROPERTIES = PORT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__RESOURCES = PORT__RESOURCES;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__COMPONENT = PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Is Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__IS_LOCAL = PORT__IS_LOCAL;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__PORT_NUMBER = PORT__PORT_NUMBER;

	/**
	 * The number of structural features of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.RelationshipImpl
	 * @see cloudml.core.impl.CorePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__REQUIRED_PORT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PROVIDED_PORT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Port Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__REQUIRED_PORT_RESOURCE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Port Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PROVIDED_PORT_RESOURCE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.CloudImpl
	 * @see cloudml.core.impl.CorePackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Vm Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD__VM_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ComponentInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Execution Platform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ExternalComponentInstanceImpl <em>External Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ExternalComponentInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getExternalComponentInstance()
	 * @generated
	 */
	int EXTERNAL_COMPONENT_INSTANCE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE__PROPERTIES = COMPONENT_INSTANCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE__RESOURCES = COMPONENT_INSTANCE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES = COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE__TYPE = COMPONENT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Provided Execution Platform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES = COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES;

	/**
	 * The feature id for the '<em><b>Ips</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE__IPS = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE__PROVIDE = COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_COMPONENT_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.VMInstanceImpl <em>VM Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.VMInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getVMInstance()
	 * @generated
	 */
	int VM_INSTANCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__NAME = EXTERNAL_COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__PROPERTIES = EXTERNAL_COMPONENT_INSTANCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__RESOURCES = EXTERNAL_COMPONENT_INSTANCE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__PROVIDED_PORT_INSTANCES = EXTERNAL_COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__TYPE = EXTERNAL_COMPONENT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Provided Execution Platform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES = EXTERNAL_COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES;

	/**
	 * The feature id for the '<em><b>Ips</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__IPS = EXTERNAL_COMPONENT_INSTANCE__IPS;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__PROVIDE = EXTERNAL_COMPONENT_INSTANCE__PROVIDE;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__PROVIDED = EXTERNAL_COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__PUBLIC_ADDRESS = EXTERNAL_COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VM Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE_FEATURE_COUNT = EXTERNAL_COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>VM Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE_OPERATION_COUNT = EXTERNAL_COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.VMPortInstanceImpl <em>VM Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.VMPortInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getVMPortInstance()
	 * @generated
	 */
	int VM_PORT_INSTANCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT_INSTANCE__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT_INSTANCE__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT_INSTANCE__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT_INSTANCE__TYPE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VM Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT_INSTANCE_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VM Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_PORT_INSTANCE_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.InternalComponentInstanceImpl <em>Internal Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.InternalComponentInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getInternalComponentInstance()
	 * @generated
	 */
	int INTERNAL_COMPONENT_INSTANCE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__PROPERTIES = COMPONENT_INSTANCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__RESOURCES = COMPONENT_INSTANCE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES = COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__TYPE = COMPONENT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Provided Execution Platform Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES = COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES;

	/**
	 * The feature id for the '<em><b>Required Port Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Execution Platform Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE = COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Internal Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.PortInstanceImpl <em>Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.PortInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getPortInstance()
	 * @generated
	 */
	int PORT_INSTANCE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__TYPE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE__COMPONENT_INSTANCE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_INSTANCE_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.RequiredPortInstanceImpl <em>Required Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.RequiredPortInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getRequiredPortInstance()
	 * @generated
	 */
	int REQUIRED_PORT_INSTANCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_INSTANCE__NAME = PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_INSTANCE__PROPERTIES = PORT_INSTANCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_INSTANCE__RESOURCES = PORT_INSTANCE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_INSTANCE__TYPE = PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_INSTANCE__COMPONENT_INSTANCE = PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The number of structural features of the '<em>Required Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_INSTANCE_OPERATION_COUNT = PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ProvidedPortInstanceImpl <em>Provided Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ProvidedPortInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getProvidedPortInstance()
	 * @generated
	 */
	int PROVIDED_PORT_INSTANCE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_INSTANCE__NAME = PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_INSTANCE__PROPERTIES = PORT_INSTANCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_INSTANCE__RESOURCES = PORT_INSTANCE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_INSTANCE__TYPE = PORT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_INSTANCE__COMPONENT_INSTANCE = PORT_INSTANCE__COMPONENT_INSTANCE;

	/**
	 * The number of structural features of the '<em>Provided Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_INSTANCE_FEATURE_COUNT = PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_INSTANCE_OPERATION_COUNT = PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.RelationshipInstanceImpl <em>Relationship Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.RelationshipInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getRelationshipInstance()
	 * @generated
	 */
	int RELATIONSHIP_INSTANCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__TYPE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Port Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_INSTANCE_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ExecutionPlatformImpl <em>Execution Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ExecutionPlatformImpl
	 * @see cloudml.core.impl.CorePackageImpl#getExecutionPlatform()
	 * @generated
	 */
	int EXECUTION_PLATFORM = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM__OWNER = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Execution Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ExecutionPlatformInstanceImpl <em>Execution Platform Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ExecutionPlatformInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getExecutionPlatformInstance()
	 * @generated
	 */
	int EXECUTION_PLATFORM_INSTANCE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_INSTANCE__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_INSTANCE__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_INSTANCE__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_INSTANCE__OWNER = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_INSTANCE__TYPE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execution Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_INSTANCE_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Execution Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLATFORM_INSTANCE_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ProvidedExecutionPlatformImpl <em>Provided Execution Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ProvidedExecutionPlatformImpl
	 * @see cloudml.core.impl.CorePackageImpl#getProvidedExecutionPlatform()
	 * @generated
	 */
	int PROVIDED_EXECUTION_PLATFORM = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM__NAME = EXECUTION_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM__PROPERTIES = EXECUTION_PLATFORM__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM__RESOURCES = EXECUTION_PLATFORM__RESOURCES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM__OWNER = EXECUTION_PLATFORM__OWNER;

	/**
	 * The feature id for the '<em><b>Offers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM__OFFERS = EXECUTION_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided Execution Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_FEATURE_COUNT = EXECUTION_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provided Execution Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_OPERATION_COUNT = EXECUTION_PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ProvidedExecutionPlatformInstanceImpl <em>Provided Execution Platform Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ProvidedExecutionPlatformInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getProvidedExecutionPlatformInstance()
	 * @generated
	 */
	int PROVIDED_EXECUTION_PLATFORM_INSTANCE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_INSTANCE__NAME = EXECUTION_PLATFORM_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_INSTANCE__PROPERTIES = EXECUTION_PLATFORM_INSTANCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_INSTANCE__RESOURCES = EXECUTION_PLATFORM_INSTANCE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_INSTANCE__OWNER = EXECUTION_PLATFORM_INSTANCE__OWNER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_INSTANCE__TYPE = EXECUTION_PLATFORM_INSTANCE__TYPE;

	/**
	 * The number of structural features of the '<em>Provided Execution Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_INSTANCE_FEATURE_COUNT = EXECUTION_PLATFORM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Execution Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_EXECUTION_PLATFORM_INSTANCE_OPERATION_COUNT = EXECUTION_PLATFORM_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.RequiredExecutionPlatformImpl <em>Required Execution Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.RequiredExecutionPlatformImpl
	 * @see cloudml.core.impl.CorePackageImpl#getRequiredExecutionPlatform()
	 * @generated
	 */
	int REQUIRED_EXECUTION_PLATFORM = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM__NAME = EXECUTION_PLATFORM__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM__PROPERTIES = EXECUTION_PLATFORM__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM__RESOURCES = EXECUTION_PLATFORM__RESOURCES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM__OWNER = EXECUTION_PLATFORM__OWNER;

	/**
	 * The feature id for the '<em><b>Demands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM__DEMANDS = EXECUTION_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Execution Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_FEATURE_COUNT = EXECUTION_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Execution Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_OPERATION_COUNT = EXECUTION_PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.RequiredExecutionPlatformInstanceImpl <em>Required Execution Platform Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.RequiredExecutionPlatformInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getRequiredExecutionPlatformInstance()
	 * @generated
	 */
	int REQUIRED_EXECUTION_PLATFORM_INSTANCE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_INSTANCE__NAME = EXECUTION_PLATFORM_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_INSTANCE__PROPERTIES = EXECUTION_PLATFORM_INSTANCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_INSTANCE__RESOURCES = EXECUTION_PLATFORM_INSTANCE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_INSTANCE__OWNER = EXECUTION_PLATFORM_INSTANCE__OWNER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_INSTANCE__TYPE = EXECUTION_PLATFORM_INSTANCE__TYPE;

	/**
	 * The number of structural features of the '<em>Required Execution Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_INSTANCE_FEATURE_COUNT = EXECUTION_PLATFORM_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Execution Platform Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_EXECUTION_PLATFORM_INSTANCE_OPERATION_COUNT = EXECUTION_PLATFORM_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloudml.core.impl.ExecuteInstanceImpl <em>Execute Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloudml.core.impl.ExecuteInstanceImpl
	 * @see cloudml.core.impl.CorePackageImpl#getExecuteInstance()
	 * @generated
	 */
	int EXECUTE_INSTANCE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_INSTANCE__NAME = CLOUD_ML_ELEMENT_WITH_PROPERTIES__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_INSTANCE__PROPERTIES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_INSTANCE__RESOURCES = CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES;

	/**
	 * The feature id for the '<em><b>Provided Execution Platform Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Execution Platform Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_INSTANCE_FEATURE_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Execute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_INSTANCE_OPERATION_COUNT = CLOUD_ML_ELEMENT_WITH_PROPERTIES_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cloudml.core.CloudMLElement <em>Cloud ML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud ML Element</em>'.
	 * @see cloudml.core.CloudMLElement
	 * @generated
	 */
	EClass getCloudMLElement();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.CloudMLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloudml.core.CloudMLElement#getName()
	 * @see #getCloudMLElement()
	 * @generated
	 */
	EAttribute getCloudMLElement_Name();

	/**
	 * Returns the meta object for class '{@link cloudml.core.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see cloudml.core.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cloudml.core.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link cloudml.core.CloudMLElementWithProperties <em>Cloud ML Element With Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud ML Element With Properties</em>'.
	 * @see cloudml.core.CloudMLElementWithProperties
	 * @generated
	 */
	EClass getCloudMLElementWithProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLElementWithProperties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see cloudml.core.CloudMLElementWithProperties#getProperties()
	 * @see #getCloudMLElementWithProperties()
	 * @generated
	 */
	EReference getCloudMLElementWithProperties_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLElementWithProperties#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see cloudml.core.CloudMLElementWithProperties#getResources()
	 * @see #getCloudMLElementWithProperties()
	 * @generated
	 */
	EReference getCloudMLElementWithProperties_Resources();

	/**
	 * Returns the meta object for class '{@link cloudml.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see cloudml.core.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Resource#getDownloadCommand <em>Download Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Command</em>'.
	 * @see cloudml.core.Resource#getDownloadCommand()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_DownloadCommand();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Resource#getUploadCommand <em>Upload Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upload Command</em>'.
	 * @see cloudml.core.Resource#getUploadCommand()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_UploadCommand();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Resource#getInstallCommand <em>Install Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Command</em>'.
	 * @see cloudml.core.Resource#getInstallCommand()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_InstallCommand();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Resource#getConfigureCommand <em>Configure Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configure Command</em>'.
	 * @see cloudml.core.Resource#getConfigureCommand()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ConfigureCommand();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Resource#getStartCommand <em>Start Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Command</em>'.
	 * @see cloudml.core.Resource#getStartCommand()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_StartCommand();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Resource#getStopCommand <em>Stop Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Command</em>'.
	 * @see cloudml.core.Resource#getStopCommand()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_StopCommand();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Resource#isRequireCredentials <em>Require Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Credentials</em>'.
	 * @see cloudml.core.Resource#isRequireCredentials()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_RequireCredentials();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Resource#isExecuteLocally <em>Execute Locally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execute Locally</em>'.
	 * @see cloudml.core.Resource#isExecuteLocally()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ExecuteLocally();

	/**
	 * Returns the meta object for class '{@link cloudml.core.CloudMLModel <em>Cloud ML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud ML Model</em>'.
	 * @see cloudml.core.CloudMLModel
	 * @generated
	 */
	EClass getCloudMLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see cloudml.core.CloudMLModel#getProviders()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_Providers();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see cloudml.core.CloudMLModel#getComponents()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getClouds <em>Clouds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clouds</em>'.
	 * @see cloudml.core.CloudMLModel#getClouds()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_Clouds();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Instances</em>'.
	 * @see cloudml.core.CloudMLModel#getComponentInstances()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_ComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getInternalComponents <em>Internal Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Components</em>'.
	 * @see cloudml.core.CloudMLModel#getInternalComponents()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_InternalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getExternalComponents <em>External Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Components</em>'.
	 * @see cloudml.core.CloudMLModel#getExternalComponents()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_ExternalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getInternalComponentInstances <em>Internal Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Component Instances</em>'.
	 * @see cloudml.core.CloudMLModel#getInternalComponentInstances()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_InternalComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getExternalComponentInstances <em>External Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Component Instances</em>'.
	 * @see cloudml.core.CloudMLModel#getExternalComponentInstances()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_ExternalComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getVms <em>Vms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vms</em>'.
	 * @see cloudml.core.CloudMLModel#getVms()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_Vms();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getVmInstances <em>Vm Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Instances</em>'.
	 * @see cloudml.core.CloudMLModel#getVmInstances()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_VmInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see cloudml.core.CloudMLModel#getRelationships()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getRelationshipInstances <em>Relationship Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Instances</em>'.
	 * @see cloudml.core.CloudMLModel#getRelationshipInstances()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_RelationshipInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.CloudMLModel#getExecutesInstances <em>Executes Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executes Instances</em>'.
	 * @see cloudml.core.CloudMLModel#getExecutesInstances()
	 * @see #getCloudMLModel()
	 * @generated
	 */
	EReference getCloudMLModel_ExecutesInstances();

	/**
	 * Returns the meta object for class '{@link cloudml.core.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM</em>'.
	 * @see cloudml.core.VM
	 * @generated
	 */
	EClass getVM();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.VM#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided</em>'.
	 * @see cloudml.core.VM#getProvided()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_Provided();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getMinRam <em>Min Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Ram</em>'.
	 * @see cloudml.core.VM#getMinRam()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_MinRam();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getMaxRam <em>Max Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ram</em>'.
	 * @see cloudml.core.VM#getMaxRam()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_MaxRam();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getMinCores <em>Min Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cores</em>'.
	 * @see cloudml.core.VM#getMinCores()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_MinCores();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getMaxCores <em>Max Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cores</em>'.
	 * @see cloudml.core.VM#getMaxCores()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_MaxCores();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getMinStorage <em>Min Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Storage</em>'.
	 * @see cloudml.core.VM#getMinStorage()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_MinStorage();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getMaxStorage <em>Max Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Storage</em>'.
	 * @see cloudml.core.VM#getMaxStorage()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_MaxStorage();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see cloudml.core.VM#getOs()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_Os();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#isIs64os <em>Is64os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is64os</em>'.
	 * @see cloudml.core.VM#isIs64os()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_Is64os();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see cloudml.core.VM#getImageId()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group</em>'.
	 * @see cloudml.core.VM#getSecurityGroup()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getSshKey <em>Ssh Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Key</em>'.
	 * @see cloudml.core.VM#getSshKey()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_SshKey();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getPrivateKey <em>Private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Key</em>'.
	 * @see cloudml.core.VM#getPrivateKey()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_PrivateKey();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VM#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see cloudml.core.VM#getGroupName()
	 * @see #getVM()
	 * @generated
	 */
	EAttribute getVM_GroupName();

	/**
	 * Returns the meta object for class '{@link cloudml.core.VMPort <em>VM Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Port</em>'.
	 * @see cloudml.core.VMPort
	 * @generated
	 */
	EClass getVMPort();

	/**
	 * Returns the meta object for class '{@link cloudml.core.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see cloudml.core.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Provider#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credentials</em>'.
	 * @see cloudml.core.Provider#getCredentials()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Credentials();

	/**
	 * Returns the meta object for class '{@link cloudml.core.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see cloudml.core.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.Component#getProvidedPorts <em>Provided Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Ports</em>'.
	 * @see cloudml.core.Component#getProvidedPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.Component#getProvidedExecutionPlatforms <em>Provided Execution Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Execution Platforms</em>'.
	 * @see cloudml.core.Component#getProvidedExecutionPlatforms()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedExecutionPlatforms();

	/**
	 * Returns the meta object for class '{@link cloudml.core.InternalComponent <em>Internal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Component</em>'.
	 * @see cloudml.core.InternalComponent
	 * @generated
	 */
	EClass getInternalComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.InternalComponent#getRequiredPorts <em>Required Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Ports</em>'.
	 * @see cloudml.core.InternalComponent#getRequiredPorts()
	 * @see #getInternalComponent()
	 * @generated
	 */
	EReference getInternalComponent_RequiredPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.InternalComponent#getCompositeInternalComponents <em>Composite Internal Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Internal Components</em>'.
	 * @see cloudml.core.InternalComponent#getCompositeInternalComponents()
	 * @see #getInternalComponent()
	 * @generated
	 */
	EReference getInternalComponent_CompositeInternalComponents();

	/**
	 * Returns the meta object for the containment reference '{@link cloudml.core.InternalComponent#getRequiredExecutionPlatform <em>Required Execution Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Execution Platform</em>'.
	 * @see cloudml.core.InternalComponent#getRequiredExecutionPlatform()
	 * @see #getInternalComponent()
	 * @generated
	 */
	EReference getInternalComponent_RequiredExecutionPlatform();

	/**
	 * Returns the meta object for class '{@link cloudml.core.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see cloudml.core.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.Port#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see cloudml.core.Port#getComponent()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Component();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Port#isIsLocal <em>Is Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local</em>'.
	 * @see cloudml.core.Port#isIsLocal()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsLocal();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.Port#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see cloudml.core.Port#getPortNumber()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_PortNumber();

	/**
	 * Returns the meta object for class '{@link cloudml.core.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Port</em>'.
	 * @see cloudml.core.RequiredPort
	 * @generated
	 */
	EClass getRequiredPort();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.RequiredPort#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see cloudml.core.RequiredPort#isIsMandatory()
	 * @see #getRequiredPort()
	 * @generated
	 */
	EAttribute getRequiredPort_IsMandatory();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Port</em>'.
	 * @see cloudml.core.ProvidedPort
	 * @generated
	 */
	EClass getProvidedPort();

	/**
	 * Returns the meta object for class '{@link cloudml.core.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see cloudml.core.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.Relationship#getRequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Port</em>'.
	 * @see cloudml.core.Relationship#getRequiredPort()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RequiredPort();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.Relationship#getProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Port</em>'.
	 * @see cloudml.core.Relationship#getProvidedPort()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ProvidedPort();

	/**
	 * Returns the meta object for the containment reference '{@link cloudml.core.Relationship#getRequiredPortResource <em>Required Port Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Port Resource</em>'.
	 * @see cloudml.core.Relationship#getRequiredPortResource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RequiredPortResource();

	/**
	 * Returns the meta object for the containment reference '{@link cloudml.core.Relationship#getProvidedPortResource <em>Provided Port Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Port Resource</em>'.
	 * @see cloudml.core.Relationship#getProvidedPortResource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ProvidedPortResource();

	/**
	 * Returns the meta object for class '{@link cloudml.core.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see cloudml.core.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.Cloud#getVmInstances <em>Vm Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Instances</em>'.
	 * @see cloudml.core.Cloud#getVmInstances()
	 * @see #getCloud()
	 * @generated
	 */
	EReference getCloud_VmInstances();

	/**
	 * Returns the meta object for class '{@link cloudml.core.VMInstance <em>VM Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Instance</em>'.
	 * @see cloudml.core.VMInstance
	 * @generated
	 */
	EClass getVMInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.VMInstance#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided</em>'.
	 * @see cloudml.core.VMInstance#getProvided()
	 * @see #getVMInstance()
	 * @generated
	 */
	EReference getVMInstance_Provided();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.VMInstance#getPublicAddress <em>Public Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Address</em>'.
	 * @see cloudml.core.VMInstance#getPublicAddress()
	 * @see #getVMInstance()
	 * @generated
	 */
	EAttribute getVMInstance_PublicAddress();

	/**
	 * Returns the meta object for class '{@link cloudml.core.VMPortInstance <em>VM Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Port Instance</em>'.
	 * @see cloudml.core.VMPortInstance
	 * @generated
	 */
	EClass getVMPortInstance();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.VMPortInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see cloudml.core.VMPortInstance#getType()
	 * @see #getVMPortInstance()
	 * @generated
	 */
	EReference getVMPortInstance_Type();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see cloudml.core.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.ComponentInstance#getProvidedPortInstances <em>Provided Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Port Instances</em>'.
	 * @see cloudml.core.ComponentInstance#getProvidedPortInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ProvidedPortInstances();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see cloudml.core.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.ComponentInstance#getProvidedExecutionPlatformInstances <em>Provided Execution Platform Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Execution Platform Instances</em>'.
	 * @see cloudml.core.ComponentInstance#getProvidedExecutionPlatformInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ProvidedExecutionPlatformInstances();

	/**
	 * Returns the meta object for class '{@link cloudml.core.InternalComponentInstance <em>Internal Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Component Instance</em>'.
	 * @see cloudml.core.InternalComponentInstance
	 * @generated
	 */
	EClass getInternalComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.InternalComponentInstance#getRequiredPortInstances <em>Required Port Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Port Instances</em>'.
	 * @see cloudml.core.InternalComponentInstance#getRequiredPortInstances()
	 * @see #getInternalComponentInstance()
	 * @generated
	 */
	EReference getInternalComponentInstance_RequiredPortInstances();

	/**
	 * Returns the meta object for the containment reference '{@link cloudml.core.InternalComponentInstance#getRequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Execution Platform Instance</em>'.
	 * @see cloudml.core.InternalComponentInstance#getRequiredExecutionPlatformInstance()
	 * @see #getInternalComponentInstance()
	 * @generated
	 */
	EReference getInternalComponentInstance_RequiredExecutionPlatformInstance();

	/**
	 * Returns the meta object for class '{@link cloudml.core.PortInstance <em>Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Instance</em>'.
	 * @see cloudml.core.PortInstance
	 * @generated
	 */
	EClass getPortInstance();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.PortInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see cloudml.core.PortInstance#getType()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_Type();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.PortInstance#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see cloudml.core.PortInstance#getComponentInstance()
	 * @see #getPortInstance()
	 * @generated
	 */
	EReference getPortInstance_ComponentInstance();

	/**
	 * Returns the meta object for class '{@link cloudml.core.RequiredPortInstance <em>Required Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Port Instance</em>'.
	 * @see cloudml.core.RequiredPortInstance
	 * @generated
	 */
	EClass getRequiredPortInstance();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ProvidedPortInstance <em>Provided Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Port Instance</em>'.
	 * @see cloudml.core.ProvidedPortInstance
	 * @generated
	 */
	EClass getProvidedPortInstance();

	/**
	 * Returns the meta object for class '{@link cloudml.core.RelationshipInstance <em>Relationship Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Instance</em>'.
	 * @see cloudml.core.RelationshipInstance
	 * @generated
	 */
	EClass getRelationshipInstance();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.RelationshipInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see cloudml.core.RelationshipInstance#getType()
	 * @see #getRelationshipInstance()
	 * @generated
	 */
	EReference getRelationshipInstance_Type();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.RelationshipInstance#getRequiredPortInstance <em>Required Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Port Instance</em>'.
	 * @see cloudml.core.RelationshipInstance#getRequiredPortInstance()
	 * @see #getRelationshipInstance()
	 * @generated
	 */
	EReference getRelationshipInstance_RequiredPortInstance();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.RelationshipInstance#getProvidedPortInstance <em>Provided Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Port Instance</em>'.
	 * @see cloudml.core.RelationshipInstance#getProvidedPortInstance()
	 * @see #getRelationshipInstance()
	 * @generated
	 */
	EReference getRelationshipInstance_ProvidedPortInstance();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ExternalComponent <em>External Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Component</em>'.
	 * @see cloudml.core.ExternalComponent
	 * @generated
	 */
	EClass getExternalComponent();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.ExternalComponent#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see cloudml.core.ExternalComponent#getProvider()
	 * @see #getExternalComponent()
	 * @generated
	 */
	EReference getExternalComponent_Provider();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.ExternalComponent#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see cloudml.core.ExternalComponent#getEndPoint()
	 * @see #getExternalComponent()
	 * @generated
	 */
	EAttribute getExternalComponent_EndPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.ExternalComponent#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provide</em>'.
	 * @see cloudml.core.ExternalComponent#getProvide()
	 * @see #getExternalComponent()
	 * @generated
	 */
	EReference getExternalComponent_Provide();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.ExternalComponent#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see cloudml.core.ExternalComponent#getLogin()
	 * @see #getExternalComponent()
	 * @generated
	 */
	EAttribute getExternalComponent_Login();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.ExternalComponent#getPasswd <em>Passwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passwd</em>'.
	 * @see cloudml.core.ExternalComponent#getPasswd()
	 * @see #getExternalComponent()
	 * @generated
	 */
	EAttribute getExternalComponent_Passwd();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.ExternalComponent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see cloudml.core.ExternalComponent#getLocation()
	 * @see #getExternalComponent()
	 * @generated
	 */
	EAttribute getExternalComponent_Location();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.ExternalComponent#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see cloudml.core.ExternalComponent#getServiceType()
	 * @see #getExternalComponent()
	 * @generated
	 */
	EAttribute getExternalComponent_ServiceType();

	/**
	 * Returns the meta object for the attribute '{@link cloudml.core.ExternalComponent#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see cloudml.core.ExternalComponent#getRegion()
	 * @see #getExternalComponent()
	 * @generated
	 */
	EAttribute getExternalComponent_Region();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ExternalComponentInstance <em>External Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Component Instance</em>'.
	 * @see cloudml.core.ExternalComponentInstance
	 * @generated
	 */
	EClass getExternalComponentInstance();

	/**
	 * Returns the meta object for the attribute list '{@link cloudml.core.ExternalComponentInstance#getIps <em>Ips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ips</em>'.
	 * @see cloudml.core.ExternalComponentInstance#getIps()
	 * @see #getExternalComponentInstance()
	 * @generated
	 */
	EAttribute getExternalComponentInstance_Ips();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.ExternalComponentInstance#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provide</em>'.
	 * @see cloudml.core.ExternalComponentInstance#getProvide()
	 * @see #getExternalComponentInstance()
	 * @generated
	 */
	EReference getExternalComponentInstance_Provide();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ExecutionPlatform <em>Execution Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Platform</em>'.
	 * @see cloudml.core.ExecutionPlatform
	 * @generated
	 */
	EClass getExecutionPlatform();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.ExecutionPlatform#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see cloudml.core.ExecutionPlatform#getOwner()
	 * @see #getExecutionPlatform()
	 * @generated
	 */
	EReference getExecutionPlatform_Owner();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ExecutionPlatformInstance <em>Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Platform Instance</em>'.
	 * @see cloudml.core.ExecutionPlatformInstance
	 * @generated
	 */
	EClass getExecutionPlatformInstance();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.ExecutionPlatformInstance#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see cloudml.core.ExecutionPlatformInstance#getOwner()
	 * @see #getExecutionPlatformInstance()
	 * @generated
	 */
	EReference getExecutionPlatformInstance_Owner();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.ExecutionPlatformInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see cloudml.core.ExecutionPlatformInstance#getType()
	 * @see #getExecutionPlatformInstance()
	 * @generated
	 */
	EReference getExecutionPlatformInstance_Type();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ProvidedExecutionPlatform <em>Provided Execution Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Execution Platform</em>'.
	 * @see cloudml.core.ProvidedExecutionPlatform
	 * @generated
	 */
	EClass getProvidedExecutionPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.ProvidedExecutionPlatform#getOffers <em>Offers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offers</em>'.
	 * @see cloudml.core.ProvidedExecutionPlatform#getOffers()
	 * @see #getProvidedExecutionPlatform()
	 * @generated
	 */
	EReference getProvidedExecutionPlatform_Offers();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ProvidedExecutionPlatformInstance <em>Provided Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Execution Platform Instance</em>'.
	 * @see cloudml.core.ProvidedExecutionPlatformInstance
	 * @generated
	 */
	EClass getProvidedExecutionPlatformInstance();

	/**
	 * Returns the meta object for class '{@link cloudml.core.RequiredExecutionPlatform <em>Required Execution Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Execution Platform</em>'.
	 * @see cloudml.core.RequiredExecutionPlatform
	 * @generated
	 */
	EClass getRequiredExecutionPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link cloudml.core.RequiredExecutionPlatform#getDemands <em>Demands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Demands</em>'.
	 * @see cloudml.core.RequiredExecutionPlatform#getDemands()
	 * @see #getRequiredExecutionPlatform()
	 * @generated
	 */
	EReference getRequiredExecutionPlatform_Demands();

	/**
	 * Returns the meta object for class '{@link cloudml.core.RequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Execution Platform Instance</em>'.
	 * @see cloudml.core.RequiredExecutionPlatformInstance
	 * @generated
	 */
	EClass getRequiredExecutionPlatformInstance();

	/**
	 * Returns the meta object for class '{@link cloudml.core.ExecuteInstance <em>Execute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute Instance</em>'.
	 * @see cloudml.core.ExecuteInstance
	 * @generated
	 */
	EClass getExecuteInstance();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.ExecuteInstance#getProvidedExecutionPlatformInstance <em>Provided Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Execution Platform Instance</em>'.
	 * @see cloudml.core.ExecuteInstance#getProvidedExecutionPlatformInstance()
	 * @see #getExecuteInstance()
	 * @generated
	 */
	EReference getExecuteInstance_ProvidedExecutionPlatformInstance();

	/**
	 * Returns the meta object for the reference '{@link cloudml.core.ExecuteInstance#getRequiredExecutionPlatformInstance <em>Required Execution Platform Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Execution Platform Instance</em>'.
	 * @see cloudml.core.ExecuteInstance#getRequiredExecutionPlatformInstance()
	 * @see #getExecuteInstance()
	 * @generated
	 */
	EReference getExecuteInstance_RequiredExecutionPlatformInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cloudml.core.impl.CloudMLElementImpl <em>Cloud ML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.CloudMLElementImpl
		 * @see cloudml.core.impl.CorePackageImpl#getCloudMLElement()
		 * @generated
		 */
		EClass CLOUD_ML_ELEMENT = eINSTANCE.getCloudMLElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_ML_ELEMENT__NAME = eINSTANCE.getCloudMLElement_Name();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.PropertyImpl
		 * @see cloudml.core.impl.CorePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.CloudMLElementWithPropertiesImpl <em>Cloud ML Element With Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.CloudMLElementWithPropertiesImpl
		 * @see cloudml.core.impl.CorePackageImpl#getCloudMLElementWithProperties()
		 * @generated
		 */
		EClass CLOUD_ML_ELEMENT_WITH_PROPERTIES = eINSTANCE.getCloudMLElementWithProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES = eINSTANCE.getCloudMLElementWithProperties_Properties();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_ELEMENT_WITH_PROPERTIES__RESOURCES = eINSTANCE.getCloudMLElementWithProperties_Resources();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ResourceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Download Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DOWNLOAD_COMMAND = eINSTANCE.getResource_DownloadCommand();

		/**
		 * The meta object literal for the '<em><b>Upload Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__UPLOAD_COMMAND = eINSTANCE.getResource_UploadCommand();

		/**
		 * The meta object literal for the '<em><b>Install Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__INSTALL_COMMAND = eINSTANCE.getResource_InstallCommand();

		/**
		 * The meta object literal for the '<em><b>Configure Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__CONFIGURE_COMMAND = eINSTANCE.getResource_ConfigureCommand();

		/**
		 * The meta object literal for the '<em><b>Start Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__START_COMMAND = eINSTANCE.getResource_StartCommand();

		/**
		 * The meta object literal for the '<em><b>Stop Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__STOP_COMMAND = eINSTANCE.getResource_StopCommand();

		/**
		 * The meta object literal for the '<em><b>Require Credentials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__REQUIRE_CREDENTIALS = eINSTANCE.getResource_RequireCredentials();

		/**
		 * The meta object literal for the '<em><b>Execute Locally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__EXECUTE_LOCALLY = eINSTANCE.getResource_ExecuteLocally();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.CloudMLModelImpl <em>Cloud ML Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.CloudMLModelImpl
		 * @see cloudml.core.impl.CorePackageImpl#getCloudMLModel()
		 * @generated
		 */
		EClass CLOUD_ML_MODEL = eINSTANCE.getCloudMLModel();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__PROVIDERS = eINSTANCE.getCloudMLModel_Providers();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__COMPONENTS = eINSTANCE.getCloudMLModel_Components();

		/**
		 * The meta object literal for the '<em><b>Clouds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__CLOUDS = eINSTANCE.getCloudMLModel_Clouds();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__COMPONENT_INSTANCES = eINSTANCE.getCloudMLModel_ComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Internal Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__INTERNAL_COMPONENTS = eINSTANCE.getCloudMLModel_InternalComponents();

		/**
		 * The meta object literal for the '<em><b>External Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__EXTERNAL_COMPONENTS = eINSTANCE.getCloudMLModel_ExternalComponents();

		/**
		 * The meta object literal for the '<em><b>Internal Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__INTERNAL_COMPONENT_INSTANCES = eINSTANCE.getCloudMLModel_InternalComponentInstances();

		/**
		 * The meta object literal for the '<em><b>External Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__EXTERNAL_COMPONENT_INSTANCES = eINSTANCE.getCloudMLModel_ExternalComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Vms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__VMS = eINSTANCE.getCloudMLModel_Vms();

		/**
		 * The meta object literal for the '<em><b>Vm Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__VM_INSTANCES = eINSTANCE.getCloudMLModel_VmInstances();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__RELATIONSHIPS = eINSTANCE.getCloudMLModel_Relationships();

		/**
		 * The meta object literal for the '<em><b>Relationship Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__RELATIONSHIP_INSTANCES = eINSTANCE.getCloudMLModel_RelationshipInstances();

		/**
		 * The meta object literal for the '<em><b>Executes Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_ML_MODEL__EXECUTES_INSTANCES = eINSTANCE.getCloudMLModel_ExecutesInstances();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.VMImpl <em>VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.VMImpl
		 * @see cloudml.core.impl.CorePackageImpl#getVM()
		 * @generated
		 */
		EClass VM = eINSTANCE.getVM();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__PROVIDED = eINSTANCE.getVM_Provided();

		/**
		 * The meta object literal for the '<em><b>Min Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__MIN_RAM = eINSTANCE.getVM_MinRam();

		/**
		 * The meta object literal for the '<em><b>Max Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__MAX_RAM = eINSTANCE.getVM_MaxRam();

		/**
		 * The meta object literal for the '<em><b>Min Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__MIN_CORES = eINSTANCE.getVM_MinCores();

		/**
		 * The meta object literal for the '<em><b>Max Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__MAX_CORES = eINSTANCE.getVM_MaxCores();

		/**
		 * The meta object literal for the '<em><b>Min Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__MIN_STORAGE = eINSTANCE.getVM_MinStorage();

		/**
		 * The meta object literal for the '<em><b>Max Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__MAX_STORAGE = eINSTANCE.getVM_MaxStorage();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__OS = eINSTANCE.getVM_Os();

		/**
		 * The meta object literal for the '<em><b>Is64os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__IS64OS = eINSTANCE.getVM_Is64os();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__IMAGE_ID = eINSTANCE.getVM_ImageId();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__SECURITY_GROUP = eINSTANCE.getVM_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Ssh Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__SSH_KEY = eINSTANCE.getVM_SshKey();

		/**
		 * The meta object literal for the '<em><b>Private Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__PRIVATE_KEY = eINSTANCE.getVM_PrivateKey();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__GROUP_NAME = eINSTANCE.getVM_GroupName();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.VMPortImpl <em>VM Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.VMPortImpl
		 * @see cloudml.core.impl.CorePackageImpl#getVMPort()
		 * @generated
		 */
		EClass VM_PORT = eINSTANCE.getVMPort();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ProviderImpl
		 * @see cloudml.core.impl.CorePackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__CREDENTIALS = eINSTANCE.getProvider_Credentials();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ComponentImpl
		 * @see cloudml.core.impl.CorePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_PORTS = eINSTANCE.getComponent_ProvidedPorts();

		/**
		 * The meta object literal for the '<em><b>Provided Execution Platforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_EXECUTION_PLATFORMS = eINSTANCE.getComponent_ProvidedExecutionPlatforms();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.InternalComponentImpl <em>Internal Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.InternalComponentImpl
		 * @see cloudml.core.impl.CorePackageImpl#getInternalComponent()
		 * @generated
		 */
		EClass INTERNAL_COMPONENT = eINSTANCE.getInternalComponent();

		/**
		 * The meta object literal for the '<em><b>Required Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT__REQUIRED_PORTS = eINSTANCE.getInternalComponent_RequiredPorts();

		/**
		 * The meta object literal for the '<em><b>Composite Internal Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS = eINSTANCE.getInternalComponent_CompositeInternalComponents();

		/**
		 * The meta object literal for the '<em><b>Required Execution Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT__REQUIRED_EXECUTION_PLATFORM = eINSTANCE.getInternalComponent_RequiredExecutionPlatform();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.PortImpl
		 * @see cloudml.core.impl.CorePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__COMPONENT = eINSTANCE.getPort_Component();

		/**
		 * The meta object literal for the '<em><b>Is Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_LOCAL = eINSTANCE.getPort_IsLocal();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PORT_NUMBER = eINSTANCE.getPort_PortNumber();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.RequiredPortImpl <em>Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.RequiredPortImpl
		 * @see cloudml.core.impl.CorePackageImpl#getRequiredPort()
		 * @generated
		 */
		EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_PORT__IS_MANDATORY = eINSTANCE.getRequiredPort_IsMandatory();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ProvidedPortImpl
		 * @see cloudml.core.impl.CorePackageImpl#getProvidedPort()
		 * @generated
		 */
		EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.RelationshipImpl
		 * @see cloudml.core.impl.CorePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Required Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__REQUIRED_PORT = eINSTANCE.getRelationship_RequiredPort();

		/**
		 * The meta object literal for the '<em><b>Provided Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__PROVIDED_PORT = eINSTANCE.getRelationship_ProvidedPort();

		/**
		 * The meta object literal for the '<em><b>Required Port Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__REQUIRED_PORT_RESOURCE = eINSTANCE.getRelationship_RequiredPortResource();

		/**
		 * The meta object literal for the '<em><b>Provided Port Resource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__PROVIDED_PORT_RESOURCE = eINSTANCE.getRelationship_ProvidedPortResource();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.CloudImpl
		 * @see cloudml.core.impl.CorePackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '<em><b>Vm Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD__VM_INSTANCES = eINSTANCE.getCloud_VmInstances();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.VMInstanceImpl <em>VM Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.VMInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getVMInstance()
		 * @generated
		 */
		EClass VM_INSTANCE = eINSTANCE.getVMInstance();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_INSTANCE__PROVIDED = eINSTANCE.getVMInstance_Provided();

		/**
		 * The meta object literal for the '<em><b>Public Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_INSTANCE__PUBLIC_ADDRESS = eINSTANCE.getVMInstance_PublicAddress();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.VMPortInstanceImpl <em>VM Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.VMPortInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getVMPortInstance()
		 * @generated
		 */
		EClass VM_PORT_INSTANCE = eINSTANCE.getVMPortInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_PORT_INSTANCE__TYPE = eINSTANCE.getVMPortInstance_Type();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ComponentInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Provided Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PROVIDED_PORT_INSTANCES = eINSTANCE.getComponentInstance_ProvidedPortInstances();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__TYPE = eINSTANCE.getComponentInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Provided Execution Platform Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCES = eINSTANCE.getComponentInstance_ProvidedExecutionPlatformInstances();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.InternalComponentInstanceImpl <em>Internal Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.InternalComponentInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getInternalComponentInstance()
		 * @generated
		 */
		EClass INTERNAL_COMPONENT_INSTANCE = eINSTANCE.getInternalComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Required Port Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT_INSTANCE__REQUIRED_PORT_INSTANCES = eINSTANCE.getInternalComponentInstance_RequiredPortInstances();

		/**
		 * The meta object literal for the '<em><b>Required Execution Platform Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE = eINSTANCE.getInternalComponentInstance_RequiredExecutionPlatformInstance();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.PortInstanceImpl <em>Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.PortInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getPortInstance()
		 * @generated
		 */
		EClass PORT_INSTANCE = eINSTANCE.getPortInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__TYPE = eINSTANCE.getPortInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_INSTANCE__COMPONENT_INSTANCE = eINSTANCE.getPortInstance_ComponentInstance();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.RequiredPortInstanceImpl <em>Required Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.RequiredPortInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getRequiredPortInstance()
		 * @generated
		 */
		EClass REQUIRED_PORT_INSTANCE = eINSTANCE.getRequiredPortInstance();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ProvidedPortInstanceImpl <em>Provided Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ProvidedPortInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getProvidedPortInstance()
		 * @generated
		 */
		EClass PROVIDED_PORT_INSTANCE = eINSTANCE.getProvidedPortInstance();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.RelationshipInstanceImpl <em>Relationship Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.RelationshipInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getRelationshipInstance()
		 * @generated
		 */
		EClass RELATIONSHIP_INSTANCE = eINSTANCE.getRelationshipInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_INSTANCE__TYPE = eINSTANCE.getRelationshipInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Required Port Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_INSTANCE__REQUIRED_PORT_INSTANCE = eINSTANCE.getRelationshipInstance_RequiredPortInstance();

		/**
		 * The meta object literal for the '<em><b>Provided Port Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_INSTANCE__PROVIDED_PORT_INSTANCE = eINSTANCE.getRelationshipInstance_ProvidedPortInstance();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ExternalComponentImpl <em>External Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ExternalComponentImpl
		 * @see cloudml.core.impl.CorePackageImpl#getExternalComponent()
		 * @generated
		 */
		EClass EXTERNAL_COMPONENT = eINSTANCE.getExternalComponent();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_COMPONENT__PROVIDER = eINSTANCE.getExternalComponent_Provider();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_COMPONENT__END_POINT = eINSTANCE.getExternalComponent_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_COMPONENT__PROVIDE = eINSTANCE.getExternalComponent_Provide();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_COMPONENT__LOGIN = eINSTANCE.getExternalComponent_Login();

		/**
		 * The meta object literal for the '<em><b>Passwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_COMPONENT__PASSWD = eINSTANCE.getExternalComponent_Passwd();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_COMPONENT__LOCATION = eINSTANCE.getExternalComponent_Location();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_COMPONENT__SERVICE_TYPE = eINSTANCE.getExternalComponent_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_COMPONENT__REGION = eINSTANCE.getExternalComponent_Region();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ExternalComponentInstanceImpl <em>External Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ExternalComponentInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getExternalComponentInstance()
		 * @generated
		 */
		EClass EXTERNAL_COMPONENT_INSTANCE = eINSTANCE.getExternalComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Ips</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_COMPONENT_INSTANCE__IPS = eINSTANCE.getExternalComponentInstance_Ips();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_COMPONENT_INSTANCE__PROVIDE = eINSTANCE.getExternalComponentInstance_Provide();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ExecutionPlatformImpl <em>Execution Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ExecutionPlatformImpl
		 * @see cloudml.core.impl.CorePackageImpl#getExecutionPlatform()
		 * @generated
		 */
		EClass EXECUTION_PLATFORM = eINSTANCE.getExecutionPlatform();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PLATFORM__OWNER = eINSTANCE.getExecutionPlatform_Owner();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ExecutionPlatformInstanceImpl <em>Execution Platform Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ExecutionPlatformInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getExecutionPlatformInstance()
		 * @generated
		 */
		EClass EXECUTION_PLATFORM_INSTANCE = eINSTANCE.getExecutionPlatformInstance();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PLATFORM_INSTANCE__OWNER = eINSTANCE.getExecutionPlatformInstance_Owner();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PLATFORM_INSTANCE__TYPE = eINSTANCE.getExecutionPlatformInstance_Type();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ProvidedExecutionPlatformImpl <em>Provided Execution Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ProvidedExecutionPlatformImpl
		 * @see cloudml.core.impl.CorePackageImpl#getProvidedExecutionPlatform()
		 * @generated
		 */
		EClass PROVIDED_EXECUTION_PLATFORM = eINSTANCE.getProvidedExecutionPlatform();

		/**
		 * The meta object literal for the '<em><b>Offers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_EXECUTION_PLATFORM__OFFERS = eINSTANCE.getProvidedExecutionPlatform_Offers();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ProvidedExecutionPlatformInstanceImpl <em>Provided Execution Platform Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ProvidedExecutionPlatformInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getProvidedExecutionPlatformInstance()
		 * @generated
		 */
		EClass PROVIDED_EXECUTION_PLATFORM_INSTANCE = eINSTANCE.getProvidedExecutionPlatformInstance();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.RequiredExecutionPlatformImpl <em>Required Execution Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.RequiredExecutionPlatformImpl
		 * @see cloudml.core.impl.CorePackageImpl#getRequiredExecutionPlatform()
		 * @generated
		 */
		EClass REQUIRED_EXECUTION_PLATFORM = eINSTANCE.getRequiredExecutionPlatform();

		/**
		 * The meta object literal for the '<em><b>Demands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_EXECUTION_PLATFORM__DEMANDS = eINSTANCE.getRequiredExecutionPlatform_Demands();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.RequiredExecutionPlatformInstanceImpl <em>Required Execution Platform Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.RequiredExecutionPlatformInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getRequiredExecutionPlatformInstance()
		 * @generated
		 */
		EClass REQUIRED_EXECUTION_PLATFORM_INSTANCE = eINSTANCE.getRequiredExecutionPlatformInstance();

		/**
		 * The meta object literal for the '{@link cloudml.core.impl.ExecuteInstanceImpl <em>Execute Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloudml.core.impl.ExecuteInstanceImpl
		 * @see cloudml.core.impl.CorePackageImpl#getExecuteInstance()
		 * @generated
		 */
		EClass EXECUTE_INSTANCE = eINSTANCE.getExecuteInstance();

		/**
		 * The meta object literal for the '<em><b>Provided Execution Platform Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTE_INSTANCE__PROVIDED_EXECUTION_PLATFORM_INSTANCE = eINSTANCE.getExecuteInstance_ProvidedExecutionPlatformInstance();

		/**
		 * The meta object literal for the '<em><b>Required Execution Platform Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTE_INSTANCE__REQUIRED_EXECUTION_PLATFORM_INSTANCE = eINSTANCE.getExecuteInstance_RequiredExecutionPlatformInstance();

	}

} //CorePackage
