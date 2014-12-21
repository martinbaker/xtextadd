package com.euclideanspace.pbase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;

/**
 * I have extended TutorialSyntacticSequencer in order to get PhantomTokens working better.
 * 
 * PhantomTokens are tokens that do not have any corresponding text in the editor. I have found that
 * 'getBEGINToken' and 'getENDToken' sometimes return seemingly random characters. I have therefore
 * overridden them to return empty strings.
 * TODO find out why we get a random character and could this cause other problems?
 * @author Martin Baker
 *
 */
@SuppressWarnings("all")
public class TutorialOverrideSyntacticSequencer extends com.euclideanspace.pbase.serializer.TutorialSyntacticSequencer {
	
	@Override
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		// The following sometimes returns a seemingly random character
		// so override it
		//String res=super.getBEGINToken(semanticObject,ruleCall,node);
		//System.out.println("TutorialOverrideSyntacticSequencer getBEGINToken="+res);
		return "";
	}

	@Override
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		// The following sometimes returns a seemingly random character
		// so override it
		//String res=super.getENDToken(semanticObject,ruleCall,node);
		//System.out.println("TutorialOverrideSyntacticSequencer getENDToken="+res);
		return "";
	}

	@Override
	public String toString() {
		String res="SyntacticSequencer\n";
		res = res+"Member_SemicolonKeyword="+match_Member_SemicolonKeyword_0_2_q.toString()+"\n";
		res = res+"Member_VarKeyword="+match_Member_VarKeyword_0_0_0_1_1_q.toString()+"\n";
		res = res+"Member___CommaKeyword="+match_Member___CommaKeyword_0_7_2_0_IDTerminalRuleCall_0_7_2_1__a.toString()+"\n";
		res = res+"XBlockExpression_SemicolonKeyword="+match_XBlockExpression_SemicolonKeyword_2_1_q.toString()+"\n";
		res = res+"XExpressionInClosure_SemicolonKeyword="+match_XExpressionInClosure_SemicolonKeyword_1_1_q.toString()+"\n";
		res = res+"XParenthesizedExpression_LeftParenthesisKeyword_a="+match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.toString()+"\n";
		res = res+"XParenthesizedExpression_LeftParenthesisKeyword_p="+match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.toString()+"\n";
		return res;
	}
}