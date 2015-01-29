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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CLASS'", "'NOCLASS'", "'PREFIX'", "'SUFFIX'", "'BLOCKING'", "'BRACES'", "'INDENT'", "'PROCEDURE'", "'TYPES'", "'COLONSEPERATED'", "'SPACESEPERATED'", "'INHEADER'", "'INFERRED'", "'UNTYPED'", "'EXPRESSION'", "'CALLER'", "'.'", "'='", "'INFIX'", "'INFIXLEFT'", "'OUTER'", "'BRACKET'", "'PARENTHESIS'", "'ANGLE'", "'MEMBERFEATURE'", "'INNERPREFIX'", "'INNERSUFFIX'", "'INNERINFIX'", "'INNERINFIXLEFT'", "'INNERBRACKET'", "'INNERBRACES'", "'INNERPARENTHESIS'", "'INNERANGLE'", "'=>'", "'('", "'|'", "')'", "'PRIMARY'", "'CONSTRUCTOR'", "'BLOCK'", "'SWITCH'", "'SYNCHRONIZED'", "'FEATURECALL'", "'IFEXPRESSION'", "'FOREXPRESSION'", "'BASICFORLOOPEXPRESSION'", "'WHILEEXPRESSION'", "'DOWHILEEXPRESSION'", "'THROWEXPRESSION'", "'RETURNEXPRESSION'", "'TRYCATCHFINALYEXPRESSION'", "'PARENTHESIZEDEXPRESSION'", "'LITERALEXPRESSION'", "'LITERAL'", "'COLLECTIONLITERAL'", "'CLOSURE'", "'BOOLEANLITERAL'", "'NUMBERLITERAL'", "'NULLLITERAL'", "'STRINGLITERAL'", "'TYPELITERAL'"
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
    public static final int T__70=70;
    public static final int T__71=71;
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
                case 48:
                    {
                    alt1=3;
                    }
                    break;
                case 64:
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:191:1: ruleClassType returns [EObject current=null] : (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:194:28: ( (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:195:1: (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:195:1: (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:195:3: otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )*
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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:217:2: ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )*
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:233:6: (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:233:6: (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:233:8: otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleClassType396); 

            	        	newLeafNode(otherlv_3, grammarAccess.getClassTypeAccess().getPREFIXKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:237:1: ( (lv_prefix_4_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:238:1: (lv_prefix_4_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:238:1: (lv_prefix_4_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:239:3: lv_prefix_4_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassTypeAccess().getPrefixMultStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleClassType417);
            	    lv_prefix_4_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prefix",
            	            		lv_prefix_4_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:256:6: (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:256:6: (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:256:8: otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleClassType437); 

            	        	newLeafNode(otherlv_5, grammarAccess.getClassTypeAccess().getSUFFIXKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:260:1: ( (lv_suffix_6_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:261:1: (lv_suffix_6_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:261:1: (lv_suffix_6_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:262:3: lv_suffix_6_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassTypeAccess().getSuffixMultStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleClassType458);
            	    lv_suffix_6_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassTypeRule());
            	    	        }
            	           		add(
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:330:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:333:28: ( (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:334:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:334:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:334:3: otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )*
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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:356:2: ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )*
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:356:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:356:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:356:5: otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleProcedure665); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getPREFIXKeyword_2_0_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:360:1: ( (lv_prefix_3_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:361:1: (lv_prefix_3_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:361:1: (lv_prefix_3_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:362:3: lv_prefix_3_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getPrefixMultStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleProcedure686);
            	    lv_prefix_3_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prefix",
            	            		lv_prefix_3_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:379:6: (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:379:6: (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:379:8: otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleProcedure706); 

            	        	newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getSUFFIXKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:383:1: ( (lv_suffix_5_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:384:1: (lv_suffix_5_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:384:1: (lv_suffix_5_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:385:3: lv_suffix_5_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getSuffixMultStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleProcedure727);
            	    lv_suffix_5_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"suffix",
            	            		lv_suffix_5_0, 
            	            		"MultString");
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:550:1: rulePrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INFIXLEFT' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_infix_30_0= ruleMultString ) ) ( ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '=' )? ( (lv_par2_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'OUTER' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '=' )? ( (lv_par1_38_0= RULE_ID ) ) ( (lv_inner_39_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_40_0= 'BRACKET' ) ) ( (lv_rule_41_0= RULE_ID ) ) ( (lv_bracket_42_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_43_0= 'BRACES' ) ) ( (lv_rule_44_0= RULE_ID ) ) ( (lv_braces_45_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_46_0= 'PARENTHESIS' ) ) ( (lv_rule_47_0= RULE_ID ) ) ( (lv_parenthesis_48_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_49_0= 'ANGLE' ) ) ( (lv_rule_50_0= RULE_ID ) ) ( (lv_angle_51_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_52_0= 'MEMBERFEATURE' ) ) ( (lv_rule_53_0= RULE_ID ) ) ( ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par1_56_0= RULE_ID ) ) ( (lv_infix_57_0= ruleMultString ) ) ( ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '=' )? ( (lv_par2_60_0= RULE_ID ) ) ) ) ;
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
        Token lv_feature2_31_0=null;
        Token otherlv_32=null;
        Token lv_par2_33_0=null;
        Token lv_ruletyp_34_0=null;
        Token lv_rule_35_0=null;
        Token lv_feature1_36_0=null;
        Token otherlv_37=null;
        Token lv_par1_38_0=null;
        Token lv_ruletyp_40_0=null;
        Token lv_rule_41_0=null;
        Token lv_bracket_42_0=null;
        Token lv_ruletyp_43_0=null;
        Token lv_rule_44_0=null;
        Token lv_braces_45_0=null;
        Token lv_ruletyp_46_0=null;
        Token lv_rule_47_0=null;
        Token lv_parenthesis_48_0=null;
        Token lv_ruletyp_49_0=null;
        Token lv_rule_50_0=null;
        Token lv_angle_51_0=null;
        Token lv_ruletyp_52_0=null;
        Token lv_rule_53_0=null;
        Token lv_feature1_54_0=null;
        Token otherlv_55=null;
        Token lv_par1_56_0=null;
        Token lv_feature2_58_0=null;
        Token otherlv_59=null;
        Token lv_par2_60_0=null;
        EObject lv_prefix_6_0 = null;

        EObject lv_suffix_15_0 = null;

        EObject lv_infix_21_0 = null;

        EObject lv_infix_30_0 = null;

        EObject lv_inner_39_0 = null;

        EObject lv_infix_57_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:553:28: ( ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INFIXLEFT' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_infix_30_0= ruleMultString ) ) ( ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '=' )? ( (lv_par2_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'OUTER' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '=' )? ( (lv_par1_38_0= RULE_ID ) ) ( (lv_inner_39_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_40_0= 'BRACKET' ) ) ( (lv_rule_41_0= RULE_ID ) ) ( (lv_bracket_42_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_43_0= 'BRACES' ) ) ( (lv_rule_44_0= RULE_ID ) ) ( (lv_braces_45_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_46_0= 'PARENTHESIS' ) ) ( (lv_rule_47_0= RULE_ID ) ) ( (lv_parenthesis_48_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_49_0= 'ANGLE' ) ) ( (lv_rule_50_0= RULE_ID ) ) ( (lv_angle_51_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_52_0= 'MEMBERFEATURE' ) ) ( (lv_rule_53_0= RULE_ID ) ) ( ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par1_56_0= RULE_ID ) ) ( (lv_infix_57_0= ruleMultString ) ) ( ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '=' )? ( (lv_par2_60_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INFIXLEFT' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_infix_30_0= ruleMultString ) ) ( ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '=' )? ( (lv_par2_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'OUTER' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '=' )? ( (lv_par1_38_0= RULE_ID ) ) ( (lv_inner_39_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_40_0= 'BRACKET' ) ) ( (lv_rule_41_0= RULE_ID ) ) ( (lv_bracket_42_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_43_0= 'BRACES' ) ) ( (lv_rule_44_0= RULE_ID ) ) ( (lv_braces_45_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_46_0= 'PARENTHESIS' ) ) ( (lv_rule_47_0= RULE_ID ) ) ( (lv_parenthesis_48_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_49_0= 'ANGLE' ) ) ( (lv_rule_50_0= RULE_ID ) ) ( (lv_angle_51_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_52_0= 'MEMBERFEATURE' ) ) ( (lv_rule_53_0= RULE_ID ) ) ( ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par1_56_0= RULE_ID ) ) ( (lv_infix_57_0= ruleMultString ) ) ( ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '=' )? ( (lv_par2_60_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'PREFIX' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_prefix_6_0= ruleMultString ) ) ( ( (lv_feature1_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_par1_9_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_10_0= 'SUFFIX' ) ) ( (lv_rule_11_0= RULE_ID ) ) ( ( (lv_feature1_12_0= RULE_ID ) ) otherlv_13= '=' )? ( (lv_par1_14_0= RULE_ID ) ) ( (lv_suffix_15_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_16_0= 'INFIX' ) ) ( (lv_rule_17_0= RULE_ID ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INFIXLEFT' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_infix_30_0= ruleMultString ) ) ( ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '=' )? ( (lv_par2_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'OUTER' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '=' )? ( (lv_par1_38_0= RULE_ID ) ) ( (lv_inner_39_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_40_0= 'BRACKET' ) ) ( (lv_rule_41_0= RULE_ID ) ) ( (lv_bracket_42_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_43_0= 'BRACES' ) ) ( (lv_rule_44_0= RULE_ID ) ) ( (lv_braces_45_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_46_0= 'PARENTHESIS' ) ) ( (lv_rule_47_0= RULE_ID ) ) ( (lv_parenthesis_48_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_49_0= 'ANGLE' ) ) ( (lv_rule_50_0= RULE_ID ) ) ( (lv_angle_51_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_52_0= 'MEMBERFEATURE' ) ) ( (lv_rule_53_0= RULE_ID ) ) ( ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par1_56_0= RULE_ID ) ) ( (lv_infix_57_0= ruleMultString ) ) ( ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '=' )? ( (lv_par2_60_0= RULE_ID ) ) ) )
            int alt18=11;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 13:
                {
                alt18=2;
                }
                break;
            case 14:
                {
                alt18=3;
                }
                break;
            case 29:
                {
                alt18=4;
                }
                break;
            case 30:
                {
                alt18=5;
                }
                break;
            case 31:
                {
                alt18=6;
                }
                break;
            case 32:
                {
                alt18=7;
                }
                break;
            case 16:
                {
                alt18=8;
                }
                break;
            case 33:
                {
                alt18=9;
                }
                break;
            case 34:
                {
                alt18=10;
                }
                break;
            case 35:
                {
                alt18=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:6: ( ( (lv_ruletyp_25_0= 'INFIXLEFT' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_infix_30_0= ruleMultString ) ) ( ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '=' )? ( (lv_par2_33_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:6: ( ( (lv_ruletyp_25_0= 'INFIXLEFT' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_infix_30_0= ruleMultString ) ) ( ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '=' )? ( (lv_par2_33_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:7: ( (lv_ruletyp_25_0= 'INFIXLEFT' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( ( (lv_feature1_27_0= RULE_ID ) ) otherlv_28= '=' )? ( (lv_par1_29_0= RULE_ID ) ) ( (lv_infix_30_0= ruleMultString ) ) ( ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '=' )? ( (lv_par2_33_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:7: ( (lv_ruletyp_25_0= 'INFIXLEFT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:927:1: (lv_ruletyp_25_0= 'INFIXLEFT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:927:1: (lv_ruletyp_25_0= 'INFIXLEFT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:928:3: lv_ruletyp_25_0= 'INFIXLEFT'
                    {
                    lv_ruletyp_25_0=(Token)match(input,30,FOLLOW_30_in_rulePrecedence1699); 

                            newLeafNode(lv_ruletyp_25_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_25_0, "INFIXLEFT");
                    	    

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:999:2: ( (lv_infix_30_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1000:1: (lv_infix_30_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1000:1: (lv_infix_30_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1001:3: lv_infix_30_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_4_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1814);
                    lv_infix_30_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_30_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1017:2: ( ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '=' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==28) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1017:3: ( (lv_feature2_31_0= RULE_ID ) ) otherlv_32= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1017:3: ( (lv_feature2_31_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1018:1: (lv_feature2_31_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1018:1: (lv_feature2_31_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1019:3: lv_feature2_31_0= RULE_ID
                            {
                            lv_feature2_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1832); 

                            			newLeafNode(lv_feature2_31_0, grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_4_5_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_31_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_32=(Token)match(input,28,FOLLOW_28_in_rulePrecedence1849); 

                                	newLeafNode(otherlv_32, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1039:3: ( (lv_par2_33_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1040:1: (lv_par2_33_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1040:1: (lv_par2_33_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1041:3: lv_par2_33_0= RULE_ID
                    {
                    lv_par2_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1868); 

                    			newLeafNode(lv_par2_33_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_4_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_33_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1058:6: ( ( (lv_ruletyp_34_0= 'OUTER' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '=' )? ( (lv_par1_38_0= RULE_ID ) ) ( (lv_inner_39_0= ruleInnerPrecedence ) )+ )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1058:6: ( ( (lv_ruletyp_34_0= 'OUTER' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '=' )? ( (lv_par1_38_0= RULE_ID ) ) ( (lv_inner_39_0= ruleInnerPrecedence ) )+ )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1058:7: ( (lv_ruletyp_34_0= 'OUTER' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '=' )? ( (lv_par1_38_0= RULE_ID ) ) ( (lv_inner_39_0= ruleInnerPrecedence ) )+
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1058:7: ( (lv_ruletyp_34_0= 'OUTER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1059:1: (lv_ruletyp_34_0= 'OUTER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1059:1: (lv_ruletyp_34_0= 'OUTER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1060:3: lv_ruletyp_34_0= 'OUTER'
                    {
                    lv_ruletyp_34_0=(Token)match(input,31,FOLLOW_31_in_rulePrecedence1899); 

                            newLeafNode(lv_ruletyp_34_0, grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_34_0, "OUTER");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1073:2: ( (lv_rule_35_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1074:1: (lv_rule_35_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1074:1: (lv_rule_35_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1075:3: lv_rule_35_0= RULE_ID
                    {
                    lv_rule_35_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1929); 

                    			newLeafNode(lv_rule_35_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_35_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1091:2: ( ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1091:3: ( (lv_feature1_36_0= RULE_ID ) ) otherlv_37= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1091:3: ( (lv_feature1_36_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1092:1: (lv_feature1_36_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1092:1: (lv_feature1_36_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1093:3: lv_feature1_36_0= RULE_ID
                            {
                            lv_feature1_36_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1952); 

                            			newLeafNode(lv_feature1_36_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_5_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_36_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_37=(Token)match(input,28,FOLLOW_28_in_rulePrecedence1969); 

                                	newLeafNode(otherlv_37, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_5_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1113:3: ( (lv_par1_38_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1114:1: (lv_par1_38_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1114:1: (lv_par1_38_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1115:3: lv_par1_38_0= RULE_ID
                    {
                    lv_par1_38_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1988); 

                    			newLeafNode(lv_par1_38_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_38_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1131:2: ( (lv_inner_39_0= ruleInnerPrecedence ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=36 && LA15_0<=43)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1132:1: (lv_inner_39_0= ruleInnerPrecedence )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1132:1: (lv_inner_39_0= ruleInnerPrecedence )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1133:3: lv_inner_39_0= ruleInnerPrecedence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInnerInnerPrecedenceParserRuleCall_5_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInnerPrecedence_in_rulePrecedence2014);
                    	    lv_inner_39_0=ruleInnerPrecedence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inner",
                    	            		lv_inner_39_0, 
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
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1150:6: ( ( (lv_ruletyp_40_0= 'BRACKET' ) ) ( (lv_rule_41_0= RULE_ID ) ) ( (lv_bracket_42_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1150:6: ( ( (lv_ruletyp_40_0= 'BRACKET' ) ) ( (lv_rule_41_0= RULE_ID ) ) ( (lv_bracket_42_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1150:7: ( (lv_ruletyp_40_0= 'BRACKET' ) ) ( (lv_rule_41_0= RULE_ID ) ) ( (lv_bracket_42_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1150:7: ( (lv_ruletyp_40_0= 'BRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1151:1: (lv_ruletyp_40_0= 'BRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1151:1: (lv_ruletyp_40_0= 'BRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1152:3: lv_ruletyp_40_0= 'BRACKET'
                    {
                    lv_ruletyp_40_0=(Token)match(input,32,FOLLOW_32_in_rulePrecedence2041); 

                            newLeafNode(lv_ruletyp_40_0, grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_40_0, "BRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1165:2: ( (lv_rule_41_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1166:1: (lv_rule_41_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1166:1: (lv_rule_41_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1167:3: lv_rule_41_0= RULE_ID
                    {
                    lv_rule_41_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2071); 

                    			newLeafNode(lv_rule_41_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_41_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1183:2: ( (lv_bracket_42_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1184:1: (lv_bracket_42_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1184:1: (lv_bracket_42_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1185:3: lv_bracket_42_0= RULE_ID
                    {
                    lv_bracket_42_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2093); 

                    			newLeafNode(lv_bracket_42_0, grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bracket",
                            		lv_bracket_42_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1202:6: ( ( (lv_ruletyp_43_0= 'BRACES' ) ) ( (lv_rule_44_0= RULE_ID ) ) ( (lv_braces_45_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1202:6: ( ( (lv_ruletyp_43_0= 'BRACES' ) ) ( (lv_rule_44_0= RULE_ID ) ) ( (lv_braces_45_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1202:7: ( (lv_ruletyp_43_0= 'BRACES' ) ) ( (lv_rule_44_0= RULE_ID ) ) ( (lv_braces_45_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1202:7: ( (lv_ruletyp_43_0= 'BRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1203:1: (lv_ruletyp_43_0= 'BRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1203:1: (lv_ruletyp_43_0= 'BRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1204:3: lv_ruletyp_43_0= 'BRACES'
                    {
                    lv_ruletyp_43_0=(Token)match(input,16,FOLLOW_16_in_rulePrecedence2124); 

                            newLeafNode(lv_ruletyp_43_0, grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_43_0, "BRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1217:2: ( (lv_rule_44_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1218:1: (lv_rule_44_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1218:1: (lv_rule_44_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1219:3: lv_rule_44_0= RULE_ID
                    {
                    lv_rule_44_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2154); 

                    			newLeafNode(lv_rule_44_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_44_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1235:2: ( (lv_braces_45_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1236:1: (lv_braces_45_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1236:1: (lv_braces_45_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1237:3: lv_braces_45_0= RULE_ID
                    {
                    lv_braces_45_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2176); 

                    			newLeafNode(lv_braces_45_0, grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"braces",
                            		lv_braces_45_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1254:6: ( ( (lv_ruletyp_46_0= 'PARENTHESIS' ) ) ( (lv_rule_47_0= RULE_ID ) ) ( (lv_parenthesis_48_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1254:6: ( ( (lv_ruletyp_46_0= 'PARENTHESIS' ) ) ( (lv_rule_47_0= RULE_ID ) ) ( (lv_parenthesis_48_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1254:7: ( (lv_ruletyp_46_0= 'PARENTHESIS' ) ) ( (lv_rule_47_0= RULE_ID ) ) ( (lv_parenthesis_48_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1254:7: ( (lv_ruletyp_46_0= 'PARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1255:1: (lv_ruletyp_46_0= 'PARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1255:1: (lv_ruletyp_46_0= 'PARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1256:3: lv_ruletyp_46_0= 'PARENTHESIS'
                    {
                    lv_ruletyp_46_0=(Token)match(input,33,FOLLOW_33_in_rulePrecedence2207); 

                            newLeafNode(lv_ruletyp_46_0, grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_46_0, "PARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1269:2: ( (lv_rule_47_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1270:1: (lv_rule_47_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1270:1: (lv_rule_47_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1271:3: lv_rule_47_0= RULE_ID
                    {
                    lv_rule_47_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2237); 

                    			newLeafNode(lv_rule_47_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_47_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1287:2: ( (lv_parenthesis_48_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1288:1: (lv_parenthesis_48_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1288:1: (lv_parenthesis_48_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1289:3: lv_parenthesis_48_0= RULE_ID
                    {
                    lv_parenthesis_48_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2259); 

                    			newLeafNode(lv_parenthesis_48_0, grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parenthesis",
                            		lv_parenthesis_48_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1306:6: ( ( (lv_ruletyp_49_0= 'ANGLE' ) ) ( (lv_rule_50_0= RULE_ID ) ) ( (lv_angle_51_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1306:6: ( ( (lv_ruletyp_49_0= 'ANGLE' ) ) ( (lv_rule_50_0= RULE_ID ) ) ( (lv_angle_51_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1306:7: ( (lv_ruletyp_49_0= 'ANGLE' ) ) ( (lv_rule_50_0= RULE_ID ) ) ( (lv_angle_51_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1306:7: ( (lv_ruletyp_49_0= 'ANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1307:1: (lv_ruletyp_49_0= 'ANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1307:1: (lv_ruletyp_49_0= 'ANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1308:3: lv_ruletyp_49_0= 'ANGLE'
                    {
                    lv_ruletyp_49_0=(Token)match(input,34,FOLLOW_34_in_rulePrecedence2290); 

                            newLeafNode(lv_ruletyp_49_0, grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_49_0, "ANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1321:2: ( (lv_rule_50_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1322:1: (lv_rule_50_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1322:1: (lv_rule_50_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1323:3: lv_rule_50_0= RULE_ID
                    {
                    lv_rule_50_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2320); 

                    			newLeafNode(lv_rule_50_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_50_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1339:2: ( (lv_angle_51_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1340:1: (lv_angle_51_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1340:1: (lv_angle_51_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1341:3: lv_angle_51_0= RULE_ID
                    {
                    lv_angle_51_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2342); 

                    			newLeafNode(lv_angle_51_0, grammarAccess.getPrecedenceAccess().getAngleIDTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"angle",
                            		lv_angle_51_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1358:6: ( ( (lv_ruletyp_52_0= 'MEMBERFEATURE' ) ) ( (lv_rule_53_0= RULE_ID ) ) ( ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par1_56_0= RULE_ID ) ) ( (lv_infix_57_0= ruleMultString ) ) ( ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '=' )? ( (lv_par2_60_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1358:6: ( ( (lv_ruletyp_52_0= 'MEMBERFEATURE' ) ) ( (lv_rule_53_0= RULE_ID ) ) ( ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par1_56_0= RULE_ID ) ) ( (lv_infix_57_0= ruleMultString ) ) ( ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '=' )? ( (lv_par2_60_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1358:7: ( (lv_ruletyp_52_0= 'MEMBERFEATURE' ) ) ( (lv_rule_53_0= RULE_ID ) ) ( ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '=' )? ( (lv_par1_56_0= RULE_ID ) ) ( (lv_infix_57_0= ruleMultString ) ) ( ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '=' )? ( (lv_par2_60_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1358:7: ( (lv_ruletyp_52_0= 'MEMBERFEATURE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1359:1: (lv_ruletyp_52_0= 'MEMBERFEATURE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1359:1: (lv_ruletyp_52_0= 'MEMBERFEATURE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1360:3: lv_ruletyp_52_0= 'MEMBERFEATURE'
                    {
                    lv_ruletyp_52_0=(Token)match(input,35,FOLLOW_35_in_rulePrecedence2373); 

                            newLeafNode(lv_ruletyp_52_0, grammarAccess.getPrecedenceAccess().getRuletypMEMBERFEATUREKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_52_0, "MEMBERFEATURE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1373:2: ( (lv_rule_53_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1374:1: (lv_rule_53_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1374:1: (lv_rule_53_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1375:3: lv_rule_53_0= RULE_ID
                    {
                    lv_rule_53_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2403); 

                    			newLeafNode(lv_rule_53_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_53_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1391:2: ( ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '=' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==28) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1391:3: ( (lv_feature1_54_0= RULE_ID ) ) otherlv_55= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1391:3: ( (lv_feature1_54_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1392:1: (lv_feature1_54_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1392:1: (lv_feature1_54_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1393:3: lv_feature1_54_0= RULE_ID
                            {
                            lv_feature1_54_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2426); 

                            			newLeafNode(lv_feature1_54_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_10_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_54_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_55=(Token)match(input,28,FOLLOW_28_in_rulePrecedence2443); 

                                	newLeafNode(otherlv_55, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_10_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1413:3: ( (lv_par1_56_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1414:1: (lv_par1_56_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1414:1: (lv_par1_56_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1415:3: lv_par1_56_0= RULE_ID
                    {
                    lv_par1_56_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2462); 

                    			newLeafNode(lv_par1_56_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_10_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_56_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1431:2: ( (lv_infix_57_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1432:1: (lv_infix_57_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1432:1: (lv_infix_57_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1433:3: lv_infix_57_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_10_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2488);
                    lv_infix_57_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_57_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1449:2: ( ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1449:3: ( (lv_feature2_58_0= RULE_ID ) ) otherlv_59= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1449:3: ( (lv_feature2_58_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1450:1: (lv_feature2_58_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1450:1: (lv_feature2_58_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1451:3: lv_feature2_58_0= RULE_ID
                            {
                            lv_feature2_58_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2506); 

                            			newLeafNode(lv_feature2_58_0, grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_10_5_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_58_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_59=(Token)match(input,28,FOLLOW_28_in_rulePrecedence2523); 

                                	newLeafNode(otherlv_59, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_10_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1471:3: ( (lv_par2_60_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1472:1: (lv_par2_60_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1472:1: (lv_par2_60_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1473:3: lv_par2_60_0= RULE_ID
                    {
                    lv_par2_60_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2542); 

                    			newLeafNode(lv_par2_60_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_10_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_60_0, 
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1497:1: entryRuleInnerPrecedence returns [EObject current=null] : iv_ruleInnerPrecedence= ruleInnerPrecedence EOF ;
    public final EObject entryRuleInnerPrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerPrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1498:2: (iv_ruleInnerPrecedence= ruleInnerPrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1499:2: iv_ruleInnerPrecedence= ruleInnerPrecedence EOF
            {
             newCompositeNode(grammarAccess.getInnerPrecedenceRule()); 
            pushFollow(FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence2584);
            iv_ruleInnerPrecedence=ruleInnerPrecedence();

            state._fsp--;

             current =iv_ruleInnerPrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerPrecedence2594); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1506:1: ruleInnerPrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )? )? ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'INNERANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) ) ;
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
        Token lv_mod_17_0=null;
        Token lv_rule_18_0=null;
        Token otherlv_19=null;
        Token lv_feature1_20_0=null;
        Token lv_feature2_22_0=null;
        Token otherlv_23=null;
        Token lv_par2_24_0=null;
        Token lv_ruletyp_25_0=null;
        Token lv_rule_26_0=null;
        Token lv_bracket_27_0=null;
        Token lv_ruletyp_28_0=null;
        Token lv_rule_29_0=null;
        Token lv_braces_30_0=null;
        Token lv_ruletyp_31_0=null;
        Token lv_rule_32_0=null;
        Token lv_parenthesis_33_0=null;
        Token lv_ruletyp_34_0=null;
        Token lv_rule_35_0=null;
        Token lv_angle_36_0=null;
        EObject lv_prefix_1_0 = null;

        EObject lv_suffix_6_0 = null;

        EObject lv_infix_12_0 = null;

        EObject lv_infix_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1509:28: ( ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )? )? ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'INNERANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1510:1: ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )? )? ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'INNERANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1510:1: ( ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )? )? ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'INNERBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INNERBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'INNERANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) )
            int alt26=8;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt26=1;
                }
                break;
            case 37:
                {
                alt26=2;
                }
                break;
            case 38:
                {
                alt26=3;
                }
                break;
            case 39:
                {
                alt26=4;
                }
                break;
            case 40:
                {
                alt26=5;
                }
                break;
            case 41:
                {
                alt26=6;
                }
                break;
            case 42:
                {
                alt26=7;
                }
                break;
            case 43:
                {
                alt26=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1510:2: ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1510:2: ( ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1510:3: ( (lv_ruletyp_0_0= 'INNERPREFIX' ) ) ( (lv_prefix_1_0= ruleMultString ) ) ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )? ( (lv_par2_4_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1510:3: ( (lv_ruletyp_0_0= 'INNERPREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1511:1: (lv_ruletyp_0_0= 'INNERPREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1511:1: (lv_ruletyp_0_0= 'INNERPREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1512:3: lv_ruletyp_0_0= 'INNERPREFIX'
                    {
                    lv_ruletyp_0_0=(Token)match(input,36,FOLLOW_36_in_ruleInnerPrecedence2638); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "INNERPREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1525:2: ( (lv_prefix_1_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1526:1: (lv_prefix_1_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1526:1: (lv_prefix_1_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1527:3: lv_prefix_1_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getPrefixMultStringParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence2672);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1543:2: ( ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '=' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==28) ) {
                            alt19=1;
                        }
                    }
                    switch (alt19) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1543:3: ( (lv_feature1_2_0= RULE_ID ) ) otherlv_3= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1543:3: ( (lv_feature1_2_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1544:1: (lv_feature1_2_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1544:1: (lv_feature1_2_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1545:3: lv_feature1_2_0= RULE_ID
                            {
                            lv_feature1_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2690); 

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

                            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleInnerPrecedence2707); 

                                	newLeafNode(otherlv_3, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_0_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1565:3: ( (lv_par2_4_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1566:1: (lv_par2_4_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1566:1: (lv_par2_4_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1567:3: lv_par2_4_0= RULE_ID
                    {
                    lv_par2_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2726); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1584:6: ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1584:6: ( ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1584:7: ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) ) ( (lv_suffix_6_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1584:7: ( (lv_ruletyp_5_0= 'INNERSUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1585:1: (lv_ruletyp_5_0= 'INNERSUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1585:1: (lv_ruletyp_5_0= 'INNERSUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1586:3: lv_ruletyp_5_0= 'INNERSUFFIX'
                    {
                    lv_ruletyp_5_0=(Token)match(input,37,FOLLOW_37_in_ruleInnerPrecedence2757); 

                            newLeafNode(lv_ruletyp_5_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_5_0, "INNERSUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1599:2: ( (lv_suffix_6_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1600:1: (lv_suffix_6_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1600:1: (lv_suffix_6_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1601:3: lv_suffix_6_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getSuffixMultStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence2791);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1618:6: ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1618:6: ( ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1618:7: ( (lv_ruletyp_7_0= 'INNERINFIX' ) ) ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )? ( (lv_infix_12_0= ruleMultString ) ) ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )? ( (lv_par2_15_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1618:7: ( (lv_ruletyp_7_0= 'INNERINFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1619:1: (lv_ruletyp_7_0= 'INNERINFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1619:1: (lv_ruletyp_7_0= 'INNERINFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1620:3: lv_ruletyp_7_0= 'INNERINFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,38,FOLLOW_38_in_ruleInnerPrecedence2817); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "INNERINFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1633:2: ( ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )? )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==26) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1633:3: ( (lv_mod_8_0= 'CALLER' ) ) ( (lv_rule_9_0= RULE_ID ) ) (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )?
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1633:3: ( (lv_mod_8_0= 'CALLER' ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1634:1: (lv_mod_8_0= 'CALLER' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1634:1: (lv_mod_8_0= 'CALLER' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1635:3: lv_mod_8_0= 'CALLER'
                            {
                            lv_mod_8_0=(Token)match(input,26,FOLLOW_26_in_ruleInnerPrecedence2849); 

                                    newLeafNode(lv_mod_8_0, grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "mod", lv_mod_8_0, "CALLER");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1648:2: ( (lv_rule_9_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1649:1: (lv_rule_9_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1649:1: (lv_rule_9_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1650:3: lv_rule_9_0= RULE_ID
                            {
                            lv_rule_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2879); 

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

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1666:2: (otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) ) )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==27) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1666:4: otherlv_10= '.' ( (lv_feature1_11_0= RULE_ID ) )
                                    {
                                    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleInnerPrecedence2897); 

                                        	newLeafNode(otherlv_10, grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_2_1_2_0());
                                        
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1670:1: ( (lv_feature1_11_0= RULE_ID ) )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1671:1: (lv_feature1_11_0= RULE_ID )
                                    {
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1671:1: (lv_feature1_11_0= RULE_ID )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1672:3: lv_feature1_11_0= RULE_ID
                                    {
                                    lv_feature1_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2914); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1688:6: ( (lv_infix_12_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1689:1: (lv_infix_12_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1689:1: (lv_infix_12_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1690:3: lv_infix_12_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence2944);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1706:2: ( ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '=' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1==28) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1706:3: ( (lv_feature2_13_0= RULE_ID ) ) otherlv_14= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1706:3: ( (lv_feature2_13_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1707:1: (lv_feature2_13_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1707:1: (lv_feature2_13_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1708:3: lv_feature2_13_0= RULE_ID
                            {
                            lv_feature2_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2962); 

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

                            otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleInnerPrecedence2979); 

                                	newLeafNode(otherlv_14, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_2_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1728:3: ( (lv_par2_15_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1729:1: (lv_par2_15_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1729:1: (lv_par2_15_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1730:3: lv_par2_15_0= RULE_ID
                    {
                    lv_par2_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence2998); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1747:6: ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )? )? ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1747:6: ( ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )? )? ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1747:7: ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) ) ( ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )? )? ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1747:7: ( (lv_ruletyp_16_0= 'INNERINFIXLEFT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1748:1: (lv_ruletyp_16_0= 'INNERINFIXLEFT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1748:1: (lv_ruletyp_16_0= 'INNERINFIXLEFT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1749:3: lv_ruletyp_16_0= 'INNERINFIXLEFT'
                    {
                    lv_ruletyp_16_0=(Token)match(input,39,FOLLOW_39_in_ruleInnerPrecedence3029); 

                            newLeafNode(lv_ruletyp_16_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXLEFTKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_16_0, "INNERINFIXLEFT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1762:2: ( ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )? )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==26) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1762:3: ( (lv_mod_17_0= 'CALLER' ) ) ( (lv_rule_18_0= RULE_ID ) ) (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )?
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1762:3: ( (lv_mod_17_0= 'CALLER' ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1763:1: (lv_mod_17_0= 'CALLER' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1763:1: (lv_mod_17_0= 'CALLER' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1764:3: lv_mod_17_0= 'CALLER'
                            {
                            lv_mod_17_0=(Token)match(input,26,FOLLOW_26_in_ruleInnerPrecedence3061); 

                                    newLeafNode(lv_mod_17_0, grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_3_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "mod", lv_mod_17_0, "CALLER");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1777:2: ( (lv_rule_18_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1778:1: (lv_rule_18_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1778:1: (lv_rule_18_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1779:3: lv_rule_18_0= RULE_ID
                            {
                            lv_rule_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3091); 

                            			newLeafNode(lv_rule_18_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"rule",
                                    		lv_rule_18_0, 
                                    		"ID");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1795:2: (otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) ) )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==27) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1795:4: otherlv_19= '.' ( (lv_feature1_20_0= RULE_ID ) )
                                    {
                                    otherlv_19=(Token)match(input,27,FOLLOW_27_in_ruleInnerPrecedence3109); 

                                        	newLeafNode(otherlv_19, grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_3_1_2_0());
                                        
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1799:1: ( (lv_feature1_20_0= RULE_ID ) )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1800:1: (lv_feature1_20_0= RULE_ID )
                                    {
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1800:1: (lv_feature1_20_0= RULE_ID )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1801:3: lv_feature1_20_0= RULE_ID
                                    {
                                    lv_feature1_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3126); 

                                    			newLeafNode(lv_feature1_20_0, grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_3_1_2_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"feature1",
                                            		lv_feature1_20_0, 
                                            		"ID");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1817:6: ( (lv_infix_21_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1818:1: (lv_infix_21_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1818:1: (lv_infix_21_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1819:3: lv_infix_21_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence3156);
                    lv_infix_21_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_21_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1835:2: ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==28) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1835:3: ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1835:3: ( (lv_feature2_22_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1836:1: (lv_feature2_22_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1836:1: (lv_feature2_22_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1837:3: lv_feature2_22_0= RULE_ID
                            {
                            lv_feature2_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3174); 

                            			newLeafNode(lv_feature2_22_0, grammarAccess.getInnerPrecedenceAccess().getFeature2IDTerminalRuleCall_3_3_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_22_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_23=(Token)match(input,28,FOLLOW_28_in_ruleInnerPrecedence3191); 

                                	newLeafNode(otherlv_23, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_3_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1857:3: ( (lv_par2_24_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1858:1: (lv_par2_24_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1858:1: (lv_par2_24_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1859:3: lv_par2_24_0= RULE_ID
                    {
                    lv_par2_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3210); 

                    			newLeafNode(lv_par2_24_0, grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1876:6: ( ( (lv_ruletyp_25_0= 'INNERBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1876:6: ( ( (lv_ruletyp_25_0= 'INNERBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1876:7: ( (lv_ruletyp_25_0= 'INNERBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1876:7: ( (lv_ruletyp_25_0= 'INNERBRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1877:1: (lv_ruletyp_25_0= 'INNERBRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1877:1: (lv_ruletyp_25_0= 'INNERBRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1878:3: lv_ruletyp_25_0= 'INNERBRACKET'
                    {
                    lv_ruletyp_25_0=(Token)match(input,40,FOLLOW_40_in_ruleInnerPrecedence3241); 

                            newLeafNode(lv_ruletyp_25_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_25_0, "INNERBRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1891:2: ( (lv_rule_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1892:1: (lv_rule_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1892:1: (lv_rule_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1893:3: lv_rule_26_0= RULE_ID
                    {
                    lv_rule_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3271); 

                    			newLeafNode(lv_rule_26_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
                    		

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1909:2: ( (lv_bracket_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1910:1: (lv_bracket_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1910:1: (lv_bracket_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1911:3: lv_bracket_27_0= RULE_ID
                    {
                    lv_bracket_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3293); 

                    			newLeafNode(lv_bracket_27_0, grammarAccess.getInnerPrecedenceAccess().getBracketIDTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bracket",
                            		lv_bracket_27_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1928:6: ( ( (lv_ruletyp_28_0= 'INNERBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1928:6: ( ( (lv_ruletyp_28_0= 'INNERBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1928:7: ( (lv_ruletyp_28_0= 'INNERBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1928:7: ( (lv_ruletyp_28_0= 'INNERBRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1929:1: (lv_ruletyp_28_0= 'INNERBRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1929:1: (lv_ruletyp_28_0= 'INNERBRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1930:3: lv_ruletyp_28_0= 'INNERBRACES'
                    {
                    lv_ruletyp_28_0=(Token)match(input,41,FOLLOW_41_in_ruleInnerPrecedence3324); 

                            newLeafNode(lv_ruletyp_28_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_28_0, "INNERBRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1943:2: ( (lv_rule_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1944:1: (lv_rule_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1944:1: (lv_rule_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1945:3: lv_rule_29_0= RULE_ID
                    {
                    lv_rule_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3354); 

                    			newLeafNode(lv_rule_29_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
                    		

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1961:2: ( (lv_braces_30_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1962:1: (lv_braces_30_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1962:1: (lv_braces_30_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1963:3: lv_braces_30_0= RULE_ID
                    {
                    lv_braces_30_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3376); 

                    			newLeafNode(lv_braces_30_0, grammarAccess.getInnerPrecedenceAccess().getBracesIDTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"braces",
                            		lv_braces_30_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1980:6: ( ( (lv_ruletyp_31_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1980:6: ( ( (lv_ruletyp_31_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1980:7: ( (lv_ruletyp_31_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1980:7: ( (lv_ruletyp_31_0= 'INNERPARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1981:1: (lv_ruletyp_31_0= 'INNERPARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1981:1: (lv_ruletyp_31_0= 'INNERPARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1982:3: lv_ruletyp_31_0= 'INNERPARENTHESIS'
                    {
                    lv_ruletyp_31_0=(Token)match(input,42,FOLLOW_42_in_ruleInnerPrecedence3407); 

                            newLeafNode(lv_ruletyp_31_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_31_0, "INNERPARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1995:2: ( (lv_rule_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1996:1: (lv_rule_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1996:1: (lv_rule_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1997:3: lv_rule_32_0= RULE_ID
                    {
                    lv_rule_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3437); 

                    			newLeafNode(lv_rule_32_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_32_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2013:2: ( (lv_parenthesis_33_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2014:1: (lv_parenthesis_33_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2014:1: (lv_parenthesis_33_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2015:3: lv_parenthesis_33_0= RULE_ID
                    {
                    lv_parenthesis_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3459); 

                    			newLeafNode(lv_parenthesis_33_0, grammarAccess.getInnerPrecedenceAccess().getParenthesisIDTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parenthesis",
                            		lv_parenthesis_33_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2032:6: ( ( (lv_ruletyp_34_0= 'INNERANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2032:6: ( ( (lv_ruletyp_34_0= 'INNERANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2032:7: ( (lv_ruletyp_34_0= 'INNERANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2032:7: ( (lv_ruletyp_34_0= 'INNERANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2033:1: (lv_ruletyp_34_0= 'INNERANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2033:1: (lv_ruletyp_34_0= 'INNERANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2034:3: lv_ruletyp_34_0= 'INNERANGLE'
                    {
                    lv_ruletyp_34_0=(Token)match(input,43,FOLLOW_43_in_ruleInnerPrecedence3490); 

                            newLeafNode(lv_ruletyp_34_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_34_0, "INNERANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2047:2: ( (lv_rule_35_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2048:1: (lv_rule_35_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2048:1: (lv_rule_35_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2049:3: lv_rule_35_0= RULE_ID
                    {
                    lv_rule_35_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3520); 

                    			newLeafNode(lv_rule_35_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_35_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2065:2: ( (lv_angle_36_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2066:1: (lv_angle_36_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2066:1: (lv_angle_36_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2067:3: lv_angle_36_0= RULE_ID
                    {
                    lv_angle_36_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence3542); 

                    			newLeafNode(lv_angle_36_0, grammarAccess.getInnerPrecedenceAccess().getAngleIDTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"angle",
                            		lv_angle_36_0, 
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


    // $ANTLR start "entryRuleMultString"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2091:1: entryRuleMultString returns [EObject current=null] : iv_ruleMultString= ruleMultString EOF ;
    public final EObject entryRuleMultString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2092:2: (iv_ruleMultString= ruleMultString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2093:2: iv_ruleMultString= ruleMultString EOF
            {
             newCompositeNode(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString3584);
            iv_ruleMultString=ruleMultString();

            state._fsp--;

             current =iv_ruleMultString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString3594); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2100:1: ruleMultString returns [EObject current=null] : ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | ( (lv_mi_2_0= RULE_ID ) ) | ( ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')' ) ) ) ;
    public final EObject ruleMultString() throws RecognitionException {
        EObject current = null;

        Token lv_ms_1_0=null;
        Token lv_mi_2_0=null;
        Token lv_synpred_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_cs_5_0 = null;

        EObject lv_cs_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2103:28: ( ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | ( (lv_mi_2_0= RULE_ID ) ) | ( ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2104:1: ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | ( (lv_mi_2_0= RULE_ID ) ) | ( ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2104:1: ( () ( ( (lv_ms_1_0= RULE_STRING ) ) | ( (lv_mi_2_0= RULE_ID ) ) | ( ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2104:2: () ( ( (lv_ms_1_0= RULE_STRING ) ) | ( (lv_mi_2_0= RULE_ID ) ) | ( ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2104:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2105:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultStringAccess().getMultStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2110:2: ( ( (lv_ms_1_0= RULE_STRING ) ) | ( (lv_mi_2_0= RULE_ID ) ) | ( ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt29=1;
                }
                break;
            case RULE_ID:
                {
                alt29=2;
                }
                break;
            case 44:
            case 45:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2110:3: ( (lv_ms_1_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2110:3: ( (lv_ms_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2111:1: (lv_ms_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2111:1: (lv_ms_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2112:3: lv_ms_1_0= RULE_STRING
                    {
                    lv_ms_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString3646); 

                    			newLeafNode(lv_ms_1_0, grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultStringRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ms",
                            		lv_ms_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2129:6: ( (lv_mi_2_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2129:6: ( (lv_mi_2_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2130:1: (lv_mi_2_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2130:1: (lv_mi_2_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2131:3: lv_mi_2_0= RULE_ID
                    {
                    lv_mi_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultString3674); 

                    			newLeafNode(lv_mi_2_0, grammarAccess.getMultStringAccess().getMiIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultStringRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"mi",
                            		lv_mi_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2148:6: ( ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2148:6: ( ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2148:7: ( (lv_synpred_3_0= '=>' ) )? otherlv_4= '(' ( (lv_cs_5_0= ruleComboString ) ) (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )* otherlv_8= ')'
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2148:7: ( (lv_synpred_3_0= '=>' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==44) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2149:1: (lv_synpred_3_0= '=>' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2149:1: (lv_synpred_3_0= '=>' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2150:3: lv_synpred_3_0= '=>'
                            {
                            lv_synpred_3_0=(Token)match(input,44,FOLLOW_44_in_ruleMultString3704); 

                                    newLeafNode(lv_synpred_3_0, grammarAccess.getMultStringAccess().getSynpredEqualsSignGreaterThanSignKeyword_1_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultStringRule());
                            	        }
                                   		setWithLastConsumed(current, "synpred", lv_synpred_3_0, "=>");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleMultString3730); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultStringAccess().getLeftParenthesisKeyword_1_2_1());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2167:1: ( (lv_cs_5_0= ruleComboString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2168:1: (lv_cs_5_0= ruleComboString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2168:1: (lv_cs_5_0= ruleComboString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2169:3: lv_cs_5_0= ruleComboString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultStringAccess().getCsComboStringParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComboString_in_ruleMultString3751);
                    lv_cs_5_0=ruleComboString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultStringRule());
                    	        }
                           		add(
                           			current, 
                           			"cs",
                            		lv_cs_5_0, 
                            		"ComboString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2185:2: (otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==46) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2185:4: otherlv_6= '|' ( (lv_cs_7_0= ruleComboString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleMultString3764); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMultStringAccess().getVerticalLineKeyword_1_2_3_0());
                    	        
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2189:1: ( (lv_cs_7_0= ruleComboString ) )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2190:1: (lv_cs_7_0= ruleComboString )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2190:1: (lv_cs_7_0= ruleComboString )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2191:3: lv_cs_7_0= ruleComboString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultStringAccess().getCsComboStringParserRuleCall_1_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComboString_in_ruleMultString3785);
                    	    lv_cs_7_0=ruleComboString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultStringRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"cs",
                    	            		lv_cs_7_0, 
                    	            		"ComboString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleMultString3799); 

                        	newLeafNode(otherlv_8, grammarAccess.getMultStringAccess().getRightParenthesisKeyword_1_2_4());
                        

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


    // $ANTLR start "entryRuleComboString"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2219:1: entryRuleComboString returns [EObject current=null] : iv_ruleComboString= ruleComboString EOF ;
    public final EObject entryRuleComboString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2220:2: (iv_ruleComboString= ruleComboString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2221:2: iv_ruleComboString= ruleComboString EOF
            {
             newCompositeNode(grammarAccess.getComboStringRule()); 
            pushFollow(FOLLOW_ruleComboString_in_entryRuleComboString3837);
            iv_ruleComboString=ruleComboString();

            state._fsp--;

             current =iv_ruleComboString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboString3847); 

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
    // $ANTLR end "entryRuleComboString"


    // $ANTLR start "ruleComboString"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2228:1: ruleComboString returns [EObject current=null] : ( () ( (lv_inner_1_0= ruleMultString ) )* ) ;
    public final EObject ruleComboString() throws RecognitionException {
        EObject current = null;

        EObject lv_inner_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2231:28: ( ( () ( (lv_inner_1_0= ruleMultString ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2232:1: ( () ( (lv_inner_1_0= ruleMultString ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2232:1: ( () ( (lv_inner_1_0= ruleMultString ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2232:2: () ( (lv_inner_1_0= ruleMultString ) )*
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2232:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2233:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComboStringAccess().getComboStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2238:2: ( (lv_inner_1_0= ruleMultString ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_STRING)||(LA30_0>=44 && LA30_0<=45)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2239:1: (lv_inner_1_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2239:1: (lv_inner_1_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2240:3: lv_inner_1_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComboStringAccess().getInnerMultStringParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleComboString3902);
            	    lv_inner_1_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComboStringRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inner",
            	            		lv_inner_1_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleComboString"


    // $ANTLR start "entryRulePrimary"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2264:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2265:2: (iv_rulePrimary= rulePrimary EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2266:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3939);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3949); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2273:1: rulePrimary returns [EObject current=null] : (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2276:28: ( (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2277:1: (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2277:1: (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2277:3: otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulePrimary3986); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getPRIMARYKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2281:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2282:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2282:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2283:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary4003); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2299:2: ( (lv_inner_2_0= rulePrimaryInner ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=49 && LA31_0<=63)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2300:1: (lv_inner_2_0= rulePrimaryInner )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2300:1: (lv_inner_2_0= rulePrimaryInner )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2301:3: lv_inner_2_0= rulePrimaryInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrimaryAccess().getInnerPrimaryInnerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryInner_in_rulePrimary4029);
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
            	    break loop31;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2325:1: entryRulePrimaryInner returns [EObject current=null] : iv_rulePrimaryInner= rulePrimaryInner EOF ;
    public final EObject entryRulePrimaryInner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInner = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2326:2: (iv_rulePrimaryInner= rulePrimaryInner EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2327:2: iv_rulePrimaryInner= rulePrimaryInner EOF
            {
             newCompositeNode(grammarAccess.getPrimaryInnerRule()); 
            pushFollow(FOLLOW_rulePrimaryInner_in_entryRulePrimaryInner4066);
            iv_rulePrimaryInner=rulePrimaryInner();

            state._fsp--;

             current =iv_rulePrimaryInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryInner4076); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2334:1: rulePrimaryInner returns [EObject current=null] : ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2337:28: ( ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2338:1: ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2338:1: ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) )
            int alt32=15;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt32=1;
                }
                break;
            case 50:
                {
                alt32=2;
                }
                break;
            case 51:
                {
                alt32=3;
                }
                break;
            case 52:
                {
                alt32=4;
                }
                break;
            case 53:
                {
                alt32=5;
                }
                break;
            case 54:
                {
                alt32=6;
                }
                break;
            case 55:
                {
                alt32=7;
                }
                break;
            case 56:
                {
                alt32=8;
                }
                break;
            case 57:
                {
                alt32=9;
                }
                break;
            case 58:
                {
                alt32=10;
                }
                break;
            case 59:
                {
                alt32=11;
                }
                break;
            case 60:
                {
                alt32=12;
                }
                break;
            case 61:
                {
                alt32=13;
                }
                break;
            case 62:
                {
                alt32=14;
                }
                break;
            case 63:
                {
                alt32=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2338:2: ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2338:2: ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2338:3: ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2338:3: ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2339:1: (lv_primarytyp_0_0= 'CONSTRUCTOR' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2339:1: (lv_primarytyp_0_0= 'CONSTRUCTOR' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2340:3: lv_primarytyp_0_0= 'CONSTRUCTOR'
                    {
                    lv_primarytyp_0_0=(Token)match(input,49,FOLLOW_49_in_rulePrimaryInner4120); 

                            newLeafNode(lv_primarytyp_0_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypCONSTRUCTORKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_0_0, "CONSTRUCTOR");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2353:2: ( (lv_construct_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2354:1: (lv_construct_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2354:1: (lv_construct_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2355:3: lv_construct_1_0= RULE_ID
                    {
                    lv_construct_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4150); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2372:6: ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2372:6: ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2372:7: ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2372:7: ( (lv_primarytyp_2_0= 'BLOCK' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2373:1: (lv_primarytyp_2_0= 'BLOCK' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2373:1: (lv_primarytyp_2_0= 'BLOCK' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2374:3: lv_primarytyp_2_0= 'BLOCK'
                    {
                    lv_primarytyp_2_0=(Token)match(input,50,FOLLOW_50_in_rulePrimaryInner4181); 

                            newLeafNode(lv_primarytyp_2_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypBLOCKKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_2_0, "BLOCK");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2387:2: ( (lv_construct_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2388:1: (lv_construct_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2388:1: (lv_construct_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2389:3: lv_construct_3_0= RULE_ID
                    {
                    lv_construct_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4211); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2406:6: ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2406:6: ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2406:7: ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2406:7: ( (lv_primarytyp_4_0= 'SWITCH' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2407:1: (lv_primarytyp_4_0= 'SWITCH' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2407:1: (lv_primarytyp_4_0= 'SWITCH' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2408:3: lv_primarytyp_4_0= 'SWITCH'
                    {
                    lv_primarytyp_4_0=(Token)match(input,51,FOLLOW_51_in_rulePrimaryInner4242); 

                            newLeafNode(lv_primarytyp_4_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypSWITCHKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_4_0, "SWITCH");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2421:2: ( (lv_construct_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2422:1: (lv_construct_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2422:1: (lv_construct_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2423:3: lv_construct_5_0= RULE_ID
                    {
                    lv_construct_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4272); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2439:2: ( (lv_construct2_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2440:1: (lv_construct2_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2440:1: (lv_construct2_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2441:3: lv_construct2_6_0= RULE_ID
                    {
                    lv_construct2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4294); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2458:6: ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2458:6: ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2458:7: ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2458:7: ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2459:1: (lv_primarytyp_7_0= 'SYNCHRONIZED' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2459:1: (lv_primarytyp_7_0= 'SYNCHRONIZED' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2460:3: lv_primarytyp_7_0= 'SYNCHRONIZED'
                    {
                    lv_primarytyp_7_0=(Token)match(input,52,FOLLOW_52_in_rulePrimaryInner4325); 

                            newLeafNode(lv_primarytyp_7_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypSYNCHRONIZEDKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_7_0, "SYNCHRONIZED");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2473:2: ( (lv_construct_8_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2474:1: (lv_construct_8_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2474:1: (lv_construct_8_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2475:3: lv_construct_8_0= RULE_ID
                    {
                    lv_construct_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4355); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2492:6: ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2492:6: ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2492:7: ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2492:7: ( (lv_primarytyp_9_0= 'FEATURECALL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2493:1: (lv_primarytyp_9_0= 'FEATURECALL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2493:1: (lv_primarytyp_9_0= 'FEATURECALL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2494:3: lv_primarytyp_9_0= 'FEATURECALL'
                    {
                    lv_primarytyp_9_0=(Token)match(input,53,FOLLOW_53_in_rulePrimaryInner4386); 

                            newLeafNode(lv_primarytyp_9_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypFEATURECALLKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_9_0, "FEATURECALL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2507:2: ( (lv_construct_10_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2508:1: (lv_construct_10_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2508:1: (lv_construct_10_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2509:3: lv_construct_10_0= RULE_ID
                    {
                    lv_construct_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4416); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2525:2: ( (lv_feature_11_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2526:1: (lv_feature_11_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2526:1: (lv_feature_11_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2527:3: lv_feature_11_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryInnerAccess().getFeatureMultStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrimaryInner4442);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2544:6: ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2544:6: ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2544:7: ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2544:7: ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2545:1: (lv_primarytyp_12_0= 'IFEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2545:1: (lv_primarytyp_12_0= 'IFEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2546:3: lv_primarytyp_12_0= 'IFEXPRESSION'
                    {
                    lv_primarytyp_12_0=(Token)match(input,54,FOLLOW_54_in_rulePrimaryInner4468); 

                            newLeafNode(lv_primarytyp_12_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypIFEXPRESSIONKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_12_0, "IFEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2559:2: ( (lv_construct_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2560:1: (lv_construct_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2560:1: (lv_construct_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2561:3: lv_construct_13_0= RULE_ID
                    {
                    lv_construct_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4498); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2578:6: ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2578:6: ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2578:7: ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2578:7: ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2579:1: (lv_primarytyp_14_0= 'FOREXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2579:1: (lv_primarytyp_14_0= 'FOREXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2580:3: lv_primarytyp_14_0= 'FOREXPRESSION'
                    {
                    lv_primarytyp_14_0=(Token)match(input,55,FOLLOW_55_in_rulePrimaryInner4529); 

                            newLeafNode(lv_primarytyp_14_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypFOREXPRESSIONKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_14_0, "FOREXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2593:2: ( (lv_construct_15_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2594:1: (lv_construct_15_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2594:1: (lv_construct_15_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2595:3: lv_construct_15_0= RULE_ID
                    {
                    lv_construct_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4559); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2612:6: ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2612:6: ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2612:7: ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2612:7: ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2613:1: (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2613:1: (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2614:3: lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION'
                    {
                    lv_primarytyp_16_0=(Token)match(input,56,FOLLOW_56_in_rulePrimaryInner4590); 

                            newLeafNode(lv_primarytyp_16_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypBASICFORLOOPEXPRESSIONKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_16_0, "BASICFORLOOPEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2627:2: ( (lv_construct_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2628:1: (lv_construct_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2628:1: (lv_construct_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2629:3: lv_construct_17_0= RULE_ID
                    {
                    lv_construct_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4620); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2646:6: ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2646:6: ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2646:7: ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2646:7: ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2647:1: (lv_primarytyp_18_0= 'WHILEEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2647:1: (lv_primarytyp_18_0= 'WHILEEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2648:3: lv_primarytyp_18_0= 'WHILEEXPRESSION'
                    {
                    lv_primarytyp_18_0=(Token)match(input,57,FOLLOW_57_in_rulePrimaryInner4651); 

                            newLeafNode(lv_primarytyp_18_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypWHILEEXPRESSIONKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_18_0, "WHILEEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2661:2: ( (lv_construct_19_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2662:1: (lv_construct_19_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2662:1: (lv_construct_19_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2663:3: lv_construct_19_0= RULE_ID
                    {
                    lv_construct_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4681); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2680:6: ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2680:6: ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2680:7: ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2680:7: ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2681:1: (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2681:1: (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2682:3: lv_primarytyp_20_0= 'DOWHILEEXPRESSION'
                    {
                    lv_primarytyp_20_0=(Token)match(input,58,FOLLOW_58_in_rulePrimaryInner4712); 

                            newLeafNode(lv_primarytyp_20_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypDOWHILEEXPRESSIONKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_20_0, "DOWHILEEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2695:2: ( (lv_construct_21_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2696:1: (lv_construct_21_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2696:1: (lv_construct_21_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2697:3: lv_construct_21_0= RULE_ID
                    {
                    lv_construct_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4742); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2714:6: ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2714:6: ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2714:7: ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2714:7: ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2715:1: (lv_primarytyp_22_0= 'THROWEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2715:1: (lv_primarytyp_22_0= 'THROWEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2716:3: lv_primarytyp_22_0= 'THROWEXPRESSION'
                    {
                    lv_primarytyp_22_0=(Token)match(input,59,FOLLOW_59_in_rulePrimaryInner4773); 

                            newLeafNode(lv_primarytyp_22_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypTHROWEXPRESSIONKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_22_0, "THROWEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2729:2: ( (lv_construct_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2730:1: (lv_construct_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2730:1: (lv_construct_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2731:3: lv_construct_23_0= RULE_ID
                    {
                    lv_construct_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4803); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2748:6: ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2748:6: ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2748:7: ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2748:7: ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2749:1: (lv_primarytyp_24_0= 'RETURNEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2749:1: (lv_primarytyp_24_0= 'RETURNEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2750:3: lv_primarytyp_24_0= 'RETURNEXPRESSION'
                    {
                    lv_primarytyp_24_0=(Token)match(input,60,FOLLOW_60_in_rulePrimaryInner4834); 

                            newLeafNode(lv_primarytyp_24_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypRETURNEXPRESSIONKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_24_0, "RETURNEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2763:2: ( (lv_construct_25_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2764:1: (lv_construct_25_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2764:1: (lv_construct_25_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2765:3: lv_construct_25_0= RULE_ID
                    {
                    lv_construct_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4864); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2782:6: ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2782:6: ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2782:7: ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2782:7: ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2783:1: (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2783:1: (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2784:3: lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION'
                    {
                    lv_primarytyp_26_0=(Token)match(input,61,FOLLOW_61_in_rulePrimaryInner4895); 

                            newLeafNode(lv_primarytyp_26_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypTRYCATCHFINALYEXPRESSIONKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_26_0, "TRYCATCHFINALYEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2797:2: ( (lv_construct_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2798:1: (lv_construct_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2798:1: (lv_construct_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2799:3: lv_construct_27_0= RULE_ID
                    {
                    lv_construct_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4925); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2816:6: ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2816:6: ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2816:7: ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2816:7: ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2817:1: (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2817:1: (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2818:3: lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION'
                    {
                    lv_primarytyp_28_0=(Token)match(input,62,FOLLOW_62_in_rulePrimaryInner4956); 

                            newLeafNode(lv_primarytyp_28_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypPARENTHESIZEDEXPRESSIONKeyword_13_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_28_0, "PARENTHESIZEDEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2831:2: ( (lv_construct_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2832:1: (lv_construct_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2832:1: (lv_construct_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2833:3: lv_construct_29_0= RULE_ID
                    {
                    lv_construct_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner4986); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2850:6: ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2850:6: ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2850:7: ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2850:7: ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2851:1: (lv_primarytyp_30_0= 'LITERALEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2851:1: (lv_primarytyp_30_0= 'LITERALEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2852:3: lv_primarytyp_30_0= 'LITERALEXPRESSION'
                    {
                    lv_primarytyp_30_0=(Token)match(input,63,FOLLOW_63_in_rulePrimaryInner5017); 

                            newLeafNode(lv_primarytyp_30_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypLITERALEXPRESSIONKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_30_0, "LITERALEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2865:2: ( (lv_construct_31_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2866:1: (lv_construct_31_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2866:1: (lv_construct_31_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2867:3: lv_construct_31_0= RULE_ID
                    {
                    lv_construct_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5047); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2891:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2892:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2893:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5089);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5099); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2900:1: ruleLiteral returns [EObject current=null] : (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2903:28: ( (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2904:1: (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2904:1: (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2904:3: otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )*
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleLiteral5136); 

                	newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getLITERALKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2908:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2909:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2909:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2910:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral5153); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2926:2: ( (lv_inner_2_0= ruleLiteralInner ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=65 && LA33_0<=71)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2927:1: (lv_inner_2_0= ruleLiteralInner )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2927:1: (lv_inner_2_0= ruleLiteralInner )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2928:3: lv_inner_2_0= ruleLiteralInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLiteralAccess().getInnerLiteralInnerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteralInner_in_ruleLiteral5179);
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
            	    break loop33;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2952:1: entryRuleLiteralInner returns [EObject current=null] : iv_ruleLiteralInner= ruleLiteralInner EOF ;
    public final EObject entryRuleLiteralInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInner = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2953:2: (iv_ruleLiteralInner= ruleLiteralInner EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2954:2: iv_ruleLiteralInner= ruleLiteralInner EOF
            {
             newCompositeNode(grammarAccess.getLiteralInnerRule()); 
            pushFollow(FOLLOW_ruleLiteralInner_in_entryRuleLiteralInner5216);
            iv_ruleLiteralInner=ruleLiteralInner();

            state._fsp--;

             current =iv_ruleLiteralInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralInner5226); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2961:1: ruleLiteralInner returns [EObject current=null] : ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2964:28: ( ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2965:1: ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2965:1: ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) )
            int alt34=7;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt34=1;
                }
                break;
            case 66:
                {
                alt34=2;
                }
                break;
            case 67:
                {
                alt34=3;
                }
                break;
            case 68:
                {
                alt34=4;
                }
                break;
            case 69:
                {
                alt34=5;
                }
                break;
            case 70:
                {
                alt34=6;
                }
                break;
            case 71:
                {
                alt34=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2965:2: ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2965:2: ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2965:3: ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2965:3: ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2966:1: (lv_primarytyp_0_0= 'COLLECTIONLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2966:1: (lv_primarytyp_0_0= 'COLLECTIONLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2967:3: lv_primarytyp_0_0= 'COLLECTIONLITERAL'
                    {
                    lv_primarytyp_0_0=(Token)match(input,65,FOLLOW_65_in_ruleLiteralInner5270); 

                            newLeafNode(lv_primarytyp_0_0, grammarAccess.getLiteralInnerAccess().getPrimarytypCOLLECTIONLITERALKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_0_0, "COLLECTIONLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2980:2: ( (lv_construct_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2981:1: (lv_construct_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2981:1: (lv_construct_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2982:3: lv_construct_1_0= RULE_ID
                    {
                    lv_construct_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5300); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2999:6: ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2999:6: ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2999:7: ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2999:7: ( (lv_primarytyp_2_0= 'CLOSURE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3000:1: (lv_primarytyp_2_0= 'CLOSURE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3000:1: (lv_primarytyp_2_0= 'CLOSURE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3001:3: lv_primarytyp_2_0= 'CLOSURE'
                    {
                    lv_primarytyp_2_0=(Token)match(input,66,FOLLOW_66_in_ruleLiteralInner5331); 

                            newLeafNode(lv_primarytyp_2_0, grammarAccess.getLiteralInnerAccess().getPrimarytypCLOSUREKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_2_0, "CLOSURE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3014:2: ( (lv_construct_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3015:1: (lv_construct_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3015:1: (lv_construct_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3016:3: lv_construct_3_0= RULE_ID
                    {
                    lv_construct_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5361); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3033:6: ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3033:6: ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3033:7: ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3033:7: ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3034:1: (lv_primarytyp_4_0= 'BOOLEANLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3034:1: (lv_primarytyp_4_0= 'BOOLEANLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3035:3: lv_primarytyp_4_0= 'BOOLEANLITERAL'
                    {
                    lv_primarytyp_4_0=(Token)match(input,67,FOLLOW_67_in_ruleLiteralInner5392); 

                            newLeafNode(lv_primarytyp_4_0, grammarAccess.getLiteralInnerAccess().getPrimarytypBOOLEANLITERALKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_4_0, "BOOLEANLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3048:2: ( (lv_construct_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3049:1: (lv_construct_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3049:1: (lv_construct_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3050:3: lv_construct_5_0= RULE_ID
                    {
                    lv_construct_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5422); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3067:6: ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3067:6: ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3067:7: ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3067:7: ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3068:1: (lv_primarytyp_6_0= 'NUMBERLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3068:1: (lv_primarytyp_6_0= 'NUMBERLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3069:3: lv_primarytyp_6_0= 'NUMBERLITERAL'
                    {
                    lv_primarytyp_6_0=(Token)match(input,68,FOLLOW_68_in_ruleLiteralInner5453); 

                            newLeafNode(lv_primarytyp_6_0, grammarAccess.getLiteralInnerAccess().getPrimarytypNUMBERLITERALKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_6_0, "NUMBERLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3082:2: ( (lv_construct_7_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3083:1: (lv_construct_7_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3083:1: (lv_construct_7_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3084:3: lv_construct_7_0= RULE_ID
                    {
                    lv_construct_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5483); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3101:6: ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3101:6: ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3101:7: ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3101:7: ( (lv_primarytyp_8_0= 'NULLLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3102:1: (lv_primarytyp_8_0= 'NULLLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3102:1: (lv_primarytyp_8_0= 'NULLLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3103:3: lv_primarytyp_8_0= 'NULLLITERAL'
                    {
                    lv_primarytyp_8_0=(Token)match(input,69,FOLLOW_69_in_ruleLiteralInner5514); 

                            newLeafNode(lv_primarytyp_8_0, grammarAccess.getLiteralInnerAccess().getPrimarytypNULLLITERALKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_8_0, "NULLLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3116:2: ( (lv_construct_9_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3117:1: (lv_construct_9_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3117:1: (lv_construct_9_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3118:3: lv_construct_9_0= RULE_ID
                    {
                    lv_construct_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5544); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3135:6: ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3135:6: ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3135:7: ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3135:7: ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3136:1: (lv_primarytyp_10_0= 'STRINGLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3136:1: (lv_primarytyp_10_0= 'STRINGLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3137:3: lv_primarytyp_10_0= 'STRINGLITERAL'
                    {
                    lv_primarytyp_10_0=(Token)match(input,70,FOLLOW_70_in_ruleLiteralInner5575); 

                            newLeafNode(lv_primarytyp_10_0, grammarAccess.getLiteralInnerAccess().getPrimarytypSTRINGLITERALKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_10_0, "STRINGLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3150:2: ( (lv_construct_11_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3151:1: (lv_construct_11_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3151:1: (lv_construct_11_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3152:3: lv_construct_11_0= RULE_ID
                    {
                    lv_construct_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5605); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3169:6: ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3169:6: ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3169:7: ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3169:7: ( (lv_primarytyp_12_0= 'TYPELITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3170:1: (lv_primarytyp_12_0= 'TYPELITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3170:1: (lv_primarytyp_12_0= 'TYPELITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3171:3: lv_primarytyp_12_0= 'TYPELITERAL'
                    {
                    lv_primarytyp_12_0=(Token)match(input,71,FOLLOW_71_in_ruleLiteralInner5636); 

                            newLeafNode(lv_primarytyp_12_0, grammarAccess.getLiteralInnerAccess().getPrimarytypTYPELITERALKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_12_0, "TYPELITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3184:2: ( (lv_construct_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3185:1: (lv_construct_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3185:1: (lv_construct_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3186:3: lv_construct_13_0= RULE_ID
                    {
                    lv_construct_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner5666); 

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
    public static final BitSet FOLLOW_ruleClassType_in_ruleModel131 = new BitSet(new long[]{0x0001000002040802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleModel158 = new BitSet(new long[]{0x0001000002040802L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleModel185 = new BitSet(new long[]{0x0001000002040802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleModel212 = new BitSet(new long[]{0x0001000002040802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel239 = new BitSet(new long[]{0x0001000002040802L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleClassType323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassType340 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_12_in_ruleClassType364 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_13_in_ruleClassType396 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleClassType417 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_14_in_ruleClassType437 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleClassType458 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_15_in_ruleClassType478 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleClassType498 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_17_in_ruleClassType527 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProcedure629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure646 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_13_in_ruleProcedure665 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleProcedure686 = new BitSet(new long[]{0x0000000000086002L});
    public static final BitSet FOLLOW_14_in_ruleProcedure706 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleProcedure727 = new BitSet(new long[]{0x0000000000086002L});
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
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1247 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1291 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrecedence1358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1411 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1447 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrecedence1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1552 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1588 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1632 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrecedence1699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1752 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1788 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1832 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrecedence1899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1952 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence1969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1988 = new BitSet(new long[]{0x00000FF000000000L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_rulePrecedence2014 = new BitSet(new long[]{0x00000FF000000002L});
    public static final BitSet FOLLOW_32_in_rulePrecedence2041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrecedence2124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrecedence2207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrecedence2290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrecedence2373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2426 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence2443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2462 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2506 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrecedence2523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence2584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerPrecedence2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInnerPrecedence2638 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence2672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2690 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInnerPrecedence2707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInnerPrecedence2757 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleInnerPrecedence2817 = new BitSet(new long[]{0x0000300004000030L});
    public static final BitSet FOLLOW_26_in_ruleInnerPrecedence2849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2879 = new BitSet(new long[]{0x0000300008000030L});
    public static final BitSet FOLLOW_27_in_ruleInnerPrecedence2897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2914 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence2944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2962 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInnerPrecedence2979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInnerPrecedence3029 = new BitSet(new long[]{0x0000300004000030L});
    public static final BitSet FOLLOW_26_in_ruleInnerPrecedence3061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3091 = new BitSet(new long[]{0x0000300008000030L});
    public static final BitSet FOLLOW_27_in_ruleInnerPrecedence3109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3126 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence3156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3174 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInnerPrecedence3191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInnerPrecedence3241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleInnerPrecedence3324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInnerPrecedence3407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInnerPrecedence3490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString3584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultString3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultString3704 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleMultString3730 = new BitSet(new long[]{0x0000F00000000030L});
    public static final BitSet FOLLOW_ruleComboString_in_ruleMultString3751 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleMultString3764 = new BitSet(new long[]{0x0000F00000000030L});
    public static final BitSet FOLLOW_ruleComboString_in_ruleMultString3785 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_ruleMultString3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboString_in_entryRuleComboString3837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboString3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleComboString3902 = new BitSet(new long[]{0x0000300000000032L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePrimary3986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary4003 = new BitSet(new long[]{0xFFFE000000000002L});
    public static final BitSet FOLLOW_rulePrimaryInner_in_rulePrimary4029 = new BitSet(new long[]{0xFFFE000000000002L});
    public static final BitSet FOLLOW_rulePrimaryInner_in_entryRulePrimaryInner4066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryInner4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePrimaryInner4120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePrimaryInner4181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePrimaryInner4242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePrimaryInner4325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePrimaryInner4386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4416 = new BitSet(new long[]{0x0000300000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrimaryInner4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePrimaryInner4468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePrimaryInner4529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePrimaryInner4590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePrimaryInner4651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePrimaryInner4712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimaryInner4773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimaryInner4834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimaryInner4895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePrimaryInner4956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimaryInner5017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleLiteral5136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral5153 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleLiteralInner_in_ruleLiteral5179 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000FEL});
    public static final BitSet FOLLOW_ruleLiteralInner_in_entryRuleLiteralInner5216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInner5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLiteralInner5270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleLiteralInner5331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleLiteralInner5392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLiteralInner5453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleLiteralInner5514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleLiteralInner5575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleLiteralInner5636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner5666 = new BitSet(new long[]{0x0000000000000002L});

}