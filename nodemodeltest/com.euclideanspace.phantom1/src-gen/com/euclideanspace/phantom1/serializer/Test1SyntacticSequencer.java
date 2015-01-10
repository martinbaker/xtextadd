package com.euclideanspace.phantom1.serializer;

import com.euclideanspace.phantom1.services.Test1GrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class Test1SyntacticSequencer extends AbstractSyntacticSequencer {

	protected Test1GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Recurse_KW_SEMICOLONTerminalRuleCall_1_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Test1GrammarAccess) access;
		match_Recurse_KW_SEMICOLONTerminalRuleCall_1_3_q = new TokenAlias(false, true, grammarAccess.getRecurseAccess().getKW_SEMICOLONTerminalRuleCall_1_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getKW_CCURLYRule())
			return getKW_CCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_OCURLYRule())
			return getKW_OCURLYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKW_SEMICOLONRule())
			return getKW_SEMICOLONToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal KW_CCURLY: '}';
	 */
	protected String getKW_CCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal KW_OCURLY: '{';
	 */
	protected String getKW_OCURLYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal KW_SEMICOLON: ';';
	 */
	protected String getKW_SEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Recurse_KW_SEMICOLONTerminalRuleCall_1_3_q.equals(syntax))
				emit_Recurse_KW_SEMICOLONTerminalRuleCall_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     KW_SEMICOLON?
	 */
	protected void emit_Recurse_KW_SEMICOLONTerminalRuleCall_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
