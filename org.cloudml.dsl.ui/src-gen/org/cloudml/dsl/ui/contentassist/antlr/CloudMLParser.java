/*
* generated by Xtext
*/
package org.cloudml.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.cloudml.dsl.services.CloudMLGrammarAccess;

public class CloudMLParser extends AbstractContentAssistParser {
	
	@Inject
	private CloudMLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.cloudml.dsl.ui.contentassist.antlr.internal.InternalCloudMLParser createParser() {
		org.cloudml.dsl.ui.contentassist.antlr.internal.InternalCloudMLParser result = new org.cloudml.dsl.ui.contentassist.antlr.internal.InternalCloudMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCloudMLRootAccess().getAlternatives_5(), "rule__CloudMLRoot__Alternatives_5");
					put(grammarAccess.getCloudMLRootAccess().getAlternatives_10(), "rule__CloudMLRoot__Alternatives_10");
					put(grammarAccess.getVMCSAccess().getAlternatives_3_1_0(), "rule__VMCS__Alternatives_3_1_0");
					put(grammarAccess.getExternalComponentCSAccess().getAlternatives_3(), "rule__ExternalComponentCS__Alternatives_3");
					put(grammarAccess.getProvidedPortCSAccess().getAlternatives_3_1_0(), "rule__ProvidedPortCS__Alternatives_3_1_0");
					put(grammarAccess.getInternalComponentCSAccess().getAlternatives_3(), "rule__InternalComponentCS__Alternatives_3");
					put(grammarAccess.getRequiredPortCSAccess().getAlternatives_3_1_0(), "rule__RequiredPortCS__Alternatives_3_1_0");
					put(grammarAccess.getRelationshipCSAccess().getAlternatives_2(), "rule__RelationshipCS__Alternatives_2");
					put(grammarAccess.getResourceCSAccess().getAlternatives_3_0(), "rule__ResourceCS__Alternatives_3_0");
					put(grammarAccess.getCloudMLRootAccess().getGroup(), "rule__CloudMLRoot__Group__0");
					put(grammarAccess.getProviderCSAccess().getGroup(), "rule__ProviderCS__Group__0");
					put(grammarAccess.getVMCSAccess().getGroup(), "rule__VMCS__Group__0");
					put(grammarAccess.getVMCSAccess().getGroup_3(), "rule__VMCS__Group_3__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1(), "rule__VMCS__Group_3_1__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_0(), "rule__VMCS__Group_3_1_0_0__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_1(), "rule__VMCS__Group_3_1_0_1__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_2(), "rule__VMCS__Group_3_1_0_2__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_4(), "rule__VMCS__Group_3_1_0_4__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_5(), "rule__VMCS__Group_3_1_0_5__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_6(), "rule__VMCS__Group_3_1_0_6__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_7(), "rule__VMCS__Group_3_1_0_7__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_8(), "rule__VMCS__Group_3_1_0_8__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_9(), "rule__VMCS__Group_3_1_0_9__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_10(), "rule__VMCS__Group_3_1_0_10__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_11(), "rule__VMCS__Group_3_1_0_11__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_12(), "rule__VMCS__Group_3_1_0_12__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_13(), "rule__VMCS__Group_3_1_0_13__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_14(), "rule__VMCS__Group_3_1_0_14__0");
					put(grammarAccess.getVMCSAccess().getGroup_3_1_0_15(), "rule__VMCS__Group_3_1_0_15__0");
					put(grammarAccess.getVMCSAccess().getGroup_6(), "rule__VMCS__Group_6__0");
					put(grammarAccess.getExternalComponentCSAccess().getGroup(), "rule__ExternalComponentCS__Group__0");
					put(grammarAccess.getExternalComponentCSAccess().getGroup_4(), "rule__ExternalComponentCS__Group_4__0");
					put(grammarAccess.getProvidedPortCSAccess().getGroup(), "rule__ProvidedPortCS__Group__0");
					put(grammarAccess.getProvidedPortCSAccess().getGroup_3(), "rule__ProvidedPortCS__Group_3__0");
					put(grammarAccess.getProvidedPortCSAccess().getGroup_3_1(), "rule__ProvidedPortCS__Group_3_1__0");
					put(grammarAccess.getProvidedPortCSAccess().getGroup_3_1_0_1(), "rule__ProvidedPortCS__Group_3_1_0_1__0");
					put(grammarAccess.getProvidedPortCSAccess().getGroup_4(), "rule__ProvidedPortCS__Group_4__0");
					put(grammarAccess.getInternalComponentCSAccess().getGroup(), "rule__InternalComponentCS__Group__0");
					put(grammarAccess.getInternalComponentCSAccess().getGroup_4(), "rule__InternalComponentCS__Group_4__0");
					put(grammarAccess.getRequiredPortCSAccess().getGroup(), "rule__RequiredPortCS__Group__0");
					put(grammarAccess.getRequiredPortCSAccess().getGroup_3(), "rule__RequiredPortCS__Group_3__0");
					put(grammarAccess.getRequiredPortCSAccess().getGroup_3_1(), "rule__RequiredPortCS__Group_3_1__0");
					put(grammarAccess.getRequiredPortCSAccess().getGroup_3_1_0_1(), "rule__RequiredPortCS__Group_3_1_0_1__0");
					put(grammarAccess.getRequiredPortCSAccess().getGroup_4(), "rule__RequiredPortCS__Group_4__0");
					put(grammarAccess.getRequiredExecutionPlatformCSAccess().getGroup(), "rule__RequiredExecutionPlatformCS__Group__0");
					put(grammarAccess.getRequiredExecutionPlatformCSAccess().getGroup_3(), "rule__RequiredExecutionPlatformCS__Group_3__0");
					put(grammarAccess.getRequiredExecutionPlatformCSAccess().getGroup_4(), "rule__RequiredExecutionPlatformCS__Group_4__0");
					put(grammarAccess.getProvidedExecutionPlatformCSAccess().getGroup(), "rule__ProvidedExecutionPlatformCS__Group__0");
					put(grammarAccess.getProvidedExecutionPlatformCSAccess().getGroup_3(), "rule__ProvidedExecutionPlatformCS__Group_3__0");
					put(grammarAccess.getProvidedExecutionPlatformCSAccess().getGroup_4(), "rule__ProvidedExecutionPlatformCS__Group_4__0");
					put(grammarAccess.getRelationshipCSAccess().getGroup(), "rule__RelationshipCS__Group__0");
					put(grammarAccess.getRelationshipCSAccess().getGroup_2_0(), "rule__RelationshipCS__Group_2_0__0");
					put(grammarAccess.getRelationshipCSAccess().getGroup_2_1(), "rule__RelationshipCS__Group_2_1__0");
					put(grammarAccess.getRelationshipCSAccess().getGroup_2_1_4(), "rule__RelationshipCS__Group_2_1_4__0");
					put(grammarAccess.getExternalComponentInstanceCSAccess().getGroup(), "rule__ExternalComponentInstanceCS__Group__0");
					put(grammarAccess.getInternalComponentInstanceCSAccess().getGroup(), "rule__InternalComponentInstanceCS__Group__0");
					put(grammarAccess.getVMInstanceCSAccess().getGroup(), "rule__VMInstanceCS__Group__0");
					put(grammarAccess.getRelationshipInstanceCSAccess().getGroup(), "rule__RelationshipInstanceCS__Group__0");
					put(grammarAccess.getExecuteInstanceCSAccess().getGroup(), "rule__ExecuteInstanceCS__Group__0");
					put(grammarAccess.getPropertyCSAccess().getGroup(), "rule__PropertyCS__Group__0");
					put(grammarAccess.getResourceCSAccess().getGroup(), "rule__ResourceCS__Group__0");
					put(grammarAccess.getResourceCSAccess().getGroup_3(), "rule__ResourceCS__Group_3__0");
					put(grammarAccess.getResourceCSAccess().getGroup_3_0_0(), "rule__ResourceCS__Group_3_0_0__0");
					put(grammarAccess.getResourceCSAccess().getGroup_3_0_1(), "rule__ResourceCS__Group_3_0_1__0");
					put(grammarAccess.getResourceCSAccess().getGroup_3_0_2(), "rule__ResourceCS__Group_3_0_2__0");
					put(grammarAccess.getResourceCSAccess().getGroup_3_0_3(), "rule__ResourceCS__Group_3_0_3__0");
					put(grammarAccess.getResourceCSAccess().getGroup_3_0_4(), "rule__ResourceCS__Group_3_0_4__0");
					put(grammarAccess.getResourceCSAccess().getGroup_3_0_5(), "rule__ResourceCS__Group_3_0_5__0");
					put(grammarAccess.getFqnAccess().getGroup(), "rule__Fqn__Group__0");
					put(grammarAccess.getFqnAccess().getGroup_1(), "rule__Fqn__Group_1__0");
					put(grammarAccess.getCloudMLRootAccess().getNameAssignment_1(), "rule__CloudMLRoot__NameAssignment_1");
					put(grammarAccess.getCloudMLRootAccess().getProvidersAssignment_2(), "rule__CloudMLRoot__ProvidersAssignment_2");
					put(grammarAccess.getCloudMLRootAccess().getVmsAssignment_5_0(), "rule__CloudMLRoot__VmsAssignment_5_0");
					put(grammarAccess.getCloudMLRootAccess().getInternalComponentsAssignment_5_1(), "rule__CloudMLRoot__InternalComponentsAssignment_5_1");
					put(grammarAccess.getCloudMLRootAccess().getExternalComponentsAssignment_5_2(), "rule__CloudMLRoot__ExternalComponentsAssignment_5_2");
					put(grammarAccess.getCloudMLRootAccess().getRelationshipsAssignment_6(), "rule__CloudMLRoot__RelationshipsAssignment_6");
					put(grammarAccess.getCloudMLRootAccess().getInternalComponentInstancesAssignment_10_0(), "rule__CloudMLRoot__InternalComponentInstancesAssignment_10_0");
					put(grammarAccess.getCloudMLRootAccess().getExternalComponentInstancesAssignment_10_1(), "rule__CloudMLRoot__ExternalComponentInstancesAssignment_10_1");
					put(grammarAccess.getCloudMLRootAccess().getExternalComponentInstancesAssignment_10_2(), "rule__CloudMLRoot__ExternalComponentInstancesAssignment_10_2");
					put(grammarAccess.getCloudMLRootAccess().getRelationshipInstancesAssignment_11(), "rule__CloudMLRoot__RelationshipInstancesAssignment_11");
					put(grammarAccess.getCloudMLRootAccess().getExecutesInstancesAssignment_12(), "rule__CloudMLRoot__ExecutesInstancesAssignment_12");
					put(grammarAccess.getProviderCSAccess().getNameAssignment_1(), "rule__ProviderCS__NameAssignment_1");
					put(grammarAccess.getProviderCSAccess().getCredentialsAssignment_3(), "rule__ProviderCS__CredentialsAssignment_3");
					put(grammarAccess.getProviderCSAccess().getPropertiesAssignment_4(), "rule__ProviderCS__PropertiesAssignment_4");
					put(grammarAccess.getVMCSAccess().getNameAssignment_1(), "rule__VMCS__NameAssignment_1");
					put(grammarAccess.getVMCSAccess().getProviderAssignment_3_1_0_0_2(), "rule__VMCS__ProviderAssignment_3_1_0_0_2");
					put(grammarAccess.getVMCSAccess().getGroupNameAssignment_3_1_0_1_2(), "rule__VMCS__GroupNameAssignment_3_1_0_1_2");
					put(grammarAccess.getVMCSAccess().getImageIdAssignment_3_1_0_2_2(), "rule__VMCS__ImageIdAssignment_3_1_0_2_2");
					put(grammarAccess.getVMCSAccess().getIs64osAssignment_3_1_0_3(), "rule__VMCS__Is64osAssignment_3_1_0_3");
					put(grammarAccess.getVMCSAccess().getLocationAssignment_3_1_0_4_2(), "rule__VMCS__LocationAssignment_3_1_0_4_2");
					put(grammarAccess.getVMCSAccess().getLoginAssignment_3_1_0_5_2(), "rule__VMCS__LoginAssignment_3_1_0_5_2");
					put(grammarAccess.getVMCSAccess().getMinCoresAssignment_3_1_0_6_2(), "rule__VMCS__MinCoresAssignment_3_1_0_6_2");
					put(grammarAccess.getVMCSAccess().getMaxCoresAssignment_3_1_0_6_4(), "rule__VMCS__MaxCoresAssignment_3_1_0_6_4");
					put(grammarAccess.getVMCSAccess().getMinRamAssignment_3_1_0_7_2(), "rule__VMCS__MinRamAssignment_3_1_0_7_2");
					put(grammarAccess.getVMCSAccess().getMaxRamAssignment_3_1_0_7_4(), "rule__VMCS__MaxRamAssignment_3_1_0_7_4");
					put(grammarAccess.getVMCSAccess().getMinStorageAssignment_3_1_0_8_2(), "rule__VMCS__MinStorageAssignment_3_1_0_8_2");
					put(grammarAccess.getVMCSAccess().getMaxStorageAssignment_3_1_0_8_4(), "rule__VMCS__MaxStorageAssignment_3_1_0_8_4");
					put(grammarAccess.getVMCSAccess().getOsAssignment_3_1_0_9_2(), "rule__VMCS__OsAssignment_3_1_0_9_2");
					put(grammarAccess.getVMCSAccess().getPasswdAssignment_3_1_0_10_2(), "rule__VMCS__PasswdAssignment_3_1_0_10_2");
					put(grammarAccess.getVMCSAccess().getPrivateKeyAssignment_3_1_0_11_2(), "rule__VMCS__PrivateKeyAssignment_3_1_0_11_2");
					put(grammarAccess.getVMCSAccess().getRegionAssignment_3_1_0_12_2(), "rule__VMCS__RegionAssignment_3_1_0_12_2");
					put(grammarAccess.getVMCSAccess().getSecurityGroupAssignment_3_1_0_13_2(), "rule__VMCS__SecurityGroupAssignment_3_1_0_13_2");
					put(grammarAccess.getVMCSAccess().getServiceTypeAssignment_3_1_0_14_2(), "rule__VMCS__ServiceTypeAssignment_3_1_0_14_2");
					put(grammarAccess.getVMCSAccess().getSshKeyAssignment_3_1_0_15_2(), "rule__VMCS__SshKeyAssignment_3_1_0_15_2");
					put(grammarAccess.getVMCSAccess().getProvidedPortsAssignment_4(), "rule__VMCS__ProvidedPortsAssignment_4");
					put(grammarAccess.getVMCSAccess().getProvidedExecutionPlatformsAssignment_5(), "rule__VMCS__ProvidedExecutionPlatformsAssignment_5");
					put(grammarAccess.getVMCSAccess().getPropertiesAssignment_6_2(), "rule__VMCS__PropertiesAssignment_6_2");
					put(grammarAccess.getVMPortCSAccess().getNameAssignment(), "rule__VMPortCS__NameAssignment");
					put(grammarAccess.getExternalComponentCSAccess().getNameAssignment_1(), "rule__ExternalComponentCS__NameAssignment_1");
					put(grammarAccess.getExternalComponentCSAccess().getProvidedPortsAssignment_3_0(), "rule__ExternalComponentCS__ProvidedPortsAssignment_3_0");
					put(grammarAccess.getExternalComponentCSAccess().getProvidedExecutionPlatformsAssignment_3_1(), "rule__ExternalComponentCS__ProvidedExecutionPlatformsAssignment_3_1");
					put(grammarAccess.getExternalComponentCSAccess().getPropertiesAssignment_4_2(), "rule__ExternalComponentCS__PropertiesAssignment_4_2");
					put(grammarAccess.getExternalComponentCSAccess().getResourcesAssignment_5(), "rule__ExternalComponentCS__ResourcesAssignment_5");
					put(grammarAccess.getProvidedPortCSAccess().getNameAssignment_2(), "rule__ProvidedPortCS__NameAssignment_2");
					put(grammarAccess.getProvidedPortCSAccess().getIsLocalAssignment_3_1_0_0(), "rule__ProvidedPortCS__IsLocalAssignment_3_1_0_0");
					put(grammarAccess.getProvidedPortCSAccess().getPortNumberAssignment_3_1_0_1_2(), "rule__ProvidedPortCS__PortNumberAssignment_3_1_0_1_2");
					put(grammarAccess.getProvidedPortCSAccess().getPropertiesAssignment_4_1(), "rule__ProvidedPortCS__PropertiesAssignment_4_1");
					put(grammarAccess.getInternalComponentCSAccess().getNameAssignment_1(), "rule__InternalComponentCS__NameAssignment_1");
					put(grammarAccess.getInternalComponentCSAccess().getProvidedPortsAssignment_3_0(), "rule__InternalComponentCS__ProvidedPortsAssignment_3_0");
					put(grammarAccess.getInternalComponentCSAccess().getRequiredPortsAssignment_3_1(), "rule__InternalComponentCS__RequiredPortsAssignment_3_1");
					put(grammarAccess.getInternalComponentCSAccess().getRequiredExecutionPlatformAssignment_3_2(), "rule__InternalComponentCS__RequiredExecutionPlatformAssignment_3_2");
					put(grammarAccess.getInternalComponentCSAccess().getProvidedExecutionPlatformsAssignment_3_3(), "rule__InternalComponentCS__ProvidedExecutionPlatformsAssignment_3_3");
					put(grammarAccess.getInternalComponentCSAccess().getPropertiesAssignment_4_2(), "rule__InternalComponentCS__PropertiesAssignment_4_2");
					put(grammarAccess.getInternalComponentCSAccess().getResourcesAssignment_5(), "rule__InternalComponentCS__ResourcesAssignment_5");
					put(grammarAccess.getRequiredPortCSAccess().getNameAssignment_2(), "rule__RequiredPortCS__NameAssignment_2");
					put(grammarAccess.getRequiredPortCSAccess().getIsLocalAssignment_3_1_0_0(), "rule__RequiredPortCS__IsLocalAssignment_3_1_0_0");
					put(grammarAccess.getRequiredPortCSAccess().getPortNumberAssignment_3_1_0_1_2(), "rule__RequiredPortCS__PortNumberAssignment_3_1_0_1_2");
					put(grammarAccess.getRequiredPortCSAccess().getIsMandatoryAssignment_3_1_0_2(), "rule__RequiredPortCS__IsMandatoryAssignment_3_1_0_2");
					put(grammarAccess.getRequiredPortCSAccess().getPropertiesAssignment_4_1(), "rule__RequiredPortCS__PropertiesAssignment_4_1");
					put(grammarAccess.getRequiredExecutionPlatformCSAccess().getNameAssignment_2(), "rule__RequiredExecutionPlatformCS__NameAssignment_2");
					put(grammarAccess.getRequiredExecutionPlatformCSAccess().getDemandsAssignment_3_3(), "rule__RequiredExecutionPlatformCS__DemandsAssignment_3_3");
					put(grammarAccess.getRequiredExecutionPlatformCSAccess().getPropertiesAssignment_4_1(), "rule__RequiredExecutionPlatformCS__PropertiesAssignment_4_1");
					put(grammarAccess.getProvidedExecutionPlatformCSAccess().getNameAssignment_2(), "rule__ProvidedExecutionPlatformCS__NameAssignment_2");
					put(grammarAccess.getProvidedExecutionPlatformCSAccess().getOffersAssignment_3_3(), "rule__ProvidedExecutionPlatformCS__OffersAssignment_3_3");
					put(grammarAccess.getProvidedExecutionPlatformCSAccess().getPropertiesAssignment_4_1(), "rule__ProvidedExecutionPlatformCS__PropertiesAssignment_4_1");
					put(grammarAccess.getRelationshipCSAccess().getNameAssignment_1(), "rule__RelationshipCS__NameAssignment_1");
					put(grammarAccess.getRelationshipCSAccess().getRequiredPortAssignment_2_0_1(), "rule__RelationshipCS__RequiredPortAssignment_2_0_1");
					put(grammarAccess.getRelationshipCSAccess().getProvidedPortAssignment_2_0_3(), "rule__RelationshipCS__ProvidedPortAssignment_2_0_3");
					put(grammarAccess.getRelationshipCSAccess().getRequiredPortAssignment_2_1_1(), "rule__RelationshipCS__RequiredPortAssignment_2_1_1");
					put(grammarAccess.getRelationshipCSAccess().getProvidedPortAssignment_2_1_3(), "rule__RelationshipCS__ProvidedPortAssignment_2_1_3");
					put(grammarAccess.getRelationshipCSAccess().getPropertiesAssignment_2_1_4_2(), "rule__RelationshipCS__PropertiesAssignment_2_1_4_2");
					put(grammarAccess.getRelationshipCSAccess().getResourcesAssignment_2_1_5(), "rule__RelationshipCS__ResourcesAssignment_2_1_5");
					put(grammarAccess.getExternalComponentInstanceCSAccess().getTypeAssignment_1(), "rule__ExternalComponentInstanceCS__TypeAssignment_1");
					put(grammarAccess.getExternalComponentInstanceCSAccess().getNameAssignment_2(), "rule__ExternalComponentInstanceCS__NameAssignment_2");
					put(grammarAccess.getInternalComponentInstanceCSAccess().getTypeAssignment_1(), "rule__InternalComponentInstanceCS__TypeAssignment_1");
					put(grammarAccess.getInternalComponentInstanceCSAccess().getNameAssignment_2(), "rule__InternalComponentInstanceCS__NameAssignment_2");
					put(grammarAccess.getVMInstanceCSAccess().getTypeAssignment_1(), "rule__VMInstanceCS__TypeAssignment_1");
					put(grammarAccess.getVMInstanceCSAccess().getNameAssignment_2(), "rule__VMInstanceCS__NameAssignment_2");
					put(grammarAccess.getRelationshipInstanceCSAccess().getTypeAssignment_1(), "rule__RelationshipInstanceCS__TypeAssignment_1");
					put(grammarAccess.getRelationshipInstanceCSAccess().getNameAssignment_2(), "rule__RelationshipInstanceCS__NameAssignment_2");
					put(grammarAccess.getRelationshipInstanceCSAccess().getRequiredPortInstanceAssignment_4(), "rule__RelationshipInstanceCS__RequiredPortInstanceAssignment_4");
					put(grammarAccess.getRelationshipInstanceCSAccess().getProvidedPortInstanceAssignment_6(), "rule__RelationshipInstanceCS__ProvidedPortInstanceAssignment_6");
					put(grammarAccess.getExecuteInstanceCSAccess().getNameAssignment_1(), "rule__ExecuteInstanceCS__NameAssignment_1");
					put(grammarAccess.getExecuteInstanceCSAccess().getRequiredExecutionPlatformInstanceAssignment_3(), "rule__ExecuteInstanceCS__RequiredExecutionPlatformInstanceAssignment_3");
					put(grammarAccess.getExecuteInstanceCSAccess().getProvidedExecutionPlatformInstanceAssignment_5(), "rule__ExecuteInstanceCS__ProvidedExecutionPlatformInstanceAssignment_5");
					put(grammarAccess.getPropertyCSAccess().getNameAssignment_1(), "rule__PropertyCS__NameAssignment_1");
					put(grammarAccess.getPropertyCSAccess().getValueAssignment_3(), "rule__PropertyCS__ValueAssignment_3");
					put(grammarAccess.getResourceCSAccess().getNameAssignment_1(), "rule__ResourceCS__NameAssignment_1");
					put(grammarAccess.getResourceCSAccess().getDownloadCommandAssignment_3_0_0_2(), "rule__ResourceCS__DownloadCommandAssignment_3_0_0_2");
					put(grammarAccess.getResourceCSAccess().getUploadCommandAssignment_3_0_1_2(), "rule__ResourceCS__UploadCommandAssignment_3_0_1_2");
					put(grammarAccess.getResourceCSAccess().getInstallCommandAssignment_3_0_2_2(), "rule__ResourceCS__InstallCommandAssignment_3_0_2_2");
					put(grammarAccess.getResourceCSAccess().getConfigureCommandAssignment_3_0_3_2(), "rule__ResourceCS__ConfigureCommandAssignment_3_0_3_2");
					put(grammarAccess.getResourceCSAccess().getStartCommandAssignment_3_0_4_2(), "rule__ResourceCS__StartCommandAssignment_3_0_4_2");
					put(grammarAccess.getResourceCSAccess().getStopCommandAssignment_3_0_5_2(), "rule__ResourceCS__StopCommandAssignment_3_0_5_2");
					put(grammarAccess.getResourceCSAccess().getRequireCredentialsAssignment_3_0_6(), "rule__ResourceCS__RequireCredentialsAssignment_3_0_6");
					put(grammarAccess.getResourceCSAccess().getExecuteLocallyAssignment_3_0_7(), "rule__ResourceCS__ExecuteLocallyAssignment_3_0_7");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.cloudml.dsl.ui.contentassist.antlr.internal.InternalCloudMLParser typedParser = (org.cloudml.dsl.ui.contentassist.antlr.internal.InternalCloudMLParser) parser;
			typedParser.entryRuleCloudMLRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CloudMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CloudMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
