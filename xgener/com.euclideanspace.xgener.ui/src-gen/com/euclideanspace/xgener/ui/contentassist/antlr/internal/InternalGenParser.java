package com.euclideanspace.xgener.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.euclideanspace.xgener.services.GenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BRACES'", "'INDENT'", "'COLONSEPERATED'", "'SPACESEPERATED'", "'INHEADER'", "'INFERRED'", "'UNTYPED'", "'INT'", "'STRING'", "'BOOL'", "'FLOAT'", "'CLASS'", "'PREFIX'", "'SUFFIX'", "'BLOCKING'", "'PROCEDURE'", "'TYPES'", "'STATEMENT'", "'REPEAT'", "'UNTIL'", "'WHILE'", "'DO'", "'FOR'", "'VAR'", "'='", "'VAL'", "'EXPRESSION'", "'.'", "'['", "']'", "'NOCLASS'", "'CALLER'", "'INFIX'", "'OUTER'", "'INFIXLEFT'", "'LITERAL'", "'BRACKET'", "'PARENTHESIS'", "'ANGLE'", "'INNERPREFIX'", "'INNERSUFFIX'", "'INNERINFIX'", "'INNERINFIXLEFT'", "'INNERBRACKET'", "'INNERBRACES'", "'INNERPARENTHESIS'", "'INNERANGLE'"
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
    public String getGrammarFileName() { return "../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g"; }


     
     	private GenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GenGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:61:1: ( ruleModel EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:69:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:73:2: ( ( ( rule__Model__Alternatives )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:74:1: ( ( rule__Model__Alternatives )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:74:1: ( ( rule__Model__Alternatives )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:75:1: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:76:1: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||LA1_0==26||LA1_0==28||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:76:2: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleClassType"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:88:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:89:1: ( ruleClassType EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:90:1: ruleClassType EOF
            {
             before(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType122);
            ruleClassType();

            state._fsp--;

             after(grammarAccess.getClassTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:97:1: ruleClassType : ( ( rule__ClassType__Group__0 ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:101:2: ( ( ( rule__ClassType__Group__0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:102:1: ( ( rule__ClassType__Group__0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:102:1: ( ( rule__ClassType__Group__0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:103:1: ( rule__ClassType__Group__0 )
            {
             before(grammarAccess.getClassTypeAccess().getGroup()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:104:1: ( rule__ClassType__Group__0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:104:2: rule__ClassType__Group__0
            {
            pushFollow(FOLLOW_rule__ClassType__Group__0_in_ruleClassType155);
            rule__ClassType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleProcedure"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:116:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:117:1: ( ruleProcedure EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:118:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure182);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:125:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:129:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:130:1: ( ( rule__Procedure__Group__0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:130:1: ( ( rule__Procedure__Group__0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:131:1: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:132:1: ( rule__Procedure__Group__0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:132:2: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0_in_ruleProcedure215);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleStatement"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:144:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:145:1: ( ruleStatement EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:146:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement242);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:153:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:157:2: ( ( ( rule__Statement__Group__0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:158:1: ( ( rule__Statement__Group__0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:158:1: ( ( rule__Statement__Group__0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:159:1: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:160:1: ( rule__Statement__Group__0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:160:2: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_rule__Statement__Group__0_in_ruleStatement275);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:172:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:173:1: ( ruleExpression EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:174:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression302);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:181:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:185:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:186:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:186:1: ( ( rule__Expression__Group__0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:187:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:188:1: ( rule__Expression__Group__0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:188:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression335);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePrecedence"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:200:1: entryRulePrecedence : rulePrecedence EOF ;
    public final void entryRulePrecedence() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:201:1: ( rulePrecedence EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:202:1: rulePrecedence EOF
            {
             before(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_rulePrecedence_in_entryRulePrecedence362);
            rulePrecedence();

            state._fsp--;

             after(grammarAccess.getPrecedenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecedence369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrecedence"


    // $ANTLR start "rulePrecedence"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:209:1: rulePrecedence : ( ( rule__Precedence__Alternatives ) ) ;
    public final void rulePrecedence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:213:2: ( ( ( rule__Precedence__Alternatives ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:214:1: ( ( rule__Precedence__Alternatives ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:214:1: ( ( rule__Precedence__Alternatives ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:215:1: ( rule__Precedence__Alternatives )
            {
             before(grammarAccess.getPrecedenceAccess().getAlternatives()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:216:1: ( rule__Precedence__Alternatives )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:216:2: rule__Precedence__Alternatives
            {
            pushFollow(FOLLOW_rule__Precedence__Alternatives_in_rulePrecedence395);
            rule__Precedence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecedence"


    // $ANTLR start "entryRuleInnerPrecedence"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:228:1: entryRuleInnerPrecedence : ruleInnerPrecedence EOF ;
    public final void entryRuleInnerPrecedence() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:229:1: ( ruleInnerPrecedence EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:230:1: ruleInnerPrecedence EOF
            {
             before(grammarAccess.getInnerPrecedenceRule()); 
            pushFollow(FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence422);
            ruleInnerPrecedence();

            state._fsp--;

             after(grammarAccess.getInnerPrecedenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerPrecedence429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInnerPrecedence"


    // $ANTLR start "ruleInnerPrecedence"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:237:1: ruleInnerPrecedence : ( ( rule__InnerPrecedence__Alternatives ) ) ;
    public final void ruleInnerPrecedence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:241:2: ( ( ( rule__InnerPrecedence__Alternatives ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:242:1: ( ( rule__InnerPrecedence__Alternatives ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:242:1: ( ( rule__InnerPrecedence__Alternatives ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:243:1: ( rule__InnerPrecedence__Alternatives )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getAlternatives()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:244:1: ( rule__InnerPrecedence__Alternatives )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:244:2: rule__InnerPrecedence__Alternatives
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Alternatives_in_ruleInnerPrecedence455);
            rule__InnerPrecedence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInnerPrecedence"


    // $ANTLR start "entryRuleMultID"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:256:1: entryRuleMultID : ruleMultID EOF ;
    public final void entryRuleMultID() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:257:1: ( ruleMultID EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:258:1: ruleMultID EOF
            {
             before(grammarAccess.getMultIDRule()); 
            pushFollow(FOLLOW_ruleMultID_in_entryRuleMultID482);
            ruleMultID();

            state._fsp--;

             after(grammarAccess.getMultIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultID489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultID"


    // $ANTLR start "ruleMultID"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:265:1: ruleMultID : ( ( rule__MultID__Group__0 ) ) ;
    public final void ruleMultID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:269:2: ( ( ( rule__MultID__Group__0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:270:1: ( ( rule__MultID__Group__0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:270:1: ( ( rule__MultID__Group__0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:271:1: ( rule__MultID__Group__0 )
            {
             before(grammarAccess.getMultIDAccess().getGroup()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:272:1: ( rule__MultID__Group__0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:272:2: rule__MultID__Group__0
            {
            pushFollow(FOLLOW_rule__MultID__Group__0_in_ruleMultID515);
            rule__MultID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultID"


    // $ANTLR start "entryRuleMultString"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:284:1: entryRuleMultString : ruleMultString EOF ;
    public final void entryRuleMultString() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:285:1: ( ruleMultString EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:286:1: ruleMultString EOF
            {
             before(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString542);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getMultStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultString"


    // $ANTLR start "ruleMultString"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:293:1: ruleMultString : ( ( rule__MultString__Group__0 ) ) ;
    public final void ruleMultString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:297:2: ( ( ( rule__MultString__Group__0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:298:1: ( ( rule__MultString__Group__0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:298:1: ( ( rule__MultString__Group__0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:299:1: ( rule__MultString__Group__0 )
            {
             before(grammarAccess.getMultStringAccess().getGroup()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:300:1: ( rule__MultString__Group__0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:300:2: rule__MultString__Group__0
            {
            pushFollow(FOLLOW_rule__MultString__Group__0_in_ruleMultString575);
            rule__MultString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultString"


    // $ANTLR start "rule__Model__Alternatives"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:312:1: rule__Model__Alternatives : ( ( ( rule__Model__ClasAssignment_0 ) ) | ( ( rule__Model__ProcAssignment_1 ) ) | ( ( rule__Model__StatemAssignment_2 ) ) | ( ( rule__Model__ExpAssignment_3 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:316:1: ( ( ( rule__Model__ClasAssignment_0 ) ) | ( ( rule__Model__ProcAssignment_1 ) ) | ( ( rule__Model__StatemAssignment_2 ) ) | ( ( rule__Model__ExpAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:317:1: ( ( rule__Model__ClasAssignment_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:317:1: ( ( rule__Model__ClasAssignment_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:318:1: ( rule__Model__ClasAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getClasAssignment_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:319:1: ( rule__Model__ClasAssignment_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:319:2: rule__Model__ClasAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__ClasAssignment_0_in_rule__Model__Alternatives611);
                    rule__Model__ClasAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getClasAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:323:6: ( ( rule__Model__ProcAssignment_1 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:323:6: ( ( rule__Model__ProcAssignment_1 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:324:1: ( rule__Model__ProcAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getProcAssignment_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:325:1: ( rule__Model__ProcAssignment_1 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:325:2: rule__Model__ProcAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__ProcAssignment_1_in_rule__Model__Alternatives629);
                    rule__Model__ProcAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProcAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:329:6: ( ( rule__Model__StatemAssignment_2 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:329:6: ( ( rule__Model__StatemAssignment_2 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:330:1: ( rule__Model__StatemAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getStatemAssignment_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:331:1: ( rule__Model__StatemAssignment_2 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:331:2: rule__Model__StatemAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__StatemAssignment_2_in_rule__Model__Alternatives647);
                    rule__Model__StatemAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getStatemAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:335:6: ( ( rule__Model__ExpAssignment_3 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:335:6: ( ( rule__Model__ExpAssignment_3 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:336:1: ( rule__Model__ExpAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getExpAssignment_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:337:1: ( rule__Model__ExpAssignment_3 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:337:2: rule__Model__ExpAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__ExpAssignment_3_in_rule__Model__Alternatives665);
                    rule__Model__ExpAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getExpAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__ClassType__Alternatives_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:346:1: rule__ClassType__Alternatives_2 : ( ( ( rule__ClassType__NoclassAssignment_2_0 ) ) | ( ( rule__ClassType__Group_2_1__0 ) ) | ( ( rule__ClassType__Group_2_2__0 ) ) | ( ( rule__ClassType__Group_2_3__0 ) ) );
    public final void rule__ClassType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:350:1: ( ( ( rule__ClassType__NoclassAssignment_2_0 ) ) | ( ( rule__ClassType__Group_2_1__0 ) ) | ( ( rule__ClassType__Group_2_2__0 ) ) | ( ( rule__ClassType__Group_2_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:351:1: ( ( rule__ClassType__NoclassAssignment_2_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:351:1: ( ( rule__ClassType__NoclassAssignment_2_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:352:1: ( rule__ClassType__NoclassAssignment_2_0 )
                    {
                     before(grammarAccess.getClassTypeAccess().getNoclassAssignment_2_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:353:1: ( rule__ClassType__NoclassAssignment_2_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:353:2: rule__ClassType__NoclassAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ClassType__NoclassAssignment_2_0_in_rule__ClassType__Alternatives_2698);
                    rule__ClassType__NoclassAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassTypeAccess().getNoclassAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:357:6: ( ( rule__ClassType__Group_2_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:357:6: ( ( rule__ClassType__Group_2_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:358:1: ( rule__ClassType__Group_2_1__0 )
                    {
                     before(grammarAccess.getClassTypeAccess().getGroup_2_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:359:1: ( rule__ClassType__Group_2_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:359:2: rule__ClassType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClassType__Group_2_1__0_in_rule__ClassType__Alternatives_2716);
                    rule__ClassType__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassTypeAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:363:6: ( ( rule__ClassType__Group_2_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:363:6: ( ( rule__ClassType__Group_2_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:364:1: ( rule__ClassType__Group_2_2__0 )
                    {
                     before(grammarAccess.getClassTypeAccess().getGroup_2_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:365:1: ( rule__ClassType__Group_2_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:365:2: rule__ClassType__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__ClassType__Group_2_2__0_in_rule__ClassType__Alternatives_2734);
                    rule__ClassType__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassTypeAccess().getGroup_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:369:6: ( ( rule__ClassType__Group_2_3__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:369:6: ( ( rule__ClassType__Group_2_3__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:370:1: ( rule__ClassType__Group_2_3__0 )
                    {
                     before(grammarAccess.getClassTypeAccess().getGroup_2_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:371:1: ( rule__ClassType__Group_2_3__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:371:2: rule__ClassType__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__ClassType__Group_2_3__0_in_rule__ClassType__Alternatives_2752);
                    rule__ClassType__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassTypeAccess().getGroup_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Alternatives_2"


    // $ANTLR start "rule__ClassType__BlockingAlternatives_2_3_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:380:1: rule__ClassType__BlockingAlternatives_2_3_1_0 : ( ( 'BRACES' ) | ( 'INDENT' ) );
    public final void rule__ClassType__BlockingAlternatives_2_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:384:1: ( ( 'BRACES' ) | ( 'INDENT' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:385:1: ( 'BRACES' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:385:1: ( 'BRACES' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:386:1: 'BRACES'
                    {
                     before(grammarAccess.getClassTypeAccess().getBlockingBRACESKeyword_2_3_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__ClassType__BlockingAlternatives_2_3_1_0786); 
                     after(grammarAccess.getClassTypeAccess().getBlockingBRACESKeyword_2_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:393:6: ( 'INDENT' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:393:6: ( 'INDENT' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:394:1: 'INDENT'
                    {
                     before(grammarAccess.getClassTypeAccess().getBlockingINDENTKeyword_2_3_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__ClassType__BlockingAlternatives_2_3_1_0806); 
                     after(grammarAccess.getClassTypeAccess().getBlockingINDENTKeyword_2_3_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__BlockingAlternatives_2_3_1_0"


    // $ANTLR start "rule__Procedure__Alternatives_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:406:1: rule__Procedure__Alternatives_2 : ( ( ( rule__Procedure__Group_2_0__0 ) ) | ( ( rule__Procedure__Group_2_1__0 ) ) | ( ( rule__Procedure__Group_2_2__0 ) ) );
    public final void rule__Procedure__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:410:1: ( ( ( rule__Procedure__Group_2_0__0 ) ) | ( ( rule__Procedure__Group_2_1__0 ) ) | ( ( rule__Procedure__Group_2_2__0 ) ) )
            int alt5=3;
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
            case 27:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:411:1: ( ( rule__Procedure__Group_2_0__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:411:1: ( ( rule__Procedure__Group_2_0__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:412:1: ( rule__Procedure__Group_2_0__0 )
                    {
                     before(grammarAccess.getProcedureAccess().getGroup_2_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:413:1: ( rule__Procedure__Group_2_0__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:413:2: rule__Procedure__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Procedure__Group_2_0__0_in_rule__Procedure__Alternatives_2840);
                    rule__Procedure__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedureAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:417:6: ( ( rule__Procedure__Group_2_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:417:6: ( ( rule__Procedure__Group_2_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:418:1: ( rule__Procedure__Group_2_1__0 )
                    {
                     before(grammarAccess.getProcedureAccess().getGroup_2_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:419:1: ( rule__Procedure__Group_2_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:419:2: rule__Procedure__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Procedure__Group_2_1__0_in_rule__Procedure__Alternatives_2858);
                    rule__Procedure__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedureAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:423:6: ( ( rule__Procedure__Group_2_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:423:6: ( ( rule__Procedure__Group_2_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:424:1: ( rule__Procedure__Group_2_2__0 )
                    {
                     before(grammarAccess.getProcedureAccess().getGroup_2_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:425:1: ( rule__Procedure__Group_2_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:425:2: rule__Procedure__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Procedure__Group_2_2__0_in_rule__Procedure__Alternatives_2876);
                    rule__Procedure__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedureAccess().getGroup_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Alternatives_2"


    // $ANTLR start "rule__Procedure__TypesAlternatives_2_2_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:434:1: rule__Procedure__TypesAlternatives_2_2_1_0 : ( ( 'COLONSEPERATED' ) | ( 'SPACESEPERATED' ) | ( 'INHEADER' ) | ( 'INFERRED' ) | ( 'UNTYPED' ) );
    public final void rule__Procedure__TypesAlternatives_2_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:438:1: ( ( 'COLONSEPERATED' ) | ( 'SPACESEPERATED' ) | ( 'INHEADER' ) | ( 'INFERRED' ) | ( 'UNTYPED' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:439:1: ( 'COLONSEPERATED' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:439:1: ( 'COLONSEPERATED' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:440:1: 'COLONSEPERATED'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesCOLONSEPERATEDKeyword_2_2_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Procedure__TypesAlternatives_2_2_1_0910); 
                     after(grammarAccess.getProcedureAccess().getTypesCOLONSEPERATEDKeyword_2_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:447:6: ( 'SPACESEPERATED' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:447:6: ( 'SPACESEPERATED' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:448:1: 'SPACESEPERATED'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesSPACESEPERATEDKeyword_2_2_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Procedure__TypesAlternatives_2_2_1_0930); 
                     after(grammarAccess.getProcedureAccess().getTypesSPACESEPERATEDKeyword_2_2_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:455:6: ( 'INHEADER' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:455:6: ( 'INHEADER' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:456:1: 'INHEADER'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesINHEADERKeyword_2_2_1_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__Procedure__TypesAlternatives_2_2_1_0950); 
                     after(grammarAccess.getProcedureAccess().getTypesINHEADERKeyword_2_2_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:463:6: ( 'INFERRED' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:463:6: ( 'INFERRED' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:464:1: 'INFERRED'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesINFERREDKeyword_2_2_1_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__Procedure__TypesAlternatives_2_2_1_0970); 
                     after(grammarAccess.getProcedureAccess().getTypesINFERREDKeyword_2_2_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:471:6: ( 'UNTYPED' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:471:6: ( 'UNTYPED' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:472:1: 'UNTYPED'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesUNTYPEDKeyword_2_2_1_0_4()); 
                    match(input,17,FOLLOW_17_in_rule__Procedure__TypesAlternatives_2_2_1_0990); 
                     after(grammarAccess.getProcedureAccess().getTypesUNTYPEDKeyword_2_2_1_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__TypesAlternatives_2_2_1_0"


    // $ANTLR start "rule__Statement__Alternatives_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:484:1: rule__Statement__Alternatives_2 : ( ( ( rule__Statement__Group_2_0__0 ) ) | ( ( rule__Statement__Group_2_1__0 ) ) | ( ( rule__Statement__Group_2_2__0 ) ) | ( ( rule__Statement__Group_2_3__0 ) ) | ( ( rule__Statement__Group_2_4__0 ) ) );
    public final void rule__Statement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:488:1: ( ( ( rule__Statement__Group_2_0__0 ) ) | ( ( rule__Statement__Group_2_1__0 ) ) | ( ( rule__Statement__Group_2_2__0 ) ) | ( ( rule__Statement__Group_2_3__0 ) ) | ( ( rule__Statement__Group_2_4__0 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 36:
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:489:1: ( ( rule__Statement__Group_2_0__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:489:1: ( ( rule__Statement__Group_2_0__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:490:1: ( rule__Statement__Group_2_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:491:1: ( rule__Statement__Group_2_0__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:491:2: rule__Statement__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_0__0_in_rule__Statement__Alternatives_21024);
                    rule__Statement__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:495:6: ( ( rule__Statement__Group_2_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:495:6: ( ( rule__Statement__Group_2_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:496:1: ( rule__Statement__Group_2_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:497:1: ( rule__Statement__Group_2_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:497:2: rule__Statement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_1__0_in_rule__Statement__Alternatives_21042);
                    rule__Statement__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:501:6: ( ( rule__Statement__Group_2_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:501:6: ( ( rule__Statement__Group_2_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:502:1: ( rule__Statement__Group_2_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:503:1: ( rule__Statement__Group_2_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:503:2: rule__Statement__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_2__0_in_rule__Statement__Alternatives_21060);
                    rule__Statement__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:507:6: ( ( rule__Statement__Group_2_3__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:507:6: ( ( rule__Statement__Group_2_3__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:508:1: ( rule__Statement__Group_2_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:509:1: ( rule__Statement__Group_2_3__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:509:2: rule__Statement__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_3__0_in_rule__Statement__Alternatives_21078);
                    rule__Statement__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:513:6: ( ( rule__Statement__Group_2_4__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:513:6: ( ( rule__Statement__Group_2_4__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:514:1: ( rule__Statement__Group_2_4__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_4()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:515:1: ( rule__Statement__Group_2_4__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:515:2: rule__Statement__Group_2_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_4__0_in_rule__Statement__Alternatives_21096);
                    rule__Statement__Group_2_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives_2"


    // $ANTLR start "rule__Precedence__Alternatives"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:524:1: rule__Precedence__Alternatives : ( ( ( rule__Precedence__Group_0__0 ) ) | ( ( rule__Precedence__Group_1__0 ) ) | ( ( rule__Precedence__Group_2__0 ) ) | ( ( rule__Precedence__Group_3__0 ) ) | ( ( rule__Precedence__Group_4__0 ) ) | ( ( rule__Precedence__Group_5__0 ) ) | ( ( rule__Precedence__Group_6__0 ) ) | ( ( rule__Precedence__Group_7__0 ) ) | ( ( rule__Precedence__Group_8__0 ) ) | ( ( rule__Precedence__Group_9__0 ) ) | ( ( rule__Precedence__Group_10__0 ) ) );
    public final void rule__Precedence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:528:1: ( ( ( rule__Precedence__Group_0__0 ) ) | ( ( rule__Precedence__Group_1__0 ) ) | ( ( rule__Precedence__Group_2__0 ) ) | ( ( rule__Precedence__Group_3__0 ) ) | ( ( rule__Precedence__Group_4__0 ) ) | ( ( rule__Precedence__Group_5__0 ) ) | ( ( rule__Precedence__Group_6__0 ) ) | ( ( rule__Precedence__Group_7__0 ) ) | ( ( rule__Precedence__Group_8__0 ) ) | ( ( rule__Precedence__Group_9__0 ) ) | ( ( rule__Precedence__Group_10__0 ) ) )
            int alt8=11;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 43:
                {
                alt8=4;
                }
                break;
            case 44:
                {
                alt8=5;
                }
                break;
            case 45:
                {
                alt8=6;
                }
                break;
            case 46:
                {
                alt8=7;
                }
                break;
            case 47:
                {
                alt8=8;
                }
                break;
            case 11:
                {
                alt8=9;
                }
                break;
            case 48:
                {
                alt8=10;
                }
                break;
            case 49:
                {
                alt8=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:529:1: ( ( rule__Precedence__Group_0__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:529:1: ( ( rule__Precedence__Group_0__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:530:1: ( rule__Precedence__Group_0__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:531:1: ( rule__Precedence__Group_0__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:531:2: rule__Precedence__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_0__0_in_rule__Precedence__Alternatives1129);
                    rule__Precedence__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:535:6: ( ( rule__Precedence__Group_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:535:6: ( ( rule__Precedence__Group_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:536:1: ( rule__Precedence__Group_1__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:537:1: ( rule__Precedence__Group_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:537:2: rule__Precedence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_1__0_in_rule__Precedence__Alternatives1147);
                    rule__Precedence__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:541:6: ( ( rule__Precedence__Group_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:541:6: ( ( rule__Precedence__Group_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:542:1: ( rule__Precedence__Group_2__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:543:1: ( rule__Precedence__Group_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:543:2: rule__Precedence__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_2__0_in_rule__Precedence__Alternatives1165);
                    rule__Precedence__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:547:6: ( ( rule__Precedence__Group_3__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:547:6: ( ( rule__Precedence__Group_3__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:548:1: ( rule__Precedence__Group_3__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:549:1: ( rule__Precedence__Group_3__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:549:2: rule__Precedence__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_3__0_in_rule__Precedence__Alternatives1183);
                    rule__Precedence__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:553:6: ( ( rule__Precedence__Group_4__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:553:6: ( ( rule__Precedence__Group_4__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:554:1: ( rule__Precedence__Group_4__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_4()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:555:1: ( rule__Precedence__Group_4__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:555:2: rule__Precedence__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_4__0_in_rule__Precedence__Alternatives1201);
                    rule__Precedence__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:559:6: ( ( rule__Precedence__Group_5__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:559:6: ( ( rule__Precedence__Group_5__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:560:1: ( rule__Precedence__Group_5__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_5()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:561:1: ( rule__Precedence__Group_5__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:561:2: rule__Precedence__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_5__0_in_rule__Precedence__Alternatives1219);
                    rule__Precedence__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:565:6: ( ( rule__Precedence__Group_6__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:565:6: ( ( rule__Precedence__Group_6__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:566:1: ( rule__Precedence__Group_6__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_6()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:567:1: ( rule__Precedence__Group_6__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:567:2: rule__Precedence__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_6__0_in_rule__Precedence__Alternatives1237);
                    rule__Precedence__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:571:6: ( ( rule__Precedence__Group_7__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:571:6: ( ( rule__Precedence__Group_7__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:572:1: ( rule__Precedence__Group_7__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_7()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:573:1: ( rule__Precedence__Group_7__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:573:2: rule__Precedence__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_7__0_in_rule__Precedence__Alternatives1255);
                    rule__Precedence__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:577:6: ( ( rule__Precedence__Group_8__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:577:6: ( ( rule__Precedence__Group_8__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:578:1: ( rule__Precedence__Group_8__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_8()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:579:1: ( rule__Precedence__Group_8__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:579:2: rule__Precedence__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_8__0_in_rule__Precedence__Alternatives1273);
                    rule__Precedence__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:583:6: ( ( rule__Precedence__Group_9__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:583:6: ( ( rule__Precedence__Group_9__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:584:1: ( rule__Precedence__Group_9__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_9()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:585:1: ( rule__Precedence__Group_9__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:585:2: rule__Precedence__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_9__0_in_rule__Precedence__Alternatives1291);
                    rule__Precedence__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:589:6: ( ( rule__Precedence__Group_10__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:589:6: ( ( rule__Precedence__Group_10__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:590:1: ( rule__Precedence__Group_10__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_10()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:591:1: ( rule__Precedence__Group_10__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:591:2: rule__Precedence__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_10__0_in_rule__Precedence__Alternatives1309);
                    rule__Precedence__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Alternatives"


    // $ANTLR start "rule__Precedence__LiteralAlternatives_6_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:600:1: rule__Precedence__LiteralAlternatives_6_2_0 : ( ( 'INT' ) | ( 'STRING' ) | ( 'BOOL' ) | ( 'FLOAT' ) );
    public final void rule__Precedence__LiteralAlternatives_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:604:1: ( ( 'INT' ) | ( 'STRING' ) | ( 'BOOL' ) | ( 'FLOAT' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:605:1: ( 'INT' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:605:1: ( 'INT' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:606:1: 'INT'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralINTKeyword_6_2_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Precedence__LiteralAlternatives_6_2_01343); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralINTKeyword_6_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:613:6: ( 'STRING' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:613:6: ( 'STRING' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:614:1: 'STRING'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralSTRINGKeyword_6_2_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Precedence__LiteralAlternatives_6_2_01363); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralSTRINGKeyword_6_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:621:6: ( 'BOOL' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:621:6: ( 'BOOL' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:622:1: 'BOOL'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralBOOLKeyword_6_2_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__Precedence__LiteralAlternatives_6_2_01383); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralBOOLKeyword_6_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:629:6: ( 'FLOAT' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:629:6: ( 'FLOAT' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:630:1: 'FLOAT'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralFLOATKeyword_6_2_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__Precedence__LiteralAlternatives_6_2_01403); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralFLOATKeyword_6_2_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__LiteralAlternatives_6_2_0"


    // $ANTLR start "rule__InnerPrecedence__Alternatives"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:642:1: rule__InnerPrecedence__Alternatives : ( ( ( rule__InnerPrecedence__Group_0__0 ) ) | ( ( rule__InnerPrecedence__Group_1__0 ) ) | ( ( rule__InnerPrecedence__Group_2__0 ) ) | ( ( rule__InnerPrecedence__Group_3__0 ) ) | ( ( rule__InnerPrecedence__Group_4__0 ) ) | ( ( rule__InnerPrecedence__Group_5__0 ) ) | ( ( rule__InnerPrecedence__Group_6__0 ) ) | ( ( rule__InnerPrecedence__Group_7__0 ) ) );
    public final void rule__InnerPrecedence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:646:1: ( ( ( rule__InnerPrecedence__Group_0__0 ) ) | ( ( rule__InnerPrecedence__Group_1__0 ) ) | ( ( rule__InnerPrecedence__Group_2__0 ) ) | ( ( rule__InnerPrecedence__Group_3__0 ) ) | ( ( rule__InnerPrecedence__Group_4__0 ) ) | ( ( rule__InnerPrecedence__Group_5__0 ) ) | ( ( rule__InnerPrecedence__Group_6__0 ) ) | ( ( rule__InnerPrecedence__Group_7__0 ) ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt10=1;
                }
                break;
            case 51:
                {
                alt10=2;
                }
                break;
            case 52:
                {
                alt10=3;
                }
                break;
            case 53:
                {
                alt10=4;
                }
                break;
            case 54:
                {
                alt10=5;
                }
                break;
            case 55:
                {
                alt10=6;
                }
                break;
            case 56:
                {
                alt10=7;
                }
                break;
            case 57:
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:647:1: ( ( rule__InnerPrecedence__Group_0__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:647:1: ( ( rule__InnerPrecedence__Group_0__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:648:1: ( rule__InnerPrecedence__Group_0__0 )
                    {
                     before(grammarAccess.getInnerPrecedenceAccess().getGroup_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:649:1: ( rule__InnerPrecedence__Group_0__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:649:2: rule__InnerPrecedence__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_0__0_in_rule__InnerPrecedence__Alternatives1437);
                    rule__InnerPrecedence__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerPrecedenceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:653:6: ( ( rule__InnerPrecedence__Group_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:653:6: ( ( rule__InnerPrecedence__Group_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:654:1: ( rule__InnerPrecedence__Group_1__0 )
                    {
                     before(grammarAccess.getInnerPrecedenceAccess().getGroup_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:655:1: ( rule__InnerPrecedence__Group_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:655:2: rule__InnerPrecedence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_1__0_in_rule__InnerPrecedence__Alternatives1455);
                    rule__InnerPrecedence__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerPrecedenceAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:659:6: ( ( rule__InnerPrecedence__Group_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:659:6: ( ( rule__InnerPrecedence__Group_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:660:1: ( rule__InnerPrecedence__Group_2__0 )
                    {
                     before(grammarAccess.getInnerPrecedenceAccess().getGroup_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:661:1: ( rule__InnerPrecedence__Group_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:661:2: rule__InnerPrecedence__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__0_in_rule__InnerPrecedence__Alternatives1473);
                    rule__InnerPrecedence__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerPrecedenceAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:665:6: ( ( rule__InnerPrecedence__Group_3__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:665:6: ( ( rule__InnerPrecedence__Group_3__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:666:1: ( rule__InnerPrecedence__Group_3__0 )
                    {
                     before(grammarAccess.getInnerPrecedenceAccess().getGroup_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:667:1: ( rule__InnerPrecedence__Group_3__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:667:2: rule__InnerPrecedence__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_3__0_in_rule__InnerPrecedence__Alternatives1491);
                    rule__InnerPrecedence__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerPrecedenceAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:671:6: ( ( rule__InnerPrecedence__Group_4__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:671:6: ( ( rule__InnerPrecedence__Group_4__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:672:1: ( rule__InnerPrecedence__Group_4__0 )
                    {
                     before(grammarAccess.getInnerPrecedenceAccess().getGroup_4()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:673:1: ( rule__InnerPrecedence__Group_4__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:673:2: rule__InnerPrecedence__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_4__0_in_rule__InnerPrecedence__Alternatives1509);
                    rule__InnerPrecedence__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerPrecedenceAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:677:6: ( ( rule__InnerPrecedence__Group_5__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:677:6: ( ( rule__InnerPrecedence__Group_5__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:678:1: ( rule__InnerPrecedence__Group_5__0 )
                    {
                     before(grammarAccess.getInnerPrecedenceAccess().getGroup_5()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:679:1: ( rule__InnerPrecedence__Group_5__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:679:2: rule__InnerPrecedence__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_5__0_in_rule__InnerPrecedence__Alternatives1527);
                    rule__InnerPrecedence__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerPrecedenceAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:683:6: ( ( rule__InnerPrecedence__Group_6__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:683:6: ( ( rule__InnerPrecedence__Group_6__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:684:1: ( rule__InnerPrecedence__Group_6__0 )
                    {
                     before(grammarAccess.getInnerPrecedenceAccess().getGroup_6()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:685:1: ( rule__InnerPrecedence__Group_6__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:685:2: rule__InnerPrecedence__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_6__0_in_rule__InnerPrecedence__Alternatives1545);
                    rule__InnerPrecedence__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerPrecedenceAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:689:6: ( ( rule__InnerPrecedence__Group_7__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:689:6: ( ( rule__InnerPrecedence__Group_7__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:690:1: ( rule__InnerPrecedence__Group_7__0 )
                    {
                     before(grammarAccess.getInnerPrecedenceAccess().getGroup_7()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:691:1: ( rule__InnerPrecedence__Group_7__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:691:2: rule__InnerPrecedence__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_7__0_in_rule__InnerPrecedence__Alternatives1563);
                    rule__InnerPrecedence__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInnerPrecedenceAccess().getGroup_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Alternatives"


    // $ANTLR start "rule__MultID__Alternatives_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:700:1: rule__MultID__Alternatives_1 : ( ( ( rule__MultID__MiAssignment_1_0 ) ) | ( ( rule__MultID__Group_1_1__0 ) ) );
    public final void rule__MultID__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:704:1: ( ( ( rule__MultID__MiAssignment_1_0 ) ) | ( ( rule__MultID__Group_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==39) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:705:1: ( ( rule__MultID__MiAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:705:1: ( ( rule__MultID__MiAssignment_1_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:706:1: ( rule__MultID__MiAssignment_1_0 )
                    {
                     before(grammarAccess.getMultIDAccess().getMiAssignment_1_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:707:1: ( rule__MultID__MiAssignment_1_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:707:2: rule__MultID__MiAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MultID__MiAssignment_1_0_in_rule__MultID__Alternatives_11596);
                    rule__MultID__MiAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultIDAccess().getMiAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:711:6: ( ( rule__MultID__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:711:6: ( ( rule__MultID__Group_1_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:712:1: ( rule__MultID__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultIDAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:713:1: ( rule__MultID__Group_1_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:713:2: rule__MultID__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultID__Group_1_1__0_in_rule__MultID__Alternatives_11614);
                    rule__MultID__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultIDAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Alternatives_1"


    // $ANTLR start "rule__MultString__Alternatives_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:722:1: rule__MultString__Alternatives_1 : ( ( ( rule__MultString__MsAssignment_1_0 ) ) | ( ( rule__MultString__Group_1_1__0 ) ) );
    public final void rule__MultString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:726:1: ( ( ( rule__MultString__MsAssignment_1_0 ) ) | ( ( rule__MultString__Group_1_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==39) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:727:1: ( ( rule__MultString__MsAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:727:1: ( ( rule__MultString__MsAssignment_1_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:728:1: ( rule__MultString__MsAssignment_1_0 )
                    {
                     before(grammarAccess.getMultStringAccess().getMsAssignment_1_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:729:1: ( rule__MultString__MsAssignment_1_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:729:2: rule__MultString__MsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MultString__MsAssignment_1_0_in_rule__MultString__Alternatives_11647);
                    rule__MultString__MsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultStringAccess().getMsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:733:6: ( ( rule__MultString__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:733:6: ( ( rule__MultString__Group_1_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:734:1: ( rule__MultString__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultStringAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:735:1: ( rule__MultString__Group_1_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:735:2: rule__MultString__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultString__Group_1_1__0_in_rule__MultString__Alternatives_11665);
                    rule__MultString__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultStringAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Alternatives_1"


    // $ANTLR start "rule__ClassType__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:746:1: rule__ClassType__Group__0 : rule__ClassType__Group__0__Impl rule__ClassType__Group__1 ;
    public final void rule__ClassType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:750:1: ( rule__ClassType__Group__0__Impl rule__ClassType__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:751:2: rule__ClassType__Group__0__Impl rule__ClassType__Group__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01696);
            rule__ClassType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01699);
            rule__ClassType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group__0"


    // $ANTLR start "rule__ClassType__Group__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:758:1: rule__ClassType__Group__0__Impl : ( 'CLASS' ) ;
    public final void rule__ClassType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:762:1: ( ( 'CLASS' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:763:1: ( 'CLASS' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:763:1: ( 'CLASS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:764:1: 'CLASS'
            {
             before(grammarAccess.getClassTypeAccess().getCLASSKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ClassType__Group__0__Impl1727); 
             after(grammarAccess.getClassTypeAccess().getCLASSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group__0__Impl"


    // $ANTLR start "rule__ClassType__Group__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:777:1: rule__ClassType__Group__1 : rule__ClassType__Group__1__Impl rule__ClassType__Group__2 ;
    public final void rule__ClassType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:781:1: ( rule__ClassType__Group__1__Impl rule__ClassType__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:782:2: rule__ClassType__Group__1__Impl rule__ClassType__Group__2
            {
            pushFollow(FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11758);
            rule__ClassType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11761);
            rule__ClassType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group__1"


    // $ANTLR start "rule__ClassType__Group__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:789:1: rule__ClassType__Group__1__Impl : ( ( rule__ClassType__NameAssignment_1 ) ) ;
    public final void rule__ClassType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:793:1: ( ( ( rule__ClassType__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:794:1: ( ( rule__ClassType__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:794:1: ( ( rule__ClassType__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:795:1: ( rule__ClassType__NameAssignment_1 )
            {
             before(grammarAccess.getClassTypeAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:796:1: ( rule__ClassType__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:796:2: rule__ClassType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1788);
            rule__ClassType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group__1__Impl"


    // $ANTLR start "rule__ClassType__Group__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:806:1: rule__ClassType__Group__2 : rule__ClassType__Group__2__Impl ;
    public final void rule__ClassType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:810:1: ( rule__ClassType__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:811:2: rule__ClassType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21818);
            rule__ClassType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group__2"


    // $ANTLR start "rule__ClassType__Group__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:817:1: rule__ClassType__Group__2__Impl : ( ( rule__ClassType__Alternatives_2 )* ) ;
    public final void rule__ClassType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:821:1: ( ( ( rule__ClassType__Alternatives_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:822:1: ( ( rule__ClassType__Alternatives_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:822:1: ( ( rule__ClassType__Alternatives_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:823:1: ( rule__ClassType__Alternatives_2 )*
            {
             before(grammarAccess.getClassTypeAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:824:1: ( rule__ClassType__Alternatives_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=25)||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:824:2: rule__ClassType__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1845);
            	    rule__ClassType__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClassTypeAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group__2__Impl"


    // $ANTLR start "rule__ClassType__Group_2_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:840:1: rule__ClassType__Group_2_1__0 : rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1 ;
    public final void rule__ClassType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:844:1: ( rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:845:2: rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01882);
            rule__ClassType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01885);
            rule__ClassType__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_1__0"


    // $ANTLR start "rule__ClassType__Group_2_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:852:1: rule__ClassType__Group_2_1__0__Impl : ( 'PREFIX' ) ;
    public final void rule__ClassType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:856:1: ( ( 'PREFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:857:1: ( 'PREFIX' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:857:1: ( 'PREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:858:1: 'PREFIX'
            {
             before(grammarAccess.getClassTypeAccess().getPREFIXKeyword_2_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1913); 
             after(grammarAccess.getClassTypeAccess().getPREFIXKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_1__0__Impl"


    // $ANTLR start "rule__ClassType__Group_2_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:871:1: rule__ClassType__Group_2_1__1 : rule__ClassType__Group_2_1__1__Impl ;
    public final void rule__ClassType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:875:1: ( rule__ClassType__Group_2_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:876:2: rule__ClassType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11944);
            rule__ClassType__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_1__1"


    // $ANTLR start "rule__ClassType__Group_2_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:882:1: rule__ClassType__Group_2_1__1__Impl : ( ( rule__ClassType__PrefixAssignment_2_1_1 ) ) ;
    public final void rule__ClassType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:886:1: ( ( ( rule__ClassType__PrefixAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:887:1: ( ( rule__ClassType__PrefixAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:887:1: ( ( rule__ClassType__PrefixAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:888:1: ( rule__ClassType__PrefixAssignment_2_1_1 )
            {
             before(grammarAccess.getClassTypeAccess().getPrefixAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:889:1: ( rule__ClassType__PrefixAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:889:2: rule__ClassType__PrefixAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1971);
            rule__ClassType__PrefixAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getPrefixAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_1__1__Impl"


    // $ANTLR start "rule__ClassType__Group_2_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:903:1: rule__ClassType__Group_2_2__0 : rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1 ;
    public final void rule__ClassType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:907:1: ( rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:908:2: rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__02005);
            rule__ClassType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__02008);
            rule__ClassType__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_2__0"


    // $ANTLR start "rule__ClassType__Group_2_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:915:1: rule__ClassType__Group_2_2__0__Impl : ( 'SUFFIX' ) ;
    public final void rule__ClassType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:919:1: ( ( 'SUFFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:920:1: ( 'SUFFIX' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:920:1: ( 'SUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:921:1: 'SUFFIX'
            {
             before(grammarAccess.getClassTypeAccess().getSUFFIXKeyword_2_2_0()); 
            match(input,24,FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl2036); 
             after(grammarAccess.getClassTypeAccess().getSUFFIXKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_2__0__Impl"


    // $ANTLR start "rule__ClassType__Group_2_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:934:1: rule__ClassType__Group_2_2__1 : rule__ClassType__Group_2_2__1__Impl ;
    public final void rule__ClassType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:938:1: ( rule__ClassType__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:939:2: rule__ClassType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__12067);
            rule__ClassType__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_2__1"


    // $ANTLR start "rule__ClassType__Group_2_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:945:1: rule__ClassType__Group_2_2__1__Impl : ( ( rule__ClassType__SuffixAssignment_2_2_1 ) ) ;
    public final void rule__ClassType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:949:1: ( ( ( rule__ClassType__SuffixAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:950:1: ( ( rule__ClassType__SuffixAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:950:1: ( ( rule__ClassType__SuffixAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:951:1: ( rule__ClassType__SuffixAssignment_2_2_1 )
            {
             before(grammarAccess.getClassTypeAccess().getSuffixAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:952:1: ( rule__ClassType__SuffixAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:952:2: rule__ClassType__SuffixAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl2094);
            rule__ClassType__SuffixAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getSuffixAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_2__1__Impl"


    // $ANTLR start "rule__ClassType__Group_2_3__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:966:1: rule__ClassType__Group_2_3__0 : rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1 ;
    public final void rule__ClassType__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:970:1: ( rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:971:2: rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__02128);
            rule__ClassType__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__02131);
            rule__ClassType__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_3__0"


    // $ANTLR start "rule__ClassType__Group_2_3__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:978:1: rule__ClassType__Group_2_3__0__Impl : ( 'BLOCKING' ) ;
    public final void rule__ClassType__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:982:1: ( ( 'BLOCKING' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:983:1: ( 'BLOCKING' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:983:1: ( 'BLOCKING' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:984:1: 'BLOCKING'
            {
             before(grammarAccess.getClassTypeAccess().getBLOCKINGKeyword_2_3_0()); 
            match(input,25,FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl2159); 
             after(grammarAccess.getClassTypeAccess().getBLOCKINGKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_3__0__Impl"


    // $ANTLR start "rule__ClassType__Group_2_3__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:997:1: rule__ClassType__Group_2_3__1 : rule__ClassType__Group_2_3__1__Impl ;
    public final void rule__ClassType__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1001:1: ( rule__ClassType__Group_2_3__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1002:2: rule__ClassType__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__12190);
            rule__ClassType__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_3__1"


    // $ANTLR start "rule__ClassType__Group_2_3__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1008:1: rule__ClassType__Group_2_3__1__Impl : ( ( rule__ClassType__BlockingAssignment_2_3_1 ) ) ;
    public final void rule__ClassType__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1012:1: ( ( ( rule__ClassType__BlockingAssignment_2_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1013:1: ( ( rule__ClassType__BlockingAssignment_2_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1013:1: ( ( rule__ClassType__BlockingAssignment_2_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1014:1: ( rule__ClassType__BlockingAssignment_2_3_1 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAssignment_2_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1015:1: ( rule__ClassType__BlockingAssignment_2_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1015:2: rule__ClassType__BlockingAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl2217);
            rule__ClassType__BlockingAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getBlockingAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__Group_2_3__1__Impl"


    // $ANTLR start "rule__Procedure__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1029:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1033:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1034:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__02251);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__02254);
            rule__Procedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1041:1: rule__Procedure__Group__0__Impl : ( 'PROCEDURE' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1045:1: ( ( 'PROCEDURE' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1046:1: ( 'PROCEDURE' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1046:1: ( 'PROCEDURE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1047:1: 'PROCEDURE'
            {
             before(grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Procedure__Group__0__Impl2282); 
             after(grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1060:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1064:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1065:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12313);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12316);
            rule__Procedure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1072:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1076:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1077:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1077:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1078:1: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1079:1: ( rule__Procedure__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1079:2: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2343);
            rule__Procedure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1089:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1093:1: ( rule__Procedure__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1094:2: rule__Procedure__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22373);
            rule__Procedure__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1100:1: rule__Procedure__Group__2__Impl : ( ( rule__Procedure__Alternatives_2 )* ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1104:1: ( ( ( rule__Procedure__Alternatives_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1105:1: ( ( rule__Procedure__Alternatives_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1105:1: ( ( rule__Procedure__Alternatives_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1106:1: ( rule__Procedure__Alternatives_2 )*
            {
             before(grammarAccess.getProcedureAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1107:1: ( rule__Procedure__Alternatives_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=23 && LA14_0<=24)||LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1107:2: rule__Procedure__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2400);
            	    rule__Procedure__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group_2_0__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1123:1: rule__Procedure__Group_2_0__0 : rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1 ;
    public final void rule__Procedure__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1127:1: ( rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1128:2: rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02437);
            rule__Procedure__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02440);
            rule__Procedure__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_0__0"


    // $ANTLR start "rule__Procedure__Group_2_0__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1135:1: rule__Procedure__Group_2_0__0__Impl : ( 'PREFIX' ) ;
    public final void rule__Procedure__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1139:1: ( ( 'PREFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1140:1: ( 'PREFIX' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1140:1: ( 'PREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1141:1: 'PREFIX'
            {
             before(grammarAccess.getProcedureAccess().getPREFIXKeyword_2_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2468); 
             after(grammarAccess.getProcedureAccess().getPREFIXKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_0__0__Impl"


    // $ANTLR start "rule__Procedure__Group_2_0__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1154:1: rule__Procedure__Group_2_0__1 : rule__Procedure__Group_2_0__1__Impl ;
    public final void rule__Procedure__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1158:1: ( rule__Procedure__Group_2_0__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1159:2: rule__Procedure__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12499);
            rule__Procedure__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_0__1"


    // $ANTLR start "rule__Procedure__Group_2_0__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1165:1: rule__Procedure__Group_2_0__1__Impl : ( ( rule__Procedure__PrefixAssignment_2_0_1 ) ) ;
    public final void rule__Procedure__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1169:1: ( ( ( rule__Procedure__PrefixAssignment_2_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1170:1: ( ( rule__Procedure__PrefixAssignment_2_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1170:1: ( ( rule__Procedure__PrefixAssignment_2_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1171:1: ( rule__Procedure__PrefixAssignment_2_0_1 )
            {
             before(grammarAccess.getProcedureAccess().getPrefixAssignment_2_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1172:1: ( rule__Procedure__PrefixAssignment_2_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1172:2: rule__Procedure__PrefixAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2526);
            rule__Procedure__PrefixAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getPrefixAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_0__1__Impl"


    // $ANTLR start "rule__Procedure__Group_2_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1186:1: rule__Procedure__Group_2_1__0 : rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 ;
    public final void rule__Procedure__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1190:1: ( rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1191:2: rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02560);
            rule__Procedure__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02563);
            rule__Procedure__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1__0"


    // $ANTLR start "rule__Procedure__Group_2_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1198:1: rule__Procedure__Group_2_1__0__Impl : ( 'SUFFIX' ) ;
    public final void rule__Procedure__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1202:1: ( ( 'SUFFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1203:1: ( 'SUFFIX' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1203:1: ( 'SUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1204:1: 'SUFFIX'
            {
             before(grammarAccess.getProcedureAccess().getSUFFIXKeyword_2_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2591); 
             after(grammarAccess.getProcedureAccess().getSUFFIXKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1__0__Impl"


    // $ANTLR start "rule__Procedure__Group_2_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1217:1: rule__Procedure__Group_2_1__1 : rule__Procedure__Group_2_1__1__Impl ;
    public final void rule__Procedure__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1221:1: ( rule__Procedure__Group_2_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1222:2: rule__Procedure__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12622);
            rule__Procedure__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1__1"


    // $ANTLR start "rule__Procedure__Group_2_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1228:1: rule__Procedure__Group_2_1__1__Impl : ( ( rule__Procedure__SuffixAssignment_2_1_1 ) ) ;
    public final void rule__Procedure__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1232:1: ( ( ( rule__Procedure__SuffixAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1233:1: ( ( rule__Procedure__SuffixAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1233:1: ( ( rule__Procedure__SuffixAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1234:1: ( rule__Procedure__SuffixAssignment_2_1_1 )
            {
             before(grammarAccess.getProcedureAccess().getSuffixAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1235:1: ( rule__Procedure__SuffixAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1235:2: rule__Procedure__SuffixAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2649);
            rule__Procedure__SuffixAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getSuffixAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1__1__Impl"


    // $ANTLR start "rule__Procedure__Group_2_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1249:1: rule__Procedure__Group_2_2__0 : rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1 ;
    public final void rule__Procedure__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1253:1: ( rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1254:2: rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02683);
            rule__Procedure__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02686);
            rule__Procedure__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_2__0"


    // $ANTLR start "rule__Procedure__Group_2_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1261:1: rule__Procedure__Group_2_2__0__Impl : ( 'TYPES' ) ;
    public final void rule__Procedure__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1265:1: ( ( 'TYPES' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1266:1: ( 'TYPES' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1266:1: ( 'TYPES' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1267:1: 'TYPES'
            {
             before(grammarAccess.getProcedureAccess().getTYPESKeyword_2_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2714); 
             after(grammarAccess.getProcedureAccess().getTYPESKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_2__0__Impl"


    // $ANTLR start "rule__Procedure__Group_2_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1280:1: rule__Procedure__Group_2_2__1 : rule__Procedure__Group_2_2__1__Impl ;
    public final void rule__Procedure__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1284:1: ( rule__Procedure__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1285:2: rule__Procedure__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12745);
            rule__Procedure__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_2__1"


    // $ANTLR start "rule__Procedure__Group_2_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1291:1: rule__Procedure__Group_2_2__1__Impl : ( ( rule__Procedure__TypesAssignment_2_2_1 ) ) ;
    public final void rule__Procedure__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1295:1: ( ( ( rule__Procedure__TypesAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1296:1: ( ( rule__Procedure__TypesAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1296:1: ( ( rule__Procedure__TypesAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1297:1: ( rule__Procedure__TypesAssignment_2_2_1 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1298:1: ( rule__Procedure__TypesAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1298:2: rule__Procedure__TypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2772);
            rule__Procedure__TypesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getTypesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_2__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1312:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1316:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1317:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02806);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02809);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1324:1: rule__Statement__Group__0__Impl : ( 'STATEMENT' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1328:1: ( ( 'STATEMENT' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1329:1: ( 'STATEMENT' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1329:1: ( 'STATEMENT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1330:1: 'STATEMENT'
            {
             before(grammarAccess.getStatementAccess().getSTATEMENTKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Statement__Group__0__Impl2837); 
             after(grammarAccess.getStatementAccess().getSTATEMENTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1343:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1347:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1348:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12868);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12871);
            rule__Statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1355:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__NameAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1359:1: ( ( ( rule__Statement__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1360:1: ( ( rule__Statement__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1360:1: ( ( rule__Statement__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1361:1: ( rule__Statement__NameAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1362:1: ( rule__Statement__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1362:2: rule__Statement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2898);
            rule__Statement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1372:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1376:1: ( rule__Statement__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1377:2: rule__Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22928);
            rule__Statement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1383:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__Alternatives_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1387:1: ( ( ( rule__Statement__Alternatives_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1388:1: ( ( rule__Statement__Alternatives_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1388:1: ( ( rule__Statement__Alternatives_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1389:1: ( rule__Statement__Alternatives_2 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1390:1: ( rule__Statement__Alternatives_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1390:2: rule__Statement__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2955);
            rule__Statement__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group_2_0__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1406:1: rule__Statement__Group_2_0__0 : rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1 ;
    public final void rule__Statement__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1410:1: ( rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1411:2: rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02991);
            rule__Statement__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02994);
            rule__Statement__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_0__0"


    // $ANTLR start "rule__Statement__Group_2_0__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1418:1: rule__Statement__Group_2_0__0__Impl : ( 'REPEAT' ) ;
    public final void rule__Statement__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1422:1: ( ( 'REPEAT' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1423:1: ( 'REPEAT' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1423:1: ( 'REPEAT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1424:1: 'REPEAT'
            {
             before(grammarAccess.getStatementAccess().getREPEATKeyword_2_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl3022); 
             after(grammarAccess.getStatementAccess().getREPEATKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_2_0__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1437:1: rule__Statement__Group_2_0__1 : rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2 ;
    public final void rule__Statement__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1441:1: ( rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1442:2: rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__13053);
            rule__Statement__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__13056);
            rule__Statement__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_0__1"


    // $ANTLR start "rule__Statement__Group_2_0__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1449:1: rule__Statement__Group_2_0__1__Impl : ( ( rule__Statement__RepAssignment_2_0_1 ) ) ;
    public final void rule__Statement__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1453:1: ( ( ( rule__Statement__RepAssignment_2_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1454:1: ( ( rule__Statement__RepAssignment_2_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1454:1: ( ( rule__Statement__RepAssignment_2_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1455:1: ( rule__Statement__RepAssignment_2_0_1 )
            {
             before(grammarAccess.getStatementAccess().getRepAssignment_2_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1456:1: ( rule__Statement__RepAssignment_2_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1456:2: rule__Statement__RepAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl3083);
            rule__Statement__RepAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getRepAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_2_0__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1466:1: rule__Statement__Group_2_0__2 : rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3 ;
    public final void rule__Statement__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1470:1: ( rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1471:2: rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__23113);
            rule__Statement__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__23116);
            rule__Statement__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_0__2"


    // $ANTLR start "rule__Statement__Group_2_0__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1478:1: rule__Statement__Group_2_0__2__Impl : ( 'UNTIL' ) ;
    public final void rule__Statement__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1482:1: ( ( 'UNTIL' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1483:1: ( 'UNTIL' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1483:1: ( 'UNTIL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1484:1: 'UNTIL'
            {
             before(grammarAccess.getStatementAccess().getUNTILKeyword_2_0_2()); 
            match(input,30,FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl3144); 
             after(grammarAccess.getStatementAccess().getUNTILKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_0__2__Impl"


    // $ANTLR start "rule__Statement__Group_2_0__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1497:1: rule__Statement__Group_2_0__3 : rule__Statement__Group_2_0__3__Impl ;
    public final void rule__Statement__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1501:1: ( rule__Statement__Group_2_0__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1502:2: rule__Statement__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__33175);
            rule__Statement__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_0__3"


    // $ANTLR start "rule__Statement__Group_2_0__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1508:1: rule__Statement__Group_2_0__3__Impl : ( ( rule__Statement__UntilAssignment_2_0_3 ) ) ;
    public final void rule__Statement__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1512:1: ( ( ( rule__Statement__UntilAssignment_2_0_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1513:1: ( ( rule__Statement__UntilAssignment_2_0_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1513:1: ( ( rule__Statement__UntilAssignment_2_0_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1514:1: ( rule__Statement__UntilAssignment_2_0_3 )
            {
             before(grammarAccess.getStatementAccess().getUntilAssignment_2_0_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1515:1: ( rule__Statement__UntilAssignment_2_0_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1515:2: rule__Statement__UntilAssignment_2_0_3
            {
            pushFollow(FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl3202);
            rule__Statement__UntilAssignment_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getUntilAssignment_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_0__3__Impl"


    // $ANTLR start "rule__Statement__Group_2_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1533:1: rule__Statement__Group_2_1__0 : rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1 ;
    public final void rule__Statement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1537:1: ( rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1538:2: rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__03240);
            rule__Statement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__03243);
            rule__Statement__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_1__0"


    // $ANTLR start "rule__Statement__Group_2_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1545:1: rule__Statement__Group_2_1__0__Impl : ( 'WHILE' ) ;
    public final void rule__Statement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1549:1: ( ( 'WHILE' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1550:1: ( 'WHILE' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1550:1: ( 'WHILE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1551:1: 'WHILE'
            {
             before(grammarAccess.getStatementAccess().getWHILEKeyword_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl3271); 
             after(grammarAccess.getStatementAccess().getWHILEKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_2_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1564:1: rule__Statement__Group_2_1__1 : rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2 ;
    public final void rule__Statement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1568:1: ( rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1569:2: rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13302);
            rule__Statement__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13305);
            rule__Statement__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_1__1"


    // $ANTLR start "rule__Statement__Group_2_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1576:1: rule__Statement__Group_2_1__1__Impl : ( ( rule__Statement__WhileAssignment_2_1_1 ) ) ;
    public final void rule__Statement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1580:1: ( ( ( rule__Statement__WhileAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1581:1: ( ( rule__Statement__WhileAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1581:1: ( ( rule__Statement__WhileAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1582:1: ( rule__Statement__WhileAssignment_2_1_1 )
            {
             before(grammarAccess.getStatementAccess().getWhileAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1583:1: ( rule__Statement__WhileAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1583:2: rule__Statement__WhileAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3332);
            rule__Statement__WhileAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getWhileAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_2_1__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1593:1: rule__Statement__Group_2_1__2 : rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3 ;
    public final void rule__Statement__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1597:1: ( rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1598:2: rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23362);
            rule__Statement__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23365);
            rule__Statement__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_1__2"


    // $ANTLR start "rule__Statement__Group_2_1__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1605:1: rule__Statement__Group_2_1__2__Impl : ( 'DO' ) ;
    public final void rule__Statement__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1609:1: ( ( 'DO' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1610:1: ( 'DO' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1610:1: ( 'DO' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1611:1: 'DO'
            {
             before(grammarAccess.getStatementAccess().getDOKeyword_2_1_2()); 
            match(input,32,FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3393); 
             after(grammarAccess.getStatementAccess().getDOKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_2_1__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1624:1: rule__Statement__Group_2_1__3 : rule__Statement__Group_2_1__3__Impl ;
    public final void rule__Statement__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1628:1: ( rule__Statement__Group_2_1__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1629:2: rule__Statement__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33424);
            rule__Statement__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_1__3"


    // $ANTLR start "rule__Statement__Group_2_1__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1635:1: rule__Statement__Group_2_1__3__Impl : ( ( rule__Statement__DoAssignment_2_1_3 ) ) ;
    public final void rule__Statement__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1639:1: ( ( ( rule__Statement__DoAssignment_2_1_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1640:1: ( ( rule__Statement__DoAssignment_2_1_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1640:1: ( ( rule__Statement__DoAssignment_2_1_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1641:1: ( rule__Statement__DoAssignment_2_1_3 )
            {
             before(grammarAccess.getStatementAccess().getDoAssignment_2_1_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1642:1: ( rule__Statement__DoAssignment_2_1_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1642:2: rule__Statement__DoAssignment_2_1_3
            {
            pushFollow(FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3451);
            rule__Statement__DoAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getDoAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_1__3__Impl"


    // $ANTLR start "rule__Statement__Group_2_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1660:1: rule__Statement__Group_2_2__0 : rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1 ;
    public final void rule__Statement__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1664:1: ( rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1665:2: rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03489);
            rule__Statement__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03492);
            rule__Statement__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_2__0"


    // $ANTLR start "rule__Statement__Group_2_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1672:1: rule__Statement__Group_2_2__0__Impl : ( 'FOR' ) ;
    public final void rule__Statement__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1676:1: ( ( 'FOR' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1677:1: ( 'FOR' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1677:1: ( 'FOR' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1678:1: 'FOR'
            {
             before(grammarAccess.getStatementAccess().getFORKeyword_2_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3520); 
             after(grammarAccess.getStatementAccess().getFORKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1691:1: rule__Statement__Group_2_2__1 : rule__Statement__Group_2_2__1__Impl ;
    public final void rule__Statement__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1695:1: ( rule__Statement__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1696:2: rule__Statement__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13551);
            rule__Statement__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_2__1"


    // $ANTLR start "rule__Statement__Group_2_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1702:1: rule__Statement__Group_2_2__1__Impl : ( ( rule__Statement__ForAssignment_2_2_1 ) ) ;
    public final void rule__Statement__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1706:1: ( ( ( rule__Statement__ForAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1707:1: ( ( rule__Statement__ForAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1707:1: ( ( rule__Statement__ForAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1708:1: ( rule__Statement__ForAssignment_2_2_1 )
            {
             before(grammarAccess.getStatementAccess().getForAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1709:1: ( rule__Statement__ForAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1709:2: rule__Statement__ForAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3578);
            rule__Statement__ForAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getForAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_2_3__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1723:1: rule__Statement__Group_2_3__0 : rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1 ;
    public final void rule__Statement__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1727:1: ( rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1728:2: rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03612);
            rule__Statement__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03615);
            rule__Statement__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3__0"


    // $ANTLR start "rule__Statement__Group_2_3__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1735:1: rule__Statement__Group_2_3__0__Impl : ( 'VAR' ) ;
    public final void rule__Statement__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1739:1: ( ( 'VAR' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1740:1: ( 'VAR' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1740:1: ( 'VAR' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1741:1: 'VAR'
            {
             before(grammarAccess.getStatementAccess().getVARKeyword_2_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3643); 
             after(grammarAccess.getStatementAccess().getVARKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_2_3__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1754:1: rule__Statement__Group_2_3__1 : rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2 ;
    public final void rule__Statement__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1758:1: ( rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1759:2: rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13674);
            rule__Statement__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13677);
            rule__Statement__Group_2_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3__1"


    // $ANTLR start "rule__Statement__Group_2_3__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1766:1: rule__Statement__Group_2_3__1__Impl : ( ( rule__Statement__VarAssignment_2_3_1 ) ) ;
    public final void rule__Statement__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1770:1: ( ( ( rule__Statement__VarAssignment_2_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1771:1: ( ( rule__Statement__VarAssignment_2_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1771:1: ( ( rule__Statement__VarAssignment_2_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1772:1: ( rule__Statement__VarAssignment_2_3_1 )
            {
             before(grammarAccess.getStatementAccess().getVarAssignment_2_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1773:1: ( rule__Statement__VarAssignment_2_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1773:2: rule__Statement__VarAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3704);
            rule__Statement__VarAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getVarAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3__1__Impl"


    // $ANTLR start "rule__Statement__Group_2_3__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1783:1: rule__Statement__Group_2_3__2 : rule__Statement__Group_2_3__2__Impl ;
    public final void rule__Statement__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1787:1: ( rule__Statement__Group_2_3__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1788:2: rule__Statement__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23734);
            rule__Statement__Group_2_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3__2"


    // $ANTLR start "rule__Statement__Group_2_3__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1794:1: rule__Statement__Group_2_3__2__Impl : ( ( rule__Statement__Group_2_3_2__0 )? ) ;
    public final void rule__Statement__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1798:1: ( ( ( rule__Statement__Group_2_3_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1799:1: ( ( rule__Statement__Group_2_3_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1799:1: ( ( rule__Statement__Group_2_3_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1800:1: ( rule__Statement__Group_2_3_2__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_2_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1801:1: ( rule__Statement__Group_2_3_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1801:2: rule__Statement__Group_2_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3761);
                    rule__Statement__Group_2_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getGroup_2_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3__2__Impl"


    // $ANTLR start "rule__Statement__Group_2_3_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1817:1: rule__Statement__Group_2_3_2__0 : rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1 ;
    public final void rule__Statement__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1821:1: ( rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1822:2: rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03798);
            rule__Statement__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03801);
            rule__Statement__Group_2_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3_2__0"


    // $ANTLR start "rule__Statement__Group_2_3_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1829:1: rule__Statement__Group_2_3_2__0__Impl : ( '=' ) ;
    public final void rule__Statement__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1833:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1834:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1834:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1835:1: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_3_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3829); 
             after(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2_3_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1848:1: rule__Statement__Group_2_3_2__1 : rule__Statement__Group_2_3_2__1__Impl ;
    public final void rule__Statement__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1852:1: ( rule__Statement__Group_2_3_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1853:2: rule__Statement__Group_2_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13860);
            rule__Statement__Group_2_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3_2__1"


    // $ANTLR start "rule__Statement__Group_2_3_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1859:1: rule__Statement__Group_2_3_2__1__Impl : ( ( rule__Statement__ExAssignment_2_3_2_1 ) ) ;
    public final void rule__Statement__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1863:1: ( ( ( rule__Statement__ExAssignment_2_3_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1864:1: ( ( rule__Statement__ExAssignment_2_3_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1864:1: ( ( rule__Statement__ExAssignment_2_3_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1865:1: ( rule__Statement__ExAssignment_2_3_2_1 )
            {
             before(grammarAccess.getStatementAccess().getExAssignment_2_3_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1866:1: ( rule__Statement__ExAssignment_2_3_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1866:2: rule__Statement__ExAssignment_2_3_2_1
            {
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3887);
            rule__Statement__ExAssignment_2_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getExAssignment_2_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_3_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_2_4__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1880:1: rule__Statement__Group_2_4__0 : rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1 ;
    public final void rule__Statement__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1884:1: ( rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1885:2: rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03921);
            rule__Statement__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03924);
            rule__Statement__Group_2_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_4__0"


    // $ANTLR start "rule__Statement__Group_2_4__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1892:1: rule__Statement__Group_2_4__0__Impl : ( 'VAL' ) ;
    public final void rule__Statement__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1896:1: ( ( 'VAL' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1897:1: ( 'VAL' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1897:1: ( 'VAL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1898:1: 'VAL'
            {
             before(grammarAccess.getStatementAccess().getVALKeyword_2_4_0()); 
            match(input,36,FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3952); 
             after(grammarAccess.getStatementAccess().getVALKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_2_4__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1911:1: rule__Statement__Group_2_4__1 : rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2 ;
    public final void rule__Statement__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1915:1: ( rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1916:2: rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13983);
            rule__Statement__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13986);
            rule__Statement__Group_2_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_4__1"


    // $ANTLR start "rule__Statement__Group_2_4__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1923:1: rule__Statement__Group_2_4__1__Impl : ( ( rule__Statement__ValAssignment_2_4_1 ) ) ;
    public final void rule__Statement__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1927:1: ( ( ( rule__Statement__ValAssignment_2_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1928:1: ( ( rule__Statement__ValAssignment_2_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1928:1: ( ( rule__Statement__ValAssignment_2_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1929:1: ( rule__Statement__ValAssignment_2_4_1 )
            {
             before(grammarAccess.getStatementAccess().getValAssignment_2_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1930:1: ( rule__Statement__ValAssignment_2_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1930:2: rule__Statement__ValAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl4013);
            rule__Statement__ValAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getValAssignment_2_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_4__1__Impl"


    // $ANTLR start "rule__Statement__Group_2_4__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1940:1: rule__Statement__Group_2_4__2 : rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3 ;
    public final void rule__Statement__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1944:1: ( rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1945:2: rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__24043);
            rule__Statement__Group_2_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__24046);
            rule__Statement__Group_2_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_4__2"


    // $ANTLR start "rule__Statement__Group_2_4__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1952:1: rule__Statement__Group_2_4__2__Impl : ( '=' ) ;
    public final void rule__Statement__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1956:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1957:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1957:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1958:1: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_4_2()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl4074); 
             after(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_4__2__Impl"


    // $ANTLR start "rule__Statement__Group_2_4__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1971:1: rule__Statement__Group_2_4__3 : rule__Statement__Group_2_4__3__Impl ;
    public final void rule__Statement__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1975:1: ( rule__Statement__Group_2_4__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1976:2: rule__Statement__Group_2_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__34105);
            rule__Statement__Group_2_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_4__3"


    // $ANTLR start "rule__Statement__Group_2_4__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1982:1: rule__Statement__Group_2_4__3__Impl : ( ( rule__Statement__ExAssignment_2_4_3 ) ) ;
    public final void rule__Statement__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1986:1: ( ( ( rule__Statement__ExAssignment_2_4_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1987:1: ( ( rule__Statement__ExAssignment_2_4_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1987:1: ( ( rule__Statement__ExAssignment_2_4_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1988:1: ( rule__Statement__ExAssignment_2_4_3 )
            {
             before(grammarAccess.getStatementAccess().getExAssignment_2_4_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1989:1: ( rule__Statement__ExAssignment_2_4_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1989:2: rule__Statement__ExAssignment_2_4_3
            {
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl4132);
            rule__Statement__ExAssignment_2_4_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getExAssignment_2_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2_4__3__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2007:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2011:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2012:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04170);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04173);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2019:1: rule__Expression__Group__0__Impl : ( 'EXPRESSION' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2023:1: ( ( 'EXPRESSION' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2024:1: ( 'EXPRESSION' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2024:1: ( 'EXPRESSION' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2025:1: 'EXPRESSION'
            {
             before(grammarAccess.getExpressionAccess().getEXPRESSIONKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Expression__Group__0__Impl4201); 
             after(grammarAccess.getExpressionAccess().getEXPRESSIONKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2038:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2042:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2043:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14232);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__14235);
            rule__Expression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2050:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__NameAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2054:1: ( ( ( rule__Expression__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2055:1: ( ( rule__Expression__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2055:1: ( ( rule__Expression__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2056:1: ( rule__Expression__NameAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2057:1: ( rule__Expression__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2057:2: rule__Expression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl4262);
            rule__Expression__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2067:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2071:1: ( rule__Expression__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2072:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24292);
            rule__Expression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2078:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__PrecAssignment_2 )* ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2082:1: ( ( ( rule__Expression__PrecAssignment_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2083:1: ( ( rule__Expression__PrecAssignment_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2083:1: ( ( rule__Expression__PrecAssignment_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2084:1: ( rule__Expression__PrecAssignment_2 )*
            {
             before(grammarAccess.getExpressionAccess().getPrecAssignment_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2085:1: ( rule__Expression__PrecAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11||(LA16_0>=23 && LA16_0<=24)||(LA16_0>=42 && LA16_0<=49)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2085:2: rule__Expression__PrecAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4319);
            	    rule__Expression__PrecAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getPrecAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__Precedence__Group_0__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2101:1: rule__Precedence__Group_0__0 : rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1 ;
    public final void rule__Precedence__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2105:1: ( rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2106:2: rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0__0__Impl_in_rule__Precedence__Group_0__04356);
            rule__Precedence__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_0__1_in_rule__Precedence__Group_0__04359);
            rule__Precedence__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0__0"


    // $ANTLR start "rule__Precedence__Group_0__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2113:1: rule__Precedence__Group_0__0__Impl : ( ( rule__Precedence__RuletypAssignment_0_0 ) ) ;
    public final void rule__Precedence__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2117:1: ( ( ( rule__Precedence__RuletypAssignment_0_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2118:1: ( ( rule__Precedence__RuletypAssignment_0_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2118:1: ( ( rule__Precedence__RuletypAssignment_0_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2119:1: ( rule__Precedence__RuletypAssignment_0_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2120:1: ( rule__Precedence__RuletypAssignment_0_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2120:2: rule__Precedence__RuletypAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_0_0_in_rule__Precedence__Group_0__0__Impl4386);
            rule__Precedence__RuletypAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0__0__Impl"


    // $ANTLR start "rule__Precedence__Group_0__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2130:1: rule__Precedence__Group_0__1 : rule__Precedence__Group_0__1__Impl rule__Precedence__Group_0__2 ;
    public final void rule__Precedence__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2134:1: ( rule__Precedence__Group_0__1__Impl rule__Precedence__Group_0__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2135:2: rule__Precedence__Group_0__1__Impl rule__Precedence__Group_0__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0__1__Impl_in_rule__Precedence__Group_0__14416);
            rule__Precedence__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_0__2_in_rule__Precedence__Group_0__14419);
            rule__Precedence__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0__1"


    // $ANTLR start "rule__Precedence__Group_0__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2142:1: rule__Precedence__Group_0__1__Impl : ( ( rule__Precedence__RuleAssignment_0_1 ) ) ;
    public final void rule__Precedence__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2146:1: ( ( ( rule__Precedence__RuleAssignment_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2147:1: ( ( rule__Precedence__RuleAssignment_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2147:1: ( ( rule__Precedence__RuleAssignment_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2148:1: ( rule__Precedence__RuleAssignment_0_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2149:1: ( rule__Precedence__RuleAssignment_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2149:2: rule__Precedence__RuleAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_0_1_in_rule__Precedence__Group_0__1__Impl4446);
            rule__Precedence__RuleAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0__1__Impl"


    // $ANTLR start "rule__Precedence__Group_0__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2159:1: rule__Precedence__Group_0__2 : rule__Precedence__Group_0__2__Impl ;
    public final void rule__Precedence__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2163:1: ( rule__Precedence__Group_0__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2164:2: rule__Precedence__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0__2__Impl_in_rule__Precedence__Group_0__24476);
            rule__Precedence__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0__2"


    // $ANTLR start "rule__Precedence__Group_0__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2170:1: rule__Precedence__Group_0__2__Impl : ( ( rule__Precedence__Group_0_2__0 )? ) ;
    public final void rule__Precedence__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2174:1: ( ( ( rule__Precedence__Group_0_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2175:1: ( ( rule__Precedence__Group_0_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2175:1: ( ( rule__Precedence__Group_0_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2176:1: ( rule__Precedence__Group_0_2__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_0_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2177:1: ( rule__Precedence__Group_0_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2177:2: rule__Precedence__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_0_2__0_in_rule__Precedence__Group_0__2__Impl4503);
                    rule__Precedence__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrecedenceAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0__2__Impl"


    // $ANTLR start "rule__Precedence__Group_0_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2193:1: rule__Precedence__Group_0_2__0 : rule__Precedence__Group_0_2__0__Impl rule__Precedence__Group_0_2__1 ;
    public final void rule__Precedence__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2197:1: ( rule__Precedence__Group_0_2__0__Impl rule__Precedence__Group_0_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2198:2: rule__Precedence__Group_0_2__0__Impl rule__Precedence__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0_2__0__Impl_in_rule__Precedence__Group_0_2__04540);
            rule__Precedence__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_0_2__1_in_rule__Precedence__Group_0_2__04543);
            rule__Precedence__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0_2__0"


    // $ANTLR start "rule__Precedence__Group_0_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2205:1: rule__Precedence__Group_0_2__0__Impl : ( '.' ) ;
    public final void rule__Precedence__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2209:1: ( ( '.' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2210:1: ( '.' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2210:1: ( '.' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2211:1: '.'
            {
             before(grammarAccess.getPrecedenceAccess().getFullStopKeyword_0_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Precedence__Group_0_2__0__Impl4571); 
             after(grammarAccess.getPrecedenceAccess().getFullStopKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0_2__0__Impl"


    // $ANTLR start "rule__Precedence__Group_0_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2224:1: rule__Precedence__Group_0_2__1 : rule__Precedence__Group_0_2__1__Impl ;
    public final void rule__Precedence__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2228:1: ( rule__Precedence__Group_0_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2229:2: rule__Precedence__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0_2__1__Impl_in_rule__Precedence__Group_0_2__14602);
            rule__Precedence__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0_2__1"


    // $ANTLR start "rule__Precedence__Group_0_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2235:1: rule__Precedence__Group_0_2__1__Impl : ( ( rule__Precedence__Feature1Assignment_0_2_1 ) ) ;
    public final void rule__Precedence__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2239:1: ( ( ( rule__Precedence__Feature1Assignment_0_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2240:1: ( ( rule__Precedence__Feature1Assignment_0_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2240:1: ( ( rule__Precedence__Feature1Assignment_0_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2241:1: ( rule__Precedence__Feature1Assignment_0_2_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_0_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2242:1: ( rule__Precedence__Feature1Assignment_0_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2242:2: rule__Precedence__Feature1Assignment_0_2_1
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_0_2_1_in_rule__Precedence__Group_0_2__1__Impl4629);
            rule__Precedence__Feature1Assignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getFeature1Assignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_0_2__1__Impl"


    // $ANTLR start "rule__Precedence__Group_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2256:1: rule__Precedence__Group_1__0 : rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1 ;
    public final void rule__Precedence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2260:1: ( rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2261:2: rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__0__Impl_in_rule__Precedence__Group_1__04663);
            rule__Precedence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__1_in_rule__Precedence__Group_1__04666);
            rule__Precedence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__0"


    // $ANTLR start "rule__Precedence__Group_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2268:1: rule__Precedence__Group_1__0__Impl : ( ( rule__Precedence__RuletypAssignment_1_0 ) ) ;
    public final void rule__Precedence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2272:1: ( ( ( rule__Precedence__RuletypAssignment_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2273:1: ( ( rule__Precedence__RuletypAssignment_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2273:1: ( ( rule__Precedence__RuletypAssignment_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2274:1: ( rule__Precedence__RuletypAssignment_1_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2275:1: ( rule__Precedence__RuletypAssignment_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2275:2: rule__Precedence__RuletypAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_1_0_in_rule__Precedence__Group_1__0__Impl4693);
            rule__Precedence__RuletypAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__0__Impl"


    // $ANTLR start "rule__Precedence__Group_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2285:1: rule__Precedence__Group_1__1 : rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2 ;
    public final void rule__Precedence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2289:1: ( rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2290:2: rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__1__Impl_in_rule__Precedence__Group_1__14723);
            rule__Precedence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__2_in_rule__Precedence__Group_1__14726);
            rule__Precedence__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__1"


    // $ANTLR start "rule__Precedence__Group_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2297:1: rule__Precedence__Group_1__1__Impl : ( ( rule__Precedence__RuleAssignment_1_1 ) ) ;
    public final void rule__Precedence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2301:1: ( ( ( rule__Precedence__RuleAssignment_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2302:1: ( ( rule__Precedence__RuleAssignment_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2302:1: ( ( rule__Precedence__RuleAssignment_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2303:1: ( rule__Precedence__RuleAssignment_1_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2304:1: ( rule__Precedence__RuleAssignment_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2304:2: rule__Precedence__RuleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_1_1_in_rule__Precedence__Group_1__1__Impl4753);
            rule__Precedence__RuleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__1__Impl"


    // $ANTLR start "rule__Precedence__Group_1__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2314:1: rule__Precedence__Group_1__2 : rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3 ;
    public final void rule__Precedence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2318:1: ( rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2319:2: rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__2__Impl_in_rule__Precedence__Group_1__24783);
            rule__Precedence__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__3_in_rule__Precedence__Group_1__24786);
            rule__Precedence__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__2"


    // $ANTLR start "rule__Precedence__Group_1__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2326:1: rule__Precedence__Group_1__2__Impl : ( ( rule__Precedence__PrefixAssignment_1_2 ) ) ;
    public final void rule__Precedence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2330:1: ( ( ( rule__Precedence__PrefixAssignment_1_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2331:1: ( ( rule__Precedence__PrefixAssignment_1_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2331:1: ( ( rule__Precedence__PrefixAssignment_1_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2332:1: ( rule__Precedence__PrefixAssignment_1_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getPrefixAssignment_1_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2333:1: ( rule__Precedence__PrefixAssignment_1_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2333:2: rule__Precedence__PrefixAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Precedence__PrefixAssignment_1_2_in_rule__Precedence__Group_1__2__Impl4813);
            rule__Precedence__PrefixAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPrefixAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__2__Impl"


    // $ANTLR start "rule__Precedence__Group_1__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2343:1: rule__Precedence__Group_1__3 : rule__Precedence__Group_1__3__Impl rule__Precedence__Group_1__4 ;
    public final void rule__Precedence__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2347:1: ( rule__Precedence__Group_1__3__Impl rule__Precedence__Group_1__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2348:2: rule__Precedence__Group_1__3__Impl rule__Precedence__Group_1__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__3__Impl_in_rule__Precedence__Group_1__34843);
            rule__Precedence__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__4_in_rule__Precedence__Group_1__34846);
            rule__Precedence__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__3"


    // $ANTLR start "rule__Precedence__Group_1__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2355:1: rule__Precedence__Group_1__3__Impl : ( ( rule__Precedence__Group_1_3__0 )? ) ;
    public final void rule__Precedence__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2359:1: ( ( ( rule__Precedence__Group_1_3__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2360:1: ( ( rule__Precedence__Group_1_3__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2360:1: ( ( rule__Precedence__Group_1_3__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2361:1: ( rule__Precedence__Group_1_3__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_1_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2362:1: ( rule__Precedence__Group_1_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==35) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2362:2: rule__Precedence__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_1_3__0_in_rule__Precedence__Group_1__3__Impl4873);
                    rule__Precedence__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrecedenceAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__3__Impl"


    // $ANTLR start "rule__Precedence__Group_1__4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2372:1: rule__Precedence__Group_1__4 : rule__Precedence__Group_1__4__Impl ;
    public final void rule__Precedence__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2376:1: ( rule__Precedence__Group_1__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2377:2: rule__Precedence__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__4__Impl_in_rule__Precedence__Group_1__44904);
            rule__Precedence__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__4"


    // $ANTLR start "rule__Precedence__Group_1__4__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2383:1: rule__Precedence__Group_1__4__Impl : ( ( rule__Precedence__Par1Assignment_1_4 ) ) ;
    public final void rule__Precedence__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2387:1: ( ( ( rule__Precedence__Par1Assignment_1_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2388:1: ( ( rule__Precedence__Par1Assignment_1_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2388:1: ( ( rule__Precedence__Par1Assignment_1_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2389:1: ( rule__Precedence__Par1Assignment_1_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_1_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2390:1: ( rule__Precedence__Par1Assignment_1_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2390:2: rule__Precedence__Par1Assignment_1_4
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_1_4_in_rule__Precedence__Group_1__4__Impl4931);
            rule__Precedence__Par1Assignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1__4__Impl"


    // $ANTLR start "rule__Precedence__Group_1_3__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2410:1: rule__Precedence__Group_1_3__0 : rule__Precedence__Group_1_3__0__Impl rule__Precedence__Group_1_3__1 ;
    public final void rule__Precedence__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2414:1: ( rule__Precedence__Group_1_3__0__Impl rule__Precedence__Group_1_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2415:2: rule__Precedence__Group_1_3__0__Impl rule__Precedence__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1_3__0__Impl_in_rule__Precedence__Group_1_3__04971);
            rule__Precedence__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1_3__1_in_rule__Precedence__Group_1_3__04974);
            rule__Precedence__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1_3__0"


    // $ANTLR start "rule__Precedence__Group_1_3__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2422:1: rule__Precedence__Group_1_3__0__Impl : ( ( rule__Precedence__Feature1Assignment_1_3_0 ) ) ;
    public final void rule__Precedence__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2426:1: ( ( ( rule__Precedence__Feature1Assignment_1_3_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2427:1: ( ( rule__Precedence__Feature1Assignment_1_3_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2427:1: ( ( rule__Precedence__Feature1Assignment_1_3_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2428:1: ( rule__Precedence__Feature1Assignment_1_3_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_1_3_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2429:1: ( rule__Precedence__Feature1Assignment_1_3_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2429:2: rule__Precedence__Feature1Assignment_1_3_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_1_3_0_in_rule__Precedence__Group_1_3__0__Impl5001);
            rule__Precedence__Feature1Assignment_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getFeature1Assignment_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1_3__0__Impl"


    // $ANTLR start "rule__Precedence__Group_1_3__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2439:1: rule__Precedence__Group_1_3__1 : rule__Precedence__Group_1_3__1__Impl ;
    public final void rule__Precedence__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2443:1: ( rule__Precedence__Group_1_3__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2444:2: rule__Precedence__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1_3__1__Impl_in_rule__Precedence__Group_1_3__15031);
            rule__Precedence__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1_3__1"


    // $ANTLR start "rule__Precedence__Group_1_3__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2450:1: rule__Precedence__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2454:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2455:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2455:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2456:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_1_3_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_1_3__1__Impl5059); 
             after(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_1_3__1__Impl"


    // $ANTLR start "rule__Precedence__Group_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2473:1: rule__Precedence__Group_2__0 : rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1 ;
    public final void rule__Precedence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2477:1: ( rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2478:2: rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__0__Impl_in_rule__Precedence__Group_2__05094);
            rule__Precedence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__1_in_rule__Precedence__Group_2__05097);
            rule__Precedence__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__0"


    // $ANTLR start "rule__Precedence__Group_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2485:1: rule__Precedence__Group_2__0__Impl : ( ( rule__Precedence__RuletypAssignment_2_0 ) ) ;
    public final void rule__Precedence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2489:1: ( ( ( rule__Precedence__RuletypAssignment_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2490:1: ( ( rule__Precedence__RuletypAssignment_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2490:1: ( ( rule__Precedence__RuletypAssignment_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2491:1: ( rule__Precedence__RuletypAssignment_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2492:1: ( rule__Precedence__RuletypAssignment_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2492:2: rule__Precedence__RuletypAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_2_0_in_rule__Precedence__Group_2__0__Impl5124);
            rule__Precedence__RuletypAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__0__Impl"


    // $ANTLR start "rule__Precedence__Group_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2502:1: rule__Precedence__Group_2__1 : rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2 ;
    public final void rule__Precedence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2506:1: ( rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2507:2: rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__1__Impl_in_rule__Precedence__Group_2__15154);
            rule__Precedence__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__2_in_rule__Precedence__Group_2__15157);
            rule__Precedence__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__1"


    // $ANTLR start "rule__Precedence__Group_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2514:1: rule__Precedence__Group_2__1__Impl : ( ( rule__Precedence__RuleAssignment_2_1 ) ) ;
    public final void rule__Precedence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2518:1: ( ( ( rule__Precedence__RuleAssignment_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2519:1: ( ( rule__Precedence__RuleAssignment_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2519:1: ( ( rule__Precedence__RuleAssignment_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2520:1: ( rule__Precedence__RuleAssignment_2_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2521:1: ( rule__Precedence__RuleAssignment_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2521:2: rule__Precedence__RuleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_2_1_in_rule__Precedence__Group_2__1__Impl5184);
            rule__Precedence__RuleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__1__Impl"


    // $ANTLR start "rule__Precedence__Group_2__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2531:1: rule__Precedence__Group_2__2 : rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3 ;
    public final void rule__Precedence__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2535:1: ( rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2536:2: rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__2__Impl_in_rule__Precedence__Group_2__25214);
            rule__Precedence__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__3_in_rule__Precedence__Group_2__25217);
            rule__Precedence__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__2"


    // $ANTLR start "rule__Precedence__Group_2__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2543:1: rule__Precedence__Group_2__2__Impl : ( ( rule__Precedence__Group_2_2__0 )? ) ;
    public final void rule__Precedence__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2547:1: ( ( ( rule__Precedence__Group_2_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2548:1: ( ( rule__Precedence__Group_2_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2548:1: ( ( rule__Precedence__Group_2_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2549:1: ( rule__Precedence__Group_2_2__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_2_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2550:1: ( rule__Precedence__Group_2_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==35) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2550:2: rule__Precedence__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_2_2__0_in_rule__Precedence__Group_2__2__Impl5244);
                    rule__Precedence__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrecedenceAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__2__Impl"


    // $ANTLR start "rule__Precedence__Group_2__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2560:1: rule__Precedence__Group_2__3 : rule__Precedence__Group_2__3__Impl rule__Precedence__Group_2__4 ;
    public final void rule__Precedence__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2564:1: ( rule__Precedence__Group_2__3__Impl rule__Precedence__Group_2__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2565:2: rule__Precedence__Group_2__3__Impl rule__Precedence__Group_2__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__3__Impl_in_rule__Precedence__Group_2__35275);
            rule__Precedence__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__4_in_rule__Precedence__Group_2__35278);
            rule__Precedence__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__3"


    // $ANTLR start "rule__Precedence__Group_2__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2572:1: rule__Precedence__Group_2__3__Impl : ( ( rule__Precedence__Par1Assignment_2_3 ) ) ;
    public final void rule__Precedence__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2576:1: ( ( ( rule__Precedence__Par1Assignment_2_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2577:1: ( ( rule__Precedence__Par1Assignment_2_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2577:1: ( ( rule__Precedence__Par1Assignment_2_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2578:1: ( rule__Precedence__Par1Assignment_2_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_2_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2579:1: ( rule__Precedence__Par1Assignment_2_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2579:2: rule__Precedence__Par1Assignment_2_3
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_2_3_in_rule__Precedence__Group_2__3__Impl5305);
            rule__Precedence__Par1Assignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__3__Impl"


    // $ANTLR start "rule__Precedence__Group_2__4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2589:1: rule__Precedence__Group_2__4 : rule__Precedence__Group_2__4__Impl ;
    public final void rule__Precedence__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2593:1: ( rule__Precedence__Group_2__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2594:2: rule__Precedence__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__4__Impl_in_rule__Precedence__Group_2__45335);
            rule__Precedence__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__4"


    // $ANTLR start "rule__Precedence__Group_2__4__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2600:1: rule__Precedence__Group_2__4__Impl : ( ( rule__Precedence__SuffixAssignment_2_4 ) ) ;
    public final void rule__Precedence__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2604:1: ( ( ( rule__Precedence__SuffixAssignment_2_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2605:1: ( ( rule__Precedence__SuffixAssignment_2_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2605:1: ( ( rule__Precedence__SuffixAssignment_2_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2606:1: ( rule__Precedence__SuffixAssignment_2_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getSuffixAssignment_2_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2607:1: ( rule__Precedence__SuffixAssignment_2_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2607:2: rule__Precedence__SuffixAssignment_2_4
            {
            pushFollow(FOLLOW_rule__Precedence__SuffixAssignment_2_4_in_rule__Precedence__Group_2__4__Impl5362);
            rule__Precedence__SuffixAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getSuffixAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2__4__Impl"


    // $ANTLR start "rule__Precedence__Group_2_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2627:1: rule__Precedence__Group_2_2__0 : rule__Precedence__Group_2_2__0__Impl rule__Precedence__Group_2_2__1 ;
    public final void rule__Precedence__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2631:1: ( rule__Precedence__Group_2_2__0__Impl rule__Precedence__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2632:2: rule__Precedence__Group_2_2__0__Impl rule__Precedence__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2_2__0__Impl_in_rule__Precedence__Group_2_2__05402);
            rule__Precedence__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2_2__1_in_rule__Precedence__Group_2_2__05405);
            rule__Precedence__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2_2__0"


    // $ANTLR start "rule__Precedence__Group_2_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2639:1: rule__Precedence__Group_2_2__0__Impl : ( ( rule__Precedence__Feature1Assignment_2_2_0 ) ) ;
    public final void rule__Precedence__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2643:1: ( ( ( rule__Precedence__Feature1Assignment_2_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2644:1: ( ( rule__Precedence__Feature1Assignment_2_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2644:1: ( ( rule__Precedence__Feature1Assignment_2_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2645:1: ( rule__Precedence__Feature1Assignment_2_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_2_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2646:1: ( rule__Precedence__Feature1Assignment_2_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2646:2: rule__Precedence__Feature1Assignment_2_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_2_2_0_in_rule__Precedence__Group_2_2__0__Impl5432);
            rule__Precedence__Feature1Assignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getFeature1Assignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2_2__0__Impl"


    // $ANTLR start "rule__Precedence__Group_2_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2656:1: rule__Precedence__Group_2_2__1 : rule__Precedence__Group_2_2__1__Impl ;
    public final void rule__Precedence__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2660:1: ( rule__Precedence__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2661:2: rule__Precedence__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2_2__1__Impl_in_rule__Precedence__Group_2_2__15462);
            rule__Precedence__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2_2__1"


    // $ANTLR start "rule__Precedence__Group_2_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2667:1: rule__Precedence__Group_2_2__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2671:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2672:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2672:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2673:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_2_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_2_2__1__Impl5490); 
             after(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_2_2__1__Impl"


    // $ANTLR start "rule__Precedence__Group_3__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2690:1: rule__Precedence__Group_3__0 : rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1 ;
    public final void rule__Precedence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2694:1: ( rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2695:2: rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__0__Impl_in_rule__Precedence__Group_3__05525);
            rule__Precedence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__1_in_rule__Precedence__Group_3__05528);
            rule__Precedence__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__0"


    // $ANTLR start "rule__Precedence__Group_3__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2702:1: rule__Precedence__Group_3__0__Impl : ( ( rule__Precedence__RuletypAssignment_3_0 ) ) ;
    public final void rule__Precedence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2706:1: ( ( ( rule__Precedence__RuletypAssignment_3_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2707:1: ( ( rule__Precedence__RuletypAssignment_3_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2707:1: ( ( rule__Precedence__RuletypAssignment_3_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2708:1: ( rule__Precedence__RuletypAssignment_3_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_3_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2709:1: ( rule__Precedence__RuletypAssignment_3_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2709:2: rule__Precedence__RuletypAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_3_0_in_rule__Precedence__Group_3__0__Impl5555);
            rule__Precedence__RuletypAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__0__Impl"


    // $ANTLR start "rule__Precedence__Group_3__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2719:1: rule__Precedence__Group_3__1 : rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2 ;
    public final void rule__Precedence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2723:1: ( rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2724:2: rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__1__Impl_in_rule__Precedence__Group_3__15585);
            rule__Precedence__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__2_in_rule__Precedence__Group_3__15588);
            rule__Precedence__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__1"


    // $ANTLR start "rule__Precedence__Group_3__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2731:1: rule__Precedence__Group_3__1__Impl : ( ( rule__Precedence__RuleAssignment_3_1 ) ) ;
    public final void rule__Precedence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2735:1: ( ( ( rule__Precedence__RuleAssignment_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2736:1: ( ( rule__Precedence__RuleAssignment_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2736:1: ( ( rule__Precedence__RuleAssignment_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2737:1: ( rule__Precedence__RuleAssignment_3_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2738:1: ( rule__Precedence__RuleAssignment_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2738:2: rule__Precedence__RuleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_3_1_in_rule__Precedence__Group_3__1__Impl5615);
            rule__Precedence__RuleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__1__Impl"


    // $ANTLR start "rule__Precedence__Group_3__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2748:1: rule__Precedence__Group_3__2 : rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3 ;
    public final void rule__Precedence__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2752:1: ( rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2753:2: rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__2__Impl_in_rule__Precedence__Group_3__25645);
            rule__Precedence__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__3_in_rule__Precedence__Group_3__25648);
            rule__Precedence__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__2"


    // $ANTLR start "rule__Precedence__Group_3__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2760:1: rule__Precedence__Group_3__2__Impl : ( ( rule__Precedence__Group_3_2__0 )? ) ;
    public final void rule__Precedence__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2764:1: ( ( ( rule__Precedence__Group_3_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2765:1: ( ( rule__Precedence__Group_3_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2765:1: ( ( rule__Precedence__Group_3_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2766:1: ( rule__Precedence__Group_3_2__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2767:1: ( rule__Precedence__Group_3_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==35) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2767:2: rule__Precedence__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_3_2__0_in_rule__Precedence__Group_3__2__Impl5675);
                    rule__Precedence__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrecedenceAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__2__Impl"


    // $ANTLR start "rule__Precedence__Group_3__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2777:1: rule__Precedence__Group_3__3 : rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4 ;
    public final void rule__Precedence__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2781:1: ( rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2782:2: rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__3__Impl_in_rule__Precedence__Group_3__35706);
            rule__Precedence__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__4_in_rule__Precedence__Group_3__35709);
            rule__Precedence__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__3"


    // $ANTLR start "rule__Precedence__Group_3__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2789:1: rule__Precedence__Group_3__3__Impl : ( ( rule__Precedence__Par1Assignment_3_3 ) ) ;
    public final void rule__Precedence__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2793:1: ( ( ( rule__Precedence__Par1Assignment_3_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2794:1: ( ( rule__Precedence__Par1Assignment_3_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2794:1: ( ( rule__Precedence__Par1Assignment_3_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2795:1: ( rule__Precedence__Par1Assignment_3_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_3_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2796:1: ( rule__Precedence__Par1Assignment_3_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2796:2: rule__Precedence__Par1Assignment_3_3
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_3_3_in_rule__Precedence__Group_3__3__Impl5736);
            rule__Precedence__Par1Assignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__3__Impl"


    // $ANTLR start "rule__Precedence__Group_3__4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2806:1: rule__Precedence__Group_3__4 : rule__Precedence__Group_3__4__Impl rule__Precedence__Group_3__5 ;
    public final void rule__Precedence__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2810:1: ( rule__Precedence__Group_3__4__Impl rule__Precedence__Group_3__5 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2811:2: rule__Precedence__Group_3__4__Impl rule__Precedence__Group_3__5
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__4__Impl_in_rule__Precedence__Group_3__45766);
            rule__Precedence__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__5_in_rule__Precedence__Group_3__45769);
            rule__Precedence__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__4"


    // $ANTLR start "rule__Precedence__Group_3__4__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2818:1: rule__Precedence__Group_3__4__Impl : ( ( rule__Precedence__InfixAssignment_3_4 ) ) ;
    public final void rule__Precedence__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2822:1: ( ( ( rule__Precedence__InfixAssignment_3_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2823:1: ( ( rule__Precedence__InfixAssignment_3_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2823:1: ( ( rule__Precedence__InfixAssignment_3_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2824:1: ( rule__Precedence__InfixAssignment_3_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getInfixAssignment_3_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2825:1: ( rule__Precedence__InfixAssignment_3_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2825:2: rule__Precedence__InfixAssignment_3_4
            {
            pushFollow(FOLLOW_rule__Precedence__InfixAssignment_3_4_in_rule__Precedence__Group_3__4__Impl5796);
            rule__Precedence__InfixAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getInfixAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__4__Impl"


    // $ANTLR start "rule__Precedence__Group_3__5"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2835:1: rule__Precedence__Group_3__5 : rule__Precedence__Group_3__5__Impl rule__Precedence__Group_3__6 ;
    public final void rule__Precedence__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2839:1: ( rule__Precedence__Group_3__5__Impl rule__Precedence__Group_3__6 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2840:2: rule__Precedence__Group_3__5__Impl rule__Precedence__Group_3__6
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__5__Impl_in_rule__Precedence__Group_3__55826);
            rule__Precedence__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__6_in_rule__Precedence__Group_3__55829);
            rule__Precedence__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__5"


    // $ANTLR start "rule__Precedence__Group_3__5__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2847:1: rule__Precedence__Group_3__5__Impl : ( ( rule__Precedence__Group_3_5__0 )? ) ;
    public final void rule__Precedence__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2851:1: ( ( ( rule__Precedence__Group_3_5__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2852:1: ( ( rule__Precedence__Group_3_5__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2852:1: ( ( rule__Precedence__Group_3_5__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2853:1: ( rule__Precedence__Group_3_5__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_3_5()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2854:1: ( rule__Precedence__Group_3_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==35) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2854:2: rule__Precedence__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_3_5__0_in_rule__Precedence__Group_3__5__Impl5856);
                    rule__Precedence__Group_3_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrecedenceAccess().getGroup_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__5__Impl"


    // $ANTLR start "rule__Precedence__Group_3__6"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2864:1: rule__Precedence__Group_3__6 : rule__Precedence__Group_3__6__Impl ;
    public final void rule__Precedence__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2868:1: ( rule__Precedence__Group_3__6__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2869:2: rule__Precedence__Group_3__6__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__6__Impl_in_rule__Precedence__Group_3__65887);
            rule__Precedence__Group_3__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__6"


    // $ANTLR start "rule__Precedence__Group_3__6__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2875:1: rule__Precedence__Group_3__6__Impl : ( ( rule__Precedence__Par2Assignment_3_6 ) ) ;
    public final void rule__Precedence__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2879:1: ( ( ( rule__Precedence__Par2Assignment_3_6 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2880:1: ( ( rule__Precedence__Par2Assignment_3_6 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2880:1: ( ( rule__Precedence__Par2Assignment_3_6 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2881:1: ( rule__Precedence__Par2Assignment_3_6 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar2Assignment_3_6()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2882:1: ( rule__Precedence__Par2Assignment_3_6 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2882:2: rule__Precedence__Par2Assignment_3_6
            {
            pushFollow(FOLLOW_rule__Precedence__Par2Assignment_3_6_in_rule__Precedence__Group_3__6__Impl5914);
            rule__Precedence__Par2Assignment_3_6();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar2Assignment_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3__6__Impl"


    // $ANTLR start "rule__Precedence__Group_3_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2906:1: rule__Precedence__Group_3_2__0 : rule__Precedence__Group_3_2__0__Impl rule__Precedence__Group_3_2__1 ;
    public final void rule__Precedence__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2910:1: ( rule__Precedence__Group_3_2__0__Impl rule__Precedence__Group_3_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2911:2: rule__Precedence__Group_3_2__0__Impl rule__Precedence__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3_2__0__Impl_in_rule__Precedence__Group_3_2__05958);
            rule__Precedence__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3_2__1_in_rule__Precedence__Group_3_2__05961);
            rule__Precedence__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3_2__0"


    // $ANTLR start "rule__Precedence__Group_3_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2918:1: rule__Precedence__Group_3_2__0__Impl : ( ( rule__Precedence__Feature1Assignment_3_2_0 ) ) ;
    public final void rule__Precedence__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2922:1: ( ( ( rule__Precedence__Feature1Assignment_3_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2923:1: ( ( rule__Precedence__Feature1Assignment_3_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2923:1: ( ( rule__Precedence__Feature1Assignment_3_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2924:1: ( rule__Precedence__Feature1Assignment_3_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_3_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2925:1: ( rule__Precedence__Feature1Assignment_3_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2925:2: rule__Precedence__Feature1Assignment_3_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_3_2_0_in_rule__Precedence__Group_3_2__0__Impl5988);
            rule__Precedence__Feature1Assignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getFeature1Assignment_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3_2__0__Impl"


    // $ANTLR start "rule__Precedence__Group_3_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2935:1: rule__Precedence__Group_3_2__1 : rule__Precedence__Group_3_2__1__Impl ;
    public final void rule__Precedence__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2939:1: ( rule__Precedence__Group_3_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2940:2: rule__Precedence__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3_2__1__Impl_in_rule__Precedence__Group_3_2__16018);
            rule__Precedence__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3_2__1"


    // $ANTLR start "rule__Precedence__Group_3_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2946:1: rule__Precedence__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2950:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2951:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2951:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2952:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_3_2__1__Impl6046); 
             after(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3_2__1__Impl"


    // $ANTLR start "rule__Precedence__Group_3_5__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2969:1: rule__Precedence__Group_3_5__0 : rule__Precedence__Group_3_5__0__Impl rule__Precedence__Group_3_5__1 ;
    public final void rule__Precedence__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2973:1: ( rule__Precedence__Group_3_5__0__Impl rule__Precedence__Group_3_5__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2974:2: rule__Precedence__Group_3_5__0__Impl rule__Precedence__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3_5__0__Impl_in_rule__Precedence__Group_3_5__06081);
            rule__Precedence__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3_5__1_in_rule__Precedence__Group_3_5__06084);
            rule__Precedence__Group_3_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3_5__0"


    // $ANTLR start "rule__Precedence__Group_3_5__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2981:1: rule__Precedence__Group_3_5__0__Impl : ( ( rule__Precedence__Feature2Assignment_3_5_0 ) ) ;
    public final void rule__Precedence__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2985:1: ( ( ( rule__Precedence__Feature2Assignment_3_5_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2986:1: ( ( rule__Precedence__Feature2Assignment_3_5_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2986:1: ( ( rule__Precedence__Feature2Assignment_3_5_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2987:1: ( rule__Precedence__Feature2Assignment_3_5_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature2Assignment_3_5_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2988:1: ( rule__Precedence__Feature2Assignment_3_5_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2988:2: rule__Precedence__Feature2Assignment_3_5_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature2Assignment_3_5_0_in_rule__Precedence__Group_3_5__0__Impl6111);
            rule__Precedence__Feature2Assignment_3_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getFeature2Assignment_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3_5__0__Impl"


    // $ANTLR start "rule__Precedence__Group_3_5__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2998:1: rule__Precedence__Group_3_5__1 : rule__Precedence__Group_3_5__1__Impl ;
    public final void rule__Precedence__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3002:1: ( rule__Precedence__Group_3_5__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3003:2: rule__Precedence__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3_5__1__Impl_in_rule__Precedence__Group_3_5__16141);
            rule__Precedence__Group_3_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3_5__1"


    // $ANTLR start "rule__Precedence__Group_3_5__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3009:1: rule__Precedence__Group_3_5__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3013:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3014:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3014:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3015:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_5_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_3_5__1__Impl6169); 
             after(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_3_5__1__Impl"


    // $ANTLR start "rule__Precedence__Group_4__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3032:1: rule__Precedence__Group_4__0 : rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1 ;
    public final void rule__Precedence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3036:1: ( rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3037:2: rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__0__Impl_in_rule__Precedence__Group_4__06204);
            rule__Precedence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__1_in_rule__Precedence__Group_4__06207);
            rule__Precedence__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__0"


    // $ANTLR start "rule__Precedence__Group_4__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3044:1: rule__Precedence__Group_4__0__Impl : ( ( rule__Precedence__RuletypAssignment_4_0 ) ) ;
    public final void rule__Precedence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3048:1: ( ( ( rule__Precedence__RuletypAssignment_4_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3049:1: ( ( rule__Precedence__RuletypAssignment_4_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3049:1: ( ( rule__Precedence__RuletypAssignment_4_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3050:1: ( rule__Precedence__RuletypAssignment_4_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_4_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3051:1: ( rule__Precedence__RuletypAssignment_4_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3051:2: rule__Precedence__RuletypAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_4_0_in_rule__Precedence__Group_4__0__Impl6234);
            rule__Precedence__RuletypAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__0__Impl"


    // $ANTLR start "rule__Precedence__Group_4__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3061:1: rule__Precedence__Group_4__1 : rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2 ;
    public final void rule__Precedence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3065:1: ( rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3066:2: rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__1__Impl_in_rule__Precedence__Group_4__16264);
            rule__Precedence__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__2_in_rule__Precedence__Group_4__16267);
            rule__Precedence__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__1"


    // $ANTLR start "rule__Precedence__Group_4__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3073:1: rule__Precedence__Group_4__1__Impl : ( ( rule__Precedence__RuleAssignment_4_1 ) ) ;
    public final void rule__Precedence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3077:1: ( ( ( rule__Precedence__RuleAssignment_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3078:1: ( ( rule__Precedence__RuleAssignment_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3078:1: ( ( rule__Precedence__RuleAssignment_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3079:1: ( rule__Precedence__RuleAssignment_4_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3080:1: ( rule__Precedence__RuleAssignment_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3080:2: rule__Precedence__RuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_4_1_in_rule__Precedence__Group_4__1__Impl6294);
            rule__Precedence__RuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__1__Impl"


    // $ANTLR start "rule__Precedence__Group_4__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3090:1: rule__Precedence__Group_4__2 : rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3 ;
    public final void rule__Precedence__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3094:1: ( rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3095:2: rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__2__Impl_in_rule__Precedence__Group_4__26324);
            rule__Precedence__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__3_in_rule__Precedence__Group_4__26327);
            rule__Precedence__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__2"


    // $ANTLR start "rule__Precedence__Group_4__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3102:1: rule__Precedence__Group_4__2__Impl : ( ( rule__Precedence__Group_4_2__0 )? ) ;
    public final void rule__Precedence__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3106:1: ( ( ( rule__Precedence__Group_4_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3107:1: ( ( rule__Precedence__Group_4_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3107:1: ( ( rule__Precedence__Group_4_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3108:1: ( rule__Precedence__Group_4_2__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_4_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3109:1: ( rule__Precedence__Group_4_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==35) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3109:2: rule__Precedence__Group_4_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_4_2__0_in_rule__Precedence__Group_4__2__Impl6354);
                    rule__Precedence__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrecedenceAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__2__Impl"


    // $ANTLR start "rule__Precedence__Group_4__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3119:1: rule__Precedence__Group_4__3 : rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4 ;
    public final void rule__Precedence__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3123:1: ( rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3124:2: rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__3__Impl_in_rule__Precedence__Group_4__36385);
            rule__Precedence__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__4_in_rule__Precedence__Group_4__36388);
            rule__Precedence__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__3"


    // $ANTLR start "rule__Precedence__Group_4__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3131:1: rule__Precedence__Group_4__3__Impl : ( ( rule__Precedence__Par1Assignment_4_3 ) ) ;
    public final void rule__Precedence__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3135:1: ( ( ( rule__Precedence__Par1Assignment_4_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3136:1: ( ( rule__Precedence__Par1Assignment_4_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3136:1: ( ( rule__Precedence__Par1Assignment_4_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3137:1: ( rule__Precedence__Par1Assignment_4_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_4_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3138:1: ( rule__Precedence__Par1Assignment_4_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3138:2: rule__Precedence__Par1Assignment_4_3
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_4_3_in_rule__Precedence__Group_4__3__Impl6415);
            rule__Precedence__Par1Assignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__3__Impl"


    // $ANTLR start "rule__Precedence__Group_4__4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3148:1: rule__Precedence__Group_4__4 : rule__Precedence__Group_4__4__Impl ;
    public final void rule__Precedence__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3152:1: ( rule__Precedence__Group_4__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3153:2: rule__Precedence__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__4__Impl_in_rule__Precedence__Group_4__46445);
            rule__Precedence__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__4"


    // $ANTLR start "rule__Precedence__Group_4__4__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3159:1: rule__Precedence__Group_4__4__Impl : ( ( ( rule__Precedence__InnerAssignment_4_4 ) ) ( ( rule__Precedence__InnerAssignment_4_4 )* ) ) ;
    public final void rule__Precedence__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3163:1: ( ( ( ( rule__Precedence__InnerAssignment_4_4 ) ) ( ( rule__Precedence__InnerAssignment_4_4 )* ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3164:1: ( ( ( rule__Precedence__InnerAssignment_4_4 ) ) ( ( rule__Precedence__InnerAssignment_4_4 )* ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3164:1: ( ( ( rule__Precedence__InnerAssignment_4_4 ) ) ( ( rule__Precedence__InnerAssignment_4_4 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3165:1: ( ( rule__Precedence__InnerAssignment_4_4 ) ) ( ( rule__Precedence__InnerAssignment_4_4 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3165:1: ( ( rule__Precedence__InnerAssignment_4_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3166:1: ( rule__Precedence__InnerAssignment_4_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getInnerAssignment_4_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3167:1: ( rule__Precedence__InnerAssignment_4_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3167:2: rule__Precedence__InnerAssignment_4_4
            {
            pushFollow(FOLLOW_rule__Precedence__InnerAssignment_4_4_in_rule__Precedence__Group_4__4__Impl6474);
            rule__Precedence__InnerAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getInnerAssignment_4_4()); 

            }

            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3170:1: ( ( rule__Precedence__InnerAssignment_4_4 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3171:1: ( rule__Precedence__InnerAssignment_4_4 )*
            {
             before(grammarAccess.getPrecedenceAccess().getInnerAssignment_4_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3172:1: ( rule__Precedence__InnerAssignment_4_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=50 && LA23_0<=57)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3172:2: rule__Precedence__InnerAssignment_4_4
            	    {
            	    pushFollow(FOLLOW_rule__Precedence__InnerAssignment_4_4_in_rule__Precedence__Group_4__4__Impl6486);
            	    rule__Precedence__InnerAssignment_4_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getPrecedenceAccess().getInnerAssignment_4_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4__4__Impl"


    // $ANTLR start "rule__Precedence__Group_4_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3193:1: rule__Precedence__Group_4_2__0 : rule__Precedence__Group_4_2__0__Impl rule__Precedence__Group_4_2__1 ;
    public final void rule__Precedence__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3197:1: ( rule__Precedence__Group_4_2__0__Impl rule__Precedence__Group_4_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3198:2: rule__Precedence__Group_4_2__0__Impl rule__Precedence__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4_2__0__Impl_in_rule__Precedence__Group_4_2__06529);
            rule__Precedence__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4_2__1_in_rule__Precedence__Group_4_2__06532);
            rule__Precedence__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4_2__0"


    // $ANTLR start "rule__Precedence__Group_4_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3205:1: rule__Precedence__Group_4_2__0__Impl : ( ( rule__Precedence__Feature1Assignment_4_2_0 ) ) ;
    public final void rule__Precedence__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3209:1: ( ( ( rule__Precedence__Feature1Assignment_4_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3210:1: ( ( rule__Precedence__Feature1Assignment_4_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3210:1: ( ( rule__Precedence__Feature1Assignment_4_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3211:1: ( rule__Precedence__Feature1Assignment_4_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_4_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3212:1: ( rule__Precedence__Feature1Assignment_4_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3212:2: rule__Precedence__Feature1Assignment_4_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_4_2_0_in_rule__Precedence__Group_4_2__0__Impl6559);
            rule__Precedence__Feature1Assignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getFeature1Assignment_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4_2__0__Impl"


    // $ANTLR start "rule__Precedence__Group_4_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3222:1: rule__Precedence__Group_4_2__1 : rule__Precedence__Group_4_2__1__Impl ;
    public final void rule__Precedence__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3226:1: ( rule__Precedence__Group_4_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3227:2: rule__Precedence__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4_2__1__Impl_in_rule__Precedence__Group_4_2__16589);
            rule__Precedence__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4_2__1"


    // $ANTLR start "rule__Precedence__Group_4_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3233:1: rule__Precedence__Group_4_2__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3237:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3238:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3238:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3239:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_4_2__1__Impl6617); 
             after(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_4_2__1__Impl"


    // $ANTLR start "rule__Precedence__Group_5__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3256:1: rule__Precedence__Group_5__0 : rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1 ;
    public final void rule__Precedence__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3260:1: ( rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3261:2: rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__0__Impl_in_rule__Precedence__Group_5__06652);
            rule__Precedence__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__1_in_rule__Precedence__Group_5__06655);
            rule__Precedence__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__0"


    // $ANTLR start "rule__Precedence__Group_5__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3268:1: rule__Precedence__Group_5__0__Impl : ( ( rule__Precedence__RuletypAssignment_5_0 ) ) ;
    public final void rule__Precedence__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3272:1: ( ( ( rule__Precedence__RuletypAssignment_5_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3273:1: ( ( rule__Precedence__RuletypAssignment_5_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3273:1: ( ( rule__Precedence__RuletypAssignment_5_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3274:1: ( rule__Precedence__RuletypAssignment_5_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_5_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3275:1: ( rule__Precedence__RuletypAssignment_5_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3275:2: rule__Precedence__RuletypAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_5_0_in_rule__Precedence__Group_5__0__Impl6682);
            rule__Precedence__RuletypAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__0__Impl"


    // $ANTLR start "rule__Precedence__Group_5__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3285:1: rule__Precedence__Group_5__1 : rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2 ;
    public final void rule__Precedence__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3289:1: ( rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3290:2: rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__1__Impl_in_rule__Precedence__Group_5__16712);
            rule__Precedence__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__2_in_rule__Precedence__Group_5__16715);
            rule__Precedence__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__1"


    // $ANTLR start "rule__Precedence__Group_5__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3297:1: rule__Precedence__Group_5__1__Impl : ( ( rule__Precedence__RuleAssignment_5_1 ) ) ;
    public final void rule__Precedence__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3301:1: ( ( ( rule__Precedence__RuleAssignment_5_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3302:1: ( ( rule__Precedence__RuleAssignment_5_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3302:1: ( ( rule__Precedence__RuleAssignment_5_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3303:1: ( rule__Precedence__RuleAssignment_5_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_5_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3304:1: ( rule__Precedence__RuleAssignment_5_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3304:2: rule__Precedence__RuleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_5_1_in_rule__Precedence__Group_5__1__Impl6742);
            rule__Precedence__RuleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__1__Impl"


    // $ANTLR start "rule__Precedence__Group_5__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3314:1: rule__Precedence__Group_5__2 : rule__Precedence__Group_5__2__Impl rule__Precedence__Group_5__3 ;
    public final void rule__Precedence__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3318:1: ( rule__Precedence__Group_5__2__Impl rule__Precedence__Group_5__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3319:2: rule__Precedence__Group_5__2__Impl rule__Precedence__Group_5__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__2__Impl_in_rule__Precedence__Group_5__26772);
            rule__Precedence__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__3_in_rule__Precedence__Group_5__26775);
            rule__Precedence__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__2"


    // $ANTLR start "rule__Precedence__Group_5__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3326:1: rule__Precedence__Group_5__2__Impl : ( ( rule__Precedence__Par1Assignment_5_2 ) ) ;
    public final void rule__Precedence__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3330:1: ( ( ( rule__Precedence__Par1Assignment_5_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3331:1: ( ( rule__Precedence__Par1Assignment_5_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3331:1: ( ( rule__Precedence__Par1Assignment_5_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3332:1: ( rule__Precedence__Par1Assignment_5_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_5_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3333:1: ( rule__Precedence__Par1Assignment_5_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3333:2: rule__Precedence__Par1Assignment_5_2
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_5_2_in_rule__Precedence__Group_5__2__Impl6802);
            rule__Precedence__Par1Assignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__2__Impl"


    // $ANTLR start "rule__Precedence__Group_5__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3343:1: rule__Precedence__Group_5__3 : rule__Precedence__Group_5__3__Impl rule__Precedence__Group_5__4 ;
    public final void rule__Precedence__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3347:1: ( rule__Precedence__Group_5__3__Impl rule__Precedence__Group_5__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3348:2: rule__Precedence__Group_5__3__Impl rule__Precedence__Group_5__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__3__Impl_in_rule__Precedence__Group_5__36832);
            rule__Precedence__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__4_in_rule__Precedence__Group_5__36835);
            rule__Precedence__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__3"


    // $ANTLR start "rule__Precedence__Group_5__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3355:1: rule__Precedence__Group_5__3__Impl : ( ( rule__Precedence__InfixleftAssignment_5_3 ) ) ;
    public final void rule__Precedence__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3359:1: ( ( ( rule__Precedence__InfixleftAssignment_5_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3360:1: ( ( rule__Precedence__InfixleftAssignment_5_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3360:1: ( ( rule__Precedence__InfixleftAssignment_5_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3361:1: ( rule__Precedence__InfixleftAssignment_5_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getInfixleftAssignment_5_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3362:1: ( rule__Precedence__InfixleftAssignment_5_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3362:2: rule__Precedence__InfixleftAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Precedence__InfixleftAssignment_5_3_in_rule__Precedence__Group_5__3__Impl6862);
            rule__Precedence__InfixleftAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getInfixleftAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__3__Impl"


    // $ANTLR start "rule__Precedence__Group_5__4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3372:1: rule__Precedence__Group_5__4 : rule__Precedence__Group_5__4__Impl ;
    public final void rule__Precedence__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3376:1: ( rule__Precedence__Group_5__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3377:2: rule__Precedence__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__4__Impl_in_rule__Precedence__Group_5__46892);
            rule__Precedence__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__4"


    // $ANTLR start "rule__Precedence__Group_5__4__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3383:1: rule__Precedence__Group_5__4__Impl : ( ( rule__Precedence__Par2Assignment_5_4 ) ) ;
    public final void rule__Precedence__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3387:1: ( ( ( rule__Precedence__Par2Assignment_5_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3388:1: ( ( rule__Precedence__Par2Assignment_5_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3388:1: ( ( rule__Precedence__Par2Assignment_5_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3389:1: ( rule__Precedence__Par2Assignment_5_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar2Assignment_5_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3390:1: ( rule__Precedence__Par2Assignment_5_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3390:2: rule__Precedence__Par2Assignment_5_4
            {
            pushFollow(FOLLOW_rule__Precedence__Par2Assignment_5_4_in_rule__Precedence__Group_5__4__Impl6919);
            rule__Precedence__Par2Assignment_5_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar2Assignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_5__4__Impl"


    // $ANTLR start "rule__Precedence__Group_6__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3410:1: rule__Precedence__Group_6__0 : rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1 ;
    public final void rule__Precedence__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3414:1: ( rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3415:2: rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__0__Impl_in_rule__Precedence__Group_6__06959);
            rule__Precedence__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_6__1_in_rule__Precedence__Group_6__06962);
            rule__Precedence__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_6__0"


    // $ANTLR start "rule__Precedence__Group_6__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3422:1: rule__Precedence__Group_6__0__Impl : ( ( rule__Precedence__RuletypAssignment_6_0 ) ) ;
    public final void rule__Precedence__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3426:1: ( ( ( rule__Precedence__RuletypAssignment_6_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3427:1: ( ( rule__Precedence__RuletypAssignment_6_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3427:1: ( ( rule__Precedence__RuletypAssignment_6_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3428:1: ( rule__Precedence__RuletypAssignment_6_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_6_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3429:1: ( rule__Precedence__RuletypAssignment_6_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3429:2: rule__Precedence__RuletypAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_6_0_in_rule__Precedence__Group_6__0__Impl6989);
            rule__Precedence__RuletypAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_6__0__Impl"


    // $ANTLR start "rule__Precedence__Group_6__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3439:1: rule__Precedence__Group_6__1 : rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2 ;
    public final void rule__Precedence__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3443:1: ( rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3444:2: rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__1__Impl_in_rule__Precedence__Group_6__17019);
            rule__Precedence__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_6__2_in_rule__Precedence__Group_6__17022);
            rule__Precedence__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_6__1"


    // $ANTLR start "rule__Precedence__Group_6__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3451:1: rule__Precedence__Group_6__1__Impl : ( ( rule__Precedence__RuleAssignment_6_1 ) ) ;
    public final void rule__Precedence__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3455:1: ( ( ( rule__Precedence__RuleAssignment_6_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3456:1: ( ( rule__Precedence__RuleAssignment_6_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3456:1: ( ( rule__Precedence__RuleAssignment_6_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3457:1: ( rule__Precedence__RuleAssignment_6_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_6_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3458:1: ( rule__Precedence__RuleAssignment_6_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3458:2: rule__Precedence__RuleAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_6_1_in_rule__Precedence__Group_6__1__Impl7049);
            rule__Precedence__RuleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_6__1__Impl"


    // $ANTLR start "rule__Precedence__Group_6__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3468:1: rule__Precedence__Group_6__2 : rule__Precedence__Group_6__2__Impl ;
    public final void rule__Precedence__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3472:1: ( rule__Precedence__Group_6__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3473:2: rule__Precedence__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__2__Impl_in_rule__Precedence__Group_6__27079);
            rule__Precedence__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_6__2"


    // $ANTLR start "rule__Precedence__Group_6__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3479:1: rule__Precedence__Group_6__2__Impl : ( ( rule__Precedence__LiteralAssignment_6_2 ) ) ;
    public final void rule__Precedence__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3483:1: ( ( ( rule__Precedence__LiteralAssignment_6_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3484:1: ( ( rule__Precedence__LiteralAssignment_6_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3484:1: ( ( rule__Precedence__LiteralAssignment_6_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3485:1: ( rule__Precedence__LiteralAssignment_6_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getLiteralAssignment_6_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3486:1: ( rule__Precedence__LiteralAssignment_6_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3486:2: rule__Precedence__LiteralAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Precedence__LiteralAssignment_6_2_in_rule__Precedence__Group_6__2__Impl7106);
            rule__Precedence__LiteralAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getLiteralAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_6__2__Impl"


    // $ANTLR start "rule__Precedence__Group_7__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3502:1: rule__Precedence__Group_7__0 : rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1 ;
    public final void rule__Precedence__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3506:1: ( rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3507:2: rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__0__Impl_in_rule__Precedence__Group_7__07142);
            rule__Precedence__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_7__1_in_rule__Precedence__Group_7__07145);
            rule__Precedence__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_7__0"


    // $ANTLR start "rule__Precedence__Group_7__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3514:1: rule__Precedence__Group_7__0__Impl : ( ( rule__Precedence__RuletypAssignment_7_0 ) ) ;
    public final void rule__Precedence__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3518:1: ( ( ( rule__Precedence__RuletypAssignment_7_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3519:1: ( ( rule__Precedence__RuletypAssignment_7_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3519:1: ( ( rule__Precedence__RuletypAssignment_7_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3520:1: ( rule__Precedence__RuletypAssignment_7_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_7_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3521:1: ( rule__Precedence__RuletypAssignment_7_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3521:2: rule__Precedence__RuletypAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_7_0_in_rule__Precedence__Group_7__0__Impl7172);
            rule__Precedence__RuletypAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_7__0__Impl"


    // $ANTLR start "rule__Precedence__Group_7__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3531:1: rule__Precedence__Group_7__1 : rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2 ;
    public final void rule__Precedence__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3535:1: ( rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3536:2: rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__1__Impl_in_rule__Precedence__Group_7__17202);
            rule__Precedence__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_7__2_in_rule__Precedence__Group_7__17205);
            rule__Precedence__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_7__1"


    // $ANTLR start "rule__Precedence__Group_7__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3543:1: rule__Precedence__Group_7__1__Impl : ( ( rule__Precedence__RuleAssignment_7_1 ) ) ;
    public final void rule__Precedence__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3547:1: ( ( ( rule__Precedence__RuleAssignment_7_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3548:1: ( ( rule__Precedence__RuleAssignment_7_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3548:1: ( ( rule__Precedence__RuleAssignment_7_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3549:1: ( rule__Precedence__RuleAssignment_7_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_7_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3550:1: ( rule__Precedence__RuleAssignment_7_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3550:2: rule__Precedence__RuleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_7_1_in_rule__Precedence__Group_7__1__Impl7232);
            rule__Precedence__RuleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_7__1__Impl"


    // $ANTLR start "rule__Precedence__Group_7__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3560:1: rule__Precedence__Group_7__2 : rule__Precedence__Group_7__2__Impl ;
    public final void rule__Precedence__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3564:1: ( rule__Precedence__Group_7__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3565:2: rule__Precedence__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__2__Impl_in_rule__Precedence__Group_7__27262);
            rule__Precedence__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_7__2"


    // $ANTLR start "rule__Precedence__Group_7__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3571:1: rule__Precedence__Group_7__2__Impl : ( ( rule__Precedence__BracketAssignment_7_2 ) ) ;
    public final void rule__Precedence__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3575:1: ( ( ( rule__Precedence__BracketAssignment_7_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3576:1: ( ( rule__Precedence__BracketAssignment_7_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3576:1: ( ( rule__Precedence__BracketAssignment_7_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3577:1: ( rule__Precedence__BracketAssignment_7_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getBracketAssignment_7_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3578:1: ( rule__Precedence__BracketAssignment_7_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3578:2: rule__Precedence__BracketAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Precedence__BracketAssignment_7_2_in_rule__Precedence__Group_7__2__Impl7289);
            rule__Precedence__BracketAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getBracketAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_7__2__Impl"


    // $ANTLR start "rule__Precedence__Group_8__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3594:1: rule__Precedence__Group_8__0 : rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1 ;
    public final void rule__Precedence__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3598:1: ( rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3599:2: rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__0__Impl_in_rule__Precedence__Group_8__07325);
            rule__Precedence__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_8__1_in_rule__Precedence__Group_8__07328);
            rule__Precedence__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_8__0"


    // $ANTLR start "rule__Precedence__Group_8__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3606:1: rule__Precedence__Group_8__0__Impl : ( ( rule__Precedence__RuletypAssignment_8_0 ) ) ;
    public final void rule__Precedence__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3610:1: ( ( ( rule__Precedence__RuletypAssignment_8_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3611:1: ( ( rule__Precedence__RuletypAssignment_8_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3611:1: ( ( rule__Precedence__RuletypAssignment_8_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3612:1: ( rule__Precedence__RuletypAssignment_8_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_8_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3613:1: ( rule__Precedence__RuletypAssignment_8_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3613:2: rule__Precedence__RuletypAssignment_8_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_8_0_in_rule__Precedence__Group_8__0__Impl7355);
            rule__Precedence__RuletypAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_8__0__Impl"


    // $ANTLR start "rule__Precedence__Group_8__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3623:1: rule__Precedence__Group_8__1 : rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2 ;
    public final void rule__Precedence__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3627:1: ( rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3628:2: rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__1__Impl_in_rule__Precedence__Group_8__17385);
            rule__Precedence__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_8__2_in_rule__Precedence__Group_8__17388);
            rule__Precedence__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_8__1"


    // $ANTLR start "rule__Precedence__Group_8__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3635:1: rule__Precedence__Group_8__1__Impl : ( ( rule__Precedence__RuleAssignment_8_1 ) ) ;
    public final void rule__Precedence__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3639:1: ( ( ( rule__Precedence__RuleAssignment_8_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3640:1: ( ( rule__Precedence__RuleAssignment_8_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3640:1: ( ( rule__Precedence__RuleAssignment_8_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3641:1: ( rule__Precedence__RuleAssignment_8_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_8_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3642:1: ( rule__Precedence__RuleAssignment_8_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3642:2: rule__Precedence__RuleAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_8_1_in_rule__Precedence__Group_8__1__Impl7415);
            rule__Precedence__RuleAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_8__1__Impl"


    // $ANTLR start "rule__Precedence__Group_8__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3652:1: rule__Precedence__Group_8__2 : rule__Precedence__Group_8__2__Impl ;
    public final void rule__Precedence__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3656:1: ( rule__Precedence__Group_8__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3657:2: rule__Precedence__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__2__Impl_in_rule__Precedence__Group_8__27445);
            rule__Precedence__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_8__2"


    // $ANTLR start "rule__Precedence__Group_8__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3663:1: rule__Precedence__Group_8__2__Impl : ( ( rule__Precedence__BracesAssignment_8_2 ) ) ;
    public final void rule__Precedence__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3667:1: ( ( ( rule__Precedence__BracesAssignment_8_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3668:1: ( ( rule__Precedence__BracesAssignment_8_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3668:1: ( ( rule__Precedence__BracesAssignment_8_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3669:1: ( rule__Precedence__BracesAssignment_8_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getBracesAssignment_8_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3670:1: ( rule__Precedence__BracesAssignment_8_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3670:2: rule__Precedence__BracesAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Precedence__BracesAssignment_8_2_in_rule__Precedence__Group_8__2__Impl7472);
            rule__Precedence__BracesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getBracesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_8__2__Impl"


    // $ANTLR start "rule__Precedence__Group_9__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3686:1: rule__Precedence__Group_9__0 : rule__Precedence__Group_9__0__Impl rule__Precedence__Group_9__1 ;
    public final void rule__Precedence__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3690:1: ( rule__Precedence__Group_9__0__Impl rule__Precedence__Group_9__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3691:2: rule__Precedence__Group_9__0__Impl rule__Precedence__Group_9__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_9__0__Impl_in_rule__Precedence__Group_9__07508);
            rule__Precedence__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_9__1_in_rule__Precedence__Group_9__07511);
            rule__Precedence__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_9__0"


    // $ANTLR start "rule__Precedence__Group_9__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3698:1: rule__Precedence__Group_9__0__Impl : ( ( rule__Precedence__RuletypAssignment_9_0 ) ) ;
    public final void rule__Precedence__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3702:1: ( ( ( rule__Precedence__RuletypAssignment_9_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3703:1: ( ( rule__Precedence__RuletypAssignment_9_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3703:1: ( ( rule__Precedence__RuletypAssignment_9_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3704:1: ( rule__Precedence__RuletypAssignment_9_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_9_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3705:1: ( rule__Precedence__RuletypAssignment_9_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3705:2: rule__Precedence__RuletypAssignment_9_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_9_0_in_rule__Precedence__Group_9__0__Impl7538);
            rule__Precedence__RuletypAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_9__0__Impl"


    // $ANTLR start "rule__Precedence__Group_9__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3715:1: rule__Precedence__Group_9__1 : rule__Precedence__Group_9__1__Impl rule__Precedence__Group_9__2 ;
    public final void rule__Precedence__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3719:1: ( rule__Precedence__Group_9__1__Impl rule__Precedence__Group_9__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3720:2: rule__Precedence__Group_9__1__Impl rule__Precedence__Group_9__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_9__1__Impl_in_rule__Precedence__Group_9__17568);
            rule__Precedence__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_9__2_in_rule__Precedence__Group_9__17571);
            rule__Precedence__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_9__1"


    // $ANTLR start "rule__Precedence__Group_9__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3727:1: rule__Precedence__Group_9__1__Impl : ( ( rule__Precedence__RuleAssignment_9_1 ) ) ;
    public final void rule__Precedence__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3731:1: ( ( ( rule__Precedence__RuleAssignment_9_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3732:1: ( ( rule__Precedence__RuleAssignment_9_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3732:1: ( ( rule__Precedence__RuleAssignment_9_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3733:1: ( rule__Precedence__RuleAssignment_9_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_9_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3734:1: ( rule__Precedence__RuleAssignment_9_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3734:2: rule__Precedence__RuleAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_9_1_in_rule__Precedence__Group_9__1__Impl7598);
            rule__Precedence__RuleAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_9__1__Impl"


    // $ANTLR start "rule__Precedence__Group_9__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3744:1: rule__Precedence__Group_9__2 : rule__Precedence__Group_9__2__Impl ;
    public final void rule__Precedence__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3748:1: ( rule__Precedence__Group_9__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3749:2: rule__Precedence__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_9__2__Impl_in_rule__Precedence__Group_9__27628);
            rule__Precedence__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_9__2"


    // $ANTLR start "rule__Precedence__Group_9__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3755:1: rule__Precedence__Group_9__2__Impl : ( ( rule__Precedence__ParenthesisAssignment_9_2 ) ) ;
    public final void rule__Precedence__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3759:1: ( ( ( rule__Precedence__ParenthesisAssignment_9_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3760:1: ( ( rule__Precedence__ParenthesisAssignment_9_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3760:1: ( ( rule__Precedence__ParenthesisAssignment_9_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3761:1: ( rule__Precedence__ParenthesisAssignment_9_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getParenthesisAssignment_9_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3762:1: ( rule__Precedence__ParenthesisAssignment_9_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3762:2: rule__Precedence__ParenthesisAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Precedence__ParenthesisAssignment_9_2_in_rule__Precedence__Group_9__2__Impl7655);
            rule__Precedence__ParenthesisAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getParenthesisAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_9__2__Impl"


    // $ANTLR start "rule__Precedence__Group_10__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3778:1: rule__Precedence__Group_10__0 : rule__Precedence__Group_10__0__Impl rule__Precedence__Group_10__1 ;
    public final void rule__Precedence__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3782:1: ( rule__Precedence__Group_10__0__Impl rule__Precedence__Group_10__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3783:2: rule__Precedence__Group_10__0__Impl rule__Precedence__Group_10__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_10__0__Impl_in_rule__Precedence__Group_10__07691);
            rule__Precedence__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_10__1_in_rule__Precedence__Group_10__07694);
            rule__Precedence__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_10__0"


    // $ANTLR start "rule__Precedence__Group_10__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3790:1: rule__Precedence__Group_10__0__Impl : ( ( rule__Precedence__RuletypAssignment_10_0 ) ) ;
    public final void rule__Precedence__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3794:1: ( ( ( rule__Precedence__RuletypAssignment_10_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3795:1: ( ( rule__Precedence__RuletypAssignment_10_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3795:1: ( ( rule__Precedence__RuletypAssignment_10_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3796:1: ( rule__Precedence__RuletypAssignment_10_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_10_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3797:1: ( rule__Precedence__RuletypAssignment_10_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3797:2: rule__Precedence__RuletypAssignment_10_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_10_0_in_rule__Precedence__Group_10__0__Impl7721);
            rule__Precedence__RuletypAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuletypAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_10__0__Impl"


    // $ANTLR start "rule__Precedence__Group_10__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3807:1: rule__Precedence__Group_10__1 : rule__Precedence__Group_10__1__Impl rule__Precedence__Group_10__2 ;
    public final void rule__Precedence__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3811:1: ( rule__Precedence__Group_10__1__Impl rule__Precedence__Group_10__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3812:2: rule__Precedence__Group_10__1__Impl rule__Precedence__Group_10__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_10__1__Impl_in_rule__Precedence__Group_10__17751);
            rule__Precedence__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_10__2_in_rule__Precedence__Group_10__17754);
            rule__Precedence__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_10__1"


    // $ANTLR start "rule__Precedence__Group_10__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3819:1: rule__Precedence__Group_10__1__Impl : ( ( rule__Precedence__RuleAssignment_10_1 ) ) ;
    public final void rule__Precedence__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3823:1: ( ( ( rule__Precedence__RuleAssignment_10_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3824:1: ( ( rule__Precedence__RuleAssignment_10_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3824:1: ( ( rule__Precedence__RuleAssignment_10_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3825:1: ( rule__Precedence__RuleAssignment_10_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_10_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3826:1: ( rule__Precedence__RuleAssignment_10_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3826:2: rule__Precedence__RuleAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_10_1_in_rule__Precedence__Group_10__1__Impl7781);
            rule__Precedence__RuleAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getRuleAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_10__1__Impl"


    // $ANTLR start "rule__Precedence__Group_10__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3836:1: rule__Precedence__Group_10__2 : rule__Precedence__Group_10__2__Impl ;
    public final void rule__Precedence__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3840:1: ( rule__Precedence__Group_10__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3841:2: rule__Precedence__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_10__2__Impl_in_rule__Precedence__Group_10__27811);
            rule__Precedence__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_10__2"


    // $ANTLR start "rule__Precedence__Group_10__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3847:1: rule__Precedence__Group_10__2__Impl : ( ( rule__Precedence__AngleAssignment_10_2 ) ) ;
    public final void rule__Precedence__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3851:1: ( ( ( rule__Precedence__AngleAssignment_10_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3852:1: ( ( rule__Precedence__AngleAssignment_10_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3852:1: ( ( rule__Precedence__AngleAssignment_10_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3853:1: ( rule__Precedence__AngleAssignment_10_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getAngleAssignment_10_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3854:1: ( rule__Precedence__AngleAssignment_10_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3854:2: rule__Precedence__AngleAssignment_10_2
            {
            pushFollow(FOLLOW_rule__Precedence__AngleAssignment_10_2_in_rule__Precedence__Group_10__2__Impl7838);
            rule__Precedence__AngleAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getAngleAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Group_10__2__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_0__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3870:1: rule__InnerPrecedence__Group_0__0 : rule__InnerPrecedence__Group_0__0__Impl rule__InnerPrecedence__Group_0__1 ;
    public final void rule__InnerPrecedence__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3874:1: ( rule__InnerPrecedence__Group_0__0__Impl rule__InnerPrecedence__Group_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3875:2: rule__InnerPrecedence__Group_0__0__Impl rule__InnerPrecedence__Group_0__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0__0__Impl_in_rule__InnerPrecedence__Group_0__07874);
            rule__InnerPrecedence__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0__1_in_rule__InnerPrecedence__Group_0__07877);
            rule__InnerPrecedence__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0__0"


    // $ANTLR start "rule__InnerPrecedence__Group_0__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3882:1: rule__InnerPrecedence__Group_0__0__Impl : ( ( rule__InnerPrecedence__RuletypAssignment_0_0 ) ) ;
    public final void rule__InnerPrecedence__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3886:1: ( ( ( rule__InnerPrecedence__RuletypAssignment_0_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3887:1: ( ( rule__InnerPrecedence__RuletypAssignment_0_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3887:1: ( ( rule__InnerPrecedence__RuletypAssignment_0_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3888:1: ( rule__InnerPrecedence__RuletypAssignment_0_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3889:1: ( rule__InnerPrecedence__RuletypAssignment_0_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3889:2: rule__InnerPrecedence__RuletypAssignment_0_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuletypAssignment_0_0_in_rule__InnerPrecedence__Group_0__0__Impl7904);
            rule__InnerPrecedence__RuletypAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_0__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3899:1: rule__InnerPrecedence__Group_0__1 : rule__InnerPrecedence__Group_0__1__Impl rule__InnerPrecedence__Group_0__2 ;
    public final void rule__InnerPrecedence__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3903:1: ( rule__InnerPrecedence__Group_0__1__Impl rule__InnerPrecedence__Group_0__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3904:2: rule__InnerPrecedence__Group_0__1__Impl rule__InnerPrecedence__Group_0__2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0__1__Impl_in_rule__InnerPrecedence__Group_0__17934);
            rule__InnerPrecedence__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0__2_in_rule__InnerPrecedence__Group_0__17937);
            rule__InnerPrecedence__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0__1"


    // $ANTLR start "rule__InnerPrecedence__Group_0__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3911:1: rule__InnerPrecedence__Group_0__1__Impl : ( ( rule__InnerPrecedence__PrefixAssignment_0_1 ) ) ;
    public final void rule__InnerPrecedence__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3915:1: ( ( ( rule__InnerPrecedence__PrefixAssignment_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3916:1: ( ( rule__InnerPrecedence__PrefixAssignment_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3916:1: ( ( rule__InnerPrecedence__PrefixAssignment_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3917:1: ( rule__InnerPrecedence__PrefixAssignment_0_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getPrefixAssignment_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3918:1: ( rule__InnerPrecedence__PrefixAssignment_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3918:2: rule__InnerPrecedence__PrefixAssignment_0_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__PrefixAssignment_0_1_in_rule__InnerPrecedence__Group_0__1__Impl7964);
            rule__InnerPrecedence__PrefixAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getPrefixAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_0__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3928:1: rule__InnerPrecedence__Group_0__2 : rule__InnerPrecedence__Group_0__2__Impl rule__InnerPrecedence__Group_0__3 ;
    public final void rule__InnerPrecedence__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3932:1: ( rule__InnerPrecedence__Group_0__2__Impl rule__InnerPrecedence__Group_0__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3933:2: rule__InnerPrecedence__Group_0__2__Impl rule__InnerPrecedence__Group_0__3
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0__2__Impl_in_rule__InnerPrecedence__Group_0__27994);
            rule__InnerPrecedence__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0__3_in_rule__InnerPrecedence__Group_0__27997);
            rule__InnerPrecedence__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0__2"


    // $ANTLR start "rule__InnerPrecedence__Group_0__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3940:1: rule__InnerPrecedence__Group_0__2__Impl : ( ( rule__InnerPrecedence__Group_0_2__0 )? ) ;
    public final void rule__InnerPrecedence__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3944:1: ( ( ( rule__InnerPrecedence__Group_0_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3945:1: ( ( rule__InnerPrecedence__Group_0_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3945:1: ( ( rule__InnerPrecedence__Group_0_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3946:1: ( rule__InnerPrecedence__Group_0_2__0 )?
            {
             before(grammarAccess.getInnerPrecedenceAccess().getGroup_0_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3947:1: ( rule__InnerPrecedence__Group_0_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==35) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3947:2: rule__InnerPrecedence__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_0_2__0_in_rule__InnerPrecedence__Group_0__2__Impl8024);
                    rule__InnerPrecedence__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerPrecedenceAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0__2__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_0__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3957:1: rule__InnerPrecedence__Group_0__3 : rule__InnerPrecedence__Group_0__3__Impl ;
    public final void rule__InnerPrecedence__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3961:1: ( rule__InnerPrecedence__Group_0__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3962:2: rule__InnerPrecedence__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0__3__Impl_in_rule__InnerPrecedence__Group_0__38055);
            rule__InnerPrecedence__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0__3"


    // $ANTLR start "rule__InnerPrecedence__Group_0__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3968:1: rule__InnerPrecedence__Group_0__3__Impl : ( ( rule__InnerPrecedence__Par2Assignment_0_3 ) ) ;
    public final void rule__InnerPrecedence__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3972:1: ( ( ( rule__InnerPrecedence__Par2Assignment_0_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3973:1: ( ( rule__InnerPrecedence__Par2Assignment_0_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3973:1: ( ( rule__InnerPrecedence__Par2Assignment_0_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3974:1: ( rule__InnerPrecedence__Par2Assignment_0_3 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getPar2Assignment_0_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3975:1: ( rule__InnerPrecedence__Par2Assignment_0_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3975:2: rule__InnerPrecedence__Par2Assignment_0_3
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Par2Assignment_0_3_in_rule__InnerPrecedence__Group_0__3__Impl8082);
            rule__InnerPrecedence__Par2Assignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getPar2Assignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0__3__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_0_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3993:1: rule__InnerPrecedence__Group_0_2__0 : rule__InnerPrecedence__Group_0_2__0__Impl rule__InnerPrecedence__Group_0_2__1 ;
    public final void rule__InnerPrecedence__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3997:1: ( rule__InnerPrecedence__Group_0_2__0__Impl rule__InnerPrecedence__Group_0_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3998:2: rule__InnerPrecedence__Group_0_2__0__Impl rule__InnerPrecedence__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0_2__0__Impl_in_rule__InnerPrecedence__Group_0_2__08120);
            rule__InnerPrecedence__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0_2__1_in_rule__InnerPrecedence__Group_0_2__08123);
            rule__InnerPrecedence__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0_2__0"


    // $ANTLR start "rule__InnerPrecedence__Group_0_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4005:1: rule__InnerPrecedence__Group_0_2__0__Impl : ( ( rule__InnerPrecedence__Feature1Assignment_0_2_0 ) ) ;
    public final void rule__InnerPrecedence__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4009:1: ( ( ( rule__InnerPrecedence__Feature1Assignment_0_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4010:1: ( ( rule__InnerPrecedence__Feature1Assignment_0_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4010:1: ( ( rule__InnerPrecedence__Feature1Assignment_0_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4011:1: ( rule__InnerPrecedence__Feature1Assignment_0_2_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getFeature1Assignment_0_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4012:1: ( rule__InnerPrecedence__Feature1Assignment_0_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4012:2: rule__InnerPrecedence__Feature1Assignment_0_2_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Feature1Assignment_0_2_0_in_rule__InnerPrecedence__Group_0_2__0__Impl8150);
            rule__InnerPrecedence__Feature1Assignment_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getFeature1Assignment_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0_2__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_0_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4022:1: rule__InnerPrecedence__Group_0_2__1 : rule__InnerPrecedence__Group_0_2__1__Impl ;
    public final void rule__InnerPrecedence__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4026:1: ( rule__InnerPrecedence__Group_0_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4027:2: rule__InnerPrecedence__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_0_2__1__Impl_in_rule__InnerPrecedence__Group_0_2__18180);
            rule__InnerPrecedence__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0_2__1"


    // $ANTLR start "rule__InnerPrecedence__Group_0_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4033:1: rule__InnerPrecedence__Group_0_2__1__Impl : ( '=' ) ;
    public final void rule__InnerPrecedence__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4037:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4038:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4038:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4039:1: '='
            {
             before(grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_0_2_1()); 
            match(input,35,FOLLOW_35_in_rule__InnerPrecedence__Group_0_2__1__Impl8208); 
             after(grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_0_2__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4056:1: rule__InnerPrecedence__Group_1__0 : rule__InnerPrecedence__Group_1__0__Impl rule__InnerPrecedence__Group_1__1 ;
    public final void rule__InnerPrecedence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4060:1: ( rule__InnerPrecedence__Group_1__0__Impl rule__InnerPrecedence__Group_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4061:2: rule__InnerPrecedence__Group_1__0__Impl rule__InnerPrecedence__Group_1__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_1__0__Impl_in_rule__InnerPrecedence__Group_1__08243);
            rule__InnerPrecedence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_1__1_in_rule__InnerPrecedence__Group_1__08246);
            rule__InnerPrecedence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_1__0"


    // $ANTLR start "rule__InnerPrecedence__Group_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4068:1: rule__InnerPrecedence__Group_1__0__Impl : ( ( rule__InnerPrecedence__RuletypAssignment_1_0 ) ) ;
    public final void rule__InnerPrecedence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4072:1: ( ( ( rule__InnerPrecedence__RuletypAssignment_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4073:1: ( ( rule__InnerPrecedence__RuletypAssignment_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4073:1: ( ( rule__InnerPrecedence__RuletypAssignment_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4074:1: ( rule__InnerPrecedence__RuletypAssignment_1_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4075:1: ( rule__InnerPrecedence__RuletypAssignment_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4075:2: rule__InnerPrecedence__RuletypAssignment_1_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuletypAssignment_1_0_in_rule__InnerPrecedence__Group_1__0__Impl8273);
            rule__InnerPrecedence__RuletypAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_1__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4085:1: rule__InnerPrecedence__Group_1__1 : rule__InnerPrecedence__Group_1__1__Impl ;
    public final void rule__InnerPrecedence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4089:1: ( rule__InnerPrecedence__Group_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4090:2: rule__InnerPrecedence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_1__1__Impl_in_rule__InnerPrecedence__Group_1__18303);
            rule__InnerPrecedence__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_1__1"


    // $ANTLR start "rule__InnerPrecedence__Group_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4096:1: rule__InnerPrecedence__Group_1__1__Impl : ( ( rule__InnerPrecedence__SuffixAssignment_1_1 ) ) ;
    public final void rule__InnerPrecedence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4100:1: ( ( ( rule__InnerPrecedence__SuffixAssignment_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4101:1: ( ( rule__InnerPrecedence__SuffixAssignment_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4101:1: ( ( rule__InnerPrecedence__SuffixAssignment_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4102:1: ( rule__InnerPrecedence__SuffixAssignment_1_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getSuffixAssignment_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4103:1: ( rule__InnerPrecedence__SuffixAssignment_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4103:2: rule__InnerPrecedence__SuffixAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__SuffixAssignment_1_1_in_rule__InnerPrecedence__Group_1__1__Impl8330);
            rule__InnerPrecedence__SuffixAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getSuffixAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_1__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4117:1: rule__InnerPrecedence__Group_2__0 : rule__InnerPrecedence__Group_2__0__Impl rule__InnerPrecedence__Group_2__1 ;
    public final void rule__InnerPrecedence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4121:1: ( rule__InnerPrecedence__Group_2__0__Impl rule__InnerPrecedence__Group_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4122:2: rule__InnerPrecedence__Group_2__0__Impl rule__InnerPrecedence__Group_2__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__0__Impl_in_rule__InnerPrecedence__Group_2__08364);
            rule__InnerPrecedence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__1_in_rule__InnerPrecedence__Group_2__08367);
            rule__InnerPrecedence__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__0"


    // $ANTLR start "rule__InnerPrecedence__Group_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4129:1: rule__InnerPrecedence__Group_2__0__Impl : ( ( rule__InnerPrecedence__RuletypAssignment_2_0 ) ) ;
    public final void rule__InnerPrecedence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4133:1: ( ( ( rule__InnerPrecedence__RuletypAssignment_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4134:1: ( ( rule__InnerPrecedence__RuletypAssignment_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4134:1: ( ( rule__InnerPrecedence__RuletypAssignment_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4135:1: ( rule__InnerPrecedence__RuletypAssignment_2_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4136:1: ( rule__InnerPrecedence__RuletypAssignment_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4136:2: rule__InnerPrecedence__RuletypAssignment_2_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuletypAssignment_2_0_in_rule__InnerPrecedence__Group_2__0__Impl8394);
            rule__InnerPrecedence__RuletypAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4146:1: rule__InnerPrecedence__Group_2__1 : rule__InnerPrecedence__Group_2__1__Impl rule__InnerPrecedence__Group_2__2 ;
    public final void rule__InnerPrecedence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4150:1: ( rule__InnerPrecedence__Group_2__1__Impl rule__InnerPrecedence__Group_2__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4151:2: rule__InnerPrecedence__Group_2__1__Impl rule__InnerPrecedence__Group_2__2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__1__Impl_in_rule__InnerPrecedence__Group_2__18424);
            rule__InnerPrecedence__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__2_in_rule__InnerPrecedence__Group_2__18427);
            rule__InnerPrecedence__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__1"


    // $ANTLR start "rule__InnerPrecedence__Group_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4158:1: rule__InnerPrecedence__Group_2__1__Impl : ( ( rule__InnerPrecedence__Group_2_1__0 )? ) ;
    public final void rule__InnerPrecedence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4162:1: ( ( ( rule__InnerPrecedence__Group_2_1__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4163:1: ( ( rule__InnerPrecedence__Group_2_1__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4163:1: ( ( rule__InnerPrecedence__Group_2_1__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4164:1: ( rule__InnerPrecedence__Group_2_1__0 )?
            {
             before(grammarAccess.getInnerPrecedenceAccess().getGroup_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4165:1: ( rule__InnerPrecedence__Group_2_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4165:2: rule__InnerPrecedence__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1__0_in_rule__InnerPrecedence__Group_2__1__Impl8454);
                    rule__InnerPrecedence__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerPrecedenceAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4175:1: rule__InnerPrecedence__Group_2__2 : rule__InnerPrecedence__Group_2__2__Impl rule__InnerPrecedence__Group_2__3 ;
    public final void rule__InnerPrecedence__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4179:1: ( rule__InnerPrecedence__Group_2__2__Impl rule__InnerPrecedence__Group_2__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4180:2: rule__InnerPrecedence__Group_2__2__Impl rule__InnerPrecedence__Group_2__3
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__2__Impl_in_rule__InnerPrecedence__Group_2__28485);
            rule__InnerPrecedence__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__3_in_rule__InnerPrecedence__Group_2__28488);
            rule__InnerPrecedence__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__2"


    // $ANTLR start "rule__InnerPrecedence__Group_2__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4187:1: rule__InnerPrecedence__Group_2__2__Impl : ( ( rule__InnerPrecedence__InfixAssignment_2_2 ) ) ;
    public final void rule__InnerPrecedence__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4191:1: ( ( ( rule__InnerPrecedence__InfixAssignment_2_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4192:1: ( ( rule__InnerPrecedence__InfixAssignment_2_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4192:1: ( ( rule__InnerPrecedence__InfixAssignment_2_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4193:1: ( rule__InnerPrecedence__InfixAssignment_2_2 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getInfixAssignment_2_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4194:1: ( rule__InnerPrecedence__InfixAssignment_2_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4194:2: rule__InnerPrecedence__InfixAssignment_2_2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__InfixAssignment_2_2_in_rule__InnerPrecedence__Group_2__2__Impl8515);
            rule__InnerPrecedence__InfixAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getInfixAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__2__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4204:1: rule__InnerPrecedence__Group_2__3 : rule__InnerPrecedence__Group_2__3__Impl rule__InnerPrecedence__Group_2__4 ;
    public final void rule__InnerPrecedence__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4208:1: ( rule__InnerPrecedence__Group_2__3__Impl rule__InnerPrecedence__Group_2__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4209:2: rule__InnerPrecedence__Group_2__3__Impl rule__InnerPrecedence__Group_2__4
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__3__Impl_in_rule__InnerPrecedence__Group_2__38545);
            rule__InnerPrecedence__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__4_in_rule__InnerPrecedence__Group_2__38548);
            rule__InnerPrecedence__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__3"


    // $ANTLR start "rule__InnerPrecedence__Group_2__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4216:1: rule__InnerPrecedence__Group_2__3__Impl : ( ( rule__InnerPrecedence__Group_2_3__0 )? ) ;
    public final void rule__InnerPrecedence__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4220:1: ( ( ( rule__InnerPrecedence__Group_2_3__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4221:1: ( ( rule__InnerPrecedence__Group_2_3__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4221:1: ( ( rule__InnerPrecedence__Group_2_3__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4222:1: ( rule__InnerPrecedence__Group_2_3__0 )?
            {
             before(grammarAccess.getInnerPrecedenceAccess().getGroup_2_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4223:1: ( rule__InnerPrecedence__Group_2_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==35) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4223:2: rule__InnerPrecedence__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_3__0_in_rule__InnerPrecedence__Group_2__3__Impl8575);
                    rule__InnerPrecedence__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerPrecedenceAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__3__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2__4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4233:1: rule__InnerPrecedence__Group_2__4 : rule__InnerPrecedence__Group_2__4__Impl ;
    public final void rule__InnerPrecedence__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4237:1: ( rule__InnerPrecedence__Group_2__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4238:2: rule__InnerPrecedence__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2__4__Impl_in_rule__InnerPrecedence__Group_2__48606);
            rule__InnerPrecedence__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__4"


    // $ANTLR start "rule__InnerPrecedence__Group_2__4__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4244:1: rule__InnerPrecedence__Group_2__4__Impl : ( ( rule__InnerPrecedence__Par2Assignment_2_4 ) ) ;
    public final void rule__InnerPrecedence__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4248:1: ( ( ( rule__InnerPrecedence__Par2Assignment_2_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4249:1: ( ( rule__InnerPrecedence__Par2Assignment_2_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4249:1: ( ( rule__InnerPrecedence__Par2Assignment_2_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4250:1: ( rule__InnerPrecedence__Par2Assignment_2_4 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getPar2Assignment_2_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4251:1: ( rule__InnerPrecedence__Par2Assignment_2_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4251:2: rule__InnerPrecedence__Par2Assignment_2_4
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Par2Assignment_2_4_in_rule__InnerPrecedence__Group_2__4__Impl8633);
            rule__InnerPrecedence__Par2Assignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getPar2Assignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2__4__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4271:1: rule__InnerPrecedence__Group_2_1__0 : rule__InnerPrecedence__Group_2_1__0__Impl rule__InnerPrecedence__Group_2_1__1 ;
    public final void rule__InnerPrecedence__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4275:1: ( rule__InnerPrecedence__Group_2_1__0__Impl rule__InnerPrecedence__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4276:2: rule__InnerPrecedence__Group_2_1__0__Impl rule__InnerPrecedence__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1__0__Impl_in_rule__InnerPrecedence__Group_2_1__08673);
            rule__InnerPrecedence__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1__1_in_rule__InnerPrecedence__Group_2_1__08676);
            rule__InnerPrecedence__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1__0"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4283:1: rule__InnerPrecedence__Group_2_1__0__Impl : ( ( rule__InnerPrecedence__ModAssignment_2_1_0 ) ) ;
    public final void rule__InnerPrecedence__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4287:1: ( ( ( rule__InnerPrecedence__ModAssignment_2_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4288:1: ( ( rule__InnerPrecedence__ModAssignment_2_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4288:1: ( ( rule__InnerPrecedence__ModAssignment_2_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4289:1: ( rule__InnerPrecedence__ModAssignment_2_1_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getModAssignment_2_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4290:1: ( rule__InnerPrecedence__ModAssignment_2_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4290:2: rule__InnerPrecedence__ModAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__ModAssignment_2_1_0_in_rule__InnerPrecedence__Group_2_1__0__Impl8703);
            rule__InnerPrecedence__ModAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getModAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4300:1: rule__InnerPrecedence__Group_2_1__1 : rule__InnerPrecedence__Group_2_1__1__Impl rule__InnerPrecedence__Group_2_1__2 ;
    public final void rule__InnerPrecedence__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4304:1: ( rule__InnerPrecedence__Group_2_1__1__Impl rule__InnerPrecedence__Group_2_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4305:2: rule__InnerPrecedence__Group_2_1__1__Impl rule__InnerPrecedence__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1__1__Impl_in_rule__InnerPrecedence__Group_2_1__18733);
            rule__InnerPrecedence__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1__2_in_rule__InnerPrecedence__Group_2_1__18736);
            rule__InnerPrecedence__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1__1"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4312:1: rule__InnerPrecedence__Group_2_1__1__Impl : ( ( rule__InnerPrecedence__RuleAssignment_2_1_1 ) ) ;
    public final void rule__InnerPrecedence__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4316:1: ( ( ( rule__InnerPrecedence__RuleAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4317:1: ( ( rule__InnerPrecedence__RuleAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4317:1: ( ( rule__InnerPrecedence__RuleAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4318:1: ( rule__InnerPrecedence__RuleAssignment_2_1_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4319:1: ( rule__InnerPrecedence__RuleAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4319:2: rule__InnerPrecedence__RuleAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuleAssignment_2_1_1_in_rule__InnerPrecedence__Group_2_1__1__Impl8763);
            rule__InnerPrecedence__RuleAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4329:1: rule__InnerPrecedence__Group_2_1__2 : rule__InnerPrecedence__Group_2_1__2__Impl ;
    public final void rule__InnerPrecedence__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4333:1: ( rule__InnerPrecedence__Group_2_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4334:2: rule__InnerPrecedence__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1__2__Impl_in_rule__InnerPrecedence__Group_2_1__28793);
            rule__InnerPrecedence__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1__2"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4340:1: rule__InnerPrecedence__Group_2_1__2__Impl : ( ( rule__InnerPrecedence__Group_2_1_2__0 )? ) ;
    public final void rule__InnerPrecedence__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4344:1: ( ( ( rule__InnerPrecedence__Group_2_1_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4345:1: ( ( rule__InnerPrecedence__Group_2_1_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4345:1: ( ( rule__InnerPrecedence__Group_2_1_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4346:1: ( rule__InnerPrecedence__Group_2_1_2__0 )?
            {
             before(grammarAccess.getInnerPrecedenceAccess().getGroup_2_1_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4347:1: ( rule__InnerPrecedence__Group_2_1_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4347:2: rule__InnerPrecedence__Group_2_1_2__0
                    {
                    pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1_2__0_in_rule__InnerPrecedence__Group_2_1__2__Impl8820);
                    rule__InnerPrecedence__Group_2_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInnerPrecedenceAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1__2__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4363:1: rule__InnerPrecedence__Group_2_1_2__0 : rule__InnerPrecedence__Group_2_1_2__0__Impl rule__InnerPrecedence__Group_2_1_2__1 ;
    public final void rule__InnerPrecedence__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4367:1: ( rule__InnerPrecedence__Group_2_1_2__0__Impl rule__InnerPrecedence__Group_2_1_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4368:2: rule__InnerPrecedence__Group_2_1_2__0__Impl rule__InnerPrecedence__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1_2__0__Impl_in_rule__InnerPrecedence__Group_2_1_2__08857);
            rule__InnerPrecedence__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1_2__1_in_rule__InnerPrecedence__Group_2_1_2__08860);
            rule__InnerPrecedence__Group_2_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1_2__0"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4375:1: rule__InnerPrecedence__Group_2_1_2__0__Impl : ( '.' ) ;
    public final void rule__InnerPrecedence__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4379:1: ( ( '.' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4380:1: ( '.' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4380:1: ( '.' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4381:1: '.'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_2_1_2_0()); 
            match(input,38,FOLLOW_38_in_rule__InnerPrecedence__Group_2_1_2__0__Impl8888); 
             after(grammarAccess.getInnerPrecedenceAccess().getFullStopKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4394:1: rule__InnerPrecedence__Group_2_1_2__1 : rule__InnerPrecedence__Group_2_1_2__1__Impl ;
    public final void rule__InnerPrecedence__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4398:1: ( rule__InnerPrecedence__Group_2_1_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4399:2: rule__InnerPrecedence__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_1_2__1__Impl_in_rule__InnerPrecedence__Group_2_1_2__18919);
            rule__InnerPrecedence__Group_2_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1_2__1"


    // $ANTLR start "rule__InnerPrecedence__Group_2_1_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4405:1: rule__InnerPrecedence__Group_2_1_2__1__Impl : ( ( rule__InnerPrecedence__Feature1Assignment_2_1_2_1 ) ) ;
    public final void rule__InnerPrecedence__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4409:1: ( ( ( rule__InnerPrecedence__Feature1Assignment_2_1_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4410:1: ( ( rule__InnerPrecedence__Feature1Assignment_2_1_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4410:1: ( ( rule__InnerPrecedence__Feature1Assignment_2_1_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4411:1: ( rule__InnerPrecedence__Feature1Assignment_2_1_2_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getFeature1Assignment_2_1_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4412:1: ( rule__InnerPrecedence__Feature1Assignment_2_1_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4412:2: rule__InnerPrecedence__Feature1Assignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Feature1Assignment_2_1_2_1_in_rule__InnerPrecedence__Group_2_1_2__1__Impl8946);
            rule__InnerPrecedence__Feature1Assignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getFeature1Assignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2_3__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4426:1: rule__InnerPrecedence__Group_2_3__0 : rule__InnerPrecedence__Group_2_3__0__Impl rule__InnerPrecedence__Group_2_3__1 ;
    public final void rule__InnerPrecedence__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4430:1: ( rule__InnerPrecedence__Group_2_3__0__Impl rule__InnerPrecedence__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4431:2: rule__InnerPrecedence__Group_2_3__0__Impl rule__InnerPrecedence__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_3__0__Impl_in_rule__InnerPrecedence__Group_2_3__08980);
            rule__InnerPrecedence__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_3__1_in_rule__InnerPrecedence__Group_2_3__08983);
            rule__InnerPrecedence__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_3__0"


    // $ANTLR start "rule__InnerPrecedence__Group_2_3__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4438:1: rule__InnerPrecedence__Group_2_3__0__Impl : ( ( rule__InnerPrecedence__Feature2Assignment_2_3_0 ) ) ;
    public final void rule__InnerPrecedence__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4442:1: ( ( ( rule__InnerPrecedence__Feature2Assignment_2_3_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4443:1: ( ( rule__InnerPrecedence__Feature2Assignment_2_3_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4443:1: ( ( rule__InnerPrecedence__Feature2Assignment_2_3_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4444:1: ( rule__InnerPrecedence__Feature2Assignment_2_3_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getFeature2Assignment_2_3_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4445:1: ( rule__InnerPrecedence__Feature2Assignment_2_3_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4445:2: rule__InnerPrecedence__Feature2Assignment_2_3_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Feature2Assignment_2_3_0_in_rule__InnerPrecedence__Group_2_3__0__Impl9010);
            rule__InnerPrecedence__Feature2Assignment_2_3_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getFeature2Assignment_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_3__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_2_3__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4455:1: rule__InnerPrecedence__Group_2_3__1 : rule__InnerPrecedence__Group_2_3__1__Impl ;
    public final void rule__InnerPrecedence__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4459:1: ( rule__InnerPrecedence__Group_2_3__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4460:2: rule__InnerPrecedence__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_2_3__1__Impl_in_rule__InnerPrecedence__Group_2_3__19040);
            rule__InnerPrecedence__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_3__1"


    // $ANTLR start "rule__InnerPrecedence__Group_2_3__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4466:1: rule__InnerPrecedence__Group_2_3__1__Impl : ( '=' ) ;
    public final void rule__InnerPrecedence__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4470:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4471:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4471:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4472:1: '='
            {
             before(grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_2_3_1()); 
            match(input,35,FOLLOW_35_in_rule__InnerPrecedence__Group_2_3__1__Impl9068); 
             after(grammarAccess.getInnerPrecedenceAccess().getEqualsSignKeyword_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_2_3__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_3__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4489:1: rule__InnerPrecedence__Group_3__0 : rule__InnerPrecedence__Group_3__0__Impl rule__InnerPrecedence__Group_3__1 ;
    public final void rule__InnerPrecedence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4493:1: ( rule__InnerPrecedence__Group_3__0__Impl rule__InnerPrecedence__Group_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4494:2: rule__InnerPrecedence__Group_3__0__Impl rule__InnerPrecedence__Group_3__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_3__0__Impl_in_rule__InnerPrecedence__Group_3__09103);
            rule__InnerPrecedence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_3__1_in_rule__InnerPrecedence__Group_3__09106);
            rule__InnerPrecedence__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_3__0"


    // $ANTLR start "rule__InnerPrecedence__Group_3__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4501:1: rule__InnerPrecedence__Group_3__0__Impl : ( ( rule__InnerPrecedence__RuletypAssignment_3_0 ) ) ;
    public final void rule__InnerPrecedence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4505:1: ( ( ( rule__InnerPrecedence__RuletypAssignment_3_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4506:1: ( ( rule__InnerPrecedence__RuletypAssignment_3_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4506:1: ( ( rule__InnerPrecedence__RuletypAssignment_3_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4507:1: ( rule__InnerPrecedence__RuletypAssignment_3_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_3_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4508:1: ( rule__InnerPrecedence__RuletypAssignment_3_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4508:2: rule__InnerPrecedence__RuletypAssignment_3_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuletypAssignment_3_0_in_rule__InnerPrecedence__Group_3__0__Impl9133);
            rule__InnerPrecedence__RuletypAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_3__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_3__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4518:1: rule__InnerPrecedence__Group_3__1 : rule__InnerPrecedence__Group_3__1__Impl rule__InnerPrecedence__Group_3__2 ;
    public final void rule__InnerPrecedence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4522:1: ( rule__InnerPrecedence__Group_3__1__Impl rule__InnerPrecedence__Group_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4523:2: rule__InnerPrecedence__Group_3__1__Impl rule__InnerPrecedence__Group_3__2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_3__1__Impl_in_rule__InnerPrecedence__Group_3__19163);
            rule__InnerPrecedence__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_3__2_in_rule__InnerPrecedence__Group_3__19166);
            rule__InnerPrecedence__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_3__1"


    // $ANTLR start "rule__InnerPrecedence__Group_3__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4530:1: rule__InnerPrecedence__Group_3__1__Impl : ( ( rule__InnerPrecedence__InfixleftAssignment_3_1 ) ) ;
    public final void rule__InnerPrecedence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4534:1: ( ( ( rule__InnerPrecedence__InfixleftAssignment_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4535:1: ( ( rule__InnerPrecedence__InfixleftAssignment_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4535:1: ( ( rule__InnerPrecedence__InfixleftAssignment_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4536:1: ( rule__InnerPrecedence__InfixleftAssignment_3_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getInfixleftAssignment_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4537:1: ( rule__InnerPrecedence__InfixleftAssignment_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4537:2: rule__InnerPrecedence__InfixleftAssignment_3_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__InfixleftAssignment_3_1_in_rule__InnerPrecedence__Group_3__1__Impl9193);
            rule__InnerPrecedence__InfixleftAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getInfixleftAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_3__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_3__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4547:1: rule__InnerPrecedence__Group_3__2 : rule__InnerPrecedence__Group_3__2__Impl ;
    public final void rule__InnerPrecedence__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4551:1: ( rule__InnerPrecedence__Group_3__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4552:2: rule__InnerPrecedence__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_3__2__Impl_in_rule__InnerPrecedence__Group_3__29223);
            rule__InnerPrecedence__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_3__2"


    // $ANTLR start "rule__InnerPrecedence__Group_3__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4558:1: rule__InnerPrecedence__Group_3__2__Impl : ( ( rule__InnerPrecedence__Par2Assignment_3_2 ) ) ;
    public final void rule__InnerPrecedence__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4562:1: ( ( ( rule__InnerPrecedence__Par2Assignment_3_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4563:1: ( ( rule__InnerPrecedence__Par2Assignment_3_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4563:1: ( ( rule__InnerPrecedence__Par2Assignment_3_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4564:1: ( rule__InnerPrecedence__Par2Assignment_3_2 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getPar2Assignment_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4565:1: ( rule__InnerPrecedence__Par2Assignment_3_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4565:2: rule__InnerPrecedence__Par2Assignment_3_2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Par2Assignment_3_2_in_rule__InnerPrecedence__Group_3__2__Impl9250);
            rule__InnerPrecedence__Par2Assignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getPar2Assignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_3__2__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_4__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4581:1: rule__InnerPrecedence__Group_4__0 : rule__InnerPrecedence__Group_4__0__Impl rule__InnerPrecedence__Group_4__1 ;
    public final void rule__InnerPrecedence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4585:1: ( rule__InnerPrecedence__Group_4__0__Impl rule__InnerPrecedence__Group_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4586:2: rule__InnerPrecedence__Group_4__0__Impl rule__InnerPrecedence__Group_4__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_4__0__Impl_in_rule__InnerPrecedence__Group_4__09286);
            rule__InnerPrecedence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_4__1_in_rule__InnerPrecedence__Group_4__09289);
            rule__InnerPrecedence__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_4__0"


    // $ANTLR start "rule__InnerPrecedence__Group_4__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4593:1: rule__InnerPrecedence__Group_4__0__Impl : ( ( rule__InnerPrecedence__RuletypAssignment_4_0 ) ) ;
    public final void rule__InnerPrecedence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4597:1: ( ( ( rule__InnerPrecedence__RuletypAssignment_4_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4598:1: ( ( rule__InnerPrecedence__RuletypAssignment_4_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4598:1: ( ( rule__InnerPrecedence__RuletypAssignment_4_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4599:1: ( rule__InnerPrecedence__RuletypAssignment_4_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_4_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4600:1: ( rule__InnerPrecedence__RuletypAssignment_4_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4600:2: rule__InnerPrecedence__RuletypAssignment_4_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuletypAssignment_4_0_in_rule__InnerPrecedence__Group_4__0__Impl9316);
            rule__InnerPrecedence__RuletypAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_4__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_4__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4610:1: rule__InnerPrecedence__Group_4__1 : rule__InnerPrecedence__Group_4__1__Impl rule__InnerPrecedence__Group_4__2 ;
    public final void rule__InnerPrecedence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4614:1: ( rule__InnerPrecedence__Group_4__1__Impl rule__InnerPrecedence__Group_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4615:2: rule__InnerPrecedence__Group_4__1__Impl rule__InnerPrecedence__Group_4__2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_4__1__Impl_in_rule__InnerPrecedence__Group_4__19346);
            rule__InnerPrecedence__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_4__2_in_rule__InnerPrecedence__Group_4__19349);
            rule__InnerPrecedence__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_4__1"


    // $ANTLR start "rule__InnerPrecedence__Group_4__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4622:1: rule__InnerPrecedence__Group_4__1__Impl : ( ( rule__InnerPrecedence__RuleAssignment_4_1 ) ) ;
    public final void rule__InnerPrecedence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4626:1: ( ( ( rule__InnerPrecedence__RuleAssignment_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4627:1: ( ( rule__InnerPrecedence__RuleAssignment_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4627:1: ( ( rule__InnerPrecedence__RuleAssignment_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4628:1: ( rule__InnerPrecedence__RuleAssignment_4_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4629:1: ( rule__InnerPrecedence__RuleAssignment_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4629:2: rule__InnerPrecedence__RuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuleAssignment_4_1_in_rule__InnerPrecedence__Group_4__1__Impl9376);
            rule__InnerPrecedence__RuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_4__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_4__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4639:1: rule__InnerPrecedence__Group_4__2 : rule__InnerPrecedence__Group_4__2__Impl ;
    public final void rule__InnerPrecedence__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4643:1: ( rule__InnerPrecedence__Group_4__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4644:2: rule__InnerPrecedence__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_4__2__Impl_in_rule__InnerPrecedence__Group_4__29406);
            rule__InnerPrecedence__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_4__2"


    // $ANTLR start "rule__InnerPrecedence__Group_4__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4650:1: rule__InnerPrecedence__Group_4__2__Impl : ( ( rule__InnerPrecedence__BracketAssignment_4_2 ) ) ;
    public final void rule__InnerPrecedence__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4654:1: ( ( ( rule__InnerPrecedence__BracketAssignment_4_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4655:1: ( ( rule__InnerPrecedence__BracketAssignment_4_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4655:1: ( ( rule__InnerPrecedence__BracketAssignment_4_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4656:1: ( rule__InnerPrecedence__BracketAssignment_4_2 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getBracketAssignment_4_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4657:1: ( rule__InnerPrecedence__BracketAssignment_4_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4657:2: rule__InnerPrecedence__BracketAssignment_4_2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__BracketAssignment_4_2_in_rule__InnerPrecedence__Group_4__2__Impl9433);
            rule__InnerPrecedence__BracketAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getBracketAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_4__2__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_5__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4673:1: rule__InnerPrecedence__Group_5__0 : rule__InnerPrecedence__Group_5__0__Impl rule__InnerPrecedence__Group_5__1 ;
    public final void rule__InnerPrecedence__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4677:1: ( rule__InnerPrecedence__Group_5__0__Impl rule__InnerPrecedence__Group_5__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4678:2: rule__InnerPrecedence__Group_5__0__Impl rule__InnerPrecedence__Group_5__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_5__0__Impl_in_rule__InnerPrecedence__Group_5__09469);
            rule__InnerPrecedence__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_5__1_in_rule__InnerPrecedence__Group_5__09472);
            rule__InnerPrecedence__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_5__0"


    // $ANTLR start "rule__InnerPrecedence__Group_5__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4685:1: rule__InnerPrecedence__Group_5__0__Impl : ( ( rule__InnerPrecedence__RuletypAssignment_5_0 ) ) ;
    public final void rule__InnerPrecedence__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4689:1: ( ( ( rule__InnerPrecedence__RuletypAssignment_5_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4690:1: ( ( rule__InnerPrecedence__RuletypAssignment_5_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4690:1: ( ( rule__InnerPrecedence__RuletypAssignment_5_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4691:1: ( rule__InnerPrecedence__RuletypAssignment_5_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_5_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4692:1: ( rule__InnerPrecedence__RuletypAssignment_5_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4692:2: rule__InnerPrecedence__RuletypAssignment_5_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuletypAssignment_5_0_in_rule__InnerPrecedence__Group_5__0__Impl9499);
            rule__InnerPrecedence__RuletypAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_5__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_5__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4702:1: rule__InnerPrecedence__Group_5__1 : rule__InnerPrecedence__Group_5__1__Impl rule__InnerPrecedence__Group_5__2 ;
    public final void rule__InnerPrecedence__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4706:1: ( rule__InnerPrecedence__Group_5__1__Impl rule__InnerPrecedence__Group_5__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4707:2: rule__InnerPrecedence__Group_5__1__Impl rule__InnerPrecedence__Group_5__2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_5__1__Impl_in_rule__InnerPrecedence__Group_5__19529);
            rule__InnerPrecedence__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_5__2_in_rule__InnerPrecedence__Group_5__19532);
            rule__InnerPrecedence__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_5__1"


    // $ANTLR start "rule__InnerPrecedence__Group_5__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4714:1: rule__InnerPrecedence__Group_5__1__Impl : ( ( rule__InnerPrecedence__RuleAssignment_5_1 ) ) ;
    public final void rule__InnerPrecedence__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4718:1: ( ( ( rule__InnerPrecedence__RuleAssignment_5_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4719:1: ( ( rule__InnerPrecedence__RuleAssignment_5_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4719:1: ( ( rule__InnerPrecedence__RuleAssignment_5_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4720:1: ( rule__InnerPrecedence__RuleAssignment_5_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_5_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4721:1: ( rule__InnerPrecedence__RuleAssignment_5_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4721:2: rule__InnerPrecedence__RuleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuleAssignment_5_1_in_rule__InnerPrecedence__Group_5__1__Impl9559);
            rule__InnerPrecedence__RuleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_5__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_5__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4731:1: rule__InnerPrecedence__Group_5__2 : rule__InnerPrecedence__Group_5__2__Impl ;
    public final void rule__InnerPrecedence__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4735:1: ( rule__InnerPrecedence__Group_5__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4736:2: rule__InnerPrecedence__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_5__2__Impl_in_rule__InnerPrecedence__Group_5__29589);
            rule__InnerPrecedence__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_5__2"


    // $ANTLR start "rule__InnerPrecedence__Group_5__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4742:1: rule__InnerPrecedence__Group_5__2__Impl : ( ( rule__InnerPrecedence__BracesAssignment_5_2 ) ) ;
    public final void rule__InnerPrecedence__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4746:1: ( ( ( rule__InnerPrecedence__BracesAssignment_5_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4747:1: ( ( rule__InnerPrecedence__BracesAssignment_5_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4747:1: ( ( rule__InnerPrecedence__BracesAssignment_5_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4748:1: ( rule__InnerPrecedence__BracesAssignment_5_2 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getBracesAssignment_5_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4749:1: ( rule__InnerPrecedence__BracesAssignment_5_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4749:2: rule__InnerPrecedence__BracesAssignment_5_2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__BracesAssignment_5_2_in_rule__InnerPrecedence__Group_5__2__Impl9616);
            rule__InnerPrecedence__BracesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getBracesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_5__2__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_6__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4765:1: rule__InnerPrecedence__Group_6__0 : rule__InnerPrecedence__Group_6__0__Impl rule__InnerPrecedence__Group_6__1 ;
    public final void rule__InnerPrecedence__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4769:1: ( rule__InnerPrecedence__Group_6__0__Impl rule__InnerPrecedence__Group_6__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4770:2: rule__InnerPrecedence__Group_6__0__Impl rule__InnerPrecedence__Group_6__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_6__0__Impl_in_rule__InnerPrecedence__Group_6__09652);
            rule__InnerPrecedence__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_6__1_in_rule__InnerPrecedence__Group_6__09655);
            rule__InnerPrecedence__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_6__0"


    // $ANTLR start "rule__InnerPrecedence__Group_6__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4777:1: rule__InnerPrecedence__Group_6__0__Impl : ( ( rule__InnerPrecedence__RuletypAssignment_6_0 ) ) ;
    public final void rule__InnerPrecedence__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4781:1: ( ( ( rule__InnerPrecedence__RuletypAssignment_6_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4782:1: ( ( rule__InnerPrecedence__RuletypAssignment_6_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4782:1: ( ( rule__InnerPrecedence__RuletypAssignment_6_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4783:1: ( rule__InnerPrecedence__RuletypAssignment_6_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_6_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4784:1: ( rule__InnerPrecedence__RuletypAssignment_6_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4784:2: rule__InnerPrecedence__RuletypAssignment_6_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuletypAssignment_6_0_in_rule__InnerPrecedence__Group_6__0__Impl9682);
            rule__InnerPrecedence__RuletypAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_6__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_6__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4794:1: rule__InnerPrecedence__Group_6__1 : rule__InnerPrecedence__Group_6__1__Impl rule__InnerPrecedence__Group_6__2 ;
    public final void rule__InnerPrecedence__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4798:1: ( rule__InnerPrecedence__Group_6__1__Impl rule__InnerPrecedence__Group_6__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4799:2: rule__InnerPrecedence__Group_6__1__Impl rule__InnerPrecedence__Group_6__2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_6__1__Impl_in_rule__InnerPrecedence__Group_6__19712);
            rule__InnerPrecedence__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_6__2_in_rule__InnerPrecedence__Group_6__19715);
            rule__InnerPrecedence__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_6__1"


    // $ANTLR start "rule__InnerPrecedence__Group_6__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4806:1: rule__InnerPrecedence__Group_6__1__Impl : ( ( rule__InnerPrecedence__RuleAssignment_6_1 ) ) ;
    public final void rule__InnerPrecedence__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4810:1: ( ( ( rule__InnerPrecedence__RuleAssignment_6_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4811:1: ( ( rule__InnerPrecedence__RuleAssignment_6_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4811:1: ( ( rule__InnerPrecedence__RuleAssignment_6_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4812:1: ( rule__InnerPrecedence__RuleAssignment_6_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_6_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4813:1: ( rule__InnerPrecedence__RuleAssignment_6_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4813:2: rule__InnerPrecedence__RuleAssignment_6_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuleAssignment_6_1_in_rule__InnerPrecedence__Group_6__1__Impl9742);
            rule__InnerPrecedence__RuleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_6__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_6__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4823:1: rule__InnerPrecedence__Group_6__2 : rule__InnerPrecedence__Group_6__2__Impl ;
    public final void rule__InnerPrecedence__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4827:1: ( rule__InnerPrecedence__Group_6__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4828:2: rule__InnerPrecedence__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_6__2__Impl_in_rule__InnerPrecedence__Group_6__29772);
            rule__InnerPrecedence__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_6__2"


    // $ANTLR start "rule__InnerPrecedence__Group_6__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4834:1: rule__InnerPrecedence__Group_6__2__Impl : ( ( rule__InnerPrecedence__ParenthesisAssignment_6_2 ) ) ;
    public final void rule__InnerPrecedence__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4838:1: ( ( ( rule__InnerPrecedence__ParenthesisAssignment_6_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4839:1: ( ( rule__InnerPrecedence__ParenthesisAssignment_6_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4839:1: ( ( rule__InnerPrecedence__ParenthesisAssignment_6_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4840:1: ( rule__InnerPrecedence__ParenthesisAssignment_6_2 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getParenthesisAssignment_6_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4841:1: ( rule__InnerPrecedence__ParenthesisAssignment_6_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4841:2: rule__InnerPrecedence__ParenthesisAssignment_6_2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__ParenthesisAssignment_6_2_in_rule__InnerPrecedence__Group_6__2__Impl9799);
            rule__InnerPrecedence__ParenthesisAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getParenthesisAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_6__2__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_7__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4857:1: rule__InnerPrecedence__Group_7__0 : rule__InnerPrecedence__Group_7__0__Impl rule__InnerPrecedence__Group_7__1 ;
    public final void rule__InnerPrecedence__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4861:1: ( rule__InnerPrecedence__Group_7__0__Impl rule__InnerPrecedence__Group_7__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4862:2: rule__InnerPrecedence__Group_7__0__Impl rule__InnerPrecedence__Group_7__1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_7__0__Impl_in_rule__InnerPrecedence__Group_7__09835);
            rule__InnerPrecedence__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_7__1_in_rule__InnerPrecedence__Group_7__09838);
            rule__InnerPrecedence__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_7__0"


    // $ANTLR start "rule__InnerPrecedence__Group_7__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4869:1: rule__InnerPrecedence__Group_7__0__Impl : ( ( rule__InnerPrecedence__RuletypAssignment_7_0 ) ) ;
    public final void rule__InnerPrecedence__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4873:1: ( ( ( rule__InnerPrecedence__RuletypAssignment_7_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4874:1: ( ( rule__InnerPrecedence__RuletypAssignment_7_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4874:1: ( ( rule__InnerPrecedence__RuletypAssignment_7_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4875:1: ( rule__InnerPrecedence__RuletypAssignment_7_0 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_7_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4876:1: ( rule__InnerPrecedence__RuletypAssignment_7_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4876:2: rule__InnerPrecedence__RuletypAssignment_7_0
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuletypAssignment_7_0_in_rule__InnerPrecedence__Group_7__0__Impl9865);
            rule__InnerPrecedence__RuletypAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_7__0__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_7__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4886:1: rule__InnerPrecedence__Group_7__1 : rule__InnerPrecedence__Group_7__1__Impl rule__InnerPrecedence__Group_7__2 ;
    public final void rule__InnerPrecedence__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4890:1: ( rule__InnerPrecedence__Group_7__1__Impl rule__InnerPrecedence__Group_7__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4891:2: rule__InnerPrecedence__Group_7__1__Impl rule__InnerPrecedence__Group_7__2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_7__1__Impl_in_rule__InnerPrecedence__Group_7__19895);
            rule__InnerPrecedence__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InnerPrecedence__Group_7__2_in_rule__InnerPrecedence__Group_7__19898);
            rule__InnerPrecedence__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_7__1"


    // $ANTLR start "rule__InnerPrecedence__Group_7__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4898:1: rule__InnerPrecedence__Group_7__1__Impl : ( ( rule__InnerPrecedence__RuleAssignment_7_1 ) ) ;
    public final void rule__InnerPrecedence__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4902:1: ( ( ( rule__InnerPrecedence__RuleAssignment_7_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4903:1: ( ( rule__InnerPrecedence__RuleAssignment_7_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4903:1: ( ( rule__InnerPrecedence__RuleAssignment_7_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4904:1: ( rule__InnerPrecedence__RuleAssignment_7_1 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_7_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4905:1: ( rule__InnerPrecedence__RuleAssignment_7_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4905:2: rule__InnerPrecedence__RuleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__RuleAssignment_7_1_in_rule__InnerPrecedence__Group_7__1__Impl9925);
            rule__InnerPrecedence__RuleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_7__1__Impl"


    // $ANTLR start "rule__InnerPrecedence__Group_7__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4915:1: rule__InnerPrecedence__Group_7__2 : rule__InnerPrecedence__Group_7__2__Impl ;
    public final void rule__InnerPrecedence__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4919:1: ( rule__InnerPrecedence__Group_7__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4920:2: rule__InnerPrecedence__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__Group_7__2__Impl_in_rule__InnerPrecedence__Group_7__29955);
            rule__InnerPrecedence__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_7__2"


    // $ANTLR start "rule__InnerPrecedence__Group_7__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4926:1: rule__InnerPrecedence__Group_7__2__Impl : ( ( rule__InnerPrecedence__AngleAssignment_7_2 ) ) ;
    public final void rule__InnerPrecedence__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4930:1: ( ( ( rule__InnerPrecedence__AngleAssignment_7_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4931:1: ( ( rule__InnerPrecedence__AngleAssignment_7_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4931:1: ( ( rule__InnerPrecedence__AngleAssignment_7_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4932:1: ( rule__InnerPrecedence__AngleAssignment_7_2 )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getAngleAssignment_7_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4933:1: ( rule__InnerPrecedence__AngleAssignment_7_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4933:2: rule__InnerPrecedence__AngleAssignment_7_2
            {
            pushFollow(FOLLOW_rule__InnerPrecedence__AngleAssignment_7_2_in_rule__InnerPrecedence__Group_7__2__Impl9982);
            rule__InnerPrecedence__AngleAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getInnerPrecedenceAccess().getAngleAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Group_7__2__Impl"


    // $ANTLR start "rule__MultID__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4949:1: rule__MultID__Group__0 : rule__MultID__Group__0__Impl rule__MultID__Group__1 ;
    public final void rule__MultID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4953:1: ( rule__MultID__Group__0__Impl rule__MultID__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4954:2: rule__MultID__Group__0__Impl rule__MultID__Group__1
            {
            pushFollow(FOLLOW_rule__MultID__Group__0__Impl_in_rule__MultID__Group__010018);
            rule__MultID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group__1_in_rule__MultID__Group__010021);
            rule__MultID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group__0"


    // $ANTLR start "rule__MultID__Group__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4961:1: rule__MultID__Group__0__Impl : ( () ) ;
    public final void rule__MultID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4965:1: ( ( () ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4966:1: ( () )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4966:1: ( () )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4967:1: ()
            {
             before(grammarAccess.getMultIDAccess().getMultIDAction_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4968:1: ()
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4970:1: 
            {
            }

             after(grammarAccess.getMultIDAccess().getMultIDAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group__0__Impl"


    // $ANTLR start "rule__MultID__Group__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4980:1: rule__MultID__Group__1 : rule__MultID__Group__1__Impl ;
    public final void rule__MultID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4984:1: ( rule__MultID__Group__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4985:2: rule__MultID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group__1__Impl_in_rule__MultID__Group__110079);
            rule__MultID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group__1"


    // $ANTLR start "rule__MultID__Group__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4991:1: rule__MultID__Group__1__Impl : ( ( rule__MultID__Alternatives_1 ) ) ;
    public final void rule__MultID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4995:1: ( ( ( rule__MultID__Alternatives_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4996:1: ( ( rule__MultID__Alternatives_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4996:1: ( ( rule__MultID__Alternatives_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4997:1: ( rule__MultID__Alternatives_1 )
            {
             before(grammarAccess.getMultIDAccess().getAlternatives_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4998:1: ( rule__MultID__Alternatives_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4998:2: rule__MultID__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MultID__Alternatives_1_in_rule__MultID__Group__1__Impl10106);
            rule__MultID__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMultIDAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group__1__Impl"


    // $ANTLR start "rule__MultID__Group_1_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5012:1: rule__MultID__Group_1_1__0 : rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1 ;
    public final void rule__MultID__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5016:1: ( rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5017:2: rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__0__Impl_in_rule__MultID__Group_1_1__010140);
            rule__MultID__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1_1__1_in_rule__MultID__Group_1_1__010143);
            rule__MultID__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1_1__0"


    // $ANTLR start "rule__MultID__Group_1_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5024:1: rule__MultID__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__MultID__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5028:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5029:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5029:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5030:1: '['
            {
             before(grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,39,FOLLOW_39_in_rule__MultID__Group_1_1__0__Impl10171); 
             after(grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultID__Group_1_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5043:1: rule__MultID__Group_1_1__1 : rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2 ;
    public final void rule__MultID__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5047:1: ( rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5048:2: rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__1__Impl_in_rule__MultID__Group_1_1__110202);
            rule__MultID__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1_1__2_in_rule__MultID__Group_1_1__110205);
            rule__MultID__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1_1__1"


    // $ANTLR start "rule__MultID__Group_1_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5055:1: rule__MultID__Group_1_1__1__Impl : ( ( rule__MultID__MiAssignment_1_1_1 )* ) ;
    public final void rule__MultID__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5059:1: ( ( ( rule__MultID__MiAssignment_1_1_1 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5060:1: ( ( rule__MultID__MiAssignment_1_1_1 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5060:1: ( ( rule__MultID__MiAssignment_1_1_1 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5061:1: ( rule__MultID__MiAssignment_1_1_1 )*
            {
             before(grammarAccess.getMultIDAccess().getMiAssignment_1_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5062:1: ( rule__MultID__MiAssignment_1_1_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5062:2: rule__MultID__MiAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MultID__MiAssignment_1_1_1_in_rule__MultID__Group_1_1__1__Impl10232);
            	    rule__MultID__MiAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMultIDAccess().getMiAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultID__Group_1_1__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5072:1: rule__MultID__Group_1_1__2 : rule__MultID__Group_1_1__2__Impl ;
    public final void rule__MultID__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5076:1: ( rule__MultID__Group_1_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5077:2: rule__MultID__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__2__Impl_in_rule__MultID__Group_1_1__210263);
            rule__MultID__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1_1__2"


    // $ANTLR start "rule__MultID__Group_1_1__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5083:1: rule__MultID__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__MultID__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5087:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5088:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5088:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5089:1: ']'
            {
             before(grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,40,FOLLOW_40_in_rule__MultID__Group_1_1__2__Impl10291); 
             after(grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1_1__2__Impl"


    // $ANTLR start "rule__MultString__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5108:1: rule__MultString__Group__0 : rule__MultString__Group__0__Impl rule__MultString__Group__1 ;
    public final void rule__MultString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5112:1: ( rule__MultString__Group__0__Impl rule__MultString__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5113:2: rule__MultString__Group__0__Impl rule__MultString__Group__1
            {
            pushFollow(FOLLOW_rule__MultString__Group__0__Impl_in_rule__MultString__Group__010328);
            rule__MultString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group__1_in_rule__MultString__Group__010331);
            rule__MultString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group__0"


    // $ANTLR start "rule__MultString__Group__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5120:1: rule__MultString__Group__0__Impl : ( () ) ;
    public final void rule__MultString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5124:1: ( ( () ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5125:1: ( () )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5125:1: ( () )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5126:1: ()
            {
             before(grammarAccess.getMultStringAccess().getMultStringAction_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5127:1: ()
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5129:1: 
            {
            }

             after(grammarAccess.getMultStringAccess().getMultStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group__0__Impl"


    // $ANTLR start "rule__MultString__Group__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5139:1: rule__MultString__Group__1 : rule__MultString__Group__1__Impl ;
    public final void rule__MultString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5143:1: ( rule__MultString__Group__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5144:2: rule__MultString__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group__1__Impl_in_rule__MultString__Group__110389);
            rule__MultString__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group__1"


    // $ANTLR start "rule__MultString__Group__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5150:1: rule__MultString__Group__1__Impl : ( ( rule__MultString__Alternatives_1 ) ) ;
    public final void rule__MultString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5154:1: ( ( ( rule__MultString__Alternatives_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5155:1: ( ( rule__MultString__Alternatives_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5155:1: ( ( rule__MultString__Alternatives_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5156:1: ( rule__MultString__Alternatives_1 )
            {
             before(grammarAccess.getMultStringAccess().getAlternatives_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5157:1: ( rule__MultString__Alternatives_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5157:2: rule__MultString__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MultString__Alternatives_1_in_rule__MultString__Group__1__Impl10416);
            rule__MultString__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMultStringAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group__1__Impl"


    // $ANTLR start "rule__MultString__Group_1_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5171:1: rule__MultString__Group_1_1__0 : rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1 ;
    public final void rule__MultString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5175:1: ( rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5176:2: rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__0__Impl_in_rule__MultString__Group_1_1__010450);
            rule__MultString__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1_1__1_in_rule__MultString__Group_1_1__010453);
            rule__MultString__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1_1__0"


    // $ANTLR start "rule__MultString__Group_1_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5183:1: rule__MultString__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__MultString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5187:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5188:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5188:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5189:1: '['
            {
             before(grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,39,FOLLOW_39_in_rule__MultString__Group_1_1__0__Impl10481); 
             after(grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultString__Group_1_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5202:1: rule__MultString__Group_1_1__1 : rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2 ;
    public final void rule__MultString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5206:1: ( rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5207:2: rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__1__Impl_in_rule__MultString__Group_1_1__110512);
            rule__MultString__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1_1__2_in_rule__MultString__Group_1_1__110515);
            rule__MultString__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1_1__1"


    // $ANTLR start "rule__MultString__Group_1_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5214:1: rule__MultString__Group_1_1__1__Impl : ( ( rule__MultString__MsAssignment_1_1_1 )* ) ;
    public final void rule__MultString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5218:1: ( ( ( rule__MultString__MsAssignment_1_1_1 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5219:1: ( ( rule__MultString__MsAssignment_1_1_1 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5219:1: ( ( rule__MultString__MsAssignment_1_1_1 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5220:1: ( rule__MultString__MsAssignment_1_1_1 )*
            {
             before(grammarAccess.getMultStringAccess().getMsAssignment_1_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5221:1: ( rule__MultString__MsAssignment_1_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5221:2: rule__MultString__MsAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MultString__MsAssignment_1_1_1_in_rule__MultString__Group_1_1__1__Impl10542);
            	    rule__MultString__MsAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMultStringAccess().getMsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultString__Group_1_1__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5231:1: rule__MultString__Group_1_1__2 : rule__MultString__Group_1_1__2__Impl ;
    public final void rule__MultString__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5235:1: ( rule__MultString__Group_1_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5236:2: rule__MultString__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__2__Impl_in_rule__MultString__Group_1_1__210573);
            rule__MultString__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1_1__2"


    // $ANTLR start "rule__MultString__Group_1_1__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5242:1: rule__MultString__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__MultString__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5246:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5247:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5247:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5248:1: ']'
            {
             before(grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,40,FOLLOW_40_in_rule__MultString__Group_1_1__2__Impl10601); 
             after(grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1_1__2__Impl"


    // $ANTLR start "rule__Model__ClasAssignment_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5268:1: rule__Model__ClasAssignment_0 : ( ruleClassType ) ;
    public final void rule__Model__ClasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5272:1: ( ( ruleClassType ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5273:1: ( ruleClassType )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5273:1: ( ruleClassType )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5274:1: ruleClassType
            {
             before(grammarAccess.getModelAccess().getClasClassTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_010643);
            ruleClassType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getClasClassTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ClasAssignment_0"


    // $ANTLR start "rule__Model__ProcAssignment_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5283:1: rule__Model__ProcAssignment_1 : ( ruleProcedure ) ;
    public final void rule__Model__ProcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5287:1: ( ( ruleProcedure ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5288:1: ( ruleProcedure )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5288:1: ( ruleProcedure )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5289:1: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getProcProcedureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_110674);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProcProcedureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProcAssignment_1"


    // $ANTLR start "rule__Model__StatemAssignment_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5298:1: rule__Model__StatemAssignment_2 : ( ruleStatement ) ;
    public final void rule__Model__StatemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5302:1: ( ( ruleStatement ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5303:1: ( ruleStatement )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5303:1: ( ruleStatement )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5304:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatemStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_210705);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatemStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatemAssignment_2"


    // $ANTLR start "rule__Model__ExpAssignment_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5313:1: rule__Model__ExpAssignment_3 : ( ruleExpression ) ;
    public final void rule__Model__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5317:1: ( ( ruleExpression ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5318:1: ( ruleExpression )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5318:1: ( ruleExpression )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5319:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_310736);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExpAssignment_3"


    // $ANTLR start "rule__ClassType__NameAssignment_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5328:1: rule__ClassType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5332:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5333:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5333:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5334:1: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_110767); 
             after(grammarAccess.getClassTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__NameAssignment_1"


    // $ANTLR start "rule__ClassType__NoclassAssignment_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5343:1: rule__ClassType__NoclassAssignment_2_0 : ( ( 'NOCLASS' ) ) ;
    public final void rule__ClassType__NoclassAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5347:1: ( ( ( 'NOCLASS' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5348:1: ( ( 'NOCLASS' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5348:1: ( ( 'NOCLASS' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5349:1: ( 'NOCLASS' )
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNOCLASSKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5350:1: ( 'NOCLASS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5351:1: 'NOCLASS'
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNOCLASSKeyword_2_0_0()); 
            match(input,41,FOLLOW_41_in_rule__ClassType__NoclassAssignment_2_010803); 
             after(grammarAccess.getClassTypeAccess().getNoclassNOCLASSKeyword_2_0_0()); 

            }

             after(grammarAccess.getClassTypeAccess().getNoclassNOCLASSKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__NoclassAssignment_2_0"


    // $ANTLR start "rule__ClassType__PrefixAssignment_2_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5366:1: rule__ClassType__PrefixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__ClassType__PrefixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5370:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5371:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5371:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5372:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getPrefixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_110842);
            ruleMultID();

            state._fsp--;

             after(grammarAccess.getClassTypeAccess().getPrefixMultIDParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__PrefixAssignment_2_1_1"


    // $ANTLR start "rule__ClassType__SuffixAssignment_2_2_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5381:1: rule__ClassType__SuffixAssignment_2_2_1 : ( ruleMultID ) ;
    public final void rule__ClassType__SuffixAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5385:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5386:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5386:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5387:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getSuffixMultIDParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_110873);
            ruleMultID();

            state._fsp--;

             after(grammarAccess.getClassTypeAccess().getSuffixMultIDParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__SuffixAssignment_2_2_1"


    // $ANTLR start "rule__ClassType__BlockingAssignment_2_3_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5396:1: rule__ClassType__BlockingAssignment_2_3_1 : ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) ;
    public final void rule__ClassType__BlockingAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5400:1: ( ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5401:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5401:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5402:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAlternatives_2_3_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5403:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5403:2: rule__ClassType__BlockingAlternatives_2_3_1_0
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_110904);
            rule__ClassType__BlockingAlternatives_2_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getBlockingAlternatives_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__BlockingAssignment_2_3_1"


    // $ANTLR start "rule__Procedure__NameAssignment_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5412:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5416:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5417:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5417:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5418:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_110937); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__NameAssignment_1"


    // $ANTLR start "rule__Procedure__PrefixAssignment_2_0_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5427:1: rule__Procedure__PrefixAssignment_2_0_1 : ( ruleMultID ) ;
    public final void rule__Procedure__PrefixAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5431:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5432:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5432:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5433:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getPrefixMultIDParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_110968);
            ruleMultID();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getPrefixMultIDParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__PrefixAssignment_2_0_1"


    // $ANTLR start "rule__Procedure__SuffixAssignment_2_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5442:1: rule__Procedure__SuffixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__Procedure__SuffixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5446:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5447:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5447:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5448:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getSuffixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_110999);
            ruleMultID();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getSuffixMultIDParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__SuffixAssignment_2_1_1"


    // $ANTLR start "rule__Procedure__TypesAssignment_2_2_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5457:1: rule__Procedure__TypesAssignment_2_2_1 : ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) ;
    public final void rule__Procedure__TypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5461:1: ( ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5462:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5462:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5463:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAlternatives_2_2_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5464:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5464:2: rule__Procedure__TypesAlternatives_2_2_1_0
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_111030);
            rule__Procedure__TypesAlternatives_2_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getTypesAlternatives_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__TypesAssignment_2_2_1"


    // $ANTLR start "rule__Statement__NameAssignment_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5473:1: rule__Statement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5477:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5478:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5478:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5479:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_111063); 
             after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_1"


    // $ANTLR start "rule__Statement__RepAssignment_2_0_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5488:1: rule__Statement__RepAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__Statement__RepAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5492:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5493:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5493:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5494:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getRepIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_111094); 
             after(grammarAccess.getStatementAccess().getRepIDTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__RepAssignment_2_0_1"


    // $ANTLR start "rule__Statement__UntilAssignment_2_0_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5503:1: rule__Statement__UntilAssignment_2_0_3 : ( RULE_ID ) ;
    public final void rule__Statement__UntilAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5507:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5508:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5508:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5509:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getUntilIDTerminalRuleCall_2_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_311125); 
             after(grammarAccess.getStatementAccess().getUntilIDTerminalRuleCall_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__UntilAssignment_2_0_3"


    // $ANTLR start "rule__Statement__WhileAssignment_2_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5518:1: rule__Statement__WhileAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Statement__WhileAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5522:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5523:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5523:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5524:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getWhileIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_111156); 
             after(grammarAccess.getStatementAccess().getWhileIDTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__WhileAssignment_2_1_1"


    // $ANTLR start "rule__Statement__DoAssignment_2_1_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5533:1: rule__Statement__DoAssignment_2_1_3 : ( RULE_ID ) ;
    public final void rule__Statement__DoAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5537:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5538:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5538:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5539:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getDoIDTerminalRuleCall_2_1_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_311187); 
             after(grammarAccess.getStatementAccess().getDoIDTerminalRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__DoAssignment_2_1_3"


    // $ANTLR start "rule__Statement__ForAssignment_2_2_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5548:1: rule__Statement__ForAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ForAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5552:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5553:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5553:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5554:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getForIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_111218); 
             after(grammarAccess.getStatementAccess().getForIDTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ForAssignment_2_2_1"


    // $ANTLR start "rule__Statement__VarAssignment_2_3_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5563:1: rule__Statement__VarAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__Statement__VarAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5567:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5568:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5568:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5569:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVarIDTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_111249); 
             after(grammarAccess.getStatementAccess().getVarIDTerminalRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VarAssignment_2_3_1"


    // $ANTLR start "rule__Statement__ExAssignment_2_3_2_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5578:1: rule__Statement__ExAssignment_2_3_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5582:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5583:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5583:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5584:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_111280); 
             after(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ExAssignment_2_3_2_1"


    // $ANTLR start "rule__Statement__ValAssignment_2_4_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5593:1: rule__Statement__ValAssignment_2_4_1 : ( RULE_ID ) ;
    public final void rule__Statement__ValAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5597:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5598:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5598:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5599:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getValIDTerminalRuleCall_2_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_111311); 
             after(grammarAccess.getStatementAccess().getValIDTerminalRuleCall_2_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ValAssignment_2_4_1"


    // $ANTLR start "rule__Statement__ExAssignment_2_4_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5608:1: rule__Statement__ExAssignment_2_4_3 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5612:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5613:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5613:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5614:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_4_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_311342); 
             after(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__ExAssignment_2_4_3"


    // $ANTLR start "rule__Expression__NameAssignment_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5623:1: rule__Expression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5627:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5628:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5628:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5629:1: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_111373); 
             after(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__NameAssignment_1"


    // $ANTLR start "rule__Expression__PrecAssignment_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5638:1: rule__Expression__PrecAssignment_2 : ( rulePrecedence ) ;
    public final void rule__Expression__PrecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5642:1: ( ( rulePrecedence ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5643:1: ( rulePrecedence )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5643:1: ( rulePrecedence )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5644:1: rulePrecedence
            {
             before(grammarAccess.getExpressionAccess().getPrecPrecedenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrecedence_in_rule__Expression__PrecAssignment_211404);
            rulePrecedence();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getPrecPrecedenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__PrecAssignment_2"


    // $ANTLR start "rule__Precedence__RuletypAssignment_0_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5653:1: rule__Precedence__RuletypAssignment_0_0 : ( ( 'CALLER' ) ) ;
    public final void rule__Precedence__RuletypAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5657:1: ( ( ( 'CALLER' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5658:1: ( ( 'CALLER' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5658:1: ( ( 'CALLER' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5659:1: ( 'CALLER' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5660:1: ( 'CALLER' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5661:1: 'CALLER'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Precedence__RuletypAssignment_0_011440); 
             after(grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_0_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_0_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5676:1: rule__Precedence__RuleAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5680:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5681:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5681:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5682:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_0_111479); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_0_1"


    // $ANTLR start "rule__Precedence__Feature1Assignment_0_2_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5691:1: rule__Precedence__Feature1Assignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5695:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5696:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5696:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5697:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_0_2_111510); 
             after(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Feature1Assignment_0_2_1"


    // $ANTLR start "rule__Precedence__RuletypAssignment_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5706:1: rule__Precedence__RuletypAssignment_1_0 : ( ( 'PREFIX' ) ) ;
    public final void rule__Precedence__RuletypAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5710:1: ( ( ( 'PREFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5711:1: ( ( 'PREFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5711:1: ( ( 'PREFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5712:1: ( 'PREFIX' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_1_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5713:1: ( 'PREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5714:1: 'PREFIX'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Precedence__RuletypAssignment_1_011546); 
             after(grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_1_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_1_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5729:1: rule__Precedence__RuleAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5733:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5734:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5734:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5735:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_1_111585); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_1_1"


    // $ANTLR start "rule__Precedence__PrefixAssignment_1_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5744:1: rule__Precedence__PrefixAssignment_1_2 : ( ruleMultString ) ;
    public final void rule__Precedence__PrefixAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5748:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5749:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5749:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5750:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__PrefixAssignment_1_211616);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__PrefixAssignment_1_2"


    // $ANTLR start "rule__Precedence__Feature1Assignment_1_3_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5759:1: rule__Precedence__Feature1Assignment_1_3_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5763:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5764:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5764:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5765:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_1_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_1_3_011647); 
             after(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Feature1Assignment_1_3_0"


    // $ANTLR start "rule__Precedence__Par1Assignment_1_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5774:1: rule__Precedence__Par1Assignment_1_4 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5778:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5779:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5779:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5780:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_1_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_1_411678); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_1_4"


    // $ANTLR start "rule__Precedence__RuletypAssignment_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5789:1: rule__Precedence__RuletypAssignment_2_0 : ( ( 'SUFFIX' ) ) ;
    public final void rule__Precedence__RuletypAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5793:1: ( ( ( 'SUFFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5794:1: ( ( 'SUFFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5794:1: ( ( 'SUFFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5795:1: ( 'SUFFIX' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5796:1: ( 'SUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5797:1: 'SUFFIX'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_2_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Precedence__RuletypAssignment_2_011714); 
             after(grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_2_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_2_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_2_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5812:1: rule__Precedence__RuleAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5816:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5817:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5817:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5818:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_2_111753); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_2_1"


    // $ANTLR start "rule__Precedence__Feature1Assignment_2_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5827:1: rule__Precedence__Feature1Assignment_2_2_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5831:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5832:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5832:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5833:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_2_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_2_2_011784); 
             after(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Feature1Assignment_2_2_0"


    // $ANTLR start "rule__Precedence__Par1Assignment_2_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5842:1: rule__Precedence__Par1Assignment_2_3 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5846:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5847:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5847:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5848:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_2_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_2_311815); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_2_3"


    // $ANTLR start "rule__Precedence__SuffixAssignment_2_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5857:1: rule__Precedence__SuffixAssignment_2_4 : ( ruleMultString ) ;
    public final void rule__Precedence__SuffixAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5861:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5862:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5862:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5863:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__SuffixAssignment_2_411846);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__SuffixAssignment_2_4"


    // $ANTLR start "rule__Precedence__RuletypAssignment_3_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5872:1: rule__Precedence__RuletypAssignment_3_0 : ( ( 'INFIX' ) ) ;
    public final void rule__Precedence__RuletypAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5876:1: ( ( ( 'INFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5877:1: ( ( 'INFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5877:1: ( ( 'INFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5878:1: ( 'INFIX' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_3_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5879:1: ( 'INFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5880:1: 'INFIX'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Precedence__RuletypAssignment_3_011882); 
             after(grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_3_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_3_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_3_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5895:1: rule__Precedence__RuleAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5899:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5900:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5900:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5901:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_3_111921); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_3_1"


    // $ANTLR start "rule__Precedence__Feature1Assignment_3_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5910:1: rule__Precedence__Feature1Assignment_3_2_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5914:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5915:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5915:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5916:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_3_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_3_2_011952); 
             after(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Feature1Assignment_3_2_0"


    // $ANTLR start "rule__Precedence__Par1Assignment_3_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5925:1: rule__Precedence__Par1Assignment_3_3 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5929:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5930:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5930:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5931:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_3_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_3_311983); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_3_3"


    // $ANTLR start "rule__Precedence__InfixAssignment_3_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5940:1: rule__Precedence__InfixAssignment_3_4 : ( ruleMultString ) ;
    public final void rule__Precedence__InfixAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5944:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5945:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5945:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5946:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__InfixAssignment_3_412014);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__InfixAssignment_3_4"


    // $ANTLR start "rule__Precedence__Feature2Assignment_3_5_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5955:1: rule__Precedence__Feature2Assignment_3_5_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature2Assignment_3_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5959:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5960:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5960:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5961:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_3_5_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature2Assignment_3_5_012045); 
             after(grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_3_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Feature2Assignment_3_5_0"


    // $ANTLR start "rule__Precedence__Par2Assignment_3_6"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5970:1: rule__Precedence__Par2Assignment_3_6 : ( RULE_ID ) ;
    public final void rule__Precedence__Par2Assignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5974:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5975:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5975:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5976:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_3_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_3_612076); 
             after(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par2Assignment_3_6"


    // $ANTLR start "rule__Precedence__RuletypAssignment_4_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5985:1: rule__Precedence__RuletypAssignment_4_0 : ( ( 'OUTER' ) ) ;
    public final void rule__Precedence__RuletypAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5989:1: ( ( ( 'OUTER' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5990:1: ( ( 'OUTER' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5990:1: ( ( 'OUTER' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5991:1: ( 'OUTER' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_4_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5992:1: ( 'OUTER' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5993:1: 'OUTER'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_4_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Precedence__RuletypAssignment_4_012112); 
             after(grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_4_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypOUTERKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_4_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_4_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6008:1: rule__Precedence__RuleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6012:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6013:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6013:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6014:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_4_112151); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_4_1"


    // $ANTLR start "rule__Precedence__Feature1Assignment_4_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6023:1: rule__Precedence__Feature1Assignment_4_2_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6027:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6028:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6028:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6029:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_4_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_4_2_012182); 
             after(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Feature1Assignment_4_2_0"


    // $ANTLR start "rule__Precedence__Par1Assignment_4_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6038:1: rule__Precedence__Par1Assignment_4_3 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6042:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6043:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6043:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6044:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_4_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_4_312213); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_4_3"


    // $ANTLR start "rule__Precedence__InnerAssignment_4_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6053:1: rule__Precedence__InnerAssignment_4_4 : ( ruleInnerPrecedence ) ;
    public final void rule__Precedence__InnerAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6057:1: ( ( ruleInnerPrecedence ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6058:1: ( ruleInnerPrecedence )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6058:1: ( ruleInnerPrecedence )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6059:1: ruleInnerPrecedence
            {
             before(grammarAccess.getPrecedenceAccess().getInnerInnerPrecedenceParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_ruleInnerPrecedence_in_rule__Precedence__InnerAssignment_4_412244);
            ruleInnerPrecedence();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getInnerInnerPrecedenceParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__InnerAssignment_4_4"


    // $ANTLR start "rule__Precedence__RuletypAssignment_5_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6068:1: rule__Precedence__RuletypAssignment_5_0 : ( ( 'INFIXLEFT' ) ) ;
    public final void rule__Precedence__RuletypAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6072:1: ( ( ( 'INFIXLEFT' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6073:1: ( ( 'INFIXLEFT' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6073:1: ( ( 'INFIXLEFT' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6074:1: ( 'INFIXLEFT' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_5_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6075:1: ( 'INFIXLEFT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6076:1: 'INFIXLEFT'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_5_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Precedence__RuletypAssignment_5_012280); 
             after(grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_5_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_5_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_5_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6091:1: rule__Precedence__RuleAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6095:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6096:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6096:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6097:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_5_112319); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_5_1"


    // $ANTLR start "rule__Precedence__Par1Assignment_5_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6106:1: rule__Precedence__Par1Assignment_5_2 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6110:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6111:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6111:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6112:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_5_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_5_212350); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_5_2"


    // $ANTLR start "rule__Precedence__InfixleftAssignment_5_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6121:1: rule__Precedence__InfixleftAssignment_5_3 : ( ruleMultString ) ;
    public final void rule__Precedence__InfixleftAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6125:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6126:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6126:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6127:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getInfixleftMultStringParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__InfixleftAssignment_5_312381);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getInfixleftMultStringParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__InfixleftAssignment_5_3"


    // $ANTLR start "rule__Precedence__Par2Assignment_5_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6136:1: rule__Precedence__Par2Assignment_5_4 : ( RULE_ID ) ;
    public final void rule__Precedence__Par2Assignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6140:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6141:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6141:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6142:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_5_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_5_412412); 
             after(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par2Assignment_5_4"


    // $ANTLR start "rule__Precedence__RuletypAssignment_6_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6151:1: rule__Precedence__RuletypAssignment_6_0 : ( ( 'LITERAL' ) ) ;
    public final void rule__Precedence__RuletypAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6155:1: ( ( ( 'LITERAL' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6156:1: ( ( 'LITERAL' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6156:1: ( ( 'LITERAL' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6157:1: ( 'LITERAL' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypLITERALKeyword_6_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6158:1: ( 'LITERAL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6159:1: 'LITERAL'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypLITERALKeyword_6_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Precedence__RuletypAssignment_6_012448); 
             after(grammarAccess.getPrecedenceAccess().getRuletypLITERALKeyword_6_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypLITERALKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_6_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_6_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6174:1: rule__Precedence__RuleAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6178:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6179:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6179:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6180:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_6_112487); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_6_1"


    // $ANTLR start "rule__Precedence__LiteralAssignment_6_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6189:1: rule__Precedence__LiteralAssignment_6_2 : ( ( rule__Precedence__LiteralAlternatives_6_2_0 ) ) ;
    public final void rule__Precedence__LiteralAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6193:1: ( ( ( rule__Precedence__LiteralAlternatives_6_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6194:1: ( ( rule__Precedence__LiteralAlternatives_6_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6194:1: ( ( rule__Precedence__LiteralAlternatives_6_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6195:1: ( rule__Precedence__LiteralAlternatives_6_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getLiteralAlternatives_6_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6196:1: ( rule__Precedence__LiteralAlternatives_6_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6196:2: rule__Precedence__LiteralAlternatives_6_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__LiteralAlternatives_6_2_0_in_rule__Precedence__LiteralAssignment_6_212518);
            rule__Precedence__LiteralAlternatives_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getLiteralAlternatives_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__LiteralAssignment_6_2"


    // $ANTLR start "rule__Precedence__RuletypAssignment_7_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6205:1: rule__Precedence__RuletypAssignment_7_0 : ( ( 'BRACKET' ) ) ;
    public final void rule__Precedence__RuletypAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6209:1: ( ( ( 'BRACKET' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6210:1: ( ( 'BRACKET' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6210:1: ( ( 'BRACKET' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6211:1: ( 'BRACKET' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_7_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6212:1: ( 'BRACKET' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6213:1: 'BRACKET'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_7_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Precedence__RuletypAssignment_7_012556); 
             after(grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_7_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_7_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_7_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6228:1: rule__Precedence__RuleAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6232:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6233:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6233:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6234:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_7_112595); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_7_1"


    // $ANTLR start "rule__Precedence__BracketAssignment_7_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6243:1: rule__Precedence__BracketAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__Precedence__BracketAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6247:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6248:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6248:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6249:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_7_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__BracketAssignment_7_212626); 
             after(grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__BracketAssignment_7_2"


    // $ANTLR start "rule__Precedence__RuletypAssignment_8_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6258:1: rule__Precedence__RuletypAssignment_8_0 : ( ( 'BRACES' ) ) ;
    public final void rule__Precedence__RuletypAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6262:1: ( ( ( 'BRACES' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6263:1: ( ( 'BRACES' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6263:1: ( ( 'BRACES' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6264:1: ( 'BRACES' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_8_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6265:1: ( 'BRACES' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6266:1: 'BRACES'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_8_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Precedence__RuletypAssignment_8_012662); 
             after(grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_8_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_8_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_8_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6281:1: rule__Precedence__RuleAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6285:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6286:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6286:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6287:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_8_112701); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_8_1"


    // $ANTLR start "rule__Precedence__BracesAssignment_8_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6296:1: rule__Precedence__BracesAssignment_8_2 : ( RULE_ID ) ;
    public final void rule__Precedence__BracesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6300:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6301:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6301:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6302:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_8_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__BracesAssignment_8_212732); 
             after(grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__BracesAssignment_8_2"


    // $ANTLR start "rule__Precedence__RuletypAssignment_9_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6311:1: rule__Precedence__RuletypAssignment_9_0 : ( ( 'PARENTHESIS' ) ) ;
    public final void rule__Precedence__RuletypAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6315:1: ( ( ( 'PARENTHESIS' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6316:1: ( ( 'PARENTHESIS' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6316:1: ( ( 'PARENTHESIS' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6317:1: ( 'PARENTHESIS' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_9_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6318:1: ( 'PARENTHESIS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6319:1: 'PARENTHESIS'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_9_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Precedence__RuletypAssignment_9_012768); 
             after(grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_9_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_9_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_9_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6334:1: rule__Precedence__RuleAssignment_9_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6338:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6339:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6339:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6340:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_9_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_9_112807); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_9_1"


    // $ANTLR start "rule__Precedence__ParenthesisAssignment_9_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6349:1: rule__Precedence__ParenthesisAssignment_9_2 : ( RULE_ID ) ;
    public final void rule__Precedence__ParenthesisAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6353:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6354:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6354:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6355:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_9_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__ParenthesisAssignment_9_212838); 
             after(grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__ParenthesisAssignment_9_2"


    // $ANTLR start "rule__Precedence__RuletypAssignment_10_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6364:1: rule__Precedence__RuletypAssignment_10_0 : ( ( 'ANGLE' ) ) ;
    public final void rule__Precedence__RuletypAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6368:1: ( ( ( 'ANGLE' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6369:1: ( ( 'ANGLE' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6369:1: ( ( 'ANGLE' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6370:1: ( 'ANGLE' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_10_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6371:1: ( 'ANGLE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6372:1: 'ANGLE'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_10_0_0()); 
            match(input,49,FOLLOW_49_in_rule__Precedence__RuletypAssignment_10_012874); 
             after(grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_10_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypANGLEKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuletypAssignment_10_0"


    // $ANTLR start "rule__Precedence__RuleAssignment_10_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6387:1: rule__Precedence__RuleAssignment_10_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6391:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6392:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6392:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6393:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_10_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_10_112913); 
             after(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__RuleAssignment_10_1"


    // $ANTLR start "rule__Precedence__AngleAssignment_10_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6402:1: rule__Precedence__AngleAssignment_10_2 : ( RULE_ID ) ;
    public final void rule__Precedence__AngleAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6406:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6407:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6407:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6408:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getAngleIDTerminalRuleCall_10_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__AngleAssignment_10_212944); 
             after(grammarAccess.getPrecedenceAccess().getAngleIDTerminalRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__AngleAssignment_10_2"


    // $ANTLR start "rule__InnerPrecedence__RuletypAssignment_0_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6417:1: rule__InnerPrecedence__RuletypAssignment_0_0 : ( ( 'INNERPREFIX' ) ) ;
    public final void rule__InnerPrecedence__RuletypAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6421:1: ( ( ( 'INNERPREFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6422:1: ( ( 'INNERPREFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6422:1: ( ( 'INNERPREFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6423:1: ( 'INNERPREFIX' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_0_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6424:1: ( 'INNERPREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6425:1: 'INNERPREFIX'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_0_0_0()); 
            match(input,50,FOLLOW_50_in_rule__InnerPrecedence__RuletypAssignment_0_012980); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_0_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPREFIXKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuletypAssignment_0_0"


    // $ANTLR start "rule__InnerPrecedence__PrefixAssignment_0_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6440:1: rule__InnerPrecedence__PrefixAssignment_0_1 : ( ruleMultString ) ;
    public final void rule__InnerPrecedence__PrefixAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6444:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6445:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6445:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6446:1: ruleMultString
            {
             before(grammarAccess.getInnerPrecedenceAccess().getPrefixMultStringParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__InnerPrecedence__PrefixAssignment_0_113019);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getInnerPrecedenceAccess().getPrefixMultStringParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__PrefixAssignment_0_1"


    // $ANTLR start "rule__InnerPrecedence__Feature1Assignment_0_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6455:1: rule__InnerPrecedence__Feature1Assignment_0_2_0 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__Feature1Assignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6459:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6460:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6460:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6461:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_0_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__Feature1Assignment_0_2_013050); 
             after(grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Feature1Assignment_0_2_0"


    // $ANTLR start "rule__InnerPrecedence__Par2Assignment_0_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6470:1: rule__InnerPrecedence__Par2Assignment_0_3 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__Par2Assignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6474:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6475:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6475:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6476:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__Par2Assignment_0_313081); 
             after(grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Par2Assignment_0_3"


    // $ANTLR start "rule__InnerPrecedence__RuletypAssignment_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6485:1: rule__InnerPrecedence__RuletypAssignment_1_0 : ( ( 'INNERSUFFIX' ) ) ;
    public final void rule__InnerPrecedence__RuletypAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6489:1: ( ( ( 'INNERSUFFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6490:1: ( ( 'INNERSUFFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6490:1: ( ( 'INNERSUFFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6491:1: ( 'INNERSUFFIX' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_1_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6492:1: ( 'INNERSUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6493:1: 'INNERSUFFIX'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_1_0_0()); 
            match(input,51,FOLLOW_51_in_rule__InnerPrecedence__RuletypAssignment_1_013117); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_1_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERSUFFIXKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuletypAssignment_1_0"


    // $ANTLR start "rule__InnerPrecedence__SuffixAssignment_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6508:1: rule__InnerPrecedence__SuffixAssignment_1_1 : ( ruleMultString ) ;
    public final void rule__InnerPrecedence__SuffixAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6512:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6513:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6513:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6514:1: ruleMultString
            {
             before(grammarAccess.getInnerPrecedenceAccess().getSuffixMultStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__InnerPrecedence__SuffixAssignment_1_113156);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getInnerPrecedenceAccess().getSuffixMultStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__SuffixAssignment_1_1"


    // $ANTLR start "rule__InnerPrecedence__RuletypAssignment_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6523:1: rule__InnerPrecedence__RuletypAssignment_2_0 : ( ( 'INNERINFIX' ) ) ;
    public final void rule__InnerPrecedence__RuletypAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6527:1: ( ( ( 'INNERINFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6528:1: ( ( 'INNERINFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6528:1: ( ( 'INNERINFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6529:1: ( 'INNERINFIX' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6530:1: ( 'INNERINFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6531:1: 'INNERINFIX'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_2_0_0()); 
            match(input,52,FOLLOW_52_in_rule__InnerPrecedence__RuletypAssignment_2_013192); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_2_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuletypAssignment_2_0"


    // $ANTLR start "rule__InnerPrecedence__ModAssignment_2_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6546:1: rule__InnerPrecedence__ModAssignment_2_1_0 : ( ( 'CALLER' ) ) ;
    public final void rule__InnerPrecedence__ModAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6550:1: ( ( ( 'CALLER' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6551:1: ( ( 'CALLER' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6551:1: ( ( 'CALLER' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6552:1: ( 'CALLER' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_2_1_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6553:1: ( 'CALLER' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6554:1: 'CALLER'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_2_1_0_0()); 
            match(input,42,FOLLOW_42_in_rule__InnerPrecedence__ModAssignment_2_1_013236); 
             after(grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_2_1_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getModCALLERKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__ModAssignment_2_1_0"


    // $ANTLR start "rule__InnerPrecedence__RuleAssignment_2_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6569:1: rule__InnerPrecedence__RuleAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__RuleAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6573:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6574:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6574:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6575:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_2_1_113275); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuleAssignment_2_1_1"


    // $ANTLR start "rule__InnerPrecedence__Feature1Assignment_2_1_2_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6584:1: rule__InnerPrecedence__Feature1Assignment_2_1_2_1 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__Feature1Assignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6588:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6589:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6589:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6590:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__Feature1Assignment_2_1_2_113306); 
             after(grammarAccess.getInnerPrecedenceAccess().getFeature1IDTerminalRuleCall_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Feature1Assignment_2_1_2_1"


    // $ANTLR start "rule__InnerPrecedence__InfixAssignment_2_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6599:1: rule__InnerPrecedence__InfixAssignment_2_2 : ( ruleMultString ) ;
    public final void rule__InnerPrecedence__InfixAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6603:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6604:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6604:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6605:1: ruleMultString
            {
             before(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__InnerPrecedence__InfixAssignment_2_213337);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getInnerPrecedenceAccess().getInfixMultStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__InfixAssignment_2_2"


    // $ANTLR start "rule__InnerPrecedence__Feature2Assignment_2_3_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6614:1: rule__InnerPrecedence__Feature2Assignment_2_3_0 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__Feature2Assignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6618:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6619:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6619:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6620:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getFeature2IDTerminalRuleCall_2_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__Feature2Assignment_2_3_013368); 
             after(grammarAccess.getInnerPrecedenceAccess().getFeature2IDTerminalRuleCall_2_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Feature2Assignment_2_3_0"


    // $ANTLR start "rule__InnerPrecedence__Par2Assignment_2_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6629:1: rule__InnerPrecedence__Par2Assignment_2_4 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__Par2Assignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6633:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6634:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6634:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6635:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_2_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__Par2Assignment_2_413399); 
             after(grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Par2Assignment_2_4"


    // $ANTLR start "rule__InnerPrecedence__RuletypAssignment_3_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6644:1: rule__InnerPrecedence__RuletypAssignment_3_0 : ( ( 'INNERINFIXLEFT' ) ) ;
    public final void rule__InnerPrecedence__RuletypAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6648:1: ( ( ( 'INNERINFIXLEFT' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6649:1: ( ( 'INNERINFIXLEFT' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6649:1: ( ( 'INNERINFIXLEFT' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6650:1: ( 'INNERINFIXLEFT' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXLEFTKeyword_3_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6651:1: ( 'INNERINFIXLEFT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6652:1: 'INNERINFIXLEFT'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXLEFTKeyword_3_0_0()); 
            match(input,53,FOLLOW_53_in_rule__InnerPrecedence__RuletypAssignment_3_013435); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXLEFTKeyword_3_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERINFIXLEFTKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuletypAssignment_3_0"


    // $ANTLR start "rule__InnerPrecedence__InfixleftAssignment_3_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6667:1: rule__InnerPrecedence__InfixleftAssignment_3_1 : ( ruleMultString ) ;
    public final void rule__InnerPrecedence__InfixleftAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6671:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6672:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6672:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6673:1: ruleMultString
            {
             before(grammarAccess.getInnerPrecedenceAccess().getInfixleftMultStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__InnerPrecedence__InfixleftAssignment_3_113474);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getInnerPrecedenceAccess().getInfixleftMultStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__InfixleftAssignment_3_1"


    // $ANTLR start "rule__InnerPrecedence__Par2Assignment_3_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6682:1: rule__InnerPrecedence__Par2Assignment_3_2 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__Par2Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6686:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6687:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6687:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6688:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__Par2Assignment_3_213505); 
             after(grammarAccess.getInnerPrecedenceAccess().getPar2IDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__Par2Assignment_3_2"


    // $ANTLR start "rule__InnerPrecedence__RuletypAssignment_4_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6697:1: rule__InnerPrecedence__RuletypAssignment_4_0 : ( ( 'INNERBRACKET' ) ) ;
    public final void rule__InnerPrecedence__RuletypAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6701:1: ( ( ( 'INNERBRACKET' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6702:1: ( ( 'INNERBRACKET' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6702:1: ( ( 'INNERBRACKET' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6703:1: ( 'INNERBRACKET' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_4_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6704:1: ( 'INNERBRACKET' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6705:1: 'INNERBRACKET'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_4_0_0()); 
            match(input,54,FOLLOW_54_in_rule__InnerPrecedence__RuletypAssignment_4_013541); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_4_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACKETKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuletypAssignment_4_0"


    // $ANTLR start "rule__InnerPrecedence__RuleAssignment_4_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6720:1: rule__InnerPrecedence__RuleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6724:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6725:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6725:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6726:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_4_113580); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuleAssignment_4_1"


    // $ANTLR start "rule__InnerPrecedence__BracketAssignment_4_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6735:1: rule__InnerPrecedence__BracketAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__BracketAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6739:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6740:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6740:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6741:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getBracketIDTerminalRuleCall_4_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__BracketAssignment_4_213611); 
             after(grammarAccess.getInnerPrecedenceAccess().getBracketIDTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__BracketAssignment_4_2"


    // $ANTLR start "rule__InnerPrecedence__RuletypAssignment_5_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6750:1: rule__InnerPrecedence__RuletypAssignment_5_0 : ( ( 'INNERBRACES' ) ) ;
    public final void rule__InnerPrecedence__RuletypAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6754:1: ( ( ( 'INNERBRACES' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6755:1: ( ( 'INNERBRACES' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6755:1: ( ( 'INNERBRACES' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6756:1: ( 'INNERBRACES' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_5_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6757:1: ( 'INNERBRACES' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6758:1: 'INNERBRACES'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_5_0_0()); 
            match(input,55,FOLLOW_55_in_rule__InnerPrecedence__RuletypAssignment_5_013647); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_5_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERBRACESKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuletypAssignment_5_0"


    // $ANTLR start "rule__InnerPrecedence__RuleAssignment_5_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6773:1: rule__InnerPrecedence__RuleAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__RuleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6777:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6778:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6778:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6779:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_5_113686); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuleAssignment_5_1"


    // $ANTLR start "rule__InnerPrecedence__BracesAssignment_5_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6788:1: rule__InnerPrecedence__BracesAssignment_5_2 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__BracesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6792:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6793:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6793:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6794:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getBracesIDTerminalRuleCall_5_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__BracesAssignment_5_213717); 
             after(grammarAccess.getInnerPrecedenceAccess().getBracesIDTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__BracesAssignment_5_2"


    // $ANTLR start "rule__InnerPrecedence__RuletypAssignment_6_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6803:1: rule__InnerPrecedence__RuletypAssignment_6_0 : ( ( 'INNERPARENTHESIS' ) ) ;
    public final void rule__InnerPrecedence__RuletypAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6807:1: ( ( ( 'INNERPARENTHESIS' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6808:1: ( ( 'INNERPARENTHESIS' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6808:1: ( ( 'INNERPARENTHESIS' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6809:1: ( 'INNERPARENTHESIS' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_6_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6810:1: ( 'INNERPARENTHESIS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6811:1: 'INNERPARENTHESIS'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_6_0_0()); 
            match(input,56,FOLLOW_56_in_rule__InnerPrecedence__RuletypAssignment_6_013753); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_6_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERPARENTHESISKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuletypAssignment_6_0"


    // $ANTLR start "rule__InnerPrecedence__RuleAssignment_6_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6826:1: rule__InnerPrecedence__RuleAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__RuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6830:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6831:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6831:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6832:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_6_113792); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuleAssignment_6_1"


    // $ANTLR start "rule__InnerPrecedence__ParenthesisAssignment_6_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6841:1: rule__InnerPrecedence__ParenthesisAssignment_6_2 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__ParenthesisAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6845:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6846:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6846:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6847:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getParenthesisIDTerminalRuleCall_6_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__ParenthesisAssignment_6_213823); 
             after(grammarAccess.getInnerPrecedenceAccess().getParenthesisIDTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__ParenthesisAssignment_6_2"


    // $ANTLR start "rule__InnerPrecedence__RuletypAssignment_7_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6856:1: rule__InnerPrecedence__RuletypAssignment_7_0 : ( ( 'INNERANGLE' ) ) ;
    public final void rule__InnerPrecedence__RuletypAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6860:1: ( ( ( 'INNERANGLE' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6861:1: ( ( 'INNERANGLE' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6861:1: ( ( 'INNERANGLE' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6862:1: ( 'INNERANGLE' )
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_7_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6863:1: ( 'INNERANGLE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6864:1: 'INNERANGLE'
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_7_0_0()); 
            match(input,57,FOLLOW_57_in_rule__InnerPrecedence__RuletypAssignment_7_013859); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_7_0_0()); 

            }

             after(grammarAccess.getInnerPrecedenceAccess().getRuletypINNERANGLEKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuletypAssignment_7_0"


    // $ANTLR start "rule__InnerPrecedence__RuleAssignment_7_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6879:1: rule__InnerPrecedence__RuleAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__RuleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6883:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6884:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6884:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6885:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_7_113898); 
             after(grammarAccess.getInnerPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__RuleAssignment_7_1"


    // $ANTLR start "rule__InnerPrecedence__AngleAssignment_7_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6894:1: rule__InnerPrecedence__AngleAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__InnerPrecedence__AngleAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6898:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6899:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6899:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6900:1: RULE_ID
            {
             before(grammarAccess.getInnerPrecedenceAccess().getAngleIDTerminalRuleCall_7_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InnerPrecedence__AngleAssignment_7_213929); 
             after(grammarAccess.getInnerPrecedenceAccess().getAngleIDTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InnerPrecedence__AngleAssignment_7_2"


    // $ANTLR start "rule__MultID__MiAssignment_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6909:1: rule__MultID__MiAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__MultID__MiAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6913:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6914:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6914:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6915:1: RULE_ID
            {
             before(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_013960); 
             after(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__MiAssignment_1_0"


    // $ANTLR start "rule__MultID__MiAssignment_1_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6924:1: rule__MultID__MiAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__MultID__MiAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6928:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6929:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6929:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6930:1: RULE_ID
            {
             before(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_1_113991); 
             after(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__MiAssignment_1_1_1"


    // $ANTLR start "rule__MultString__MsAssignment_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6939:1: rule__MultString__MsAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__MultString__MsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6943:1: ( ( RULE_STRING ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6944:1: ( RULE_STRING )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6944:1: ( RULE_STRING )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6945:1: RULE_STRING
            {
             before(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_014022); 
             after(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__MsAssignment_1_0"


    // $ANTLR start "rule__MultString__MsAssignment_1_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6954:1: rule__MultString__MsAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__MultString__MsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6958:1: ( ( RULE_STRING ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6959:1: ( RULE_STRING )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6959:1: ( RULE_STRING )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6960:1: RULE_STRING
            {
             before(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_1_114053); 
             after(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__MsAssignment_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000002014400002L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__0_in_ruleClassType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0_in_ruleProcedure215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0_in_ruleStatement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Alternatives_in_rulePrecedence395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_entryRuleInnerPrecedence422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerPrecedence429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Alternatives_in_ruleInnerPrecedence455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_entryRuleMultID482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultID489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__0_in_ruleMultID515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__0_in_ruleMultString575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ClasAssignment_0_in_rule__Model__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProcAssignment_1_in_rule__Model__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatemAssignment_2_in_rule__Model__Alternatives647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExpAssignment_3_in_rule__Model__Alternatives665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__NoclassAssignment_2_0_in_rule__ClassType__Alternatives_2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__0_in_rule__ClassType__Alternatives_2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__0_in_rule__ClassType__Alternatives_2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__0_in_rule__ClassType__Alternatives_2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ClassType__BlockingAlternatives_2_3_1_0786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ClassType__BlockingAlternatives_2_3_1_0806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__0_in_rule__Procedure__Alternatives_2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__0_in_rule__Procedure__Alternatives_2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__0_in_rule__Procedure__Alternatives_2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Procedure__TypesAlternatives_2_2_1_0910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Procedure__TypesAlternatives_2_2_1_0930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Procedure__TypesAlternatives_2_2_1_0950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Procedure__TypesAlternatives_2_2_1_0970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Procedure__TypesAlternatives_2_2_1_0990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__0_in_rule__Statement__Alternatives_21024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__0_in_rule__Statement__Alternatives_21042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__0_in_rule__Statement__Alternatives_21060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__0_in_rule__Statement__Alternatives_21078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__0_in_rule__Statement__Alternatives_21096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__0_in_rule__Precedence__Alternatives1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__0_in_rule__Precedence__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__0_in_rule__Precedence__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__0_in_rule__Precedence__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__0_in_rule__Precedence__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__0_in_rule__Precedence__Alternatives1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__0_in_rule__Precedence__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__0_in_rule__Precedence__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__0_in_rule__Precedence__Alternatives1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__0_in_rule__Precedence__Alternatives1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_10__0_in_rule__Precedence__Alternatives1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Precedence__LiteralAlternatives_6_2_01343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Precedence__LiteralAlternatives_6_2_01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Precedence__LiteralAlternatives_6_2_01383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Precedence__LiteralAlternatives_6_2_01403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0__0_in_rule__InnerPrecedence__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_1__0_in_rule__InnerPrecedence__Alternatives1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__0_in_rule__InnerPrecedence__Alternatives1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_3__0_in_rule__InnerPrecedence__Alternatives1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_4__0_in_rule__InnerPrecedence__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_5__0_in_rule__InnerPrecedence__Alternatives1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_6__0_in_rule__InnerPrecedence__Alternatives1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_7__0_in_rule__InnerPrecedence__Alternatives1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__MiAssignment_1_0_in_rule__MultID__Alternatives_11596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__0_in_rule__MultID__Alternatives_11614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__MsAssignment_1_0_in_rule__MultString__Alternatives_11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__0_in_rule__MultString__Alternatives_11665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassType__Group__0__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11758 = new BitSet(new long[]{0x0000020003800000L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1845 = new BitSet(new long[]{0x0000020003800002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01882 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__02005 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__02008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__12067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__02128 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__02131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__12190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__02251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__02254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Procedure__Group__0__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12313 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2400 = new BitSet(new long[]{0x0000000009800002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02437 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02560 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02683 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Statement__Group__0__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12868 = new BitSet(new long[]{0x00000016A0000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__13053 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__13056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__23113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__23116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__33175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__03240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__03243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13302 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13674 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13983 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__24043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__24046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__34105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Expression__Group__0__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14232 = new BitSet(new long[]{0x0003FC0001800800L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__14235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4319 = new BitSet(new long[]{0x0003FC0001800802L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__0__Impl_in_rule__Precedence__Group_0__04356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__1_in_rule__Precedence__Group_0__04359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_0_0_in_rule__Precedence__Group_0__0__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__1__Impl_in_rule__Precedence__Group_0__14416 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__2_in_rule__Precedence__Group_0__14419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_0_1_in_rule__Precedence__Group_0__1__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__2__Impl_in_rule__Precedence__Group_0__24476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0_2__0_in_rule__Precedence__Group_0__2__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0_2__0__Impl_in_rule__Precedence__Group_0_2__04540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0_2__1_in_rule__Precedence__Group_0_2__04543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Precedence__Group_0_2__0__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0_2__1__Impl_in_rule__Precedence__Group_0_2__14602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_0_2_1_in_rule__Precedence__Group_0_2__1__Impl4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__0__Impl_in_rule__Precedence__Group_1__04663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__1_in_rule__Precedence__Group_1__04666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_1_0_in_rule__Precedence__Group_1__0__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__1__Impl_in_rule__Precedence__Group_1__14723 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__2_in_rule__Precedence__Group_1__14726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_1_1_in_rule__Precedence__Group_1__1__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__2__Impl_in_rule__Precedence__Group_1__24783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__3_in_rule__Precedence__Group_1__24786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__PrefixAssignment_1_2_in_rule__Precedence__Group_1__2__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__3__Impl_in_rule__Precedence__Group_1__34843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__4_in_rule__Precedence__Group_1__34846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1_3__0_in_rule__Precedence__Group_1__3__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__4__Impl_in_rule__Precedence__Group_1__44904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_1_4_in_rule__Precedence__Group_1__4__Impl4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1_3__0__Impl_in_rule__Precedence__Group_1_3__04971 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1_3__1_in_rule__Precedence__Group_1_3__04974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_1_3_0_in_rule__Precedence__Group_1_3__0__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1_3__1__Impl_in_rule__Precedence__Group_1_3__15031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_1_3__1__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__0__Impl_in_rule__Precedence__Group_2__05094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__1_in_rule__Precedence__Group_2__05097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_2_0_in_rule__Precedence__Group_2__0__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__1__Impl_in_rule__Precedence__Group_2__15154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__2_in_rule__Precedence__Group_2__15157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_2_1_in_rule__Precedence__Group_2__1__Impl5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__2__Impl_in_rule__Precedence__Group_2__25214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__3_in_rule__Precedence__Group_2__25217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2_2__0_in_rule__Precedence__Group_2__2__Impl5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__3__Impl_in_rule__Precedence__Group_2__35275 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__4_in_rule__Precedence__Group_2__35278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_2_3_in_rule__Precedence__Group_2__3__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__4__Impl_in_rule__Precedence__Group_2__45335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__SuffixAssignment_2_4_in_rule__Precedence__Group_2__4__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2_2__0__Impl_in_rule__Precedence__Group_2_2__05402 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2_2__1_in_rule__Precedence__Group_2_2__05405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_2_2_0_in_rule__Precedence__Group_2_2__0__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2_2__1__Impl_in_rule__Precedence__Group_2_2__15462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_2_2__1__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__0__Impl_in_rule__Precedence__Group_3__05525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__1_in_rule__Precedence__Group_3__05528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_3_0_in_rule__Precedence__Group_3__0__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__1__Impl_in_rule__Precedence__Group_3__15585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__2_in_rule__Precedence__Group_3__15588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_3_1_in_rule__Precedence__Group_3__1__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__2__Impl_in_rule__Precedence__Group_3__25645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__3_in_rule__Precedence__Group_3__25648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_2__0_in_rule__Precedence__Group_3__2__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__3__Impl_in_rule__Precedence__Group_3__35706 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__4_in_rule__Precedence__Group_3__35709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_3_3_in_rule__Precedence__Group_3__3__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__4__Impl_in_rule__Precedence__Group_3__45766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__5_in_rule__Precedence__Group_3__45769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InfixAssignment_3_4_in_rule__Precedence__Group_3__4__Impl5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__5__Impl_in_rule__Precedence__Group_3__55826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__6_in_rule__Precedence__Group_3__55829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_5__0_in_rule__Precedence__Group_3__5__Impl5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__6__Impl_in_rule__Precedence__Group_3__65887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par2Assignment_3_6_in_rule__Precedence__Group_3__6__Impl5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_2__0__Impl_in_rule__Precedence__Group_3_2__05958 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_2__1_in_rule__Precedence__Group_3_2__05961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_3_2_0_in_rule__Precedence__Group_3_2__0__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_2__1__Impl_in_rule__Precedence__Group_3_2__16018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_3_2__1__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_5__0__Impl_in_rule__Precedence__Group_3_5__06081 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_5__1_in_rule__Precedence__Group_3_5__06084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature2Assignment_3_5_0_in_rule__Precedence__Group_3_5__0__Impl6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_5__1__Impl_in_rule__Precedence__Group_3_5__16141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_3_5__1__Impl6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__0__Impl_in_rule__Precedence__Group_4__06204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__1_in_rule__Precedence__Group_4__06207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_4_0_in_rule__Precedence__Group_4__0__Impl6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__1__Impl_in_rule__Precedence__Group_4__16264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__2_in_rule__Precedence__Group_4__16267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_4_1_in_rule__Precedence__Group_4__1__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__2__Impl_in_rule__Precedence__Group_4__26324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__3_in_rule__Precedence__Group_4__26327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_2__0_in_rule__Precedence__Group_4__2__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__3__Impl_in_rule__Precedence__Group_4__36385 = new BitSet(new long[]{0x03FC000000000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__4_in_rule__Precedence__Group_4__36388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_4_3_in_rule__Precedence__Group_4__3__Impl6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__4__Impl_in_rule__Precedence__Group_4__46445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InnerAssignment_4_4_in_rule__Precedence__Group_4__4__Impl6474 = new BitSet(new long[]{0x03FC000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InnerAssignment_4_4_in_rule__Precedence__Group_4__4__Impl6486 = new BitSet(new long[]{0x03FC000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_2__0__Impl_in_rule__Precedence__Group_4_2__06529 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_2__1_in_rule__Precedence__Group_4_2__06532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_4_2_0_in_rule__Precedence__Group_4_2__0__Impl6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_2__1__Impl_in_rule__Precedence__Group_4_2__16589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_4_2__1__Impl6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__0__Impl_in_rule__Precedence__Group_5__06652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__1_in_rule__Precedence__Group_5__06655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_5_0_in_rule__Precedence__Group_5__0__Impl6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__1__Impl_in_rule__Precedence__Group_5__16712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__2_in_rule__Precedence__Group_5__16715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_5_1_in_rule__Precedence__Group_5__1__Impl6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__2__Impl_in_rule__Precedence__Group_5__26772 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__3_in_rule__Precedence__Group_5__26775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_5_2_in_rule__Precedence__Group_5__2__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__3__Impl_in_rule__Precedence__Group_5__36832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__4_in_rule__Precedence__Group_5__36835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InfixleftAssignment_5_3_in_rule__Precedence__Group_5__3__Impl6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__4__Impl_in_rule__Precedence__Group_5__46892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par2Assignment_5_4_in_rule__Precedence__Group_5__4__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__0__Impl_in_rule__Precedence__Group_6__06959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__1_in_rule__Precedence__Group_6__06962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_6_0_in_rule__Precedence__Group_6__0__Impl6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__1__Impl_in_rule__Precedence__Group_6__17019 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__2_in_rule__Precedence__Group_6__17022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_6_1_in_rule__Precedence__Group_6__1__Impl7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__2__Impl_in_rule__Precedence__Group_6__27079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__LiteralAssignment_6_2_in_rule__Precedence__Group_6__2__Impl7106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__0__Impl_in_rule__Precedence__Group_7__07142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__1_in_rule__Precedence__Group_7__07145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_7_0_in_rule__Precedence__Group_7__0__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__1__Impl_in_rule__Precedence__Group_7__17202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__2_in_rule__Precedence__Group_7__17205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_7_1_in_rule__Precedence__Group_7__1__Impl7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__2__Impl_in_rule__Precedence__Group_7__27262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__BracketAssignment_7_2_in_rule__Precedence__Group_7__2__Impl7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__0__Impl_in_rule__Precedence__Group_8__07325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__1_in_rule__Precedence__Group_8__07328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_8_0_in_rule__Precedence__Group_8__0__Impl7355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__1__Impl_in_rule__Precedence__Group_8__17385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__2_in_rule__Precedence__Group_8__17388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_8_1_in_rule__Precedence__Group_8__1__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__2__Impl_in_rule__Precedence__Group_8__27445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__BracesAssignment_8_2_in_rule__Precedence__Group_8__2__Impl7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__0__Impl_in_rule__Precedence__Group_9__07508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__1_in_rule__Precedence__Group_9__07511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_9_0_in_rule__Precedence__Group_9__0__Impl7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__1__Impl_in_rule__Precedence__Group_9__17568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__2_in_rule__Precedence__Group_9__17571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_9_1_in_rule__Precedence__Group_9__1__Impl7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__2__Impl_in_rule__Precedence__Group_9__27628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__ParenthesisAssignment_9_2_in_rule__Precedence__Group_9__2__Impl7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_10__0__Impl_in_rule__Precedence__Group_10__07691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_10__1_in_rule__Precedence__Group_10__07694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_10_0_in_rule__Precedence__Group_10__0__Impl7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_10__1__Impl_in_rule__Precedence__Group_10__17751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_10__2_in_rule__Precedence__Group_10__17754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_10_1_in_rule__Precedence__Group_10__1__Impl7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_10__2__Impl_in_rule__Precedence__Group_10__27811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__AngleAssignment_10_2_in_rule__Precedence__Group_10__2__Impl7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0__0__Impl_in_rule__InnerPrecedence__Group_0__07874 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0__1_in_rule__InnerPrecedence__Group_0__07877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuletypAssignment_0_0_in_rule__InnerPrecedence__Group_0__0__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0__1__Impl_in_rule__InnerPrecedence__Group_0__17934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0__2_in_rule__InnerPrecedence__Group_0__17937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__PrefixAssignment_0_1_in_rule__InnerPrecedence__Group_0__1__Impl7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0__2__Impl_in_rule__InnerPrecedence__Group_0__27994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0__3_in_rule__InnerPrecedence__Group_0__27997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0_2__0_in_rule__InnerPrecedence__Group_0__2__Impl8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0__3__Impl_in_rule__InnerPrecedence__Group_0__38055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Par2Assignment_0_3_in_rule__InnerPrecedence__Group_0__3__Impl8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0_2__0__Impl_in_rule__InnerPrecedence__Group_0_2__08120 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0_2__1_in_rule__InnerPrecedence__Group_0_2__08123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Feature1Assignment_0_2_0_in_rule__InnerPrecedence__Group_0_2__0__Impl8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_0_2__1__Impl_in_rule__InnerPrecedence__Group_0_2__18180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InnerPrecedence__Group_0_2__1__Impl8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_1__0__Impl_in_rule__InnerPrecedence__Group_1__08243 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_1__1_in_rule__InnerPrecedence__Group_1__08246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuletypAssignment_1_0_in_rule__InnerPrecedence__Group_1__0__Impl8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_1__1__Impl_in_rule__InnerPrecedence__Group_1__18303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__SuffixAssignment_1_1_in_rule__InnerPrecedence__Group_1__1__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__0__Impl_in_rule__InnerPrecedence__Group_2__08364 = new BitSet(new long[]{0x0000048000000020L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__1_in_rule__InnerPrecedence__Group_2__08367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuletypAssignment_2_0_in_rule__InnerPrecedence__Group_2__0__Impl8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__1__Impl_in_rule__InnerPrecedence__Group_2__18424 = new BitSet(new long[]{0x0000048000000020L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__2_in_rule__InnerPrecedence__Group_2__18427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1__0_in_rule__InnerPrecedence__Group_2__1__Impl8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__2__Impl_in_rule__InnerPrecedence__Group_2__28485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__3_in_rule__InnerPrecedence__Group_2__28488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__InfixAssignment_2_2_in_rule__InnerPrecedence__Group_2__2__Impl8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__3__Impl_in_rule__InnerPrecedence__Group_2__38545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__4_in_rule__InnerPrecedence__Group_2__38548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_3__0_in_rule__InnerPrecedence__Group_2__3__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2__4__Impl_in_rule__InnerPrecedence__Group_2__48606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Par2Assignment_2_4_in_rule__InnerPrecedence__Group_2__4__Impl8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1__0__Impl_in_rule__InnerPrecedence__Group_2_1__08673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1__1_in_rule__InnerPrecedence__Group_2_1__08676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__ModAssignment_2_1_0_in_rule__InnerPrecedence__Group_2_1__0__Impl8703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1__1__Impl_in_rule__InnerPrecedence__Group_2_1__18733 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1__2_in_rule__InnerPrecedence__Group_2_1__18736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuleAssignment_2_1_1_in_rule__InnerPrecedence__Group_2_1__1__Impl8763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1__2__Impl_in_rule__InnerPrecedence__Group_2_1__28793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1_2__0_in_rule__InnerPrecedence__Group_2_1__2__Impl8820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1_2__0__Impl_in_rule__InnerPrecedence__Group_2_1_2__08857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1_2__1_in_rule__InnerPrecedence__Group_2_1_2__08860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InnerPrecedence__Group_2_1_2__0__Impl8888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_1_2__1__Impl_in_rule__InnerPrecedence__Group_2_1_2__18919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Feature1Assignment_2_1_2_1_in_rule__InnerPrecedence__Group_2_1_2__1__Impl8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_3__0__Impl_in_rule__InnerPrecedence__Group_2_3__08980 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_3__1_in_rule__InnerPrecedence__Group_2_3__08983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Feature2Assignment_2_3_0_in_rule__InnerPrecedence__Group_2_3__0__Impl9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_2_3__1__Impl_in_rule__InnerPrecedence__Group_2_3__19040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InnerPrecedence__Group_2_3__1__Impl9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_3__0__Impl_in_rule__InnerPrecedence__Group_3__09103 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_3__1_in_rule__InnerPrecedence__Group_3__09106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuletypAssignment_3_0_in_rule__InnerPrecedence__Group_3__0__Impl9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_3__1__Impl_in_rule__InnerPrecedence__Group_3__19163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_3__2_in_rule__InnerPrecedence__Group_3__19166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__InfixleftAssignment_3_1_in_rule__InnerPrecedence__Group_3__1__Impl9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_3__2__Impl_in_rule__InnerPrecedence__Group_3__29223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Par2Assignment_3_2_in_rule__InnerPrecedence__Group_3__2__Impl9250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_4__0__Impl_in_rule__InnerPrecedence__Group_4__09286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_4__1_in_rule__InnerPrecedence__Group_4__09289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuletypAssignment_4_0_in_rule__InnerPrecedence__Group_4__0__Impl9316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_4__1__Impl_in_rule__InnerPrecedence__Group_4__19346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_4__2_in_rule__InnerPrecedence__Group_4__19349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuleAssignment_4_1_in_rule__InnerPrecedence__Group_4__1__Impl9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_4__2__Impl_in_rule__InnerPrecedence__Group_4__29406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__BracketAssignment_4_2_in_rule__InnerPrecedence__Group_4__2__Impl9433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_5__0__Impl_in_rule__InnerPrecedence__Group_5__09469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_5__1_in_rule__InnerPrecedence__Group_5__09472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuletypAssignment_5_0_in_rule__InnerPrecedence__Group_5__0__Impl9499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_5__1__Impl_in_rule__InnerPrecedence__Group_5__19529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_5__2_in_rule__InnerPrecedence__Group_5__19532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuleAssignment_5_1_in_rule__InnerPrecedence__Group_5__1__Impl9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_5__2__Impl_in_rule__InnerPrecedence__Group_5__29589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__BracesAssignment_5_2_in_rule__InnerPrecedence__Group_5__2__Impl9616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_6__0__Impl_in_rule__InnerPrecedence__Group_6__09652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_6__1_in_rule__InnerPrecedence__Group_6__09655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuletypAssignment_6_0_in_rule__InnerPrecedence__Group_6__0__Impl9682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_6__1__Impl_in_rule__InnerPrecedence__Group_6__19712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_6__2_in_rule__InnerPrecedence__Group_6__19715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuleAssignment_6_1_in_rule__InnerPrecedence__Group_6__1__Impl9742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_6__2__Impl_in_rule__InnerPrecedence__Group_6__29772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__ParenthesisAssignment_6_2_in_rule__InnerPrecedence__Group_6__2__Impl9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_7__0__Impl_in_rule__InnerPrecedence__Group_7__09835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_7__1_in_rule__InnerPrecedence__Group_7__09838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuletypAssignment_7_0_in_rule__InnerPrecedence__Group_7__0__Impl9865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_7__1__Impl_in_rule__InnerPrecedence__Group_7__19895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_7__2_in_rule__InnerPrecedence__Group_7__19898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__RuleAssignment_7_1_in_rule__InnerPrecedence__Group_7__1__Impl9925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__Group_7__2__Impl_in_rule__InnerPrecedence__Group_7__29955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InnerPrecedence__AngleAssignment_7_2_in_rule__InnerPrecedence__Group_7__2__Impl9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__0__Impl_in_rule__MultID__Group__010018 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group__1_in_rule__MultID__Group__010021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__1__Impl_in_rule__MultID__Group__110079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Alternatives_1_in_rule__MultID__Group__1__Impl10106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__0__Impl_in_rule__MultID__Group_1_1__010140 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__1_in_rule__MultID__Group_1_1__010143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MultID__Group_1_1__0__Impl10171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__1__Impl_in_rule__MultID__Group_1_1__110202 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__2_in_rule__MultID__Group_1_1__110205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__MiAssignment_1_1_1_in_rule__MultID__Group_1_1__1__Impl10232 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__2__Impl_in_rule__MultID__Group_1_1__210263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MultID__Group_1_1__2__Impl10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__0__Impl_in_rule__MultString__Group__010328 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group__1_in_rule__MultString__Group__010331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__1__Impl_in_rule__MultString__Group__110389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Alternatives_1_in_rule__MultString__Group__1__Impl10416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__0__Impl_in_rule__MultString__Group_1_1__010450 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__1_in_rule__MultString__Group_1_1__010453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MultString__Group_1_1__0__Impl10481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__1__Impl_in_rule__MultString__Group_1_1__110512 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__2_in_rule__MultString__Group_1_1__110515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__MsAssignment_1_1_1_in_rule__MultString__Group_1_1__1__Impl10542 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__2__Impl_in_rule__MultString__Group_1_1__210573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MultString__Group_1_1__2__Impl10601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_010643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_110674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_210705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_310736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_110767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ClassType__NoclassAssignment_2_010803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_110842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_110873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_110904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_110937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_110968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_110999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_111030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_111063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_111094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_311125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_111156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_311187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_111218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_111249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_111280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_111311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_311342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_111373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_rule__Expression__PrecAssignment_211404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Precedence__RuletypAssignment_0_011440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_0_111479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_0_2_111510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Precedence__RuletypAssignment_1_011546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_1_111585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__PrefixAssignment_1_211616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_1_3_011647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_1_411678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Precedence__RuletypAssignment_2_011714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_2_111753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_2_2_011784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_2_311815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__SuffixAssignment_2_411846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Precedence__RuletypAssignment_3_011882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_3_111921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_3_2_011952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_3_311983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__InfixAssignment_3_412014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature2Assignment_3_5_012045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_3_612076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Precedence__RuletypAssignment_4_012112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_4_112151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_4_2_012182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_4_312213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerPrecedence_in_rule__Precedence__InnerAssignment_4_412244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Precedence__RuletypAssignment_5_012280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_5_112319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_5_212350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__InfixleftAssignment_5_312381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_5_412412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Precedence__RuletypAssignment_6_012448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_6_112487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__LiteralAlternatives_6_2_0_in_rule__Precedence__LiteralAssignment_6_212518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Precedence__RuletypAssignment_7_012556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_7_112595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__BracketAssignment_7_212626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Precedence__RuletypAssignment_8_012662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_8_112701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__BracesAssignment_8_212732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Precedence__RuletypAssignment_9_012768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_9_112807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__ParenthesisAssignment_9_212838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Precedence__RuletypAssignment_10_012874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_10_112913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__AngleAssignment_10_212944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__InnerPrecedence__RuletypAssignment_0_012980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__InnerPrecedence__PrefixAssignment_0_113019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__Feature1Assignment_0_2_013050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__Par2Assignment_0_313081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__InnerPrecedence__RuletypAssignment_1_013117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__InnerPrecedence__SuffixAssignment_1_113156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__InnerPrecedence__RuletypAssignment_2_013192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__InnerPrecedence__ModAssignment_2_1_013236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_2_1_113275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__Feature1Assignment_2_1_2_113306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__InnerPrecedence__InfixAssignment_2_213337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__Feature2Assignment_2_3_013368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__Par2Assignment_2_413399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__InnerPrecedence__RuletypAssignment_3_013435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__InnerPrecedence__InfixleftAssignment_3_113474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__Par2Assignment_3_213505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__InnerPrecedence__RuletypAssignment_4_013541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_4_113580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__BracketAssignment_4_213611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__InnerPrecedence__RuletypAssignment_5_013647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_5_113686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__BracesAssignment_5_213717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__InnerPrecedence__RuletypAssignment_6_013753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_6_113792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__ParenthesisAssignment_6_213823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__InnerPrecedence__RuletypAssignment_7_013859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__RuleAssignment_7_113898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InnerPrecedence__AngleAssignment_7_213929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_013960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_1_113991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_014022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_1_114053 = new BitSet(new long[]{0x0000000000000002L});

}