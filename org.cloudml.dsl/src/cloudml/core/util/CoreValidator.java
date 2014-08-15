/**
 */
package cloudml.core.util;

import cloudml.core.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see cloudml.core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "cloudml.core";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CorePackage.CLOUD_ML_ELEMENT:
				return validateCloudMLElement((CloudMLElement)value, diagnostics, context);
			case CorePackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case CorePackage.CLOUD_ML_ELEMENT_WITH_PROPERTIES:
				return validateCloudMLElementWithProperties((CloudMLElementWithProperties)value, diagnostics, context);
			case CorePackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case CorePackage.CLOUD_ML_MODEL:
				return validateCloudMLModel((CloudMLModel)value, diagnostics, context);
			case CorePackage.VM:
				return validateVM((VM)value, diagnostics, context);
			case CorePackage.VM_PORT:
				return validateVMPort((VMPort)value, diagnostics, context);
			case CorePackage.PROVIDER:
				return validateProvider((Provider)value, diagnostics, context);
			case CorePackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case CorePackage.INTERNAL_COMPONENT:
				return validateInternalComponent((InternalComponent)value, diagnostics, context);
			case CorePackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case CorePackage.REQUIRED_PORT:
				return validateRequiredPort((RequiredPort)value, diagnostics, context);
			case CorePackage.PROVIDED_PORT:
				return validateProvidedPort((ProvidedPort)value, diagnostics, context);
			case CorePackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case CorePackage.CLOUD:
				return validateCloud((Cloud)value, diagnostics, context);
			case CorePackage.VM_INSTANCE:
				return validateVMInstance((VMInstance)value, diagnostics, context);
			case CorePackage.VM_PORT_INSTANCE:
				return validateVMPortInstance((VMPortInstance)value, diagnostics, context);
			case CorePackage.COMPONENT_INSTANCE:
				return validateComponentInstance((ComponentInstance)value, diagnostics, context);
			case CorePackage.INTERNAL_COMPONENT_INSTANCE:
				return validateInternalComponentInstance((InternalComponentInstance)value, diagnostics, context);
			case CorePackage.PORT_INSTANCE:
				return validatePortInstance((PortInstance)value, diagnostics, context);
			case CorePackage.REQUIRED_PORT_INSTANCE:
				return validateRequiredPortInstance((RequiredPortInstance)value, diagnostics, context);
			case CorePackage.PROVIDED_PORT_INSTANCE:
				return validateProvidedPortInstance((ProvidedPortInstance)value, diagnostics, context);
			case CorePackage.RELATIONSHIP_INSTANCE:
				return validateRelationshipInstance((RelationshipInstance)value, diagnostics, context);
			case CorePackage.EXTERNAL_COMPONENT:
				return validateExternalComponent((ExternalComponent)value, diagnostics, context);
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE:
				return validateExternalComponentInstance((ExternalComponentInstance)value, diagnostics, context);
			case CorePackage.EXECUTION_PLATFORM:
				return validateExecutionPlatform((ExecutionPlatform)value, diagnostics, context);
			case CorePackage.EXECUTION_PLATFORM_INSTANCE:
				return validateExecutionPlatformInstance((ExecutionPlatformInstance)value, diagnostics, context);
			case CorePackage.PROVIDED_EXECUTION_PLATFORM:
				return validateProvidedExecutionPlatform((ProvidedExecutionPlatform)value, diagnostics, context);
			case CorePackage.PROVIDED_EXECUTION_PLATFORM_INSTANCE:
				return validateProvidedExecutionPlatformInstance((ProvidedExecutionPlatformInstance)value, diagnostics, context);
			case CorePackage.REQUIRED_EXECUTION_PLATFORM:
				return validateRequiredExecutionPlatform((RequiredExecutionPlatform)value, diagnostics, context);
			case CorePackage.REQUIRED_EXECUTION_PLATFORM_INSTANCE:
				return validateRequiredExecutionPlatformInstance((RequiredExecutionPlatformInstance)value, diagnostics, context);
			case CorePackage.EXECUTE_INSTANCE:
				return validateExecuteInstance((ExecuteInstance)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudMLElement(CloudMLElement cloudMLElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloudMLElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudMLElementWithProperties(CloudMLElementWithProperties cloudMLElementWithProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudMLElementWithProperties, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudMLElementWithProperties, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudMLElementWithProperties, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudMLElementWithProperties, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudMLElementWithProperties, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudMLElementWithProperties, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudMLElementWithProperties, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudMLElementWithProperties, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudMLElementWithProperties, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(cloudMLElementWithProperties, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Properties_Names_Duplicated constraint of '<em>Cloud ML Element With Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES_NAMES_DUPLICATED__EEXPRESSION = "properties->forAll(p1, p2 | p1 <> p2 implies p1.name <> p2.name)";

	/**
	 * Validates the Properties_Names_Duplicated constraint of '<em>Cloud ML Element With Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudMLElementWithProperties_Properties_Names_Duplicated(CloudMLElementWithProperties cloudMLElementWithProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.CLOUD_ML_ELEMENT_WITH_PROPERTIES,
				 cloudMLElementWithProperties,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "Properties_Names_Duplicated",
				 CLOUD_ML_ELEMENT_WITH_PROPERTIES__PROPERTIES_NAMES_DUPLICATED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(resource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudMLModel(CloudMLModel cloudMLModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudMLModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudMLModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudMLModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudMLModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudMLModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudMLModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudMLModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudMLModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudMLModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(cloudMLModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_VM_Name_Upper(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVM_Max_Core_Bigger_Than_Min(vm, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the VM_Name_Upper constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM__VM_NAME_UPPER__EEXPRESSION = "name.at(1)=name.at(1).toUpperCase()\r\n" +
		"";

	/**
	 * Validates the VM_Name_Upper constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_VM_Name_Upper(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.VM,
				 vm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "VM_Name_Upper",
				 VM__VM_NAME_UPPER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Max_Core_Bigger_Than_Min constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM__MAX_CORE_BIGGER_THAN_MIN__EEXPRESSION = "minCores <=0 or maxCores <=0 or minCores <= maxCores";

	/**
	 * Validates the Max_Core_Bigger_Than_Min constraint of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVM_Max_Core_Bigger_Than_Min(VM vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.VM,
				 vm,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "Max_Core_Bigger_Than_Min",
				 VM__MAX_CORE_BIGGER_THAN_MIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMPort(VMPort vmPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vmPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vmPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vmPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vmPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vmPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vmPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vmPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vmPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vmPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(vmPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(provider, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(provider, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(provider, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(component, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponent(InternalComponent internalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(internalComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(port, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredPort(RequiredPort requiredPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(requiredPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedPort(ProvidedPort providedPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(providedPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(relationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloud(Cloud cloud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloud, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloud, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(cloud, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMInstance(VMInstance vmInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vmInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vmInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(vmInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMPortInstance(VMPortInstance vmPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vmPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vmPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vmPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vmPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vmPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vmPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vmPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vmPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vmPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(vmPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(componentInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponentInstance(InternalComponentInstance internalComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(internalComponentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(internalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(internalComponentInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInstance(PortInstance portInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(portInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(portInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredPortInstance(RequiredPortInstance requiredPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(requiredPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedPortInstance(ProvidedPortInstance providedPortInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedPortInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedPortInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(providedPortInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipInstance(RelationshipInstance relationshipInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationshipInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipInstance_Relationship_Required_Port_Should_Match_Its_Type(relationshipInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipInstance_Relationship_Provided_Port_Should_Match_Its_Type(relationshipInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the Relationship_Required_Port_Should_Match_Its_Type constraint of '<em>Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP_INSTANCE__RELATIONSHIP_REQUIRED_PORT_SHOULD_MATCH_ITS_TYPE__EEXPRESSION = "if (not type.oclIsUndefined()) and (not requiredPortInstance.oclIsUndefined()) then requiredPortInstance.type = type.requiredPort else true endif";

	/**
	 * Validates the Relationship_Required_Port_Should_Match_Its_Type constraint of '<em>Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipInstance_Relationship_Required_Port_Should_Match_Its_Type(RelationshipInstance relationshipInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.RELATIONSHIP_INSTANCE,
				 relationshipInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "Relationship_Required_Port_Should_Match_Its_Type",
				 RELATIONSHIP_INSTANCE__RELATIONSHIP_REQUIRED_PORT_SHOULD_MATCH_ITS_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Relationship_Provided_Port_Should_Match_Its_Type constraint of '<em>Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP_INSTANCE__RELATIONSHIP_PROVIDED_PORT_SHOULD_MATCH_ITS_TYPE__EEXPRESSION = "if (not type.oclIsUndefined()) and (not providedPortInstance.oclIsUndefined()) then providedPortInstance.type = type.providedPort else true endif";

	/**
	 * Validates the Relationship_Provided_Port_Should_Match_Its_Type constraint of '<em>Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipInstance_Relationship_Provided_Port_Should_Match_Its_Type(RelationshipInstance relationshipInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CorePackage.Literals.RELATIONSHIP_INSTANCE,
				 relationshipInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "Relationship_Provided_Port_Should_Match_Its_Type",
				 RELATIONSHIP_INSTANCE__RELATIONSHIP_PROVIDED_PORT_SHOULD_MATCH_ITS_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalComponent(ExternalComponent externalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(externalComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalComponentInstance(ExternalComponentInstance externalComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalComponentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(externalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(externalComponentInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionPlatform(ExecutionPlatform executionPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionPlatform, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(executionPlatform, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionPlatformInstance(ExecutionPlatformInstance executionPlatformInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionPlatformInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(executionPlatformInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedExecutionPlatform(ProvidedExecutionPlatform providedExecutionPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedExecutionPlatform, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(providedExecutionPlatform, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedExecutionPlatformInstance(ProvidedExecutionPlatformInstance providedExecutionPlatformInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedExecutionPlatformInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(providedExecutionPlatformInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredExecutionPlatform(RequiredExecutionPlatform requiredExecutionPlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredExecutionPlatform, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredExecutionPlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(requiredExecutionPlatform, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance requiredExecutionPlatformInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredExecutionPlatformInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredExecutionPlatformInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(requiredExecutionPlatformInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecuteInstance(ExecuteInstance executeInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executeInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executeInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executeInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executeInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executeInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executeInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executeInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executeInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executeInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudMLElementWithProperties_Properties_Names_Duplicated(executeInstance, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CoreValidator
