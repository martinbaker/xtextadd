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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'noclass'", "'prefix'", "'suffix'", "'blocking'", "'braces'", "'indent'", "'procedure'", "'types'", "'colonSeperated'", "'spaceSeperated'", "'inHeader'", "'inferred'", "'untyped'", "'statement'", "'repeat'", "'until'", "'while'", "'do'", "'for'", "'var'", "'='", "'val'", "'expression'", "'infix'", "'infixleft'", "'literal'", "'int'", "'string'", "'bool'", "'float'", "'bracket'", "'parenthesis'", "'['", "']'"
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
        EObject lv_prefix_4_0 = null;

        EObject lv_suffix_6_0 = null;


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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:311:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )* ) ;
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
        EObject lv_prefix_3_0 = null;

        EObject lv_suffix_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:314:28: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:1: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'prefix' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'suffix' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'types' ( ( (lv_types_7_1= 'colonSeperated' | lv_types_7_2= 'spaceSeperated' | lv_types_7_3= 'inHeader' | lv_types_7_4= 'inferred' | lv_types_7_5= 'untyped' ) ) ) ) )*
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:715:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_prec_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:718:28: ( (otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:1: (otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:1: (otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:3: otherlv_0= 'expression' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )*
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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:741:2: ( (lv_prec_2_0= rulePrecedence ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=13 && LA8_0<=14)||LA8_0==16||(LA8_0>=35 && LA8_0<=37)||(LA8_0>=42 && LA8_0<=43)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:742:1: (lv_prec_2_0= rulePrecedence )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:742:1: (lv_prec_2_0= rulePrecedence )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:743:3: lv_prec_2_0= rulePrecedence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getPrecPrecedenceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrecedence_in_ruleExpression1451);
            	    lv_prec_2_0=rulePrecedence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prec",
            	            		lv_prec_2_0, 
            	            		"Precedence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRulePrecedence"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:767:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:768:2: (iv_rulePrecedence= rulePrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:769:2: iv_rulePrecedence= rulePrecedence EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_rulePrecedence_in_entryRulePrecedence1488);
            iv_rulePrecedence=rulePrecedence();

            state._fsp--;

             current =iv_rulePrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecedence1498); 

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
    // $ANTLR end "entryRulePrecedence"


    // $ANTLR start "rulePrecedence"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:776:1: rulePrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'prefix' ) ) ( (lv_rule_1_0= RULE_ID ) ) ( (lv_prefix_2_0= ruleMultString ) ) ( (lv_par1_3_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_4_0= 'suffix' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_8_0= 'infix' ) ) ( (lv_rule_9_0= RULE_ID ) ) ( (lv_par1_10_0= RULE_ID ) ) ( (lv_infix_11_0= ruleMultString ) ) ( (lv_par2_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'infixleft' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( (lv_par1_15_0= RULE_ID ) ) ( (lv_infixleft_16_0= ruleMultString ) ) ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'literal' ) ) ( (lv_rule_19_0= RULE_ID ) ) ( ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) ) ) ) | ( ( (lv_ruletyp_21_0= 'bracket' ) ) ( (lv_rule_22_0= RULE_ID ) ) ( (lv_bracket_23_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_24_0= 'braces' ) ) ( (lv_rule_25_0= RULE_ID ) ) ( (lv_braces_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'parenthesis' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_parenthesis_29_0= RULE_ID ) ) ) ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

        Token lv_ruletyp_0_0=null;
        Token lv_rule_1_0=null;
        Token lv_par1_3_0=null;
        Token lv_ruletyp_4_0=null;
        Token lv_rule_5_0=null;
        Token lv_par1_6_0=null;
        Token lv_ruletyp_8_0=null;
        Token lv_rule_9_0=null;
        Token lv_par1_10_0=null;
        Token lv_par2_12_0=null;
        Token lv_ruletyp_13_0=null;
        Token lv_rule_14_0=null;
        Token lv_par1_15_0=null;
        Token lv_par2_17_0=null;
        Token lv_ruletyp_18_0=null;
        Token lv_rule_19_0=null;
        Token lv_literal_20_1=null;
        Token lv_literal_20_2=null;
        Token lv_literal_20_3=null;
        Token lv_literal_20_4=null;
        Token lv_ruletyp_21_0=null;
        Token lv_rule_22_0=null;
        Token lv_bracket_23_0=null;
        Token lv_ruletyp_24_0=null;
        Token lv_rule_25_0=null;
        Token lv_braces_26_0=null;
        Token lv_ruletyp_27_0=null;
        Token lv_rule_28_0=null;
        Token lv_parenthesis_29_0=null;
        EObject lv_prefix_2_0 = null;

        EObject lv_suffix_7_0 = null;

        EObject lv_infix_11_0 = null;

        EObject lv_infixleft_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:779:28: ( ( ( ( (lv_ruletyp_0_0= 'prefix' ) ) ( (lv_rule_1_0= RULE_ID ) ) ( (lv_prefix_2_0= ruleMultString ) ) ( (lv_par1_3_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_4_0= 'suffix' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_8_0= 'infix' ) ) ( (lv_rule_9_0= RULE_ID ) ) ( (lv_par1_10_0= RULE_ID ) ) ( (lv_infix_11_0= ruleMultString ) ) ( (lv_par2_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'infixleft' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( (lv_par1_15_0= RULE_ID ) ) ( (lv_infixleft_16_0= ruleMultString ) ) ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'literal' ) ) ( (lv_rule_19_0= RULE_ID ) ) ( ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) ) ) ) | ( ( (lv_ruletyp_21_0= 'bracket' ) ) ( (lv_rule_22_0= RULE_ID ) ) ( (lv_bracket_23_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_24_0= 'braces' ) ) ( (lv_rule_25_0= RULE_ID ) ) ( (lv_braces_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'parenthesis' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_parenthesis_29_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:1: ( ( ( (lv_ruletyp_0_0= 'prefix' ) ) ( (lv_rule_1_0= RULE_ID ) ) ( (lv_prefix_2_0= ruleMultString ) ) ( (lv_par1_3_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_4_0= 'suffix' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_8_0= 'infix' ) ) ( (lv_rule_9_0= RULE_ID ) ) ( (lv_par1_10_0= RULE_ID ) ) ( (lv_infix_11_0= ruleMultString ) ) ( (lv_par2_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'infixleft' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( (lv_par1_15_0= RULE_ID ) ) ( (lv_infixleft_16_0= ruleMultString ) ) ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'literal' ) ) ( (lv_rule_19_0= RULE_ID ) ) ( ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) ) ) ) | ( ( (lv_ruletyp_21_0= 'bracket' ) ) ( (lv_rule_22_0= RULE_ID ) ) ( (lv_bracket_23_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_24_0= 'braces' ) ) ( (lv_rule_25_0= RULE_ID ) ) ( (lv_braces_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'parenthesis' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_parenthesis_29_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:1: ( ( ( (lv_ruletyp_0_0= 'prefix' ) ) ( (lv_rule_1_0= RULE_ID ) ) ( (lv_prefix_2_0= ruleMultString ) ) ( (lv_par1_3_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_4_0= 'suffix' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_8_0= 'infix' ) ) ( (lv_rule_9_0= RULE_ID ) ) ( (lv_par1_10_0= RULE_ID ) ) ( (lv_infix_11_0= ruleMultString ) ) ( (lv_par2_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'infixleft' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( (lv_par1_15_0= RULE_ID ) ) ( (lv_infixleft_16_0= ruleMultString ) ) ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'literal' ) ) ( (lv_rule_19_0= RULE_ID ) ) ( ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) ) ) ) | ( ( (lv_ruletyp_21_0= 'bracket' ) ) ( (lv_rule_22_0= RULE_ID ) ) ( (lv_bracket_23_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_24_0= 'braces' ) ) ( (lv_rule_25_0= RULE_ID ) ) ( (lv_braces_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'parenthesis' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_parenthesis_29_0= RULE_ID ) ) ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 36:
                {
                alt10=4;
                }
                break;
            case 37:
                {
                alt10=5;
                }
                break;
            case 42:
                {
                alt10=6;
                }
                break;
            case 16:
                {
                alt10=7;
                }
                break;
            case 43:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:2: ( ( (lv_ruletyp_0_0= 'prefix' ) ) ( (lv_rule_1_0= RULE_ID ) ) ( (lv_prefix_2_0= ruleMultString ) ) ( (lv_par1_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:2: ( ( (lv_ruletyp_0_0= 'prefix' ) ) ( (lv_rule_1_0= RULE_ID ) ) ( (lv_prefix_2_0= ruleMultString ) ) ( (lv_par1_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:3: ( (lv_ruletyp_0_0= 'prefix' ) ) ( (lv_rule_1_0= RULE_ID ) ) ( (lv_prefix_2_0= ruleMultString ) ) ( (lv_par1_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:3: ( (lv_ruletyp_0_0= 'prefix' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:781:1: (lv_ruletyp_0_0= 'prefix' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:781:1: (lv_ruletyp_0_0= 'prefix' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:782:3: lv_ruletyp_0_0= 'prefix'
                    {
                    lv_ruletyp_0_0=(Token)match(input,13,FOLLOW_13_in_rulePrecedence1542); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getPrecedenceAccess().getRuletypPrefixKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "prefix");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:795:2: ( (lv_rule_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:796:1: (lv_rule_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:796:1: (lv_rule_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:797:3: lv_rule_1_0= RULE_ID
                    {
                    lv_rule_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1572); 

                    			newLeafNode(lv_rule_1_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:813:2: ( (lv_prefix_2_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:814:1: (lv_prefix_2_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:814:1: (lv_prefix_2_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:815:3: lv_prefix_2_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1598);
                    lv_prefix_2_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"prefix",
                            		lv_prefix_2_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:831:2: ( (lv_par1_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:832:1: (lv_par1_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:832:1: (lv_par1_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:833:3: lv_par1_3_0= RULE_ID
                    {
                    lv_par1_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1615); 

                    			newLeafNode(lv_par1_3_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:850:6: ( ( (lv_ruletyp_4_0= 'suffix' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:850:6: ( ( (lv_ruletyp_4_0= 'suffix' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:850:7: ( (lv_ruletyp_4_0= 'suffix' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_par1_6_0= RULE_ID ) ) ( (lv_suffix_7_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:850:7: ( (lv_ruletyp_4_0= 'suffix' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:851:1: (lv_ruletyp_4_0= 'suffix' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:851:1: (lv_ruletyp_4_0= 'suffix' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:852:3: lv_ruletyp_4_0= 'suffix'
                    {
                    lv_ruletyp_4_0=(Token)match(input,14,FOLLOW_14_in_rulePrecedence1646); 

                            newLeafNode(lv_ruletyp_4_0, grammarAccess.getPrecedenceAccess().getRuletypSuffixKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_4_0, "suffix");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:865:2: ( (lv_rule_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:866:1: (lv_rule_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:866:1: (lv_rule_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:867:3: lv_rule_5_0= RULE_ID
                    {
                    lv_rule_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1676); 

                    			newLeafNode(lv_rule_5_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:883:2: ( (lv_par1_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:884:1: (lv_par1_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:884:1: (lv_par1_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:885:3: lv_par1_6_0= RULE_ID
                    {
                    lv_par1_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1698); 

                    			newLeafNode(lv_par1_6_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_6_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:901:2: ( (lv_suffix_7_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:902:1: (lv_suffix_7_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:902:1: (lv_suffix_7_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:903:3: lv_suffix_7_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1724);
                    lv_suffix_7_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:920:6: ( ( (lv_ruletyp_8_0= 'infix' ) ) ( (lv_rule_9_0= RULE_ID ) ) ( (lv_par1_10_0= RULE_ID ) ) ( (lv_infix_11_0= ruleMultString ) ) ( (lv_par2_12_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:920:6: ( ( (lv_ruletyp_8_0= 'infix' ) ) ( (lv_rule_9_0= RULE_ID ) ) ( (lv_par1_10_0= RULE_ID ) ) ( (lv_infix_11_0= ruleMultString ) ) ( (lv_par2_12_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:920:7: ( (lv_ruletyp_8_0= 'infix' ) ) ( (lv_rule_9_0= RULE_ID ) ) ( (lv_par1_10_0= RULE_ID ) ) ( (lv_infix_11_0= ruleMultString ) ) ( (lv_par2_12_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:920:7: ( (lv_ruletyp_8_0= 'infix' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:921:1: (lv_ruletyp_8_0= 'infix' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:921:1: (lv_ruletyp_8_0= 'infix' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:922:3: lv_ruletyp_8_0= 'infix'
                    {
                    lv_ruletyp_8_0=(Token)match(input,35,FOLLOW_35_in_rulePrecedence1750); 

                            newLeafNode(lv_ruletyp_8_0, grammarAccess.getPrecedenceAccess().getRuletypInfixKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_8_0, "infix");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:935:2: ( (lv_rule_9_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:936:1: (lv_rule_9_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:936:1: (lv_rule_9_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:937:3: lv_rule_9_0= RULE_ID
                    {
                    lv_rule_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1780); 

                    			newLeafNode(lv_rule_9_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_9_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:953:2: ( (lv_par1_10_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:954:1: (lv_par1_10_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:954:1: (lv_par1_10_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:955:3: lv_par1_10_0= RULE_ID
                    {
                    lv_par1_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1802); 

                    			newLeafNode(lv_par1_10_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_10_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:971:2: ( (lv_infix_11_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:972:1: (lv_infix_11_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:972:1: (lv_infix_11_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:973:3: lv_infix_11_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1828);
                    lv_infix_11_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_11_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:989:2: ( (lv_par2_12_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:990:1: (lv_par2_12_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:990:1: (lv_par2_12_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:991:3: lv_par2_12_0= RULE_ID
                    {
                    lv_par2_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1845); 

                    			newLeafNode(lv_par2_12_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_2_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_12_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1008:6: ( ( (lv_ruletyp_13_0= 'infixleft' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( (lv_par1_15_0= RULE_ID ) ) ( (lv_infixleft_16_0= ruleMultString ) ) ( (lv_par2_17_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1008:6: ( ( (lv_ruletyp_13_0= 'infixleft' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( (lv_par1_15_0= RULE_ID ) ) ( (lv_infixleft_16_0= ruleMultString ) ) ( (lv_par2_17_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1008:7: ( (lv_ruletyp_13_0= 'infixleft' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( (lv_par1_15_0= RULE_ID ) ) ( (lv_infixleft_16_0= ruleMultString ) ) ( (lv_par2_17_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1008:7: ( (lv_ruletyp_13_0= 'infixleft' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1009:1: (lv_ruletyp_13_0= 'infixleft' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1009:1: (lv_ruletyp_13_0= 'infixleft' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1010:3: lv_ruletyp_13_0= 'infixleft'
                    {
                    lv_ruletyp_13_0=(Token)match(input,36,FOLLOW_36_in_rulePrecedence1876); 

                            newLeafNode(lv_ruletyp_13_0, grammarAccess.getPrecedenceAccess().getRuletypInfixleftKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_13_0, "infixleft");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1023:2: ( (lv_rule_14_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1024:1: (lv_rule_14_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1024:1: (lv_rule_14_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1025:3: lv_rule_14_0= RULE_ID
                    {
                    lv_rule_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1906); 

                    			newLeafNode(lv_rule_14_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_14_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1041:2: ( (lv_par1_15_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1042:1: (lv_par1_15_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1042:1: (lv_par1_15_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1043:3: lv_par1_15_0= RULE_ID
                    {
                    lv_par1_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1928); 

                    			newLeafNode(lv_par1_15_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_15_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1059:2: ( (lv_infixleft_16_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1060:1: (lv_infixleft_16_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1060:1: (lv_infixleft_16_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1061:3: lv_infixleft_16_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixleftMultStringParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1954);
                    lv_infixleft_16_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infixleft",
                            		lv_infixleft_16_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1077:2: ( (lv_par2_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1078:1: (lv_par2_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1078:1: (lv_par2_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1079:3: lv_par2_17_0= RULE_ID
                    {
                    lv_par2_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1971); 

                    			newLeafNode(lv_par2_17_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_17_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1096:6: ( ( (lv_ruletyp_18_0= 'literal' ) ) ( (lv_rule_19_0= RULE_ID ) ) ( ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1096:6: ( ( (lv_ruletyp_18_0= 'literal' ) ) ( (lv_rule_19_0= RULE_ID ) ) ( ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1096:7: ( (lv_ruletyp_18_0= 'literal' ) ) ( (lv_rule_19_0= RULE_ID ) ) ( ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1096:7: ( (lv_ruletyp_18_0= 'literal' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1097:1: (lv_ruletyp_18_0= 'literal' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1097:1: (lv_ruletyp_18_0= 'literal' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1098:3: lv_ruletyp_18_0= 'literal'
                    {
                    lv_ruletyp_18_0=(Token)match(input,37,FOLLOW_37_in_rulePrecedence2002); 

                            newLeafNode(lv_ruletyp_18_0, grammarAccess.getPrecedenceAccess().getRuletypLiteralKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_18_0, "literal");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1111:2: ( (lv_rule_19_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1112:1: (lv_rule_19_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1112:1: (lv_rule_19_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1113:3: lv_rule_19_0= RULE_ID
                    {
                    lv_rule_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2032); 

                    			newLeafNode(lv_rule_19_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_19_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1129:2: ( ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1130:1: ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1130:1: ( (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1131:1: (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1131:1: (lv_literal_20_1= 'int' | lv_literal_20_2= 'string' | lv_literal_20_3= 'bool' | lv_literal_20_4= 'float' )
                    int alt9=4;
                    switch ( input.LA(1) ) {
                    case 38:
                        {
                        alt9=1;
                        }
                        break;
                    case 39:
                        {
                        alt9=2;
                        }
                        break;
                    case 40:
                        {
                        alt9=3;
                        }
                        break;
                    case 41:
                        {
                        alt9=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1132:3: lv_literal_20_1= 'int'
                            {
                            lv_literal_20_1=(Token)match(input,38,FOLLOW_38_in_rulePrecedence2057); 

                                    newLeafNode(lv_literal_20_1, grammarAccess.getPrecedenceAccess().getLiteralIntKeyword_4_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "literal", lv_literal_20_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1144:8: lv_literal_20_2= 'string'
                            {
                            lv_literal_20_2=(Token)match(input,39,FOLLOW_39_in_rulePrecedence2086); 

                                    newLeafNode(lv_literal_20_2, grammarAccess.getPrecedenceAccess().getLiteralStringKeyword_4_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "literal", lv_literal_20_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1156:8: lv_literal_20_3= 'bool'
                            {
                            lv_literal_20_3=(Token)match(input,40,FOLLOW_40_in_rulePrecedence2115); 

                                    newLeafNode(lv_literal_20_3, grammarAccess.getPrecedenceAccess().getLiteralBoolKeyword_4_2_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "literal", lv_literal_20_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1168:8: lv_literal_20_4= 'float'
                            {
                            lv_literal_20_4=(Token)match(input,41,FOLLOW_41_in_rulePrecedence2144); 

                                    newLeafNode(lv_literal_20_4, grammarAccess.getPrecedenceAccess().getLiteralFloatKeyword_4_2_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "literal", lv_literal_20_4, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1184:6: ( ( (lv_ruletyp_21_0= 'bracket' ) ) ( (lv_rule_22_0= RULE_ID ) ) ( (lv_bracket_23_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1184:6: ( ( (lv_ruletyp_21_0= 'bracket' ) ) ( (lv_rule_22_0= RULE_ID ) ) ( (lv_bracket_23_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1184:7: ( (lv_ruletyp_21_0= 'bracket' ) ) ( (lv_rule_22_0= RULE_ID ) ) ( (lv_bracket_23_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1184:7: ( (lv_ruletyp_21_0= 'bracket' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1185:1: (lv_ruletyp_21_0= 'bracket' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1185:1: (lv_ruletyp_21_0= 'bracket' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1186:3: lv_ruletyp_21_0= 'bracket'
                    {
                    lv_ruletyp_21_0=(Token)match(input,42,FOLLOW_42_in_rulePrecedence2186); 

                            newLeafNode(lv_ruletyp_21_0, grammarAccess.getPrecedenceAccess().getRuletypBracketKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_21_0, "bracket");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1199:2: ( (lv_rule_22_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1200:1: (lv_rule_22_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1200:1: (lv_rule_22_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1201:3: lv_rule_22_0= RULE_ID
                    {
                    lv_rule_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2216); 

                    			newLeafNode(lv_rule_22_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_22_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1217:2: ( (lv_bracket_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1218:1: (lv_bracket_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1218:1: (lv_bracket_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1219:3: lv_bracket_23_0= RULE_ID
                    {
                    lv_bracket_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2238); 

                    			newLeafNode(lv_bracket_23_0, grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bracket",
                            		lv_bracket_23_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1236:6: ( ( (lv_ruletyp_24_0= 'braces' ) ) ( (lv_rule_25_0= RULE_ID ) ) ( (lv_braces_26_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1236:6: ( ( (lv_ruletyp_24_0= 'braces' ) ) ( (lv_rule_25_0= RULE_ID ) ) ( (lv_braces_26_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1236:7: ( (lv_ruletyp_24_0= 'braces' ) ) ( (lv_rule_25_0= RULE_ID ) ) ( (lv_braces_26_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1236:7: ( (lv_ruletyp_24_0= 'braces' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1237:1: (lv_ruletyp_24_0= 'braces' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1237:1: (lv_ruletyp_24_0= 'braces' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1238:3: lv_ruletyp_24_0= 'braces'
                    {
                    lv_ruletyp_24_0=(Token)match(input,16,FOLLOW_16_in_rulePrecedence2269); 

                            newLeafNode(lv_ruletyp_24_0, grammarAccess.getPrecedenceAccess().getRuletypBracesKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_24_0, "braces");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1251:2: ( (lv_rule_25_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1252:1: (lv_rule_25_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1252:1: (lv_rule_25_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1253:3: lv_rule_25_0= RULE_ID
                    {
                    lv_rule_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2299); 

                    			newLeafNode(lv_rule_25_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_25_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1269:2: ( (lv_braces_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1270:1: (lv_braces_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1270:1: (lv_braces_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1271:3: lv_braces_26_0= RULE_ID
                    {
                    lv_braces_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2321); 

                    			newLeafNode(lv_braces_26_0, grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"braces",
                            		lv_braces_26_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1288:6: ( ( (lv_ruletyp_27_0= 'parenthesis' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_parenthesis_29_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1288:6: ( ( (lv_ruletyp_27_0= 'parenthesis' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_parenthesis_29_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1288:7: ( (lv_ruletyp_27_0= 'parenthesis' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_parenthesis_29_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1288:7: ( (lv_ruletyp_27_0= 'parenthesis' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1289:1: (lv_ruletyp_27_0= 'parenthesis' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1289:1: (lv_ruletyp_27_0= 'parenthesis' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1290:3: lv_ruletyp_27_0= 'parenthesis'
                    {
                    lv_ruletyp_27_0=(Token)match(input,43,FOLLOW_43_in_rulePrecedence2352); 

                            newLeafNode(lv_ruletyp_27_0, grammarAccess.getPrecedenceAccess().getRuletypParenthesisKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_27_0, "parenthesis");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1303:2: ( (lv_rule_28_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1304:1: (lv_rule_28_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1304:1: (lv_rule_28_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1305:3: lv_rule_28_0= RULE_ID
                    {
                    lv_rule_28_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2382); 

                    			newLeafNode(lv_rule_28_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_28_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1321:2: ( (lv_parenthesis_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1322:1: (lv_parenthesis_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1322:1: (lv_parenthesis_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1323:3: lv_parenthesis_29_0= RULE_ID
                    {
                    lv_parenthesis_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2404); 

                    			newLeafNode(lv_parenthesis_29_0, grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parenthesis",
                            		lv_parenthesis_29_0, 
                            		"ID");
                    	    

                    }


                    }


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
    // $ANTLR end "rulePrecedence"


    // $ANTLR start "entryRuleMultID"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1347:1: entryRuleMultID returns [EObject current=null] : iv_ruleMultID= ruleMultID EOF ;
    public final EObject entryRuleMultID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultID = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1348:2: (iv_ruleMultID= ruleMultID EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1349:2: iv_ruleMultID= ruleMultID EOF
            {
             newCompositeNode(grammarAccess.getMultIDRule()); 
            pushFollow(FOLLOW_ruleMultID_in_entryRuleMultID2446);
            iv_ruleMultID=ruleMultID();

            state._fsp--;

             current =iv_ruleMultID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultID2456); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1356:1: ruleMultID returns [EObject current=null] : ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) ) ;
    public final EObject ruleMultID() throws RecognitionException {
        EObject current = null;

        Token lv_mi_1_0=null;
        Token otherlv_2=null;
        Token lv_mi_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1359:28: ( ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1360:1: ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1360:1: ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1360:2: () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1360:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1361:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultIDAccess().getMultIDAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1366:2: ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==44) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1366:3: ( (lv_mi_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1366:3: ( (lv_mi_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1367:1: (lv_mi_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1367:1: (lv_mi_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1368:3: lv_mi_1_0= RULE_ID
                    {
                    lv_mi_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultID2508); 

                    			newLeafNode(lv_mi_1_0, grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultIDRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"mi",
                            		lv_mi_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1385:6: (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1385:6: (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1385:8: otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleMultID2532); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_1_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1389:1: ( (lv_mi_3_0= RULE_ID ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1390:1: (lv_mi_3_0= RULE_ID )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1390:1: (lv_mi_3_0= RULE_ID )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1391:3: lv_mi_3_0= RULE_ID
                    	    {
                    	    lv_mi_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultID2549); 

                    	    			newLeafNode(lv_mi_3_0, grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMultIDRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"mi",
                    	            		lv_mi_3_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleMultID2567); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_1_2());
                        

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
    // $ANTLR end "ruleMultID"


    // $ANTLR start "entryRuleMultString"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1419:1: entryRuleMultString returns [EObject current=null] : iv_ruleMultString= ruleMultString EOF ;
    public final EObject entryRuleMultString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1420:2: (iv_ruleMultString= ruleMultString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1421:2: iv_ruleMultString= ruleMultString EOF
            {
             newCompositeNode(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString2605);
            iv_ruleMultString=ruleMultString();

            state._fsp--;

             current =iv_ruleMultString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString2615); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1428:1: ruleMultString returns [EObject current=null] : ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) ) ;
    public final EObject ruleMultString() throws RecognitionException {
        EObject current = null;

        Token lv_ms_1_0=null;
        Token otherlv_2=null;
        Token lv_ms_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1431:28: ( ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1432:1: ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1432:1: ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1432:2: () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1432:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1433:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultStringAccess().getMultStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1438:2: ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==44) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1438:3: ( (lv_ms_1_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1438:3: ( (lv_ms_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1439:1: (lv_ms_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1439:1: (lv_ms_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1440:3: lv_ms_1_0= RULE_STRING
                    {
                    lv_ms_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString2667); 

                    			newLeafNode(lv_ms_1_0, grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultStringRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"ms",
                            		lv_ms_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1457:6: (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1457:6: (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1457:8: otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleMultString2691); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_1_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1461:1: ( (lv_ms_3_0= RULE_STRING ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_STRING) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1462:1: (lv_ms_3_0= RULE_STRING )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1462:1: (lv_ms_3_0= RULE_STRING )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1463:3: lv_ms_3_0= RULE_STRING
                    	    {
                    	    lv_ms_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString2708); 

                    	    			newLeafNode(lv_ms_3_0, grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMultStringRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"ms",
                    	            		lv_ms_3_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleMultString2726); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_1_2());
                        

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
    public static final BitSet FOLLOW_rulePrecedence_in_ruleExpression1451 = new BitSet(new long[]{0x00000C3800016002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrecedence1542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1572 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrecedence1646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1698 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrecedence1750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1802 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrecedence1876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1928 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrecedence2002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2032 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_38_in_rulePrecedence2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrecedence2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrecedence2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePrecedence2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrecedence2186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrecedence2269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrecedence2352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_entryRuleMultID2446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultID2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultID2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultID2532 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultID2549 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_45_in_ruleMultID2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString2605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultString2691 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString2708 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_45_in_ruleMultString2726 = new BitSet(new long[]{0x0000000000000002L});

}