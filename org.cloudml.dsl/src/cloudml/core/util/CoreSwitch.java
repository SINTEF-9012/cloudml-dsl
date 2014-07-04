/**
 */
package cloudml.core.util;

import cloudml.core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cloudml.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.CLOUD_ML_ELEMENT: {
				CloudMLElement cloudMLElement = (CloudMLElement)theEObject;
				T result = caseCloudMLElement(cloudMLElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseCloudMLElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CLOUD_ML_ELEMENT_WITH_PROPERTIES: {
				CloudMLElementWithProperties cloudMLElementWithProperties = (CloudMLElementWithProperties)theEObject;
				T result = caseCloudMLElementWithProperties(cloudMLElementWithProperties);
				if (result == null) result = caseCloudMLElement(cloudMLElementWithProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseCloudMLElementWithProperties(resource);
				if (result == null) result = caseCloudMLElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CLOUD_ML_MODEL: {
				CloudMLModel cloudMLModel = (CloudMLModel)theEObject;
				T result = caseCloudMLModel(cloudMLModel);
				if (result == null) result = caseCloudMLElementWithProperties(cloudMLModel);
				if (result == null) result = caseCloudMLElement(cloudMLModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VM: {
				VM vm = (VM)theEObject;
				T result = caseVM(vm);
				if (result == null) result = caseExternalComponent(vm);
				if (result == null) result = caseComponent(vm);
				if (result == null) result = caseCloudMLElementWithProperties(vm);
				if (result == null) result = caseCloudMLElement(vm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VM_PORT: {
				VMPort vmPort = (VMPort)theEObject;
				T result = caseVMPort(vmPort);
				if (result == null) result = caseCloudMLElementWithProperties(vmPort);
				if (result == null) result = caseCloudMLElement(vmPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROVIDER: {
				Provider provider = (Provider)theEObject;
				T result = caseProvider(provider);
				if (result == null) result = caseCloudMLElementWithProperties(provider);
				if (result == null) result = caseCloudMLElement(provider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseCloudMLElementWithProperties(component);
				if (result == null) result = caseCloudMLElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERNAL_COMPONENT: {
				InternalComponent internalComponent = (InternalComponent)theEObject;
				T result = caseInternalComponent(internalComponent);
				if (result == null) result = caseComponent(internalComponent);
				if (result == null) result = caseCloudMLElementWithProperties(internalComponent);
				if (result == null) result = caseCloudMLElement(internalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseCloudMLElementWithProperties(port);
				if (result == null) result = caseCloudMLElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIRED_PORT: {
				RequiredPort requiredPort = (RequiredPort)theEObject;
				T result = caseRequiredPort(requiredPort);
				if (result == null) result = casePort(requiredPort);
				if (result == null) result = caseCloudMLElementWithProperties(requiredPort);
				if (result == null) result = caseCloudMLElement(requiredPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROVIDED_PORT: {
				ProvidedPort providedPort = (ProvidedPort)theEObject;
				T result = caseProvidedPort(providedPort);
				if (result == null) result = casePort(providedPort);
				if (result == null) result = caseCloudMLElementWithProperties(providedPort);
				if (result == null) result = caseCloudMLElement(providedPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseCloudMLElementWithProperties(relationship);
				if (result == null) result = caseCloudMLElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CLOUD: {
				Cloud cloud = (Cloud)theEObject;
				T result = caseCloud(cloud);
				if (result == null) result = caseCloudMLElementWithProperties(cloud);
				if (result == null) result = caseCloudMLElement(cloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VM_INSTANCE: {
				VMInstance vmInstance = (VMInstance)theEObject;
				T result = caseVMInstance(vmInstance);
				if (result == null) result = caseExternalComponentInstance(vmInstance);
				if (result == null) result = caseComponentInstance(vmInstance);
				if (result == null) result = caseCloudMLElementWithProperties(vmInstance);
				if (result == null) result = caseCloudMLElement(vmInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VM_PORT_INSTANCE: {
				VMPortInstance vmPortInstance = (VMPortInstance)theEObject;
				T result = caseVMPortInstance(vmPortInstance);
				if (result == null) result = caseCloudMLElementWithProperties(vmPortInstance);
				if (result == null) result = caseCloudMLElement(vmPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = caseCloudMLElementWithProperties(componentInstance);
				if (result == null) result = caseCloudMLElement(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERNAL_COMPONENT_INSTANCE: {
				InternalComponentInstance internalComponentInstance = (InternalComponentInstance)theEObject;
				T result = caseInternalComponentInstance(internalComponentInstance);
				if (result == null) result = caseComponentInstance(internalComponentInstance);
				if (result == null) result = caseCloudMLElementWithProperties(internalComponentInstance);
				if (result == null) result = caseCloudMLElement(internalComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PORT_INSTANCE: {
				PortInstance portInstance = (PortInstance)theEObject;
				T result = casePortInstance(portInstance);
				if (result == null) result = caseCloudMLElementWithProperties(portInstance);
				if (result == null) result = caseCloudMLElement(portInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIRED_PORT_INSTANCE: {
				RequiredPortInstance requiredPortInstance = (RequiredPortInstance)theEObject;
				T result = caseRequiredPortInstance(requiredPortInstance);
				if (result == null) result = casePortInstance(requiredPortInstance);
				if (result == null) result = caseCloudMLElementWithProperties(requiredPortInstance);
				if (result == null) result = caseCloudMLElement(requiredPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROVIDED_PORT_INSTANCE: {
				ProvidedPortInstance providedPortInstance = (ProvidedPortInstance)theEObject;
				T result = caseProvidedPortInstance(providedPortInstance);
				if (result == null) result = casePortInstance(providedPortInstance);
				if (result == null) result = caseCloudMLElementWithProperties(providedPortInstance);
				if (result == null) result = caseCloudMLElement(providedPortInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RELATIONSHIP_INSTANCE: {
				RelationshipInstance relationshipInstance = (RelationshipInstance)theEObject;
				T result = caseRelationshipInstance(relationshipInstance);
				if (result == null) result = caseCloudMLElementWithProperties(relationshipInstance);
				if (result == null) result = caseCloudMLElement(relationshipInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXTERNAL_COMPONENT: {
				ExternalComponent externalComponent = (ExternalComponent)theEObject;
				T result = caseExternalComponent(externalComponent);
				if (result == null) result = caseComponent(externalComponent);
				if (result == null) result = caseCloudMLElementWithProperties(externalComponent);
				if (result == null) result = caseCloudMLElement(externalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE: {
				ExternalComponentInstance externalComponentInstance = (ExternalComponentInstance)theEObject;
				T result = caseExternalComponentInstance(externalComponentInstance);
				if (result == null) result = caseComponentInstance(externalComponentInstance);
				if (result == null) result = caseCloudMLElementWithProperties(externalComponentInstance);
				if (result == null) result = caseCloudMLElement(externalComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXECUTION_PLATFORM: {
				ExecutionPlatform executionPlatform = (ExecutionPlatform)theEObject;
				T result = caseExecutionPlatform(executionPlatform);
				if (result == null) result = caseCloudMLElementWithProperties(executionPlatform);
				if (result == null) result = caseCloudMLElement(executionPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXECUTION_PLATFORM_INSTANCE: {
				ExecutionPlatformInstance executionPlatformInstance = (ExecutionPlatformInstance)theEObject;
				T result = caseExecutionPlatformInstance(executionPlatformInstance);
				if (result == null) result = caseCloudMLElementWithProperties(executionPlatformInstance);
				if (result == null) result = caseCloudMLElement(executionPlatformInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROVIDED_EXECUTION_PLATFORM: {
				ProvidedExecutionPlatform providedExecutionPlatform = (ProvidedExecutionPlatform)theEObject;
				T result = caseProvidedExecutionPlatform(providedExecutionPlatform);
				if (result == null) result = caseExecutionPlatform(providedExecutionPlatform);
				if (result == null) result = caseCloudMLElementWithProperties(providedExecutionPlatform);
				if (result == null) result = caseCloudMLElement(providedExecutionPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROVIDED_EXECUTION_PLATFORM_INSTANCE: {
				ProvidedExecutionPlatformInstance providedExecutionPlatformInstance = (ProvidedExecutionPlatformInstance)theEObject;
				T result = caseProvidedExecutionPlatformInstance(providedExecutionPlatformInstance);
				if (result == null) result = caseExecutionPlatformInstance(providedExecutionPlatformInstance);
				if (result == null) result = caseCloudMLElementWithProperties(providedExecutionPlatformInstance);
				if (result == null) result = caseCloudMLElement(providedExecutionPlatformInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIRED_EXECUTION_PLATFORM: {
				RequiredExecutionPlatform requiredExecutionPlatform = (RequiredExecutionPlatform)theEObject;
				T result = caseRequiredExecutionPlatform(requiredExecutionPlatform);
				if (result == null) result = caseExecutionPlatform(requiredExecutionPlatform);
				if (result == null) result = caseCloudMLElementWithProperties(requiredExecutionPlatform);
				if (result == null) result = caseCloudMLElement(requiredExecutionPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIRED_EXECUTION_PLATFORM_INSTANCE: {
				RequiredExecutionPlatformInstance requiredExecutionPlatformInstance = (RequiredExecutionPlatformInstance)theEObject;
				T result = caseRequiredExecutionPlatformInstance(requiredExecutionPlatformInstance);
				if (result == null) result = caseExecutionPlatformInstance(requiredExecutionPlatformInstance);
				if (result == null) result = caseCloudMLElementWithProperties(requiredExecutionPlatformInstance);
				if (result == null) result = caseCloudMLElement(requiredExecutionPlatformInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXECUTE_INSTANCE: {
				ExecuteInstance executeInstance = (ExecuteInstance)theEObject;
				T result = caseExecuteInstance(executeInstance);
				if (result == null) result = caseCloudMLElementWithProperties(executeInstance);
				if (result == null) result = caseCloudMLElement(executeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud ML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud ML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudMLElement(CloudMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud ML Element With Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud ML Element With Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudMLElementWithProperties(CloudMLElementWithProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud ML Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud ML Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudMLModel(CloudMLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVM(VM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMPort(VMPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalComponent(InternalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPort(RequiredPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedPort(ProvidedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloud(Cloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMInstance(VMInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VM Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VM Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVMPortInstance(VMPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalComponentInstance(InternalComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortInstance(PortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredPortInstance(RequiredPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Port Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Port Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedPortInstance(ProvidedPortInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipInstance(RelationshipInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalComponent(ExternalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalComponentInstance(ExternalComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPlatform(ExecutionPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Platform Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Platform Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPlatformInstance(ExecutionPlatformInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Execution Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Execution Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedExecutionPlatform(ProvidedExecutionPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Execution Platform Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Execution Platform Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedExecutionPlatformInstance(ProvidedExecutionPlatformInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Execution Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Execution Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredExecutionPlatform(RequiredExecutionPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Execution Platform Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Execution Platform Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredExecutionPlatformInstance(RequiredExecutionPlatformInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteInstance(ExecuteInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
