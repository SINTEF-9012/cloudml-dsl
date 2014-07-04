package org.cloudml.dsl.serializer;

import cloudml.core.CloudMLModel;
import cloudml.core.CorePackage;
import cloudml.core.ExternalComponent;
import cloudml.core.ExternalComponentInstance;
import cloudml.core.InternalComponent;
import cloudml.core.InternalComponentInstance;
import cloudml.core.ProvidedPort;
import cloudml.core.Relationship;
import cloudml.core.RelationshipInstance;
import cloudml.core.RequiredExecutionPlatform;
import cloudml.core.RequiredPort;
import cloudml.core.VM;
import cloudml.core.VMPort;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.cloudml.dsl.services.CloudMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

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
				if(context == grammarAccess.getRelationshipCSRule()) {
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
			case CorePackage.VM:
				if(context == grammarAccess.getVMCSRule()) {
					sequence_VMCS(context, (VM) semanticObject); 
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
	 *         name=ID 
	 *         providers+=ProviderCS* 
	 *         (vms+=VMCS | internalComponents+=InternalComponentCS | externalComponents+=ExternalComponentCS)* 
	 *         relationships+=RelationshipCS* 
	 *         (componentInstances+=InternalComponentInstanceCS | componentInstances+=ExternalComponentInstanceCS)* 
	 *         relationshipInstances+=RelationshipInstanceCS*
	 *     )
	 */
	protected void sequence_CloudMLRoot(EObject context, CloudMLModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID providedPorts+=ProvidedPortCS*)
	 */
	protected void sequence_ExternalComponentCS(EObject context, ExternalComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[ExternalComponent|ID])
	 */
	protected void sequence_ExternalComponentInstanceCS(EObject context, ExternalComponentInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID providedPorts+=ProvidedPortCS* requiredPorts+=RequiredPortCS* requiredExecutionPlatform=RequiredExecutionPlatformCS)
	 */
	protected void sequence_InternalComponentCS(EObject context, InternalComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[InternalComponent|ID])
	 */
	protected void sequence_InternalComponentInstanceCS(EObject context, InternalComponentInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isLocal?='local'? name=ID component=[Component|ID]?)
	 */
	protected void sequence_ProvidedPortCS(EObject context, ProvidedPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID credentials=STRING)
	 */
	protected void sequence_ProviderCS(EObject context, cloudml.core.Provider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID requiredPort=[RequiredPort|Fqn] providedPort=[ProvidedPort|Fqn])
	 */
	protected void sequence_RelationshipCS(EObject context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[Relationship|ID] requiredPortInstance=[RequiredPortInstance|Fqn] providedPortInstance=[ProvidedPortInstance|Fqn])
	 */
	protected void sequence_RelationshipInstanceCS(EObject context, RelationshipInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID owner=[Component|ID]?)
	 */
	protected void sequence_RequiredExecutionPlatformCS(EObject context, RequiredExecutionPlatform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isMandatory?='mandatory'? name=ID component=[Component|ID]?)
	 */
	protected void sequence_RequiredPortCS(EObject context, RequiredPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID provided+=VMPortCS*)
	 */
	protected void sequence_VMCS(EObject context, VM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VMPortCS(EObject context, VMPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
