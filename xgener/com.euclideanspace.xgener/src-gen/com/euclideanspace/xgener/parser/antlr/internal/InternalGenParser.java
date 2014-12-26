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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CLASS'", "'NOCLASS'", "'PREFIX'", "'SUFFIX'", "'BLOCKING'", "'BRACES'", "'INDENT'", "'PROCEDURE'", "'TYPES'", "'COLONSEPERATED'", "'SPACESEPERATED'", "'INHEADER'", "'INFERRED'", "'UNTYPED'", "'STATEMENT'", "'REPEAT'", "'UNTIL'", "'WHILE'", "'DO'", "'FOR'", "'VAR'", "'='", "'VAL'", "'EXPRESSION'", "'CALLER'", "'.'", "'INFIX'", "'OUTER'", "'INFIXLEFT'", "'LITERAL'", "'INT'", "'STRING'", "'BOOL'", "'FLOAT'", "'BRACKET'", "'PARENTHESIS'", "'ANGLE'", "'INNERPREFIX'", "'INNERSUFFIX'", "'INNERINFIX'", "'INNERINFIXLEFT'", "'INNERBRACKET'", "'INNERBRACES'", "'INNERPARENTHESIS'", "'INNERANGLE'", "'['", "']'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:172:1: ruleClassType returns [EObject current=null] : (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:175:28: ( (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:176:1: (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:176:1: (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:176:3: otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleClassType296); 

                	newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getCLASSKeyword_0());
                
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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:198:2: ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )*
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:198:3: ( (lv_noclass_2_0= 'NOCLASS' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:198:3: ( (lv_noclass_2_0= 'NOCLASS' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:199:1: (lv_noclass_2_0= 'NOCLASS' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:199:1: (lv_noclass_2_0= 'NOCLASS' )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:200:3: lv_noclass_2_0= 'NOCLASS'
            	    {
            	    lv_noclass_2_0=(Token)match(input,12,FOLLOW_12_in_ruleClassType337); 

            	            newLeafNode(lv_noclass_2_0, grammarAccess.getClassTypeAccess().getNoclassNOCLASSKeyword_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getClassTypeRule());
            	    	        }
            	           		addWithLastConsumed(current, "noclass", lv_noclass_2_0, "NOCLASS");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:6: (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:6: (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:8: otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClassType369); 

            	        	newLeafNode(otherlv_3, grammarAccess.getClassTypeAccess().getPREFIXKeyword_2_1_0());
            	        
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:237:6: (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:237:6: (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:237:8: otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleClassType410); 

            	        	newLeafNode(otherlv_5, grammarAccess.getClassTypeAccess().getSUFFIXKeyword_2_2_0());
            	        
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:260:6: (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:260:6: (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:260:8: otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleClassType451); 

            	        	newLeafNode(otherlv_7, grammarAccess.getClassTypeAccess().getBLOCKINGKeyword_2_3_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:264:1: ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:265:1: ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:265:1: ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:266:1: (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:266:1: (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' )
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
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:267:3: lv_blocking_8_1= 'BRACES'
            	            {
            	            lv_blocking_8_1=(Token)match(input,16,FOLLOW_16_in_ruleClassType471); 

            	                    newLeafNode(lv_blocking_8_1, grammarAccess.getClassTypeAccess().getBlockingBRACESKeyword_2_3_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	            	        }
            	                   		addWithLastConsumed(current, "blocking", lv_blocking_8_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:279:8: lv_blocking_8_2= 'INDENT'
            	            {
            	            lv_blocking_8_2=(Token)match(input,17,FOLLOW_17_in_ruleClassType500); 

            	                    newLeafNode(lv_blocking_8_2, grammarAccess.getClassTypeAccess().getBlockingINDENTKeyword_2_3_1_0_1());
            	                

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:311:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:314:28: ( (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:315:3: otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProcedure602); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0());
                
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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:337:2: ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )*
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:337:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:337:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:337:5: otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProcedure638); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getPREFIXKeyword_2_0_0());
            	        
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:360:6: (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:360:6: (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:360:8: otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProcedure679); 

            	        	newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getSUFFIXKeyword_2_1_0());
            	        
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:383:6: (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:383:6: (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:383:8: otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleProcedure720); 

            	        	newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getTYPESKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:387:1: ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:388:1: ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:388:1: ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:389:1: (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:389:1: (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' )
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
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:390:3: lv_types_7_1= 'COLONSEPERATED'
            	            {
            	            lv_types_7_1=(Token)match(input,20,FOLLOW_20_in_ruleProcedure740); 

            	                    newLeafNode(lv_types_7_1, grammarAccess.getProcedureAccess().getTypesCOLONSEPERATEDKeyword_2_2_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:402:8: lv_types_7_2= 'SPACESEPERATED'
            	            {
            	            lv_types_7_2=(Token)match(input,21,FOLLOW_21_in_ruleProcedure769); 

            	                    newLeafNode(lv_types_7_2, grammarAccess.getProcedureAccess().getTypesSPACESEPERATEDKeyword_2_2_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:414:8: lv_types_7_3= 'INHEADER'
            	            {
            	            lv_types_7_3=(Token)match(input,22,FOLLOW_22_in_ruleProcedure798); 

            	                    newLeafNode(lv_types_7_3, grammarAccess.getProcedureAccess().getTypesINHEADERKeyword_2_2_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:426:8: lv_types_7_4= 'INFERRED'
            	            {
            	            lv_types_7_4=(Token)match(input,23,FOLLOW_23_in_ruleProcedure827); 

            	                    newLeafNode(lv_types_7_4, grammarAccess.getProcedureAccess().getTypesINFERREDKeyword_2_2_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:438:8: lv_types_7_5= 'UNTYPED'
            	            {
            	            lv_types_7_5=(Token)match(input,24,FOLLOW_24_in_ruleProcedure856); 

            	                    newLeafNode(lv_types_7_5, grammarAccess.getProcedureAccess().getTypesUNTYPEDKeyword_2_2_1_0_4());
            	                

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:470:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'STATEMENT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:473:28: ( (otherlv_0= 'STATEMENT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:474:1: (otherlv_0= 'STATEMENT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:474:1: (otherlv_0= 'STATEMENT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:474:3: otherlv_0= 'STATEMENT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleStatement958); 

                	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getSTATEMENTKeyword_0());
                
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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:496:2: ( (otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) ) ) | (otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) ) ) | (otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) ) ) | (otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? ) | (otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) ) )
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:496:3: (otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:496:3: (otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:496:5: otherlv_2= 'REPEAT' ( (lv_rep_3_0= RULE_ID ) ) otherlv_4= 'UNTIL' ( (lv_until_5_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleStatement994); 

                        	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getREPEATKeyword_2_0_0());
                        
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

                        	newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getUNTILKeyword_2_0_2());
                        
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:541:6: (otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:541:6: (otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:541:8: otherlv_6= 'WHILE' ( (lv_while_7_0= RULE_ID ) ) otherlv_8= 'DO' ( (lv_do_9_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleStatement1070); 

                        	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getWHILEKeyword_2_1_0());
                        
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

                        	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getDOKeyword_2_1_2());
                        
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:586:6: (otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:586:6: (otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:586:8: otherlv_10= 'FOR' ( (lv_for_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleStatement1146); 

                        	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getFORKeyword_2_2_0());
                        
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:609:6: (otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:609:6: (otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )? )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:609:8: otherlv_12= 'VAR' ( (lv_var_13_0= RULE_ID ) ) (otherlv_14= '=' ( (lv_ex_15_0= RULE_ID ) ) )?
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleStatement1188); 

                        	newLeafNode(otherlv_12, grammarAccess.getStatementAccess().getVARKeyword_2_3_0());
                        
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:654:6: (otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:654:6: (otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:654:8: otherlv_16= 'VAL' ( (lv_val_17_0= RULE_ID ) ) otherlv_18= '=' ( (lv_ex_19_0= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_33_in_ruleStatement1267); 

                        	newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getVALKeyword_2_4_0());
                        
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:715:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_prec_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:718:28: ( (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:1: (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:1: (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:3: otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleExpression1408); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getEXPRESSIONKeyword_0());
                
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

                if ( ((LA8_0>=13 && LA8_0<=14)||LA8_0==16||LA8_0==35||(LA8_0>=37 && LA8_0<=40)||(LA8_0>=45 && LA8_0<=47)) ) {
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:776:1: rulePrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'LITERAL' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) ) ) ) | ( ( (lv_ruletyp_39_0= 'BRACKET' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_bracket_41_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_42_0= 'BRACES' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_braces_44_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_45_0= 'PARENTHESIS' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_parenthesis_47_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_48_0= 'ANGLE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_angle_50_0= RULE_ID ) ) ) ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

        Token lv_ruletyp_0_0=null;
        Token lv_rule_1_0=null;
        Token otherlv_2=null;
        Token lv_feature1_3_0=null;
        Token lv_ruletyp_4_0=null;
        Token lv_rule_5_0=null;
        Token lv_feature1_7_0=null;
        Token otherlv_8=null;
        Token lv_par1_9_0=null;
        Token lv_ruletyp_10_0=null;
        Token lv_rule_11_0=null;
        Token lv_feature1_12_0=null;
        Token otherlv_13=null;
        Token lv_par1_14_0=null;
        Token lv_ruletyp_16_0=null;
        Token lv_rule_17_0=null;
        Token lv_feature1_18_0=null;
        Token otherlv_19=null;
        Token lv_par1_20_0=null;
        Token lv_feature2_22_0=null;
        Token otherlv_23=null;
        Token lv_par2_24_0=null;
        Token lv_ruletyp_25_0=null;
        Token lv_rule_26_0=null;
        Token lv_feature1_27_0=null;
        Token otherlv_28=null;
        Token lv_par1_29_0=null;
        Token lv_ruletyp_31_0=null;
        Token lv_rule_32_0=null;
        Token lv_par1_33_0=null;
        Token lv_par2_35_0=null;
        Token lv_ruletyp_36_0=null;
        Token lv_rule_37_0=null;
        Token lv_literal_38_1=null;
        Token lv_literal_38_2=null;
        Token lv_literal_38_3=null;
        Token lv_literal_38_4=null;
        Token lv_ruletyp_39_0=null;
        Token lv_rule_40_0=null;
        Token lv_bracket_41_0=null;
        Token lv_ruletyp_42_0=null;
        Token lv_rule_43_0=null;
        Token lv_braces_44_0=null;
        Token lv_ruletyp_45_0=null;
        Token lv_rule_46_0=null;
        Token lv_parenthesis_47_0=null;
        Token lv_ruletyp_48_0=null;
        Token lv_rule_49_0=null;
        Token lv_angle_50_0=null;
        EObject lv_prefix_6_0 = null;

        EObject lv_suffix_15_0 = null;

        EObject lv_infix_21_0 = null;

        EObject lv_inner_30_0 = null;

        EObject lv_infixleft_34_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:779:28: ( ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'LITERAL' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) ) ) ) | ( ( (lv_ruletyp_39_0= 'BRACKET' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_bracket_41_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_42_0= 'BRACES' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_braces_44_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_45_0= 'PARENTHESIS' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_parenthesis_47_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_48_0= 'ANGLE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_angle_50_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'LITERAL' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) ) ) ) | ( ( (lv_ruletyp_39_0= 'BRACKET' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_bracket_41_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_42_0= 'BRACES' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_braces_44_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_45_0= 'PARENTHESIS' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_parenthesis_47_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_48_0= 'ANGLE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_angle_50_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'LITERAL' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) ) ) ) | ( ( (lv_ruletyp_39_0= 'BRACKET' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_bracket_41_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_42_0= 'BRACES' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_braces_44_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_45_0= 'PARENTHESIS' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_parenthesis_47_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_48_0= 'ANGLE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_angle_50_0= RULE_ID ) ) ) )
            int alt17=11;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 13:
                {
                alt17=2;
                }
                break;
            case 14:
                {
                alt17=3;
                }
                break;
            case 37:
                {
                alt17=4;
                }
                break;
            case 38:
                {
                alt17=5;
                }
                break;
            case 39:
                {
                alt17=6;
                }
                break;
            case 40:
                {
                alt17=7;
                }
                break;
            case 45:
                {
                alt17=8;
                }
                break;
            case 16:
                {
                alt17=9;
                }
                break;
            case 46:
                {
                alt17=10;
                }
                break;
            case 47:
                {
                alt17=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:2: ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:2: ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:3: ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )?
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:780:3: ( (lv_ruletyp_0_0= 'CALLER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:781:1: (lv_ruletyp_0_0= 'CALLER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:781:1: (lv_ruletyp_0_0= 'CALLER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:782:3: lv_ruletyp_0_0= 'CALLER'
                    {
                    lv_ruletyp_0_0=(Token)match(input,35,FOLLOW_35_in_rulePrecedence1542); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "CALLER");
                    	    

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:813:2: (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==36) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:813:4: otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,36,FOLLOW_36_in_rulePrecedence1590); 

                                	newLeafNode(otherlv_2, grammarAccess.getPrecedenceAccess().getFullStopKeyword_0_2_0());
                                
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:817:1: ( (lv_feature1_3_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:818:1: (lv_feature1_3_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:818:1: (lv_feature1_3_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:819:3: lv_feature1_3_0= RULE_ID
                            {
                            lv_feature1_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1607); 

                            			newLeafNode(lv_feature1_3_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_0_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_3_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:836:6: ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:836:6: ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:836:7: ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:836:7: ( (lv_ruletyp_4_0= 'PREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:837:1: (lv_ruletyp_4_0= 'PREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:837:1: (lv_ruletyp_4_0= 'PREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:838:3: lv_ruletyp_4_0= 'PREFIX'
                    {
                    lv_ruletyp_4_0=(Token)match(input,13,FOLLOW_13_in_rulePrecedence1640); 

                            newLeafNode(lv_ruletyp_4_0, grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_4_0, "PREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:851:2: ( (lv_rule_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:852:1: (lv_rule_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:852:1: (lv_rule_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:853:3: lv_rule_5_0= RULE_ID
                    {
                    lv_rule_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1670); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:869:2: ( (lv_prefix_6_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:870:1: (lv_prefix_6_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:870:1: (lv_prefix_6_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:871:3: lv_prefix_6_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1696);
                    lv_prefix_6_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"prefix",
                            		lv_prefix_6_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:887:2: ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==32) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:887:3: ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:887:3: ( (lv_feature1_7_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:888:1: (lv_feature1_7_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:888:1: (lv_feature1_7_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:889:3: lv_feature1_7_0= RULE_ID
                            {
                            lv_feature1_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1714); 

                            			newLeafNode(lv_feature1_7_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_1_3_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_7_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_8=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1731); 

                                	newLeafNode(otherlv_8, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_1_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:909:3: ( (lv_par1_9_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:910:1: (lv_par1_9_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:910:1: (lv_par1_9_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:911:3: lv_par1_9_0= RULE_ID
                    {
                    lv_par1_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1750); 

                    			newLeafNode(lv_par1_9_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_9_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:928:6: ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:928:6: ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:928:7: ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:928:7: ( (lv_ruletyp_10_0= 'SUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:929:1: (lv_ruletyp_10_0= 'SUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:929:1: (lv_ruletyp_10_0= 'SUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:930:3: lv_ruletyp_10_0= 'SUFFIX'
                    {
                    lv_ruletyp_10_0=(Token)match(input,14,FOLLOW_14_in_rulePrecedence1781); 

                            newLeafNode(lv_ruletyp_10_0, grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_10_0, "SUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:943:2: ( (lv_rule_11_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:944:1: (lv_rule_11_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:944:1: (lv_rule_11_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:945:3: lv_rule_11_0= RULE_ID
                    {
                    lv_rule_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1811); 

                    			newLeafNode(lv_rule_11_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_11_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:961:2: ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==32) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:961:3: ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:961:3: ( (lv_feature1_12_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:962:1: (lv_feature1_12_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:962:1: (lv_feature1_12_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:963:3: lv_feature1_12_0= RULE_ID
                            {
                            lv_feature1_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1834); 

                            			newLeafNode(lv_feature1_12_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_2_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_12_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_13=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1851); 

                                	newLeafNode(otherlv_13, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_2_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:983:3: ( (lv_par1_14_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:984:1: (lv_par1_14_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:984:1: (lv_par1_14_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:985:3: lv_par1_14_0= RULE_ID
                    {
                    lv_par1_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1870); 

                    			newLeafNode(lv_par1_14_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_14_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1001:2: ( (lv_suffix_15_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1002:1: (lv_suffix_15_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1002:1: (lv_suffix_15_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1003:3: lv_suffix_15_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1896);
                    lv_suffix_15_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_15_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1020:6: ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1020:6: ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1020:7: ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1020:7: ( (lv_ruletyp_16_0= 'INFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1021:1: (lv_ruletyp_16_0= 'INFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1021:1: (lv_ruletyp_16_0= 'INFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1022:3: lv_ruletyp_16_0= 'INFIX'
                    {
                    lv_ruletyp_16_0=(Token)match(input,37,FOLLOW_37_in_rulePrecedence1922); 

                            newLeafNode(lv_ruletyp_16_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_16_0, "INFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1035:2: ( (lv_rule_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1036:1: (lv_rule_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1036:1: (lv_rule_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1037:3: lv_rule_17_0= RULE_ID
                    {
                    lv_rule_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1952); 

                    			newLeafNode(lv_rule_17_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_17_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1053:2: ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==32) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1053:3: ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1053:3: ( (lv_feature1_18_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1054:1: (lv_feature1_18_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1054:1: (lv_feature1_18_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1055:3: lv_feature1_18_0= RULE_ID
                            {
                            lv_feature1_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1975); 

                            			newLeafNode(lv_feature1_18_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_3_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_18_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_19=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1992); 

                                	newLeafNode(otherlv_19, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1075:3: ( (lv_par1_20_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1076:1: (lv_par1_20_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1076:1: (lv_par1_20_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1077:3: lv_par1_20_0= RULE_ID
                    {
                    lv_par1_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2011); 

                    			newLeafNode(lv_par1_20_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_20_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1093:2: ( (lv_infix_21_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1094:1: (lv_infix_21_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1094:1: (lv_infix_21_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1095:3: lv_infix_21_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2037);
                    lv_infix_21_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_21_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1111:2: ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==32) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1111:3: ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1111:3: ( (lv_feature2_22_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1112:1: (lv_feature2_22_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1112:1: (lv_feature2_22_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1113:3: lv_feature2_22_0= RULE_ID
                            {
                            lv_feature2_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2055); 

                            			newLeafNode(lv_feature2_22_0, grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_3_5_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_22_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_23=(Token)match(input,32,FOLLOW_32_in_rulePrecedence2072); 

                                	newLeafNode(otherlv_23, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1133:3: ( (lv_par2_24_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1134:1: (lv_par2_24_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1134:1: (lv_par2_24_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1135:3: lv_par2_24_0= RULE_ID
                    {
                    lv_par2_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2091); 

                    			newLeafNode(lv_par2_24_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_3_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_24_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1152:6: ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1152:6: ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1152:7: ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1152:7: ( (lv_ruletyp_25_0= 'OUTER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1153:1: (lv_ruletyp_25_0= 'OUTER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1153:1: (lv_ruletyp_25_0= 'OUTER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1154:3: lv_ruletyp_25_0= 'OUTER'
                    {
                    lv_ruletyp_25_0=(Token)match(input,38,FOLLOW_38_in_rulePrecedence2122); 

                            newLeafNode(lv_ruletyp_25_0, grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_25_0, "OUTER");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1167:2: ( (lv_rule_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1168:1: (lv_rule_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1168:1: (lv_rule_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1169:3: lv_rule_26_0= RULE_ID
                    {
                    lv_rule_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2152); 

                    			newLeafNode(lv_rule_26_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_26_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1185:2: ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==32) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1185:3: ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1185:3: ( (lv_feature1_27_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1186:1: (lv_feature1_27_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1186:1: (lv_feature1_27_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1187:3: lv_feature1_27_0= RULE_ID
                            {
                            lv_feature1_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2175); 

                            			newLeafNode(lv_feature1_27_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_4_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_27_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_28=(Token)match(input,32,FOLLOW_32_in_rulePrecedence2192); 

                                	newLeafNode(otherlv_28, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1207:3: ( (lv_par1_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1208:1: (lv_par1_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1208:1: (lv_par1_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1209:3: lv_par1_29_0= RULE_ID
                    {
                    lv_par1_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2211); 

                    			newLeafNode(lv_par1_29_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_29_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1225:2: ( (lv_inner_30_0= ruleInnerPrecedence ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=48 && LA15_0<=55)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1226:1: (lv_inner_30_0= ruleInnerPrecedence )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1226:1: (lv_inner_30_0= ruleInnerPrecedence )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1227:3: lv_inner_30_0= ruleInnerPrecedence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInnerInnerPrecedenceParserRuleCall_4_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInnerPrecedence_in_rulePrecedence2237);
                    	    lv_inner_30_0=ruleInnerPrecedence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inner",
                    	            		lv_inner_30_0, 
                    	            		"InnerPrecedence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1244:6: ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1244:6: ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1244:7: ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1244:7: ( (lv_ruletyp_31_0= 'INFIXLEFT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1245:1: (lv_ruletyp_31_0= 'INFIXLEFT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1245:1: (lv_ruletyp_31_0= 'INFIXLEFT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1246:3: lv_ruletyp_31_0= 'INFIXLEFT'
                    {
                    lv_ruletyp_31_0=(Token)match(input,39,FOLLOW_39_in_rulePrecedence2264); 

                            newLeafNode(lv_ruletyp_31_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_31_0, "INFIXLEFT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1259:2: ( (lv_rule_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1260:1: (lv_rule_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1260:1: (lv_rule_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1261:3: lv_rule_32_0= RULE_ID
                    {
                    lv_rule_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2294); 

                    			newLeafNode(lv_rule_32_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_32_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1277:2: ( (lv_par1_33_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1278:1: (lv_par1_33_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1278:1: (lv_par1_33_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1279:3: lv_par1_33_0= RULE_ID
                    {
                    lv_par1_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2316); 

                    			newLeafNode(lv_par1_33_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_33_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1295:2: ( (lv_infixleft_34_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1296:1: (lv_infixleft_34_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1296:1: (lv_infixleft_34_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1297:3: lv_infixleft_34_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixleftMultStringParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2342);
                    lv_infixleft_34_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infixleft",
                            		lv_infixleft_34_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1313:2: ( (lv_par2_35_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:1: (lv_par2_35_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:1: (lv_par2_35_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1315:3: lv_par2_35_0= RULE_ID
                    {
                    lv_par2_35_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2359); 

                    			newLeafNode(lv_par2_35_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_5_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_35_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1332:6: ( ( (lv_ruletyp_36_0= 'LITERAL' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1332:6: ( ( (lv_ruletyp_36_0= 'LITERAL' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1332:7: ( (lv_ruletyp_36_0= 'LITERAL' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1332:7: ( (lv_ruletyp_36_0= 'LITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1333:1: (lv_ruletyp_36_0= 'LITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1333:1: (lv_ruletyp_36_0= 'LITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1334:3: lv_ruletyp_36_0= 'LITERAL'
                    {
                    lv_ruletyp_36_0=(Token)match(input,40,FOLLOW_40_in_rulePrecedence2390); 

                            newLeafNode(lv_ruletyp_36_0, grammarAccess.getPrecedenceAccess().getRuletypLITERALKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_36_0, "LITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1347:2: ( (lv_rule_37_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1348:1: (lv_rule_37_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1348:1: (lv_rule_37_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1349:3: lv_rule_37_0= RULE_ID
                    {
                    lv_rule_37_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2420); 

                    			newLeafNode(lv_rule_37_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_37_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1365:2: ( ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1366:1: ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1366:1: ( (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1367:1: (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1367:1: (lv_literal_38_1= 'INT' | lv_literal_38_2= 'STRING' | lv_literal_38_3= 'BOOL' | lv_literal_38_4= 'FLOAT' )
                    int alt16=4;
                    switch ( input.LA(1) ) {
                    case 41:
                        {
                        alt16=1;
                        }
                        break;
                    case 42:
                        {
                        alt16=2;
                        }
                        break;
                    case 43:
                        {
                        alt16=3;
                        }
                        break;
                    case 44:
                        {
                        alt16=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1368:3: lv_literal_38_1= 'INT'
                            {
                            lv_literal_38_1=(Token)match(input,41,FOLLOW_41_in_rulePrecedence2445); 

                                    newLeafNode(lv_literal_38_1, grammarAccess.getPrecedenceAccess().getLiteralINTKeyword_6_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "literal", lv_literal_38_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1380:8: lv_literal_38_2= 'STRING'
                            {
                            lv_literal_38_2=(Token)match(input,42,FOLLOW_42_in_rulePrecedence2474); 

                                    newLeafNode(lv_literal_38_2, grammarAccess.getPrecedenceAccess().getLiteralSTRINGKeyword_6_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "literal", lv_literal_38_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1392:8: lv_literal_38_3= 'BOOL'
                            {
                            lv_literal_38_3=(Token)match(input,43,FOLLOW_43_in_rulePrecedence2503); 

                                    newLeafNode(lv_literal_38_3, grammarAccess.getPrecedenceAccess().getLiteralBOOLKeyword_6_2_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "literal", lv_literal_38_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1404:8: lv_literal_38_4= 'FLOAT'
                            {
                            lv_literal_38_4=(Token)match(input,44,FOLLOW_44_in_rulePrecedence2532); 

                                    newLeafNode(lv_literal_38_4, grammarAccess.getPrecedenceAccess().getLiteralFLOATKeyword_6_2_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "literal", lv_literal_38_4, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1420:6: ( ( (lv_ruletyp_39_0= 'BRACKET' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_bracket_41_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1420:6: ( ( (lv_ruletyp_39_0= 'BRACKET' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_bracket_41_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1420:7: ( (lv_ruletyp_39_0= 'BRACKET' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_bracket_41_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1420:7: ( (lv_ruletyp_39_0= 'BRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1421:1: (lv_ruletyp_39_0= 'BRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1421:1: (lv_ruletyp_39_0= 'BRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1422:3: lv_ruletyp_39_0= 'BRACKET'
                    {
                    lv_ruletyp_39_0=(Token)match(input,45,FOLLOW_45_in_rulePrecedence2574); 

                            newLeafNode(lv_ruletyp_39_0, grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_39_0, "BRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1435:2: ( (lv_rule_40_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1436:1: (lv_rule_40_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1436:1: (lv_rule_40_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1437:3: lv_rule_40_0= RULE_ID
                    {
                    lv_rule_40_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2604); 

                    			newLeafNode(lv_rule_40_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_40_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1453:2: ( (lv_bracket_41_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1454:1: (lv_bracket_41_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1454:1: (lv_bracket_41_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1455:3: lv_bracket_41_0= RULE_ID
                    {
                    lv_bracket_41_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2626); 

                    			newLeafNode(lv_bracket_41_0, grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bracket",
                            		lv_bracket_41_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1472:6: ( ( (lv_ruletyp_42_0= 'BRACES' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_braces_44_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1472:6: ( ( (lv_ruletyp_42_0= 'BRACES' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_braces_44_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1472:7: ( (lv_ruletyp_42_0= 'BRACES' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_braces_44_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1472:7: ( (lv_ruletyp_42_0= 'BRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1473:1: (lv_ruletyp_42_0= 'BRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1473:1: (lv_ruletyp_42_0= 'BRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1474:3: lv_ruletyp_42_0= 'BRACES'
                    {
                    lv_ruletyp_42_0=(Token)match(input,16,FOLLOW_16_in_rulePrecedence2657); 

                            newLeafNode(lv_ruletyp_42_0, grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_42_0, "BRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1487:2: ( (lv_rule_43_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1488:1: (lv_rule_43_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1488:1: (lv_rule_43_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1489:3: lv_rule_43_0= RULE_ID
                    {
                    lv_rule_43_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2687); 

                    			newLeafNode(lv_rule_43_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_43_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1505:2: ( (lv_braces_44_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1506:1: (lv_braces_44_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1506:1: (lv_braces_44_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1507:3: lv_braces_44_0= RULE_ID
                    {
                    lv_braces_44_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2709); 

                    			newLeafNode(lv_braces_44_0, grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"braces",
                            		lv_braces_44_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1524:6: ( ( (lv_ruletyp_45_0= 'PARENTHESIS' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_parenthesis_47_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1524:6: ( ( (lv_ruletyp_45_0= 'PARENTHESIS' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_parenthesis_47_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1524:7: ( (lv_ruletyp_45_0= 'PARENTHESIS' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_parenthesis_47_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1524:7: ( (lv_ruletyp_45_0= 'PARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1525:1: (lv_ruletyp_45_0= 'PARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1525:1: (lv_ruletyp_45_0= 'PARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1526:3: lv_ruletyp_45_0= 'PARENTHESIS'
                    {
                    lv_ruletyp_45_0=(Token)match(input,46,FOLLOW_46_in_rulePrecedence2740); 

                            newLeafNode(lv_ruletyp_45_0, grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_45_0, "PARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1539:2: ( (lv_rule_46_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1540:1: (lv_rule_46_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1540:1: (lv_rule_46_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1541:3: lv_rule_46_0= RULE_ID
                    {
                    lv_rule_46_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2770); 

                    			newLeafNode(lv_rule_46_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_46_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1557:2: ( (lv_parenthesis_47_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1558:1: (lv_parenthesis_47_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1558:1: (lv_parenthesis_47_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1559:3: lv_parenthesis_47_0= RULE_ID
                    {
                    lv_parenthesis_47_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2792); 

                    			newLeafNode(lv_parenthesis_47_0, grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parenthesis",
                            		lv_parenthesis_47_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1576:6: ( ( (lv_ruletyp_48_0= 'ANGLE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_angle_50_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1576:6: ( ( (lv_ruletyp_48_0= 'ANGLE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_angle_50_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1576:7: ( (lv_ruletyp_48_0= 'ANGLE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_angle_50_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1576:7: ( (lv_ruletyp_48_0= 'ANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1577:1: (lv_ruletyp_48_0= 'ANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1577:1: (lv_ruletyp_48_0= 'ANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1578:3: lv_ruletyp_48_0= 'ANGLE'
                    {
                    lv_ruletyp_48_0=(Token)match(input,47,FOLLOW_47_in_rulePrecedence2823); 

                            newLeafNode(lv_ruletyp_48_0, grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_48_0, "ANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1591:2: ( (lv_rule_49_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1592:1: (lv_rule_49_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1592:1: (lv_rule_49_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1593:3: lv_rule_49_0= RULE_ID
                    {
                    lv_rule_49_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2853); 

                    			newLeafNode(lv_rule_49_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_49_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1609:2: ( (lv_angle_50_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1610:1: (lv_angle_50_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1610:1: (lv_angle_50_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1611:3: lv_angle_50_0= RULE_ID
                    {
                    lv_angle_50_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2875); 

                    			newLeafNode(lv_angle_50_0, grammarAccess.getPrecedenceAccess().getAngleIDTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"angle",
                            		lv_angle_50_0, 
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


    // $ANTLR start "entryRuleInnerPrecedence"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1635:1: entryRuleInnerPrecedence returns [EObject current=null] : iv_ruleInnerPrecedence= ruleInnerPrecedence EOF ;
    public final EObject entryRuleInnerPrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerPrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1636:2: (iv_ruleInnerPrecedence= ruleInnerPrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1637:2: iv_ruleInnerPrecedence= ruleInnerPrecedence EOF
            {
             newCompositeNode(grammarAccess.getInnerPrecedenceRule()); 
            pushFollow(FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence2917);
            iv_ruleInnerPrecedence=ruleInnerPrecedence();

            state._fsp--;

             current =iv_ruleInnerPrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerPrecedence2927); 

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
    // $ANTLR end "entryRuleInnerPrecedence"


    // $ANTLR start "ruleInnerPrecedence"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1644:1: ruleInnerPrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) ) ) ;
    public final EObject ruleInnerPrecedence() throws RecognitionException {
        EObject current = null;

        Token lv_ruletyp_0_0=null;
        Token lv_feature1_2_0=null;
        Token otherlv_3=null;
        Token lv_par2_4_0=null;
        Token lv_ruletyp_5_0=null;
        Token lv_ruletyp_7_0=null;
        Token lv_mod_8_0=null;
        Token lv_rule_9_0=null;
        Token otherlv_10=null;
        Token lv_feature1_11_0=null;
        Token lv_feature2_13_0=null;
        Token otherlv_14=null;
        Token lv_par2_15_0=null;
        Token lv_ruletyp_16_0=null;
        Token lv_par2_18_0=null;
        Token lv_ruletyp_19_0=null;
        Token lv_rule_20_0=null;
        Token lv_bracket_21_0=null;
        Token lv_ruletyp_22_0=null;
        Token lv_rule_23_0=null;
        Token lv_braces_24_0=null;
        Token lv_ruletyp_25_0=null;
        Token lv_rule_26_0=null;
        Token lv_parenthesis_27_0=null;
        Token lv_ruletyp_28_0=null;
        Token lv_rule_29_0=null;
        Token lv_angle_30_0=null;
        EObject lv_prefix_1_0 = null;

        EObject lv_suffix_6_0 = null;

        EObject lv_infix_12_0 = null;

        EObject lv_infixleft_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1647:28: ( ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1648:1: ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1648:1: ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) ) )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt22=1;
                }
                break;
            case 49:
                {
                alt22=2;
                }
                break;
            case 50:
                {
                alt22=3;
                }
                break;
            case 51:
                {
                alt22=4;
                }
                break;
            case 52:
                {
                alt22=5;
                }
                break;
            case 53:
                {
                alt22=6;
                }
                break;
            case 54:
                {
                alt22=7;
                }
                break;
            case 55:
                {
                alt22=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1648:2: ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1648:2: ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1648:3: ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1648:3: ( (lv_ruletyp_0_0= 'INNERPREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1649:1: (lv_ruletyp_0_0= 'INNERPREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1649:1: (lv_ruletyp_0_0= 'INNERPREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1650:3: lv_ruletyp_0_0= 'INNERPREFIX'
                    {
                    lv_ruletyp_0_0=(Token)match(input,48,FOLLOW_48_in_ruleInnerPrecedence2971); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "INNERPREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1663:2: ( (lv_prefix_1_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1664:1: (lv_prefix_1_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1664:1: (lv_prefix_1_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1665:3: lv_prefix_1_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getPrefixMultStringParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence3005);
                    lv_prefix_1_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"prefix",
                            		lv_prefix_1_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1681:2: ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==32) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1681:3: ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1681:3: ( (lv_feature1_2_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1682:1: (lv_feature1_2_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1682:1: (lv_feature1_2_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1683:3: lv_feature1_2_0= RULE_ID
                            {
                            lv_feature1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3023); 

                            			newLeafNode(lv_feature1_2_0, grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_0_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_2_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleInnerPrecedence3040); 

                                	newLeafNode(otherlv_3, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_0_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1703:3: ( (lv_par2_4_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1704:1: (lv_par2_4_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1704:1: (lv_par2_4_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1705:3: lv_par2_4_0= RULE_ID
                    {
                    lv_par2_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3059); 

                    			newLeafNode(lv_par2_4_0, grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_4_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1722:6: ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1722:6: ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1722:7: ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1722:7: ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1723:1: (lv_ruletyp_5_0= 'INNERSUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1723:1: (lv_ruletyp_5_0= 'INNERSUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1724:3: lv_ruletyp_5_0= 'INNERSUFFIX'
                    {
                    lv_ruletyp_5_0=(Token)match(input,49,FOLLOW_49_in_ruleInnerPrecedence3090); 

                            newLeafNode(lv_ruletyp_5_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_5_0, "INNERSUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1737:2: ( (lv_suffix_6_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1738:1: (lv_suffix_6_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1738:1: (lv_suffix_6_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1739:3: lv_suffix_6_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getSuffixMultStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence3124);
                    lv_suffix_6_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_6_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1756:6: ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1756:6: ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1756:7: ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1756:7: ( (lv_ruletyp_7_0= 'INNERINFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1757:1: (lv_ruletyp_7_0= 'INNERINFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1757:1: (lv_ruletyp_7_0= 'INNERINFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1758:3: lv_ruletyp_7_0= 'INNERINFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,50,FOLLOW_50_in_ruleInnerPrecedence3150); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "INNERINFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1771:2: ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==35) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1771:3: ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )?
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1771:3: ( (lv_mod_8_0= 'CALLER' ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1772:1: (lv_mod_8_0= 'CALLER' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1772:1: (lv_mod_8_0= 'CALLER' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1773:3: lv_mod_8_0= 'CALLER'
                            {
                            lv_mod_8_0=(Token)match(input,35,FOLLOW_35_in_ruleInnerPrecedence3182); 

                                    newLeafNode(lv_mod_8_0, grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "mod", lv_mod_8_0, "CALLER");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1786:2: ( (lv_rule_9_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1787:1: (lv_rule_9_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1787:1: (lv_rule_9_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1788:3: lv_rule_9_0= RULE_ID
                            {
                            lv_rule_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3212); 

                            			newLeafNode(lv_rule_9_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"rule",
                                    		lv_rule_9_0, 
                                    		"ID");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1804:2: (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==36) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1804:4: otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) )
                                    {
                                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleInnerPrecedence3230); 

                                        	newLeafNode(otherlv_10, grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_2_1_2_0());
                                        
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1808:1: ( (lv_feature1_11_0= RULE_ID ) )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1809:1: (lv_feature1_11_0= RULE_ID )
                                    {
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1809:1: (lv_feature1_11_0= RULE_ID )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1810:3: lv_feature1_11_0= RULE_ID
                                    {
                                    lv_feature1_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3247); 

                                    			newLeafNode(lv_feature1_11_0, grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_2_1_2_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"feature1",
                                            		lv_feature1_11_0, 
                                            		"ID");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1826:6: ( (lv_infix_12_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1827:1: (lv_infix_12_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1827:1: (lv_infix_12_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1828:3: lv_infix_12_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence3277);
                    lv_infix_12_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_12_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1844:2: ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==32) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1844:3: ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1844:3: ( (lv_feature2_13_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1845:1: (lv_feature2_13_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1845:1: (lv_feature2_13_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1846:3: lv_feature2_13_0= RULE_ID
                            {
                            lv_feature2_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3295); 

                            			newLeafNode(lv_feature2_13_0, grammarAccess.getInnerPrecedenceAccess().getFeature2IDTerminalRuleCall_2_3_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_13_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleInnerPrecedence3312); 

                                	newLeafNode(otherlv_14, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_2_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1866:3: ( (lv_par2_15_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1867:1: (lv_par2_15_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1867:1: (lv_par2_15_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1868:3: lv_par2_15_0= RULE_ID
                    {
                    lv_par2_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3331); 

                    			newLeafNode(lv_par2_15_0, grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_2_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_15_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1885:6: ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1885:6: ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1885:7: ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1885:7: ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1886:1: (lv_ruletyp_16_0= 'INNERINFIXLEFT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1886:1: (lv_ruletyp_16_0= 'INNERINFIXLEFT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1887:3: lv_ruletyp_16_0= 'INNERINFIXLEFT'
                    {
                    lv_ruletyp_16_0=(Token)match(input,51,FOLLOW_51_in_ruleInnerPrecedence3362); 

                            newLeafNode(lv_ruletyp_16_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXLEFTKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_16_0, "INNERINFIXLEFT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1900:2: ( (lv_infixleft_17_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1901:1: (lv_infixleft_17_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1901:1: (lv_infixleft_17_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1902:3: lv_infixleft_17_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixleftMultStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence3396);
                    lv_infixleft_17_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infixleft",
                            		lv_infixleft_17_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1918:2: ( (lv_par2_18_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1919:1: (lv_par2_18_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1919:1: (lv_par2_18_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1920:3: lv_par2_18_0= RULE_ID
                    {
                    lv_par2_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3413); 

                    			newLeafNode(lv_par2_18_0, grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_18_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1937:6: ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1937:6: ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1937:7: ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1937:7: ( (lv_ruletyp_19_0= 'INNERBRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1938:1: (lv_ruletyp_19_0= 'INNERBRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1938:1: (lv_ruletyp_19_0= 'INNERBRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1939:3: lv_ruletyp_19_0= 'INNERBRACKET'
                    {
                    lv_ruletyp_19_0=(Token)match(input,52,FOLLOW_52_in_ruleInnerPrecedence3444); 

                            newLeafNode(lv_ruletyp_19_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_19_0, "INNERBRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1952:2: ( (lv_rule_20_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1953:1: (lv_rule_20_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1953:1: (lv_rule_20_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1954:3: lv_rule_20_0= RULE_ID
                    {
                    lv_rule_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3474); 

                    			newLeafNode(lv_rule_20_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_20_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1970:2: ( (lv_bracket_21_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1971:1: (lv_bracket_21_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1971:1: (lv_bracket_21_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1972:3: lv_bracket_21_0= RULE_ID
                    {
                    lv_bracket_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3496); 

                    			newLeafNode(lv_bracket_21_0, grammarAccess.getInnerPrecedenceAccess().getBracketIDTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bracket",
                            		lv_bracket_21_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1989:6: ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1989:6: ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1989:7: ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1989:7: ( (lv_ruletyp_22_0= 'INNERBRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1990:1: (lv_ruletyp_22_0= 'INNERBRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1990:1: (lv_ruletyp_22_0= 'INNERBRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1991:3: lv_ruletyp_22_0= 'INNERBRACES'
                    {
                    lv_ruletyp_22_0=(Token)match(input,53,FOLLOW_53_in_ruleInnerPrecedence3527); 

                            newLeafNode(lv_ruletyp_22_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_22_0, "INNERBRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2004:2: ( (lv_rule_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2005:1: (lv_rule_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2005:1: (lv_rule_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2006:3: lv_rule_23_0= RULE_ID
                    {
                    lv_rule_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3557); 

                    			newLeafNode(lv_rule_23_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_23_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2022:2: ( (lv_braces_24_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2023:1: (lv_braces_24_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2023:1: (lv_braces_24_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2024:3: lv_braces_24_0= RULE_ID
                    {
                    lv_braces_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3579); 

                    			newLeafNode(lv_braces_24_0, grammarAccess.getInnerPrecedenceAccess().getBracesIDTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"braces",
                            		lv_braces_24_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2041:6: ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2041:6: ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2041:7: ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2041:7: ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2042:1: (lv_ruletyp_25_0= 'INNERPARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2042:1: (lv_ruletyp_25_0= 'INNERPARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2043:3: lv_ruletyp_25_0= 'INNERPARENTHESIS'
                    {
                    lv_ruletyp_25_0=(Token)match(input,54,FOLLOW_54_in_ruleInnerPrecedence3610); 

                            newLeafNode(lv_ruletyp_25_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_25_0, "INNERPARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2056:2: ( (lv_rule_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2057:1: (lv_rule_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2057:1: (lv_rule_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2058:3: lv_rule_26_0= RULE_ID
                    {
                    lv_rule_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3640); 

                    			newLeafNode(lv_rule_26_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_26_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2074:2: ( (lv_parenthesis_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2075:1: (lv_parenthesis_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2075:1: (lv_parenthesis_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2076:3: lv_parenthesis_27_0= RULE_ID
                    {
                    lv_parenthesis_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3662); 

                    			newLeafNode(lv_parenthesis_27_0, grammarAccess.getInnerPrecedenceAccess().getParenthesisIDTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parenthesis",
                            		lv_parenthesis_27_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2093:6: ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2093:6: ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2093:7: ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2093:7: ( (lv_ruletyp_28_0= 'INNERANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2094:1: (lv_ruletyp_28_0= 'INNERANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2094:1: (lv_ruletyp_28_0= 'INNERANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2095:3: lv_ruletyp_28_0= 'INNERANGLE'
                    {
                    lv_ruletyp_28_0=(Token)match(input,55,FOLLOW_55_in_ruleInnerPrecedence3693); 

                            newLeafNode(lv_ruletyp_28_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_28_0, "INNERANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2108:2: ( (lv_rule_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2109:1: (lv_rule_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2109:1: (lv_rule_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2110:3: lv_rule_29_0= RULE_ID
                    {
                    lv_rule_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3723); 

                    			newLeafNode(lv_rule_29_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_29_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2126:2: ( (lv_angle_30_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2127:1: (lv_angle_30_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2127:1: (lv_angle_30_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2128:3: lv_angle_30_0= RULE_ID
                    {
                    lv_angle_30_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3745); 

                    			newLeafNode(lv_angle_30_0, grammarAccess.getInnerPrecedenceAccess().getAngleIDTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"angle",
                            		lv_angle_30_0, 
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
    // $ANTLR end "ruleInnerPrecedence"


    // $ANTLR start "entryRuleMultID"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2152:1: entryRuleMultID returns [EObject current=null] : iv_ruleMultID= ruleMultID EOF ;
    public final EObject entryRuleMultID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultID = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2153:2: (iv_ruleMultID= ruleMultID EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2154:2: iv_ruleMultID= ruleMultID EOF
            {
             newCompositeNode(grammarAccess.getMultIDRule()); 
            pushFollow(FOLLOW_ruleMultID_in_entryRuleMultID3787);
            iv_ruleMultID=ruleMultID();

            state._fsp--;

             current =iv_ruleMultID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultID3797); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2161:1: ruleMultID returns [EObject current=null] : ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) ) ;
    public final EObject ruleMultID() throws RecognitionException {
        EObject current = null;

        Token lv_mi_1_0=null;
        Token otherlv_2=null;
        Token lv_mi_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2164:28: ( ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2165:1: ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2165:1: ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2165:2: () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2165:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2166:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultIDAccess().getMultIDAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2171:2: ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==56) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2171:3: ( (lv_mi_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2171:3: ( (lv_mi_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2172:1: (lv_mi_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2172:1: (lv_mi_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2173:3: lv_mi_1_0= RULE_ID
                    {
                    lv_mi_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultID3849); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2190:6: (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2190:6: (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2190:8: otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleMultID3873); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_1_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2194:1: ( (lv_mi_3_0= RULE_ID ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2195:1: (lv_mi_3_0= RULE_ID )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2195:1: (lv_mi_3_0= RULE_ID )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2196:3: lv_mi_3_0= RULE_ID
                    	    {
                    	    lv_mi_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultID3890); 

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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleMultID3908); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2224:1: entryRuleMultString returns [EObject current=null] : iv_ruleMultString= ruleMultString EOF ;
    public final EObject entryRuleMultString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2225:2: (iv_ruleMultString= ruleMultString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2226:2: iv_ruleMultString= ruleMultString EOF
            {
             newCompositeNode(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString3946);
            iv_ruleMultString=ruleMultString();

            state._fsp--;

             current =iv_ruleMultString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString3956); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2233:1: ruleMultString returns [EObject current=null] : ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) ) ;
    public final EObject ruleMultString() throws RecognitionException {
        EObject current = null;

        Token lv_ms_1_0=null;
        Token otherlv_2=null;
        Token lv_ms_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2236:28: ( ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2237:1: ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2237:1: ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2237:2: () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2237:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2238:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultStringAccess().getMultStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2243:2: ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==56) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2243:3: ( (lv_ms_1_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2243:3: ( (lv_ms_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2244:1: (lv_ms_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2244:1: (lv_ms_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2245:3: lv_ms_1_0= RULE_STRING
                    {
                    lv_ms_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString4008); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2262:6: (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2262:6: (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2262:8: otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleMultString4032); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_1_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2266:1: ( (lv_ms_3_0= RULE_STRING ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_STRING) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2267:1: (lv_ms_3_0= RULE_STRING )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2267:1: (lv_ms_3_0= RULE_STRING )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2268:3: lv_ms_3_0= RULE_STRING
                    	    {
                    	    lv_ms_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString4049); 

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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleMultString4067); 

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
    public static final BitSet FOLLOW_13_in_ruleClassType369 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleClassType390 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_14_in_ruleClassType410 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleClassType431 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_15_in_ruleClassType451 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleClassType471 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_17_in_ruleClassType500 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProcedure602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure619 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_13_in_ruleProcedure638 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleProcedure659 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_14_in_ruleProcedure679 = new BitSet(new long[]{0x0100000000000010L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1425 = new BitSet(new long[]{0x0000E1E800016002L});
    public static final BitSet FOLLOW_rulePrecedence_in_ruleExpression1451 = new BitSet(new long[]{0x0000E1E800016002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrecedence1542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1572 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_rulePrecedence1590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrecedence1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1670 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1714 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrecedence1781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1834 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1870 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrecedence1922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1975 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2011 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2055 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence2072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrecedence2122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2175 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence2192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2211 = new BitSet(new long[]{0x00FF000000000000L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_rulePrecedence2237 = new BitSet(new long[]{0x00FF000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrecedence2264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2316 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrecedence2390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2420 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_41_in_rulePrecedence2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrecedence2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrecedence2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePrecedence2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePrecedence2574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrecedence2657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePrecedence2740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePrecedence2823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerPrecedence2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInnerPrecedence2971 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence3005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3023 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInnerPrecedence3040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInnerPrecedence3090 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInnerPrecedence3150 = new BitSet(new long[]{0x0100000800000020L});
    public static final BitSet FOLLOW_35_in_ruleInnerPrecedence3182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3212 = new BitSet(new long[]{0x0100001000000020L});
    public static final BitSet FOLLOW_36_in_ruleInnerPrecedence3230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3247 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence3277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3295 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInnerPrecedence3312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInnerPrecedence3362 = new BitSet(new long[]{0x0100000000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence3396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInnerPrecedence3444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInnerPrecedence3527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInnerPrecedence3610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInnerPrecedence3693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_entryRuleMultID3787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultID3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultID3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMultID3873 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultID3890 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_57_in_ruleMultID3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString3946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMultString4032 = new BitSet(new long[]{0x0200000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString4049 = new BitSet(new long[]{0x0200000000000020L});
    public static final BitSet FOLLOW_57_in_ruleMultString4067 = new BitSet(new long[]{0x0000000000000002L});

}