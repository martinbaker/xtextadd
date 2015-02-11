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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PROJECT'", "'PROJECTNAME'", "'NAME'", "'CLASS'", "'NOCLASS'", "'PREFIX'", "'SUFFIX'", "'BLOCKING'", "'BRACES'", "'INDENT'", "'PROCEDURE'", "'GENERMEMBER'", "'GENERPARAM'", "'TYPES'", "'COLONSEPERATED'", "'SPACESEPERATED'", "'INHEADER'", "'INFERRED'", "'UNTYPED'", "'EXPRESSION'", "'CALLER'", "'.'", "'RULE'", "'='", "'INFIX'", "'INFIXRIGHT'", "'OUTER'", "'COMPOUND'", "'('", "')'", "'BRACKET'", "'PARENTHESIS'", "'ANGLE'", "'MEMBERFEATURE'", "'SUBRULE'", "'SUBPREFIX'", "'SUBSUFFIX'", "'SUBINFIX'", "'SUBINFIXRIGHT'", "'SUBBRACKET'", "'SUBBRACES'", "'SUBPARENTHESIS'", "'SUBANGLE'", "'INNERRULE'", "'INNERPREFIX'", "'INNERSUFFIX'", "'INNERINFIX'", "'INNERINFIXRIGHT'", "'INNERBRACKET'", "'INNERBRACES'", "'INNERPARENTHESIS'", "'INNERANGLE'", "'?'", "'=>'", "'|'", "'PRIMARY'", "'CONSTRUCTOR'", "'BLOCK'", "'SWITCH'", "'SYNCHRONIZED'", "'FEATURECALL'", "'IFEXPRESSION'", "'FOREXPRESSION'", "'BASICFORLOOPEXPRESSION'", "'WHILEEXPRESSION'", "'DOWHILEEXPRESSION'", "'THROWEXPRESSION'", "'RETURNEXPRESSION'", "'TRYCATCHFINALYEXPRESSION'", "'PARENTHESIZEDEXPRESSION'", "'LITERALEXPRESSION'", "'LITERAL'", "'COLLECTIONLITERAL'", "'CLOSURE'", "'BOOLEANLITERAL'", "'NUMBERLITERAL'", "'NULLLITERAL'", "'STRINGLITERAL'", "'TYPELITERAL'"
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
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_proj_0_0= ruleProject ) ) | ( (lv_clas_1_0= ruleClassType ) ) | ( (lv_proc_2_0= ruleProcedure ) ) | ( (lv_prim_3_0= rulePrimary ) ) | ( (lv_lit_4_0= ruleLiteral ) ) | ( (lv_exp_5_0= ruleExpression ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_proj_0_0 = null;

        EObject lv_clas_1_0 = null;

        EObject lv_proc_2_0 = null;

        EObject lv_prim_3_0 = null;

        EObject lv_lit_4_0 = null;

        EObject lv_exp_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:79:28: ( ( ( (lv_proj_0_0= ruleProject ) ) | ( (lv_clas_1_0= ruleClassType ) ) | ( (lv_proc_2_0= ruleProcedure ) ) | ( (lv_prim_3_0= rulePrimary ) ) | ( (lv_lit_4_0= ruleLiteral ) ) | ( (lv_exp_5_0= ruleExpression ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:1: ( ( (lv_proj_0_0= ruleProject ) ) | ( (lv_clas_1_0= ruleClassType ) ) | ( (lv_proc_2_0= ruleProcedure ) ) | ( (lv_prim_3_0= rulePrimary ) ) | ( (lv_lit_4_0= ruleLiteral ) ) | ( (lv_exp_5_0= ruleExpression ) ) )*
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:1: ( ( (lv_proj_0_0= ruleProject ) ) | ( (lv_clas_1_0= ruleClassType ) ) | ( (lv_proc_2_0= ruleProcedure ) ) | ( (lv_prim_3_0= rulePrimary ) ) | ( (lv_lit_4_0= ruleLiteral ) ) | ( (lv_exp_5_0= ruleExpression ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case 21:
                    {
                    alt1=3;
                    }
                    break;
                case 66:
                    {
                    alt1=4;
                    }
                    break;
                case 82:
                    {
                    alt1=5;
                    }
                    break;
                case 30:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:2: ( (lv_proj_0_0= ruleProject ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:80:2: ( (lv_proj_0_0= ruleProject ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:81:1: (lv_proj_0_0= ruleProject )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:81:1: (lv_proj_0_0= ruleProject )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:82:3: lv_proj_0_0= ruleProject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getProjProjectParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProject_in_ruleModel131);
            	    lv_proj_0_0=ruleProject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"proj",
            	            		lv_proj_0_0, 
            	            		"Project");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:99:6: ( (lv_clas_1_0= ruleClassType ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:99:6: ( (lv_clas_1_0= ruleClassType ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:100:1: (lv_clas_1_0= ruleClassType )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:100:1: (lv_clas_1_0= ruleClassType )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:101:3: lv_clas_1_0= ruleClassType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getClasClassTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassType_in_ruleModel158);
            	    lv_clas_1_0=ruleClassType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"clas",
            	            		lv_clas_1_0, 
            	            		"ClassType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:118:6: ( (lv_proc_2_0= ruleProcedure ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:118:6: ( (lv_proc_2_0= ruleProcedure ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:119:1: (lv_proc_2_0= ruleProcedure )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:119:1: (lv_proc_2_0= ruleProcedure )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:120:3: lv_proc_2_0= ruleProcedure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getProcProcedureParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcedure_in_ruleModel185);
            	    lv_proc_2_0=ruleProcedure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"proc",
            	            		lv_proc_2_0, 
            	            		"Procedure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:137:6: ( (lv_prim_3_0= rulePrimary ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:137:6: ( (lv_prim_3_0= rulePrimary ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:138:1: (lv_prim_3_0= rulePrimary )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:138:1: (lv_prim_3_0= rulePrimary )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:139:3: lv_prim_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPrimPrimaryParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleModel212);
            	    lv_prim_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prim",
            	            		lv_prim_3_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:156:6: ( (lv_lit_4_0= ruleLiteral ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:156:6: ( (lv_lit_4_0= ruleLiteral ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:157:1: (lv_lit_4_0= ruleLiteral )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:157:1: (lv_lit_4_0= ruleLiteral )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:158:3: lv_lit_4_0= ruleLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getLitLiteralParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleModel239);
            	    lv_lit_4_0=ruleLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lit",
            	            		lv_lit_4_0, 
            	            		"Literal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:175:6: ( (lv_exp_5_0= ruleExpression ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:175:6: ( (lv_exp_5_0= ruleExpression ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:176:1: (lv_exp_5_0= ruleExpression )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:176:1: (lv_exp_5_0= ruleExpression )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:177:3: lv_exp_5_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleModel266);
            	    lv_exp_5_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exp",
            	            		lv_exp_5_0, 
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


    // $ANTLR start "entryRuleProject"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:201:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:202:2: (iv_ruleProject= ruleProject EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:203:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject303);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject313); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:210:1: ruleProject returns [EObject current=null] : (otherlv_0= 'PROJECT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) ) ) | (otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) ) ) )* ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_proj_3_0 = null;

        EObject lv_nam_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:213:28: ( (otherlv_0= 'PROJECT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) ) ) | (otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:1: (otherlv_0= 'PROJECT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) ) ) | (otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:1: (otherlv_0= 'PROJECT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) ) ) | (otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:214:3: otherlv_0= 'PROJECT' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) ) ) | (otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProject350); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getPROJECTKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:218:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:219:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:219:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:220:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject367); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:236:2: ( (otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) ) ) | (otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }
                else if ( (LA2_0==13) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:236:3: (otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:236:3: (otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:236:5: otherlv_2= 'PROJECTNAME' ( (lv_proj_3_0= ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProject386); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getPROJECTNAMEKeyword_2_0_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:240:1: ( (lv_proj_3_0= ruleQualifiedName ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:241:1: (lv_proj_3_0= ruleQualifiedName )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:241:1: (lv_proj_3_0= ruleQualifiedName )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:242:3: lv_proj_3_0= ruleQualifiedName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getProjQualifiedNameParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProject407);
            	    lv_proj_3_0=ruleQualifiedName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"proj",
            	            		lv_proj_3_0, 
            	            		"QualifiedName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:259:6: (otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:259:6: (otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:259:8: otherlv_4= 'NAME' ( (lv_nam_5_0= ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleProject427); 

            	        	newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getNAMEKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:263:1: ( (lv_nam_5_0= ruleQualifiedName ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:264:1: (lv_nam_5_0= ruleQualifiedName )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:264:1: (lv_nam_5_0= ruleQualifiedName )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:265:3: lv_nam_5_0= ruleQualifiedName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getNamQualifiedNameParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleProject448);
            	    lv_nam_5_0=ruleQualifiedName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nam",
            	            		lv_nam_5_0, 
            	            		"QualifiedName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleClassType"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:289:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:290:2: (iv_ruleClassType= ruleClassType EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:291:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType487);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType497); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:298:1: ruleClassType returns [EObject current=null] : (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:301:28: ( (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:302:1: (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:302:1: (otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:302:3: otherlv_0= 'CLASS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleClassType534); 

                	newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getCLASSKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:306:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:307:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:307:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:308:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassType551); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:324:2: ( ( (lv_noclass_2_0= 'NOCLASS' ) ) | (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) ) | (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) ) | (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) ) )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt4=1;
                    }
                    break;
                case 16:
                    {
                    alt4=2;
                    }
                    break;
                case 17:
                    {
                    alt4=3;
                    }
                    break;
                case 18:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:324:3: ( (lv_noclass_2_0= 'NOCLASS' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:324:3: ( (lv_noclass_2_0= 'NOCLASS' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:325:1: (lv_noclass_2_0= 'NOCLASS' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:325:1: (lv_noclass_2_0= 'NOCLASS' )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:326:3: lv_noclass_2_0= 'NOCLASS'
            	    {
            	    lv_noclass_2_0=(Token)match(input,15,FOLLOW_15_in_ruleClassType575); 

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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:340:6: (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:340:6: (otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:340:8: otherlv_3= 'PREFIX' ( (lv_prefix_4_0= ruleMultString ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleClassType607); 

            	        	newLeafNode(otherlv_3, grammarAccess.getClassTypeAccess().getPREFIXKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:344:1: ( (lv_prefix_4_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:345:1: (lv_prefix_4_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:345:1: (lv_prefix_4_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:346:3: lv_prefix_4_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassTypeAccess().getPrefixMultStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleClassType628);
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:363:6: (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:363:6: (otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:363:8: otherlv_5= 'SUFFIX' ( (lv_suffix_6_0= ruleMultString ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleClassType648); 

            	        	newLeafNode(otherlv_5, grammarAccess.getClassTypeAccess().getSUFFIXKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:367:1: ( (lv_suffix_6_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:368:1: (lv_suffix_6_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:368:1: (lv_suffix_6_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:369:3: lv_suffix_6_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassTypeAccess().getSuffixMultStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleClassType669);
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:386:6: (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:386:6: (otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:386:8: otherlv_7= 'BLOCKING' ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleClassType689); 

            	        	newLeafNode(otherlv_7, grammarAccess.getClassTypeAccess().getBLOCKINGKeyword_2_3_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:390:1: ( ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:391:1: ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:391:1: ( (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:392:1: (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:392:1: (lv_blocking_8_1= 'BRACES' | lv_blocking_8_2= 'INDENT' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==19) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==20) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:393:3: lv_blocking_8_1= 'BRACES'
            	            {
            	            lv_blocking_8_1=(Token)match(input,19,FOLLOW_19_in_ruleClassType709); 

            	                    newLeafNode(lv_blocking_8_1, grammarAccess.getClassTypeAccess().getBlockingBRACESKeyword_2_3_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getClassTypeRule());
            	            	        }
            	                   		addWithLastConsumed(current, "blocking", lv_blocking_8_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:405:8: lv_blocking_8_2= 'INDENT'
            	            {
            	            lv_blocking_8_2=(Token)match(input,20,FOLLOW_20_in_ruleClassType738); 

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
            	    break loop4;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:428:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:429:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:430:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure793);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure803); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:437:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) ) ) | (otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) ) ) | (otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) ) ) | (otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) ) ) | (otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) ) ) )* ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_expression_3_0=null;
        Token lv_blockexp_4_0=null;
        Token otherlv_5=null;
        Token lv_annot_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_types_12_1=null;
        Token lv_types_12_2=null;
        Token lv_types_12_3=null;
        Token lv_types_12_4=null;
        Token lv_types_12_5=null;
        EObject lv_prefix_8_0 = null;

        EObject lv_suffix_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:440:28: ( (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) ) ) | (otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) ) ) | (otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) ) ) | (otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) ) ) | (otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:441:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) ) ) | (otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) ) ) | (otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) ) ) | (otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) ) ) | (otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:441:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) ) ) | (otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) ) ) | (otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) ) ) | (otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) ) ) | (otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:441:3: otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) ) ) | (otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) ) ) | (otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) ) ) | (otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) ) ) | (otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleProcedure840); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:445:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:446:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:446:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:447:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure857); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:2: ( (otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) ) ) | (otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) ) ) | (otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) ) ) | (otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) ) ) | (otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) ) ) )*
            loop6:
            do {
                int alt6=6;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    alt6=1;
                    }
                    break;
                case 23:
                    {
                    alt6=2;
                    }
                    break;
                case 16:
                    {
                    alt6=3;
                    }
                    break;
                case 17:
                    {
                    alt6=4;
                    }
                    break;
                case 24:
                    {
                    alt6=5;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:3: (otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:3: (otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:5: otherlv_2= 'GENERMEMBER' ( (lv_expression_3_0= RULE_ID ) ) ( (lv_blockexp_4_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleProcedure876); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getGENERMEMBERKeyword_2_0_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:467:1: ( (lv_expression_3_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:468:1: (lv_expression_3_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:468:1: (lv_expression_3_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:469:3: lv_expression_3_0= RULE_ID
            	    {
            	    lv_expression_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure893); 

            	    			newLeafNode(lv_expression_3_0, grammarAccess.getProcedureAccess().getExpressionIDTerminalRuleCall_2_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProcedureRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"expression",
            	            		lv_expression_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:485:2: ( (lv_blockexp_4_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:486:1: (lv_blockexp_4_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:486:1: (lv_blockexp_4_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:487:3: lv_blockexp_4_0= RULE_ID
            	    {
            	    lv_blockexp_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure915); 

            	    			newLeafNode(lv_blockexp_4_0, grammarAccess.getProcedureAccess().getBlockexpIDTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProcedureRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"blockexp",
            	            		lv_blockexp_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:504:6: (otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:504:6: (otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:504:8: otherlv_5= 'GENERPARAM' ( (lv_annot_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleProcedure940); 

            	        	newLeafNode(otherlv_5, grammarAccess.getProcedureAccess().getGENERPARAMKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:508:1: ( (lv_annot_6_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:509:1: (lv_annot_6_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:509:1: (lv_annot_6_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:510:3: lv_annot_6_0= RULE_ID
            	    {
            	    lv_annot_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure957); 

            	    			newLeafNode(lv_annot_6_0, grammarAccess.getProcedureAccess().getAnnotIDTerminalRuleCall_2_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProcedureRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"annot",
            	            		lv_annot_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:527:6: (otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:527:6: (otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:527:8: otherlv_7= 'PREFIX' ( (lv_prefix_8_0= ruleMultString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleProcedure982); 

            	        	newLeafNode(otherlv_7, grammarAccess.getProcedureAccess().getPREFIXKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:531:1: ( (lv_prefix_8_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:532:1: (lv_prefix_8_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:532:1: (lv_prefix_8_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:533:3: lv_prefix_8_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getPrefixMultStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleProcedure1003);
            	    lv_prefix_8_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"prefix",
            	            		lv_prefix_8_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:550:6: (otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:550:6: (otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:550:8: otherlv_9= 'SUFFIX' ( (lv_suffix_10_0= ruleMultString ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleProcedure1023); 

            	        	newLeafNode(otherlv_9, grammarAccess.getProcedureAccess().getSUFFIXKeyword_2_3_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:554:1: ( (lv_suffix_10_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:555:1: (lv_suffix_10_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:555:1: (lv_suffix_10_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:556:3: lv_suffix_10_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getSuffixMultStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleProcedure1044);
            	    lv_suffix_10_0=ruleMultString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"suffix",
            	            		lv_suffix_10_0, 
            	            		"MultString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:573:6: (otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:573:6: (otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:573:8: otherlv_11= 'TYPES' ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) )
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleProcedure1064); 

            	        	newLeafNode(otherlv_11, grammarAccess.getProcedureAccess().getTYPESKeyword_2_4_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:577:1: ( ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:578:1: ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:578:1: ( (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:579:1: (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:579:1: (lv_types_12_1= 'COLONSEPERATED' | lv_types_12_2= 'SPACESEPERATED' | lv_types_12_3= 'INHEADER' | lv_types_12_4= 'INFERRED' | lv_types_12_5= 'UNTYPED' )
            	    int alt5=5;
            	    switch ( input.LA(1) ) {
            	    case 25:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt5=4;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt5=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:580:3: lv_types_12_1= 'COLONSEPERATED'
            	            {
            	            lv_types_12_1=(Token)match(input,25,FOLLOW_25_in_ruleProcedure1084); 

            	                    newLeafNode(lv_types_12_1, grammarAccess.getProcedureAccess().getTypesCOLONSEPERATEDKeyword_2_4_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_12_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:592:8: lv_types_12_2= 'SPACESEPERATED'
            	            {
            	            lv_types_12_2=(Token)match(input,26,FOLLOW_26_in_ruleProcedure1113); 

            	                    newLeafNode(lv_types_12_2, grammarAccess.getProcedureAccess().getTypesSPACESEPERATEDKeyword_2_4_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_12_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:604:8: lv_types_12_3= 'INHEADER'
            	            {
            	            lv_types_12_3=(Token)match(input,27,FOLLOW_27_in_ruleProcedure1142); 

            	                    newLeafNode(lv_types_12_3, grammarAccess.getProcedureAccess().getTypesINHEADERKeyword_2_4_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_12_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:616:8: lv_types_12_4= 'INFERRED'
            	            {
            	            lv_types_12_4=(Token)match(input,28,FOLLOW_28_in_ruleProcedure1171); 

            	                    newLeafNode(lv_types_12_4, grammarAccess.getProcedureAccess().getTypesINFERREDKeyword_2_4_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_12_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:628:8: lv_types_12_5= 'UNTYPED'
            	            {
            	            lv_types_12_5=(Token)match(input,29,FOLLOW_29_in_ruleProcedure1200); 

            	                    newLeafNode(lv_types_12_5, grammarAccess.getProcedureAccess().getTypesUNTYPEDKeyword_2_4_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_12_5, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleExpression"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:651:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:652:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:653:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1255);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1265); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:660:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_prec_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:663:28: ( (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:664:1: (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:664:1: (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:664:3: otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleExpression1302); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getEXPRESSIONKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:668:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:669:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:669:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:670:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1319); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:686:2: ( (lv_prec_2_0= rulePrecedence ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)||LA7_0==19||LA7_0==31||LA7_0==33||(LA7_0>=35 && LA7_0<=38)||(LA7_0>=41 && LA7_0<=44)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:687:1: (lv_prec_2_0= rulePrecedence )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:687:1: (lv_prec_2_0= rulePrecedence )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:688:3: lv_prec_2_0= rulePrecedence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getPrecPrecedenceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrecedence_in_ruleExpression1345);
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
            	    break loop7;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:712:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:713:2: (iv_rulePrecedence= rulePrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:714:2: iv_rulePrecedence= rulePrecedence EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_rulePrecedence_in_entryRulePrecedence1382);
            iv_rulePrecedence=rulePrecedence();

            state._fsp--;

             current =iv_rulePrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecedence1392); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:721:1: rulePrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' ) | ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) ) ) ;
    public final EObject rulePrecedence() throws RecognitionException {
        EObject current = null;

        Token lv_ruletyp_0_0=null;
        Token lv_rule_1_0=null;
        Token otherlv_2=null;
        Token lv_feature1_3_0=null;
        Token lv_ruletyp_4_0=null;
        Token lv_rule_5_0=null;
        Token lv_customrule_6_0=null;
        Token lv_ruletyp_7_0=null;
        Token lv_rule_8_0=null;
        Token lv_feature1_10_0=null;
        Token otherlv_11=null;
        Token lv_par1_12_0=null;
        Token lv_ruletyp_13_0=null;
        Token lv_rule_14_0=null;
        Token lv_feature1_15_0=null;
        Token otherlv_16=null;
        Token lv_par1_17_0=null;
        Token lv_ruletyp_19_0=null;
        Token lv_rule_20_0=null;
        Token lv_feature1_21_0=null;
        Token otherlv_22=null;
        Token lv_par1_23_0=null;
        Token lv_feature2_25_0=null;
        Token otherlv_26=null;
        Token lv_par2_27_0=null;
        Token lv_ruletyp_28_0=null;
        Token lv_rule_29_0=null;
        Token lv_feature1_30_0=null;
        Token otherlv_31=null;
        Token lv_par1_32_0=null;
        Token lv_feature2_34_0=null;
        Token otherlv_35=null;
        Token lv_par2_36_0=null;
        Token lv_ruletyp_37_0=null;
        Token lv_rule_38_0=null;
        Token lv_feature1_39_0=null;
        Token otherlv_40=null;
        Token lv_par1_41_0=null;
        Token lv_ruletyp_43_0=null;
        Token lv_rule_44_0=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token lv_ruletyp_48_0=null;
        Token lv_rule_49_0=null;
        Token lv_bracket_50_0=null;
        Token lv_ruletyp_51_0=null;
        Token lv_rule_52_0=null;
        Token lv_braces_53_0=null;
        Token lv_ruletyp_54_0=null;
        Token lv_rule_55_0=null;
        Token lv_parenthesis_56_0=null;
        Token lv_ruletyp_57_0=null;
        Token lv_rule_58_0=null;
        Token lv_angle_59_0=null;
        Token lv_ruletyp_60_0=null;
        Token lv_rule_61_0=null;
        Token lv_feature1_62_0=null;
        Token otherlv_63=null;
        Token lv_par1_64_0=null;
        Token lv_feature2_66_0=null;
        Token otherlv_67=null;
        Token lv_par2_68_0=null;
        EObject lv_prefix_9_0 = null;

        EObject lv_suffix_18_0 = null;

        EObject lv_infix_24_0 = null;

        EObject lv_infix_33_0 = null;

        EObject lv_inner_42_0 = null;

        EObject lv_prec_46_0 = null;

        EObject lv_infix_65_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:724:28: ( ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' ) | ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:725:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' ) | ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:725:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' ) | ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) ) )
            int alt20=13;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 16:
                {
                alt20=3;
                }
                break;
            case 17:
                {
                alt20=4;
                }
                break;
            case 35:
                {
                alt20=5;
                }
                break;
            case 36:
                {
                alt20=6;
                }
                break;
            case 37:
                {
                alt20=7;
                }
                break;
            case 38:
                {
                alt20=8;
                }
                break;
            case 41:
                {
                alt20=9;
                }
                break;
            case 19:
                {
                alt20=10;
                }
                break;
            case 42:
                {
                alt20=11;
                }
                break;
            case 43:
                {
                alt20=12;
                }
                break;
            case 44:
                {
                alt20=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:725:2: ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:725:2: ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:725:3: ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )?
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:725:3: ( (lv_ruletyp_0_0= 'CALLER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:726:1: (lv_ruletyp_0_0= 'CALLER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:726:1: (lv_ruletyp_0_0= 'CALLER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:727:3: lv_ruletyp_0_0= 'CALLER'
                    {
                    lv_ruletyp_0_0=(Token)match(input,31,FOLLOW_31_in_rulePrecedence1436); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "CALLER");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:740:2: ( (lv_rule_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:741:1: (lv_rule_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:741:1: (lv_rule_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:742:3: lv_rule_1_0= RULE_ID
                    {
                    lv_rule_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1466); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:758:2: (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==32) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:758:4: otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1484); 

                                	newLeafNode(otherlv_2, grammarAccess.getPrecedenceAccess().getFullStopKeyword_0_2_0());
                                
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:762:1: ( (lv_feature1_3_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:763:1: (lv_feature1_3_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:763:1: (lv_feature1_3_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:764:3: lv_feature1_3_0= RULE_ID
                            {
                            lv_feature1_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1501); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:781:6: ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:781:6: ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:781:7: ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:781:7: ( (lv_ruletyp_4_0= 'RULE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:782:1: (lv_ruletyp_4_0= 'RULE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:782:1: (lv_ruletyp_4_0= 'RULE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:783:3: lv_ruletyp_4_0= 'RULE'
                    {
                    lv_ruletyp_4_0=(Token)match(input,33,FOLLOW_33_in_rulePrecedence1534); 

                            newLeafNode(lv_ruletyp_4_0, grammarAccess.getPrecedenceAccess().getRuletypRULEKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_4_0, "RULE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:796:2: ( (lv_rule_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:797:1: (lv_rule_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:797:1: (lv_rule_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:798:3: lv_rule_5_0= RULE_ID
                    {
                    lv_rule_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1564); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:814:2: ( (lv_customrule_6_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:815:1: (lv_customrule_6_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:815:1: (lv_customrule_6_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:816:3: lv_customrule_6_0= RULE_STRING
                    {
                    lv_customrule_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrecedence1586); 

                    			newLeafNode(lv_customrule_6_0, grammarAccess.getPrecedenceAccess().getCustomruleSTRINGTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"customrule",
                            		lv_customrule_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:833:6: ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:833:6: ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:833:7: ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:833:7: ( (lv_ruletyp_7_0= 'PREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:834:1: (lv_ruletyp_7_0= 'PREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:834:1: (lv_ruletyp_7_0= 'PREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:835:3: lv_ruletyp_7_0= 'PREFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,16,FOLLOW_16_in_rulePrecedence1617); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "PREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:848:2: ( (lv_rule_8_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:849:1: (lv_rule_8_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:849:1: (lv_rule_8_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:850:3: lv_rule_8_0= RULE_ID
                    {
                    lv_rule_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1647); 

                    			newLeafNode(lv_rule_8_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_8_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:866:2: ( (lv_prefix_9_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:867:1: (lv_prefix_9_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:867:1: (lv_prefix_9_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:868:3: lv_prefix_9_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1673);
                    lv_prefix_9_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"prefix",
                            		lv_prefix_9_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:884:2: ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==34) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:884:3: ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:884:3: ( (lv_feature1_10_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:885:1: (lv_feature1_10_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:885:1: (lv_feature1_10_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:886:3: lv_feature1_10_0= RULE_ID
                            {
                            lv_feature1_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1691); 

                            			newLeafNode(lv_feature1_10_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_2_3_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_10_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_11=(Token)match(input,34,FOLLOW_34_in_rulePrecedence1708); 

                                	newLeafNode(otherlv_11, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_2_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:906:3: ( (lv_par1_12_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:907:1: (lv_par1_12_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:907:1: (lv_par1_12_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:908:3: lv_par1_12_0= RULE_ID
                    {
                    lv_par1_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1727); 

                    			newLeafNode(lv_par1_12_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_2_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_12_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:925:6: ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:925:6: ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:925:7: ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:925:7: ( (lv_ruletyp_13_0= 'SUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:1: (lv_ruletyp_13_0= 'SUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:926:1: (lv_ruletyp_13_0= 'SUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:927:3: lv_ruletyp_13_0= 'SUFFIX'
                    {
                    lv_ruletyp_13_0=(Token)match(input,17,FOLLOW_17_in_rulePrecedence1758); 

                            newLeafNode(lv_ruletyp_13_0, grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_13_0, "SUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:940:2: ( (lv_rule_14_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:941:1: (lv_rule_14_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:941:1: (lv_rule_14_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:942:3: lv_rule_14_0= RULE_ID
                    {
                    lv_rule_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1788); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:958:2: ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==34) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:958:3: ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:958:3: ( (lv_feature1_15_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:959:1: (lv_feature1_15_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:959:1: (lv_feature1_15_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:960:3: lv_feature1_15_0= RULE_ID
                            {
                            lv_feature1_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1811); 

                            			newLeafNode(lv_feature1_15_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_3_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_15_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_16=(Token)match(input,34,FOLLOW_34_in_rulePrecedence1828); 

                                	newLeafNode(otherlv_16, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:980:3: ( (lv_par1_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:981:1: (lv_par1_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:981:1: (lv_par1_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:982:3: lv_par1_17_0= RULE_ID
                    {
                    lv_par1_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1847); 

                    			newLeafNode(lv_par1_17_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_3_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_17_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:998:2: ( (lv_suffix_18_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:999:1: (lv_suffix_18_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:999:1: (lv_suffix_18_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1000:3: lv_suffix_18_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1873);
                    lv_suffix_18_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_18_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1017:6: ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1017:6: ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1017:7: ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1017:7: ( (lv_ruletyp_19_0= 'INFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1018:1: (lv_ruletyp_19_0= 'INFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1018:1: (lv_ruletyp_19_0= 'INFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1019:3: lv_ruletyp_19_0= 'INFIX'
                    {
                    lv_ruletyp_19_0=(Token)match(input,35,FOLLOW_35_in_rulePrecedence1899); 

                            newLeafNode(lv_ruletyp_19_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_19_0, "INFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1032:2: ( (lv_rule_20_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1033:1: (lv_rule_20_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1033:1: (lv_rule_20_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1034:3: lv_rule_20_0= RULE_ID
                    {
                    lv_rule_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1929); 

                    			newLeafNode(lv_rule_20_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_20_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1050:2: ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==34) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1050:3: ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1050:3: ( (lv_feature1_21_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1051:1: (lv_feature1_21_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1051:1: (lv_feature1_21_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1052:3: lv_feature1_21_0= RULE_ID
                            {
                            lv_feature1_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1952); 

                            			newLeafNode(lv_feature1_21_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_4_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_21_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_22=(Token)match(input,34,FOLLOW_34_in_rulePrecedence1969); 

                                	newLeafNode(otherlv_22, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1072:3: ( (lv_par1_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1073:1: (lv_par1_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1073:1: (lv_par1_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1074:3: lv_par1_23_0= RULE_ID
                    {
                    lv_par1_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1988); 

                    			newLeafNode(lv_par1_23_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_23_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1090:2: ( (lv_infix_24_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1091:1: (lv_infix_24_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1091:1: (lv_infix_24_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1092:3: lv_infix_24_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_4_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2014);
                    lv_infix_24_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_24_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1108:2: ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==34) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1108:3: ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1108:3: ( (lv_feature2_25_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1109:1: (lv_feature2_25_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1109:1: (lv_feature2_25_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1110:3: lv_feature2_25_0= RULE_ID
                            {
                            lv_feature2_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2032); 

                            			newLeafNode(lv_feature2_25_0, grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_4_5_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_25_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_26=(Token)match(input,34,FOLLOW_34_in_rulePrecedence2049); 

                                	newLeafNode(otherlv_26, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1130:3: ( (lv_par2_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1131:1: (lv_par2_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1131:1: (lv_par2_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1132:3: lv_par2_27_0= RULE_ID
                    {
                    lv_par2_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2068); 

                    			newLeafNode(lv_par2_27_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_4_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_27_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1149:6: ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1149:6: ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1149:7: ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1149:7: ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1150:1: (lv_ruletyp_28_0= 'INFIXRIGHT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1150:1: (lv_ruletyp_28_0= 'INFIXRIGHT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1151:3: lv_ruletyp_28_0= 'INFIXRIGHT'
                    {
                    lv_ruletyp_28_0=(Token)match(input,36,FOLLOW_36_in_rulePrecedence2099); 

                            newLeafNode(lv_ruletyp_28_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXRIGHTKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_28_0, "INFIXRIGHT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1164:2: ( (lv_rule_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1165:1: (lv_rule_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1165:1: (lv_rule_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1166:3: lv_rule_29_0= RULE_ID
                    {
                    lv_rule_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2129); 

                    			newLeafNode(lv_rule_29_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_29_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1182:2: ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==34) ) {
                            alt13=1;
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1182:3: ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1182:3: ( (lv_feature1_30_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1183:1: (lv_feature1_30_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1183:1: (lv_feature1_30_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1184:3: lv_feature1_30_0= RULE_ID
                            {
                            lv_feature1_30_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2152); 

                            			newLeafNode(lv_feature1_30_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_5_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_30_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_31=(Token)match(input,34,FOLLOW_34_in_rulePrecedence2169); 

                                	newLeafNode(otherlv_31, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_5_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1204:3: ( (lv_par1_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1205:1: (lv_par1_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1205:1: (lv_par1_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1206:3: lv_par1_32_0= RULE_ID
                    {
                    lv_par1_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2188); 

                    			newLeafNode(lv_par1_32_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_32_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1222:2: ( (lv_infix_33_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1223:1: (lv_infix_33_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1223:1: (lv_infix_33_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1224:3: lv_infix_33_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_5_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2214);
                    lv_infix_33_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_33_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1240:2: ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==34) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1240:3: ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1240:3: ( (lv_feature2_34_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1241:1: (lv_feature2_34_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1241:1: (lv_feature2_34_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1242:3: lv_feature2_34_0= RULE_ID
                            {
                            lv_feature2_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2232); 

                            			newLeafNode(lv_feature2_34_0, grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_5_5_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_34_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_35=(Token)match(input,34,FOLLOW_34_in_rulePrecedence2249); 

                                	newLeafNode(otherlv_35, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_5_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1262:3: ( (lv_par2_36_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1263:1: (lv_par2_36_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1263:1: (lv_par2_36_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1264:3: lv_par2_36_0= RULE_ID
                    {
                    lv_par2_36_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2268); 

                    			newLeafNode(lv_par2_36_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_5_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_36_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1281:6: ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1281:6: ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1281:7: ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1281:7: ( (lv_ruletyp_37_0= 'OUTER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1282:1: (lv_ruletyp_37_0= 'OUTER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1282:1: (lv_ruletyp_37_0= 'OUTER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1283:3: lv_ruletyp_37_0= 'OUTER'
                    {
                    lv_ruletyp_37_0=(Token)match(input,37,FOLLOW_37_in_rulePrecedence2299); 

                            newLeafNode(lv_ruletyp_37_0, grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_37_0, "OUTER");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1296:2: ( (lv_rule_38_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1297:1: (lv_rule_38_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1297:1: (lv_rule_38_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1298:3: lv_rule_38_0= RULE_ID
                    {
                    lv_rule_38_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2329); 

                    			newLeafNode(lv_rule_38_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_38_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:2: ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==34) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:3: ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1314:3: ( (lv_feature1_39_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1315:1: (lv_feature1_39_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1315:1: (lv_feature1_39_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1316:3: lv_feature1_39_0= RULE_ID
                            {
                            lv_feature1_39_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2352); 

                            			newLeafNode(lv_feature1_39_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_6_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_39_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_40=(Token)match(input,34,FOLLOW_34_in_rulePrecedence2369); 

                                	newLeafNode(otherlv_40, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_6_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1336:3: ( (lv_par1_41_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1337:1: (lv_par1_41_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1337:1: (lv_par1_41_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1338:3: lv_par1_41_0= RULE_ID
                    {
                    lv_par1_41_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2388); 

                    			newLeafNode(lv_par1_41_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_6_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_41_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1354:2: ( (lv_inner_42_0= ruleInnerPrecedence ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=54 && LA16_0<=62)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1355:1: (lv_inner_42_0= ruleInnerPrecedence )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1355:1: (lv_inner_42_0= ruleInnerPrecedence )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1356:3: lv_inner_42_0= ruleInnerPrecedence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInnerInnerPrecedenceParserRuleCall_6_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInnerPrecedence_in_rulePrecedence2414);
                    	    lv_inner_42_0=ruleInnerPrecedence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inner",
                    	            		lv_inner_42_0, 
                    	            		"InnerPrecedence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1373:6: ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1373:6: ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1373:7: ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')'
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1373:7: ( (lv_ruletyp_43_0= 'COMPOUND' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1374:1: (lv_ruletyp_43_0= 'COMPOUND' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1374:1: (lv_ruletyp_43_0= 'COMPOUND' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1375:3: lv_ruletyp_43_0= 'COMPOUND'
                    {
                    lv_ruletyp_43_0=(Token)match(input,38,FOLLOW_38_in_rulePrecedence2441); 

                            newLeafNode(lv_ruletyp_43_0, grammarAccess.getPrecedenceAccess().getRuletypCOMPOUNDKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_43_0, "COMPOUND");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1388:2: ( (lv_rule_44_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1389:1: (lv_rule_44_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1389:1: (lv_rule_44_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1390:3: lv_rule_44_0= RULE_ID
                    {
                    lv_rule_44_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2471); 

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

                    otherlv_45=(Token)match(input,39,FOLLOW_39_in_rulePrecedence2488); 

                        	newLeafNode(otherlv_45, grammarAccess.getPrecedenceAccess().getLeftParenthesisKeyword_7_2());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1410:1: ( (lv_prec_46_0= ruleSubPrecedence ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=45 && LA17_0<=53)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1411:1: (lv_prec_46_0= ruleSubPrecedence )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1411:1: (lv_prec_46_0= ruleSubPrecedence )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1412:3: lv_prec_46_0= ruleSubPrecedence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getPrecSubPrecedenceParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubPrecedence_in_rulePrecedence2509);
                    	    lv_prec_46_0=ruleSubPrecedence();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"prec",
                    	            		lv_prec_46_0, 
                    	            		"SubPrecedence");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_47=(Token)match(input,40,FOLLOW_40_in_rulePrecedence2522); 

                        	newLeafNode(otherlv_47, grammarAccess.getPrecedenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1433:6: ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1433:6: ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1433:7: ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1433:7: ( (lv_ruletyp_48_0= 'BRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1434:1: (lv_ruletyp_48_0= 'BRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1434:1: (lv_ruletyp_48_0= 'BRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1435:3: lv_ruletyp_48_0= 'BRACKET'
                    {
                    lv_ruletyp_48_0=(Token)match(input,41,FOLLOW_41_in_rulePrecedence2548); 

                            newLeafNode(lv_ruletyp_48_0, grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_48_0, "BRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1448:2: ( (lv_rule_49_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1449:1: (lv_rule_49_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1449:1: (lv_rule_49_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1450:3: lv_rule_49_0= RULE_ID
                    {
                    lv_rule_49_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2578); 

                    			newLeafNode(lv_rule_49_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 
                    		

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1466:2: ( (lv_bracket_50_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1467:1: (lv_bracket_50_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1467:1: (lv_bracket_50_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1468:3: lv_bracket_50_0= RULE_ID
                    {
                    lv_bracket_50_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2600); 

                    			newLeafNode(lv_bracket_50_0, grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bracket",
                            		lv_bracket_50_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1485:6: ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1485:6: ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1485:7: ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1485:7: ( (lv_ruletyp_51_0= 'BRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1486:1: (lv_ruletyp_51_0= 'BRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1486:1: (lv_ruletyp_51_0= 'BRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1487:3: lv_ruletyp_51_0= 'BRACES'
                    {
                    lv_ruletyp_51_0=(Token)match(input,19,FOLLOW_19_in_rulePrecedence2631); 

                            newLeafNode(lv_ruletyp_51_0, grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_51_0, "BRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1500:2: ( (lv_rule_52_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1501:1: (lv_rule_52_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1501:1: (lv_rule_52_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1502:3: lv_rule_52_0= RULE_ID
                    {
                    lv_rule_52_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2661); 

                    			newLeafNode(lv_rule_52_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_52_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1518:2: ( (lv_braces_53_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1519:1: (lv_braces_53_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1519:1: (lv_braces_53_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1520:3: lv_braces_53_0= RULE_ID
                    {
                    lv_braces_53_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2683); 

                    			newLeafNode(lv_braces_53_0, grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"braces",
                            		lv_braces_53_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1537:6: ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1537:6: ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1537:7: ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1537:7: ( (lv_ruletyp_54_0= 'PARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1538:1: (lv_ruletyp_54_0= 'PARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1538:1: (lv_ruletyp_54_0= 'PARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1539:3: lv_ruletyp_54_0= 'PARENTHESIS'
                    {
                    lv_ruletyp_54_0=(Token)match(input,42,FOLLOW_42_in_rulePrecedence2714); 

                            newLeafNode(lv_ruletyp_54_0, grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_54_0, "PARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1552:2: ( (lv_rule_55_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1553:1: (lv_rule_55_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1553:1: (lv_rule_55_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1554:3: lv_rule_55_0= RULE_ID
                    {
                    lv_rule_55_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2744); 

                    			newLeafNode(lv_rule_55_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_55_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1570:2: ( (lv_parenthesis_56_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1571:1: (lv_parenthesis_56_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1571:1: (lv_parenthesis_56_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1572:3: lv_parenthesis_56_0= RULE_ID
                    {
                    lv_parenthesis_56_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2766); 

                    			newLeafNode(lv_parenthesis_56_0, grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parenthesis",
                            		lv_parenthesis_56_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1589:6: ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1589:6: ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1589:7: ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1589:7: ( (lv_ruletyp_57_0= 'ANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1590:1: (lv_ruletyp_57_0= 'ANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1590:1: (lv_ruletyp_57_0= 'ANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1591:3: lv_ruletyp_57_0= 'ANGLE'
                    {
                    lv_ruletyp_57_0=(Token)match(input,43,FOLLOW_43_in_rulePrecedence2797); 

                            newLeafNode(lv_ruletyp_57_0, grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_57_0, "ANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1604:2: ( (lv_rule_58_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1605:1: (lv_rule_58_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1605:1: (lv_rule_58_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1606:3: lv_rule_58_0= RULE_ID
                    {
                    lv_rule_58_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2827); 

                    			newLeafNode(lv_rule_58_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_11_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_58_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1622:2: ( (lv_angle_59_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1623:1: (lv_angle_59_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1623:1: (lv_angle_59_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1624:3: lv_angle_59_0= RULE_ID
                    {
                    lv_angle_59_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2849); 

                    			newLeafNode(lv_angle_59_0, grammarAccess.getPrecedenceAccess().getAngleIDTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"angle",
                            		lv_angle_59_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1641:6: ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1641:6: ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1641:7: ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1641:7: ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1642:1: (lv_ruletyp_60_0= 'MEMBERFEATURE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1642:1: (lv_ruletyp_60_0= 'MEMBERFEATURE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1643:3: lv_ruletyp_60_0= 'MEMBERFEATURE'
                    {
                    lv_ruletyp_60_0=(Token)match(input,44,FOLLOW_44_in_rulePrecedence2880); 

                            newLeafNode(lv_ruletyp_60_0, grammarAccess.getPrecedenceAccess().getRuletypMEMBERFEATUREKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_60_0, "MEMBERFEATURE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1656:2: ( (lv_rule_61_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1657:1: (lv_rule_61_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1657:1: (lv_rule_61_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1658:3: lv_rule_61_0= RULE_ID
                    {
                    lv_rule_61_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2910); 

                    			newLeafNode(lv_rule_61_0, grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_12_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_61_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1674:2: ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==34) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1674:3: ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1674:3: ( (lv_feature1_62_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1675:1: (lv_feature1_62_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1675:1: (lv_feature1_62_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1676:3: lv_feature1_62_0= RULE_ID
                            {
                            lv_feature1_62_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2933); 

                            			newLeafNode(lv_feature1_62_0, grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_12_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_62_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_63=(Token)match(input,34,FOLLOW_34_in_rulePrecedence2950); 

                                	newLeafNode(otherlv_63, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_12_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1696:3: ( (lv_par1_64_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1697:1: (lv_par1_64_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1697:1: (lv_par1_64_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1698:3: lv_par1_64_0= RULE_ID
                    {
                    lv_par1_64_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2969); 

                    			newLeafNode(lv_par1_64_0, grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_12_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_64_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1714:2: ( (lv_infix_65_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1715:1: (lv_infix_65_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1715:1: (lv_infix_65_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1716:3: lv_infix_65_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_12_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2995);
                    lv_infix_65_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_65_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1732:2: ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==34) ) {
                            alt19=1;
                        }
                    }
                    switch (alt19) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1732:3: ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1732:3: ( (lv_feature2_66_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1733:1: (lv_feature2_66_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1733:1: (lv_feature2_66_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1734:3: lv_feature2_66_0= RULE_ID
                            {
                            lv_feature2_66_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence3013); 

                            			newLeafNode(lv_feature2_66_0, grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_12_5_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_66_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_67=(Token)match(input,34,FOLLOW_34_in_rulePrecedence3030); 

                                	newLeafNode(otherlv_67, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_12_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1754:3: ( (lv_par2_68_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1755:1: (lv_par2_68_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1755:1: (lv_par2_68_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1756:3: lv_par2_68_0= RULE_ID
                    {
                    lv_par2_68_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence3049); 

                    			newLeafNode(lv_par2_68_0, grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_12_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_68_0, 
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


    // $ANTLR start "entryRuleSubPrecedence"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1780:1: entryRuleSubPrecedence returns [EObject current=null] : iv_ruleSubPrecedence= ruleSubPrecedence EOF ;
    public final EObject entryRuleSubPrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1781:2: (iv_ruleSubPrecedence= ruleSubPrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1782:2: iv_ruleSubPrecedence= ruleSubPrecedence EOF
            {
             newCompositeNode(grammarAccess.getSubPrecedenceRule()); 
            pushFollow(FOLLOW_ruleSubPrecedence_in_entryRuleSubPrecedence3091);
            iv_ruleSubPrecedence=ruleSubPrecedence();

            state._fsp--;

             current =iv_ruleSubPrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPrecedence3101); 

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
    // $ANTLR end "entryRuleSubPrecedence"


    // $ANTLR start "ruleSubPrecedence"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1789:1: ruleSubPrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) ) ;
    public final EObject ruleSubPrecedence() throws RecognitionException {
        EObject current = null;

        Token lv_ruletyp_0_0=null;
        Token lv_customrule_1_0=null;
        Token lv_ruletyp_2_0=null;
        Token lv_feature1_4_0=null;
        Token otherlv_5=null;
        Token lv_par2_6_0=null;
        Token lv_ruletyp_7_0=null;
        Token lv_ruletyp_9_0=null;
        Token lv_feature1_10_0=null;
        Token otherlv_11=null;
        Token lv_par1_12_0=null;
        Token lv_feature2_14_0=null;
        Token otherlv_15=null;
        Token lv_par2_16_0=null;
        Token lv_ruletyp_17_0=null;
        Token lv_feature1_18_0=null;
        Token otherlv_19=null;
        Token lv_par1_20_0=null;
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
        EObject lv_prefix_3_0 = null;

        EObject lv_suffix_8_0 = null;

        EObject lv_infix_13_0 = null;

        EObject lv_infix_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1792:28: ( ( ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1793:1: ( ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1793:1: ( ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) )
            int alt26=9;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt26=1;
                }
                break;
            case 46:
                {
                alt26=2;
                }
                break;
            case 47:
                {
                alt26=3;
                }
                break;
            case 48:
                {
                alt26=4;
                }
                break;
            case 49:
                {
                alt26=5;
                }
                break;
            case 50:
                {
                alt26=6;
                }
                break;
            case 51:
                {
                alt26=7;
                }
                break;
            case 52:
                {
                alt26=8;
                }
                break;
            case 53:
                {
                alt26=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1793:2: ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1793:2: ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1793:3: ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1793:3: ( (lv_ruletyp_0_0= 'SUBRULE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1794:1: (lv_ruletyp_0_0= 'SUBRULE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1794:1: (lv_ruletyp_0_0= 'SUBRULE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1795:3: lv_ruletyp_0_0= 'SUBRULE'
                    {
                    lv_ruletyp_0_0=(Token)match(input,45,FOLLOW_45_in_ruleSubPrecedence3145); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBRULEKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "SUBRULE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1808:2: ( (lv_customrule_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1809:1: (lv_customrule_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1809:1: (lv_customrule_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1810:3: lv_customrule_1_0= RULE_STRING
                    {
                    lv_customrule_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSubPrecedence3175); 

                    			newLeafNode(lv_customrule_1_0, grammarAccess.getSubPrecedenceAccess().getCustomruleSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"customrule",
                            		lv_customrule_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1827:6: ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1827:6: ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1827:7: ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1827:7: ( (lv_ruletyp_2_0= 'SUBPREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1828:1: (lv_ruletyp_2_0= 'SUBPREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1828:1: (lv_ruletyp_2_0= 'SUBPREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1829:3: lv_ruletyp_2_0= 'SUBPREFIX'
                    {
                    lv_ruletyp_2_0=(Token)match(input,46,FOLLOW_46_in_ruleSubPrecedence3206); 

                            newLeafNode(lv_ruletyp_2_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBPREFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_2_0, "SUBPREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1842:2: ( (lv_prefix_3_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1843:1: (lv_prefix_3_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1843:1: (lv_prefix_3_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1844:3: lv_prefix_3_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubPrecedenceAccess().getPrefixMultStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleSubPrecedence3240);
                    lv_prefix_3_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"prefix",
                            		lv_prefix_3_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1860:2: ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==34) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1860:3: ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1860:3: ( (lv_feature1_4_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1861:1: (lv_feature1_4_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1861:1: (lv_feature1_4_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1862:3: lv_feature1_4_0= RULE_ID
                            {
                            lv_feature1_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3258); 

                            			newLeafNode(lv_feature1_4_0, grammarAccess.getSubPrecedenceAccess().getFeature1IDTerminalRuleCall_1_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_4_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleSubPrecedence3275); 

                                	newLeafNode(otherlv_5, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_1_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1882:3: ( (lv_par2_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1883:1: (lv_par2_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1883:1: (lv_par2_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1884:3: lv_par2_6_0= RULE_ID
                    {
                    lv_par2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3294); 

                    			newLeafNode(lv_par2_6_0, grammarAccess.getSubPrecedenceAccess().getPar2IDTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1901:6: ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1901:6: ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1901:7: ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1901:7: ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1902:1: (lv_ruletyp_7_0= 'SUBSUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1902:1: (lv_ruletyp_7_0= 'SUBSUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1903:3: lv_ruletyp_7_0= 'SUBSUFFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,47,FOLLOW_47_in_ruleSubPrecedence3325); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBSUFFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "SUBSUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1916:2: ( (lv_suffix_8_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1917:1: (lv_suffix_8_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1917:1: (lv_suffix_8_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1918:3: lv_suffix_8_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubPrecedenceAccess().getSuffixMultStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleSubPrecedence3359);
                    lv_suffix_8_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_8_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1935:6: ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1935:6: ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1935:7: ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1935:7: ( (lv_ruletyp_9_0= 'SUBINFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1936:1: (lv_ruletyp_9_0= 'SUBINFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1936:1: (lv_ruletyp_9_0= 'SUBINFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1937:3: lv_ruletyp_9_0= 'SUBINFIX'
                    {
                    lv_ruletyp_9_0=(Token)match(input,48,FOLLOW_48_in_ruleSubPrecedence3385); 

                            newLeafNode(lv_ruletyp_9_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBINFIXKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_9_0, "SUBINFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1950:2: ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1==34) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1950:3: ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1950:3: ( (lv_feature1_10_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1951:1: (lv_feature1_10_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1951:1: (lv_feature1_10_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1952:3: lv_feature1_10_0= RULE_ID
                            {
                            lv_feature1_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3416); 

                            			newLeafNode(lv_feature1_10_0, grammarAccess.getSubPrecedenceAccess().getFeature1IDTerminalRuleCall_3_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_10_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleSubPrecedence3433); 

                                	newLeafNode(otherlv_11, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_3_1_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1972:3: ( (lv_par1_12_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1973:1: (lv_par1_12_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1973:1: (lv_par1_12_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1974:3: lv_par1_12_0= RULE_ID
                    {
                    lv_par1_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3452); 

                    			newLeafNode(lv_par1_12_0, grammarAccess.getSubPrecedenceAccess().getPar1IDTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_12_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1990:2: ( (lv_infix_13_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1991:1: (lv_infix_13_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1991:1: (lv_infix_13_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1992:3: lv_infix_13_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubPrecedenceAccess().getInfixMultStringParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleSubPrecedence3478);
                    lv_infix_13_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_13_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2008:2: ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==34) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2008:3: ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2008:3: ( (lv_feature2_14_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2009:1: (lv_feature2_14_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2009:1: (lv_feature2_14_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2010:3: lv_feature2_14_0= RULE_ID
                            {
                            lv_feature2_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3496); 

                            			newLeafNode(lv_feature2_14_0, grammarAccess.getSubPrecedenceAccess().getFeature2IDTerminalRuleCall_3_4_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_14_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleSubPrecedence3513); 

                                	newLeafNode(otherlv_15, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_3_4_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2030:3: ( (lv_par2_16_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2031:1: (lv_par2_16_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2031:1: (lv_par2_16_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2032:3: lv_par2_16_0= RULE_ID
                    {
                    lv_par2_16_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3532); 

                    			newLeafNode(lv_par2_16_0, grammarAccess.getSubPrecedenceAccess().getPar2IDTerminalRuleCall_3_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_16_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2049:6: ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2049:6: ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2049:7: ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2049:7: ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2050:1: (lv_ruletyp_17_0= 'SUBINFIXRIGHT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2050:1: (lv_ruletyp_17_0= 'SUBINFIXRIGHT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2051:3: lv_ruletyp_17_0= 'SUBINFIXRIGHT'
                    {
                    lv_ruletyp_17_0=(Token)match(input,49,FOLLOW_49_in_ruleSubPrecedence3563); 

                            newLeafNode(lv_ruletyp_17_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBINFIXRIGHTKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_17_0, "SUBINFIXRIGHT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2064:2: ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        int LA24_1 = input.LA(2);

                        if ( (LA24_1==34) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2064:3: ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2064:3: ( (lv_feature1_18_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2065:1: (lv_feature1_18_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2065:1: (lv_feature1_18_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2066:3: lv_feature1_18_0= RULE_ID
                            {
                            lv_feature1_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3594); 

                            			newLeafNode(lv_feature1_18_0, grammarAccess.getSubPrecedenceAccess().getFeature1IDTerminalRuleCall_4_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_18_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_19=(Token)match(input,34,FOLLOW_34_in_ruleSubPrecedence3611); 

                                	newLeafNode(otherlv_19, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_4_1_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2086:3: ( (lv_par1_20_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2087:1: (lv_par1_20_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2087:1: (lv_par1_20_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2088:3: lv_par1_20_0= RULE_ID
                    {
                    lv_par1_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3630); 

                    			newLeafNode(lv_par1_20_0, grammarAccess.getSubPrecedenceAccess().getPar1IDTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par1",
                            		lv_par1_20_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2104:2: ( (lv_infix_21_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2105:1: (lv_infix_21_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2105:1: (lv_infix_21_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2106:3: lv_infix_21_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubPrecedenceAccess().getInfixMultStringParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleSubPrecedence3656);
                    lv_infix_21_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_21_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2122:2: ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==34) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2122:3: ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2122:3: ( (lv_feature2_22_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2123:1: (lv_feature2_22_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2123:1: (lv_feature2_22_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2124:3: lv_feature2_22_0= RULE_ID
                            {
                            lv_feature2_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3674); 

                            			newLeafNode(lv_feature2_22_0, grammarAccess.getSubPrecedenceAccess().getFeature2IDTerminalRuleCall_4_4_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_22_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_23=(Token)match(input,34,FOLLOW_34_in_ruleSubPrecedence3691); 

                                	newLeafNode(otherlv_23, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_4_4_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2144:3: ( (lv_par2_24_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2145:1: (lv_par2_24_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2145:1: (lv_par2_24_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2146:3: lv_par2_24_0= RULE_ID
                    {
                    lv_par2_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3710); 

                    			newLeafNode(lv_par2_24_0, grammarAccess.getSubPrecedenceAccess().getPar2IDTerminalRuleCall_4_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
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
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2163:6: ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2163:6: ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2163:7: ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2163:7: ( (lv_ruletyp_25_0= 'SUBBRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2164:1: (lv_ruletyp_25_0= 'SUBBRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2164:1: (lv_ruletyp_25_0= 'SUBBRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2165:3: lv_ruletyp_25_0= 'SUBBRACKET'
                    {
                    lv_ruletyp_25_0=(Token)match(input,50,FOLLOW_50_in_ruleSubPrecedence3741); 

                            newLeafNode(lv_ruletyp_25_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBBRACKETKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_25_0, "SUBBRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2178:2: ( (lv_rule_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2179:1: (lv_rule_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2179:1: (lv_rule_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2180:3: lv_rule_26_0= RULE_ID
                    {
                    lv_rule_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3771); 

                    			newLeafNode(lv_rule_26_0, grammarAccess.getSubPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_26_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2196:2: ( (lv_bracket_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2197:1: (lv_bracket_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2197:1: (lv_bracket_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2198:3: lv_bracket_27_0= RULE_ID
                    {
                    lv_bracket_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3793); 

                    			newLeafNode(lv_bracket_27_0, grammarAccess.getSubPrecedenceAccess().getBracketIDTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
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
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2215:6: ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2215:6: ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2215:7: ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2215:7: ( (lv_ruletyp_28_0= 'SUBBRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2216:1: (lv_ruletyp_28_0= 'SUBBRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2216:1: (lv_ruletyp_28_0= 'SUBBRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2217:3: lv_ruletyp_28_0= 'SUBBRACES'
                    {
                    lv_ruletyp_28_0=(Token)match(input,51,FOLLOW_51_in_ruleSubPrecedence3824); 

                            newLeafNode(lv_ruletyp_28_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBBRACESKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_28_0, "SUBBRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2230:2: ( (lv_rule_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2231:1: (lv_rule_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2231:1: (lv_rule_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2232:3: lv_rule_29_0= RULE_ID
                    {
                    lv_rule_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3854); 

                    			newLeafNode(lv_rule_29_0, grammarAccess.getSubPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_29_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2248:2: ( (lv_braces_30_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2249:1: (lv_braces_30_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2249:1: (lv_braces_30_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2250:3: lv_braces_30_0= RULE_ID
                    {
                    lv_braces_30_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3876); 

                    			newLeafNode(lv_braces_30_0, grammarAccess.getSubPrecedenceAccess().getBracesIDTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
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
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2267:6: ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2267:6: ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2267:7: ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2267:7: ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2268:1: (lv_ruletyp_31_0= 'SUBPARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2268:1: (lv_ruletyp_31_0= 'SUBPARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2269:3: lv_ruletyp_31_0= 'SUBPARENTHESIS'
                    {
                    lv_ruletyp_31_0=(Token)match(input,52,FOLLOW_52_in_ruleSubPrecedence3907); 

                            newLeafNode(lv_ruletyp_31_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBPARENTHESISKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_31_0, "SUBPARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2282:2: ( (lv_rule_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2283:1: (lv_rule_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2283:1: (lv_rule_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2284:3: lv_rule_32_0= RULE_ID
                    {
                    lv_rule_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3937); 

                    			newLeafNode(lv_rule_32_0, grammarAccess.getSubPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_32_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2300:2: ( (lv_parenthesis_33_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2301:1: (lv_parenthesis_33_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2301:1: (lv_parenthesis_33_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2302:3: lv_parenthesis_33_0= RULE_ID
                    {
                    lv_parenthesis_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3959); 

                    			newLeafNode(lv_parenthesis_33_0, grammarAccess.getSubPrecedenceAccess().getParenthesisIDTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
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
                case 9 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2319:6: ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2319:6: ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2319:7: ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2319:7: ( (lv_ruletyp_34_0= 'SUBANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2320:1: (lv_ruletyp_34_0= 'SUBANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2320:1: (lv_ruletyp_34_0= 'SUBANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2321:3: lv_ruletyp_34_0= 'SUBANGLE'
                    {
                    lv_ruletyp_34_0=(Token)match(input,53,FOLLOW_53_in_ruleSubPrecedence3990); 

                            newLeafNode(lv_ruletyp_34_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBANGLEKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_34_0, "SUBANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2334:2: ( (lv_rule_35_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2335:1: (lv_rule_35_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2335:1: (lv_rule_35_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2336:3: lv_rule_35_0= RULE_ID
                    {
                    lv_rule_35_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence4020); 

                    			newLeafNode(lv_rule_35_0, grammarAccess.getSubPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_35_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2352:2: ( (lv_angle_36_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2353:1: (lv_angle_36_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2353:1: (lv_angle_36_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2354:3: lv_angle_36_0= RULE_ID
                    {
                    lv_angle_36_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence4042); 

                    			newLeafNode(lv_angle_36_0, grammarAccess.getSubPrecedenceAccess().getAngleIDTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
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
    // $ANTLR end "ruleSubPrecedence"


    // $ANTLR start "entryRuleInnerPrecedence"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2378:1: entryRuleInnerPrecedence returns [EObject current=null] : iv_ruleInnerPrecedence= ruleInnerPrecedence EOF ;
    public final EObject entryRuleInnerPrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerPrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2379:2: (iv_ruleInnerPrecedence= ruleInnerPrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2380:2: iv_ruleInnerPrecedence= ruleInnerPrecedence EOF
            {
             newCompositeNode(grammarAccess.getInnerPrecedenceRule()); 
            pushFollow(FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence4084);
            iv_ruleInnerPrecedence=ruleInnerPrecedence();

            state._fsp--;

             current =iv_ruleInnerPrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerPrecedence4094); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2387:1: ruleInnerPrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) ) ) ;
    public final EObject ruleInnerPrecedence() throws RecognitionException {
        EObject current = null;

        Token lv_ruletyp_0_0=null;
        Token lv_customrule_1_0=null;
        Token lv_ruletyp_2_0=null;
        Token lv_feature1_4_0=null;
        Token otherlv_5=null;
        Token lv_par2_6_0=null;
        Token lv_ruletyp_7_0=null;
        Token lv_ruletyp_9_0=null;
        Token lv_mod_10_0=null;
        Token lv_rule_11_0=null;
        Token otherlv_12=null;
        Token lv_feature1_13_0=null;
        Token lv_feature2_15_0=null;
        Token otherlv_16=null;
        Token lv_par2_17_0=null;
        Token lv_ruletyp_18_0=null;
        Token lv_mod_19_0=null;
        Token lv_rule_20_0=null;
        Token otherlv_21=null;
        Token lv_feature1_22_0=null;
        Token lv_feature2_24_0=null;
        Token otherlv_25=null;
        Token lv_par2_26_0=null;
        Token lv_ruletyp_27_0=null;
        Token lv_rule_28_0=null;
        Token lv_bracket_29_0=null;
        Token lv_ruletyp_30_0=null;
        Token lv_rule_31_0=null;
        Token lv_braces_32_0=null;
        Token lv_ruletyp_33_0=null;
        Token lv_rule_34_0=null;
        Token lv_parenthesis_35_0=null;
        Token lv_ruletyp_36_0=null;
        Token lv_rule_37_0=null;
        Token lv_angle_38_0=null;
        EObject lv_prefix_3_0 = null;

        EObject lv_suffix_8_0 = null;

        EObject lv_infix_14_0 = null;

        EObject lv_infix_23_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2390:28: ( ( ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2391:1: ( ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2391:1: ( ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) ) )
            int alt34=9;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt34=1;
                }
                break;
            case 55:
                {
                alt34=2;
                }
                break;
            case 56:
                {
                alt34=3;
                }
                break;
            case 57:
                {
                alt34=4;
                }
                break;
            case 58:
                {
                alt34=5;
                }
                break;
            case 59:
                {
                alt34=6;
                }
                break;
            case 60:
                {
                alt34=7;
                }
                break;
            case 61:
                {
                alt34=8;
                }
                break;
            case 62:
                {
                alt34=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2391:2: ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2391:2: ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2391:3: ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2391:3: ( (lv_ruletyp_0_0= 'INNERRULE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2392:1: (lv_ruletyp_0_0= 'INNERRULE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2392:1: (lv_ruletyp_0_0= 'INNERRULE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2393:3: lv_ruletyp_0_0= 'INNERRULE'
                    {
                    lv_ruletyp_0_0=(Token)match(input,54,FOLLOW_54_in_ruleInnerPrecedence4138); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERRULEKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "INNERRULE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2406:2: ( (lv_customrule_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2407:1: (lv_customrule_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2407:1: (lv_customrule_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2408:3: lv_customrule_1_0= RULE_STRING
                    {
                    lv_customrule_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInnerPrecedence4168); 

                    			newLeafNode(lv_customrule_1_0, grammarAccess.getInnerPrecedenceAccess().getCustomruleSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"customrule",
                            		lv_customrule_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2425:6: ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2425:6: ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2425:7: ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2425:7: ( (lv_ruletyp_2_0= 'INNERPREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2426:1: (lv_ruletyp_2_0= 'INNERPREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2426:1: (lv_ruletyp_2_0= 'INNERPREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2427:3: lv_ruletyp_2_0= 'INNERPREFIX'
                    {
                    lv_ruletyp_2_0=(Token)match(input,55,FOLLOW_55_in_ruleInnerPrecedence4199); 

                            newLeafNode(lv_ruletyp_2_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_2_0, "INNERPREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2440:2: ( (lv_prefix_3_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2441:1: (lv_prefix_3_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2441:1: (lv_prefix_3_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2442:3: lv_prefix_3_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getPrefixMultStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence4233);
                    lv_prefix_3_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"prefix",
                            		lv_prefix_3_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2458:2: ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) ) {
                        int LA27_1 = input.LA(2);

                        if ( (LA27_1==34) ) {
                            alt27=1;
                        }
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2458:3: ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2458:3: ( (lv_feature1_4_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2459:1: (lv_feature1_4_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2459:1: (lv_feature1_4_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2460:3: lv_feature1_4_0= RULE_ID
                            {
                            lv_feature1_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4251); 

                            			newLeafNode(lv_feature1_4_0, grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_1_2_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature1",
                                    		lv_feature1_4_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleInnerPrecedence4268); 

                                	newLeafNode(otherlv_5, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_1_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2480:3: ( (lv_par2_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2481:1: (lv_par2_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2481:1: (lv_par2_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2482:3: lv_par2_6_0= RULE_ID
                    {
                    lv_par2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4287); 

                    			newLeafNode(lv_par2_6_0, grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2499:6: ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2499:6: ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2499:7: ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2499:7: ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2500:1: (lv_ruletyp_7_0= 'INNERSUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2500:1: (lv_ruletyp_7_0= 'INNERSUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2501:3: lv_ruletyp_7_0= 'INNERSUFFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,56,FOLLOW_56_in_ruleInnerPrecedence4318); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "INNERSUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2514:2: ( (lv_suffix_8_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2515:1: (lv_suffix_8_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2515:1: (lv_suffix_8_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2516:3: lv_suffix_8_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getSuffixMultStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence4352);
                    lv_suffix_8_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"suffix",
                            		lv_suffix_8_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2533:6: ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2533:6: ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2533:7: ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2533:7: ( (lv_ruletyp_9_0= 'INNERINFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2534:1: (lv_ruletyp_9_0= 'INNERINFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2534:1: (lv_ruletyp_9_0= 'INNERINFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2535:3: lv_ruletyp_9_0= 'INNERINFIX'
                    {
                    lv_ruletyp_9_0=(Token)match(input,57,FOLLOW_57_in_ruleInnerPrecedence4378); 

                            newLeafNode(lv_ruletyp_9_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_9_0, "INNERINFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2548:2: ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==31) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2548:3: ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )?
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2548:3: ( (lv_mod_10_0= 'CALLER' ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2549:1: (lv_mod_10_0= 'CALLER' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2549:1: (lv_mod_10_0= 'CALLER' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2550:3: lv_mod_10_0= 'CALLER'
                            {
                            lv_mod_10_0=(Token)match(input,31,FOLLOW_31_in_ruleInnerPrecedence4410); 

                                    newLeafNode(lv_mod_10_0, grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_3_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "mod", lv_mod_10_0, "CALLER");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2563:2: ( (lv_rule_11_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2564:1: (lv_rule_11_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2564:1: (lv_rule_11_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2565:3: lv_rule_11_0= RULE_ID
                            {
                            lv_rule_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4440); 

                            			newLeafNode(lv_rule_11_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"rule",
                                    		lv_rule_11_0, 
                                    		"ID");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2581:2: (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==32) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2581:4: otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) )
                                    {
                                    otherlv_12=(Token)match(input,32,FOLLOW_32_in_ruleInnerPrecedence4458); 

                                        	newLeafNode(otherlv_12, grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_3_1_2_0());
                                        
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2585:1: ( (lv_feature1_13_0= RULE_ID ) )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2586:1: (lv_feature1_13_0= RULE_ID )
                                    {
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2586:1: (lv_feature1_13_0= RULE_ID )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2587:3: lv_feature1_13_0= RULE_ID
                                    {
                                    lv_feature1_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4475); 

                                    			newLeafNode(lv_feature1_13_0, grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_3_1_2_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"feature1",
                                            		lv_feature1_13_0, 
                                            		"ID");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2603:6: ( (lv_infix_14_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2604:1: (lv_infix_14_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2604:1: (lv_infix_14_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2605:3: lv_infix_14_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence4505);
                    lv_infix_14_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_14_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2621:2: ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==34) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2621:3: ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2621:3: ( (lv_feature2_15_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2622:1: (lv_feature2_15_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2622:1: (lv_feature2_15_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2623:3: lv_feature2_15_0= RULE_ID
                            {
                            lv_feature2_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4523); 

                            			newLeafNode(lv_feature2_15_0, grammarAccess.getInnerPrecedenceAccess().getFeature2IDTerminalRuleCall_3_3_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_15_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_16=(Token)match(input,34,FOLLOW_34_in_ruleInnerPrecedence4540); 

                                	newLeafNode(otherlv_16, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_3_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2643:3: ( (lv_par2_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2644:1: (lv_par2_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2644:1: (lv_par2_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2645:3: lv_par2_17_0= RULE_ID
                    {
                    lv_par2_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4559); 

                    			newLeafNode(lv_par2_17_0, grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_3_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2662:6: ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2662:6: ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2662:7: ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2662:7: ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2663:1: (lv_ruletyp_18_0= 'INNERINFIXRIGHT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2663:1: (lv_ruletyp_18_0= 'INNERINFIXRIGHT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2664:3: lv_ruletyp_18_0= 'INNERINFIXRIGHT'
                    {
                    lv_ruletyp_18_0=(Token)match(input,58,FOLLOW_58_in_ruleInnerPrecedence4590); 

                            newLeafNode(lv_ruletyp_18_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXRIGHTKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_18_0, "INNERINFIXRIGHT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2677:2: ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==31) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2677:3: ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )?
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2677:3: ( (lv_mod_19_0= 'CALLER' ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2678:1: (lv_mod_19_0= 'CALLER' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2678:1: (lv_mod_19_0= 'CALLER' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2679:3: lv_mod_19_0= 'CALLER'
                            {
                            lv_mod_19_0=(Token)match(input,31,FOLLOW_31_in_ruleInnerPrecedence4622); 

                                    newLeafNode(lv_mod_19_0, grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_4_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "mod", lv_mod_19_0, "CALLER");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2692:2: ( (lv_rule_20_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2693:1: (lv_rule_20_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2693:1: (lv_rule_20_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2694:3: lv_rule_20_0= RULE_ID
                            {
                            lv_rule_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4652); 

                            			newLeafNode(lv_rule_20_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_1_0()); 
                            		

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

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2710:2: (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==32) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2710:4: otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) )
                                    {
                                    otherlv_21=(Token)match(input,32,FOLLOW_32_in_ruleInnerPrecedence4670); 

                                        	newLeafNode(otherlv_21, grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_4_1_2_0());
                                        
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2714:1: ( (lv_feature1_22_0= RULE_ID ) )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2715:1: (lv_feature1_22_0= RULE_ID )
                                    {
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2715:1: (lv_feature1_22_0= RULE_ID )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2716:3: lv_feature1_22_0= RULE_ID
                                    {
                                    lv_feature1_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4687); 

                                    			newLeafNode(lv_feature1_22_0, grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_4_1_2_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"feature1",
                                            		lv_feature1_22_0, 
                                            		"ID");
                                    	    

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2732:6: ( (lv_infix_23_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2733:1: (lv_infix_23_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2733:1: (lv_infix_23_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2734:3: lv_infix_23_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence4717);
                    lv_infix_23_0=ruleMultString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		set(
                           			current, 
                           			"infix",
                            		lv_infix_23_0, 
                            		"MultString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2750:2: ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==34) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2750:3: ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2750:3: ( (lv_feature2_24_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2751:1: (lv_feature2_24_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2751:1: (lv_feature2_24_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2752:3: lv_feature2_24_0= RULE_ID
                            {
                            lv_feature2_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4735); 

                            			newLeafNode(lv_feature2_24_0, grammarAccess.getInnerPrecedenceAccess().getFeature2IDTerminalRuleCall_4_3_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"feature2",
                                    		lv_feature2_24_0, 
                                    		"ID");
                            	    

                            }


                            }

                            otherlv_25=(Token)match(input,34,FOLLOW_34_in_ruleInnerPrecedence4752); 

                                	newLeafNode(otherlv_25, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_4_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2772:3: ( (lv_par2_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2773:1: (lv_par2_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2773:1: (lv_par2_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2774:3: lv_par2_26_0= RULE_ID
                    {
                    lv_par2_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4771); 

                    			newLeafNode(lv_par2_26_0, grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_4_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"par2",
                            		lv_par2_26_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2791:6: ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2791:6: ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2791:7: ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2791:7: ( (lv_ruletyp_27_0= 'INNERBRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2792:1: (lv_ruletyp_27_0= 'INNERBRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2792:1: (lv_ruletyp_27_0= 'INNERBRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2793:3: lv_ruletyp_27_0= 'INNERBRACKET'
                    {
                    lv_ruletyp_27_0=(Token)match(input,59,FOLLOW_59_in_ruleInnerPrecedence4802); 

                            newLeafNode(lv_ruletyp_27_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_27_0, "INNERBRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2806:2: ( (lv_rule_28_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2807:1: (lv_rule_28_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2807:1: (lv_rule_28_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2808:3: lv_rule_28_0= RULE_ID
                    {
                    lv_rule_28_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4832); 

                    			newLeafNode(lv_rule_28_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_28_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2824:2: ( (lv_bracket_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2825:1: (lv_bracket_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2825:1: (lv_bracket_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2826:3: lv_bracket_29_0= RULE_ID
                    {
                    lv_bracket_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4854); 

                    			newLeafNode(lv_bracket_29_0, grammarAccess.getInnerPrecedenceAccess().getBracketIDTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bracket",
                            		lv_bracket_29_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2843:6: ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2843:6: ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2843:7: ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2843:7: ( (lv_ruletyp_30_0= 'INNERBRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2844:1: (lv_ruletyp_30_0= 'INNERBRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2844:1: (lv_ruletyp_30_0= 'INNERBRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2845:3: lv_ruletyp_30_0= 'INNERBRACES'
                    {
                    lv_ruletyp_30_0=(Token)match(input,60,FOLLOW_60_in_ruleInnerPrecedence4885); 

                            newLeafNode(lv_ruletyp_30_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_30_0, "INNERBRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2858:2: ( (lv_rule_31_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2859:1: (lv_rule_31_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2859:1: (lv_rule_31_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2860:3: lv_rule_31_0= RULE_ID
                    {
                    lv_rule_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4915); 

                    			newLeafNode(lv_rule_31_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_31_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2876:2: ( (lv_braces_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2877:1: (lv_braces_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2877:1: (lv_braces_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2878:3: lv_braces_32_0= RULE_ID
                    {
                    lv_braces_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4937); 

                    			newLeafNode(lv_braces_32_0, grammarAccess.getInnerPrecedenceAccess().getBracesIDTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"braces",
                            		lv_braces_32_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2895:6: ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2895:6: ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2895:7: ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2895:7: ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2896:1: (lv_ruletyp_33_0= 'INNERPARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2896:1: (lv_ruletyp_33_0= 'INNERPARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2897:3: lv_ruletyp_33_0= 'INNERPARENTHESIS'
                    {
                    lv_ruletyp_33_0=(Token)match(input,61,FOLLOW_61_in_ruleInnerPrecedence4968); 

                            newLeafNode(lv_ruletyp_33_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_33_0, "INNERPARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2910:2: ( (lv_rule_34_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2911:1: (lv_rule_34_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2911:1: (lv_rule_34_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2912:3: lv_rule_34_0= RULE_ID
                    {
                    lv_rule_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4998); 

                    			newLeafNode(lv_rule_34_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_34_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2928:2: ( (lv_parenthesis_35_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2929:1: (lv_parenthesis_35_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2929:1: (lv_parenthesis_35_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2930:3: lv_parenthesis_35_0= RULE_ID
                    {
                    lv_parenthesis_35_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence5020); 

                    			newLeafNode(lv_parenthesis_35_0, grammarAccess.getInnerPrecedenceAccess().getParenthesisIDTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parenthesis",
                            		lv_parenthesis_35_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2947:6: ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2947:6: ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2947:7: ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2947:7: ( (lv_ruletyp_36_0= 'INNERANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2948:1: (lv_ruletyp_36_0= 'INNERANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2948:1: (lv_ruletyp_36_0= 'INNERANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2949:3: lv_ruletyp_36_0= 'INNERANGLE'
                    {
                    lv_ruletyp_36_0=(Token)match(input,62,FOLLOW_62_in_ruleInnerPrecedence5051); 

                            newLeafNode(lv_ruletyp_36_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_36_0, "INNERANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2962:2: ( (lv_rule_37_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2963:1: (lv_rule_37_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2963:1: (lv_rule_37_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2964:3: lv_rule_37_0= RULE_ID
                    {
                    lv_rule_37_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence5081); 

                    			newLeafNode(lv_rule_37_0, grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rule",
                            		lv_rule_37_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2980:2: ( (lv_angle_38_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2981:1: (lv_angle_38_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2981:1: (lv_angle_38_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2982:3: lv_angle_38_0= RULE_ID
                    {
                    lv_angle_38_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence5103); 

                    			newLeafNode(lv_angle_38_0, grammarAccess.getInnerPrecedenceAccess().getAngleIDTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"angle",
                            		lv_angle_38_0, 
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3006:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3007:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3008:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5145);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5155); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3015:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_qn_0_0=null;
        Token otherlv_1=null;
        Token lv_qn_2_0=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3018:28: ( ( ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3019:1: ( ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3019:1: ( ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3019:2: ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )*
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3019:2: ( (lv_qn_0_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3020:1: (lv_qn_0_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3020:1: (lv_qn_0_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3021:3: lv_qn_0_0= RULE_ID
            {
            lv_qn_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5197); 

            			newLeafNode(lv_qn_0_0, grammarAccess.getQualifiedNameAccess().getQnIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"qn",
                    		lv_qn_0_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3037:2: (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==32) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3037:4: otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedName5215); 

            	        	newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3041:1: ( (lv_qn_2_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3042:1: (lv_qn_2_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3042:1: (lv_qn_2_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3043:3: lv_qn_2_0= RULE_ID
            	    {
            	    lv_qn_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5232); 

            	    			newLeafNode(lv_qn_2_0, grammarAccess.getQualifiedNameAccess().getQnIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"qn",
            	            		lv_qn_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleMultString"
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3067:1: entryRuleMultString returns [EObject current=null] : iv_ruleMultString= ruleMultString EOF ;
    public final EObject entryRuleMultString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3068:2: (iv_ruleMultString= ruleMultString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3069:2: iv_ruleMultString= ruleMultString EOF
            {
             newCompositeNode(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString5275);
            iv_ruleMultString=ruleMultString();

            state._fsp--;

             current =iv_ruleMultString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString5285); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3076:1: ruleMultString returns [EObject current=null] : ( () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) ) ) ;
    public final EObject ruleMultString() throws RecognitionException {
        EObject current = null;

        Token lv_ms_1_0=null;
        Token lv_opt_2_0=null;
        Token lv_mi_3_0=null;
        Token lv_synpred_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_cs_6_0 = null;

        EObject lv_cs_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3079:28: ( ( () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3080:1: ( () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3080:1: ( () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3080:2: () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3080:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3081:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultStringAccess().getMultStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3086:2: ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt39=1;
                }
                break;
            case RULE_ID:
                {
                alt39=2;
                }
                break;
            case 39:
            case 64:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3086:3: ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3086:3: ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3086:4: ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )?
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3086:4: ( (lv_ms_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3087:1: (lv_ms_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3087:1: (lv_ms_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3088:3: lv_ms_1_0= RULE_STRING
                    {
                    lv_ms_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString5338); 

                    			newLeafNode(lv_ms_1_0, grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_0_0_0()); 
                    		

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3104:2: ( (lv_opt_2_0= '?' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==63) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3105:1: (lv_opt_2_0= '?' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3105:1: (lv_opt_2_0= '?' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3106:3: lv_opt_2_0= '?'
                            {
                            lv_opt_2_0=(Token)match(input,63,FOLLOW_63_in_ruleMultString5361); 

                                    newLeafNode(lv_opt_2_0, grammarAccess.getMultStringAccess().getOptQuestionMarkKeyword_1_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultStringRule());
                            	        }
                                   		setWithLastConsumed(current, "opt", true, "?");
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3120:6: ( (lv_mi_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3120:6: ( (lv_mi_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3121:1: (lv_mi_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3121:1: (lv_mi_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3122:3: lv_mi_3_0= RULE_ID
                    {
                    lv_mi_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultString5399); 

                    			newLeafNode(lv_mi_3_0, grammarAccess.getMultStringAccess().getMiIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultStringRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"mi",
                            		lv_mi_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3139:6: ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3139:6: ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3139:7: ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')'
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3139:7: ( (lv_synpred_4_0= '=>' ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==64) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3140:1: (lv_synpred_4_0= '=>' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3140:1: (lv_synpred_4_0= '=>' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3141:3: lv_synpred_4_0= '=>'
                            {
                            lv_synpred_4_0=(Token)match(input,64,FOLLOW_64_in_ruleMultString5429); 

                                    newLeafNode(lv_synpred_4_0, grammarAccess.getMultStringAccess().getSynpredEqualsSignGreaterThanSignKeyword_1_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultStringRule());
                            	        }
                                   		setWithLastConsumed(current, "synpred", lv_synpred_4_0, "=>");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleMultString5455); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultStringAccess().getLeftParenthesisKeyword_1_2_1());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3158:1: ( (lv_cs_6_0= ruleComboString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3159:1: (lv_cs_6_0= ruleComboString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3159:1: (lv_cs_6_0= ruleComboString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3160:3: lv_cs_6_0= ruleComboString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultStringAccess().getCsComboStringParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComboString_in_ruleMultString5476);
                    lv_cs_6_0=ruleComboString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMultStringRule());
                    	        }
                           		add(
                           			current, 
                           			"cs",
                            		lv_cs_6_0, 
                            		"ComboString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3176:2: (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==65) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3176:4: otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,65,FOLLOW_65_in_ruleMultString5489); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getMultStringAccess().getVerticalLineKeyword_1_2_3_0());
                    	        
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3180:1: ( (lv_cs_8_0= ruleComboString ) )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3181:1: (lv_cs_8_0= ruleComboString )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3181:1: (lv_cs_8_0= ruleComboString )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3182:3: lv_cs_8_0= ruleComboString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultStringAccess().getCsComboStringParserRuleCall_1_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComboString_in_ruleMultString5510);
                    	    lv_cs_8_0=ruleComboString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMultStringRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"cs",
                    	            		lv_cs_8_0, 
                    	            		"ComboString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleMultString5524); 

                        	newLeafNode(otherlv_9, grammarAccess.getMultStringAccess().getRightParenthesisKeyword_1_2_4());
                        

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3210:1: entryRuleComboString returns [EObject current=null] : iv_ruleComboString= ruleComboString EOF ;
    public final EObject entryRuleComboString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3211:2: (iv_ruleComboString= ruleComboString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3212:2: iv_ruleComboString= ruleComboString EOF
            {
             newCompositeNode(grammarAccess.getComboStringRule()); 
            pushFollow(FOLLOW_ruleComboString_in_entryRuleComboString5562);
            iv_ruleComboString=ruleComboString();

            state._fsp--;

             current =iv_ruleComboString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboString5572); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3219:1: ruleComboString returns [EObject current=null] : ( () ( (lv_inner_1_0= ruleMultString ) )* ) ;
    public final EObject ruleComboString() throws RecognitionException {
        EObject current = null;

        EObject lv_inner_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3222:28: ( ( () ( (lv_inner_1_0= ruleMultString ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3223:1: ( () ( (lv_inner_1_0= ruleMultString ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3223:1: ( () ( (lv_inner_1_0= ruleMultString ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3223:2: () ( (lv_inner_1_0= ruleMultString ) )*
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3223:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3224:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComboStringAccess().getComboStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3229:2: ( (lv_inner_1_0= ruleMultString ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||LA40_0==39||LA40_0==64) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3230:1: (lv_inner_1_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3230:1: (lv_inner_1_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3231:3: lv_inner_1_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComboStringAccess().getInnerMultStringParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleComboString5627);
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
            	    break loop40;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3255:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3256:2: (iv_rulePrimary= rulePrimary EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3257:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary5664);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary5674); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3264:1: rulePrimary returns [EObject current=null] : (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3267:28: ( (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3268:1: (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3268:1: (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3268:3: otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_rulePrimary5711); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getPRIMARYKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3272:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3273:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3273:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3274:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary5728); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3290:2: ( (lv_inner_2_0= rulePrimaryInner ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=67 && LA41_0<=81)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3291:1: (lv_inner_2_0= rulePrimaryInner )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3291:1: (lv_inner_2_0= rulePrimaryInner )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3292:3: lv_inner_2_0= rulePrimaryInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrimaryAccess().getInnerPrimaryInnerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryInner_in_rulePrimary5754);
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
            	    break loop41;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3316:1: entryRulePrimaryInner returns [EObject current=null] : iv_rulePrimaryInner= rulePrimaryInner EOF ;
    public final EObject entryRulePrimaryInner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInner = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3317:2: (iv_rulePrimaryInner= rulePrimaryInner EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3318:2: iv_rulePrimaryInner= rulePrimaryInner EOF
            {
             newCompositeNode(grammarAccess.getPrimaryInnerRule()); 
            pushFollow(FOLLOW_rulePrimaryInner_in_entryRulePrimaryInner5791);
            iv_rulePrimaryInner=rulePrimaryInner();

            state._fsp--;

             current =iv_rulePrimaryInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryInner5801); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3325:1: rulePrimaryInner returns [EObject current=null] : ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3328:28: ( ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3329:1: ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3329:1: ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) )
            int alt42=15;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt42=1;
                }
                break;
            case 68:
                {
                alt42=2;
                }
                break;
            case 69:
                {
                alt42=3;
                }
                break;
            case 70:
                {
                alt42=4;
                }
                break;
            case 71:
                {
                alt42=5;
                }
                break;
            case 72:
                {
                alt42=6;
                }
                break;
            case 73:
                {
                alt42=7;
                }
                break;
            case 74:
                {
                alt42=8;
                }
                break;
            case 75:
                {
                alt42=9;
                }
                break;
            case 76:
                {
                alt42=10;
                }
                break;
            case 77:
                {
                alt42=11;
                }
                break;
            case 78:
                {
                alt42=12;
                }
                break;
            case 79:
                {
                alt42=13;
                }
                break;
            case 80:
                {
                alt42=14;
                }
                break;
            case 81:
                {
                alt42=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3329:2: ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3329:2: ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3329:3: ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3329:3: ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3330:1: (lv_primarytyp_0_0= 'CONSTRUCTOR' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3330:1: (lv_primarytyp_0_0= 'CONSTRUCTOR' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3331:3: lv_primarytyp_0_0= 'CONSTRUCTOR'
                    {
                    lv_primarytyp_0_0=(Token)match(input,67,FOLLOW_67_in_rulePrimaryInner5845); 

                            newLeafNode(lv_primarytyp_0_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypCONSTRUCTORKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_0_0, "CONSTRUCTOR");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3344:2: ( (lv_construct_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3345:1: (lv_construct_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3345:1: (lv_construct_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3346:3: lv_construct_1_0= RULE_ID
                    {
                    lv_construct_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5875); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3363:6: ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3363:6: ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3363:7: ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3363:7: ( (lv_primarytyp_2_0= 'BLOCK' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3364:1: (lv_primarytyp_2_0= 'BLOCK' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3364:1: (lv_primarytyp_2_0= 'BLOCK' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3365:3: lv_primarytyp_2_0= 'BLOCK'
                    {
                    lv_primarytyp_2_0=(Token)match(input,68,FOLLOW_68_in_rulePrimaryInner5906); 

                            newLeafNode(lv_primarytyp_2_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypBLOCKKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_2_0, "BLOCK");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3378:2: ( (lv_construct_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3379:1: (lv_construct_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3379:1: (lv_construct_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3380:3: lv_construct_3_0= RULE_ID
                    {
                    lv_construct_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5936); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3397:6: ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3397:6: ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3397:7: ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3397:7: ( (lv_primarytyp_4_0= 'SWITCH' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3398:1: (lv_primarytyp_4_0= 'SWITCH' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3398:1: (lv_primarytyp_4_0= 'SWITCH' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3399:3: lv_primarytyp_4_0= 'SWITCH'
                    {
                    lv_primarytyp_4_0=(Token)match(input,69,FOLLOW_69_in_rulePrimaryInner5967); 

                            newLeafNode(lv_primarytyp_4_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypSWITCHKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_4_0, "SWITCH");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3412:2: ( (lv_construct_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3413:1: (lv_construct_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3413:1: (lv_construct_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3414:3: lv_construct_5_0= RULE_ID
                    {
                    lv_construct_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5997); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3430:2: ( (lv_construct2_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3431:1: (lv_construct2_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3431:1: (lv_construct2_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3432:3: lv_construct2_6_0= RULE_ID
                    {
                    lv_construct2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6019); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3449:6: ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3449:6: ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3449:7: ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3449:7: ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3450:1: (lv_primarytyp_7_0= 'SYNCHRONIZED' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3450:1: (lv_primarytyp_7_0= 'SYNCHRONIZED' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3451:3: lv_primarytyp_7_0= 'SYNCHRONIZED'
                    {
                    lv_primarytyp_7_0=(Token)match(input,70,FOLLOW_70_in_rulePrimaryInner6050); 

                            newLeafNode(lv_primarytyp_7_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypSYNCHRONIZEDKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_7_0, "SYNCHRONIZED");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3464:2: ( (lv_construct_8_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3465:1: (lv_construct_8_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3465:1: (lv_construct_8_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3466:3: lv_construct_8_0= RULE_ID
                    {
                    lv_construct_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6080); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3483:6: ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3483:6: ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3483:7: ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3483:7: ( (lv_primarytyp_9_0= 'FEATURECALL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3484:1: (lv_primarytyp_9_0= 'FEATURECALL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3484:1: (lv_primarytyp_9_0= 'FEATURECALL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3485:3: lv_primarytyp_9_0= 'FEATURECALL'
                    {
                    lv_primarytyp_9_0=(Token)match(input,71,FOLLOW_71_in_rulePrimaryInner6111); 

                            newLeafNode(lv_primarytyp_9_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypFEATURECALLKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_9_0, "FEATURECALL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3498:2: ( (lv_construct_10_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3499:1: (lv_construct_10_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3499:1: (lv_construct_10_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3500:3: lv_construct_10_0= RULE_ID
                    {
                    lv_construct_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6141); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3516:2: ( (lv_feature_11_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3517:1: (lv_feature_11_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3517:1: (lv_feature_11_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3518:3: lv_feature_11_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryInnerAccess().getFeatureMultStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrimaryInner6167);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3535:6: ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3535:6: ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3535:7: ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3535:7: ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3536:1: (lv_primarytyp_12_0= 'IFEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3536:1: (lv_primarytyp_12_0= 'IFEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3537:3: lv_primarytyp_12_0= 'IFEXPRESSION'
                    {
                    lv_primarytyp_12_0=(Token)match(input,72,FOLLOW_72_in_rulePrimaryInner6193); 

                            newLeafNode(lv_primarytyp_12_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypIFEXPRESSIONKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_12_0, "IFEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3550:2: ( (lv_construct_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3551:1: (lv_construct_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3551:1: (lv_construct_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3552:3: lv_construct_13_0= RULE_ID
                    {
                    lv_construct_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6223); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3569:6: ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3569:6: ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3569:7: ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3569:7: ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3570:1: (lv_primarytyp_14_0= 'FOREXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3570:1: (lv_primarytyp_14_0= 'FOREXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3571:3: lv_primarytyp_14_0= 'FOREXPRESSION'
                    {
                    lv_primarytyp_14_0=(Token)match(input,73,FOLLOW_73_in_rulePrimaryInner6254); 

                            newLeafNode(lv_primarytyp_14_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypFOREXPRESSIONKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_14_0, "FOREXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3584:2: ( (lv_construct_15_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3585:1: (lv_construct_15_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3585:1: (lv_construct_15_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3586:3: lv_construct_15_0= RULE_ID
                    {
                    lv_construct_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6284); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3603:6: ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3603:6: ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3603:7: ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3603:7: ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3604:1: (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3604:1: (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3605:3: lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION'
                    {
                    lv_primarytyp_16_0=(Token)match(input,74,FOLLOW_74_in_rulePrimaryInner6315); 

                            newLeafNode(lv_primarytyp_16_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypBASICFORLOOPEXPRESSIONKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_16_0, "BASICFORLOOPEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3618:2: ( (lv_construct_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3619:1: (lv_construct_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3619:1: (lv_construct_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3620:3: lv_construct_17_0= RULE_ID
                    {
                    lv_construct_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6345); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3637:6: ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3637:6: ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3637:7: ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3637:7: ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3638:1: (lv_primarytyp_18_0= 'WHILEEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3638:1: (lv_primarytyp_18_0= 'WHILEEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3639:3: lv_primarytyp_18_0= 'WHILEEXPRESSION'
                    {
                    lv_primarytyp_18_0=(Token)match(input,75,FOLLOW_75_in_rulePrimaryInner6376); 

                            newLeafNode(lv_primarytyp_18_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypWHILEEXPRESSIONKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_18_0, "WHILEEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3652:2: ( (lv_construct_19_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3653:1: (lv_construct_19_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3653:1: (lv_construct_19_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3654:3: lv_construct_19_0= RULE_ID
                    {
                    lv_construct_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6406); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3671:6: ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3671:6: ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3671:7: ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3671:7: ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3672:1: (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3672:1: (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3673:3: lv_primarytyp_20_0= 'DOWHILEEXPRESSION'
                    {
                    lv_primarytyp_20_0=(Token)match(input,76,FOLLOW_76_in_rulePrimaryInner6437); 

                            newLeafNode(lv_primarytyp_20_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypDOWHILEEXPRESSIONKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_20_0, "DOWHILEEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3686:2: ( (lv_construct_21_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3687:1: (lv_construct_21_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3687:1: (lv_construct_21_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3688:3: lv_construct_21_0= RULE_ID
                    {
                    lv_construct_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6467); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3705:6: ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3705:6: ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3705:7: ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3705:7: ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3706:1: (lv_primarytyp_22_0= 'THROWEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3706:1: (lv_primarytyp_22_0= 'THROWEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3707:3: lv_primarytyp_22_0= 'THROWEXPRESSION'
                    {
                    lv_primarytyp_22_0=(Token)match(input,77,FOLLOW_77_in_rulePrimaryInner6498); 

                            newLeafNode(lv_primarytyp_22_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypTHROWEXPRESSIONKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_22_0, "THROWEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3720:2: ( (lv_construct_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3721:1: (lv_construct_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3721:1: (lv_construct_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3722:3: lv_construct_23_0= RULE_ID
                    {
                    lv_construct_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6528); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3739:6: ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3739:6: ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3739:7: ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3739:7: ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3740:1: (lv_primarytyp_24_0= 'RETURNEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3740:1: (lv_primarytyp_24_0= 'RETURNEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3741:3: lv_primarytyp_24_0= 'RETURNEXPRESSION'
                    {
                    lv_primarytyp_24_0=(Token)match(input,78,FOLLOW_78_in_rulePrimaryInner6559); 

                            newLeafNode(lv_primarytyp_24_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypRETURNEXPRESSIONKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_24_0, "RETURNEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3754:2: ( (lv_construct_25_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3755:1: (lv_construct_25_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3755:1: (lv_construct_25_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3756:3: lv_construct_25_0= RULE_ID
                    {
                    lv_construct_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6589); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3773:6: ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3773:6: ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3773:7: ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3773:7: ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3774:1: (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3774:1: (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3775:3: lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION'
                    {
                    lv_primarytyp_26_0=(Token)match(input,79,FOLLOW_79_in_rulePrimaryInner6620); 

                            newLeafNode(lv_primarytyp_26_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypTRYCATCHFINALYEXPRESSIONKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_26_0, "TRYCATCHFINALYEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3788:2: ( (lv_construct_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3789:1: (lv_construct_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3789:1: (lv_construct_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3790:3: lv_construct_27_0= RULE_ID
                    {
                    lv_construct_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6650); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3807:6: ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3807:6: ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3807:7: ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3807:7: ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3808:1: (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3808:1: (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3809:3: lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION'
                    {
                    lv_primarytyp_28_0=(Token)match(input,80,FOLLOW_80_in_rulePrimaryInner6681); 

                            newLeafNode(lv_primarytyp_28_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypPARENTHESIZEDEXPRESSIONKeyword_13_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_28_0, "PARENTHESIZEDEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3822:2: ( (lv_construct_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3823:1: (lv_construct_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3823:1: (lv_construct_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3824:3: lv_construct_29_0= RULE_ID
                    {
                    lv_construct_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6711); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3841:6: ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3841:6: ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3841:7: ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3841:7: ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3842:1: (lv_primarytyp_30_0= 'LITERALEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3842:1: (lv_primarytyp_30_0= 'LITERALEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3843:3: lv_primarytyp_30_0= 'LITERALEXPRESSION'
                    {
                    lv_primarytyp_30_0=(Token)match(input,81,FOLLOW_81_in_rulePrimaryInner6742); 

                            newLeafNode(lv_primarytyp_30_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypLITERALEXPRESSIONKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_30_0, "LITERALEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3856:2: ( (lv_construct_31_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3857:1: (lv_construct_31_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3857:1: (lv_construct_31_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3858:3: lv_construct_31_0= RULE_ID
                    {
                    lv_construct_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6772); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3882:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3883:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3884:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6814);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6824); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3891:1: ruleLiteral returns [EObject current=null] : (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3894:28: ( (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3895:1: (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3895:1: (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3895:3: otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )*
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleLiteral6861); 

                	newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getLITERALKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3899:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3900:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3900:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3901:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral6878); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3917:2: ( (lv_inner_2_0= ruleLiteralInner ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=83 && LA43_0<=89)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3918:1: (lv_inner_2_0= ruleLiteralInner )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3918:1: (lv_inner_2_0= ruleLiteralInner )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3919:3: lv_inner_2_0= ruleLiteralInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLiteralAccess().getInnerLiteralInnerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteralInner_in_ruleLiteral6904);
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
            	    break loop43;
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3943:1: entryRuleLiteralInner returns [EObject current=null] : iv_ruleLiteralInner= ruleLiteralInner EOF ;
    public final EObject entryRuleLiteralInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInner = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3944:2: (iv_ruleLiteralInner= ruleLiteralInner EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3945:2: iv_ruleLiteralInner= ruleLiteralInner EOF
            {
             newCompositeNode(grammarAccess.getLiteralInnerRule()); 
            pushFollow(FOLLOW_ruleLiteralInner_in_entryRuleLiteralInner6941);
            iv_ruleLiteralInner=ruleLiteralInner();

            state._fsp--;

             current =iv_ruleLiteralInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralInner6951); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3952:1: ruleLiteralInner returns [EObject current=null] : ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3955:28: ( ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3956:1: ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3956:1: ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt44=1;
                }
                break;
            case 84:
                {
                alt44=2;
                }
                break;
            case 85:
                {
                alt44=3;
                }
                break;
            case 86:
                {
                alt44=4;
                }
                break;
            case 87:
                {
                alt44=5;
                }
                break;
            case 88:
                {
                alt44=6;
                }
                break;
            case 89:
                {
                alt44=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3956:2: ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3956:2: ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3956:3: ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3956:3: ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3957:1: (lv_primarytyp_0_0= 'COLLECTIONLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3957:1: (lv_primarytyp_0_0= 'COLLECTIONLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3958:3: lv_primarytyp_0_0= 'COLLECTIONLITERAL'
                    {
                    lv_primarytyp_0_0=(Token)match(input,83,FOLLOW_83_in_ruleLiteralInner6995); 

                            newLeafNode(lv_primarytyp_0_0, grammarAccess.getLiteralInnerAccess().getPrimarytypCOLLECTIONLITERALKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_0_0, "COLLECTIONLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3971:2: ( (lv_construct_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3972:1: (lv_construct_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3972:1: (lv_construct_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3973:3: lv_construct_1_0= RULE_ID
                    {
                    lv_construct_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7025); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3990:6: ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3990:6: ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3990:7: ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3990:7: ( (lv_primarytyp_2_0= 'CLOSURE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3991:1: (lv_primarytyp_2_0= 'CLOSURE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3991:1: (lv_primarytyp_2_0= 'CLOSURE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3992:3: lv_primarytyp_2_0= 'CLOSURE'
                    {
                    lv_primarytyp_2_0=(Token)match(input,84,FOLLOW_84_in_ruleLiteralInner7056); 

                            newLeafNode(lv_primarytyp_2_0, grammarAccess.getLiteralInnerAccess().getPrimarytypCLOSUREKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_2_0, "CLOSURE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4005:2: ( (lv_construct_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4006:1: (lv_construct_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4006:1: (lv_construct_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4007:3: lv_construct_3_0= RULE_ID
                    {
                    lv_construct_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7086); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4024:6: ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4024:6: ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4024:7: ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4024:7: ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4025:1: (lv_primarytyp_4_0= 'BOOLEANLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4025:1: (lv_primarytyp_4_0= 'BOOLEANLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4026:3: lv_primarytyp_4_0= 'BOOLEANLITERAL'
                    {
                    lv_primarytyp_4_0=(Token)match(input,85,FOLLOW_85_in_ruleLiteralInner7117); 

                            newLeafNode(lv_primarytyp_4_0, grammarAccess.getLiteralInnerAccess().getPrimarytypBOOLEANLITERALKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_4_0, "BOOLEANLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4039:2: ( (lv_construct_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4040:1: (lv_construct_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4040:1: (lv_construct_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4041:3: lv_construct_5_0= RULE_ID
                    {
                    lv_construct_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7147); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4058:6: ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4058:6: ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4058:7: ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4058:7: ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4059:1: (lv_primarytyp_6_0= 'NUMBERLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4059:1: (lv_primarytyp_6_0= 'NUMBERLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4060:3: lv_primarytyp_6_0= 'NUMBERLITERAL'
                    {
                    lv_primarytyp_6_0=(Token)match(input,86,FOLLOW_86_in_ruleLiteralInner7178); 

                            newLeafNode(lv_primarytyp_6_0, grammarAccess.getLiteralInnerAccess().getPrimarytypNUMBERLITERALKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_6_0, "NUMBERLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4073:2: ( (lv_construct_7_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4074:1: (lv_construct_7_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4074:1: (lv_construct_7_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4075:3: lv_construct_7_0= RULE_ID
                    {
                    lv_construct_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7208); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4092:6: ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4092:6: ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4092:7: ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4092:7: ( (lv_primarytyp_8_0= 'NULLLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4093:1: (lv_primarytyp_8_0= 'NULLLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4093:1: (lv_primarytyp_8_0= 'NULLLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4094:3: lv_primarytyp_8_0= 'NULLLITERAL'
                    {
                    lv_primarytyp_8_0=(Token)match(input,87,FOLLOW_87_in_ruleLiteralInner7239); 

                            newLeafNode(lv_primarytyp_8_0, grammarAccess.getLiteralInnerAccess().getPrimarytypNULLLITERALKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_8_0, "NULLLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4107:2: ( (lv_construct_9_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4108:1: (lv_construct_9_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4108:1: (lv_construct_9_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4109:3: lv_construct_9_0= RULE_ID
                    {
                    lv_construct_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7269); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4126:6: ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4126:6: ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4126:7: ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4126:7: ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4127:1: (lv_primarytyp_10_0= 'STRINGLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4127:1: (lv_primarytyp_10_0= 'STRINGLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4128:3: lv_primarytyp_10_0= 'STRINGLITERAL'
                    {
                    lv_primarytyp_10_0=(Token)match(input,88,FOLLOW_88_in_ruleLiteralInner7300); 

                            newLeafNode(lv_primarytyp_10_0, grammarAccess.getLiteralInnerAccess().getPrimarytypSTRINGLITERALKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_10_0, "STRINGLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4141:2: ( (lv_construct_11_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4142:1: (lv_construct_11_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4142:1: (lv_construct_11_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4143:3: lv_construct_11_0= RULE_ID
                    {
                    lv_construct_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7330); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4160:6: ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4160:6: ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4160:7: ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4160:7: ( (lv_primarytyp_12_0= 'TYPELITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4161:1: (lv_primarytyp_12_0= 'TYPELITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4161:1: (lv_primarytyp_12_0= 'TYPELITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4162:3: lv_primarytyp_12_0= 'TYPELITERAL'
                    {
                    lv_primarytyp_12_0=(Token)match(input,89,FOLLOW_89_in_ruleLiteralInner7361); 

                            newLeafNode(lv_primarytyp_12_0, grammarAccess.getLiteralInnerAccess().getPrimarytypTYPELITERALKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_12_0, "TYPELITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4175:2: ( (lv_construct_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4176:1: (lv_construct_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4176:1: (lv_construct_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4177:3: lv_construct_13_0= RULE_ID
                    {
                    lv_construct_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7391); 

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
    public static final BitSet FOLLOW_ruleProject_in_ruleModel131 = new BitSet(new long[]{0x0000000040204802L,0x0000000000040004L});
    public static final BitSet FOLLOW_ruleClassType_in_ruleModel158 = new BitSet(new long[]{0x0000000040204802L,0x0000000000040004L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleModel185 = new BitSet(new long[]{0x0000000040204802L,0x0000000000040004L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleModel212 = new BitSet(new long[]{0x0000000040204802L,0x0000000000040004L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleModel239 = new BitSet(new long[]{0x0000000040204802L,0x0000000000040004L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel266 = new BitSet(new long[]{0x0000000040204802L,0x0000000000040004L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject367 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleProject386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProject407 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleProject427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProject448 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleClassType534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassType551 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_15_in_ruleClassType575 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_16_in_ruleClassType607 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleClassType628 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_17_in_ruleClassType648 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleClassType669 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_18_in_ruleClassType689 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleClassType709 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_20_in_ruleClassType738 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleProcedure840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure857 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_22_in_ruleProcedure876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure915 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_23_in_ruleProcedure940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure957 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_16_in_ruleProcedure982 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleProcedure1003 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_17_in_ruleProcedure1023 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleProcedure1044 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_24_in_ruleProcedure1064 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_25_in_ruleProcedure1084 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_26_in_ruleProcedure1113 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_27_in_ruleProcedure1142 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_28_in_ruleProcedure1171 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_29_in_ruleProcedure1200 = new BitSet(new long[]{0x0000000001C30002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleExpression1302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1319 = new BitSet(new long[]{0x00001E7A800B0002L});
    public static final BitSet FOLLOW_rulePrecedence_in_ruleExpression1345 = new BitSet(new long[]{0x00001E7A800B0002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrecedence1436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1466 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrecedence1534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1564 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrecedence1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrecedence1617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1647 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1691 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence1708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrecedence1758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1811 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence1828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1847 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrecedence1899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1952 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence1969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1988 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2032 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence2049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrecedence2099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2152 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence2169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2188 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2232 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence2249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrecedence2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2352 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence2369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2388 = new BitSet(new long[]{0x7FC0000000000000L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_rulePrecedence2414 = new BitSet(new long[]{0x7FC0000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrecedence2441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2471 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePrecedence2488 = new BitSet(new long[]{0x003FE00000000000L});
    public static final BitSet FOLLOW_ruleSubPrecedence_in_rulePrecedence2509 = new BitSet(new long[]{0x003FE10000000000L});
    public static final BitSet FOLLOW_40_in_rulePrecedence2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePrecedence2548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrecedence2631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrecedence2714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrecedence2797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePrecedence2880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2933 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence2950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2969 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence3013 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rulePrecedence3030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPrecedence_in_entryRuleSubPrecedence3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPrecedence3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSubPrecedence3145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSubPrecedence3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSubPrecedence3206 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleSubPrecedence3240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3258 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSubPrecedence3275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSubPrecedence3325 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleSubPrecedence3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSubPrecedence3385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3416 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSubPrecedence3433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3452 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleSubPrecedence3478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3496 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSubPrecedence3513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSubPrecedence3563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3594 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSubPrecedence3611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3630 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleSubPrecedence3656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3674 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSubPrecedence3691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSubPrecedence3741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSubPrecedence3824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleSubPrecedence3907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSubPrecedence3990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence4020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence4084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerPrecedence4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInnerPrecedence4138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInnerPrecedence4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInnerPrecedence4199 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence4233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4251 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInnerPrecedence4268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInnerPrecedence4318 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleInnerPrecedence4378 = new BitSet(new long[]{0x0000008080000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_31_in_ruleInnerPrecedence4410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4440 = new BitSet(new long[]{0x0000008100000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_32_in_ruleInnerPrecedence4458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4475 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence4505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4523 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInnerPrecedence4540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleInnerPrecedence4590 = new BitSet(new long[]{0x0000008080000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_31_in_ruleInnerPrecedence4622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4652 = new BitSet(new long[]{0x0000008100000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_32_in_ruleInnerPrecedence4670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4687 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence4717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4735 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInnerPrecedence4752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleInnerPrecedence4802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleInnerPrecedence4885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleInnerPrecedence4968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleInnerPrecedence5051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence5081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5197 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedName5215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5232 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString5275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString5338 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleMultString5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultString5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleMultString5429 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleMultString5455 = new BitSet(new long[]{0x0000018000000030L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleComboString_in_ruleMultString5476 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleMultString5489 = new BitSet(new long[]{0x0000018000000030L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleComboString_in_ruleMultString5510 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMultString5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboString_in_entryRuleComboString5562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboString5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleComboString5627 = new BitSet(new long[]{0x0000008000000032L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary5664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePrimary5711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary5728 = new BitSet(new long[]{0x0000000000000002L,0x000000000003FFF8L});
    public static final BitSet FOLLOW_rulePrimaryInner_in_rulePrimary5754 = new BitSet(new long[]{0x0000000000000002L,0x000000000003FFF8L});
    public static final BitSet FOLLOW_rulePrimaryInner_in_entryRulePrimaryInner5791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryInner5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePrimaryInner5845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePrimaryInner5906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePrimaryInner5967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePrimaryInner6050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePrimaryInner6111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6141 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrimaryInner6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePrimaryInner6193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePrimaryInner6254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePrimaryInner6315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePrimaryInner6376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePrimaryInner6437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePrimaryInner6498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePrimaryInner6559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePrimaryInner6620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rulePrimaryInner6681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePrimaryInner6742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleLiteral6861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6878 = new BitSet(new long[]{0x0000000000000002L,0x0000000003F80000L});
    public static final BitSet FOLLOW_ruleLiteralInner_in_ruleLiteral6904 = new BitSet(new long[]{0x0000000000000002L,0x0000000003F80000L});
    public static final BitSet FOLLOW_ruleLiteralInner_in_entryRuleLiteralInner6941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInner6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleLiteralInner6995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleLiteralInner7056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleLiteralInner7117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleLiteralInner7178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleLiteralInner7239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleLiteralInner7300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLiteralInner7361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7391 = new BitSet(new long[]{0x0000000000000002L});

}