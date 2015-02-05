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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PROJECT'", "'PROJECTNAME'", "'NAME'", "'CLASS'", "'NOCLASS'", "'PREFIX'", "'SUFFIX'", "'BLOCKING'", "'BRACES'", "'INDENT'", "'PROCEDURE'", "'TYPES'", "'COLONSEPERATED'", "'SPACESEPERATED'", "'INHEADER'", "'INFERRED'", "'UNTYPED'", "'EXPRESSION'", "'CALLER'", "'.'", "'RULE'", "'='", "'INFIX'", "'INFIXRIGHT'", "'OUTER'", "'COMPOUND'", "'('", "')'", "'BRACKET'", "'PARENTHESIS'", "'ANGLE'", "'MEMBERFEATURE'", "'SUBRULE'", "'SUBPREFIX'", "'SUBSUFFIX'", "'SUBINFIX'", "'SUBINFIXRIGHT'", "'SUBBRACKET'", "'SUBBRACES'", "'SUBPARENTHESIS'", "'SUBANGLE'", "'INNERRULE'", "'INNERPREFIX'", "'INNERSUFFIX'", "'INNERINFIX'", "'INNERINFIXRIGHT'", "'INNERBRACKET'", "'INNERBRACES'", "'INNERPARENTHESIS'", "'INNERANGLE'", "'?'", "'=>'", "'|'", "'PRIMARY'", "'CONSTRUCTOR'", "'BLOCK'", "'SWITCH'", "'SYNCHRONIZED'", "'FEATURECALL'", "'IFEXPRESSION'", "'FOREXPRESSION'", "'BASICFORLOOPEXPRESSION'", "'WHILEEXPRESSION'", "'DOWHILEEXPRESSION'", "'THROWEXPRESSION'", "'RETURNEXPRESSION'", "'TRYCATCHFINALYEXPRESSION'", "'PARENTHESIZEDEXPRESSION'", "'LITERALEXPRESSION'", "'LITERAL'", "'COLLECTIONLITERAL'", "'CLOSURE'", "'BOOLEANLITERAL'", "'NUMBERLITERAL'", "'NULLLITERAL'", "'STRINGLITERAL'", "'TYPELITERAL'"
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
    public static final int T__45=45;
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
                case 64:
                    {
                    alt1=4;
                    }
                    break;
                case 80:
                    {
                    alt1=5;
                    }
                    break;
                case 28:
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:437:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:440:28: ( (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:441:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:441:1: (otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:441:3: otherlv_0= 'PROCEDURE' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )*
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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:2: ( (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) ) | (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) ) | (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) ) )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt6=1;
                    }
                    break;
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                case 22:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:3: (otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:463:5: otherlv_2= 'PREFIX' ( (lv_prefix_3_0= ruleMultString ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleProcedure876); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getPREFIXKeyword_2_0_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:467:1: ( (lv_prefix_3_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:468:1: (lv_prefix_3_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:468:1: (lv_prefix_3_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:469:3: lv_prefix_3_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getPrefixMultStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleProcedure897);
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:486:6: (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:486:6: (otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:486:8: otherlv_4= 'SUFFIX' ( (lv_suffix_5_0= ruleMultString ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleProcedure917); 

            	        	newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getSUFFIXKeyword_2_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:490:1: ( (lv_suffix_5_0= ruleMultString ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:491:1: (lv_suffix_5_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:491:1: (lv_suffix_5_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:492:3: lv_suffix_5_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getSuffixMultStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleProcedure938);
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
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:509:6: (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:509:6: (otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:509:8: otherlv_6= 'TYPES' ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleProcedure958); 

            	        	newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getTYPESKeyword_2_2_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:513:1: ( ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:514:1: ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:514:1: ( (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:515:1: (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:515:1: (lv_types_7_1= 'COLONSEPERATED' | lv_types_7_2= 'SPACESEPERATED' | lv_types_7_3= 'INHEADER' | lv_types_7_4= 'INFERRED' | lv_types_7_5= 'UNTYPED' )
            	    int alt5=5;
            	    switch ( input.LA(1) ) {
            	    case 23:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt5=4;
            	        }
            	        break;
            	    case 27:
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
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:516:3: lv_types_7_1= 'COLONSEPERATED'
            	            {
            	            lv_types_7_1=(Token)match(input,23,FOLLOW_23_in_ruleProcedure978); 

            	                    newLeafNode(lv_types_7_1, grammarAccess.getProcedureAccess().getTypesCOLONSEPERATEDKeyword_2_2_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:528:8: lv_types_7_2= 'SPACESEPERATED'
            	            {
            	            lv_types_7_2=(Token)match(input,24,FOLLOW_24_in_ruleProcedure1007); 

            	                    newLeafNode(lv_types_7_2, grammarAccess.getProcedureAccess().getTypesSPACESEPERATEDKeyword_2_2_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:540:8: lv_types_7_3= 'INHEADER'
            	            {
            	            lv_types_7_3=(Token)match(input,25,FOLLOW_25_in_ruleProcedure1036); 

            	                    newLeafNode(lv_types_7_3, grammarAccess.getProcedureAccess().getTypesINHEADERKeyword_2_2_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:552:8: lv_types_7_4= 'INFERRED'
            	            {
            	            lv_types_7_4=(Token)match(input,26,FOLLOW_26_in_ruleProcedure1065); 

            	                    newLeafNode(lv_types_7_4, grammarAccess.getProcedureAccess().getTypesINFERREDKeyword_2_2_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getProcedureRule());
            	            	        }
            	                   		addWithLastConsumed(current, "types", lv_types_7_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:564:8: lv_types_7_5= 'UNTYPED'
            	            {
            	            lv_types_7_5=(Token)match(input,27,FOLLOW_27_in_ruleProcedure1094); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:587:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:588:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:589:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1149);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1159); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:596:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_prec_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:599:28: ( (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:600:1: (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:600:1: (otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:600:3: otherlv_0= 'EXPRESSION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_prec_2_0= rulePrecedence ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleExpression1196); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getEXPRESSIONKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:604:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:605:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:605:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:606:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1213); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:622:2: ( (lv_prec_2_0= rulePrecedence ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)||LA7_0==19||LA7_0==29||LA7_0==31||(LA7_0>=33 && LA7_0<=36)||(LA7_0>=39 && LA7_0<=42)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:623:1: (lv_prec_2_0= rulePrecedence )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:623:1: (lv_prec_2_0= rulePrecedence )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:624:3: lv_prec_2_0= rulePrecedence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getPrecPrecedenceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrecedence_in_ruleExpression1239);
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:648:1: entryRulePrecedence returns [EObject current=null] : iv_rulePrecedence= rulePrecedence EOF ;
    public final EObject entryRulePrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:649:2: (iv_rulePrecedence= rulePrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:650:2: iv_rulePrecedence= rulePrecedence EOF
            {
             newCompositeNode(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_rulePrecedence_in_entryRulePrecedence1276);
            iv_rulePrecedence=rulePrecedence();

            state._fsp--;

             current =iv_rulePrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecedence1286); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:657:1: rulePrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' ) | ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:660:28: ( ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' ) | ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' ) | ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:1: ( ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? ) | ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ ) | ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' ) | ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) ) )
            int alt20=13;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt20=1;
                }
                break;
            case 31:
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
            case 33:
                {
                alt20=5;
                }
                break;
            case 34:
                {
                alt20=6;
                }
                break;
            case 35:
                {
                alt20=7;
                }
                break;
            case 36:
                {
                alt20=8;
                }
                break;
            case 39:
                {
                alt20=9;
                }
                break;
            case 19:
                {
                alt20=10;
                }
                break;
            case 40:
                {
                alt20=11;
                }
                break;
            case 41:
                {
                alt20=12;
                }
                break;
            case 42:
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:2: ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:2: ( ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )? )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:3: ( (lv_ruletyp_0_0= 'CALLER' ) ) ( (lv_rule_1_0= RULE_ID ) ) (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )?
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:661:3: ( (lv_ruletyp_0_0= 'CALLER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:662:1: (lv_ruletyp_0_0= 'CALLER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:662:1: (lv_ruletyp_0_0= 'CALLER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:663:3: lv_ruletyp_0_0= 'CALLER'
                    {
                    lv_ruletyp_0_0=(Token)match(input,29,FOLLOW_29_in_rulePrecedence1330); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "CALLER");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:676:2: ( (lv_rule_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:677:1: (lv_rule_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:677:1: (lv_rule_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:678:3: lv_rule_1_0= RULE_ID
                    {
                    lv_rule_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1360); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:694:2: (otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==30) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:694:4: otherlv_2= '.' ( (lv_feature1_3_0= RULE_ID ) )
                            {
                            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePrecedence1378); 

                                	newLeafNode(otherlv_2, grammarAccess.getPrecedenceAccess().getFullStopKeyword_0_2_0());
                                
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:698:1: ( (lv_feature1_3_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:699:1: (lv_feature1_3_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:699:1: (lv_feature1_3_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:700:3: lv_feature1_3_0= RULE_ID
                            {
                            lv_feature1_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1395); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:717:6: ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:717:6: ( ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:717:7: ( (lv_ruletyp_4_0= 'RULE' ) ) ( (lv_rule_5_0= RULE_ID ) ) ( (lv_customrule_6_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:717:7: ( (lv_ruletyp_4_0= 'RULE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:718:1: (lv_ruletyp_4_0= 'RULE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:718:1: (lv_ruletyp_4_0= 'RULE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:719:3: lv_ruletyp_4_0= 'RULE'
                    {
                    lv_ruletyp_4_0=(Token)match(input,31,FOLLOW_31_in_rulePrecedence1428); 

                            newLeafNode(lv_ruletyp_4_0, grammarAccess.getPrecedenceAccess().getRuletypRULEKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_4_0, "RULE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:732:2: ( (lv_rule_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:733:1: (lv_rule_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:733:1: (lv_rule_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:734:3: lv_rule_5_0= RULE_ID
                    {
                    lv_rule_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1458); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:750:2: ( (lv_customrule_6_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:751:1: (lv_customrule_6_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:751:1: (lv_customrule_6_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:752:3: lv_customrule_6_0= RULE_STRING
                    {
                    lv_customrule_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrecedence1480); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:769:6: ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:769:6: ( ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:769:7: ( (lv_ruletyp_7_0= 'PREFIX' ) ) ( (lv_rule_8_0= RULE_ID ) ) ( (lv_prefix_9_0= ruleMultString ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:769:7: ( (lv_ruletyp_7_0= 'PREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:770:1: (lv_ruletyp_7_0= 'PREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:770:1: (lv_ruletyp_7_0= 'PREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:771:3: lv_ruletyp_7_0= 'PREFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,16,FOLLOW_16_in_rulePrecedence1511); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "PREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:784:2: ( (lv_rule_8_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:785:1: (lv_rule_8_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:785:1: (lv_rule_8_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:786:3: lv_rule_8_0= RULE_ID
                    {
                    lv_rule_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1541); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:802:2: ( (lv_prefix_9_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:803:1: (lv_prefix_9_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:803:1: (lv_prefix_9_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:804:3: lv_prefix_9_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1567);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:820:2: ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==32) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:820:3: ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:820:3: ( (lv_feature1_10_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:821:1: (lv_feature1_10_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:821:1: (lv_feature1_10_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:822:3: lv_feature1_10_0= RULE_ID
                            {
                            lv_feature1_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1585); 

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

                            otherlv_11=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1602); 

                                	newLeafNode(otherlv_11, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_2_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:842:3: ( (lv_par1_12_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:843:1: (lv_par1_12_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:843:1: (lv_par1_12_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:844:3: lv_par1_12_0= RULE_ID
                    {
                    lv_par1_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1621); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:861:6: ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:861:6: ( ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:861:7: ( (lv_ruletyp_13_0= 'SUFFIX' ) ) ( (lv_rule_14_0= RULE_ID ) ) ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par1_17_0= RULE_ID ) ) ( (lv_suffix_18_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:861:7: ( (lv_ruletyp_13_0= 'SUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:862:1: (lv_ruletyp_13_0= 'SUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:862:1: (lv_ruletyp_13_0= 'SUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:863:3: lv_ruletyp_13_0= 'SUFFIX'
                    {
                    lv_ruletyp_13_0=(Token)match(input,17,FOLLOW_17_in_rulePrecedence1652); 

                            newLeafNode(lv_ruletyp_13_0, grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_13_0, "SUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:876:2: ( (lv_rule_14_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:877:1: (lv_rule_14_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:877:1: (lv_rule_14_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:878:3: lv_rule_14_0= RULE_ID
                    {
                    lv_rule_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1682); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:894:2: ( ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:894:3: ( (lv_feature1_15_0= RULE_ID ) ) otherlv_16= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:894:3: ( (lv_feature1_15_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:895:1: (lv_feature1_15_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:895:1: (lv_feature1_15_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:896:3: lv_feature1_15_0= RULE_ID
                            {
                            lv_feature1_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1705); 

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

                            otherlv_16=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1722); 

                                	newLeafNode(otherlv_16, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:916:3: ( (lv_par1_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:917:1: (lv_par1_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:917:1: (lv_par1_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:918:3: lv_par1_17_0= RULE_ID
                    {
                    lv_par1_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1741); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:934:2: ( (lv_suffix_18_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:935:1: (lv_suffix_18_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:935:1: (lv_suffix_18_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:936:3: lv_suffix_18_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_3_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1767);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:953:6: ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:953:6: ( ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:953:7: ( (lv_ruletyp_19_0= 'INFIX' ) ) ( (lv_rule_20_0= RULE_ID ) ) ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )? ( (lv_par1_23_0= RULE_ID ) ) ( (lv_infix_24_0= ruleMultString ) ) ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )? ( (lv_par2_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:953:7: ( (lv_ruletyp_19_0= 'INFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:954:1: (lv_ruletyp_19_0= 'INFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:954:1: (lv_ruletyp_19_0= 'INFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:955:3: lv_ruletyp_19_0= 'INFIX'
                    {
                    lv_ruletyp_19_0=(Token)match(input,33,FOLLOW_33_in_rulePrecedence1793); 

                            newLeafNode(lv_ruletyp_19_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_19_0, "INFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:968:2: ( (lv_rule_20_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:969:1: (lv_rule_20_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:969:1: (lv_rule_20_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:970:3: lv_rule_20_0= RULE_ID
                    {
                    lv_rule_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1823); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:986:2: ( ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:986:3: ( (lv_feature1_21_0= RULE_ID ) ) otherlv_22= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:986:3: ( (lv_feature1_21_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:987:1: (lv_feature1_21_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:987:1: (lv_feature1_21_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:988:3: lv_feature1_21_0= RULE_ID
                            {
                            lv_feature1_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1846); 

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

                            otherlv_22=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1863); 

                                	newLeafNode(otherlv_22, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1008:3: ( (lv_par1_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1009:1: (lv_par1_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1009:1: (lv_par1_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1010:3: lv_par1_23_0= RULE_ID
                    {
                    lv_par1_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1882); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1026:2: ( (lv_infix_24_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1027:1: (lv_infix_24_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1027:1: (lv_infix_24_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1028:3: lv_infix_24_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_4_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence1908);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1044:2: ( ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1044:3: ( (lv_feature2_25_0= RULE_ID ) ) otherlv_26= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1044:3: ( (lv_feature2_25_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1045:1: (lv_feature2_25_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1045:1: (lv_feature2_25_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1046:3: lv_feature2_25_0= RULE_ID
                            {
                            lv_feature2_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1926); 

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

                            otherlv_26=(Token)match(input,32,FOLLOW_32_in_rulePrecedence1943); 

                                	newLeafNode(otherlv_26, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1066:3: ( (lv_par2_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1067:1: (lv_par2_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1067:1: (lv_par2_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1068:3: lv_par2_27_0= RULE_ID
                    {
                    lv_par2_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence1962); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1085:6: ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1085:6: ( ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1085:7: ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )? ( (lv_par1_32_0= RULE_ID ) ) ( (lv_infix_33_0= ruleMultString ) ) ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )? ( (lv_par2_36_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1085:7: ( (lv_ruletyp_28_0= 'INFIXRIGHT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1086:1: (lv_ruletyp_28_0= 'INFIXRIGHT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1086:1: (lv_ruletyp_28_0= 'INFIXRIGHT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1087:3: lv_ruletyp_28_0= 'INFIXRIGHT'
                    {
                    lv_ruletyp_28_0=(Token)match(input,34,FOLLOW_34_in_rulePrecedence1993); 

                            newLeafNode(lv_ruletyp_28_0, grammarAccess.getPrecedenceAccess().getRuletypINFIXRIGHTKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_28_0, "INFIXRIGHT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1100:2: ( (lv_rule_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1101:1: (lv_rule_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1101:1: (lv_rule_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1102:3: lv_rule_29_0= RULE_ID
                    {
                    lv_rule_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2023); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1118:2: ( ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1118:3: ( (lv_feature1_30_0= RULE_ID ) ) otherlv_31= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1118:3: ( (lv_feature1_30_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1119:1: (lv_feature1_30_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1119:1: (lv_feature1_30_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1120:3: lv_feature1_30_0= RULE_ID
                            {
                            lv_feature1_30_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2046); 

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

                            otherlv_31=(Token)match(input,32,FOLLOW_32_in_rulePrecedence2063); 

                                	newLeafNode(otherlv_31, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_5_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1140:3: ( (lv_par1_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1141:1: (lv_par1_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1141:1: (lv_par1_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1142:3: lv_par1_32_0= RULE_ID
                    {
                    lv_par1_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2082); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1158:2: ( (lv_infix_33_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1159:1: (lv_infix_33_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1159:1: (lv_infix_33_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1160:3: lv_infix_33_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_5_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2108);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1176:2: ( ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1176:3: ( (lv_feature2_34_0= RULE_ID ) ) otherlv_35= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1176:3: ( (lv_feature2_34_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1177:1: (lv_feature2_34_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1177:1: (lv_feature2_34_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1178:3: lv_feature2_34_0= RULE_ID
                            {
                            lv_feature2_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2126); 

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

                            otherlv_35=(Token)match(input,32,FOLLOW_32_in_rulePrecedence2143); 

                                	newLeafNode(otherlv_35, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_5_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1198:3: ( (lv_par2_36_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1199:1: (lv_par2_36_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1199:1: (lv_par2_36_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1200:3: lv_par2_36_0= RULE_ID
                    {
                    lv_par2_36_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2162); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1217:6: ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1217:6: ( ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+ )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1217:7: ( (lv_ruletyp_37_0= 'OUTER' ) ) ( (lv_rule_38_0= RULE_ID ) ) ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )? ( (lv_par1_41_0= RULE_ID ) ) ( (lv_inner_42_0= ruleInnerPrecedence ) )+
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1217:7: ( (lv_ruletyp_37_0= 'OUTER' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1218:1: (lv_ruletyp_37_0= 'OUTER' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1218:1: (lv_ruletyp_37_0= 'OUTER' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1219:3: lv_ruletyp_37_0= 'OUTER'
                    {
                    lv_ruletyp_37_0=(Token)match(input,35,FOLLOW_35_in_rulePrecedence2193); 

                            newLeafNode(lv_ruletyp_37_0, grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_37_0, "OUTER");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1232:2: ( (lv_rule_38_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1233:1: (lv_rule_38_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1233:1: (lv_rule_38_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1234:3: lv_rule_38_0= RULE_ID
                    {
                    lv_rule_38_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2223); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1250:2: ( ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '=' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==32) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1250:3: ( (lv_feature1_39_0= RULE_ID ) ) otherlv_40= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1250:3: ( (lv_feature1_39_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1251:1: (lv_feature1_39_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1251:1: (lv_feature1_39_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1252:3: lv_feature1_39_0= RULE_ID
                            {
                            lv_feature1_39_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2246); 

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

                            otherlv_40=(Token)match(input,32,FOLLOW_32_in_rulePrecedence2263); 

                                	newLeafNode(otherlv_40, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_6_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1272:3: ( (lv_par1_41_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1273:1: (lv_par1_41_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1273:1: (lv_par1_41_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1274:3: lv_par1_41_0= RULE_ID
                    {
                    lv_par1_41_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2282); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1290:2: ( (lv_inner_42_0= ruleInnerPrecedence ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=52 && LA16_0<=60)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1291:1: (lv_inner_42_0= ruleInnerPrecedence )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1291:1: (lv_inner_42_0= ruleInnerPrecedence )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1292:3: lv_inner_42_0= ruleInnerPrecedence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInnerInnerPrecedenceParserRuleCall_6_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInnerPrecedence_in_rulePrecedence2308);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1309:6: ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1309:6: ( ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1309:7: ( (lv_ruletyp_43_0= 'COMPOUND' ) ) ( (lv_rule_44_0= RULE_ID ) ) otherlv_45= '(' ( (lv_prec_46_0= ruleSubPrecedence ) )+ otherlv_47= ')'
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1309:7: ( (lv_ruletyp_43_0= 'COMPOUND' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1310:1: (lv_ruletyp_43_0= 'COMPOUND' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1310:1: (lv_ruletyp_43_0= 'COMPOUND' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1311:3: lv_ruletyp_43_0= 'COMPOUND'
                    {
                    lv_ruletyp_43_0=(Token)match(input,36,FOLLOW_36_in_rulePrecedence2335); 

                            newLeafNode(lv_ruletyp_43_0, grammarAccess.getPrecedenceAccess().getRuletypCOMPOUNDKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_43_0, "COMPOUND");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1324:2: ( (lv_rule_44_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1325:1: (lv_rule_44_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1325:1: (lv_rule_44_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1326:3: lv_rule_44_0= RULE_ID
                    {
                    lv_rule_44_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2365); 

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

                    otherlv_45=(Token)match(input,37,FOLLOW_37_in_rulePrecedence2382); 

                        	newLeafNode(otherlv_45, grammarAccess.getPrecedenceAccess().getLeftParenthesisKeyword_7_2());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1346:1: ( (lv_prec_46_0= ruleSubPrecedence ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=43 && LA17_0<=51)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1347:1: (lv_prec_46_0= ruleSubPrecedence )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1347:1: (lv_prec_46_0= ruleSubPrecedence )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1348:3: lv_prec_46_0= ruleSubPrecedence
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getPrecSubPrecedenceParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubPrecedence_in_rulePrecedence2403);
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

                    otherlv_47=(Token)match(input,38,FOLLOW_38_in_rulePrecedence2416); 

                        	newLeafNode(otherlv_47, grammarAccess.getPrecedenceAccess().getRightParenthesisKeyword_7_4());
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1369:6: ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1369:6: ( ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1369:7: ( (lv_ruletyp_48_0= 'BRACKET' ) ) ( (lv_rule_49_0= RULE_ID ) ) ( (lv_bracket_50_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1369:7: ( (lv_ruletyp_48_0= 'BRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1370:1: (lv_ruletyp_48_0= 'BRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1370:1: (lv_ruletyp_48_0= 'BRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1371:3: lv_ruletyp_48_0= 'BRACKET'
                    {
                    lv_ruletyp_48_0=(Token)match(input,39,FOLLOW_39_in_rulePrecedence2442); 

                            newLeafNode(lv_ruletyp_48_0, grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_48_0, "BRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1384:2: ( (lv_rule_49_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1385:1: (lv_rule_49_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1385:1: (lv_rule_49_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1386:3: lv_rule_49_0= RULE_ID
                    {
                    lv_rule_49_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2472); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1402:2: ( (lv_bracket_50_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1403:1: (lv_bracket_50_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1403:1: (lv_bracket_50_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1404:3: lv_bracket_50_0= RULE_ID
                    {
                    lv_bracket_50_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2494); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1421:6: ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1421:6: ( ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1421:7: ( (lv_ruletyp_51_0= 'BRACES' ) ) ( (lv_rule_52_0= RULE_ID ) ) ( (lv_braces_53_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1421:7: ( (lv_ruletyp_51_0= 'BRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1422:1: (lv_ruletyp_51_0= 'BRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1422:1: (lv_ruletyp_51_0= 'BRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1423:3: lv_ruletyp_51_0= 'BRACES'
                    {
                    lv_ruletyp_51_0=(Token)match(input,19,FOLLOW_19_in_rulePrecedence2525); 

                            newLeafNode(lv_ruletyp_51_0, grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_51_0, "BRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1436:2: ( (lv_rule_52_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1437:1: (lv_rule_52_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1437:1: (lv_rule_52_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1438:3: lv_rule_52_0= RULE_ID
                    {
                    lv_rule_52_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2555); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1454:2: ( (lv_braces_53_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1455:1: (lv_braces_53_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1455:1: (lv_braces_53_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1456:3: lv_braces_53_0= RULE_ID
                    {
                    lv_braces_53_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2577); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1473:6: ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1473:6: ( ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1473:7: ( (lv_ruletyp_54_0= 'PARENTHESIS' ) ) ( (lv_rule_55_0= RULE_ID ) ) ( (lv_parenthesis_56_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1473:7: ( (lv_ruletyp_54_0= 'PARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1474:1: (lv_ruletyp_54_0= 'PARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1474:1: (lv_ruletyp_54_0= 'PARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1475:3: lv_ruletyp_54_0= 'PARENTHESIS'
                    {
                    lv_ruletyp_54_0=(Token)match(input,40,FOLLOW_40_in_rulePrecedence2608); 

                            newLeafNode(lv_ruletyp_54_0, grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_54_0, "PARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1488:2: ( (lv_rule_55_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1489:1: (lv_rule_55_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1489:1: (lv_rule_55_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1490:3: lv_rule_55_0= RULE_ID
                    {
                    lv_rule_55_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2638); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1506:2: ( (lv_parenthesis_56_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1507:1: (lv_parenthesis_56_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1507:1: (lv_parenthesis_56_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1508:3: lv_parenthesis_56_0= RULE_ID
                    {
                    lv_parenthesis_56_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2660); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1525:6: ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1525:6: ( ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1525:7: ( (lv_ruletyp_57_0= 'ANGLE' ) ) ( (lv_rule_58_0= RULE_ID ) ) ( (lv_angle_59_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1525:7: ( (lv_ruletyp_57_0= 'ANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1526:1: (lv_ruletyp_57_0= 'ANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1526:1: (lv_ruletyp_57_0= 'ANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1527:3: lv_ruletyp_57_0= 'ANGLE'
                    {
                    lv_ruletyp_57_0=(Token)match(input,41,FOLLOW_41_in_rulePrecedence2691); 

                            newLeafNode(lv_ruletyp_57_0, grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_57_0, "ANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1540:2: ( (lv_rule_58_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1541:1: (lv_rule_58_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1541:1: (lv_rule_58_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1542:3: lv_rule_58_0= RULE_ID
                    {
                    lv_rule_58_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2721); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1558:2: ( (lv_angle_59_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1559:1: (lv_angle_59_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1559:1: (lv_angle_59_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1560:3: lv_angle_59_0= RULE_ID
                    {
                    lv_angle_59_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2743); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1577:6: ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1577:6: ( ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1577:7: ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) ) ( (lv_rule_61_0= RULE_ID ) ) ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )? ( (lv_par1_64_0= RULE_ID ) ) ( (lv_infix_65_0= ruleMultString ) ) ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )? ( (lv_par2_68_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1577:7: ( (lv_ruletyp_60_0= 'MEMBERFEATURE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1578:1: (lv_ruletyp_60_0= 'MEMBERFEATURE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1578:1: (lv_ruletyp_60_0= 'MEMBERFEATURE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1579:3: lv_ruletyp_60_0= 'MEMBERFEATURE'
                    {
                    lv_ruletyp_60_0=(Token)match(input,42,FOLLOW_42_in_rulePrecedence2774); 

                            newLeafNode(lv_ruletyp_60_0, grammarAccess.getPrecedenceAccess().getRuletypMEMBERFEATUREKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_60_0, "MEMBERFEATURE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1592:2: ( (lv_rule_61_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1593:1: (lv_rule_61_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1593:1: (lv_rule_61_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1594:3: lv_rule_61_0= RULE_ID
                    {
                    lv_rule_61_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2804); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1610:2: ( ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1610:3: ( (lv_feature1_62_0= RULE_ID ) ) otherlv_63= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1610:3: ( (lv_feature1_62_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1611:1: (lv_feature1_62_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1611:1: (lv_feature1_62_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1612:3: lv_feature1_62_0= RULE_ID
                            {
                            lv_feature1_62_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2827); 

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

                            otherlv_63=(Token)match(input,32,FOLLOW_32_in_rulePrecedence2844); 

                                	newLeafNode(otherlv_63, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_12_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1632:3: ( (lv_par1_64_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1633:1: (lv_par1_64_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1633:1: (lv_par1_64_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1634:3: lv_par1_64_0= RULE_ID
                    {
                    lv_par1_64_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2863); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1650:2: ( (lv_infix_65_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1651:1: (lv_infix_65_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1651:1: (lv_infix_65_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1652:3: lv_infix_65_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_12_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrecedence2889);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1668:2: ( ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '=' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==32) ) {
                            alt19=1;
                        }
                    }
                    switch (alt19) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1668:3: ( (lv_feature2_66_0= RULE_ID ) ) otherlv_67= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1668:3: ( (lv_feature2_66_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1669:1: (lv_feature2_66_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1669:1: (lv_feature2_66_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1670:3: lv_feature2_66_0= RULE_ID
                            {
                            lv_feature2_66_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2907); 

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

                            otherlv_67=(Token)match(input,32,FOLLOW_32_in_rulePrecedence2924); 

                                	newLeafNode(otherlv_67, grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_12_5_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1690:3: ( (lv_par2_68_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1691:1: (lv_par2_68_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1691:1: (lv_par2_68_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1692:3: lv_par2_68_0= RULE_ID
                    {
                    lv_par2_68_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrecedence2943); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1716:1: entryRuleSubPrecedence returns [EObject current=null] : iv_ruleSubPrecedence= ruleSubPrecedence EOF ;
    public final EObject entryRuleSubPrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1717:2: (iv_ruleSubPrecedence= ruleSubPrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1718:2: iv_ruleSubPrecedence= ruleSubPrecedence EOF
            {
             newCompositeNode(grammarAccess.getSubPrecedenceRule()); 
            pushFollow(FOLLOW_ruleSubPrecedence_in_entryRuleSubPrecedence2985);
            iv_ruleSubPrecedence=ruleSubPrecedence();

            state._fsp--;

             current =iv_ruleSubPrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPrecedence2995); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1725:1: ruleSubPrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1728:28: ( ( ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1729:1: ( ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1729:1: ( ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) ) )
            int alt26=9;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt26=1;
                }
                break;
            case 44:
                {
                alt26=2;
                }
                break;
            case 45:
                {
                alt26=3;
                }
                break;
            case 46:
                {
                alt26=4;
                }
                break;
            case 47:
                {
                alt26=5;
                }
                break;
            case 48:
                {
                alt26=6;
                }
                break;
            case 49:
                {
                alt26=7;
                }
                break;
            case 50:
                {
                alt26=8;
                }
                break;
            case 51:
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1729:2: ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1729:2: ( ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1729:3: ( (lv_ruletyp_0_0= 'SUBRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1729:3: ( (lv_ruletyp_0_0= 'SUBRULE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1730:1: (lv_ruletyp_0_0= 'SUBRULE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1730:1: (lv_ruletyp_0_0= 'SUBRULE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1731:3: lv_ruletyp_0_0= 'SUBRULE'
                    {
                    lv_ruletyp_0_0=(Token)match(input,43,FOLLOW_43_in_ruleSubPrecedence3039); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBRULEKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "SUBRULE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1744:2: ( (lv_customrule_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1745:1: (lv_customrule_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1745:1: (lv_customrule_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1746:3: lv_customrule_1_0= RULE_STRING
                    {
                    lv_customrule_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSubPrecedence3069); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1763:6: ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1763:6: ( ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1763:7: ( (lv_ruletyp_2_0= 'SUBPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1763:7: ( (lv_ruletyp_2_0= 'SUBPREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1764:1: (lv_ruletyp_2_0= 'SUBPREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1764:1: (lv_ruletyp_2_0= 'SUBPREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1765:3: lv_ruletyp_2_0= 'SUBPREFIX'
                    {
                    lv_ruletyp_2_0=(Token)match(input,44,FOLLOW_44_in_ruleSubPrecedence3100); 

                            newLeafNode(lv_ruletyp_2_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBPREFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_2_0, "SUBPREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1778:2: ( (lv_prefix_3_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1779:1: (lv_prefix_3_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1779:1: (lv_prefix_3_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1780:3: lv_prefix_3_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubPrecedenceAccess().getPrefixMultStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleSubPrecedence3134);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1796:2: ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )?
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
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1796:3: ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1796:3: ( (lv_feature1_4_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1797:1: (lv_feature1_4_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1797:1: (lv_feature1_4_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1798:3: lv_feature1_4_0= RULE_ID
                            {
                            lv_feature1_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3152); 

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

                            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleSubPrecedence3169); 

                                	newLeafNode(otherlv_5, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_1_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1818:3: ( (lv_par2_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1819:1: (lv_par2_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1819:1: (lv_par2_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1820:3: lv_par2_6_0= RULE_ID
                    {
                    lv_par2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3188); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1837:6: ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1837:6: ( ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1837:7: ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1837:7: ( (lv_ruletyp_7_0= 'SUBSUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1838:1: (lv_ruletyp_7_0= 'SUBSUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1838:1: (lv_ruletyp_7_0= 'SUBSUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1839:3: lv_ruletyp_7_0= 'SUBSUFFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,45,FOLLOW_45_in_ruleSubPrecedence3219); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBSUFFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "SUBSUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1852:2: ( (lv_suffix_8_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1853:1: (lv_suffix_8_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1853:1: (lv_suffix_8_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1854:3: lv_suffix_8_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubPrecedenceAccess().getSuffixMultStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleSubPrecedence3253);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1871:6: ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1871:6: ( ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1871:7: ( (lv_ruletyp_9_0= 'SUBINFIX' ) ) ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )? ( (lv_par1_12_0= RULE_ID ) ) ( (lv_infix_13_0= ruleMultString ) ) ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )? ( (lv_par2_16_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1871:7: ( (lv_ruletyp_9_0= 'SUBINFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1872:1: (lv_ruletyp_9_0= 'SUBINFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1872:1: (lv_ruletyp_9_0= 'SUBINFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1873:3: lv_ruletyp_9_0= 'SUBINFIX'
                    {
                    lv_ruletyp_9_0=(Token)match(input,46,FOLLOW_46_in_ruleSubPrecedence3279); 

                            newLeafNode(lv_ruletyp_9_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBINFIXKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_9_0, "SUBINFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1886:2: ( ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '=' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        int LA22_1 = input.LA(2);

                        if ( (LA22_1==32) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1886:3: ( (lv_feature1_10_0= RULE_ID ) ) otherlv_11= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1886:3: ( (lv_feature1_10_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1887:1: (lv_feature1_10_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1887:1: (lv_feature1_10_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1888:3: lv_feature1_10_0= RULE_ID
                            {
                            lv_feature1_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3310); 

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

                            otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleSubPrecedence3327); 

                                	newLeafNode(otherlv_11, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_3_1_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1908:3: ( (lv_par1_12_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1909:1: (lv_par1_12_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1909:1: (lv_par1_12_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1910:3: lv_par1_12_0= RULE_ID
                    {
                    lv_par1_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3346); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1926:2: ( (lv_infix_13_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1927:1: (lv_infix_13_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1927:1: (lv_infix_13_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1928:3: lv_infix_13_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubPrecedenceAccess().getInfixMultStringParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleSubPrecedence3372);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1944:2: ( ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '=' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        int LA23_1 = input.LA(2);

                        if ( (LA23_1==32) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1944:3: ( (lv_feature2_14_0= RULE_ID ) ) otherlv_15= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1944:3: ( (lv_feature2_14_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1945:1: (lv_feature2_14_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1945:1: (lv_feature2_14_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1946:3: lv_feature2_14_0= RULE_ID
                            {
                            lv_feature2_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3390); 

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

                            otherlv_15=(Token)match(input,32,FOLLOW_32_in_ruleSubPrecedence3407); 

                                	newLeafNode(otherlv_15, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_3_4_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1966:3: ( (lv_par2_16_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1967:1: (lv_par2_16_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1967:1: (lv_par2_16_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1968:3: lv_par2_16_0= RULE_ID
                    {
                    lv_par2_16_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3426); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1985:6: ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1985:6: ( ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1985:7: ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) ) ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )? ( (lv_par1_20_0= RULE_ID ) ) ( (lv_infix_21_0= ruleMultString ) ) ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )? ( (lv_par2_24_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1985:7: ( (lv_ruletyp_17_0= 'SUBINFIXRIGHT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1986:1: (lv_ruletyp_17_0= 'SUBINFIXRIGHT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1986:1: (lv_ruletyp_17_0= 'SUBINFIXRIGHT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:1987:3: lv_ruletyp_17_0= 'SUBINFIXRIGHT'
                    {
                    lv_ruletyp_17_0=(Token)match(input,47,FOLLOW_47_in_ruleSubPrecedence3457); 

                            newLeafNode(lv_ruletyp_17_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBINFIXRIGHTKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_17_0, "SUBINFIXRIGHT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2000:2: ( ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '=' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        int LA24_1 = input.LA(2);

                        if ( (LA24_1==32) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2000:3: ( (lv_feature1_18_0= RULE_ID ) ) otherlv_19= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2000:3: ( (lv_feature1_18_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2001:1: (lv_feature1_18_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2001:1: (lv_feature1_18_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2002:3: lv_feature1_18_0= RULE_ID
                            {
                            lv_feature1_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3488); 

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

                            otherlv_19=(Token)match(input,32,FOLLOW_32_in_ruleSubPrecedence3505); 

                                	newLeafNode(otherlv_19, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_4_1_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2022:3: ( (lv_par1_20_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2023:1: (lv_par1_20_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2023:1: (lv_par1_20_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2024:3: lv_par1_20_0= RULE_ID
                    {
                    lv_par1_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3524); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2040:2: ( (lv_infix_21_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2041:1: (lv_infix_21_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2041:1: (lv_infix_21_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2042:3: lv_infix_21_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubPrecedenceAccess().getInfixMultStringParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleSubPrecedence3550);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2058:2: ( ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '=' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==32) ) {
                            alt25=1;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2058:3: ( (lv_feature2_22_0= RULE_ID ) ) otherlv_23= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2058:3: ( (lv_feature2_22_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2059:1: (lv_feature2_22_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2059:1: (lv_feature2_22_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2060:3: lv_feature2_22_0= RULE_ID
                            {
                            lv_feature2_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3568); 

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

                            otherlv_23=(Token)match(input,32,FOLLOW_32_in_ruleSubPrecedence3585); 

                                	newLeafNode(otherlv_23, grammarAccess.getSubPrecedenceAccess().getEqualsSignKeyword_4_4_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2080:3: ( (lv_par2_24_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2081:1: (lv_par2_24_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2081:1: (lv_par2_24_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2082:3: lv_par2_24_0= RULE_ID
                    {
                    lv_par2_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3604); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2099:6: ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2099:6: ( ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2099:7: ( (lv_ruletyp_25_0= 'SUBBRACKET' ) ) ( (lv_rule_26_0= RULE_ID ) ) ( (lv_bracket_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2099:7: ( (lv_ruletyp_25_0= 'SUBBRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2100:1: (lv_ruletyp_25_0= 'SUBBRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2100:1: (lv_ruletyp_25_0= 'SUBBRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2101:3: lv_ruletyp_25_0= 'SUBBRACKET'
                    {
                    lv_ruletyp_25_0=(Token)match(input,48,FOLLOW_48_in_ruleSubPrecedence3635); 

                            newLeafNode(lv_ruletyp_25_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBBRACKETKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_25_0, "SUBBRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2114:2: ( (lv_rule_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2115:1: (lv_rule_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2115:1: (lv_rule_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2116:3: lv_rule_26_0= RULE_ID
                    {
                    lv_rule_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3665); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2132:2: ( (lv_bracket_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2133:1: (lv_bracket_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2133:1: (lv_bracket_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2134:3: lv_bracket_27_0= RULE_ID
                    {
                    lv_bracket_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3687); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2151:6: ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2151:6: ( ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2151:7: ( (lv_ruletyp_28_0= 'SUBBRACES' ) ) ( (lv_rule_29_0= RULE_ID ) ) ( (lv_braces_30_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2151:7: ( (lv_ruletyp_28_0= 'SUBBRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2152:1: (lv_ruletyp_28_0= 'SUBBRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2152:1: (lv_ruletyp_28_0= 'SUBBRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2153:3: lv_ruletyp_28_0= 'SUBBRACES'
                    {
                    lv_ruletyp_28_0=(Token)match(input,49,FOLLOW_49_in_ruleSubPrecedence3718); 

                            newLeafNode(lv_ruletyp_28_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBBRACESKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_28_0, "SUBBRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2166:2: ( (lv_rule_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2167:1: (lv_rule_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2167:1: (lv_rule_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2168:3: lv_rule_29_0= RULE_ID
                    {
                    lv_rule_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3748); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2184:2: ( (lv_braces_30_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2185:1: (lv_braces_30_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2185:1: (lv_braces_30_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2186:3: lv_braces_30_0= RULE_ID
                    {
                    lv_braces_30_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3770); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2203:6: ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2203:6: ( ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2203:7: ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) ) ( (lv_rule_32_0= RULE_ID ) ) ( (lv_parenthesis_33_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2203:7: ( (lv_ruletyp_31_0= 'SUBPARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2204:1: (lv_ruletyp_31_0= 'SUBPARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2204:1: (lv_ruletyp_31_0= 'SUBPARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2205:3: lv_ruletyp_31_0= 'SUBPARENTHESIS'
                    {
                    lv_ruletyp_31_0=(Token)match(input,50,FOLLOW_50_in_ruleSubPrecedence3801); 

                            newLeafNode(lv_ruletyp_31_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBPARENTHESISKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_31_0, "SUBPARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2218:2: ( (lv_rule_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2219:1: (lv_rule_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2219:1: (lv_rule_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2220:3: lv_rule_32_0= RULE_ID
                    {
                    lv_rule_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3831); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2236:2: ( (lv_parenthesis_33_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2237:1: (lv_parenthesis_33_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2237:1: (lv_parenthesis_33_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2238:3: lv_parenthesis_33_0= RULE_ID
                    {
                    lv_parenthesis_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3853); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2255:6: ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2255:6: ( ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2255:7: ( (lv_ruletyp_34_0= 'SUBANGLE' ) ) ( (lv_rule_35_0= RULE_ID ) ) ( (lv_angle_36_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2255:7: ( (lv_ruletyp_34_0= 'SUBANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2256:1: (lv_ruletyp_34_0= 'SUBANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2256:1: (lv_ruletyp_34_0= 'SUBANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2257:3: lv_ruletyp_34_0= 'SUBANGLE'
                    {
                    lv_ruletyp_34_0=(Token)match(input,51,FOLLOW_51_in_ruleSubPrecedence3884); 

                            newLeafNode(lv_ruletyp_34_0, grammarAccess.getSubPrecedenceAccess().getRuletypSUBANGLEKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_34_0, "SUBANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2270:2: ( (lv_rule_35_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2271:1: (lv_rule_35_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2271:1: (lv_rule_35_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2272:3: lv_rule_35_0= RULE_ID
                    {
                    lv_rule_35_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3914); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2288:2: ( (lv_angle_36_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2289:1: (lv_angle_36_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2289:1: (lv_angle_36_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2290:3: lv_angle_36_0= RULE_ID
                    {
                    lv_angle_36_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubPrecedence3936); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2314:1: entryRuleInnerPrecedence returns [EObject current=null] : iv_ruleInnerPrecedence= ruleInnerPrecedence EOF ;
    public final EObject entryRuleInnerPrecedence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerPrecedence = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2315:2: (iv_ruleInnerPrecedence= ruleInnerPrecedence EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2316:2: iv_ruleInnerPrecedence= ruleInnerPrecedence EOF
            {
             newCompositeNode(grammarAccess.getInnerPrecedenceRule()); 
            pushFollow(FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence3978);
            iv_ruleInnerPrecedence=ruleInnerPrecedence();

            state._fsp--;

             current =iv_ruleInnerPrecedence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerPrecedence3988); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2323:1: ruleInnerPrecedence returns [EObject current=null] : ( ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2326:28: ( ( ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2327:1: ( ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2327:1: ( ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) ) | ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) ) | ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) ) | ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) ) )
            int alt34=9;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt34=1;
                }
                break;
            case 53:
                {
                alt34=2;
                }
                break;
            case 54:
                {
                alt34=3;
                }
                break;
            case 55:
                {
                alt34=4;
                }
                break;
            case 56:
                {
                alt34=5;
                }
                break;
            case 57:
                {
                alt34=6;
                }
                break;
            case 58:
                {
                alt34=7;
                }
                break;
            case 59:
                {
                alt34=8;
                }
                break;
            case 60:
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2327:2: ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2327:2: ( ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2327:3: ( (lv_ruletyp_0_0= 'INNERRULE' ) ) ( (lv_customrule_1_0= RULE_STRING ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2327:3: ( (lv_ruletyp_0_0= 'INNERRULE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2328:1: (lv_ruletyp_0_0= 'INNERRULE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2328:1: (lv_ruletyp_0_0= 'INNERRULE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2329:3: lv_ruletyp_0_0= 'INNERRULE'
                    {
                    lv_ruletyp_0_0=(Token)match(input,52,FOLLOW_52_in_ruleInnerPrecedence4032); 

                            newLeafNode(lv_ruletyp_0_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERRULEKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_0_0, "INNERRULE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2342:2: ( (lv_customrule_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2343:1: (lv_customrule_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2343:1: (lv_customrule_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2344:3: lv_customrule_1_0= RULE_STRING
                    {
                    lv_customrule_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInnerPrecedence4062); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2361:6: ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2361:6: ( ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2361:7: ( (lv_ruletyp_2_0= 'INNERPREFIX' ) ) ( (lv_prefix_3_0= ruleMultString ) ) ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )? ( (lv_par2_6_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2361:7: ( (lv_ruletyp_2_0= 'INNERPREFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2362:1: (lv_ruletyp_2_0= 'INNERPREFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2362:1: (lv_ruletyp_2_0= 'INNERPREFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2363:3: lv_ruletyp_2_0= 'INNERPREFIX'
                    {
                    lv_ruletyp_2_0=(Token)match(input,53,FOLLOW_53_in_ruleInnerPrecedence4093); 

                            newLeafNode(lv_ruletyp_2_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_2_0, "INNERPREFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2376:2: ( (lv_prefix_3_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2377:1: (lv_prefix_3_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2377:1: (lv_prefix_3_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2378:3: lv_prefix_3_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getPrefixMultStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence4127);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2394:2: ( ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '=' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) ) {
                        int LA27_1 = input.LA(2);

                        if ( (LA27_1==32) ) {
                            alt27=1;
                        }
                    }
                    switch (alt27) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2394:3: ( (lv_feature1_4_0= RULE_ID ) ) otherlv_5= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2394:3: ( (lv_feature1_4_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2395:1: (lv_feature1_4_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2395:1: (lv_feature1_4_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2396:3: lv_feature1_4_0= RULE_ID
                            {
                            lv_feature1_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4145); 

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

                            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleInnerPrecedence4162); 

                                	newLeafNode(otherlv_5, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_1_2_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2416:3: ( (lv_par2_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2417:1: (lv_par2_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2417:1: (lv_par2_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2418:3: lv_par2_6_0= RULE_ID
                    {
                    lv_par2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4181); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2435:6: ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2435:6: ( ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2435:7: ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) ) ( (lv_suffix_8_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2435:7: ( (lv_ruletyp_7_0= 'INNERSUFFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2436:1: (lv_ruletyp_7_0= 'INNERSUFFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2436:1: (lv_ruletyp_7_0= 'INNERSUFFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2437:3: lv_ruletyp_7_0= 'INNERSUFFIX'
                    {
                    lv_ruletyp_7_0=(Token)match(input,54,FOLLOW_54_in_ruleInnerPrecedence4212); 

                            newLeafNode(lv_ruletyp_7_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_7_0, "INNERSUFFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2450:2: ( (lv_suffix_8_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2451:1: (lv_suffix_8_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2451:1: (lv_suffix_8_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2452:3: lv_suffix_8_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getSuffixMultStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence4246);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2469:6: ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2469:6: ( ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2469:7: ( (lv_ruletyp_9_0= 'INNERINFIX' ) ) ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )? ( (lv_infix_14_0= ruleMultString ) ) ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )? ( (lv_par2_17_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2469:7: ( (lv_ruletyp_9_0= 'INNERINFIX' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2470:1: (lv_ruletyp_9_0= 'INNERINFIX' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2470:1: (lv_ruletyp_9_0= 'INNERINFIX' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2471:3: lv_ruletyp_9_0= 'INNERINFIX'
                    {
                    lv_ruletyp_9_0=(Token)match(input,55,FOLLOW_55_in_ruleInnerPrecedence4272); 

                            newLeafNode(lv_ruletyp_9_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_9_0, "INNERINFIX");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2484:2: ( ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==29) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2484:3: ( (lv_mod_10_0= 'CALLER' ) ) ( (lv_rule_11_0= RULE_ID ) ) (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )?
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2484:3: ( (lv_mod_10_0= 'CALLER' ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2485:1: (lv_mod_10_0= 'CALLER' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2485:1: (lv_mod_10_0= 'CALLER' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2486:3: lv_mod_10_0= 'CALLER'
                            {
                            lv_mod_10_0=(Token)match(input,29,FOLLOW_29_in_ruleInnerPrecedence4304); 

                                    newLeafNode(lv_mod_10_0, grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_3_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "mod", lv_mod_10_0, "CALLER");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2499:2: ( (lv_rule_11_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2500:1: (lv_rule_11_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2500:1: (lv_rule_11_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2501:3: lv_rule_11_0= RULE_ID
                            {
                            lv_rule_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4334); 

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

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2517:2: (otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) ) )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==30) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2517:4: otherlv_12= '.' ( (lv_feature1_13_0= RULE_ID ) )
                                    {
                                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleInnerPrecedence4352); 

                                        	newLeafNode(otherlv_12, grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_3_1_2_0());
                                        
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2521:1: ( (lv_feature1_13_0= RULE_ID ) )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2522:1: (lv_feature1_13_0= RULE_ID )
                                    {
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2522:1: (lv_feature1_13_0= RULE_ID )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2523:3: lv_feature1_13_0= RULE_ID
                                    {
                                    lv_feature1_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4369); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2539:6: ( (lv_infix_14_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2540:1: (lv_infix_14_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2540:1: (lv_infix_14_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2541:3: lv_infix_14_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence4399);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2557:2: ( ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '=' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==32) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2557:3: ( (lv_feature2_15_0= RULE_ID ) ) otherlv_16= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2557:3: ( (lv_feature2_15_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2558:1: (lv_feature2_15_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2558:1: (lv_feature2_15_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2559:3: lv_feature2_15_0= RULE_ID
                            {
                            lv_feature2_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4417); 

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

                            otherlv_16=(Token)match(input,32,FOLLOW_32_in_ruleInnerPrecedence4434); 

                                	newLeafNode(otherlv_16, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_3_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2579:3: ( (lv_par2_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2580:1: (lv_par2_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2580:1: (lv_par2_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2581:3: lv_par2_17_0= RULE_ID
                    {
                    lv_par2_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4453); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2598:6: ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2598:6: ( ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2598:7: ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) ) ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )? ( (lv_infix_23_0= ruleMultString ) ) ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )? ( (lv_par2_26_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2598:7: ( (lv_ruletyp_18_0= 'INNERINFIXRIGHT' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2599:1: (lv_ruletyp_18_0= 'INNERINFIXRIGHT' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2599:1: (lv_ruletyp_18_0= 'INNERINFIXRIGHT' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2600:3: lv_ruletyp_18_0= 'INNERINFIXRIGHT'
                    {
                    lv_ruletyp_18_0=(Token)match(input,56,FOLLOW_56_in_ruleInnerPrecedence4484); 

                            newLeafNode(lv_ruletyp_18_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXRIGHTKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_18_0, "INNERINFIXRIGHT");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2613:2: ( ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==29) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2613:3: ( (lv_mod_19_0= 'CALLER' ) ) ( (lv_rule_20_0= RULE_ID ) ) (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )?
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2613:3: ( (lv_mod_19_0= 'CALLER' ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2614:1: (lv_mod_19_0= 'CALLER' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2614:1: (lv_mod_19_0= 'CALLER' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2615:3: lv_mod_19_0= 'CALLER'
                            {
                            lv_mod_19_0=(Token)match(input,29,FOLLOW_29_in_ruleInnerPrecedence4516); 

                                    newLeafNode(lv_mod_19_0, grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_4_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                            	        }
                                   		setWithLastConsumed(current, "mod", lv_mod_19_0, "CALLER");
                            	    

                            }


                            }

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2628:2: ( (lv_rule_20_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2629:1: (lv_rule_20_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2629:1: (lv_rule_20_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2630:3: lv_rule_20_0= RULE_ID
                            {
                            lv_rule_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4546); 

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

                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2646:2: (otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) ) )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==30) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2646:4: otherlv_21= '.' ( (lv_feature1_22_0= RULE_ID ) )
                                    {
                                    otherlv_21=(Token)match(input,30,FOLLOW_30_in_ruleInnerPrecedence4564); 

                                        	newLeafNode(otherlv_21, grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_4_1_2_0());
                                        
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2650:1: ( (lv_feature1_22_0= RULE_ID ) )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2651:1: (lv_feature1_22_0= RULE_ID )
                                    {
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2651:1: (lv_feature1_22_0= RULE_ID )
                                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2652:3: lv_feature1_22_0= RULE_ID
                                    {
                                    lv_feature1_22_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4581); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2668:6: ( (lv_infix_23_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2669:1: (lv_infix_23_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2669:1: (lv_infix_23_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2670:3: lv_infix_23_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_ruleInnerPrecedence4611);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2686:2: ( ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '=' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==32) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2686:3: ( (lv_feature2_24_0= RULE_ID ) ) otherlv_25= '='
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2686:3: ( (lv_feature2_24_0= RULE_ID ) )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2687:1: (lv_feature2_24_0= RULE_ID )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2687:1: (lv_feature2_24_0= RULE_ID )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2688:3: lv_feature2_24_0= RULE_ID
                            {
                            lv_feature2_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4629); 

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

                            otherlv_25=(Token)match(input,32,FOLLOW_32_in_ruleInnerPrecedence4646); 

                                	newLeafNode(otherlv_25, grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_4_3_1());
                                

                            }
                            break;

                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2708:3: ( (lv_par2_26_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2709:1: (lv_par2_26_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2709:1: (lv_par2_26_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2710:3: lv_par2_26_0= RULE_ID
                    {
                    lv_par2_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4665); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2727:6: ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2727:6: ( ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2727:7: ( (lv_ruletyp_27_0= 'INNERBRACKET' ) ) ( (lv_rule_28_0= RULE_ID ) ) ( (lv_bracket_29_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2727:7: ( (lv_ruletyp_27_0= 'INNERBRACKET' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2728:1: (lv_ruletyp_27_0= 'INNERBRACKET' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2728:1: (lv_ruletyp_27_0= 'INNERBRACKET' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2729:3: lv_ruletyp_27_0= 'INNERBRACKET'
                    {
                    lv_ruletyp_27_0=(Token)match(input,57,FOLLOW_57_in_ruleInnerPrecedence4696); 

                            newLeafNode(lv_ruletyp_27_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_27_0, "INNERBRACKET");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2742:2: ( (lv_rule_28_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2743:1: (lv_rule_28_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2743:1: (lv_rule_28_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2744:3: lv_rule_28_0= RULE_ID
                    {
                    lv_rule_28_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4726); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2760:2: ( (lv_bracket_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2761:1: (lv_bracket_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2761:1: (lv_bracket_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2762:3: lv_bracket_29_0= RULE_ID
                    {
                    lv_bracket_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4748); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2779:6: ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2779:6: ( ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2779:7: ( (lv_ruletyp_30_0= 'INNERBRACES' ) ) ( (lv_rule_31_0= RULE_ID ) ) ( (lv_braces_32_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2779:7: ( (lv_ruletyp_30_0= 'INNERBRACES' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2780:1: (lv_ruletyp_30_0= 'INNERBRACES' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2780:1: (lv_ruletyp_30_0= 'INNERBRACES' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2781:3: lv_ruletyp_30_0= 'INNERBRACES'
                    {
                    lv_ruletyp_30_0=(Token)match(input,58,FOLLOW_58_in_ruleInnerPrecedence4779); 

                            newLeafNode(lv_ruletyp_30_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_30_0, "INNERBRACES");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2794:2: ( (lv_rule_31_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2795:1: (lv_rule_31_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2795:1: (lv_rule_31_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2796:3: lv_rule_31_0= RULE_ID
                    {
                    lv_rule_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4809); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2812:2: ( (lv_braces_32_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2813:1: (lv_braces_32_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2813:1: (lv_braces_32_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2814:3: lv_braces_32_0= RULE_ID
                    {
                    lv_braces_32_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4831); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2831:6: ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2831:6: ( ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2831:7: ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) ) ( (lv_rule_34_0= RULE_ID ) ) ( (lv_parenthesis_35_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2831:7: ( (lv_ruletyp_33_0= 'INNERPARENTHESIS' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2832:1: (lv_ruletyp_33_0= 'INNERPARENTHESIS' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2832:1: (lv_ruletyp_33_0= 'INNERPARENTHESIS' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2833:3: lv_ruletyp_33_0= 'INNERPARENTHESIS'
                    {
                    lv_ruletyp_33_0=(Token)match(input,59,FOLLOW_59_in_ruleInnerPrecedence4862); 

                            newLeafNode(lv_ruletyp_33_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_33_0, "INNERPARENTHESIS");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2846:2: ( (lv_rule_34_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2847:1: (lv_rule_34_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2847:1: (lv_rule_34_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2848:3: lv_rule_34_0= RULE_ID
                    {
                    lv_rule_34_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4892); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2864:2: ( (lv_parenthesis_35_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2865:1: (lv_parenthesis_35_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2865:1: (lv_parenthesis_35_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2866:3: lv_parenthesis_35_0= RULE_ID
                    {
                    lv_parenthesis_35_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4914); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2883:6: ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2883:6: ( ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2883:7: ( (lv_ruletyp_36_0= 'INNERANGLE' ) ) ( (lv_rule_37_0= RULE_ID ) ) ( (lv_angle_38_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2883:7: ( (lv_ruletyp_36_0= 'INNERANGLE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2884:1: (lv_ruletyp_36_0= 'INNERANGLE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2884:1: (lv_ruletyp_36_0= 'INNERANGLE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2885:3: lv_ruletyp_36_0= 'INNERANGLE'
                    {
                    lv_ruletyp_36_0=(Token)match(input,60,FOLLOW_60_in_ruleInnerPrecedence4945); 

                            newLeafNode(lv_ruletyp_36_0, grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerPrecedenceRule());
                    	        }
                           		setWithLastConsumed(current, "ruletyp", lv_ruletyp_36_0, "INNERANGLE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2898:2: ( (lv_rule_37_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2899:1: (lv_rule_37_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2899:1: (lv_rule_37_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2900:3: lv_rule_37_0= RULE_ID
                    {
                    lv_rule_37_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4975); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2916:2: ( (lv_angle_38_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2917:1: (lv_angle_38_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2917:1: (lv_angle_38_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2918:3: lv_angle_38_0= RULE_ID
                    {
                    lv_angle_38_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInnerPrecedence4997); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2942:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2943:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2944:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5039);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5049); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2951:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_qn_0_0=null;
        Token otherlv_1=null;
        Token lv_qn_2_0=null;

         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2954:28: ( ( ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2955:1: ( ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2955:1: ( ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2955:2: ( (lv_qn_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )*
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2955:2: ( (lv_qn_0_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2956:1: (lv_qn_0_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2956:1: (lv_qn_0_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2957:3: lv_qn_0_0= RULE_ID
            {
            lv_qn_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5091); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2973:2: (otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2973:4: otherlv_1= '.' ( (lv_qn_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleQualifiedName5109); 

            	        	newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	        
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2977:1: ( (lv_qn_2_0= RULE_ID ) )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2978:1: (lv_qn_2_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2978:1: (lv_qn_2_0= RULE_ID )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:2979:3: lv_qn_2_0= RULE_ID
            	    {
            	    lv_qn_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5126); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3003:1: entryRuleMultString returns [EObject current=null] : iv_ruleMultString= ruleMultString EOF ;
    public final EObject entryRuleMultString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3004:2: (iv_ruleMultString= ruleMultString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3005:2: iv_ruleMultString= ruleMultString EOF
            {
             newCompositeNode(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString5169);
            iv_ruleMultString=ruleMultString();

            state._fsp--;

             current =iv_ruleMultString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString5179); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3012:1: ruleMultString returns [EObject current=null] : ( () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3015:28: ( ( () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3016:1: ( () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3016:1: ( () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3016:2: () ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3016:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3017:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMultStringAccess().getMultStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3022:2: ( ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? ) | ( (lv_mi_3_0= RULE_ID ) ) | ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' ) )
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
            case 37:
            case 62:
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3022:3: ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3022:3: ( ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )? )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3022:4: ( (lv_ms_1_0= RULE_STRING ) ) ( (lv_opt_2_0= '?' ) )?
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3022:4: ( (lv_ms_1_0= RULE_STRING ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3023:1: (lv_ms_1_0= RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3023:1: (lv_ms_1_0= RULE_STRING )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3024:3: lv_ms_1_0= RULE_STRING
                    {
                    lv_ms_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultString5232); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3040:2: ( (lv_opt_2_0= '?' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==61) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3041:1: (lv_opt_2_0= '?' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3041:1: (lv_opt_2_0= '?' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3042:3: lv_opt_2_0= '?'
                            {
                            lv_opt_2_0=(Token)match(input,61,FOLLOW_61_in_ruleMultString5255); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3056:6: ( (lv_mi_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3056:6: ( (lv_mi_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3057:1: (lv_mi_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3057:1: (lv_mi_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3058:3: lv_mi_3_0= RULE_ID
                    {
                    lv_mi_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultString5293); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3075:6: ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3075:6: ( ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3075:7: ( (lv_synpred_4_0= '=>' ) )? otherlv_5= '(' ( (lv_cs_6_0= ruleComboString ) ) (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )* otherlv_9= ')'
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3075:7: ( (lv_synpred_4_0= '=>' ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==62) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3076:1: (lv_synpred_4_0= '=>' )
                            {
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3076:1: (lv_synpred_4_0= '=>' )
                            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3077:3: lv_synpred_4_0= '=>'
                            {
                            lv_synpred_4_0=(Token)match(input,62,FOLLOW_62_in_ruleMultString5323); 

                                    newLeafNode(lv_synpred_4_0, grammarAccess.getMultStringAccess().getSynpredEqualsSignGreaterThanSignKeyword_1_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultStringRule());
                            	        }
                                   		setWithLastConsumed(current, "synpred", lv_synpred_4_0, "=>");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleMultString5349); 

                        	newLeafNode(otherlv_5, grammarAccess.getMultStringAccess().getLeftParenthesisKeyword_1_2_1());
                        
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3094:1: ( (lv_cs_6_0= ruleComboString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3095:1: (lv_cs_6_0= ruleComboString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3095:1: (lv_cs_6_0= ruleComboString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3096:3: lv_cs_6_0= ruleComboString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMultStringAccess().getCsComboStringParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComboString_in_ruleMultString5370);
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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3112:2: (otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==63) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3112:4: otherlv_7= '|' ( (lv_cs_8_0= ruleComboString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,63,FOLLOW_63_in_ruleMultString5383); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getMultStringAccess().getVerticalLineKeyword_1_2_3_0());
                    	        
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3116:1: ( (lv_cs_8_0= ruleComboString ) )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3117:1: (lv_cs_8_0= ruleComboString )
                    	    {
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3117:1: (lv_cs_8_0= ruleComboString )
                    	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3118:3: lv_cs_8_0= ruleComboString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMultStringAccess().getCsComboStringParserRuleCall_1_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComboString_in_ruleMultString5404);
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

                    otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleMultString5418); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3146:1: entryRuleComboString returns [EObject current=null] : iv_ruleComboString= ruleComboString EOF ;
    public final EObject entryRuleComboString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboString = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3147:2: (iv_ruleComboString= ruleComboString EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3148:2: iv_ruleComboString= ruleComboString EOF
            {
             newCompositeNode(grammarAccess.getComboStringRule()); 
            pushFollow(FOLLOW_ruleComboString_in_entryRuleComboString5456);
            iv_ruleComboString=ruleComboString();

            state._fsp--;

             current =iv_ruleComboString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboString5466); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3155:1: ruleComboString returns [EObject current=null] : ( () ( (lv_inner_1_0= ruleMultString ) )* ) ;
    public final EObject ruleComboString() throws RecognitionException {
        EObject current = null;

        EObject lv_inner_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3158:28: ( ( () ( (lv_inner_1_0= ruleMultString ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3159:1: ( () ( (lv_inner_1_0= ruleMultString ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3159:1: ( () ( (lv_inner_1_0= ruleMultString ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3159:2: () ( (lv_inner_1_0= ruleMultString ) )*
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3159:2: ()
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3160:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComboStringAccess().getComboStringAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3165:2: ( (lv_inner_1_0= ruleMultString ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||LA40_0==37||LA40_0==62) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3166:1: (lv_inner_1_0= ruleMultString )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3166:1: (lv_inner_1_0= ruleMultString )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3167:3: lv_inner_1_0= ruleMultString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComboStringAccess().getInnerMultStringParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultString_in_ruleComboString5521);
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3191:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3192:2: (iv_rulePrimary= rulePrimary EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3193:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary5558);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary5568); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3200:1: rulePrimary returns [EObject current=null] : (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3203:28: ( (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3204:1: (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3204:1: (otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3204:3: otherlv_0= 'PRIMARY' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= rulePrimaryInner ) )*
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_rulePrimary5605); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getPRIMARYKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3208:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3209:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3209:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3210:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary5622); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3226:2: ( (lv_inner_2_0= rulePrimaryInner ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=65 && LA41_0<=79)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3227:1: (lv_inner_2_0= rulePrimaryInner )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3227:1: (lv_inner_2_0= rulePrimaryInner )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3228:3: lv_inner_2_0= rulePrimaryInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrimaryAccess().getInnerPrimaryInnerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryInner_in_rulePrimary5648);
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3252:1: entryRulePrimaryInner returns [EObject current=null] : iv_rulePrimaryInner= rulePrimaryInner EOF ;
    public final EObject entryRulePrimaryInner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryInner = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3253:2: (iv_rulePrimaryInner= rulePrimaryInner EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3254:2: iv_rulePrimaryInner= rulePrimaryInner EOF
            {
             newCompositeNode(grammarAccess.getPrimaryInnerRule()); 
            pushFollow(FOLLOW_rulePrimaryInner_in_entryRulePrimaryInner5685);
            iv_rulePrimaryInner=rulePrimaryInner();

            state._fsp--;

             current =iv_rulePrimaryInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryInner5695); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3261:1: rulePrimaryInner returns [EObject current=null] : ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3264:28: ( ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3265:1: ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3265:1: ( ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) ) | ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) ) )
            int alt42=15;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt42=1;
                }
                break;
            case 66:
                {
                alt42=2;
                }
                break;
            case 67:
                {
                alt42=3;
                }
                break;
            case 68:
                {
                alt42=4;
                }
                break;
            case 69:
                {
                alt42=5;
                }
                break;
            case 70:
                {
                alt42=6;
                }
                break;
            case 71:
                {
                alt42=7;
                }
                break;
            case 72:
                {
                alt42=8;
                }
                break;
            case 73:
                {
                alt42=9;
                }
                break;
            case 74:
                {
                alt42=10;
                }
                break;
            case 75:
                {
                alt42=11;
                }
                break;
            case 76:
                {
                alt42=12;
                }
                break;
            case 77:
                {
                alt42=13;
                }
                break;
            case 78:
                {
                alt42=14;
                }
                break;
            case 79:
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3265:2: ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3265:2: ( ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3265:3: ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) ) ( (lv_construct_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3265:3: ( (lv_primarytyp_0_0= 'CONSTRUCTOR' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3266:1: (lv_primarytyp_0_0= 'CONSTRUCTOR' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3266:1: (lv_primarytyp_0_0= 'CONSTRUCTOR' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3267:3: lv_primarytyp_0_0= 'CONSTRUCTOR'
                    {
                    lv_primarytyp_0_0=(Token)match(input,65,FOLLOW_65_in_rulePrimaryInner5739); 

                            newLeafNode(lv_primarytyp_0_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypCONSTRUCTORKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_0_0, "CONSTRUCTOR");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3280:2: ( (lv_construct_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3281:1: (lv_construct_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3281:1: (lv_construct_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3282:3: lv_construct_1_0= RULE_ID
                    {
                    lv_construct_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5769); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3299:6: ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3299:6: ( ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3299:7: ( (lv_primarytyp_2_0= 'BLOCK' ) ) ( (lv_construct_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3299:7: ( (lv_primarytyp_2_0= 'BLOCK' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3300:1: (lv_primarytyp_2_0= 'BLOCK' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3300:1: (lv_primarytyp_2_0= 'BLOCK' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3301:3: lv_primarytyp_2_0= 'BLOCK'
                    {
                    lv_primarytyp_2_0=(Token)match(input,66,FOLLOW_66_in_rulePrimaryInner5800); 

                            newLeafNode(lv_primarytyp_2_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypBLOCKKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_2_0, "BLOCK");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3314:2: ( (lv_construct_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3315:1: (lv_construct_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3315:1: (lv_construct_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3316:3: lv_construct_3_0= RULE_ID
                    {
                    lv_construct_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5830); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3333:6: ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3333:6: ( ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3333:7: ( (lv_primarytyp_4_0= 'SWITCH' ) ) ( (lv_construct_5_0= RULE_ID ) ) ( (lv_construct2_6_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3333:7: ( (lv_primarytyp_4_0= 'SWITCH' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3334:1: (lv_primarytyp_4_0= 'SWITCH' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3334:1: (lv_primarytyp_4_0= 'SWITCH' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3335:3: lv_primarytyp_4_0= 'SWITCH'
                    {
                    lv_primarytyp_4_0=(Token)match(input,67,FOLLOW_67_in_rulePrimaryInner5861); 

                            newLeafNode(lv_primarytyp_4_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypSWITCHKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_4_0, "SWITCH");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3348:2: ( (lv_construct_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3349:1: (lv_construct_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3349:1: (lv_construct_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3350:3: lv_construct_5_0= RULE_ID
                    {
                    lv_construct_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5891); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3366:2: ( (lv_construct2_6_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3367:1: (lv_construct2_6_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3367:1: (lv_construct2_6_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3368:3: lv_construct2_6_0= RULE_ID
                    {
                    lv_construct2_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5913); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3385:6: ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3385:6: ( ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3385:7: ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) ) ( (lv_construct_8_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3385:7: ( (lv_primarytyp_7_0= 'SYNCHRONIZED' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3386:1: (lv_primarytyp_7_0= 'SYNCHRONIZED' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3386:1: (lv_primarytyp_7_0= 'SYNCHRONIZED' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3387:3: lv_primarytyp_7_0= 'SYNCHRONIZED'
                    {
                    lv_primarytyp_7_0=(Token)match(input,68,FOLLOW_68_in_rulePrimaryInner5944); 

                            newLeafNode(lv_primarytyp_7_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypSYNCHRONIZEDKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_7_0, "SYNCHRONIZED");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3400:2: ( (lv_construct_8_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3401:1: (lv_construct_8_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3401:1: (lv_construct_8_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3402:3: lv_construct_8_0= RULE_ID
                    {
                    lv_construct_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner5974); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3419:6: ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3419:6: ( ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3419:7: ( (lv_primarytyp_9_0= 'FEATURECALL' ) ) ( (lv_construct_10_0= RULE_ID ) ) ( (lv_feature_11_0= ruleMultString ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3419:7: ( (lv_primarytyp_9_0= 'FEATURECALL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3420:1: (lv_primarytyp_9_0= 'FEATURECALL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3420:1: (lv_primarytyp_9_0= 'FEATURECALL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3421:3: lv_primarytyp_9_0= 'FEATURECALL'
                    {
                    lv_primarytyp_9_0=(Token)match(input,69,FOLLOW_69_in_rulePrimaryInner6005); 

                            newLeafNode(lv_primarytyp_9_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypFEATURECALLKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_9_0, "FEATURECALL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3434:2: ( (lv_construct_10_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3435:1: (lv_construct_10_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3435:1: (lv_construct_10_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3436:3: lv_construct_10_0= RULE_ID
                    {
                    lv_construct_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6035); 

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

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3452:2: ( (lv_feature_11_0= ruleMultString ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3453:1: (lv_feature_11_0= ruleMultString )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3453:1: (lv_feature_11_0= ruleMultString )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3454:3: lv_feature_11_0= ruleMultString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryInnerAccess().getFeatureMultStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultString_in_rulePrimaryInner6061);
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3471:6: ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3471:6: ( ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3471:7: ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) ) ( (lv_construct_13_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3471:7: ( (lv_primarytyp_12_0= 'IFEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3472:1: (lv_primarytyp_12_0= 'IFEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3472:1: (lv_primarytyp_12_0= 'IFEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3473:3: lv_primarytyp_12_0= 'IFEXPRESSION'
                    {
                    lv_primarytyp_12_0=(Token)match(input,70,FOLLOW_70_in_rulePrimaryInner6087); 

                            newLeafNode(lv_primarytyp_12_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypIFEXPRESSIONKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_12_0, "IFEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3486:2: ( (lv_construct_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3487:1: (lv_construct_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3487:1: (lv_construct_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3488:3: lv_construct_13_0= RULE_ID
                    {
                    lv_construct_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6117); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3505:6: ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3505:6: ( ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3505:7: ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) ) ( (lv_construct_15_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3505:7: ( (lv_primarytyp_14_0= 'FOREXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3506:1: (lv_primarytyp_14_0= 'FOREXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3506:1: (lv_primarytyp_14_0= 'FOREXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3507:3: lv_primarytyp_14_0= 'FOREXPRESSION'
                    {
                    lv_primarytyp_14_0=(Token)match(input,71,FOLLOW_71_in_rulePrimaryInner6148); 

                            newLeafNode(lv_primarytyp_14_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypFOREXPRESSIONKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_14_0, "FOREXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3520:2: ( (lv_construct_15_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3521:1: (lv_construct_15_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3521:1: (lv_construct_15_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3522:3: lv_construct_15_0= RULE_ID
                    {
                    lv_construct_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6178); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3539:6: ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3539:6: ( ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3539:7: ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) ) ( (lv_construct_17_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3539:7: ( (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3540:1: (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3540:1: (lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3541:3: lv_primarytyp_16_0= 'BASICFORLOOPEXPRESSION'
                    {
                    lv_primarytyp_16_0=(Token)match(input,72,FOLLOW_72_in_rulePrimaryInner6209); 

                            newLeafNode(lv_primarytyp_16_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypBASICFORLOOPEXPRESSIONKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_16_0, "BASICFORLOOPEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3554:2: ( (lv_construct_17_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3555:1: (lv_construct_17_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3555:1: (lv_construct_17_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3556:3: lv_construct_17_0= RULE_ID
                    {
                    lv_construct_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6239); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3573:6: ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3573:6: ( ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3573:7: ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) ) ( (lv_construct_19_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3573:7: ( (lv_primarytyp_18_0= 'WHILEEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3574:1: (lv_primarytyp_18_0= 'WHILEEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3574:1: (lv_primarytyp_18_0= 'WHILEEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3575:3: lv_primarytyp_18_0= 'WHILEEXPRESSION'
                    {
                    lv_primarytyp_18_0=(Token)match(input,73,FOLLOW_73_in_rulePrimaryInner6270); 

                            newLeafNode(lv_primarytyp_18_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypWHILEEXPRESSIONKeyword_8_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_18_0, "WHILEEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3588:2: ( (lv_construct_19_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3589:1: (lv_construct_19_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3589:1: (lv_construct_19_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3590:3: lv_construct_19_0= RULE_ID
                    {
                    lv_construct_19_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6300); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3607:6: ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3607:6: ( ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3607:7: ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) ) ( (lv_construct_21_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3607:7: ( (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3608:1: (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3608:1: (lv_primarytyp_20_0= 'DOWHILEEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3609:3: lv_primarytyp_20_0= 'DOWHILEEXPRESSION'
                    {
                    lv_primarytyp_20_0=(Token)match(input,74,FOLLOW_74_in_rulePrimaryInner6331); 

                            newLeafNode(lv_primarytyp_20_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypDOWHILEEXPRESSIONKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_20_0, "DOWHILEEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3622:2: ( (lv_construct_21_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3623:1: (lv_construct_21_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3623:1: (lv_construct_21_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3624:3: lv_construct_21_0= RULE_ID
                    {
                    lv_construct_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6361); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3641:6: ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3641:6: ( ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3641:7: ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) ) ( (lv_construct_23_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3641:7: ( (lv_primarytyp_22_0= 'THROWEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3642:1: (lv_primarytyp_22_0= 'THROWEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3642:1: (lv_primarytyp_22_0= 'THROWEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3643:3: lv_primarytyp_22_0= 'THROWEXPRESSION'
                    {
                    lv_primarytyp_22_0=(Token)match(input,75,FOLLOW_75_in_rulePrimaryInner6392); 

                            newLeafNode(lv_primarytyp_22_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypTHROWEXPRESSIONKeyword_10_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_22_0, "THROWEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3656:2: ( (lv_construct_23_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3657:1: (lv_construct_23_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3657:1: (lv_construct_23_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3658:3: lv_construct_23_0= RULE_ID
                    {
                    lv_construct_23_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6422); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3675:6: ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3675:6: ( ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3675:7: ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) ) ( (lv_construct_25_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3675:7: ( (lv_primarytyp_24_0= 'RETURNEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3676:1: (lv_primarytyp_24_0= 'RETURNEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3676:1: (lv_primarytyp_24_0= 'RETURNEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3677:3: lv_primarytyp_24_0= 'RETURNEXPRESSION'
                    {
                    lv_primarytyp_24_0=(Token)match(input,76,FOLLOW_76_in_rulePrimaryInner6453); 

                            newLeafNode(lv_primarytyp_24_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypRETURNEXPRESSIONKeyword_11_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_24_0, "RETURNEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3690:2: ( (lv_construct_25_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3691:1: (lv_construct_25_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3691:1: (lv_construct_25_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3692:3: lv_construct_25_0= RULE_ID
                    {
                    lv_construct_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6483); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3709:6: ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3709:6: ( ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3709:7: ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) ) ( (lv_construct_27_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3709:7: ( (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3710:1: (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3710:1: (lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3711:3: lv_primarytyp_26_0= 'TRYCATCHFINALYEXPRESSION'
                    {
                    lv_primarytyp_26_0=(Token)match(input,77,FOLLOW_77_in_rulePrimaryInner6514); 

                            newLeafNode(lv_primarytyp_26_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypTRYCATCHFINALYEXPRESSIONKeyword_12_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_26_0, "TRYCATCHFINALYEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3724:2: ( (lv_construct_27_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3725:1: (lv_construct_27_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3725:1: (lv_construct_27_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3726:3: lv_construct_27_0= RULE_ID
                    {
                    lv_construct_27_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6544); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3743:6: ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3743:6: ( ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3743:7: ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) ) ( (lv_construct_29_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3743:7: ( (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3744:1: (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3744:1: (lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3745:3: lv_primarytyp_28_0= 'PARENTHESIZEDEXPRESSION'
                    {
                    lv_primarytyp_28_0=(Token)match(input,78,FOLLOW_78_in_rulePrimaryInner6575); 

                            newLeafNode(lv_primarytyp_28_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypPARENTHESIZEDEXPRESSIONKeyword_13_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_28_0, "PARENTHESIZEDEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3758:2: ( (lv_construct_29_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3759:1: (lv_construct_29_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3759:1: (lv_construct_29_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3760:3: lv_construct_29_0= RULE_ID
                    {
                    lv_construct_29_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6605); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3777:6: ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3777:6: ( ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3777:7: ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) ) ( (lv_construct_31_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3777:7: ( (lv_primarytyp_30_0= 'LITERALEXPRESSION' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3778:1: (lv_primarytyp_30_0= 'LITERALEXPRESSION' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3778:1: (lv_primarytyp_30_0= 'LITERALEXPRESSION' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3779:3: lv_primarytyp_30_0= 'LITERALEXPRESSION'
                    {
                    lv_primarytyp_30_0=(Token)match(input,79,FOLLOW_79_in_rulePrimaryInner6636); 

                            newLeafNode(lv_primarytyp_30_0, grammarAccess.getPrimaryInnerAccess().getPrimarytypLITERALEXPRESSIONKeyword_14_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_30_0, "LITERALEXPRESSION");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3792:2: ( (lv_construct_31_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3793:1: (lv_construct_31_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3793:1: (lv_construct_31_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3794:3: lv_construct_31_0= RULE_ID
                    {
                    lv_construct_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryInner6666); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3818:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3819:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3820:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6708);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6718); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3827:1: ruleLiteral returns [EObject current=null] : (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inner_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3830:28: ( (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3831:1: (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3831:1: (otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )* )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3831:3: otherlv_0= 'LITERAL' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inner_2_0= ruleLiteralInner ) )*
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleLiteral6755); 

                	newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getLITERALKeyword_0());
                
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3835:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3836:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3836:1: (lv_name_1_0= RULE_ID )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3837:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral6772); 

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

            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3853:2: ( (lv_inner_2_0= ruleLiteralInner ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=81 && LA43_0<=87)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3854:1: (lv_inner_2_0= ruleLiteralInner )
            	    {
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3854:1: (lv_inner_2_0= ruleLiteralInner )
            	    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3855:3: lv_inner_2_0= ruleLiteralInner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLiteralAccess().getInnerLiteralInnerParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteralInner_in_ruleLiteral6798);
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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3879:1: entryRuleLiteralInner returns [EObject current=null] : iv_ruleLiteralInner= ruleLiteralInner EOF ;
    public final EObject entryRuleLiteralInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInner = null;


        try {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3880:2: (iv_ruleLiteralInner= ruleLiteralInner EOF )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3881:2: iv_ruleLiteralInner= ruleLiteralInner EOF
            {
             newCompositeNode(grammarAccess.getLiteralInnerRule()); 
            pushFollow(FOLLOW_ruleLiteralInner_in_entryRuleLiteralInner6835);
            iv_ruleLiteralInner=ruleLiteralInner();

            state._fsp--;

             current =iv_ruleLiteralInner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralInner6845); 

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
    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3888:1: ruleLiteralInner returns [EObject current=null] : ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) ) ;
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
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3891:28: ( ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) ) )
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3892:1: ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) )
            {
            // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3892:1: ( ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) ) | ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) ) )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt44=1;
                }
                break;
            case 82:
                {
                alt44=2;
                }
                break;
            case 83:
                {
                alt44=3;
                }
                break;
            case 84:
                {
                alt44=4;
                }
                break;
            case 85:
                {
                alt44=5;
                }
                break;
            case 86:
                {
                alt44=6;
                }
                break;
            case 87:
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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3892:2: ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3892:2: ( ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3892:3: ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) ) ( (lv_construct_1_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3892:3: ( (lv_primarytyp_0_0= 'COLLECTIONLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3893:1: (lv_primarytyp_0_0= 'COLLECTIONLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3893:1: (lv_primarytyp_0_0= 'COLLECTIONLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3894:3: lv_primarytyp_0_0= 'COLLECTIONLITERAL'
                    {
                    lv_primarytyp_0_0=(Token)match(input,81,FOLLOW_81_in_ruleLiteralInner6889); 

                            newLeafNode(lv_primarytyp_0_0, grammarAccess.getLiteralInnerAccess().getPrimarytypCOLLECTIONLITERALKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_0_0, "COLLECTIONLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3907:2: ( (lv_construct_1_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3908:1: (lv_construct_1_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3908:1: (lv_construct_1_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3909:3: lv_construct_1_0= RULE_ID
                    {
                    lv_construct_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner6919); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3926:6: ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3926:6: ( ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3926:7: ( (lv_primarytyp_2_0= 'CLOSURE' ) ) ( (lv_construct_3_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3926:7: ( (lv_primarytyp_2_0= 'CLOSURE' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3927:1: (lv_primarytyp_2_0= 'CLOSURE' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3927:1: (lv_primarytyp_2_0= 'CLOSURE' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3928:3: lv_primarytyp_2_0= 'CLOSURE'
                    {
                    lv_primarytyp_2_0=(Token)match(input,82,FOLLOW_82_in_ruleLiteralInner6950); 

                            newLeafNode(lv_primarytyp_2_0, grammarAccess.getLiteralInnerAccess().getPrimarytypCLOSUREKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_2_0, "CLOSURE");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3941:2: ( (lv_construct_3_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3942:1: (lv_construct_3_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3942:1: (lv_construct_3_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3943:3: lv_construct_3_0= RULE_ID
                    {
                    lv_construct_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner6980); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3960:6: ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3960:6: ( ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3960:7: ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) ) ( (lv_construct_5_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3960:7: ( (lv_primarytyp_4_0= 'BOOLEANLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3961:1: (lv_primarytyp_4_0= 'BOOLEANLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3961:1: (lv_primarytyp_4_0= 'BOOLEANLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3962:3: lv_primarytyp_4_0= 'BOOLEANLITERAL'
                    {
                    lv_primarytyp_4_0=(Token)match(input,83,FOLLOW_83_in_ruleLiteralInner7011); 

                            newLeafNode(lv_primarytyp_4_0, grammarAccess.getLiteralInnerAccess().getPrimarytypBOOLEANLITERALKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_4_0, "BOOLEANLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3975:2: ( (lv_construct_5_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3976:1: (lv_construct_5_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3976:1: (lv_construct_5_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3977:3: lv_construct_5_0= RULE_ID
                    {
                    lv_construct_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7041); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3994:6: ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3994:6: ( ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3994:7: ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) ) ( (lv_construct_7_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3994:7: ( (lv_primarytyp_6_0= 'NUMBERLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3995:1: (lv_primarytyp_6_0= 'NUMBERLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3995:1: (lv_primarytyp_6_0= 'NUMBERLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:3996:3: lv_primarytyp_6_0= 'NUMBERLITERAL'
                    {
                    lv_primarytyp_6_0=(Token)match(input,84,FOLLOW_84_in_ruleLiteralInner7072); 

                            newLeafNode(lv_primarytyp_6_0, grammarAccess.getLiteralInnerAccess().getPrimarytypNUMBERLITERALKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_6_0, "NUMBERLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4009:2: ( (lv_construct_7_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4010:1: (lv_construct_7_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4010:1: (lv_construct_7_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4011:3: lv_construct_7_0= RULE_ID
                    {
                    lv_construct_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7102); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4028:6: ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4028:6: ( ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4028:7: ( (lv_primarytyp_8_0= 'NULLLITERAL' ) ) ( (lv_construct_9_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4028:7: ( (lv_primarytyp_8_0= 'NULLLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4029:1: (lv_primarytyp_8_0= 'NULLLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4029:1: (lv_primarytyp_8_0= 'NULLLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4030:3: lv_primarytyp_8_0= 'NULLLITERAL'
                    {
                    lv_primarytyp_8_0=(Token)match(input,85,FOLLOW_85_in_ruleLiteralInner7133); 

                            newLeafNode(lv_primarytyp_8_0, grammarAccess.getLiteralInnerAccess().getPrimarytypNULLLITERALKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_8_0, "NULLLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4043:2: ( (lv_construct_9_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4044:1: (lv_construct_9_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4044:1: (lv_construct_9_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4045:3: lv_construct_9_0= RULE_ID
                    {
                    lv_construct_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7163); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4062:6: ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4062:6: ( ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4062:7: ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) ) ( (lv_construct_11_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4062:7: ( (lv_primarytyp_10_0= 'STRINGLITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4063:1: (lv_primarytyp_10_0= 'STRINGLITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4063:1: (lv_primarytyp_10_0= 'STRINGLITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4064:3: lv_primarytyp_10_0= 'STRINGLITERAL'
                    {
                    lv_primarytyp_10_0=(Token)match(input,86,FOLLOW_86_in_ruleLiteralInner7194); 

                            newLeafNode(lv_primarytyp_10_0, grammarAccess.getLiteralInnerAccess().getPrimarytypSTRINGLITERALKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_10_0, "STRINGLITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4077:2: ( (lv_construct_11_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4078:1: (lv_construct_11_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4078:1: (lv_construct_11_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4079:3: lv_construct_11_0= RULE_ID
                    {
                    lv_construct_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7224); 

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
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4096:6: ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4096:6: ( ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4096:7: ( (lv_primarytyp_12_0= 'TYPELITERAL' ) ) ( (lv_construct_13_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4096:7: ( (lv_primarytyp_12_0= 'TYPELITERAL' ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4097:1: (lv_primarytyp_12_0= 'TYPELITERAL' )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4097:1: (lv_primarytyp_12_0= 'TYPELITERAL' )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4098:3: lv_primarytyp_12_0= 'TYPELITERAL'
                    {
                    lv_primarytyp_12_0=(Token)match(input,87,FOLLOW_87_in_ruleLiteralInner7255); 

                            newLeafNode(lv_primarytyp_12_0, grammarAccess.getLiteralInnerAccess().getPrimarytypTYPELITERALKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralInnerRule());
                    	        }
                           		setWithLastConsumed(current, "primarytyp", lv_primarytyp_12_0, "TYPELITERAL");
                    	    

                    }


                    }

                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4111:2: ( (lv_construct_13_0= RULE_ID ) )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4112:1: (lv_construct_13_0= RULE_ID )
                    {
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4112:1: (lv_construct_13_0= RULE_ID )
                    // ../com.euclideanspace.xgener/src-gen/com/euclideanspace/xgener/parser/antlr/internal/InternalGen.g:4113:3: lv_construct_13_0= RULE_ID
                    {
                    lv_construct_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteralInner7285); 

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
    public static final BitSet FOLLOW_ruleProject_in_ruleModel131 = new BitSet(new long[]{0x0000000010204802L,0x0000000000010001L});
    public static final BitSet FOLLOW_ruleClassType_in_ruleModel158 = new BitSet(new long[]{0x0000000010204802L,0x0000000000010001L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleModel185 = new BitSet(new long[]{0x0000000010204802L,0x0000000000010001L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleModel212 = new BitSet(new long[]{0x0000000010204802L,0x0000000000010001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleModel239 = new BitSet(new long[]{0x0000000010204802L,0x0000000000010001L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel266 = new BitSet(new long[]{0x0000000010204802L,0x0000000000010001L});
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
    public static final BitSet FOLLOW_16_in_ruleClassType607 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleClassType628 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_17_in_ruleClassType648 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleClassType669 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_18_in_ruleClassType689 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleClassType709 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_20_in_ruleClassType738 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleProcedure840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure857 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_16_in_ruleProcedure876 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleProcedure897 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_17_in_ruleProcedure917 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleProcedure938 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_22_in_ruleProcedure958 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_23_in_ruleProcedure978 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_24_in_ruleProcedure1007 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_25_in_ruleProcedure1036 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_26_in_ruleProcedure1065 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_27_in_ruleProcedure1094 = new BitSet(new long[]{0x0000000000430002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleExpression1196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1213 = new BitSet(new long[]{0x0000079EA00B0002L});
    public static final BitSet FOLLOW_rulePrecedence_in_ruleExpression1239 = new BitSet(new long[]{0x0000079EA00B0002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence1276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrecedence1330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1360 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_rulePrecedence1378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePrecedence1428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrecedence1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrecedence1511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1541 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1585 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrecedence1652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1705 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1741 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrecedence1793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1846 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1882 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence1908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1926 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence1943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrecedence1993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2046 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence2063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2082 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2126 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence2143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrecedence2193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2246 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence2263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2282 = new BitSet(new long[]{0x1FF0000000000000L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_rulePrecedence2308 = new BitSet(new long[]{0x1FF0000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrecedence2335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2365 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePrecedence2382 = new BitSet(new long[]{0x000FF80000000000L});
    public static final BitSet FOLLOW_ruleSubPrecedence_in_rulePrecedence2403 = new BitSet(new long[]{0x000FF84000000000L});
    public static final BitSet FOLLOW_38_in_rulePrecedence2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePrecedence2442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrecedence2525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrecedence2608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePrecedence2691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrecedence2774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2827 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence2844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2863 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrecedence2889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2907 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rulePrecedence2924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrecedence2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPrecedence_in_entryRuleSubPrecedence2985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPrecedence2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSubPrecedence3039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSubPrecedence3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSubPrecedence3100 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleSubPrecedence3134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3152 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubPrecedence3169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSubPrecedence3219 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleSubPrecedence3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSubPrecedence3279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3310 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubPrecedence3327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3346 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleSubPrecedence3372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3390 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubPrecedence3407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleSubPrecedence3457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3488 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubPrecedence3505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3524 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleSubPrecedence3550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3568 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubPrecedence3585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSubPrecedence3635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSubPrecedence3718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleSubPrecedence3801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSubPrecedence3884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubPrecedence3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence3978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerPrecedence3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInnerPrecedence4032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInnerPrecedence4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInnerPrecedence4093 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence4127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4145 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInnerPrecedence4162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInnerPrecedence4212 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInnerPrecedence4272 = new BitSet(new long[]{0x4000002020000030L});
    public static final BitSet FOLLOW_29_in_ruleInnerPrecedence4304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4334 = new BitSet(new long[]{0x4000002040000030L});
    public static final BitSet FOLLOW_30_in_ruleInnerPrecedence4352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4369 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence4399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4417 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInnerPrecedence4434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInnerPrecedence4484 = new BitSet(new long[]{0x4000002020000030L});
    public static final BitSet FOLLOW_29_in_ruleInnerPrecedence4516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4546 = new BitSet(new long[]{0x4000002040000030L});
    public static final BitSet FOLLOW_30_in_ruleInnerPrecedence4564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4581 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleInnerPrecedence4611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4629 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInnerPrecedence4646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleInnerPrecedence4696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleInnerPrecedence4779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleInnerPrecedence4862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleInnerPrecedence4945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInnerPrecedence4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5091 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleQualifiedName5109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5126 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString5169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultString5232 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMultString5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultString5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleMultString5323 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMultString5349 = new BitSet(new long[]{0xC000006000000030L});
    public static final BitSet FOLLOW_ruleComboString_in_ruleMultString5370 = new BitSet(new long[]{0x8000004000000000L});
    public static final BitSet FOLLOW_63_in_ruleMultString5383 = new BitSet(new long[]{0xC000006000000030L});
    public static final BitSet FOLLOW_ruleComboString_in_ruleMultString5404 = new BitSet(new long[]{0x8000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMultString5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboString_in_entryRuleComboString5456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboString5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_ruleComboString5521 = new BitSet(new long[]{0x4000002000000032L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary5558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimary5605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary5622 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_rulePrimaryInner_in_rulePrimary5648 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FFFEL});
    public static final BitSet FOLLOW_rulePrimaryInner_in_entryRulePrimaryInner5685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryInner5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimaryInner5739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePrimaryInner5800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePrimaryInner5861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePrimaryInner5944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePrimaryInner6005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6035 = new BitSet(new long[]{0x4000002000000030L});
    public static final BitSet FOLLOW_ruleMultString_in_rulePrimaryInner6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePrimaryInner6087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePrimaryInner6148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePrimaryInner6209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rulePrimaryInner6270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePrimaryInner6331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePrimaryInner6392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePrimaryInner6453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePrimaryInner6514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePrimaryInner6575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePrimaryInner6636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryInner6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleLiteral6755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FE0000L});
    public static final BitSet FOLLOW_ruleLiteralInner_in_ruleLiteral6798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000FE0000L});
    public static final BitSet FOLLOW_ruleLiteralInner_in_entryRuleLiteralInner6835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInner6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleLiteralInner6889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleLiteralInner6950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner6980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleLiteralInner7011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleLiteralInner7072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleLiteralInner7133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleLiteralInner7194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleLiteralInner7255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteralInner7285 = new BitSet(new long[]{0x0000000000000002L});

}