package com.euclideanspace.pbase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;

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

}