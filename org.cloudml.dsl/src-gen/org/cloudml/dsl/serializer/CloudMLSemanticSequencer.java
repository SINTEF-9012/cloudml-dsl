package org.cloudml.dsl.serializer;

import cloudml.core.CloudMLModel;
import cloudml.core.CorePackage;
import cloudml.core.ExecuteInstance;
import cloudml.core.ExternalComponent;
import cloudml.core.ExternalComponentInstance;
import cloudml.core.InternalComponent;
import cloudml.core.InternalComponentInstance;
import cloudml.core.Property;
import cloudml.core.ProvidedExecutionPlatform;
import cloudml.core.ProvidedPort;
import cloudml.core.Relationship;
import cloudml.core.RelationshipInstance;
import cloudml.core.RequiredExecutionPlatform;
import cloudml.core.RequiredPort;
import cloudml.core.Resource;
import cloudml.core.VM;
import cloudml.core.VMInstance;
import cloudml.core.VMPort;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.cloudml.dsl.services.CloudMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CloudMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CloudMLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CorePackage.CLOUD_ML_MODEL:
				if(context == grammarAccess.getCloudMLRootRule()) {
					sequence_CloudMLRoot(context, (CloudMLModel) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.EXECUTE_INSTANCE:
				if(context == grammarAccess.getExecuteInstanceCSRule()) {
					sequence_ExecuteInstanceCS(context, (ExecuteInstance) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.EXTERNAL_COMPONENT:
				if(context == grammarAccess.getExternalComponentCSRule()) {
					sequence_ExternalComponentCS(context, (ExternalComponent) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.EXTERNAL_COMPONENT_INSTANCE:
				if(context == grammarAccess.getExternalComponentInstanceCSRule()) {
					sequence_ExternalComponentInstanceCS(context, (ExternalComponentInstance) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.INTERNAL_COMPONENT:
				if(context == grammarAccess.getInternalComponentCSRule()) {
					sequence_InternalComponentCS(context, (InternalComponent) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.INTERNAL_COMPONENT_INSTANCE:
				if(context == grammarAccess.getInternalComponentInstanceCSRule()) {
					sequence_InternalComponentInstanceCS(context, (InternalComponentInstance) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.PROPERTY:
				if(context == grammarAccess.getPropertyCSRule()) {
					sequence_PropertyCS(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.PROVIDED_EXECUTION_PLATFORM:
				if(context == grammarAccess.getProvidedExecutionPlatformCSRule()) {
					sequence_ProvidedExecutionPlatformCS(context, (ProvidedExecutionPlatform) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.PROVIDED_PORT:
				if(context == grammarAccess.getProvidedPortCSRule()) {
					sequence_ProvidedPortCS(context, (ProvidedPort) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.PROVIDER:
				if(context == grammarAccess.getProviderCSRule()) {
					sequence_ProviderCS(context, (cloudml.core.Provider) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.RELATIONSHIP:
				if(context == grammarAccess.getRelationshipCSOldRule()) {
					sequence_RelationshipCSOld(context, (Relationship) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRelationshipCSRule()) {
					sequence_RelationshipCS(context, (Relationship) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.RELATIONSHIP_INSTANCE:
				if(context == grammarAccess.getRelationshipInstanceCSRule()) {
					sequence_RelationshipInstanceCS(context, (RelationshipInstance) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.REQUIRED_EXECUTION_PLATFORM:
				if(context == grammarAccess.getRequiredExecutionPlatformCSRule()) {
					sequence_RequiredExecutionPlatformCS(context, (RequiredExecutionPlatform) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.REQUIRED_PORT:
				if(context == grammarAccess.getRequiredPortCSRule()) {
					sequence_RequiredPortCS(context, (RequiredPort) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.RESOURCE:
				if(context == grammarAccess.getResourceCSRule()) {
					sequence_ResourceCS(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.VM:
				if(context == grammarAccess.getVMCSRule()) {
					sequence_VMCS(context, (VM) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.VM_INSTANCE:
				if(context == grammarAccess.getVMInstanceCSRule()) {
					sequence_VMInstanceCS(context, (VMInstance) semanticObject); 
					return; 
				}
				else break;
			case CorePackage.VM_PORT:
				if(context == grammarAccess.getVMPortCSRule()) {
					sequence_VMPortCS(context, (VMPort) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         providers+=ProviderCS* 
	 *         (vms+=VMCS | internalComponents+=InternalComponentCS | externalComponents+=ExternalComponentCS)* 
	 *         relationships+=RelationshipCS* 
	 *         (internalComponentInstances+=InternalComponentInstanceCS | externalComponentInstances+=ExternalComponentInstanceCS | vmInstances+=VMInstanceCS)* 
	 *         relationshipInstances+=RelationshipInstanceCS* 
	 *         executesInstances+=ExecuteInstanceCS*
	 *     )
	 */
	protected void sequence_CloudMLRoot(EObject context, CloudMLModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         requiredExecutionPlatformInstance=[RequiredExecutionPlatformInstance|Fqn] 
	 *         providedExecutionPlatformInstance=[ProvidedExecutionPlatformInstance|Fqn] 
	 *         name=ValidID?
	 *     )
	 */
	protected void sequence_ExecuteInstanceCS(EObject context, ExecuteInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         (providedPorts+=ProvidedPortCS | providedExecutionPlatforms+=ProvidedExecutionPlatformCS)* 
	 *         properties+=PropertyCS* 
	 *         resources+=ResourceCS*
	 *     )
	 */
	protected void sequence_ExternalComponentCS(EObject context, ExternalComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=[ExternalComponent|ID])
	 */
	protected void sequence_ExternalComponentInstanceCS(EObject context, ExternalComponentInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         (
	 *             providedPorts+=ProvidedPortCS | 
	 *             requiredPorts+=RequiredPortCS | 
	 *             requiredExecutionPlatform=RequiredExecutionPlatformCS | 
	 *             providedExecutionPlatforms+=ProvidedExecutionPlatformCS
	 *         )* 
	 *         properties+=PropertyCS* 
	 *         resources+=ResourceCS*
	 *     )
	 */
	protected void sequence_InternalComponentCS(EObject context, InternalComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=[InternalComponent|ID])
	 */
	protected void sequence_InternalComponentInstanceCS(EObject context, InternalComponentInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=STRING)
	 */
	protected void sequence_PropertyCS(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CorePackage.Literals.CLOUD_ML_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.CLOUD_ML_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, CorePackage.Literals.PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CorePackage.Literals.PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyCSAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyCSAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID (offers+=PropertyCS* properties+=PropertyCS*)?)
	 */
	protected void sequence_ProvidedExecutionPlatformCS(EObject context, ProvidedExecutionPlatform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID ((isLocal?='local' | portNumber=INT)* properties+=PropertyCS*)?)
	 */
	protected void sequence_ProvidedPortCS(EObject context, ProvidedPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID credentials=STRING properties+=PropertyCS*)
	 */
	protected void sequence_ProviderCS(EObject context, cloudml.core.Provider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         (
	 *             (requiredPort=[RequiredPort|Fqn] providedPort=[ProvidedPort|Fqn]) | 
	 *             (requiredPort=[RequiredPort|Fqn] providedPort=[ProvidedPort|Fqn] properties+=PropertyCS* resources+=ResourceCS*)
	 *         )
	 *     )
	 */
	protected void sequence_RelationshipCSOld(EObject context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         requiredPort=[RequiredPort|Fqn] 
	 *         providedPort=[ProvidedPort|Fqn] 
	 *         name=ValidID 
	 *         (properties+=PropertyCS* | (properties+=PropertyCS* resources+=ResourceCS*))?
	 *     )
	 */
	protected void sequence_RelationshipCS(EObject context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requiredPortInstance=[RequiredPortInstance|Fqn] providedPortInstance=[ProvidedPortInstance|Fqn] type=[Relationship|ID] name=ValidID?)
	 */
	protected void sequence_RelationshipInstanceCS(EObject context, RelationshipInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID (demands+=PropertyCS* properties+=PropertyCS*)?)
	 */
	protected void sequence_RequiredExecutionPlatformCS(EObject context, RequiredExecutionPlatform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID ((isLocal?='local' | portNumber=INT | isMandatory?='mandatory')* properties+=PropertyCS*)?)
	 */
	protected void sequence_RequiredPortCS(EObject context, RequiredPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID? 
	 *         (
	 *             downloadCommand=STRING | 
	 *             uploadCommand=STRING | 
	 *             installCommand=STRING | 
	 *             configureCommand=STRING | 
	 *             startCommand=STRING | 
	 *             stopCommand=STRING | 
	 *             requireCredentials?='requireCredentials' | 
	 *             executeLocally?='executeLocally'
	 *         )*
	 *     )
	 */
	protected void sequence_ResourceCS(EObject context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ValidID 
	 *         (
	 *             provider=[Provider|ID] | 
	 *             groupName=STRING | 
	 *             imageId=STRING | 
	 *             is64os?='os64' | 
	 *             location=STRING | 
	 *             login=STRING | 
	 *             (minCores=INT maxCores=INT?) | 
	 *             (minRam=INT maxRam=INT?) | 
	 *             (minStorage=INT maxStorage=INT?) | 
	 *             os=STRING | 
	 *             passwd=STRING | 
	 *             privateKey=STRING | 
	 *             Region=STRING | 
	 *             securityGroup=STRING | 
	 *             serviceType=STRING | 
	 *             sshKey=STRING
	 *         )* 
	 *         providedPorts+=ProvidedPortCS* 
	 *         providedExecutionPlatforms+=ProvidedExecutionPlatformCS* 
	 *         properties+=PropertyCS*
	 *     )
	 */
	protected void sequence_VMCS(EObject context, VM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID type=[VM|ID])
	 */
	protected void sequence_VMInstanceCS(EObject context, VMInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ValidID
	 */
	protected void sequence_VMPortCS(EObject context, VMPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
