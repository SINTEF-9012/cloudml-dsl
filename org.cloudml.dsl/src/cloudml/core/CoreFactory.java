/**
 */
package cloudml.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cloudml.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = cloudml.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Cloud ML Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud ML Model</em>'.
	 * @generated
	 */
	CloudMLModel createCloudMLModel();

	/**
	 * Returns a new object of class '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM</em>'.
	 * @generated
	 */
	VM createVM();

	/**
	 * Returns a new object of class '<em>VM Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Port</em>'.
	 * @generated
	 */
	VMPort createVMPort();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Component</em>'.
	 * @generated
	 */
	InternalComponent createInternalComponent();

	/**
	 * Returns a new object of class '<em>Required Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Port</em>'.
	 * @generated
	 */
	RequiredPort createRequiredPort();

	/**
	 * Returns a new object of class '<em>Provided Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Port</em>'.
	 * @generated
	 */
	ProvidedPort createProvidedPort();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud</em>'.
	 * @generated
	 */
	Cloud createCloud();

	/**
	 * Returns a new object of class '<em>VM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Instance</em>'.
	 * @generated
	 */
	VMInstance createVMInstance();

	/**
	 * Returns a new object of class '<em>VM Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Port Instance</em>'.
	 * @generated
	 */
	VMPortInstance createVMPortInstance();

	/**
	 * Returns a new object of class '<em>Internal Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Component Instance</em>'.
	 * @generated
	 */
	InternalComponentInstance createInternalComponentInstance();

	/**
	 * Returns a new object of class '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Instance</em>'.
	 * @generated
	 */
	PortInstance createPortInstance();

	/**
	 * Returns a new object of class '<em>Required Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Port Instance</em>'.
	 * @generated
	 */
	RequiredPortInstance createRequiredPortInstance();

	/**
	 * Returns a new object of class '<em>Provided Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Port Instance</em>'.
	 * @generated
	 */
	ProvidedPortInstance createProvidedPortInstance();

	/**
	 * Returns a new object of class '<em>Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Instance</em>'.
	 * @generated
	 */
	RelationshipInstance createRelationshipInstance();

	/**
	 * Returns a new object of class '<em>External Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Component</em>'.
	 * @generated
	 */
	ExternalComponent createExternalComponent();

	/**
	 * Returns a new object of class '<em>External Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Component Instance</em>'.
	 * @generated
	 */
	ExternalComponentInstance createExternalComponentInstance();

	/**
	 * Returns a new object of class '<em>Provided Execution Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Execution Platform</em>'.
	 * @generated
	 */
	ProvidedExecutionPlatform createProvidedExecutionPlatform();

	/**
	 * Returns a new object of class '<em>Provided Execution Platform Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Execution Platform Instance</em>'.
	 * @generated
	 */
	ProvidedExecutionPlatformInstance createProvidedExecutionPlatformInstance();

	/**
	 * Returns a new object of class '<em>Required Execution Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Execution Platform</em>'.
	 * @generated
	 */
	RequiredExecutionPlatform createRequiredExecutionPlatform();

	/**
	 * Returns a new object of class '<em>Required Execution Platform Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Execution Platform Instance</em>'.
	 * @generated
	 */
	RequiredExecutionPlatformInstance createRequiredExecutionPlatformInstance();

	/**
	 * Returns a new object of class '<em>Execute Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Instance</em>'.
	 * @generated
	 */
	ExecuteInstance createExecuteInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
