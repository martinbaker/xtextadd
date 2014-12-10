package com.euclideanspace.xgener.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.xgener.services.GenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'noclass'", "'prefix'", "'suffix'", "'blocking'", "'braces'", "'indent'", "'Procedure'", "'types'", "'colonSeperated'", "'spaceSeperated'", "'inHeader'", "'inferred'", "'untyped'", "'statement'", "'repeat'", "'until'", "'while'", "'do'", "'for'", "'var'", "'='", "'val'", "'expression'", "'infix'", "'infixleft'", "'literal'", "'int'", "'string'", "'bool'", "'float'", "'bracket'", "'parenthasis'", "'['", "']'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenParser.tokenNames; }
    public String getGrammarFileName() { return "../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g"; }



     	private GenGrammarAccess grammarAccess;
     	
        public InternalGenParser(TokenStream input, GenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_clas_0_0= ruleClassType ) ) | ( (lv_proc_1_0= ruleProcedure ) ) | ( (lv_statem_2_0= ruleStatement ) ) | ( (lv_exp_3_0= ruleExpression ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_clas_0_0 = null;

        EObject lv_proc_1_0 = null;

        EObject lv_statem_2_0 = null;

        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:79:28: ( ( ( (lv_clas_0_0= ruleClassType ) ) | ( (lv_proc_1_0= ruleProcedure ) ) | ( (lv_statem_2_0= ruleStatement ) ) | ( (lv_exp_3_0= ruleExpression ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:1: ( ( (lv_clas_0_0= ruleClassType ) ) | ( (lv_proc_1_0= ruleProcedure ) ) | ( (lv_statem_2_0= ruleStatement ) ) | ( (lv_exp_3_0= ruleExpression ) ) )*
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:1: ( ( (lv_clas_0_0= ruleClassType ) ) | ( (lv_proc_1_0= ruleProcedure ) ) | ( (lv_statem_2_0= ruleStatement ) ) | ( (lv_exp_3_0= ruleExpression ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 18:
                    {
                    alt1=2;
                    }
                    break;
                case 25:
                    {
                    alt1=3;
                    }
                    break;
                case 34:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:2: ( (lv_clas_0_0= ruleClassType ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:2: ( (lv_clas_0_0= ruleClassType ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:81:1: (lv_clas_0_0= ruleClassType )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:81:1: (lv_clas_0_0= ruleClassType )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:82:3: lv_clas_0_0= ruleClassType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getClasClassTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassType_in_ruleModel131);
            	    lv_clas_0_0=ruleClassType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"clas",
            	            		lv_clas_0_0, 
            	            		"ClassType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:99:6: ( (lv_proc_1_0= ruleProcedure ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:99:6: ( (lv_proc_1_0= ruleProcedure ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:100:1: (lv_proc_1_0= ruleProcedure )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:100:1: (lv_proc_1_0= ruleProcedure )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:101:3: lv_proc_1_0= ruleProcedure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getProcProcedureParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcedure_in_ruleModel158);
            	    lv_proc_1_0=ruleProcedure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"proc",
            	            		lv_proc_1_0, 
            	            		"Procedure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:118:6: ( (lv_statem_2_0= ruleStatement ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:118:6: ( (lv_statem_2_0= ruleStatement ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:119:1: (lv_statem_2_0= ruleStatement )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:119:1: (lv_statem_2_0= ruleStatement )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:120:3: lv_statem_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStatemStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleModel185);
            	    lv_statem_2_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statem",
            	            		lv_statem_2_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:137:6: ( (lv_exp_3_0= ruleExpression ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:137:6: ( (lv_exp_3_0= ruleExpression ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:138:1: (lv_exp_3_0= ruleExpression )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:138:1: (lv_exp_3_0= ruleExpression )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:139:3: lv_exp_3_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleModel212);
            	    lv_exp_3_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_3_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClassType"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:163:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:164:2: (iv_ruleClassType= ruleClassType EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:165:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType249);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:172:1: ruleClassType returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'noclass' ) ) | (otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) ) ) )* ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_noclass_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_blocking_8_1=null;
        Token lv_blocking_8_2=null;
        AntlrDatatypeRuleToken lv_prefix_4_0 = null;

        AntlrDatatypeRuleToken lv_suffix_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:175:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'noclass' ) ) | (otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:176:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'noclass' ) ) | (otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:176:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'noclass' ) ) | (otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:176:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'noclass' ) ) | (otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleClassType296); 

                	newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getClassKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:180:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:181:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:181:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:182:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassType313); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClassTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:198:2: ( ( (lv_noclass_2_0= 'noclass' ) ) | (otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) ) ) )*
            loop3:
            do {
                int alt3=5;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt3=1;
                    }
                    break;
                case 13:
                    {
                    alt3=2;
                    }
                    break;
                case 14:
                    {
                    alt3=3;
                    }
                    break;
                case 15:
                    {
                    alt3=4;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:198:3: ( (lv_noclass_2_0= 'noclass' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:198:3: ( (lv_noclass_2_0= 'noclass' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:199:1: (lv_noclass_2_0= 'noclass' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:199:1: (lv_noclass_2_0= 'noclass' )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:200:3: lv_noclass_2_0= 'noclass'
            	    {
            	    lv_noclass_2_0=(Token)match(input,12,FOLLOW_12_in_ruleClassType337); 

            	            newLeafNode(lv_noclass_2_0, grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getClassTypeRule());
            	    	        }
            	           		addWithLastConsumed(current, "noclass", lv_noclass_2_0, "noclass");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:6: (otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:6: (otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:8: otherlv_3= 'prefix' ( (lv_prefix_4_0= ruleMultID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClassType369); 

            	        	newLeafNode(otherlv_3, grammarAccess.getClassTypeAccess().getPrefixKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:218:1: ( (lv_prefix_4_0= ruleMultID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:219:1: (lv_prefix_4_0= ruleMultID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:219:1: (lv_prefix_4_0= ruleMultID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:220:3: lv_prefix_4_0= ruleMultID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassTypeAccess().getPrefixMultIDParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultID_in_ruleClassType390);
            	    lv_prefix_4_0=ruleMultID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prefix",
            	            		lv_prefix_4_0, 
            	            		"MultID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:237:6: (otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:237:6: (otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:237:8: otherlv_5= 'suffix' ( (lv_suffix_6_0= ruleMultID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleClassType410); 

            	        	newLeafNode(otherlv_5, grammarAccess.getClassTypeAccess().getSuffixKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:241:1: ( (lv_suffix_6_0= ruleMultID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:242:1: (lv_suffix_6_0= ruleMultID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:242:1: (lv_suffix_6_0= ruleMultID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:243:3: lv_suffix_6_0= ruleMultID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassTypeAccess().getSuffixMultIDParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultID_in_ruleClassType431);
            	    lv_suffix_6_0=ruleMultID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"suffix",
            	            		lv_suffix_6_0, 
            	            		"MultID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:260:6: (otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:260:6: (otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:260:8: otherlv_7= 'blocking' ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleClassType451); 

            	        	newLeafNode(otherlv_7, grammarAccess.getClassTypeAccess().getBlockingKeyword_2_3_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:264:1: ( ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:265:1: ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:265:1: ( (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:266:1: (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:266:1: (lv_blocking_8_1= 'braces' | lv_blocking_8_2= 'indent' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==16) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==17) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:267:3: lv_blocking_8_1= 'braces'
            	            {
            	            lv_blocking_8_1=(Token)match(input,16,FOLLOW_16_in_ruleClassType471); 

            	                    newLeafNode(lv_blocking_8_1, grammarAccess.getClassTypeAccess().getBlockingBracesKeyword_2_3_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	            	        }
            	                   		addWithLastConsumed(current, "blocking", lv_blocking_8_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:279:8: lv_blocking_8_2= 'indent'
            	            {
            	            lv_blocking_8_2=(Token)match(input,17,FOLLOW_17_in_ruleClassType500); 

            	                    newLeafNode(lv_blocking_8_2, grammarAccess.getClassTypeAccess().getBlockingIndentKeyword_2_3_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	            	        }
            	                   		addWithLastConsumed(current, "blocking", lv_blocking_8_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleProcedure"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:302:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:303:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:304:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure555);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:311:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'Procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )* ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_types_7_1=null;
        Token lv_types_7_2=null;
        Token lv_types_7_3=null;
        Token lv_types_7_4=null;
        Token lv_types_7_5=null;
        AntlrDatatypeRuleToken lv_prefix_3_0 = null;

        AntlrDatatypeRuleToken lv_suffix_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:314:28: ( (otherlv_0= 'Procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:1: (otherlv_0= 'Procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:1: (otherlv_0= 'Procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:3: otherlv_0= 'Procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProcedure602); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:319:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:320:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:320:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:321:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure619); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:337:2: ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt5=1;
                    }
                    break;
                case 14:
                    {
                    alt5=2;
                    }
                    break;
                case 19:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:337:3: (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:337:3: (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:337:5: otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProcedure638); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getPrefixKeyword_2_0_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:341:1: ( (lv_prefix_3_0= ruleMultID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:342:1: (lv_prefix_3_0= ruleMultID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:342:1: (lv_prefix_3_0= ruleMultID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:343:3: lv_prefix_3_0= ruleMultID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getPrefixMultIDParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultID_in_ruleProcedure659);
            	    lv_prefix_3_0=ruleMultID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prefix",
            	            		lv_prefix_3_0, 
            	            		"MultID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:360:6: (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:360:6: (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:360:8: otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProcedure679); 

            	        	newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getSuffixKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:364:1: ( (lv_suffix_5_0= ruleMultID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:365:1: (lv_suffix_5_0= ruleMultID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:365:1: (lv_suffix_5_0= ruleMultID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:366:3: lv_suffix_5_0= ruleMultID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getSuffixMultIDParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultID_in_ruleProcedure700);
            	    lv_suffix_5_0=ruleMultID();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"suffix",
            	            		lv_suffix_5_0, 
            	            		"MultID");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:383:6: (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:383:6: (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:383:8: otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleProcedure720); 

            	        	newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getTypesKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:387:1: ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:388:1: ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:388:1: ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:389:1: (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:389:1: (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' )
            	    int alt4=5;
            	    switch ( input.LA(1) ) {
            	    case 20:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt4=4;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt4=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt4) {
            	        case 1 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:390:3: lv_types_7_1= 'colonSeperated'
            	            {
            	            lv_types_7_1=(Token)match(input,20,FOLLOW_20_in_ruleProcedure740); 

            	                    newLeafNode(lv_types_7_1, grammarAccess.getProcedureAccess().getTypesColonSeperatedKeyword_2_2_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:402:8: lv_types_7_2= 'spaceSeperated'
            	            {
            	            lv_types_7_2=(Token)match(input,21,FOLLOW_21_in_ruleProcedure769); 

            	                    newLeafNode(lv_types_7_2, grammarAccess.getProcedureAccess().getTypesSpaceSeperatedKeyword_2_2_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:414:8: lv_types_7_3= 'inHeader'
            	            {
            	            lv_types_7_3=(Token)match(input,22,FOLLOW_22_in_ruleProcedure798); 

            	                    newLeafNode(lv_types_7_3, grammarAccess.getProcedureAccess().getTypesInHeaderKeyword_2_2_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:426:8: lv_types_7_4= 'inferred'
            	            {
            	            lv_types_7_4=(Token)match(input,23,FOLLOW_23_in_ruleProcedure827); 

            	                    newLeafNode(lv_types_7_4, grammarAccess.getProcedureAccess().getTypesInferredKeyword_2_2_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:438:8: lv_types_7_5= 'untyped'
            	            {
            	            lv_types_7_5=(Token)match(input,24,FOLLOW_24_in_ruleProcedure856); 

            	                    newLeafNode(lv_types_7_5, grammarAccess.getProcedureAccess().getTypesUntypedKeyword_2_2_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_5, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleStatement"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:461:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:462:2: (iv_ruleStatement= ruleStatement EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement911);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement921); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:470:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_rep_3_0=null;
        Token otherlv_4=null;
        Token lv_until_5_0=null;
        Token otherlv_6=null;
        Token lv_while_7_0=null;
        Token otherlv_8=null;
        Token lv_do_9_0=null;
        Token otherlv_10=null;
        Token lv_for_11_0=null;
        Token otherlv_12=null;
        Token lv_var_13_0=null;
        Token otherlv_14=null;
        Token lv_ex_15_0=null;
        Token otherlv_16=null;
        Token lv_val_17_0=null;
        Token otherlv_18=null;
        Token lv_ex_19_0=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:473:28: ( (otherlv_0= 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:474:1: (otherlv_0= 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:474:1: (otherlv_0= 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:474:3: otherlv_0= 'statement' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleStatement958); 

                	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getStatementKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:478:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:479:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:479:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:480:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement975); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:496:2: ( (otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 33:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:496:3: (otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:496:3: (otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:496:5: otherlv_2= 'repeat' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'until' ( (lv_until_5_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleStatement994); 

                        	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getRepeatKeyword_2_0_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:500:1: ( (lv_rep_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:501:1: (lv_rep_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:501:1: (lv_rep_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:502:3: lv_rep_3_0= RULE_ID
                    {
                    lv_rep_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1011); 

                    			newLeafNode(lv_rep_3_0, grammarAccess.getStatementAccess().getRepIDTerminalRuleCall_2_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rep",
                            		lv_rep_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleStatement1028); 

                        	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getUntilKeyword_2_0_2());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:522:1: ( (lv_until_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:523:1: (lv_until_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:523:1: (lv_until_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:524:3: lv_until_5_0= RULE_ID
                    {
                    lv_until_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1045); 

                    			newLeafNode(lv_until_5_0, grammarAccess.getStatementAccess().getUntilIDTerminalRuleCall_2_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"until",
                            		lv_until_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:541:6: (otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:541:6: (otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:541:8: otherlv_6= 'while' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'do' ( (lv_do_9_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleStatement1070); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getWhileKeyword_2_1_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:545:1: ( (lv_while_7_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:546:1: (lv_while_7_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:546:1: (lv_while_7_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:547:3: lv_while_7_0= RULE_ID
                    {
                    lv_while_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1087); 

                    			newLeafNode(lv_while_7_0, grammarAccess.getStatementAccess().getWhileIDTerminalRuleCall_2_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"while",
                            		lv_while_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleStatement1104); 

                        	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getDoKeyword_2_1_2());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:567:1: ( (lv_do_9_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:568:1: (lv_do_9_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:568:1: (lv_do_9_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:569:3: lv_do_9_0= RULE_ID
                    {
                    lv_do_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1121); 

                    			newLeafNode(lv_do_9_0, grammarAccess.getStatementAccess().getDoIDTerminalRuleCall_2_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"do",
                            		lv_do_9_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:586:6: (otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:586:6: (otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:586:8: otherlv_10= 'for' ( (lv_for_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleStatement1146); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getForKeyword_2_2_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:590:1: ( (lv_for_11_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:591:1: (lv_for_11_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:591:1: (lv_for_11_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:592:3: lv_for_11_0= RULE_ID
                    {
                    lv_for_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1163); 

                    			newLeafNode(lv_for_11_0, grammarAccess.getStatementAccess().getForIDTerminalRuleCall_2_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"for",
                            		lv_for_11_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:609:6: (otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:609:6: (otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:609:8: otherlv_12= 'var' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )?
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleStatement1188); 

                        	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getVarKeyword_2_3_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:613:1: ( (lv_var_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:614:1: (lv_var_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:614:1: (lv_var_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:615:3: lv_var_13_0= RULE_ID
                    {
                    lv_var_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1205); 

                    			newLeafNode(lv_var_13_0, grammarAccess.getStatementAccess().getVarIDTerminalRuleCall_2_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"var",
                            		lv_var_13_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:631:2: (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==32) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:631:4: otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) )
                            {
                            otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleStatement1223); 

                                	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getEqualsSignKeyword_2_3_2_0());
                                
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:635:1: ( (lv_ex_15_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:636:1: (lv_ex_15_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:636:1: (lv_ex_15_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:637:3: lv_ex_15_0= RULE_ID
                            {
                            lv_ex_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1240); 

                            			newLeafNode(lv_ex_15_0, grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_3_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStatementRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"ex",
                                    		lv_ex_15_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:654:6: (otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:654:6: (otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:654:8: otherlv_16= 'val' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_33_in_ruleStatement1267); 

                        	newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getValKeyword_2_4_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:658:1: ( (lv_val_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:659:1: (lv_val_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:659:1: (lv_val_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:660:3: lv_val_17_0= RULE_ID
                    {
                    lv_val_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1284); 

                    			newLeafNode(lv_val_17_0, grammarAccess.getStatementAccess().getValIDTerminalRuleCall_2_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_17_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleStatement1301); 

                        	newLeafNode(otherlv_18, grammarAccess.getStatementAccess().getEqualsSignKeyword_2_4_2());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:680:1: ( (lv_ex_19_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:681:1: (lv_ex_19_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:681:1: (lv_ex_19_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:682:3: lv_ex_19_0= RULE_ID
                    {
                    lv_ex_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStatement1318); 

                    			newLeafNode(lv_ex_19_0, grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStatementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ex",
                            		lv_ex_19_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:706:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:707:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:708:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1361);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:715:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) ) ) | (otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | (otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) ) ) | (otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) ) ) | (otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) ) ) | (otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) ) ) | (otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) ) ) | (otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_par1_4_0=null;
        Token otherlv_5=null;
        Token lv_par1_6_0=null;
        Token otherlv_8=null;
        Token lv_par1_9_0=null;
        Token lv_par2_11_0=null;
        Token otherlv_12=null;
        Token lv_par1_13_0=null;
        Token lv_par2_15_0=null;
        Token otherlv_16=null;
        Token lv_literal_17_1=null;
        Token lv_literal_17_2=null;
        Token lv_literal_17_3=null;
        Token lv_literal_17_4=null;
        Token otherlv_18=null;
        Token lv_bracket_19_0=null;
        Token otherlv_20=null;
        Token lv_braces_21_0=null;
        Token otherlv_22=null;
        Token lv_parenthasis_23_0=null;
        AntlrDatatypeRuleToken lv_prefix_3_0 = null;

        AntlrDatatypeRuleToken lv_suffix_7_0 = null;

        AntlrDatatypeRuleToken lv_infix_10_0 = null;

        AntlrDatatypeRuleToken lv_infixleft_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:718:28: ( (otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) ) ) | (otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | (otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) ) ) | (otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) ) ) | (otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) ) ) | (otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) ) ) | (otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) ) ) | (otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:1: (otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) ) ) | (otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | (otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) ) ) | (otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) ) ) | (otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) ) ) | (otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) ) ) | (otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) ) ) | (otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:1: (otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) ) ) | (otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | (otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) ) ) | (otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) ) ) | (otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) ) ) | (otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) ) ) | (otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) ) ) | (otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:3: otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) ) ) | (otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | (otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) ) ) | (otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) ) ) | (otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) ) ) | (otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) ) ) | (otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) ) ) | (otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleExpression1408); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpressionKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:723:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:724:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:724:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:725:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1425); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:741:2: ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) ) ) | (otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | (otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) ) ) | (otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) ) ) | (otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) ) ) | (otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) ) ) | (otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) ) ) | (otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) ) ) )*
            loop9:
            do {
                int alt9=9;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt9=1;
                    }
                    break;
                case 14:
                    {
                    alt9=2;
                    }
                    break;
                case 35:
                    {
                    alt9=3;
                    }
                    break;
                case 36:
                    {
                    alt9=4;
                    }
                    break;
                case 37:
                    {
                    alt9=5;
                    }
                    break;
                case 42:
                    {
                    alt9=6;
                    }
                    break;
                case 16:
                    {
                    alt9=7;
                    }
                    break;
                case 43:
                    {
                    alt9=8;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:741:3: (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:741:3: (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:741:5: otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultString ) ) ( (lv_par1_4_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleExpression1444); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPrefixKeyword_2_0_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:745:1: ( (lv_prefix_3_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:746:1: (lv_prefix_3_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:746:1: (lv_prefix_3_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:747:3: lv_prefix_3_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getPrefixMultStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleExpression1465);
            	    lv_prefix_3_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prefix",
            	            		lv_prefix_3_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:763:2: ( (lv_par1_4_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:764:1: (lv_par1_4_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:764:1: (lv_par1_4_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:765:3: lv_par1_4_0= RULE_ID
            	    {
            	    lv_par1_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1482); 

            	    			newLeafNode(lv_par1_4_0, grammarAccess.getExpressionAccess().getPar1IDTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"par1",
            	            		lv_par1_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:782:6: (otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:782:6: (otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:782:8: otherlv_5= 'suffix' ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleExpression1507); 

            	        	newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getSuffixKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:786:1: ( (lv_par1_6_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:787:1: (lv_par1_6_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:787:1: (lv_par1_6_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:788:3: lv_par1_6_0= RULE_ID
            	    {
            	    lv_par1_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1524); 

            	    			newLeafNode(lv_par1_6_0, grammarAccess.getExpressionAccess().getPar1IDTerminalRuleCall_2_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"par1",
            	            		lv_par1_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:804:2: ( (lv_suffix_7_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:805:1: (lv_suffix_7_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:805:1: (lv_suffix_7_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:806:3: lv_suffix_7_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getSuffixMultStringParserRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleExpression1550);
            	    lv_suffix_7_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"suffix",
            	            		lv_suffix_7_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:823:6: (otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:823:6: (otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:823:8: otherlv_8= 'infix' ( (lv_par1_9_0= RULE_ID ) ) ( (lv_infix_10_0= ruleMultString ) ) ( (lv_par2_11_0= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,35,FOLLOW_35_in_ruleExpression1570); 

            	        	newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getInfixKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:827:1: ( (lv_par1_9_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:828:1: (lv_par1_9_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:828:1: (lv_par1_9_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:829:3: lv_par1_9_0= RULE_ID
            	    {
            	    lv_par1_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1587); 

            	    			newLeafNode(lv_par1_9_0, grammarAccess.getExpressionAccess().getPar1IDTerminalRuleCall_2_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"par1",
            	            		lv_par1_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:845:2: ( (lv_infix_10_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:846:1: (lv_infix_10_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:846:1: (lv_infix_10_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:847:3: lv_infix_10_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getInfixMultStringParserRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleExpression1613);
            	    lv_infix_10_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"infix",
            	            		lv_infix_10_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:863:2: ( (lv_par2_11_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:864:1: (lv_par2_11_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:864:1: (lv_par2_11_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:865:3: lv_par2_11_0= RULE_ID
            	    {
            	    lv_par2_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1630); 

            	    			newLeafNode(lv_par2_11_0, grammarAccess.getExpressionAccess().getPar2IDTerminalRuleCall_2_2_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"par2",
            	            		lv_par2_11_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:882:6: (otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:882:6: (otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:882:8: otherlv_12= 'infixleft' ( (lv_par1_13_0= RULE_ID ) ) ( (lv_infixleft_14_0= ruleMultString ) ) ( (lv_par2_15_0= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleExpression1655); 

            	        	newLeafNode(otherlv_12, grammarAccess.getExpressionAccess().getInfixleftKeyword_2_3_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:886:1: ( (lv_par1_13_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:887:1: (lv_par1_13_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:887:1: (lv_par1_13_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:888:3: lv_par1_13_0= RULE_ID
            	    {
            	    lv_par1_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1672); 

            	    			newLeafNode(lv_par1_13_0, grammarAccess.getExpressionAccess().getPar1IDTerminalRuleCall_2_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"par1",
            	            		lv_par1_13_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:904:2: ( (lv_infixleft_14_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:905:1: (lv_infixleft_14_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:905:1: (lv_infixleft_14_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:906:3: lv_infixleft_14_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getInfixleftMultStringParserRuleCall_2_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleExpression1698);
            	    lv_infixleft_14_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"infixleft",
            	            		lv_infixleft_14_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:922:2: ( (lv_par2_15_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:923:1: (lv_par2_15_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:923:1: (lv_par2_15_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:924:3: lv_par2_15_0= RULE_ID
            	    {
            	    lv_par2_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1715); 

            	    			newLeafNode(lv_par2_15_0, grammarAccess.getExpressionAccess().getPar2IDTerminalRuleCall_2_3_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"par2",
            	            		lv_par2_15_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:941:6: (otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:941:6: (otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:941:8: otherlv_16= 'literal' ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) )
            	    {
            	    otherlv_16=(Token)match(input,37,FOLLOW_37_in_ruleExpression1740); 

            	        	newLeafNode(otherlv_16, grammarAccess.getExpressionAccess().getLiteralKeyword_2_4_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:945:1: ( ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:946:1: ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:946:1: ( (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:947:1: (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:947:1: (lv_literal_17_1= 'int' | lv_literal_17_2= 'string' | lv_literal_17_3= 'bool' | lv_literal_17_4= 'float' )
            	    int alt8=4;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:948:3: lv_literal_17_1= 'int'
            	            {
            	            lv_literal_17_1=(Token)match(input,38,FOLLOW_38_in_ruleExpression1760); 

            	                    newLeafNode(lv_literal_17_1, grammarAccess.getExpressionAccess().getLiteralIntKeyword_2_4_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "literal", lv_literal_17_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:960:8: lv_literal_17_2= 'string'
            	            {
            	            lv_literal_17_2=(Token)match(input,39,FOLLOW_39_in_ruleExpression1789); 

            	                    newLeafNode(lv_literal_17_2, grammarAccess.getExpressionAccess().getLiteralStringKeyword_2_4_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "literal", lv_literal_17_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:972:8: lv_literal_17_3= 'bool'
            	            {
            	            lv_literal_17_3=(Token)match(input,40,FOLLOW_40_in_ruleExpression1818); 

            	                    newLeafNode(lv_literal_17_3, grammarAccess.getExpressionAccess().getLiteralBoolKeyword_2_4_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "literal", lv_literal_17_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:984:8: lv_literal_17_4= 'float'
            	            {
            	            lv_literal_17_4=(Token)match(input,41,FOLLOW_41_in_ruleExpression1847); 

            	                    newLeafNode(lv_literal_17_4, grammarAccess.getExpressionAccess().getLiteralFloatKeyword_2_4_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "literal", lv_literal_17_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1000:6: (otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1000:6: (otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1000:8: otherlv_18= 'bracket' ( (lv_bracket_19_0= RULE_ID ) )
            	    {
            	    otherlv_18=(Token)match(input,42,FOLLOW_42_in_ruleExpression1883); 

            	        	newLeafNode(otherlv_18, grammarAccess.getExpressionAccess().getBracketKeyword_2_5_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1004:1: ( (lv_bracket_19_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1005:1: (lv_bracket_19_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1005:1: (lv_bracket_19_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1006:3: lv_bracket_19_0= RULE_ID
            	    {
            	    lv_bracket_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1900); 

            	    			newLeafNode(lv_bracket_19_0, grammarAccess.getExpressionAccess().getBracketIDTerminalRuleCall_2_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"bracket",
            	            		lv_bracket_19_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1023:6: (otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1023:6: (otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1023:8: otherlv_20= 'braces' ( (lv_braces_21_0= RULE_ID ) )
            	    {
            	    otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleExpression1925); 

            	        	newLeafNode(otherlv_20, grammarAccess.getExpressionAccess().getBracesKeyword_2_6_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1027:1: ( (lv_braces_21_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1028:1: (lv_braces_21_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1028:1: (lv_braces_21_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1029:3: lv_braces_21_0= RULE_ID
            	    {
            	    lv_braces_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1942); 

            	    			newLeafNode(lv_braces_21_0, grammarAccess.getExpressionAccess().getBracesIDTerminalRuleCall_2_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"braces",
            	            		lv_braces_21_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1046:6: (otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1046:6: (otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1046:8: otherlv_22= 'parenthasis' ( (lv_parenthasis_23_0= RULE_ID ) )
            	    {
            	    otherlv_22=(Token)match(input,43,FOLLOW_43_in_ruleExpression1967); 

            	        	newLeafNode(otherlv_22, grammarAccess.getExpressionAccess().getParenthasisKeyword_2_7_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1050:1: ( (lv_parenthasis_23_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1051:1: (lv_parenthasis_23_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1051:1: (lv_parenthasis_23_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1052:3: lv_parenthasis_23_0= RULE_ID
            	    {
            	    lv_parenthasis_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1984); 

            	    			newLeafNode(lv_parenthasis_23_0, grammarAccess.getExpressionAccess().getParenthasisIDTerminalRuleCall_2_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"parenthasis",
            	            		lv_parenthasis_23_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMultID"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1076:1: entryRuleMultID returns [String current=null] : iv_ruleMultID= ruleMultID EOF ;
    public final String entryRuleMultID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultID = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1077:2: (iv_ruleMultID= ruleMultID EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1078:2: iv_ruleMultID= ruleMultID EOF
            {
             newCompositeNode(grammarAccess.getMultIDRule()); 
            pushFollow(FOLLOW_ruleMultID_in_entryRuleMultID2029);
            iv_ruleMultID=ruleMultID();

            state._fsp--;

             current =iv_ruleMultID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultID2040); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultID"


    // $ANTLR start "ruleMultID"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1085:1: ruleMultID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (kw= '[' (this_ID_2= RULE_ID )* kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleMultID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1088:28: ( (this_ID_0= RULE_ID | (kw= '[' (this_ID_2= RULE_ID )* kw= ']' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1089:1: (this_ID_0= RULE_ID | (kw= '[' (this_ID_2= RULE_ID )* kw= ']' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1089:1: (this_ID_0= RULE_ID | (kw= '[' (this_ID_2= RULE_ID )* kw= ']' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==44) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1089:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultID2080); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getMultIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1097:6: (kw= '[' (this_ID_2= RULE_ID )* kw= ']' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1097:6: (kw= '[' (this_ID_2= RULE_ID )* kw= ']' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1098:2: kw= '[' (this_ID_2= RULE_ID )* kw= ']'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleMultID2105); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_0()); 
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1103:1: (this_ID_2= RULE_ID )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1103:6: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultID2121); 

                    	    		current.merge(this_ID_2);
                    	        
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getMultIDAccess().getIDTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    kw=(Token)match(input,45,FOLLOW_45_in_ruleMultID2141); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultID"


    // $ANTLR start "entryRuleMultString"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1124:1: entryRuleMultString returns [String current=null] : iv_ruleMultString= ruleMultString EOF ;
    public final String entryRuleMultString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1125:2: (iv_ruleMultString= ruleMultString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1126:2: iv_ruleMultString= ruleMultString EOF
            {
             newCompositeNode(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString2183);
            iv_ruleMultString=ruleMultString();

            state._fsp--;

             current =iv_ruleMultString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString2194); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultString"


    // $ANTLR start "ruleMultString"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1133:1: ruleMultString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | (kw= '[' (this_STRING_2= RULE_STRING )* kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleMultString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1136:28: ( (this_STRING_0= RULE_STRING | (kw= '[' (this_STRING_2= RULE_STRING )* kw= ']' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1137:1: (this_STRING_0= RULE_STRING | (kw= '[' (this_STRING_2= RULE_STRING )* kw= ']' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1137:1: (this_STRING_0= RULE_STRING | (kw= '[' (this_STRING_2= RULE_STRING )* kw= ']' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==44) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1137:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString2234); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getMultStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1145:6: (kw= '[' (this_STRING_2= RULE_STRING )* kw= ']' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1145:6: (kw= '[' (this_STRING_2= RULE_STRING )* kw= ']' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1146:2: kw= '[' (this_STRING_2= RULE_STRING )* kw= ']'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleMultString2259); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_0()); 
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1151:1: (this_STRING_2= RULE_STRING )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_STRING) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1151:6: this_STRING_2= RULE_STRING
                    	    {
                    	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString2275); 

                    	    		current.merge(this_STRING_2);
                    	        
                    	     
                    	        newLeafNode(this_STRING_2, grammarAccess.getMultStringAccess().getSTRINGTerminalRuleCall_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    kw=(Token)match(input,45,FOLLOW_45_in_ruleMultString2295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultString"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_ruleModel131 = new BitSet(new long[]{0x0000000402040802L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleModel158 = new BitSet(new long[]{0x0000000402040802L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModel185 = new BitSet(new long[]{0x0000000402040802L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel212 = new BitSet(new long[]{0x0000000402040802L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClassType296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassType313 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_12_in_ruleClassType337 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_13_in_ruleClassType369 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleClassType390 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_14_in_ruleClassType410 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleClassType431 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_15_in_ruleClassType451 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleClassType471 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_17_in_ruleClassType500 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProcedure602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure619 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_13_in_ruleProcedure638 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleProcedure659 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_14_in_ruleProcedure679 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleProcedure700 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_19_in_ruleProcedure720 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_20_in_ruleProcedure740 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_21_in_ruleProcedure769 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_22_in_ruleProcedure798 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_23_in_ruleProcedure827 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_24_in_ruleProcedure856 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStatement958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement975 = new BitSet(new long[]{0x00000002D4000000L});
    public static final BitSet FOLLOW_26_in_ruleStatement994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1011 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStatement1028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStatement1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1087 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleStatement1104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStatement1146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStatement1188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1205 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleStatement1223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStatement1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1284 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleStatement1301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStatement1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExpression1408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1425 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_13_in_ruleExpression1444 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleExpression1465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1482 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_14_in_ruleExpression1507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1524 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleExpression1550 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_35_in_ruleExpression1570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1587 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleExpression1613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1630 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_36_in_ruleExpression1655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1672 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleExpression1698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1715 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_37_in_ruleExpression1740 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_38_in_ruleExpression1760 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_39_in_ruleExpression1789 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_40_in_ruleExpression1818 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_41_in_ruleExpression1847 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_42_in_ruleExpression1883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1900 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_16_in_ruleExpression1925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1942 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_43_in_ruleExpression1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1984 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_ruleMultID_in_entryRuleMultID2029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultID2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultID2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultID2105 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultID2121 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_45_in_ruleMultID2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString2183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultString2259 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString2275 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_45_in_ruleMultString2295 = new BitSet(new long[]{0x0000000000000002L});

}