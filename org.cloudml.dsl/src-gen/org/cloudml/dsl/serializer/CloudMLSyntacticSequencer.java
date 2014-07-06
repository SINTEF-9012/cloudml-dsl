package org.cloudml.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.cloudml.dsl.services.CloudMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CloudMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CloudMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q;
	protected AbstractElementAlias match_InternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q;
	protected AbstractElementAlias match_ProvidedExecutionPlatformCS_ColonKeyword_4_0_q;
	protected AbstractElementAlias match_ProvidedExecutionPlatformCS___LeftSquareBracketKeyword_3_0_OffersKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q;
	protected AbstractElementAlias match_ProvidedPortCS_ColonKeyword_4_0_q;
	protected AbstractElementAlias match_ProvidedPortCS_CommaKeyword_3_1_1_q;
	protected AbstractElementAlias match_ProvidedPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q;
	protected AbstractElementAlias match_RelationshipCS___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q;
	protected AbstractElementAlias match_RequiredExecutionPlatformCS_ColonKeyword_4_0_q;
	protected AbstractElementAlias match_RequiredExecutionPlatformCS___LeftSquareBracketKeyword_3_0_DemandsKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q;
	protected AbstractElementAlias match_RequiredPortCS_ColonKeyword_4_0_q;
	protected AbstractElementAlias match_RequiredPortCS_CommaKeyword_3_1_1_q;
	protected AbstractElementAlias match_RequiredPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q;
	protected AbstractElementAlias match_ResourceCS_CommaKeyword_3_1_q;
	protected AbstractElementAlias match_VMCS_CommaKeyword_3_1_1_q;
	protected AbstractElementAlias match_VMCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q;
	protected AbstractElementAlias match_VMCS___PropertiesKeyword_6_0_ColonKeyword_6_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CloudMLGrammarAccess) access;
		match_ExternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExternalComponentCSAccess().getPropertiesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getExternalComponentCSAccess().getColonKeyword_4_1()));
		match_InternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInternalComponentCSAccess().getPropertiesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getInternalComponentCSAccess().getColonKeyword_4_1()));
		match_ProvidedExecutionPlatformCS_ColonKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_4_0());
		match_ProvidedExecutionPlatformCS___LeftSquareBracketKeyword_3_0_OffersKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getLeftSquareBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getOffersKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getRightSquareBracketKeyword_3_4()));
		match_ProvidedPortCS_ColonKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getProvidedPortCSAccess().getColonKeyword_4_0());
		match_ProvidedPortCS_CommaKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getProvidedPortCSAccess().getCommaKeyword_3_1_1());
		match_ProvidedPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProvidedPortCSAccess().getLeftSquareBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getProvidedPortCSAccess().getRightSquareBracketKeyword_3_2()));
		match_RelationshipCS___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationshipCSAccess().getPropertiesKeyword_2_1_4_0()), new TokenAlias(false, false, grammarAccess.getRelationshipCSAccess().getColonKeyword_2_1_4_1()));
		match_RequiredExecutionPlatformCS_ColonKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_4_0());
		match_RequiredExecutionPlatformCS___LeftSquareBracketKeyword_3_0_DemandsKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getLeftSquareBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getDemandsKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getRightSquareBracketKeyword_3_4()));
		match_RequiredPortCS_ColonKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getRequiredPortCSAccess().getColonKeyword_4_0());
		match_RequiredPortCS_CommaKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getRequiredPortCSAccess().getCommaKeyword_3_1_1());
		match_RequiredPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequiredPortCSAccess().getLeftSquareBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getRequiredPortCSAccess().getRightSquareBracketKeyword_3_2()));
		match_ResourceCS_CommaKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getResourceCSAccess().getCommaKeyword_3_1());
		match_VMCS_CommaKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getVMCSAccess().getCommaKeyword_3_1_1());
		match_VMCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVMCSAccess().getLeftSquareBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getVMCSAccess().getRightSquareBracketKeyword_3_2()));
		match_VMCS___PropertiesKeyword_6_0_ColonKeyword_6_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVMCSAccess().getPropertiesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getVMCSAccess().getColonKeyword_6_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ExternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q.equals(syntax))
				emit_ExternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q.equals(syntax))
				emit_InternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedExecutionPlatformCS_ColonKeyword_4_0_q.equals(syntax))
				emit_ProvidedExecutionPlatformCS_ColonKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedExecutionPlatformCS___LeftSquareBracketKeyword_3_0_OffersKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q.equals(syntax))
				emit_ProvidedExecutionPlatformCS___LeftSquareBracketKeyword_3_0_OffersKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedPortCS_ColonKeyword_4_0_q.equals(syntax))
				emit_ProvidedPortCS_ColonKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedPortCS_CommaKeyword_3_1_1_q.equals(syntax))
				emit_ProvidedPortCS_CommaKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q.equals(syntax))
				emit_ProvidedPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RelationshipCS___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q.equals(syntax))
				emit_RelationshipCS___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredExecutionPlatformCS_ColonKeyword_4_0_q.equals(syntax))
				emit_RequiredExecutionPlatformCS_ColonKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredExecutionPlatformCS___LeftSquareBracketKeyword_3_0_DemandsKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q.equals(syntax))
				emit_RequiredExecutionPlatformCS___LeftSquareBracketKeyword_3_0_DemandsKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredPortCS_ColonKeyword_4_0_q.equals(syntax))
				emit_RequiredPortCS_ColonKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredPortCS_CommaKeyword_3_1_1_q.equals(syntax))
				emit_RequiredPortCS_CommaKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q.equals(syntax))
				emit_RequiredPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResourceCS_CommaKeyword_3_1_q.equals(syntax))
				emit_ResourceCS_CommaKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VMCS_CommaKeyword_3_1_1_q.equals(syntax))
				emit_VMCS_CommaKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VMCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q.equals(syntax))
				emit_VMCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VMCS___PropertiesKeyword_6_0_ColonKeyword_6_1__q.equals(syntax))
				emit_VMCS___PropertiesKeyword_6_0_ColonKeyword_6_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('properties' ':')?
	 */
	protected void emit_ExternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('properties' ':')?
	 */
	protected void emit_InternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_ProvidedExecutionPlatformCS_ColonKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' 'offers' ':' ']')?
	 */
	protected void emit_ProvidedExecutionPlatformCS___LeftSquareBracketKeyword_3_0_OffersKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_ProvidedPortCS_ColonKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ProvidedPortCS_CommaKeyword_3_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_ProvidedPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('properties' ':')?
	 */
	protected void emit_RelationshipCS___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_RequiredExecutionPlatformCS_ColonKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' 'demands' ':' ']')?
	 */
	protected void emit_RequiredExecutionPlatformCS___LeftSquareBracketKeyword_3_0_DemandsKeyword_3_1_ColonKeyword_3_2_RightSquareBracketKeyword_3_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_RequiredPortCS_ColonKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_RequiredPortCS_CommaKeyword_3_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_RequiredPortCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ResourceCS_CommaKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_VMCS_CommaKeyword_3_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_VMCS___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('properties' ':')?
	 */
	protected void emit_VMCS___PropertiesKeyword_6_0_ColonKeyword_6_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
