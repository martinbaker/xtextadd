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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CLASS'", "'NOCLASS'", "'PREFIX'", "'SUFFIX'", "'BLOCKING'", "'BRACES'", "'INDENT'", "'PROCEDURE'", "'TYPES'", "'COLONSEPERATED'", "'SPACESEPERATED'", "'INHEADER'", "'INFERRED'", "'UNTYPED'", "'EXPRESSION'", "'CALLER'", "'.'", "'='", "'INFIX'", "'OUTER'", "'INFIXLEFT'", "'BRACKET'", "'PARENTHESIS'", "'ANGLE'", "'MEMBERFEATURE'", "'INNERPREFIX'", "'INNERSUFFIX'", "'INNERINFIX'", "'INNERINFIXLEFT'", "'INNERBRACKET'", "'INNERBRACES'", "'INNERPARENTHESIS'", "'INNERANGLE'", "'['", "']'", "'PRIMARY'", "'CONSTRUCTOR'", "'BLOCK'", "'SWITCH'", "'SYNCHRONIZED'", "'FEATURECALL'", "'IFEXPRESSION'", "'FOREXPRESSION'", "'BASICFORLOOPEXPRESSION'", "'WHILEEXPRESSION'", "'DOWHILEEXPRESSION'", "'THROWEXPRESSION'", "'RETURNEXPRESSION'", "'TRYCATCHFINALYEXPRESSION'", "'PARENTHESIZEDEXPRESSION'", "'LITERALEXPRESSION'", "'LITERAL'", "'COLLECTIONLITERAL'", "'CLOSURE'", "'BOOLEANLITERAL'", "'NUMBERLITERAL'", "'NULLLITERAL'", "'STRINGLITERAL'", "'TYPELITERAL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_clas_0_0= ruleClassType ) ) | ( (lv_proc_1_0= ruleProcedure ) ) | ( (lv_prim_2_0= rulePrimary ) ) | ( (lv_lit_3_0= ruleLiteral ) ) | ( (lv_exp_4_0= ruleExpression ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_clas_0_0 = null;

        EObject lv_proc_1_0 = null;

        EObject lv_prim_2_0 = null;

        EObject lv_lit_3_0 = null;

        EObject lv_exp_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:79:28: ( ( ( (lv_clas_0_0= ruleClassType ) ) | ( (lv_proc_1_0= ruleProcedure ) ) | ( (lv_prim_2_0= rulePrimary ) ) | ( (lv_lit_3_0= ruleLiteral ) ) | ( (lv_exp_4_0= ruleExpression ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:1: ( ( (lv_clas_0_0= ruleClassType ) ) | ( (lv_proc_1_0= ruleProcedure ) ) | ( (lv_prim_2_0= rulePrimary ) ) | ( (lv_lit_3_0= ruleLiteral ) ) | ( (lv_exp_4_0= ruleExpression ) ) )*
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:1: ( ( (lv_clas_0_0= ruleClassType ) ) | ( (lv_proc_1_0= ruleProcedure ) ) | ( (lv_prim_2_0= rulePrimary ) ) | ( (lv_lit_3_0= ruleLiteral ) ) | ( (lv_exp_4_0= ruleExpression ) ) )*
            loop1:
            do {
                int alt1=6;
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
                case 46:
                    {
                    alt1=3;
                    }
                    break;
                case 62:
                    {
                    alt1=4;
                    }
                    break;
                case 25:
                    {
                    alt1=5;
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:118:6: ( (lv_prim_2_0= rulePrimary ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:118:6: ( (lv_prim_2_0= rulePrimary ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:119:1: (lv_prim_2_0= rulePrimary )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:119:1: (lv_prim_2_0= rulePrimary )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:120:3: lv_prim_2_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPrimPrimaryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleModel185);
            	    lv_prim_2_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prim",
            	            		lv_prim_2_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:137:6: ( (lv_lit_3_0= ruleLiteral ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:137:6: ( (lv_lit_3_0= ruleLiteral ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:138:1: (lv_lit_3_0= ruleLiteral )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:138:1: (lv_lit_3_0= ruleLiteral )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:139:3: lv_lit_3_0= ruleLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getLitLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleModel212);
            	    lv_lit_3_0=ruleLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lit",
            	            		lv_lit_3_0, 
            	            		"Literal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:156:6: ( (lv_exp_4_0= ruleExpression ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:156:6: ( (lv_exp_4_0= ruleExpression ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:157:1: (lv_exp_4_0= ruleExpression )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:157:1: (lv_exp_4_0= ruleExpression )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:158:3: lv_exp_4_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleModel239);
            	    lv_exp_4_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_4_0, 
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:182:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:183:2: (iv_ruleClassType= ruleClassType EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:184:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType276);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType286); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:191:1: ruleClassType returns [EObject current=null] : (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:194:28: ( (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:195:1: (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:195:1: (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:195:3: otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleClassType323); 

                	newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getCLASSKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:199:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:200:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:200:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:201:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassType340); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:217:2: ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )*
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:217:3: ( (lv_noclass_2_0= 'NOCLASS' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:217:3: ( (lv_noclass_2_0= 'NOCLASS' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:218:1: (lv_noclass_2_0= 'NOCLASS' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:218:1: (lv_noclass_2_0= 'NOCLASS' )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:219:3: lv_noclass_2_0= 'NOCLASS'
            	    {
            	    lv_noclass_2_0=(Token)match(input,12,FOLLOW_12_in_ruleClassType364); 

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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:233:6: (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:233:6: (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:233:8: otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultID ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClassType396); 

            	        	newLeafNode(otherlv_3, grammarAccess.getClassTypeAccess().getPREFIXKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:237:1: ( (lv_prefix_4_0= ruleMultID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:238:1: (lv_prefix_4_0= ruleMultID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:238:1: (lv_prefix_4_0= ruleMultID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:239:3: lv_prefix_4_0= ruleMultID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassTypeAccess().getPrefixMultIDParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultID_in_ruleClassType417);
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:256:6: (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:256:6: (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:256:8: otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultID ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleClassType437); 

            	        	newLeafNode(otherlv_5, grammarAccess.getClassTypeAccess().getSUFFIXKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:260:1: ( (lv_suffix_6_0= ruleMultID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:261:1: (lv_suffix_6_0= ruleMultID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:261:1: (lv_suffix_6_0= ruleMultID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:262:3: lv_suffix_6_0= ruleMultID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassTypeAccess().getSuffixMultIDParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultID_in_ruleClassType458);
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:279:6: (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:279:6: (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:279:8: otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleClassType478); 

            	        	newLeafNode(otherlv_7, grammarAccess.getClassTypeAccess().getBLOCKINGKeyword_2_3_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:283:1: ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:284:1: ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:284:1: ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:285:1: (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:285:1: (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' )
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
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:286:3: lv_blocking_8_1= 'BRACES'
            	            {
            	            lv_blocking_8_1=(Token)match(input,16,FOLLOW_16_in_ruleClassType498); 

            	                    newLeafNode(lv_blocking_8_1, grammarAccess.getClassTypeAccess().getBlockingBRACESKeyword_2_3_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	            	        }
            	                   		addWithLastConsumed(current, "blocking", lv_blocking_8_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:298:8: lv_blocking_8_2= 'INDENT'
            	            {
            	            lv_blocking_8_2=(Token)match(input,17,FOLLOW_17_in_ruleClassType527); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:321:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:322:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:323:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure582);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure592); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:330:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:333:28: ( (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:334:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:334:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:334:3: otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProcedure629); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:338:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:339:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:339:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:340:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure646); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:356:2: ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )*
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:356:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:356:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:356:5: otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultID ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProcedure665); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getPREFIXKeyword_2_0_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:360:1: ( (lv_prefix_3_0= ruleMultID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:361:1: (lv_prefix_3_0= ruleMultID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:361:1: (lv_prefix_3_0= ruleMultID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:362:3: lv_prefix_3_0= ruleMultID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getPrefixMultIDParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultID_in_ruleProcedure686);
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:379:6: (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:379:6: (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:379:8: otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultID ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProcedure706); 

            	        	newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getSUFFIXKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:383:1: ( (lv_suffix_5_0= ruleMultID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:384:1: (lv_suffix_5_0= ruleMultID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:384:1: (lv_suffix_5_0= ruleMultID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:385:3: lv_suffix_5_0= ruleMultID
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getSuffixMultIDParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultID_in_ruleProcedure727);
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:402:6: (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:402:6: (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:402:8: otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleProcedure747); 

            	        	newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getTYPESKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:406:1: ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:407:1: ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:407:1: ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:408:1: (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:408:1: (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' )
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
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:409:3: lv_types_7_1= 'COLONSEPERATED'
            	            {
            	            lv_types_7_1=(Token)match(input,20,FOLLOW_20_in_ruleProcedure767); 

            	                    newLeafNode(lv_types_7_1, grammarAccess.getProcedureAccess().getTypesCOLONSEPERATEDKeyword_2_2_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:421:8: lv_types_7_2= 'SPACESEPERATED'
            	            {
            	            lv_types_7_2=(Token)match(input,21,FOLLOW_21_in_ruleProcedure796); 

            	                    newLeafNode(lv_types_7_2, grammarAccess.getProcedureAccess().getTypesSPACESEPERATEDKeyword_2_2_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:433:8: lv_types_7_3= 'INHEADER'
            	            {
            	            lv_types_7_3=(Token)match(input,22,FOLLOW_22_in_ruleProcedure825); 

            	                    newLeafNode(lv_types_7_3, grammarAccess.getProcedureAccess().getTypesINHEADERKeyword_2_2_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:445:8: lv_types_7_4= 'INFERRED'
            	            {
            	            lv_types_7_4=(Token)match(input,23,FOLLOW_23_in_ruleProcedure854); 

            	                    newLeafNode(lv_types_7_4, grammarAccess.getProcedureAccess().getTypesINFERREDKeyword_2_2_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:457:8: lv_types_7_5= 'UNTYPED'
            	            {
            	            lv_types_7_5=(Token)match(input,24,FOLLOW_24_in_ruleProcedure883); 

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


    // $ANTLR start "entryRuleExpression"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:480:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:481:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:482:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression938);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression948); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:489:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_prec_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:492:28: ( (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:493:1: (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:493:1: (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:493:3: otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleExpression985); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getEXPRESSIONKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:497:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:498:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:498:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:499:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1002); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:515:2: ( (lv_prec_2_0= rulePrecedence ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=13 && LA6_0<=14)||LA6_0==16||LA6_0==26||(LA6_0>=29 && LA6_0<=35)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:516:1: (lv_prec_2_0= rulePrecedence )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:516:1: (lv_prec_2_0= rulePrecedence )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:517:3: lv_prec_2_0= rulePrecedence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getPrecPrecedenceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrecedence_in_ruleExpression1028);
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
            	    break loop6;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:541:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:542:2: (iv_rulePrecedence= rulePrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:543:2: iv_rulePrecedence= rulePrecedence EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_rulePrecedence_in_entryRulePrecedence1065);
            iv_rulePrecedence=rulePrecedence();

            state._fsp--;

             current =iv_rulePrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecedence1075); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:550:1: rulePrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'BRACKET' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_bracket_38_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_39_0= 'BRACES' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_braces_41_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_42_0= 'PARENTHESIS' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_parenthesis_44_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_45_0= 'ANGLE' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_angle_47_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_48_0= 'MEMBERFEATURE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '=' )? ( (lv_par1_52_0= RULE_ID ) ) ( (lv_infix_53_0= ruleMultString ) ) ( ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par2_56_0= RULE_ID ) ) ) ) ;
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
        Token lv_bracket_38_0=null;
        Token lv_ruletyp_39_0=null;
        Token lv_rule_40_0=null;
        Token lv_braces_41_0=null;
        Token lv_ruletyp_42_0=null;
        Token lv_rule_43_0=null;
        Token lv_parenthesis_44_0=null;
        Token lv_ruletyp_45_0=null;
        Token lv_rule_46_0=null;
        Token lv_angle_47_0=null;
        Token lv_ruletyp_48_0=null;
        Token lv_rule_49_0=null;
        Token lv_feature1_50_0=null;
        Token otherlv_51=null;
        Token lv_par1_52_0=null;
        Token lv_feature2_54_0=null;
        Token otherlv_55=null;
        Token lv_par2_56_0=null;
        EObject lv_prefix_6_0 = null;

        EObject lv_suffix_15_0 = null;

        EObject lv_infix_21_0 = null;

        EObject lv_inner_30_0 = null;

        EObject lv_infixleft_34_0 = null;

        EObject lv_infix_53_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:553:28: ( ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'BRACKET' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_bracket_38_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_39_0= 'BRACES' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_braces_41_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_42_0= 'PARENTHESIS' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_parenthesis_44_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_45_0= 'ANGLE' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_angle_47_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_48_0= 'MEMBERFEATURE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '=' )? ( (lv_par1_52_0= RULE_ID ) ) ( (lv_infix_53_0= ruleMultString ) ) ( ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par2_56_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'BRACKET' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_bracket_38_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_39_0= 'BRACES' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_braces_41_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_42_0= 'PARENTHESIS' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_parenthesis_44_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_45_0= 'ANGLE' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_angle_47_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_48_0= 'MEMBERFEATURE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '=' )? ( (lv_par1_52_0= RULE_ID ) ) ( (lv_infix_53_0= ruleMultString ) ) ( ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par2_56_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'BRACKET' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_bracket_38_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_39_0= 'BRACES' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_braces_41_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_42_0= 'PARENTHESIS' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_parenthesis_44_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_45_0= 'ANGLE' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_angle_47_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_48_0= 'MEMBERFEATURE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '=' )? ( (lv_par1_52_0= RULE_ID ) ) ( (lv_infix_53_0= ruleMultString ) ) ( ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par2_56_0= RULE_ID ) ) ) )
            int alt16=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt16=1;
                }
                break;
            case 13:
                {
                alt16=2;
                }
                break;
            case 14:
                {
                alt16=3;
                }
                break;
            case 29:
                {
                alt16=4;
                }
                break;
            case 30:
                {
                alt16=5;
                }
                break;
            case 31:
                {
                alt16=6;
                }
                break;
            case 32:
                {
                alt16=7;
                }
                break;
            case 16:
                {
                alt16=8;
                }
                break;
            case 33:
                {
                alt16=9;
                }
                break;
            case 34:
                {
                alt16=10;
                }
                break;
            case 35:
                {
                alt16=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:2: ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:2: ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:3: ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )?
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:3: ( (lv_ruletyp_0_0= 'CALLER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:555:1: (lv_ruletyp_0_0= 'CALLER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:555:1: (lv_ruletyp_0_0= 'CALLER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:556:3: lv_ruletyp_0_0= 'CALLER'
                    {
                    lv_ruletyp_0_0=(Token)match(input,26,FOLLOW_26_in_rulePrecedence1119); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "CALLER");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:569:2: ( (lv_rule_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:570:1: (lv_rule_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:570:1: (lv_rule_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:571:3: lv_rule_1_0= RULE_ID
                    {
                    lv_rule_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1149); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:587:2: (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==27) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:587:4: otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePrecedence1167); 

                                	newLeafNode(otherlv_2, grammarAccess.getPrecedenceAccess().getFullStopKeyword_0_2_0());
                                
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:591:1: ( (lv_feature1_3_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:592:1: (lv_feature1_3_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:592:1: (lv_feature1_3_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:593:3: lv_feature1_3_0= RULE_ID
                            {
                            lv_feature1_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1184); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:610:6: ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:610:6: ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:610:7: ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:610:7: ( (lv_ruletyp_4_0= 'PREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:611:1: (lv_ruletyp_4_0= 'PREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:611:1: (lv_ruletyp_4_0= 'PREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:612:3: lv_ruletyp_4_0= 'PREFIX'
                    {
                    lv_ruletyp_4_0=(Token)match(input,13,FOLLOW_13_in_rulePrecedence1217); 

                            newLeafNode(lv_ruletyp_4_0, grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_4_0, "PREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:625:2: ( (lv_rule_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:626:1: (lv_rule_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:626:1: (lv_rule_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:627:3: lv_rule_5_0= RULE_ID
                    {
                    lv_rule_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1247); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:643:2: ( (lv_prefix_6_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:644:1: (lv_prefix_6_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:644:1: (lv_prefix_6_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:645:3: lv_prefix_6_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1273);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:2: ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==28) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:3: ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:3: ( (lv_feature1_7_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:662:1: (lv_feature1_7_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:662:1: (lv_feature1_7_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:663:3: lv_feature1_7_0= RULE_ID
                            {
                            lv_feature1_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1291); 

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

                            otherlv_8=(Token)match(input,28,FOLLOW_28_in_rulePrecedence1308); 

                                	newLeafNode(otherlv_8, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_1_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:683:3: ( (lv_par1_9_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:684:1: (lv_par1_9_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:684:1: (lv_par1_9_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:685:3: lv_par1_9_0= RULE_ID
                    {
                    lv_par1_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1327); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:702:6: ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:702:6: ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:702:7: ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:702:7: ( (lv_ruletyp_10_0= 'SUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:703:1: (lv_ruletyp_10_0= 'SUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:703:1: (lv_ruletyp_10_0= 'SUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:704:3: lv_ruletyp_10_0= 'SUFFIX'
                    {
                    lv_ruletyp_10_0=(Token)match(input,14,FOLLOW_14_in_rulePrecedence1358); 

                            newLeafNode(lv_ruletyp_10_0, grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_10_0, "SUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:717:2: ( (lv_rule_11_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:718:1: (lv_rule_11_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:718:1: (lv_rule_11_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:3: lv_rule_11_0= RULE_ID
                    {
                    lv_rule_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1388); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:735:2: ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==28) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:735:3: ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:735:3: ( (lv_feature1_12_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:736:1: (lv_feature1_12_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:736:1: (lv_feature1_12_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:737:3: lv_feature1_12_0= RULE_ID
                            {
                            lv_feature1_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1411); 

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

                            otherlv_13=(Token)match(input,28,FOLLOW_28_in_rulePrecedence1428); 

                                	newLeafNode(otherlv_13, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_2_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:757:3: ( (lv_par1_14_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:758:1: (lv_par1_14_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:758:1: (lv_par1_14_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:759:3: lv_par1_14_0= RULE_ID
                    {
                    lv_par1_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1447); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:775:2: ( (lv_suffix_15_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:776:1: (lv_suffix_15_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:776:1: (lv_suffix_15_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:777:3: lv_suffix_15_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1473);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:794:6: ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:794:6: ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:794:7: ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:794:7: ( (lv_ruletyp_16_0= 'INFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:795:1: (lv_ruletyp_16_0= 'INFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:795:1: (lv_ruletyp_16_0= 'INFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:796:3: lv_ruletyp_16_0= 'INFIX'
                    {
                    lv_ruletyp_16_0=(Token)match(input,29,FOLLOW_29_in_rulePrecedence1499); 

                            newLeafNode(lv_ruletyp_16_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_16_0, "INFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:809:2: ( (lv_rule_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:810:1: (lv_rule_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:810:1: (lv_rule_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:811:3: lv_rule_17_0= RULE_ID
                    {
                    lv_rule_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1529); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:827:2: ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==28) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:827:3: ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:827:3: ( (lv_feature1_18_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:828:1: (lv_feature1_18_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:828:1: (lv_feature1_18_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:829:3: lv_feature1_18_0= RULE_ID
                            {
                            lv_feature1_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1552); 

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

                            otherlv_19=(Token)match(input,28,FOLLOW_28_in_rulePrecedence1569); 

                                	newLeafNode(otherlv_19, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:849:3: ( (lv_par1_20_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:850:1: (lv_par1_20_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:850:1: (lv_par1_20_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:851:3: lv_par1_20_0= RULE_ID
                    {
                    lv_par1_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1588); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:867:2: ( (lv_infix_21_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:868:1: (lv_infix_21_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:868:1: (lv_infix_21_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:869:3: lv_infix_21_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1614);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:885:2: ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==28) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:885:3: ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:885:3: ( (lv_feature2_22_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:886:1: (lv_feature2_22_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:886:1: (lv_feature2_22_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:887:3: lv_feature2_22_0= RULE_ID
                            {
                            lv_feature2_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1632); 

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

                            otherlv_23=(Token)match(input,28,FOLLOW_28_in_rulePrecedence1649); 

                                	newLeafNode(otherlv_23, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:907:3: ( (lv_par2_24_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:908:1: (lv_par2_24_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:908:1: (lv_par2_24_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:909:3: lv_par2_24_0= RULE_ID
                    {
                    lv_par2_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1668); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:6: ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:6: ( ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+ )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:7: ( (lv_ruletyp_25_0= 'OUTER' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_inner_30_0= ruleInnerPrecedence ) )+
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:7: ( (lv_ruletyp_25_0= 'OUTER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:927:1: (lv_ruletyp_25_0= 'OUTER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:927:1: (lv_ruletyp_25_0= 'OUTER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:928:3: lv_ruletyp_25_0= 'OUTER'
                    {
                    lv_ruletyp_25_0=(Token)match(input,30,FOLLOW_30_in_rulePrecedence1699); 

                            newLeafNode(lv_ruletyp_25_0, grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_25_0, "OUTER");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:941:2: ( (lv_rule_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:942:1: (lv_rule_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:942:1: (lv_rule_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:943:3: lv_rule_26_0= RULE_ID
                    {
                    lv_rule_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1729); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:959:2: ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==28) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:959:3: ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:959:3: ( (lv_feature1_27_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:960:1: (lv_feature1_27_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:960:1: (lv_feature1_27_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:961:3: lv_feature1_27_0= RULE_ID
                            {
                            lv_feature1_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1752); 

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

                            otherlv_28=(Token)match(input,28,FOLLOW_28_in_rulePrecedence1769); 

                                	newLeafNode(otherlv_28, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:981:3: ( (lv_par1_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:982:1: (lv_par1_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:982:1: (lv_par1_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:983:3: lv_par1_29_0= RULE_ID
                    {
                    lv_par1_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1788); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:999:2: ( (lv_inner_30_0= ruleInnerPrecedence ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=36 && LA13_0<=43)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1000:1: (lv_inner_30_0= ruleInnerPrecedence )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1000:1: (lv_inner_30_0= ruleInnerPrecedence )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1001:3: lv_inner_30_0= ruleInnerPrecedence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInnerInnerPrecedenceParserRuleCall_4_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInnerPrecedence_in_rulePrecedence1814);
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
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1018:6: ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1018:6: ( ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1018:7: ( (lv_ruletyp_31_0= 'INFIXLEFT' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_par1_33_0= RULE_ID ) ) ( (lv_infixleft_34_0= ruleMultString ) ) ( (lv_par2_35_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1018:7: ( (lv_ruletyp_31_0= 'INFIXLEFT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1019:1: (lv_ruletyp_31_0= 'INFIXLEFT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1019:1: (lv_ruletyp_31_0= 'INFIXLEFT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1020:3: lv_ruletyp_31_0= 'INFIXLEFT'
                    {
                    lv_ruletyp_31_0=(Token)match(input,31,FOLLOW_31_in_rulePrecedence1841); 

                            newLeafNode(lv_ruletyp_31_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_31_0, "INFIXLEFT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1033:2: ( (lv_rule_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1034:1: (lv_rule_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1034:1: (lv_rule_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1035:3: lv_rule_32_0= RULE_ID
                    {
                    lv_rule_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1871); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1051:2: ( (lv_par1_33_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1052:1: (lv_par1_33_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1052:1: (lv_par1_33_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1053:3: lv_par1_33_0= RULE_ID
                    {
                    lv_par1_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1893); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1069:2: ( (lv_infixleft_34_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1070:1: (lv_infixleft_34_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1070:1: (lv_infixleft_34_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1071:3: lv_infixleft_34_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixleftMultStringParserRuleCall_5_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1919);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1087:2: ( (lv_par2_35_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1088:1: (lv_par2_35_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1088:1: (lv_par2_35_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1089:3: lv_par2_35_0= RULE_ID
                    {
                    lv_par2_35_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1936); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1106:6: ( ( (lv_ruletyp_36_0= 'BRACKET' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_bracket_38_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1106:6: ( ( (lv_ruletyp_36_0= 'BRACKET' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_bracket_38_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1106:7: ( (lv_ruletyp_36_0= 'BRACKET' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_bracket_38_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1106:7: ( (lv_ruletyp_36_0= 'BRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1107:1: (lv_ruletyp_36_0= 'BRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1107:1: (lv_ruletyp_36_0= 'BRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1108:3: lv_ruletyp_36_0= 'BRACKET'
                    {
                    lv_ruletyp_36_0=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1967); 

                            newLeafNode(lv_ruletyp_36_0, grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_36_0, "BRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1121:2: ( (lv_rule_37_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1122:1: (lv_rule_37_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1122:1: (lv_rule_37_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1123:3: lv_rule_37_0= RULE_ID
                    {
                    lv_rule_37_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1997); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1139:2: ( (lv_bracket_38_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1140:1: (lv_bracket_38_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1140:1: (lv_bracket_38_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1141:3: lv_bracket_38_0= RULE_ID
                    {
                    lv_bracket_38_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2019); 

                    			newLeafNode(lv_bracket_38_0, grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bracket",
                            		lv_bracket_38_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1158:6: ( ( (lv_ruletyp_39_0= 'BRACES' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_braces_41_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1158:6: ( ( (lv_ruletyp_39_0= 'BRACES' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_braces_41_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1158:7: ( (lv_ruletyp_39_0= 'BRACES' ) ) ( (lv_rule_40_0= RULE_ID ) ) ( (lv_braces_41_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1158:7: ( (lv_ruletyp_39_0= 'BRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1159:1: (lv_ruletyp_39_0= 'BRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1159:1: (lv_ruletyp_39_0= 'BRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1160:3: lv_ruletyp_39_0= 'BRACES'
                    {
                    lv_ruletyp_39_0=(Token)match(input,16,FOLLOW_16_in_rulePrecedence2050); 

                            newLeafNode(lv_ruletyp_39_0, grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_39_0, "BRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1173:2: ( (lv_rule_40_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1174:1: (lv_rule_40_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1174:1: (lv_rule_40_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1175:3: lv_rule_40_0= RULE_ID
                    {
                    lv_rule_40_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2080); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1191:2: ( (lv_braces_41_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1192:1: (lv_braces_41_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1192:1: (lv_braces_41_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1193:3: lv_braces_41_0= RULE_ID
                    {
                    lv_braces_41_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2102); 

                    			newLeafNode(lv_braces_41_0, grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"braces",
                            		lv_braces_41_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1210:6: ( ( (lv_ruletyp_42_0= 'PARENTHESIS' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_parenthesis_44_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1210:6: ( ( (lv_ruletyp_42_0= 'PARENTHESIS' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_parenthesis_44_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1210:7: ( (lv_ruletyp_42_0= 'PARENTHESIS' ) ) ( (lv_rule_43_0= RULE_ID ) ) ( (lv_parenthesis_44_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1210:7: ( (lv_ruletyp_42_0= 'PARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1211:1: (lv_ruletyp_42_0= 'PARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1211:1: (lv_ruletyp_42_0= 'PARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1212:3: lv_ruletyp_42_0= 'PARENTHESIS'
                    {
                    lv_ruletyp_42_0=(Token)match(input,33,FOLLOW_33_in_rulePrecedence2133); 

                            newLeafNode(lv_ruletyp_42_0, grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_42_0, "PARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1225:2: ( (lv_rule_43_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1226:1: (lv_rule_43_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1226:1: (lv_rule_43_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1227:3: lv_rule_43_0= RULE_ID
                    {
                    lv_rule_43_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2163); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1243:2: ( (lv_parenthesis_44_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1244:1: (lv_parenthesis_44_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1244:1: (lv_parenthesis_44_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1245:3: lv_parenthesis_44_0= RULE_ID
                    {
                    lv_parenthesis_44_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2185); 

                    			newLeafNode(lv_parenthesis_44_0, grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parenthesis",
                            		lv_parenthesis_44_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1262:6: ( ( (lv_ruletyp_45_0= 'ANGLE' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_angle_47_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1262:6: ( ( (lv_ruletyp_45_0= 'ANGLE' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_angle_47_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1262:7: ( (lv_ruletyp_45_0= 'ANGLE' ) ) ( (lv_rule_46_0= RULE_ID ) ) ( (lv_angle_47_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1262:7: ( (lv_ruletyp_45_0= 'ANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1263:1: (lv_ruletyp_45_0= 'ANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1263:1: (lv_ruletyp_45_0= 'ANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1264:3: lv_ruletyp_45_0= 'ANGLE'
                    {
                    lv_ruletyp_45_0=(Token)match(input,34,FOLLOW_34_in_rulePrecedence2216); 

                            newLeafNode(lv_ruletyp_45_0, grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_45_0, "ANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1277:2: ( (lv_rule_46_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1278:1: (lv_rule_46_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1278:1: (lv_rule_46_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1279:3: lv_rule_46_0= RULE_ID
                    {
                    lv_rule_46_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2246); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1295:2: ( (lv_angle_47_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1296:1: (lv_angle_47_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1296:1: (lv_angle_47_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1297:3: lv_angle_47_0= RULE_ID
                    {
                    lv_angle_47_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2268); 

                    			newLeafNode(lv_angle_47_0, grammarAccess.getPrecedenceAccess().getAngleIDTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"angle",
                            		lv_angle_47_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:6: ( ( (lv_ruletyp_48_0= 'MEMBERFEATURE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '=' )? ( (lv_par1_52_0= RULE_ID ) ) ( (lv_infix_53_0= ruleMultString ) ) ( ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par2_56_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:6: ( ( (lv_ruletyp_48_0= 'MEMBERFEATURE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '=' )? ( (lv_par1_52_0= RULE_ID ) ) ( (lv_infix_53_0= ruleMultString ) ) ( ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par2_56_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:7: ( (lv_ruletyp_48_0= 'MEMBERFEATURE' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '=' )? ( (lv_par1_52_0= RULE_ID ) ) ( (lv_infix_53_0= ruleMultString ) ) ( ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par2_56_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:7: ( (lv_ruletyp_48_0= 'MEMBERFEATURE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1315:1: (lv_ruletyp_48_0= 'MEMBERFEATURE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1315:1: (lv_ruletyp_48_0= 'MEMBERFEATURE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1316:3: lv_ruletyp_48_0= 'MEMBERFEATURE'
                    {
                    lv_ruletyp_48_0=(Token)match(input,35,FOLLOW_35_in_rulePrecedence2299); 

                            newLeafNode(lv_ruletyp_48_0, grammarAccess.getPrecedenceAccess().getRuletypMEMBERFEATUREKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_48_0, "MEMBERFEATURE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1329:2: ( (lv_rule_49_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1330:1: (lv_rule_49_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1330:1: (lv_rule_49_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1331:3: lv_rule_49_0= RULE_ID
                    {
                    lv_rule_49_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2329); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1347:2: ( ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '=' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==28) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1347:3: ( (lv_feature1_50_0= RULE_ID ) ) otherlv_51= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1347:3: ( (lv_feature1_50_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1348:1: (lv_feature1_50_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1348:1: (lv_feature1_50_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1349:3: lv_feature1_50_0= RULE_ID
                            {
                            lv_feature1_50_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2352); 

                            			newLeafNode(lv_feature1_50_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_10_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_50_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_51=(Token)match(input,28,FOLLOW_28_in_rulePrecedence2369); 

                                	newLeafNode(otherlv_51, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_10_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1369:3: ( (lv_par1_52_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1370:1: (lv_par1_52_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1370:1: (lv_par1_52_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1371:3: lv_par1_52_0= RULE_ID
                    {
                    lv_par1_52_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2388); 

                    			newLeafNode(lv_par1_52_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_10_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_52_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1387:2: ( (lv_infix_53_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1388:1: (lv_infix_53_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1388:1: (lv_infix_53_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1389:3: lv_infix_53_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_10_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2414);
                    lv_infix_53_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_53_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1405:2: ( ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '=' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==28) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1405:3: ( (lv_feature2_54_0= RULE_ID ) ) otherlv_55= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1405:3: ( (lv_feature2_54_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1406:1: (lv_feature2_54_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1406:1: (lv_feature2_54_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1407:3: lv_feature2_54_0= RULE_ID
                            {
                            lv_feature2_54_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2432); 

                            			newLeafNode(lv_feature2_54_0, grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_10_5_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_54_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_55=(Token)match(input,28,FOLLOW_28_in_rulePrecedence2449); 

                                	newLeafNode(otherlv_55, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_10_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1427:3: ( (lv_par2_56_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1428:1: (lv_par2_56_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1428:1: (lv_par2_56_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1429:3: lv_par2_56_0= RULE_ID
                    {
                    lv_par2_56_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2468); 

                    			newLeafNode(lv_par2_56_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_10_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_56_0, 
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1453:1: entryRuleInnerPrecedence returns [EObject current=null] : iv_ruleInnerPrecedence= ruleInnerPrecedence EOF ;
    public final EObject entryRuleInnerPrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerPrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1454:2: (iv_ruleInnerPrecedence= ruleInnerPrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1455:2: iv_ruleInnerPrecedence= ruleInnerPrecedence EOF
            {
             newCompositeNode(grammarAccess.getInnerPrecedenceRule()); 
            pushFollow(FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence2510);
            iv_ruleInnerPrecedence=ruleInnerPrecedence();

            state._fsp--;

             current =iv_ruleInnerPrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerPrecedence2520); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1462:1: ruleInnerPrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1465:28: ( ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1466:1: ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1466:1: ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt21=1;
                }
                break;
            case 37:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            case 39:
                {
                alt21=4;
                }
                break;
            case 40:
                {
                alt21=5;
                }
                break;
            case 41:
                {
                alt21=6;
                }
                break;
            case 42:
                {
                alt21=7;
                }
                break;
            case 43:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1466:2: ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1466:2: ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1466:3: ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1466:3: ( (lv_ruletyp_0_0= 'INNERPREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1467:1: (lv_ruletyp_0_0= 'INNERPREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1467:1: (lv_ruletyp_0_0= 'INNERPREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1468:3: lv_ruletyp_0_0= 'INNERPREFIX'
                    {
                    lv_ruletyp_0_0=(Token)match(input,36,FOLLOW_36_in_ruleInnerPrecedence2564); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "INNERPREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1481:2: ( (lv_prefix_1_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1482:1: (lv_prefix_1_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1482:1: (lv_prefix_1_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1483:3: lv_prefix_1_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getPrefixMultStringParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence2598);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1499:2: ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        int LA17_1 = input.LA(2);

                        if ( (LA17_1==28) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1499:3: ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1499:3: ( (lv_feature1_2_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1500:1: (lv_feature1_2_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1500:1: (lv_feature1_2_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1501:3: lv_feature1_2_0= RULE_ID
                            {
                            lv_feature1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2616); 

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

                            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleInnerPrecedence2633); 

                                	newLeafNode(otherlv_3, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_0_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1521:3: ( (lv_par2_4_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1522:1: (lv_par2_4_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1522:1: (lv_par2_4_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1523:3: lv_par2_4_0= RULE_ID
                    {
                    lv_par2_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2652); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1540:6: ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1540:6: ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1540:7: ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1540:7: ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1541:1: (lv_ruletyp_5_0= 'INNERSUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1541:1: (lv_ruletyp_5_0= 'INNERSUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1542:3: lv_ruletyp_5_0= 'INNERSUFFIX'
                    {
                    lv_ruletyp_5_0=(Token)match(input,37,FOLLOW_37_in_ruleInnerPrecedence2683); 

                            newLeafNode(lv_ruletyp_5_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_5_0, "INNERSUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1555:2: ( (lv_suffix_6_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1556:1: (lv_suffix_6_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1556:1: (lv_suffix_6_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1557:3: lv_suffix_6_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getSuffixMultStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence2717);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1574:6: ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1574:6: ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1574:7: ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1574:7: ( (lv_ruletyp_7_0= 'INNERINFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1575:1: (lv_ruletyp_7_0= 'INNERINFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1575:1: (lv_ruletyp_7_0= 'INNERINFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1576:3: lv_ruletyp_7_0= 'INNERINFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,38,FOLLOW_38_in_ruleInnerPrecedence2743); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "INNERINFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1589:2: ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==26) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1589:3: ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )?
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1589:3: ( (lv_mod_8_0= 'CALLER' ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1590:1: (lv_mod_8_0= 'CALLER' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1590:1: (lv_mod_8_0= 'CALLER' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1591:3: lv_mod_8_0= 'CALLER'
                            {
                            lv_mod_8_0=(Token)match(input,26,FOLLOW_26_in_ruleInnerPrecedence2775); 

                                    newLeafNode(lv_mod_8_0, grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "mod", lv_mod_8_0, "CALLER");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1604:2: ( (lv_rule_9_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1605:1: (lv_rule_9_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1605:1: (lv_rule_9_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1606:3: lv_rule_9_0= RULE_ID
                            {
                            lv_rule_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2805); 

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

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1622:2: (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==27) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1622:4: otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) )
                                    {
                                    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleInnerPrecedence2823); 

                                        	newLeafNode(otherlv_10, grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_2_1_2_0());
                                        
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1626:1: ( (lv_feature1_11_0= RULE_ID ) )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1627:1: (lv_feature1_11_0= RULE_ID )
                                    {
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1627:1: (lv_feature1_11_0= RULE_ID )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1628:3: lv_feature1_11_0= RULE_ID
                                    {
                                    lv_feature1_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2840); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1644:6: ( (lv_infix_12_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1645:1: (lv_infix_12_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1645:1: (lv_infix_12_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1646:3: lv_infix_12_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence2870);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1662:2: ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==28) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1662:3: ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1662:3: ( (lv_feature2_13_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1663:1: (lv_feature2_13_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1663:1: (lv_feature2_13_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1664:3: lv_feature2_13_0= RULE_ID
                            {
                            lv_feature2_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2888); 

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

                            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleInnerPrecedence2905); 

                                	newLeafNode(otherlv_14, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_2_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1684:3: ( (lv_par2_15_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1685:1: (lv_par2_15_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1685:1: (lv_par2_15_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1686:3: lv_par2_15_0= RULE_ID
                    {
                    lv_par2_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2924); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1703:6: ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1703:6: ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1703:7: ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( (lv_infixleft_17_0= ruleMultString ) ) ( (lv_par2_18_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1703:7: ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1704:1: (lv_ruletyp_16_0= 'INNERINFIXLEFT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1704:1: (lv_ruletyp_16_0= 'INNERINFIXLEFT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1705:3: lv_ruletyp_16_0= 'INNERINFIXLEFT'
                    {
                    lv_ruletyp_16_0=(Token)match(input,39,FOLLOW_39_in_ruleInnerPrecedence2955); 

                            newLeafNode(lv_ruletyp_16_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXLEFTKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_16_0, "INNERINFIXLEFT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1718:2: ( (lv_infixleft_17_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1719:1: (lv_infixleft_17_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1719:1: (lv_infixleft_17_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1720:3: lv_infixleft_17_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixleftMultStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence2989);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1736:2: ( (lv_par2_18_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1737:1: (lv_par2_18_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1737:1: (lv_par2_18_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1738:3: lv_par2_18_0= RULE_ID
                    {
                    lv_par2_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3006); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1755:6: ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1755:6: ( ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1755:7: ( (lv_ruletyp_19_0= 'INNERBRACKET' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( (lv_bracket_21_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1755:7: ( (lv_ruletyp_19_0= 'INNERBRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1756:1: (lv_ruletyp_19_0= 'INNERBRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1756:1: (lv_ruletyp_19_0= 'INNERBRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1757:3: lv_ruletyp_19_0= 'INNERBRACKET'
                    {
                    lv_ruletyp_19_0=(Token)match(input,40,FOLLOW_40_in_ruleInnerPrecedence3037); 

                            newLeafNode(lv_ruletyp_19_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_19_0, "INNERBRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1770:2: ( (lv_rule_20_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1771:1: (lv_rule_20_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1771:1: (lv_rule_20_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1772:3: lv_rule_20_0= RULE_ID
                    {
                    lv_rule_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3067); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1788:2: ( (lv_bracket_21_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1789:1: (lv_bracket_21_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1789:1: (lv_bracket_21_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1790:3: lv_bracket_21_0= RULE_ID
                    {
                    lv_bracket_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3089); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1807:6: ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1807:6: ( ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1807:7: ( (lv_ruletyp_22_0= 'INNERBRACES' ) ) ( (lv_rule_23_0= RULE_ID ) ) ( (lv_braces_24_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1807:7: ( (lv_ruletyp_22_0= 'INNERBRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1808:1: (lv_ruletyp_22_0= 'INNERBRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1808:1: (lv_ruletyp_22_0= 'INNERBRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1809:3: lv_ruletyp_22_0= 'INNERBRACES'
                    {
                    lv_ruletyp_22_0=(Token)match(input,41,FOLLOW_41_in_ruleInnerPrecedence3120); 

                            newLeafNode(lv_ruletyp_22_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_22_0, "INNERBRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1822:2: ( (lv_rule_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1823:1: (lv_rule_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1823:1: (lv_rule_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1824:3: lv_rule_23_0= RULE_ID
                    {
                    lv_rule_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3150); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1840:2: ( (lv_braces_24_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1841:1: (lv_braces_24_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1841:1: (lv_braces_24_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1842:3: lv_braces_24_0= RULE_ID
                    {
                    lv_braces_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3172); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1859:6: ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1859:6: ( ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1859:7: ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_parenthesis_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1859:7: ( (lv_ruletyp_25_0= 'INNERPARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1860:1: (lv_ruletyp_25_0= 'INNERPARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1860:1: (lv_ruletyp_25_0= 'INNERPARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1861:3: lv_ruletyp_25_0= 'INNERPARENTHESIS'
                    {
                    lv_ruletyp_25_0=(Token)match(input,42,FOLLOW_42_in_ruleInnerPrecedence3203); 

                            newLeafNode(lv_ruletyp_25_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_25_0, "INNERPARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1874:2: ( (lv_rule_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1875:1: (lv_rule_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1875:1: (lv_rule_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1876:3: lv_rule_26_0= RULE_ID
                    {
                    lv_rule_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3233); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1892:2: ( (lv_parenthesis_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1893:1: (lv_parenthesis_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1893:1: (lv_parenthesis_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1894:3: lv_parenthesis_27_0= RULE_ID
                    {
                    lv_parenthesis_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3255); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1911:6: ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1911:6: ( ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1911:7: ( (lv_ruletyp_28_0= 'INNERANGLE' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_angle_30_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1911:7: ( (lv_ruletyp_28_0= 'INNERANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1912:1: (lv_ruletyp_28_0= 'INNERANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1912:1: (lv_ruletyp_28_0= 'INNERANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1913:3: lv_ruletyp_28_0= 'INNERANGLE'
                    {
                    lv_ruletyp_28_0=(Token)match(input,43,FOLLOW_43_in_ruleInnerPrecedence3286); 

                            newLeafNode(lv_ruletyp_28_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_28_0, "INNERANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1926:2: ( (lv_rule_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1927:1: (lv_rule_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1927:1: (lv_rule_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1928:3: lv_rule_29_0= RULE_ID
                    {
                    lv_rule_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3316); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1944:2: ( (lv_angle_30_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1945:1: (lv_angle_30_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1945:1: (lv_angle_30_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1946:3: lv_angle_30_0= RULE_ID
                    {
                    lv_angle_30_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3338); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1970:1: entryRuleMultID returns [EObject current=null] : iv_ruleMultID= ruleMultID EOF ;
    public final EObject entryRuleMultID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultID = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1971:2: (iv_ruleMultID= ruleMultID EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1972:2: iv_ruleMultID= ruleMultID EOF
            {
             newCompositeNode(grammarAccess.getMultIDRule()); 
            pushFollow(FOLLOW_ruleMultID_in_entryRuleMultID3380);
            iv_ruleMultID=ruleMultID();

            state._fsp--;

             current =iv_ruleMultID; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultID3390); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1979:1: ruleMultID returns [EObject current=null] : ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) ) ;
    public final EObject ruleMultID() throws RecognitionException {
        EObject current = null;

        Token lv_mi_1_0=null;
        Token otherlv_2=null;
        Token lv_mi_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1982:28: ( ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1983:1: ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1983:1: ( () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1983:2: () ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1983:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1984:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultIDAccess().getMultIDAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1989:2: ( ( (lv_mi_1_0= RULE_ID ) ) | (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==44) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1989:3: ( (lv_mi_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1989:3: ( (lv_mi_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1990:1: (lv_mi_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1990:1: (lv_mi_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1991:3: lv_mi_1_0= RULE_ID
                    {
                    lv_mi_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultID3442); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2008:6: (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2008:6: (otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2008:8: otherlv_2= '[' ( (lv_mi_3_0= RULE_ID ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleMultID3466); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_1_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2012:1: ( (lv_mi_3_0= RULE_ID ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2013:1: (lv_mi_3_0= RULE_ID )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2013:1: (lv_mi_3_0= RULE_ID )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2014:3: lv_mi_3_0= RULE_ID
                    	    {
                    	    lv_mi_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultID3483); 

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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleMultID3501); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2042:1: entryRuleMultString returns [EObject current=null] : iv_ruleMultString= ruleMultString EOF ;
    public final EObject entryRuleMultString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2043:2: (iv_ruleMultString= ruleMultString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2044:2: iv_ruleMultString= ruleMultString EOF
            {
             newCompositeNode(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString3539);
            iv_ruleMultString=ruleMultString();

            state._fsp--;

             current =iv_ruleMultString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString3549); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2051:1: ruleMultString returns [EObject current=null] : ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) ) ;
    public final EObject ruleMultString() throws RecognitionException {
        EObject current = null;

        Token lv_ms_1_0=null;
        Token otherlv_2=null;
        Token lv_ms_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2054:28: ( ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2055:1: ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2055:1: ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2055:2: () ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2055:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2056:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultStringAccess().getMultStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2061:2: ( ( (lv_ms_1_0= RULE_STRING ) ) | (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==44) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2061:3: ( (lv_ms_1_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2061:3: ( (lv_ms_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2062:1: (lv_ms_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2062:1: (lv_ms_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2063:3: lv_ms_1_0= RULE_STRING
                    {
                    lv_ms_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString3601); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2080:6: (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2080:6: (otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2080:8: otherlv_2= '[' ( (lv_ms_3_0= RULE_STRING ) )* otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleMultString3625); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_1_0());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2084:1: ( (lv_ms_3_0= RULE_STRING ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_STRING) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2085:1: (lv_ms_3_0= RULE_STRING )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2085:1: (lv_ms_3_0= RULE_STRING )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2086:3: lv_ms_3_0= RULE_STRING
                    	    {
                    	    lv_ms_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString3642); 

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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleMultString3660); 

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


    // $ANTLR start "entryRulePrimary"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2114:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2115:2: (iv_rulePrimary= rulePrimary EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2116:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3698);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3708); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2123:1: rulePrimary returns [EObject current=null] : (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2126:28: ( (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2127:1: (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2127:1: (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2127:3: otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )*
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_rulePrimary3745); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getPRIMARYKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2131:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2132:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2132:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2133:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary3762); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimaryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimaryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2149:2: ( (lv_inner_2_0= rulePrimaryInner ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=47 && LA26_0<=61)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2150:1: (lv_inner_2_0= rulePrimaryInner )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2150:1: (lv_inner_2_0= rulePrimaryInner )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2151:3: lv_inner_2_0= rulePrimaryInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrimaryAccess().getInnerPrimaryInnerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryInner_in_rulePrimary3788);
            	    lv_inner_2_0=rulePrimaryInner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inner",
            	            		lv_inner_2_0, 
            	            		"PrimaryInner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRulePrimaryInner"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2175:1: entryRulePrimaryInner returns [EObject current=null] : iv_rulePrimaryInner= rulePrimaryInner EOF ;
    public final EObject entryRulePrimaryInner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInner = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2176:2: (iv_rulePrimaryInner= rulePrimaryInner EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2177:2: iv_rulePrimaryInner= rulePrimaryInner EOF
            {
             newCompositeNode(grammarAccess.getPrimaryInnerRule()); 
            pushFollow(FOLLOW_rulePrimaryInner_in_entryRulePrimaryInner3825);
            iv_rulePrimaryInner=rulePrimaryInner();

            state._fsp--;

             current =iv_rulePrimaryInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryInner3835); 

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
    // $ANTLR end "entryRulePrimaryInner"


    // $ANTLR start "rulePrimaryInner"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2184:1: rulePrimaryInner returns [EObject current=null] : ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryInner() throws RecognitionException {
        EObject current = null;

        Token lv_primarytyp_0_0=null;
        Token lv_construct_1_0=null;
        Token lv_primarytyp_2_0=null;
        Token lv_construct_3_0=null;
        Token lv_primarytyp_4_0=null;
        Token lv_construct_5_0=null;
        Token lv_construct2_6_0=null;
        Token lv_primarytyp_7_0=null;
        Token lv_construct_8_0=null;
        Token lv_primarytyp_9_0=null;
        Token lv_construct_10_0=null;
        Token lv_primarytyp_12_0=null;
        Token lv_construct_13_0=null;
        Token lv_primarytyp_14_0=null;
        Token lv_construct_15_0=null;
        Token lv_primarytyp_16_0=null;
        Token lv_construct_17_0=null;
        Token lv_primarytyp_18_0=null;
        Token lv_construct_19_0=null;
        Token lv_primarytyp_20_0=null;
        Token lv_construct_21_0=null;
        Token lv_primarytyp_22_0=null;
        Token lv_construct_23_0=null;
        Token lv_primarytyp_24_0=null;
        Token lv_construct_25_0=null;
        Token lv_primarytyp_26_0=null;
        Token lv_construct_27_0=null;
        Token lv_primarytyp_28_0=null;
        Token lv_construct_29_0=null;
        Token lv_primarytyp_30_0=null;
        Token lv_construct_31_0=null;
        EObject lv_feature_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2187:28: ( ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2188:1: ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2188:1: ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) )
            int alt27=15;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt27=1;
                }
                break;
            case 48:
                {
                alt27=2;
                }
                break;
            case 49:
                {
                alt27=3;
                }
                break;
            case 50:
                {
                alt27=4;
                }
                break;
            case 51:
                {
                alt27=5;
                }
                break;
            case 52:
                {
                alt27=6;
                }
                break;
            case 53:
                {
                alt27=7;
                }
                break;
            case 54:
                {
                alt27=8;
                }
                break;
            case 55:
                {
                alt27=9;
                }
                break;
            case 56:
                {
                alt27=10;
                }
                break;
            case 57:
                {
                alt27=11;
                }
                break;
            case 58:
                {
                alt27=12;
                }
                break;
            case 59:
                {
                alt27=13;
                }
                break;
            case 60:
                {
                alt27=14;
                }
                break;
            case 61:
                {
                alt27=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2188:2: ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2188:2: ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2188:3: ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2188:3: ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2189:1: (lv_primarytyp_0_0= 'CONSTRUCTOR' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2189:1: (lv_primarytyp_0_0= 'CONSTRUCTOR' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2190:3: lv_primarytyp_0_0= 'CONSTRUCTOR'
                    {
                    lv_primarytyp_0_0=(Token)match(input,47,FOLLOW_47_in_rulePrimaryInner3879); 

                            newLeafNode(lv_primarytyp_0_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypCONSTRUCTORKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_0_0, "CONSTRUCTOR");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2203:2: ( (lv_construct_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2204:1: (lv_construct_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2204:1: (lv_construct_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2205:3: lv_construct_1_0= RULE_ID
                    {
                    lv_construct_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner3909); 

                    			newLeafNode(lv_construct_1_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2222:6: ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2222:6: ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2222:7: ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2222:7: ( (lv_primarytyp_2_0= 'BLOCK' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2223:1: (lv_primarytyp_2_0= 'BLOCK' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2223:1: (lv_primarytyp_2_0= 'BLOCK' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2224:3: lv_primarytyp_2_0= 'BLOCK'
                    {
                    lv_primarytyp_2_0=(Token)match(input,48,FOLLOW_48_in_rulePrimaryInner3940); 

                            newLeafNode(lv_primarytyp_2_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypBLOCKKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_2_0, "BLOCK");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2237:2: ( (lv_construct_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2238:1: (lv_construct_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2238:1: (lv_construct_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2239:3: lv_construct_3_0= RULE_ID
                    {
                    lv_construct_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner3970); 

                    			newLeafNode(lv_construct_3_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2256:6: ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2256:6: ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2256:7: ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2256:7: ( (lv_primarytyp_4_0= 'SWITCH' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2257:1: (lv_primarytyp_4_0= 'SWITCH' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2257:1: (lv_primarytyp_4_0= 'SWITCH' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2258:3: lv_primarytyp_4_0= 'SWITCH'
                    {
                    lv_primarytyp_4_0=(Token)match(input,49,FOLLOW_49_in_rulePrimaryInner4001); 

                            newLeafNode(lv_primarytyp_4_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypSWITCHKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_4_0, "SWITCH");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2271:2: ( (lv_construct_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2272:1: (lv_construct_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2272:1: (lv_construct_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2273:3: lv_construct_5_0= RULE_ID
                    {
                    lv_construct_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4031); 

                    			newLeafNode(lv_construct_5_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2289:2: ( (lv_construct2_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2290:1: (lv_construct2_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2290:1: (lv_construct2_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2291:3: lv_construct2_6_0= RULE_ID
                    {
                    lv_construct2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4053); 

                    			newLeafNode(lv_construct2_6_0, grammarAccess.getPrimaryInnerAccess().getConstruct2IDTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct2",
                            		lv_construct2_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2308:6: ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2308:6: ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2308:7: ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2308:7: ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2309:1: (lv_primarytyp_7_0= 'SYNCHRONIZED' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2309:1: (lv_primarytyp_7_0= 'SYNCHRONIZED' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2310:3: lv_primarytyp_7_0= 'SYNCHRONIZED'
                    {
                    lv_primarytyp_7_0=(Token)match(input,50,FOLLOW_50_in_rulePrimaryInner4084); 

                            newLeafNode(lv_primarytyp_7_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypSYNCHRONIZEDKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_7_0, "SYNCHRONIZED");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2323:2: ( (lv_construct_8_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2324:1: (lv_construct_8_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2324:1: (lv_construct_8_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2325:3: lv_construct_8_0= RULE_ID
                    {
                    lv_construct_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4114); 

                    			newLeafNode(lv_construct_8_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2342:6: ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2342:6: ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2342:7: ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2342:7: ( (lv_primarytyp_9_0= 'FEATURECALL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2343:1: (lv_primarytyp_9_0= 'FEATURECALL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2343:1: (lv_primarytyp_9_0= 'FEATURECALL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2344:3: lv_primarytyp_9_0= 'FEATURECALL'
                    {
                    lv_primarytyp_9_0=(Token)match(input,51,FOLLOW_51_in_rulePrimaryInner4145); 

                            newLeafNode(lv_primarytyp_9_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypFEATURECALLKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_9_0, "FEATURECALL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2357:2: ( (lv_construct_10_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2358:1: (lv_construct_10_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2358:1: (lv_construct_10_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2359:3: lv_construct_10_0= RULE_ID
                    {
                    lv_construct_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4175); 

                    			newLeafNode(lv_construct_10_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_10_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2375:2: ( (lv_feature_11_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2376:1: (lv_feature_11_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2376:1: (lv_feature_11_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2377:3: lv_feature_11_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryInnerAccess().getFeatureMultStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrimaryInner4201);
                    lv_feature_11_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		set(
                           			current, 
                           			"feature",
                            		lv_feature_11_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2394:6: ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2394:6: ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2394:7: ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2394:7: ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2395:1: (lv_primarytyp_12_0= 'IFEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2395:1: (lv_primarytyp_12_0= 'IFEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2396:3: lv_primarytyp_12_0= 'IFEXPRESSION'
                    {
                    lv_primarytyp_12_0=(Token)match(input,52,FOLLOW_52_in_rulePrimaryInner4227); 

                            newLeafNode(lv_primarytyp_12_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypIFEXPRESSIONKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_12_0, "IFEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2409:2: ( (lv_construct_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2410:1: (lv_construct_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2410:1: (lv_construct_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2411:3: lv_construct_13_0= RULE_ID
                    {
                    lv_construct_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4257); 

                    			newLeafNode(lv_construct_13_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_13_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2428:6: ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2428:6: ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2428:7: ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2428:7: ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2429:1: (lv_primarytyp_14_0= 'FOREXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2429:1: (lv_primarytyp_14_0= 'FOREXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2430:3: lv_primarytyp_14_0= 'FOREXPRESSION'
                    {
                    lv_primarytyp_14_0=(Token)match(input,53,FOLLOW_53_in_rulePrimaryInner4288); 

                            newLeafNode(lv_primarytyp_14_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypFOREXPRESSIONKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_14_0, "FOREXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2443:2: ( (lv_construct_15_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2444:1: (lv_construct_15_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2444:1: (lv_construct_15_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2445:3: lv_construct_15_0= RULE_ID
                    {
                    lv_construct_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4318); 

                    			newLeafNode(lv_construct_15_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_15_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2462:6: ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2462:6: ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2462:7: ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2462:7: ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2463:1: (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2463:1: (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2464:3: lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION'
                    {
                    lv_primarytyp_16_0=(Token)match(input,54,FOLLOW_54_in_rulePrimaryInner4349); 

                            newLeafNode(lv_primarytyp_16_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypBASICFORLOOPEXPRESSIONKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_16_0, "BASICFORLOOPEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2477:2: ( (lv_construct_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2478:1: (lv_construct_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2478:1: (lv_construct_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2479:3: lv_construct_17_0= RULE_ID
                    {
                    lv_construct_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4379); 

                    			newLeafNode(lv_construct_17_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_17_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2496:6: ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2496:6: ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2496:7: ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2496:7: ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2497:1: (lv_primarytyp_18_0= 'WHILEEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2497:1: (lv_primarytyp_18_0= 'WHILEEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2498:3: lv_primarytyp_18_0= 'WHILEEXPRESSION'
                    {
                    lv_primarytyp_18_0=(Token)match(input,55,FOLLOW_55_in_rulePrimaryInner4410); 

                            newLeafNode(lv_primarytyp_18_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypWHILEEXPRESSIONKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_18_0, "WHILEEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2511:2: ( (lv_construct_19_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2512:1: (lv_construct_19_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2512:1: (lv_construct_19_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2513:3: lv_construct_19_0= RULE_ID
                    {
                    lv_construct_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4440); 

                    			newLeafNode(lv_construct_19_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_19_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2530:6: ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2530:6: ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2530:7: ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2530:7: ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2531:1: (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2531:1: (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2532:3: lv_primarytyp_20_0= 'DOWHILEEXPRESSION'
                    {
                    lv_primarytyp_20_0=(Token)match(input,56,FOLLOW_56_in_rulePrimaryInner4471); 

                            newLeafNode(lv_primarytyp_20_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypDOWHILEEXPRESSIONKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_20_0, "DOWHILEEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2545:2: ( (lv_construct_21_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2546:1: (lv_construct_21_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2546:1: (lv_construct_21_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2547:3: lv_construct_21_0= RULE_ID
                    {
                    lv_construct_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4501); 

                    			newLeafNode(lv_construct_21_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_21_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2564:6: ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2564:6: ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2564:7: ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2564:7: ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2565:1: (lv_primarytyp_22_0= 'THROWEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2565:1: (lv_primarytyp_22_0= 'THROWEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2566:3: lv_primarytyp_22_0= 'THROWEXPRESSION'
                    {
                    lv_primarytyp_22_0=(Token)match(input,57,FOLLOW_57_in_rulePrimaryInner4532); 

                            newLeafNode(lv_primarytyp_22_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypTHROWEXPRESSIONKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_22_0, "THROWEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2579:2: ( (lv_construct_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2580:1: (lv_construct_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2580:1: (lv_construct_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2581:3: lv_construct_23_0= RULE_ID
                    {
                    lv_construct_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4562); 

                    			newLeafNode(lv_construct_23_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_23_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2598:6: ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2598:6: ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2598:7: ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2598:7: ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2599:1: (lv_primarytyp_24_0= 'RETURNEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2599:1: (lv_primarytyp_24_0= 'RETURNEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2600:3: lv_primarytyp_24_0= 'RETURNEXPRESSION'
                    {
                    lv_primarytyp_24_0=(Token)match(input,58,FOLLOW_58_in_rulePrimaryInner4593); 

                            newLeafNode(lv_primarytyp_24_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypRETURNEXPRESSIONKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_24_0, "RETURNEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2613:2: ( (lv_construct_25_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2614:1: (lv_construct_25_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2614:1: (lv_construct_25_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2615:3: lv_construct_25_0= RULE_ID
                    {
                    lv_construct_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4623); 

                    			newLeafNode(lv_construct_25_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_25_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2632:6: ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2632:6: ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2632:7: ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2632:7: ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2633:1: (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2633:1: (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2634:3: lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION'
                    {
                    lv_primarytyp_26_0=(Token)match(input,59,FOLLOW_59_in_rulePrimaryInner4654); 

                            newLeafNode(lv_primarytyp_26_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypTRYCATCHFINALYEXPRESSIONKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_26_0, "TRYCATCHFINALYEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2647:2: ( (lv_construct_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2648:1: (lv_construct_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2648:1: (lv_construct_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2649:3: lv_construct_27_0= RULE_ID
                    {
                    lv_construct_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4684); 

                    			newLeafNode(lv_construct_27_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_27_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2666:6: ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2666:6: ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2666:7: ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2666:7: ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2667:1: (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2667:1: (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2668:3: lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION'
                    {
                    lv_primarytyp_28_0=(Token)match(input,60,FOLLOW_60_in_rulePrimaryInner4715); 

                            newLeafNode(lv_primarytyp_28_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypPARENTHESIZEDEXPRESSIONKeyword_13_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_28_0, "PARENTHESIZEDEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2681:2: ( (lv_construct_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2682:1: (lv_construct_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2682:1: (lv_construct_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2683:3: lv_construct_29_0= RULE_ID
                    {
                    lv_construct_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4745); 

                    			newLeafNode(lv_construct_29_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_29_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2700:6: ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2700:6: ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2700:7: ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2700:7: ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2701:1: (lv_primarytyp_30_0= 'LITERALEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2701:1: (lv_primarytyp_30_0= 'LITERALEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2702:3: lv_primarytyp_30_0= 'LITERALEXPRESSION'
                    {
                    lv_primarytyp_30_0=(Token)match(input,61,FOLLOW_61_in_rulePrimaryInner4776); 

                            newLeafNode(lv_primarytyp_30_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypLITERALEXPRESSIONKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_30_0, "LITERALEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2715:2: ( (lv_construct_31_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2716:1: (lv_construct_31_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2716:1: (lv_construct_31_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2717:3: lv_construct_31_0= RULE_ID
                    {
                    lv_construct_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4806); 

                    			newLeafNode(lv_construct_31_0, grammarAccess.getPrimaryInnerAccess().getConstructIDTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_31_0, 
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
    // $ANTLR end "rulePrimaryInner"


    // $ANTLR start "entryRuleLiteral"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2741:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2742:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2743:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral4848);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral4858); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2750:1: ruleLiteral returns [EObject current=null] : (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2753:28: ( (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2754:1: (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2754:1: (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2754:3: otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleLiteral4895); 

                	newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getLITERALKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2758:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2759:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2759:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2760:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral4912); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2776:2: ( (lv_inner_2_0= ruleLiteralInner ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=63 && LA28_0<=69)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2777:1: (lv_inner_2_0= ruleLiteralInner )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2777:1: (lv_inner_2_0= ruleLiteralInner )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2778:3: lv_inner_2_0= ruleLiteralInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLiteralAccess().getInnerLiteralInnerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteralInner_in_ruleLiteral4938);
            	    lv_inner_2_0=ruleLiteralInner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inner",
            	            		lv_inner_2_0, 
            	            		"LiteralInner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleLiteralInner"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2802:1: entryRuleLiteralInner returns [EObject current=null] : iv_ruleLiteralInner= ruleLiteralInner EOF ;
    public final EObject entryRuleLiteralInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInner = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2803:2: (iv_ruleLiteralInner= ruleLiteralInner EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2804:2: iv_ruleLiteralInner= ruleLiteralInner EOF
            {
             newCompositeNode(grammarAccess.getLiteralInnerRule()); 
            pushFollow(FOLLOW_ruleLiteralInner_in_entryRuleLiteralInner4975);
            iv_ruleLiteralInner=ruleLiteralInner();

            state._fsp--;

             current =iv_ruleLiteralInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralInner4985); 

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
    // $ANTLR end "entryRuleLiteralInner"


    // $ANTLR start "ruleLiteralInner"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2811:1: ruleLiteralInner returns [EObject current=null] : ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) ) ;
    public final EObject ruleLiteralInner() throws RecognitionException {
        EObject current = null;

        Token lv_primarytyp_0_0=null;
        Token lv_construct_1_0=null;
        Token lv_primarytyp_2_0=null;
        Token lv_construct_3_0=null;
        Token lv_primarytyp_4_0=null;
        Token lv_construct_5_0=null;
        Token lv_primarytyp_6_0=null;
        Token lv_construct_7_0=null;
        Token lv_primarytyp_8_0=null;
        Token lv_construct_9_0=null;
        Token lv_primarytyp_10_0=null;
        Token lv_construct_11_0=null;
        Token lv_primarytyp_12_0=null;
        Token lv_construct_13_0=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2814:28: ( ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2815:1: ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2815:1: ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt29=1;
                }
                break;
            case 64:
                {
                alt29=2;
                }
                break;
            case 65:
                {
                alt29=3;
                }
                break;
            case 66:
                {
                alt29=4;
                }
                break;
            case 67:
                {
                alt29=5;
                }
                break;
            case 68:
                {
                alt29=6;
                }
                break;
            case 69:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2815:2: ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2815:2: ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2815:3: ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2815:3: ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2816:1: (lv_primarytyp_0_0= 'COLLECTIONLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2816:1: (lv_primarytyp_0_0= 'COLLECTIONLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2817:3: lv_primarytyp_0_0= 'COLLECTIONLITERAL'
                    {
                    lv_primarytyp_0_0=(Token)match(input,63,FOLLOW_63_in_ruleLiteralInner5029); 

                            newLeafNode(lv_primarytyp_0_0, grammarAccess.getLiteralInnerAccess().getPrimarytypCOLLECTIONLITERALKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_0_0, "COLLECTIONLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2830:2: ( (lv_construct_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2831:1: (lv_construct_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2831:1: (lv_construct_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2832:3: lv_construct_1_0= RULE_ID
                    {
                    lv_construct_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5059); 

                    			newLeafNode(lv_construct_1_0, grammarAccess.getLiteralInnerAccess().getConstructIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2849:6: ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2849:6: ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2849:7: ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2849:7: ( (lv_primarytyp_2_0= 'CLOSURE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2850:1: (lv_primarytyp_2_0= 'CLOSURE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2850:1: (lv_primarytyp_2_0= 'CLOSURE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2851:3: lv_primarytyp_2_0= 'CLOSURE'
                    {
                    lv_primarytyp_2_0=(Token)match(input,64,FOLLOW_64_in_ruleLiteralInner5090); 

                            newLeafNode(lv_primarytyp_2_0, grammarAccess.getLiteralInnerAccess().getPrimarytypCLOSUREKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_2_0, "CLOSURE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2864:2: ( (lv_construct_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2865:1: (lv_construct_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2865:1: (lv_construct_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2866:3: lv_construct_3_0= RULE_ID
                    {
                    lv_construct_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5120); 

                    			newLeafNode(lv_construct_3_0, grammarAccess.getLiteralInnerAccess().getConstructIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2883:6: ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2883:6: ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2883:7: ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2883:7: ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2884:1: (lv_primarytyp_4_0= 'BOOLEANLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2884:1: (lv_primarytyp_4_0= 'BOOLEANLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2885:3: lv_primarytyp_4_0= 'BOOLEANLITERAL'
                    {
                    lv_primarytyp_4_0=(Token)match(input,65,FOLLOW_65_in_ruleLiteralInner5151); 

                            newLeafNode(lv_primarytyp_4_0, grammarAccess.getLiteralInnerAccess().getPrimarytypBOOLEANLITERALKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_4_0, "BOOLEANLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2898:2: ( (lv_construct_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2899:1: (lv_construct_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2899:1: (lv_construct_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2900:3: lv_construct_5_0= RULE_ID
                    {
                    lv_construct_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5181); 

                    			newLeafNode(lv_construct_5_0, grammarAccess.getLiteralInnerAccess().getConstructIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2917:6: ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2917:6: ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2917:7: ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2917:7: ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2918:1: (lv_primarytyp_6_0= 'NUMBERLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2918:1: (lv_primarytyp_6_0= 'NUMBERLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2919:3: lv_primarytyp_6_0= 'NUMBERLITERAL'
                    {
                    lv_primarytyp_6_0=(Token)match(input,66,FOLLOW_66_in_ruleLiteralInner5212); 

                            newLeafNode(lv_primarytyp_6_0, grammarAccess.getLiteralInnerAccess().getPrimarytypNUMBERLITERALKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_6_0, "NUMBERLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2932:2: ( (lv_construct_7_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2933:1: (lv_construct_7_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2933:1: (lv_construct_7_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2934:3: lv_construct_7_0= RULE_ID
                    {
                    lv_construct_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5242); 

                    			newLeafNode(lv_construct_7_0, grammarAccess.getLiteralInnerAccess().getConstructIDTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2951:6: ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2951:6: ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2951:7: ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2951:7: ( (lv_primarytyp_8_0= 'NULLLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2952:1: (lv_primarytyp_8_0= 'NULLLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2952:1: (lv_primarytyp_8_0= 'NULLLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2953:3: lv_primarytyp_8_0= 'NULLLITERAL'
                    {
                    lv_primarytyp_8_0=(Token)match(input,67,FOLLOW_67_in_ruleLiteralInner5273); 

                            newLeafNode(lv_primarytyp_8_0, grammarAccess.getLiteralInnerAccess().getPrimarytypNULLLITERALKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_8_0, "NULLLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2966:2: ( (lv_construct_9_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2967:1: (lv_construct_9_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2967:1: (lv_construct_9_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2968:3: lv_construct_9_0= RULE_ID
                    {
                    lv_construct_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5303); 

                    			newLeafNode(lv_construct_9_0, grammarAccess.getLiteralInnerAccess().getConstructIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_9_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2985:6: ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2985:6: ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2985:7: ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2985:7: ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2986:1: (lv_primarytyp_10_0= 'STRINGLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2986:1: (lv_primarytyp_10_0= 'STRINGLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2987:3: lv_primarytyp_10_0= 'STRINGLITERAL'
                    {
                    lv_primarytyp_10_0=(Token)match(input,68,FOLLOW_68_in_ruleLiteralInner5334); 

                            newLeafNode(lv_primarytyp_10_0, grammarAccess.getLiteralInnerAccess().getPrimarytypSTRINGLITERALKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_10_0, "STRINGLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3000:2: ( (lv_construct_11_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3001:1: (lv_construct_11_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3001:1: (lv_construct_11_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3002:3: lv_construct_11_0= RULE_ID
                    {
                    lv_construct_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5364); 

                    			newLeafNode(lv_construct_11_0, grammarAccess.getLiteralInnerAccess().getConstructIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_11_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3019:6: ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3019:6: ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3019:7: ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3019:7: ( (lv_primarytyp_12_0= 'TYPELITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3020:1: (lv_primarytyp_12_0= 'TYPELITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3020:1: (lv_primarytyp_12_0= 'TYPELITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3021:3: lv_primarytyp_12_0= 'TYPELITERAL'
                    {
                    lv_primarytyp_12_0=(Token)match(input,69,FOLLOW_69_in_ruleLiteralInner5395); 

                            newLeafNode(lv_primarytyp_12_0, grammarAccess.getLiteralInnerAccess().getPrimarytypTYPELITERALKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_12_0, "TYPELITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3034:2: ( (lv_construct_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3035:1: (lv_construct_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3035:1: (lv_construct_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3036:3: lv_construct_13_0= RULE_ID
                    {
                    lv_construct_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5425); 

                    			newLeafNode(lv_construct_13_0, grammarAccess.getLiteralInnerAccess().getConstructIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"construct",
                            		lv_construct_13_0, 
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
    // $ANTLR end "ruleLiteralInner"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_ruleModel131 = new BitSet(new long[]{0x4000400002040802L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleModel158 = new BitSet(new long[]{0x4000400002040802L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleModel185 = new BitSet(new long[]{0x4000400002040802L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleModel212 = new BitSet(new long[]{0x4000400002040802L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel239 = new BitSet(new long[]{0x4000400002040802L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClassType323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassType340 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_12_in_ruleClassType364 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_13_in_ruleClassType396 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleClassType417 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_14_in_ruleClassType437 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleClassType458 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_15_in_ruleClassType478 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleClassType498 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_17_in_ruleClassType527 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProcedure629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure646 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_13_in_ruleProcedure665 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleProcedure686 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_14_in_ruleProcedure706 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_ruleMultID_in_ruleProcedure727 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_19_in_ruleProcedure747 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_20_in_ruleProcedure767 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_21_in_ruleProcedure796 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_22_in_ruleProcedure825 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_23_in_ruleProcedure854 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_24_in_ruleProcedure883 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleExpression985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1002 = new BitSet(new long[]{0x0000000FE4016002L});
    public static final BitSet FOLLOW_rulePrecedence_in_ruleExpression1028 = new BitSet(new long[]{0x0000000FE4016002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrecedence1119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1149 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulePrecedence1167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrecedence1217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1247 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1291 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrecedence1358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1411 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1447 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrecedence1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1552 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1588 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1632 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrecedence1699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1752 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1788 = new BitSet(new long[]{0x00000FF000000000L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_rulePrecedence1814 = new BitSet(new long[]{0x00000FF000000002L});
    public static final BitSet FOLLOW_31_in_rulePrecedence1841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1893 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrecedence2050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrecedence2133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrecedence2216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrecedence2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2352 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence2369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2388 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2432 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence2449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence2510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerPrecedence2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInnerPrecedence2564 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence2598 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2616 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInnerPrecedence2633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInnerPrecedence2683 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInnerPrecedence2743 = new BitSet(new long[]{0x0000100004000020L});
    public static final BitSet FOLLOW_26_in_ruleInnerPrecedence2775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2805 = new BitSet(new long[]{0x0000100008000020L});
    public static final BitSet FOLLOW_27_in_ruleInnerPrecedence2823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2840 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence2870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2888 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInnerPrecedence2905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInnerPrecedence2955 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence2989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInnerPrecedence3037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInnerPrecedence3120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInnerPrecedence3203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInnerPrecedence3286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_entryRuleMultID3380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultID3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultID3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultID3466 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultID3483 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_45_in_ruleMultID3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString3539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultString3625 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString3642 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_45_in_ruleMultString3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePrimary3745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary3762 = new BitSet(new long[]{0x3FFF800000000002L});
    public static final BitSet FOLLOW_rulePrimaryInner_in_rulePrimary3788 = new BitSet(new long[]{0x3FFF800000000002L});
    public static final BitSet FOLLOW_rulePrimaryInner_in_entryRulePrimaryInner3825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryInner3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePrimaryInner3879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePrimaryInner3940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePrimaryInner4001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePrimaryInner4084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePrimaryInner4145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4175 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrimaryInner4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimaryInner4227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimaryInner4288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePrimaryInner4349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePrimaryInner4410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePrimaryInner4471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePrimaryInner4532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryInner4593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryInner4654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryInner4715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimaryInner4776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral4848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLiteral4895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral4912 = new BitSet(new long[]{0x8000000000000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleLiteralInner_in_ruleLiteral4938 = new BitSet(new long[]{0x8000000000000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleLiteralInner_in_entryRuleLiteralInner4975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInner4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLiteralInner5029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleLiteralInner5090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLiteralInner5151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleLiteralInner5212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleLiteralInner5273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLiteralInner5334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleLiteralInner5395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5425 = new BitSet(new long[]{0x0000000000000002L});

}