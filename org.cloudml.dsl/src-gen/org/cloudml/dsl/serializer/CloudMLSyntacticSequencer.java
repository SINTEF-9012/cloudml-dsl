package org.cloudml.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.cloudml.dsl.services.CloudMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
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
	protected AbstractElementAlias match_ProvidedExecutionPlatformCS___ColonKeyword_3_0___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q;
	protected AbstractElementAlias match_ProvidedExecutionPlatformCS___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q;
	protected AbstractElementAlias match_ProvidedPortCS_ColonKeyword_3_0_q;
	protected AbstractElementAlias match_ProvidedPortCS_CommaKeyword_3_1_1_q;
	protected AbstractElementAlias match_RelationshipCSOld___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q;
	protected AbstractElementAlias match_RelationshipCS_ColonKeyword_6_0_0_q_or___LeftCurlyBracketKeyword_6_1_0___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q_RightCurlyBracketKeyword_6_1_3__;
	protected AbstractElementAlias match_RelationshipCS___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q;
	protected AbstractElementAlias match_RequiredExecutionPlatformCS___ColonKeyword_3_0___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q;
	protected AbstractElementAlias match_RequiredExecutionPlatformCS___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q;
	protected AbstractElementAlias match_RequiredPortCS_ColonKeyword_3_0_q;
	protected AbstractElementAlias match_RequiredPortCS_CommaKeyword_3_1_1_q;
	protected AbstractElementAlias match_ResourceCS_CommaKeyword_3_1_q;
	protected AbstractElementAlias match_VMCS_CommaKeyword_3_1_q;
	protected AbstractElementAlias match_VMCS___PropertiesKeyword_6_0_ColonKeyword_6_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CloudMLGrammarAccess) access;
		match_ExternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getExternalComponentCSAccess().getPropertiesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getExternalComponentCSAccess().getColonKeyword_4_1()));
		match_InternalComponentCS___PropertiesKeyword_4_0_ColonKeyword_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInternalComponentCSAccess().getPropertiesKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getInternalComponentCSAccess().getColonKeyword_4_1()));
		match_ProvidedExecutionPlatformCS___ColonKeyword_3_0___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getOffersKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_1_1())), new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getPropertiesKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_3()));
		match_ProvidedExecutionPlatformCS___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getOffersKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getProvidedExecutionPlatformCSAccess().getColonKeyword_3_1_1()));
		match_ProvidedPortCS_ColonKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getProvidedPortCSAccess().getColonKeyword_3_0());
		match_ProvidedPortCS_CommaKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getProvidedPortCSAccess().getCommaKeyword_3_1_1());
		match_RelationshipCSOld___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationshipCSOldAccess().getPropertiesKeyword_2_1_4_0()), new TokenAlias(false, false, grammarAccess.getRelationshipCSOldAccess().getColonKeyword_2_1_4_1()));
		match_RelationshipCS_ColonKeyword_6_0_0_q_or___LeftCurlyBracketKeyword_6_1_0___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q_RightCurlyBracketKeyword_6_1_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRelationshipCSAccess().getLeftCurlyBracketKeyword_6_1_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationshipCSAccess().getPropertiesKeyword_6_1_1_0()), new TokenAlias(false, false, grammarAccess.getRelationshipCSAccess().getColonKeyword_6_1_1_1())), new TokenAlias(false, false, grammarAccess.getRelationshipCSAccess().getRightCurlyBracketKeyword_6_1_3())), new TokenAlias(false, true, grammarAccess.getRelationshipCSAccess().getColonKeyword_6_0_0()));
		match_RelationshipCS___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRelationshipCSAccess().getPropertiesKeyword_6_1_1_0()), new TokenAlias(false, false, grammarAccess.getRelationshipCSAccess().getColonKeyword_6_1_1_1()));
		match_RequiredExecutionPlatformCS___ColonKeyword_3_0___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getDemandsKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_1_1())), new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getPropertiesKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_3()));
		match_RequiredExecutionPlatformCS___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getDemandsKeyword_3_1_0()), new TokenAlias(false, false, grammarAccess.getRequiredExecutionPlatformCSAccess().getColonKeyword_3_1_1()));
		match_RequiredPortCS_ColonKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getRequiredPortCSAccess().getColonKeyword_3_0());
		match_RequiredPortCS_CommaKeyword_3_1_1_q = new TokenAlias(false, true, grammarAccess.getRequiredPortCSAccess().getCommaKeyword_3_1_1());
		match_ResourceCS_CommaKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getResourceCSAccess().getCommaKeyword_3_1());
		match_VMCS_CommaKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getVMCSAccess().getCommaKeyword_3_1());
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
			else if(match_ProvidedExecutionPlatformCS___ColonKeyword_3_0___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q.equals(syntax))
				emit_ProvidedExecutionPlatformCS___ColonKeyword_3_0___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedExecutionPlatformCS___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q.equals(syntax))
				emit_ProvidedExecutionPlatformCS___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedPortCS_ColonKeyword_3_0_q.equals(syntax))
				emit_ProvidedPortCS_ColonKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProvidedPortCS_CommaKeyword_3_1_1_q.equals(syntax))
				emit_ProvidedPortCS_CommaKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RelationshipCSOld___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q.equals(syntax))
				emit_RelationshipCSOld___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RelationshipCS_ColonKeyword_6_0_0_q_or___LeftCurlyBracketKeyword_6_1_0___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q_RightCurlyBracketKeyword_6_1_3__.equals(syntax))
				emit_RelationshipCS_ColonKeyword_6_0_0_q_or___LeftCurlyBracketKeyword_6_1_0___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q_RightCurlyBracketKeyword_6_1_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RelationshipCS___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q.equals(syntax))
				emit_RelationshipCS___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredExecutionPlatformCS___ColonKeyword_3_0___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q.equals(syntax))
				emit_RequiredExecutionPlatformCS___ColonKeyword_3_0___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredExecutionPlatformCS___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q.equals(syntax))
				emit_RequiredExecutionPlatformCS___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredPortCS_ColonKeyword_3_0_q.equals(syntax))
				emit_RequiredPortCS_ColonKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RequiredPortCS_CommaKeyword_3_1_1_q.equals(syntax))
				emit_RequiredPortCS_CommaKeyword_3_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ResourceCS_CommaKeyword_3_1_q.equals(syntax))
				emit_ResourceCS_CommaKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VMCS_CommaKeyword_3_1_q.equals(syntax))
				emit_VMCS_CommaKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     (':' ('offers' ':')? 'properties' ':')?
	 */
	protected void emit_ProvidedExecutionPlatformCS___ColonKeyword_3_0___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('offers' ':')?
	 */
	protected void emit_ProvidedExecutionPlatformCS___OffersKeyword_3_1_0_ColonKeyword_3_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_ProvidedPortCS_ColonKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('properties' ':')?
	 */
	protected void emit_RelationshipCSOld___PropertiesKeyword_2_1_4_0_ColonKeyword_2_1_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' ('properties' ':')? '}') | ':'?
	 */
	protected void emit_RelationshipCS_ColonKeyword_6_0_0_q_or___LeftCurlyBracketKeyword_6_1_0___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q_RightCurlyBracketKeyword_6_1_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('properties' ':')?
	 */
	protected void emit_RelationshipCS___PropertiesKeyword_6_1_1_0_ColonKeyword_6_1_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (':' ('demands' ':')? 'properties' ':')?
	 */
	protected void emit_RequiredExecutionPlatformCS___ColonKeyword_3_0___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q_PropertiesKeyword_3_2_ColonKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('demands' ':')?
	 */
	protected void emit_RequiredExecutionPlatformCS___DemandsKeyword_3_1_0_ColonKeyword_3_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ':'?
	 */
	protected void emit_RequiredPortCS_ColonKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ','?
	 */
	protected void emit_ResourceCS_CommaKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_VMCS_CommaKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
