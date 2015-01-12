/*
* generated by Xtext
*/
grammar InternalTest1;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.euclideanspace.phantom1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.euclideanspace.phantom1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.phantom1.services.Test1GrammarAccess;

}

@parser::members {

 	private Test1GrammarAccess grammarAccess;
 	
    public InternalTest1Parser(TokenStream input, Test1GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected Test1GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 
	    }
		lv_contents_0_0=ruleRecurse		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"contents",
        		lv_contents_0_0, 
        		"Recurse");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleRecurse
entryRuleRecurse returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRecurseRule()); }
	 iv_ruleRecurse=ruleRecurse 
	 { $current=$iv_ruleRecurse.current; } 
	 EOF 
;

// Rule Recurse
ruleRecurse returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_n_0_0=RULE_ID
		{
			newLeafNode(lv_n_0_0, grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRecurseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"n",
        		lv_n_0_0, 
        		"ID");
	    }

)
)
    |(this_KW_OCURLY_1=RULE_KW_OCURLY
    { 
    newLeafNode(this_KW_OCURLY_1, grammarAccess.getRecurseAccess().getKW_OCURLYTerminalRuleCall_1_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_0()); 
	    }
		lv_r_2_0=ruleRecurse		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRecurseRule());
	        }
       		set(
       			$current, 
       			"r",
        		lv_r_2_0, 
        		"Recurse");
	        afterParserOrEnumRuleCall();
	    }

)
)this_KW_CCURLY_3=RULE_KW_CCURLY
    { 
    newLeafNode(this_KW_CCURLY_3, grammarAccess.getRecurseAccess().getKW_CCURLYTerminalRuleCall_1_2()); 
    }
(this_KW_SEMICOLON_4=RULE_KW_SEMICOLON
    { 
    newLeafNode(this_KW_SEMICOLON_4, grammarAccess.getRecurseAccess().getKW_SEMICOLONTerminalRuleCall_1_3()); 
    }
)?))
;





RULE_KW_OCURLY : '{';

RULE_KW_CCURLY : '}';

RULE_KW_SEMICOLON : ';';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

