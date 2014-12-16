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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BRACES'", "'INDENT'", "'COLONSEPERATED'", "'SPACESEPERATED'", "'INHEADER'", "'INFERRED'", "'UNTYPED'", "'INT'", "'STRING'", "'BOOL'", "'FLOAT'", "'CLASS'", "'PREFIX'", "'SUFFIX'", "'BLOCKING'", "'PROCEDURE'", "'TYPES'", "'STATEMENT'", "'REPEAT'", "'UNTIL'", "'WHILE'", "'DO'", "'FOR'", "'VAR'", "'='", "'VAL'", "'EXPRESSION'", "'.'", "'['", "']'", "'NOCLASS'", "'CALLER'", "'INFIX'", "'INFIXADD'", "'INFIXLEFT'", "'LITERAL'", "'BRACKET'", "'PARENTHESIS'"
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
    public static final int T__48=48;
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


    // $ANTLR start "entryRuleMultID"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:228:1: entryRuleMultID : ruleMultID EOF ;
    public final void entryRuleMultID() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:229:1: ( ruleMultID EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:230:1: ruleMultID EOF
            {
             before(grammarAccess.getMultIDRule()); 
            pushFollow(FOLLOW_ruleMultID_in_entryRuleMultID422);
            ruleMultID();

            state._fsp--;

             after(grammarAccess.getMultIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultID429); 

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:237:1: ruleMultID : ( ( rule__MultID__Group__0 ) ) ;
    public final void ruleMultID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:241:2: ( ( ( rule__MultID__Group__0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:242:1: ( ( rule__MultID__Group__0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:242:1: ( ( rule__MultID__Group__0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:243:1: ( rule__MultID__Group__0 )
            {
             before(grammarAccess.getMultIDAccess().getGroup()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:244:1: ( rule__MultID__Group__0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:244:2: rule__MultID__Group__0
            {
            pushFollow(FOLLOW_rule__MultID__Group__0_in_ruleMultID455);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:256:1: entryRuleMultString : ruleMultString EOF ;
    public final void entryRuleMultString() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:257:1: ( ruleMultString EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:258:1: ruleMultString EOF
            {
             before(grammarAccess.getMultStringRule()); 
            pushFollow(FOLLOW_ruleMultString_in_entryRuleMultString482);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getMultStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultString489); 

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:265:1: ruleMultString : ( ( rule__MultString__Group__0 ) ) ;
    public final void ruleMultString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:269:2: ( ( ( rule__MultString__Group__0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:270:1: ( ( rule__MultString__Group__0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:270:1: ( ( rule__MultString__Group__0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:271:1: ( rule__MultString__Group__0 )
            {
             before(grammarAccess.getMultStringAccess().getGroup()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:272:1: ( rule__MultString__Group__0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:272:2: rule__MultString__Group__0
            {
            pushFollow(FOLLOW_rule__MultString__Group__0_in_ruleMultString515);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:284:1: rule__Model__Alternatives : ( ( ( rule__Model__ClasAssignment_0 ) ) | ( ( rule__Model__ProcAssignment_1 ) ) | ( ( rule__Model__StatemAssignment_2 ) ) | ( ( rule__Model__ExpAssignment_3 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:288:1: ( ( ( rule__Model__ClasAssignment_0 ) ) | ( ( rule__Model__ProcAssignment_1 ) ) | ( ( rule__Model__StatemAssignment_2 ) ) | ( ( rule__Model__ExpAssignment_3 ) ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:289:1: ( ( rule__Model__ClasAssignment_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:289:1: ( ( rule__Model__ClasAssignment_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:290:1: ( rule__Model__ClasAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getClasAssignment_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:291:1: ( rule__Model__ClasAssignment_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:291:2: rule__Model__ClasAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__ClasAssignment_0_in_rule__Model__Alternatives551);
                    rule__Model__ClasAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getClasAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:295:6: ( ( rule__Model__ProcAssignment_1 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:295:6: ( ( rule__Model__ProcAssignment_1 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:296:1: ( rule__Model__ProcAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getProcAssignment_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:297:1: ( rule__Model__ProcAssignment_1 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:297:2: rule__Model__ProcAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__ProcAssignment_1_in_rule__Model__Alternatives569);
                    rule__Model__ProcAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getProcAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:301:6: ( ( rule__Model__StatemAssignment_2 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:301:6: ( ( rule__Model__StatemAssignment_2 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:302:1: ( rule__Model__StatemAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getStatemAssignment_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:303:1: ( rule__Model__StatemAssignment_2 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:303:2: rule__Model__StatemAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__StatemAssignment_2_in_rule__Model__Alternatives587);
                    rule__Model__StatemAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getStatemAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:307:6: ( ( rule__Model__ExpAssignment_3 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:307:6: ( ( rule__Model__ExpAssignment_3 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:308:1: ( rule__Model__ExpAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getExpAssignment_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:309:1: ( rule__Model__ExpAssignment_3 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:309:2: rule__Model__ExpAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__ExpAssignment_3_in_rule__Model__Alternatives605);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:318:1: rule__ClassType__Alternatives_2 : ( ( ( rule__ClassType__NoclassAssignment_2_0 ) ) | ( ( rule__ClassType__Group_2_1__0 ) ) | ( ( rule__ClassType__Group_2_2__0 ) ) | ( ( rule__ClassType__Group_2_3__0 ) ) );
    public final void rule__ClassType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:322:1: ( ( ( rule__ClassType__NoclassAssignment_2_0 ) ) | ( ( rule__ClassType__Group_2_1__0 ) ) | ( ( rule__ClassType__Group_2_2__0 ) ) | ( ( rule__ClassType__Group_2_3__0 ) ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:323:1: ( ( rule__ClassType__NoclassAssignment_2_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:323:1: ( ( rule__ClassType__NoclassAssignment_2_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:324:1: ( rule__ClassType__NoclassAssignment_2_0 )
                    {
                     before(grammarAccess.getClassTypeAccess().getNoclassAssignment_2_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:325:1: ( rule__ClassType__NoclassAssignment_2_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:325:2: rule__ClassType__NoclassAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ClassType__NoclassAssignment_2_0_in_rule__ClassType__Alternatives_2638);
                    rule__ClassType__NoclassAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassTypeAccess().getNoclassAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:329:6: ( ( rule__ClassType__Group_2_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:329:6: ( ( rule__ClassType__Group_2_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:330:1: ( rule__ClassType__Group_2_1__0 )
                    {
                     before(grammarAccess.getClassTypeAccess().getGroup_2_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:331:1: ( rule__ClassType__Group_2_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:331:2: rule__ClassType__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ClassType__Group_2_1__0_in_rule__ClassType__Alternatives_2656);
                    rule__ClassType__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassTypeAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:335:6: ( ( rule__ClassType__Group_2_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:335:6: ( ( rule__ClassType__Group_2_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:336:1: ( rule__ClassType__Group_2_2__0 )
                    {
                     before(grammarAccess.getClassTypeAccess().getGroup_2_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:337:1: ( rule__ClassType__Group_2_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:337:2: rule__ClassType__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__ClassType__Group_2_2__0_in_rule__ClassType__Alternatives_2674);
                    rule__ClassType__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClassTypeAccess().getGroup_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:341:6: ( ( rule__ClassType__Group_2_3__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:341:6: ( ( rule__ClassType__Group_2_3__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:342:1: ( rule__ClassType__Group_2_3__0 )
                    {
                     before(grammarAccess.getClassTypeAccess().getGroup_2_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:343:1: ( rule__ClassType__Group_2_3__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:343:2: rule__ClassType__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__ClassType__Group_2_3__0_in_rule__ClassType__Alternatives_2692);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:352:1: rule__ClassType__BlockingAlternatives_2_3_1_0 : ( ( 'BRACES' ) | ( 'INDENT' ) );
    public final void rule__ClassType__BlockingAlternatives_2_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:356:1: ( ( 'BRACES' ) | ( 'INDENT' ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:357:1: ( 'BRACES' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:357:1: ( 'BRACES' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:358:1: 'BRACES'
                    {
                     before(grammarAccess.getClassTypeAccess().getBlockingBRACESKeyword_2_3_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__ClassType__BlockingAlternatives_2_3_1_0726); 
                     after(grammarAccess.getClassTypeAccess().getBlockingBRACESKeyword_2_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:365:6: ( 'INDENT' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:365:6: ( 'INDENT' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:366:1: 'INDENT'
                    {
                     before(grammarAccess.getClassTypeAccess().getBlockingINDENTKeyword_2_3_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__ClassType__BlockingAlternatives_2_3_1_0746); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:378:1: rule__Procedure__Alternatives_2 : ( ( ( rule__Procedure__Group_2_0__0 ) ) | ( ( rule__Procedure__Group_2_1__0 ) ) | ( ( rule__Procedure__Group_2_2__0 ) ) );
    public final void rule__Procedure__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:382:1: ( ( ( rule__Procedure__Group_2_0__0 ) ) | ( ( rule__Procedure__Group_2_1__0 ) ) | ( ( rule__Procedure__Group_2_2__0 ) ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:383:1: ( ( rule__Procedure__Group_2_0__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:383:1: ( ( rule__Procedure__Group_2_0__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:384:1: ( rule__Procedure__Group_2_0__0 )
                    {
                     before(grammarAccess.getProcedureAccess().getGroup_2_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:385:1: ( rule__Procedure__Group_2_0__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:385:2: rule__Procedure__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Procedure__Group_2_0__0_in_rule__Procedure__Alternatives_2780);
                    rule__Procedure__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedureAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:389:6: ( ( rule__Procedure__Group_2_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:389:6: ( ( rule__Procedure__Group_2_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:390:1: ( rule__Procedure__Group_2_1__0 )
                    {
                     before(grammarAccess.getProcedureAccess().getGroup_2_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:391:1: ( rule__Procedure__Group_2_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:391:2: rule__Procedure__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Procedure__Group_2_1__0_in_rule__Procedure__Alternatives_2798);
                    rule__Procedure__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedureAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:395:6: ( ( rule__Procedure__Group_2_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:395:6: ( ( rule__Procedure__Group_2_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:396:1: ( rule__Procedure__Group_2_2__0 )
                    {
                     before(grammarAccess.getProcedureAccess().getGroup_2_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:397:1: ( rule__Procedure__Group_2_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:397:2: rule__Procedure__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Procedure__Group_2_2__0_in_rule__Procedure__Alternatives_2816);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:406:1: rule__Procedure__TypesAlternatives_2_2_1_0 : ( ( 'COLONSEPERATED' ) | ( 'SPACESEPERATED' ) | ( 'INHEADER' ) | ( 'INFERRED' ) | ( 'UNTYPED' ) );
    public final void rule__Procedure__TypesAlternatives_2_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:410:1: ( ( 'COLONSEPERATED' ) | ( 'SPACESEPERATED' ) | ( 'INHEADER' ) | ( 'INFERRED' ) | ( 'UNTYPED' ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:411:1: ( 'COLONSEPERATED' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:411:1: ( 'COLONSEPERATED' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:412:1: 'COLONSEPERATED'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesCOLONSEPERATEDKeyword_2_2_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Procedure__TypesAlternatives_2_2_1_0850); 
                     after(grammarAccess.getProcedureAccess().getTypesCOLONSEPERATEDKeyword_2_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:419:6: ( 'SPACESEPERATED' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:419:6: ( 'SPACESEPERATED' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:420:1: 'SPACESEPERATED'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesSPACESEPERATEDKeyword_2_2_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Procedure__TypesAlternatives_2_2_1_0870); 
                     after(grammarAccess.getProcedureAccess().getTypesSPACESEPERATEDKeyword_2_2_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:427:6: ( 'INHEADER' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:427:6: ( 'INHEADER' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:428:1: 'INHEADER'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesINHEADERKeyword_2_2_1_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__Procedure__TypesAlternatives_2_2_1_0890); 
                     after(grammarAccess.getProcedureAccess().getTypesINHEADERKeyword_2_2_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:435:6: ( 'INFERRED' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:435:6: ( 'INFERRED' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:436:1: 'INFERRED'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesINFERREDKeyword_2_2_1_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__Procedure__TypesAlternatives_2_2_1_0910); 
                     after(grammarAccess.getProcedureAccess().getTypesINFERREDKeyword_2_2_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:443:6: ( 'UNTYPED' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:443:6: ( 'UNTYPED' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:444:1: 'UNTYPED'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesUNTYPEDKeyword_2_2_1_0_4()); 
                    match(input,17,FOLLOW_17_in_rule__Procedure__TypesAlternatives_2_2_1_0930); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:456:1: rule__Statement__Alternatives_2 : ( ( ( rule__Statement__Group_2_0__0 ) ) | ( ( rule__Statement__Group_2_1__0 ) ) | ( ( rule__Statement__Group_2_2__0 ) ) | ( ( rule__Statement__Group_2_3__0 ) ) | ( ( rule__Statement__Group_2_4__0 ) ) );
    public final void rule__Statement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:460:1: ( ( ( rule__Statement__Group_2_0__0 ) ) | ( ( rule__Statement__Group_2_1__0 ) ) | ( ( rule__Statement__Group_2_2__0 ) ) | ( ( rule__Statement__Group_2_3__0 ) ) | ( ( rule__Statement__Group_2_4__0 ) ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:461:1: ( ( rule__Statement__Group_2_0__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:461:1: ( ( rule__Statement__Group_2_0__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:462:1: ( rule__Statement__Group_2_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:463:1: ( rule__Statement__Group_2_0__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:463:2: rule__Statement__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_0__0_in_rule__Statement__Alternatives_2964);
                    rule__Statement__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:467:6: ( ( rule__Statement__Group_2_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:467:6: ( ( rule__Statement__Group_2_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:468:1: ( rule__Statement__Group_2_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:469:1: ( rule__Statement__Group_2_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:469:2: rule__Statement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_1__0_in_rule__Statement__Alternatives_2982);
                    rule__Statement__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:473:6: ( ( rule__Statement__Group_2_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:473:6: ( ( rule__Statement__Group_2_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:474:1: ( rule__Statement__Group_2_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:475:1: ( rule__Statement__Group_2_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:475:2: rule__Statement__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_2__0_in_rule__Statement__Alternatives_21000);
                    rule__Statement__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:479:6: ( ( rule__Statement__Group_2_3__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:479:6: ( ( rule__Statement__Group_2_3__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:480:1: ( rule__Statement__Group_2_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:481:1: ( rule__Statement__Group_2_3__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:481:2: rule__Statement__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_3__0_in_rule__Statement__Alternatives_21018);
                    rule__Statement__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:485:6: ( ( rule__Statement__Group_2_4__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:485:6: ( ( rule__Statement__Group_2_4__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:486:1: ( rule__Statement__Group_2_4__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2_4()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:487:1: ( rule__Statement__Group_2_4__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:487:2: rule__Statement__Group_2_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_4__0_in_rule__Statement__Alternatives_21036);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:496:1: rule__Precedence__Alternatives : ( ( ( rule__Precedence__Group_0__0 ) ) | ( ( rule__Precedence__Group_1__0 ) ) | ( ( rule__Precedence__Group_2__0 ) ) | ( ( rule__Precedence__Group_3__0 ) ) | ( ( rule__Precedence__Group_4__0 ) ) | ( ( rule__Precedence__Group_5__0 ) ) | ( ( rule__Precedence__Group_6__0 ) ) | ( ( rule__Precedence__Group_7__0 ) ) | ( ( rule__Precedence__Group_8__0 ) ) | ( ( rule__Precedence__Group_9__0 ) ) );
    public final void rule__Precedence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:500:1: ( ( ( rule__Precedence__Group_0__0 ) ) | ( ( rule__Precedence__Group_1__0 ) ) | ( ( rule__Precedence__Group_2__0 ) ) | ( ( rule__Precedence__Group_3__0 ) ) | ( ( rule__Precedence__Group_4__0 ) ) | ( ( rule__Precedence__Group_5__0 ) ) | ( ( rule__Precedence__Group_6__0 ) ) | ( ( rule__Precedence__Group_7__0 ) ) | ( ( rule__Precedence__Group_8__0 ) ) | ( ( rule__Precedence__Group_9__0 ) ) )
            int alt8=10;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:501:1: ( ( rule__Precedence__Group_0__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:501:1: ( ( rule__Precedence__Group_0__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:502:1: ( rule__Precedence__Group_0__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:503:1: ( rule__Precedence__Group_0__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:503:2: rule__Precedence__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_0__0_in_rule__Precedence__Alternatives1069);
                    rule__Precedence__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:507:6: ( ( rule__Precedence__Group_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:507:6: ( ( rule__Precedence__Group_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:508:1: ( rule__Precedence__Group_1__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:509:1: ( rule__Precedence__Group_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:509:2: rule__Precedence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_1__0_in_rule__Precedence__Alternatives1087);
                    rule__Precedence__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:513:6: ( ( rule__Precedence__Group_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:513:6: ( ( rule__Precedence__Group_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:514:1: ( rule__Precedence__Group_2__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:515:1: ( rule__Precedence__Group_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:515:2: rule__Precedence__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_2__0_in_rule__Precedence__Alternatives1105);
                    rule__Precedence__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:519:6: ( ( rule__Precedence__Group_3__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:519:6: ( ( rule__Precedence__Group_3__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:520:1: ( rule__Precedence__Group_3__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:521:1: ( rule__Precedence__Group_3__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:521:2: rule__Precedence__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_3__0_in_rule__Precedence__Alternatives1123);
                    rule__Precedence__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:525:6: ( ( rule__Precedence__Group_4__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:525:6: ( ( rule__Precedence__Group_4__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:526:1: ( rule__Precedence__Group_4__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_4()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:527:1: ( rule__Precedence__Group_4__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:527:2: rule__Precedence__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_4__0_in_rule__Precedence__Alternatives1141);
                    rule__Precedence__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:531:6: ( ( rule__Precedence__Group_5__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:531:6: ( ( rule__Precedence__Group_5__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:532:1: ( rule__Precedence__Group_5__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_5()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:533:1: ( rule__Precedence__Group_5__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:533:2: rule__Precedence__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_5__0_in_rule__Precedence__Alternatives1159);
                    rule__Precedence__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:537:6: ( ( rule__Precedence__Group_6__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:537:6: ( ( rule__Precedence__Group_6__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:538:1: ( rule__Precedence__Group_6__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_6()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:539:1: ( rule__Precedence__Group_6__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:539:2: rule__Precedence__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_6__0_in_rule__Precedence__Alternatives1177);
                    rule__Precedence__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:543:6: ( ( rule__Precedence__Group_7__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:543:6: ( ( rule__Precedence__Group_7__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:544:1: ( rule__Precedence__Group_7__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_7()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:545:1: ( rule__Precedence__Group_7__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:545:2: rule__Precedence__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_7__0_in_rule__Precedence__Alternatives1195);
                    rule__Precedence__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:549:6: ( ( rule__Precedence__Group_8__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:549:6: ( ( rule__Precedence__Group_8__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:550:1: ( rule__Precedence__Group_8__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_8()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:551:1: ( rule__Precedence__Group_8__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:551:2: rule__Precedence__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_8__0_in_rule__Precedence__Alternatives1213);
                    rule__Precedence__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:555:6: ( ( rule__Precedence__Group_9__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:555:6: ( ( rule__Precedence__Group_9__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:556:1: ( rule__Precedence__Group_9__0 )
                    {
                     before(grammarAccess.getPrecedenceAccess().getGroup_9()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:557:1: ( rule__Precedence__Group_9__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:557:2: rule__Precedence__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_9__0_in_rule__Precedence__Alternatives1231);
                    rule__Precedence__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecedenceAccess().getGroup_9()); 

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:566:1: rule__Precedence__LiteralAlternatives_6_2_0 : ( ( 'INT' ) | ( 'STRING' ) | ( 'BOOL' ) | ( 'FLOAT' ) );
    public final void rule__Precedence__LiteralAlternatives_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:570:1: ( ( 'INT' ) | ( 'STRING' ) | ( 'BOOL' ) | ( 'FLOAT' ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:571:1: ( 'INT' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:571:1: ( 'INT' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:572:1: 'INT'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralINTKeyword_6_2_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Precedence__LiteralAlternatives_6_2_01265); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralINTKeyword_6_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:579:6: ( 'STRING' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:579:6: ( 'STRING' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:580:1: 'STRING'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralSTRINGKeyword_6_2_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Precedence__LiteralAlternatives_6_2_01285); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralSTRINGKeyword_6_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:587:6: ( 'BOOL' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:587:6: ( 'BOOL' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:588:1: 'BOOL'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralBOOLKeyword_6_2_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__Precedence__LiteralAlternatives_6_2_01305); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralBOOLKeyword_6_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:595:6: ( 'FLOAT' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:595:6: ( 'FLOAT' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:596:1: 'FLOAT'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralFLOATKeyword_6_2_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__Precedence__LiteralAlternatives_6_2_01325); 
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


    // $ANTLR start "rule__MultID__Alternatives_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:608:1: rule__MultID__Alternatives_1 : ( ( ( rule__MultID__MiAssignment_1_0 ) ) | ( ( rule__MultID__Group_1_1__0 ) ) );
    public final void rule__MultID__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:612:1: ( ( ( rule__MultID__MiAssignment_1_0 ) ) | ( ( rule__MultID__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:613:1: ( ( rule__MultID__MiAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:613:1: ( ( rule__MultID__MiAssignment_1_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:614:1: ( rule__MultID__MiAssignment_1_0 )
                    {
                     before(grammarAccess.getMultIDAccess().getMiAssignment_1_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:615:1: ( rule__MultID__MiAssignment_1_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:615:2: rule__MultID__MiAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MultID__MiAssignment_1_0_in_rule__MultID__Alternatives_11359);
                    rule__MultID__MiAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultIDAccess().getMiAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:619:6: ( ( rule__MultID__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:619:6: ( ( rule__MultID__Group_1_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:620:1: ( rule__MultID__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultIDAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:621:1: ( rule__MultID__Group_1_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:621:2: rule__MultID__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultID__Group_1_1__0_in_rule__MultID__Alternatives_11377);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:630:1: rule__MultString__Alternatives_1 : ( ( ( rule__MultString__MsAssignment_1_0 ) ) | ( ( rule__MultString__Group_1_1__0 ) ) );
    public final void rule__MultString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:634:1: ( ( ( rule__MultString__MsAssignment_1_0 ) ) | ( ( rule__MultString__Group_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:635:1: ( ( rule__MultString__MsAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:635:1: ( ( rule__MultString__MsAssignment_1_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:636:1: ( rule__MultString__MsAssignment_1_0 )
                    {
                     before(grammarAccess.getMultStringAccess().getMsAssignment_1_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:637:1: ( rule__MultString__MsAssignment_1_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:637:2: rule__MultString__MsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MultString__MsAssignment_1_0_in_rule__MultString__Alternatives_11410);
                    rule__MultString__MsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultStringAccess().getMsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:641:6: ( ( rule__MultString__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:641:6: ( ( rule__MultString__Group_1_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:642:1: ( rule__MultString__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultStringAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:643:1: ( rule__MultString__Group_1_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:643:2: rule__MultString__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultString__Group_1_1__0_in_rule__MultString__Alternatives_11428);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:654:1: rule__ClassType__Group__0 : rule__ClassType__Group__0__Impl rule__ClassType__Group__1 ;
    public final void rule__ClassType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:658:1: ( rule__ClassType__Group__0__Impl rule__ClassType__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:659:2: rule__ClassType__Group__0__Impl rule__ClassType__Group__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01459);
            rule__ClassType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01462);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:666:1: rule__ClassType__Group__0__Impl : ( 'CLASS' ) ;
    public final void rule__ClassType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:670:1: ( ( 'CLASS' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:671:1: ( 'CLASS' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:671:1: ( 'CLASS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:672:1: 'CLASS'
            {
             before(grammarAccess.getClassTypeAccess().getCLASSKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ClassType__Group__0__Impl1490); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:685:1: rule__ClassType__Group__1 : rule__ClassType__Group__1__Impl rule__ClassType__Group__2 ;
    public final void rule__ClassType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:689:1: ( rule__ClassType__Group__1__Impl rule__ClassType__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:690:2: rule__ClassType__Group__1__Impl rule__ClassType__Group__2
            {
            pushFollow(FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11521);
            rule__ClassType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11524);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:697:1: rule__ClassType__Group__1__Impl : ( ( rule__ClassType__NameAssignment_1 ) ) ;
    public final void rule__ClassType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:701:1: ( ( ( rule__ClassType__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:702:1: ( ( rule__ClassType__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:702:1: ( ( rule__ClassType__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:703:1: ( rule__ClassType__NameAssignment_1 )
            {
             before(grammarAccess.getClassTypeAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:704:1: ( rule__ClassType__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:704:2: rule__ClassType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1551);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:714:1: rule__ClassType__Group__2 : rule__ClassType__Group__2__Impl ;
    public final void rule__ClassType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:718:1: ( rule__ClassType__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:719:2: rule__ClassType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21581);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:725:1: rule__ClassType__Group__2__Impl : ( ( rule__ClassType__Alternatives_2 )* ) ;
    public final void rule__ClassType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:729:1: ( ( ( rule__ClassType__Alternatives_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:730:1: ( ( rule__ClassType__Alternatives_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:730:1: ( ( rule__ClassType__Alternatives_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:731:1: ( rule__ClassType__Alternatives_2 )*
            {
             before(grammarAccess.getClassTypeAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:732:1: ( rule__ClassType__Alternatives_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=23 && LA12_0<=25)||LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:732:2: rule__ClassType__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1608);
            	    rule__ClassType__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:748:1: rule__ClassType__Group_2_1__0 : rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1 ;
    public final void rule__ClassType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:752:1: ( rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:753:2: rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01645);
            rule__ClassType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01648);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:760:1: rule__ClassType__Group_2_1__0__Impl : ( 'PREFIX' ) ;
    public final void rule__ClassType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:764:1: ( ( 'PREFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:765:1: ( 'PREFIX' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:765:1: ( 'PREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:766:1: 'PREFIX'
            {
             before(grammarAccess.getClassTypeAccess().getPREFIXKeyword_2_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1676); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:779:1: rule__ClassType__Group_2_1__1 : rule__ClassType__Group_2_1__1__Impl ;
    public final void rule__ClassType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:783:1: ( rule__ClassType__Group_2_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:784:2: rule__ClassType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11707);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:790:1: rule__ClassType__Group_2_1__1__Impl : ( ( rule__ClassType__PrefixAssignment_2_1_1 ) ) ;
    public final void rule__ClassType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:794:1: ( ( ( rule__ClassType__PrefixAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:795:1: ( ( rule__ClassType__PrefixAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:795:1: ( ( rule__ClassType__PrefixAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:796:1: ( rule__ClassType__PrefixAssignment_2_1_1 )
            {
             before(grammarAccess.getClassTypeAccess().getPrefixAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:797:1: ( rule__ClassType__PrefixAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:797:2: rule__ClassType__PrefixAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1734);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:811:1: rule__ClassType__Group_2_2__0 : rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1 ;
    public final void rule__ClassType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:815:1: ( rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:816:2: rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__01768);
            rule__ClassType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__01771);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:823:1: rule__ClassType__Group_2_2__0__Impl : ( 'SUFFIX' ) ;
    public final void rule__ClassType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:827:1: ( ( 'SUFFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:828:1: ( 'SUFFIX' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:828:1: ( 'SUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:829:1: 'SUFFIX'
            {
             before(grammarAccess.getClassTypeAccess().getSUFFIXKeyword_2_2_0()); 
            match(input,24,FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl1799); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:842:1: rule__ClassType__Group_2_2__1 : rule__ClassType__Group_2_2__1__Impl ;
    public final void rule__ClassType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:846:1: ( rule__ClassType__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:847:2: rule__ClassType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__11830);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:853:1: rule__ClassType__Group_2_2__1__Impl : ( ( rule__ClassType__SuffixAssignment_2_2_1 ) ) ;
    public final void rule__ClassType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:857:1: ( ( ( rule__ClassType__SuffixAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:858:1: ( ( rule__ClassType__SuffixAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:858:1: ( ( rule__ClassType__SuffixAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:859:1: ( rule__ClassType__SuffixAssignment_2_2_1 )
            {
             before(grammarAccess.getClassTypeAccess().getSuffixAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:860:1: ( rule__ClassType__SuffixAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:860:2: rule__ClassType__SuffixAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl1857);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:874:1: rule__ClassType__Group_2_3__0 : rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1 ;
    public final void rule__ClassType__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:878:1: ( rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:879:2: rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__01891);
            rule__ClassType__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__01894);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:886:1: rule__ClassType__Group_2_3__0__Impl : ( 'BLOCKING' ) ;
    public final void rule__ClassType__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:890:1: ( ( 'BLOCKING' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:891:1: ( 'BLOCKING' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:891:1: ( 'BLOCKING' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:892:1: 'BLOCKING'
            {
             before(grammarAccess.getClassTypeAccess().getBLOCKINGKeyword_2_3_0()); 
            match(input,25,FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl1922); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:905:1: rule__ClassType__Group_2_3__1 : rule__ClassType__Group_2_3__1__Impl ;
    public final void rule__ClassType__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:909:1: ( rule__ClassType__Group_2_3__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:910:2: rule__ClassType__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__11953);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:916:1: rule__ClassType__Group_2_3__1__Impl : ( ( rule__ClassType__BlockingAssignment_2_3_1 ) ) ;
    public final void rule__ClassType__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:920:1: ( ( ( rule__ClassType__BlockingAssignment_2_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:921:1: ( ( rule__ClassType__BlockingAssignment_2_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:921:1: ( ( rule__ClassType__BlockingAssignment_2_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:922:1: ( rule__ClassType__BlockingAssignment_2_3_1 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAssignment_2_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:923:1: ( rule__ClassType__BlockingAssignment_2_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:923:2: rule__ClassType__BlockingAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl1980);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:937:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:941:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:942:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__02014);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__02017);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:949:1: rule__Procedure__Group__0__Impl : ( 'PROCEDURE' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:953:1: ( ( 'PROCEDURE' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:954:1: ( 'PROCEDURE' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:954:1: ( 'PROCEDURE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:955:1: 'PROCEDURE'
            {
             before(grammarAccess.getProcedureAccess().getPROCEDUREKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Procedure__Group__0__Impl2045); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:968:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:972:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:973:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12076);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12079);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:980:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:984:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:985:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:985:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:986:1: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:987:1: ( rule__Procedure__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:987:2: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2106);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:997:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1001:1: ( rule__Procedure__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1002:2: rule__Procedure__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22136);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1008:1: rule__Procedure__Group__2__Impl : ( ( rule__Procedure__Alternatives_2 )* ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1012:1: ( ( ( rule__Procedure__Alternatives_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1013:1: ( ( rule__Procedure__Alternatives_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1013:1: ( ( rule__Procedure__Alternatives_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1014:1: ( rule__Procedure__Alternatives_2 )*
            {
             before(grammarAccess.getProcedureAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1015:1: ( rule__Procedure__Alternatives_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=24)||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1015:2: rule__Procedure__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2163);
            	    rule__Procedure__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1031:1: rule__Procedure__Group_2_0__0 : rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1 ;
    public final void rule__Procedure__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1035:1: ( rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1036:2: rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02200);
            rule__Procedure__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02203);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1043:1: rule__Procedure__Group_2_0__0__Impl : ( 'PREFIX' ) ;
    public final void rule__Procedure__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1047:1: ( ( 'PREFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1048:1: ( 'PREFIX' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1048:1: ( 'PREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1049:1: 'PREFIX'
            {
             before(grammarAccess.getProcedureAccess().getPREFIXKeyword_2_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2231); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1062:1: rule__Procedure__Group_2_0__1 : rule__Procedure__Group_2_0__1__Impl ;
    public final void rule__Procedure__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1066:1: ( rule__Procedure__Group_2_0__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1067:2: rule__Procedure__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12262);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1073:1: rule__Procedure__Group_2_0__1__Impl : ( ( rule__Procedure__PrefixAssignment_2_0_1 ) ) ;
    public final void rule__Procedure__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1077:1: ( ( ( rule__Procedure__PrefixAssignment_2_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1078:1: ( ( rule__Procedure__PrefixAssignment_2_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1078:1: ( ( rule__Procedure__PrefixAssignment_2_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1079:1: ( rule__Procedure__PrefixAssignment_2_0_1 )
            {
             before(grammarAccess.getProcedureAccess().getPrefixAssignment_2_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1080:1: ( rule__Procedure__PrefixAssignment_2_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1080:2: rule__Procedure__PrefixAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2289);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1094:1: rule__Procedure__Group_2_1__0 : rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 ;
    public final void rule__Procedure__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1098:1: ( rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1099:2: rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02323);
            rule__Procedure__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02326);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1106:1: rule__Procedure__Group_2_1__0__Impl : ( 'SUFFIX' ) ;
    public final void rule__Procedure__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1110:1: ( ( 'SUFFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1111:1: ( 'SUFFIX' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1111:1: ( 'SUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1112:1: 'SUFFIX'
            {
             before(grammarAccess.getProcedureAccess().getSUFFIXKeyword_2_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2354); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1125:1: rule__Procedure__Group_2_1__1 : rule__Procedure__Group_2_1__1__Impl ;
    public final void rule__Procedure__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1129:1: ( rule__Procedure__Group_2_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1130:2: rule__Procedure__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12385);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1136:1: rule__Procedure__Group_2_1__1__Impl : ( ( rule__Procedure__SuffixAssignment_2_1_1 ) ) ;
    public final void rule__Procedure__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1140:1: ( ( ( rule__Procedure__SuffixAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1141:1: ( ( rule__Procedure__SuffixAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1141:1: ( ( rule__Procedure__SuffixAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1142:1: ( rule__Procedure__SuffixAssignment_2_1_1 )
            {
             before(grammarAccess.getProcedureAccess().getSuffixAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1143:1: ( rule__Procedure__SuffixAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1143:2: rule__Procedure__SuffixAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2412);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1157:1: rule__Procedure__Group_2_2__0 : rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1 ;
    public final void rule__Procedure__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1161:1: ( rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1162:2: rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02446);
            rule__Procedure__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02449);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1169:1: rule__Procedure__Group_2_2__0__Impl : ( 'TYPES' ) ;
    public final void rule__Procedure__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1173:1: ( ( 'TYPES' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1174:1: ( 'TYPES' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1174:1: ( 'TYPES' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1175:1: 'TYPES'
            {
             before(grammarAccess.getProcedureAccess().getTYPESKeyword_2_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2477); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1188:1: rule__Procedure__Group_2_2__1 : rule__Procedure__Group_2_2__1__Impl ;
    public final void rule__Procedure__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1192:1: ( rule__Procedure__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1193:2: rule__Procedure__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12508);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1199:1: rule__Procedure__Group_2_2__1__Impl : ( ( rule__Procedure__TypesAssignment_2_2_1 ) ) ;
    public final void rule__Procedure__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1203:1: ( ( ( rule__Procedure__TypesAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1204:1: ( ( rule__Procedure__TypesAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1204:1: ( ( rule__Procedure__TypesAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1205:1: ( rule__Procedure__TypesAssignment_2_2_1 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1206:1: ( rule__Procedure__TypesAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1206:2: rule__Procedure__TypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2535);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1220:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1224:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1225:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02569);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02572);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1232:1: rule__Statement__Group__0__Impl : ( 'STATEMENT' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1236:1: ( ( 'STATEMENT' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1237:1: ( 'STATEMENT' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1237:1: ( 'STATEMENT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1238:1: 'STATEMENT'
            {
             before(grammarAccess.getStatementAccess().getSTATEMENTKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Statement__Group__0__Impl2600); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1251:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1255:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1256:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12631);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12634);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1263:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__NameAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1267:1: ( ( ( rule__Statement__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1268:1: ( ( rule__Statement__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1268:1: ( ( rule__Statement__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1269:1: ( rule__Statement__NameAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1270:1: ( rule__Statement__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1270:2: rule__Statement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2661);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1280:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1284:1: ( rule__Statement__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1285:2: rule__Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22691);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1291:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__Alternatives_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1295:1: ( ( ( rule__Statement__Alternatives_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1296:1: ( ( rule__Statement__Alternatives_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1296:1: ( ( rule__Statement__Alternatives_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1297:1: ( rule__Statement__Alternatives_2 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1298:1: ( rule__Statement__Alternatives_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1298:2: rule__Statement__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2718);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1314:1: rule__Statement__Group_2_0__0 : rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1 ;
    public final void rule__Statement__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1318:1: ( rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1319:2: rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02754);
            rule__Statement__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02757);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1326:1: rule__Statement__Group_2_0__0__Impl : ( 'REPEAT' ) ;
    public final void rule__Statement__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1330:1: ( ( 'REPEAT' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1331:1: ( 'REPEAT' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1331:1: ( 'REPEAT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1332:1: 'REPEAT'
            {
             before(grammarAccess.getStatementAccess().getREPEATKeyword_2_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl2785); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1345:1: rule__Statement__Group_2_0__1 : rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2 ;
    public final void rule__Statement__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1349:1: ( rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1350:2: rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__12816);
            rule__Statement__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__12819);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1357:1: rule__Statement__Group_2_0__1__Impl : ( ( rule__Statement__RepAssignment_2_0_1 ) ) ;
    public final void rule__Statement__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1361:1: ( ( ( rule__Statement__RepAssignment_2_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1362:1: ( ( rule__Statement__RepAssignment_2_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1362:1: ( ( rule__Statement__RepAssignment_2_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1363:1: ( rule__Statement__RepAssignment_2_0_1 )
            {
             before(grammarAccess.getStatementAccess().getRepAssignment_2_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1364:1: ( rule__Statement__RepAssignment_2_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1364:2: rule__Statement__RepAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl2846);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1374:1: rule__Statement__Group_2_0__2 : rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3 ;
    public final void rule__Statement__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1378:1: ( rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1379:2: rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__22876);
            rule__Statement__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__22879);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1386:1: rule__Statement__Group_2_0__2__Impl : ( 'UNTIL' ) ;
    public final void rule__Statement__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1390:1: ( ( 'UNTIL' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1391:1: ( 'UNTIL' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1391:1: ( 'UNTIL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1392:1: 'UNTIL'
            {
             before(grammarAccess.getStatementAccess().getUNTILKeyword_2_0_2()); 
            match(input,30,FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl2907); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1405:1: rule__Statement__Group_2_0__3 : rule__Statement__Group_2_0__3__Impl ;
    public final void rule__Statement__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1409:1: ( rule__Statement__Group_2_0__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1410:2: rule__Statement__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__32938);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1416:1: rule__Statement__Group_2_0__3__Impl : ( ( rule__Statement__UntilAssignment_2_0_3 ) ) ;
    public final void rule__Statement__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1420:1: ( ( ( rule__Statement__UntilAssignment_2_0_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1421:1: ( ( rule__Statement__UntilAssignment_2_0_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1421:1: ( ( rule__Statement__UntilAssignment_2_0_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1422:1: ( rule__Statement__UntilAssignment_2_0_3 )
            {
             before(grammarAccess.getStatementAccess().getUntilAssignment_2_0_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1423:1: ( rule__Statement__UntilAssignment_2_0_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1423:2: rule__Statement__UntilAssignment_2_0_3
            {
            pushFollow(FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl2965);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1441:1: rule__Statement__Group_2_1__0 : rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1 ;
    public final void rule__Statement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1445:1: ( rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1446:2: rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__03003);
            rule__Statement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__03006);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1453:1: rule__Statement__Group_2_1__0__Impl : ( 'WHILE' ) ;
    public final void rule__Statement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1457:1: ( ( 'WHILE' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1458:1: ( 'WHILE' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1458:1: ( 'WHILE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1459:1: 'WHILE'
            {
             before(grammarAccess.getStatementAccess().getWHILEKeyword_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl3034); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1472:1: rule__Statement__Group_2_1__1 : rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2 ;
    public final void rule__Statement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1476:1: ( rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1477:2: rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13065);
            rule__Statement__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13068);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1484:1: rule__Statement__Group_2_1__1__Impl : ( ( rule__Statement__WhileAssignment_2_1_1 ) ) ;
    public final void rule__Statement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1488:1: ( ( ( rule__Statement__WhileAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1489:1: ( ( rule__Statement__WhileAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1489:1: ( ( rule__Statement__WhileAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1490:1: ( rule__Statement__WhileAssignment_2_1_1 )
            {
             before(grammarAccess.getStatementAccess().getWhileAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1491:1: ( rule__Statement__WhileAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1491:2: rule__Statement__WhileAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3095);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1501:1: rule__Statement__Group_2_1__2 : rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3 ;
    public final void rule__Statement__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1505:1: ( rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1506:2: rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23125);
            rule__Statement__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23128);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1513:1: rule__Statement__Group_2_1__2__Impl : ( 'DO' ) ;
    public final void rule__Statement__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1517:1: ( ( 'DO' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1518:1: ( 'DO' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1518:1: ( 'DO' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1519:1: 'DO'
            {
             before(grammarAccess.getStatementAccess().getDOKeyword_2_1_2()); 
            match(input,32,FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3156); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1532:1: rule__Statement__Group_2_1__3 : rule__Statement__Group_2_1__3__Impl ;
    public final void rule__Statement__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1536:1: ( rule__Statement__Group_2_1__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1537:2: rule__Statement__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33187);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1543:1: rule__Statement__Group_2_1__3__Impl : ( ( rule__Statement__DoAssignment_2_1_3 ) ) ;
    public final void rule__Statement__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1547:1: ( ( ( rule__Statement__DoAssignment_2_1_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1548:1: ( ( rule__Statement__DoAssignment_2_1_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1548:1: ( ( rule__Statement__DoAssignment_2_1_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1549:1: ( rule__Statement__DoAssignment_2_1_3 )
            {
             before(grammarAccess.getStatementAccess().getDoAssignment_2_1_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1550:1: ( rule__Statement__DoAssignment_2_1_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1550:2: rule__Statement__DoAssignment_2_1_3
            {
            pushFollow(FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3214);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1568:1: rule__Statement__Group_2_2__0 : rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1 ;
    public final void rule__Statement__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1572:1: ( rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1573:2: rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03252);
            rule__Statement__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03255);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1580:1: rule__Statement__Group_2_2__0__Impl : ( 'FOR' ) ;
    public final void rule__Statement__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1584:1: ( ( 'FOR' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1585:1: ( 'FOR' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1585:1: ( 'FOR' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1586:1: 'FOR'
            {
             before(grammarAccess.getStatementAccess().getFORKeyword_2_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3283); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1599:1: rule__Statement__Group_2_2__1 : rule__Statement__Group_2_2__1__Impl ;
    public final void rule__Statement__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1603:1: ( rule__Statement__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1604:2: rule__Statement__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13314);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1610:1: rule__Statement__Group_2_2__1__Impl : ( ( rule__Statement__ForAssignment_2_2_1 ) ) ;
    public final void rule__Statement__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1614:1: ( ( ( rule__Statement__ForAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1615:1: ( ( rule__Statement__ForAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1615:1: ( ( rule__Statement__ForAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1616:1: ( rule__Statement__ForAssignment_2_2_1 )
            {
             before(grammarAccess.getStatementAccess().getForAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1617:1: ( rule__Statement__ForAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1617:2: rule__Statement__ForAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3341);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1631:1: rule__Statement__Group_2_3__0 : rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1 ;
    public final void rule__Statement__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1635:1: ( rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1636:2: rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03375);
            rule__Statement__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03378);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1643:1: rule__Statement__Group_2_3__0__Impl : ( 'VAR' ) ;
    public final void rule__Statement__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1647:1: ( ( 'VAR' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1648:1: ( 'VAR' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1648:1: ( 'VAR' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1649:1: 'VAR'
            {
             before(grammarAccess.getStatementAccess().getVARKeyword_2_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3406); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1662:1: rule__Statement__Group_2_3__1 : rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2 ;
    public final void rule__Statement__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1666:1: ( rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1667:2: rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13437);
            rule__Statement__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13440);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1674:1: rule__Statement__Group_2_3__1__Impl : ( ( rule__Statement__VarAssignment_2_3_1 ) ) ;
    public final void rule__Statement__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1678:1: ( ( ( rule__Statement__VarAssignment_2_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1679:1: ( ( rule__Statement__VarAssignment_2_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1679:1: ( ( rule__Statement__VarAssignment_2_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1680:1: ( rule__Statement__VarAssignment_2_3_1 )
            {
             before(grammarAccess.getStatementAccess().getVarAssignment_2_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1681:1: ( rule__Statement__VarAssignment_2_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1681:2: rule__Statement__VarAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3467);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1691:1: rule__Statement__Group_2_3__2 : rule__Statement__Group_2_3__2__Impl ;
    public final void rule__Statement__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1695:1: ( rule__Statement__Group_2_3__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1696:2: rule__Statement__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23497);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1702:1: rule__Statement__Group_2_3__2__Impl : ( ( rule__Statement__Group_2_3_2__0 )? ) ;
    public final void rule__Statement__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1706:1: ( ( ( rule__Statement__Group_2_3_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1707:1: ( ( rule__Statement__Group_2_3_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1707:1: ( ( rule__Statement__Group_2_3_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1708:1: ( rule__Statement__Group_2_3_2__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_2_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1709:1: ( rule__Statement__Group_2_3_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1709:2: rule__Statement__Group_2_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3524);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1725:1: rule__Statement__Group_2_3_2__0 : rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1 ;
    public final void rule__Statement__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1729:1: ( rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1730:2: rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03561);
            rule__Statement__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03564);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1737:1: rule__Statement__Group_2_3_2__0__Impl : ( '=' ) ;
    public final void rule__Statement__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1741:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1742:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1742:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1743:1: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_3_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3592); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1756:1: rule__Statement__Group_2_3_2__1 : rule__Statement__Group_2_3_2__1__Impl ;
    public final void rule__Statement__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1760:1: ( rule__Statement__Group_2_3_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1761:2: rule__Statement__Group_2_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13623);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1767:1: rule__Statement__Group_2_3_2__1__Impl : ( ( rule__Statement__ExAssignment_2_3_2_1 ) ) ;
    public final void rule__Statement__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1771:1: ( ( ( rule__Statement__ExAssignment_2_3_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1772:1: ( ( rule__Statement__ExAssignment_2_3_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1772:1: ( ( rule__Statement__ExAssignment_2_3_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1773:1: ( rule__Statement__ExAssignment_2_3_2_1 )
            {
             before(grammarAccess.getStatementAccess().getExAssignment_2_3_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1774:1: ( rule__Statement__ExAssignment_2_3_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1774:2: rule__Statement__ExAssignment_2_3_2_1
            {
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3650);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1788:1: rule__Statement__Group_2_4__0 : rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1 ;
    public final void rule__Statement__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1792:1: ( rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1793:2: rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03684);
            rule__Statement__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03687);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1800:1: rule__Statement__Group_2_4__0__Impl : ( 'VAL' ) ;
    public final void rule__Statement__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1804:1: ( ( 'VAL' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1805:1: ( 'VAL' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1805:1: ( 'VAL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1806:1: 'VAL'
            {
             before(grammarAccess.getStatementAccess().getVALKeyword_2_4_0()); 
            match(input,36,FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3715); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1819:1: rule__Statement__Group_2_4__1 : rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2 ;
    public final void rule__Statement__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1823:1: ( rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1824:2: rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13746);
            rule__Statement__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13749);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1831:1: rule__Statement__Group_2_4__1__Impl : ( ( rule__Statement__ValAssignment_2_4_1 ) ) ;
    public final void rule__Statement__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1835:1: ( ( ( rule__Statement__ValAssignment_2_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1836:1: ( ( rule__Statement__ValAssignment_2_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1836:1: ( ( rule__Statement__ValAssignment_2_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1837:1: ( rule__Statement__ValAssignment_2_4_1 )
            {
             before(grammarAccess.getStatementAccess().getValAssignment_2_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1838:1: ( rule__Statement__ValAssignment_2_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1838:2: rule__Statement__ValAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl3776);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1848:1: rule__Statement__Group_2_4__2 : rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3 ;
    public final void rule__Statement__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1852:1: ( rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1853:2: rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__23806);
            rule__Statement__Group_2_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__23809);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1860:1: rule__Statement__Group_2_4__2__Impl : ( '=' ) ;
    public final void rule__Statement__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1864:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1865:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1865:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1866:1: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_4_2()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl3837); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1879:1: rule__Statement__Group_2_4__3 : rule__Statement__Group_2_4__3__Impl ;
    public final void rule__Statement__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1883:1: ( rule__Statement__Group_2_4__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1884:2: rule__Statement__Group_2_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__33868);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1890:1: rule__Statement__Group_2_4__3__Impl : ( ( rule__Statement__ExAssignment_2_4_3 ) ) ;
    public final void rule__Statement__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1894:1: ( ( ( rule__Statement__ExAssignment_2_4_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1895:1: ( ( rule__Statement__ExAssignment_2_4_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1895:1: ( ( rule__Statement__ExAssignment_2_4_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1896:1: ( rule__Statement__ExAssignment_2_4_3 )
            {
             before(grammarAccess.getStatementAccess().getExAssignment_2_4_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1897:1: ( rule__Statement__ExAssignment_2_4_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1897:2: rule__Statement__ExAssignment_2_4_3
            {
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl3895);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1915:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1919:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1920:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03933);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03936);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1927:1: rule__Expression__Group__0__Impl : ( 'EXPRESSION' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1931:1: ( ( 'EXPRESSION' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1932:1: ( 'EXPRESSION' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1932:1: ( 'EXPRESSION' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1933:1: 'EXPRESSION'
            {
             before(grammarAccess.getExpressionAccess().getEXPRESSIONKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Expression__Group__0__Impl3964); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1946:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1950:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1951:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13995);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__13998);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1958:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__NameAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1962:1: ( ( ( rule__Expression__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1963:1: ( ( rule__Expression__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1963:1: ( ( rule__Expression__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1964:1: ( rule__Expression__NameAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1965:1: ( rule__Expression__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1965:2: rule__Expression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl4025);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1975:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1979:1: ( rule__Expression__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1980:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24055);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1986:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__PrecAssignment_2 )* ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1990:1: ( ( ( rule__Expression__PrecAssignment_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1991:1: ( ( rule__Expression__PrecAssignment_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1991:1: ( ( rule__Expression__PrecAssignment_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1992:1: ( rule__Expression__PrecAssignment_2 )*
            {
             before(grammarAccess.getExpressionAccess().getPrecAssignment_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1993:1: ( rule__Expression__PrecAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||(LA15_0>=23 && LA15_0<=24)||(LA15_0>=42 && LA15_0<=48)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1993:2: rule__Expression__PrecAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4082);
            	    rule__Expression__PrecAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2009:1: rule__Precedence__Group_0__0 : rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1 ;
    public final void rule__Precedence__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2013:1: ( rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2014:2: rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0__0__Impl_in_rule__Precedence__Group_0__04119);
            rule__Precedence__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_0__1_in_rule__Precedence__Group_0__04122);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2021:1: rule__Precedence__Group_0__0__Impl : ( ( rule__Precedence__RuletypAssignment_0_0 ) ) ;
    public final void rule__Precedence__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2025:1: ( ( ( rule__Precedence__RuletypAssignment_0_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2026:1: ( ( rule__Precedence__RuletypAssignment_0_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2026:1: ( ( rule__Precedence__RuletypAssignment_0_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2027:1: ( rule__Precedence__RuletypAssignment_0_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2028:1: ( rule__Precedence__RuletypAssignment_0_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2028:2: rule__Precedence__RuletypAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_0_0_in_rule__Precedence__Group_0__0__Impl4149);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2038:1: rule__Precedence__Group_0__1 : rule__Precedence__Group_0__1__Impl rule__Precedence__Group_0__2 ;
    public final void rule__Precedence__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2042:1: ( rule__Precedence__Group_0__1__Impl rule__Precedence__Group_0__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2043:2: rule__Precedence__Group_0__1__Impl rule__Precedence__Group_0__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0__1__Impl_in_rule__Precedence__Group_0__14179);
            rule__Precedence__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_0__2_in_rule__Precedence__Group_0__14182);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2050:1: rule__Precedence__Group_0__1__Impl : ( ( rule__Precedence__RuleAssignment_0_1 ) ) ;
    public final void rule__Precedence__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2054:1: ( ( ( rule__Precedence__RuleAssignment_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2055:1: ( ( rule__Precedence__RuleAssignment_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2055:1: ( ( rule__Precedence__RuleAssignment_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2056:1: ( rule__Precedence__RuleAssignment_0_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2057:1: ( rule__Precedence__RuleAssignment_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2057:2: rule__Precedence__RuleAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_0_1_in_rule__Precedence__Group_0__1__Impl4209);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2067:1: rule__Precedence__Group_0__2 : rule__Precedence__Group_0__2__Impl ;
    public final void rule__Precedence__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2071:1: ( rule__Precedence__Group_0__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2072:2: rule__Precedence__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0__2__Impl_in_rule__Precedence__Group_0__24239);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2078:1: rule__Precedence__Group_0__2__Impl : ( ( rule__Precedence__Group_0_2__0 )? ) ;
    public final void rule__Precedence__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2082:1: ( ( ( rule__Precedence__Group_0_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2083:1: ( ( rule__Precedence__Group_0_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2083:1: ( ( rule__Precedence__Group_0_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2084:1: ( rule__Precedence__Group_0_2__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_0_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2085:1: ( rule__Precedence__Group_0_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2085:2: rule__Precedence__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_0_2__0_in_rule__Precedence__Group_0__2__Impl4266);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2101:1: rule__Precedence__Group_0_2__0 : rule__Precedence__Group_0_2__0__Impl rule__Precedence__Group_0_2__1 ;
    public final void rule__Precedence__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2105:1: ( rule__Precedence__Group_0_2__0__Impl rule__Precedence__Group_0_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2106:2: rule__Precedence__Group_0_2__0__Impl rule__Precedence__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0_2__0__Impl_in_rule__Precedence__Group_0_2__04303);
            rule__Precedence__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_0_2__1_in_rule__Precedence__Group_0_2__04306);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2113:1: rule__Precedence__Group_0_2__0__Impl : ( '.' ) ;
    public final void rule__Precedence__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2117:1: ( ( '.' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2118:1: ( '.' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2118:1: ( '.' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2119:1: '.'
            {
             before(grammarAccess.getPrecedenceAccess().getFullStopKeyword_0_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Precedence__Group_0_2__0__Impl4334); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2132:1: rule__Precedence__Group_0_2__1 : rule__Precedence__Group_0_2__1__Impl ;
    public final void rule__Precedence__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2136:1: ( rule__Precedence__Group_0_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2137:2: rule__Precedence__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0_2__1__Impl_in_rule__Precedence__Group_0_2__14365);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2143:1: rule__Precedence__Group_0_2__1__Impl : ( ( rule__Precedence__Feature1Assignment_0_2_1 ) ) ;
    public final void rule__Precedence__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2147:1: ( ( ( rule__Precedence__Feature1Assignment_0_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2148:1: ( ( rule__Precedence__Feature1Assignment_0_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2148:1: ( ( rule__Precedence__Feature1Assignment_0_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2149:1: ( rule__Precedence__Feature1Assignment_0_2_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_0_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2150:1: ( rule__Precedence__Feature1Assignment_0_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2150:2: rule__Precedence__Feature1Assignment_0_2_1
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_0_2_1_in_rule__Precedence__Group_0_2__1__Impl4392);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2164:1: rule__Precedence__Group_1__0 : rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1 ;
    public final void rule__Precedence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2168:1: ( rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2169:2: rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__0__Impl_in_rule__Precedence__Group_1__04426);
            rule__Precedence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__1_in_rule__Precedence__Group_1__04429);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2176:1: rule__Precedence__Group_1__0__Impl : ( ( rule__Precedence__RuletypAssignment_1_0 ) ) ;
    public final void rule__Precedence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2180:1: ( ( ( rule__Precedence__RuletypAssignment_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2181:1: ( ( rule__Precedence__RuletypAssignment_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2181:1: ( ( rule__Precedence__RuletypAssignment_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2182:1: ( rule__Precedence__RuletypAssignment_1_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2183:1: ( rule__Precedence__RuletypAssignment_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2183:2: rule__Precedence__RuletypAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_1_0_in_rule__Precedence__Group_1__0__Impl4456);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2193:1: rule__Precedence__Group_1__1 : rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2 ;
    public final void rule__Precedence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2197:1: ( rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2198:2: rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__1__Impl_in_rule__Precedence__Group_1__14486);
            rule__Precedence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__2_in_rule__Precedence__Group_1__14489);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2205:1: rule__Precedence__Group_1__1__Impl : ( ( rule__Precedence__RuleAssignment_1_1 ) ) ;
    public final void rule__Precedence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2209:1: ( ( ( rule__Precedence__RuleAssignment_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2210:1: ( ( rule__Precedence__RuleAssignment_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2210:1: ( ( rule__Precedence__RuleAssignment_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2211:1: ( rule__Precedence__RuleAssignment_1_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2212:1: ( rule__Precedence__RuleAssignment_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2212:2: rule__Precedence__RuleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_1_1_in_rule__Precedence__Group_1__1__Impl4516);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2222:1: rule__Precedence__Group_1__2 : rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3 ;
    public final void rule__Precedence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2226:1: ( rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2227:2: rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__2__Impl_in_rule__Precedence__Group_1__24546);
            rule__Precedence__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__3_in_rule__Precedence__Group_1__24549);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2234:1: rule__Precedence__Group_1__2__Impl : ( ( rule__Precedence__PrefixAssignment_1_2 ) ) ;
    public final void rule__Precedence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2238:1: ( ( ( rule__Precedence__PrefixAssignment_1_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2239:1: ( ( rule__Precedence__PrefixAssignment_1_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2239:1: ( ( rule__Precedence__PrefixAssignment_1_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2240:1: ( rule__Precedence__PrefixAssignment_1_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getPrefixAssignment_1_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2241:1: ( rule__Precedence__PrefixAssignment_1_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2241:2: rule__Precedence__PrefixAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Precedence__PrefixAssignment_1_2_in_rule__Precedence__Group_1__2__Impl4576);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2251:1: rule__Precedence__Group_1__3 : rule__Precedence__Group_1__3__Impl rule__Precedence__Group_1__4 ;
    public final void rule__Precedence__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2255:1: ( rule__Precedence__Group_1__3__Impl rule__Precedence__Group_1__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2256:2: rule__Precedence__Group_1__3__Impl rule__Precedence__Group_1__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__3__Impl_in_rule__Precedence__Group_1__34606);
            rule__Precedence__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__4_in_rule__Precedence__Group_1__34609);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2263:1: rule__Precedence__Group_1__3__Impl : ( ( rule__Precedence__Group_1_3__0 )? ) ;
    public final void rule__Precedence__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2267:1: ( ( ( rule__Precedence__Group_1_3__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2268:1: ( ( rule__Precedence__Group_1_3__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2268:1: ( ( rule__Precedence__Group_1_3__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2269:1: ( rule__Precedence__Group_1_3__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_1_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2270:1: ( rule__Precedence__Group_1_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==35) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2270:2: rule__Precedence__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_1_3__0_in_rule__Precedence__Group_1__3__Impl4636);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2280:1: rule__Precedence__Group_1__4 : rule__Precedence__Group_1__4__Impl ;
    public final void rule__Precedence__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2284:1: ( rule__Precedence__Group_1__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2285:2: rule__Precedence__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__4__Impl_in_rule__Precedence__Group_1__44667);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2291:1: rule__Precedence__Group_1__4__Impl : ( ( rule__Precedence__Par1Assignment_1_4 ) ) ;
    public final void rule__Precedence__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2295:1: ( ( ( rule__Precedence__Par1Assignment_1_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2296:1: ( ( rule__Precedence__Par1Assignment_1_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2296:1: ( ( rule__Precedence__Par1Assignment_1_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2297:1: ( rule__Precedence__Par1Assignment_1_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_1_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2298:1: ( rule__Precedence__Par1Assignment_1_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2298:2: rule__Precedence__Par1Assignment_1_4
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_1_4_in_rule__Precedence__Group_1__4__Impl4694);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2318:1: rule__Precedence__Group_1_3__0 : rule__Precedence__Group_1_3__0__Impl rule__Precedence__Group_1_3__1 ;
    public final void rule__Precedence__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2322:1: ( rule__Precedence__Group_1_3__0__Impl rule__Precedence__Group_1_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2323:2: rule__Precedence__Group_1_3__0__Impl rule__Precedence__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1_3__0__Impl_in_rule__Precedence__Group_1_3__04734);
            rule__Precedence__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1_3__1_in_rule__Precedence__Group_1_3__04737);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2330:1: rule__Precedence__Group_1_3__0__Impl : ( ( rule__Precedence__Feature1Assignment_1_3_0 ) ) ;
    public final void rule__Precedence__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2334:1: ( ( ( rule__Precedence__Feature1Assignment_1_3_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2335:1: ( ( rule__Precedence__Feature1Assignment_1_3_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2335:1: ( ( rule__Precedence__Feature1Assignment_1_3_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2336:1: ( rule__Precedence__Feature1Assignment_1_3_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_1_3_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2337:1: ( rule__Precedence__Feature1Assignment_1_3_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2337:2: rule__Precedence__Feature1Assignment_1_3_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_1_3_0_in_rule__Precedence__Group_1_3__0__Impl4764);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2347:1: rule__Precedence__Group_1_3__1 : rule__Precedence__Group_1_3__1__Impl ;
    public final void rule__Precedence__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2351:1: ( rule__Precedence__Group_1_3__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2352:2: rule__Precedence__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1_3__1__Impl_in_rule__Precedence__Group_1_3__14794);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2358:1: rule__Precedence__Group_1_3__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2362:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2363:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2363:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2364:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_1_3_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_1_3__1__Impl4822); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2381:1: rule__Precedence__Group_2__0 : rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1 ;
    public final void rule__Precedence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2385:1: ( rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2386:2: rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__0__Impl_in_rule__Precedence__Group_2__04857);
            rule__Precedence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__1_in_rule__Precedence__Group_2__04860);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2393:1: rule__Precedence__Group_2__0__Impl : ( ( rule__Precedence__RuletypAssignment_2_0 ) ) ;
    public final void rule__Precedence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2397:1: ( ( ( rule__Precedence__RuletypAssignment_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2398:1: ( ( rule__Precedence__RuletypAssignment_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2398:1: ( ( rule__Precedence__RuletypAssignment_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2399:1: ( rule__Precedence__RuletypAssignment_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2400:1: ( rule__Precedence__RuletypAssignment_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2400:2: rule__Precedence__RuletypAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_2_0_in_rule__Precedence__Group_2__0__Impl4887);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2410:1: rule__Precedence__Group_2__1 : rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2 ;
    public final void rule__Precedence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2414:1: ( rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2415:2: rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__1__Impl_in_rule__Precedence__Group_2__14917);
            rule__Precedence__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__2_in_rule__Precedence__Group_2__14920);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2422:1: rule__Precedence__Group_2__1__Impl : ( ( rule__Precedence__RuleAssignment_2_1 ) ) ;
    public final void rule__Precedence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2426:1: ( ( ( rule__Precedence__RuleAssignment_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2427:1: ( ( rule__Precedence__RuleAssignment_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2427:1: ( ( rule__Precedence__RuleAssignment_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2428:1: ( rule__Precedence__RuleAssignment_2_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2429:1: ( rule__Precedence__RuleAssignment_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2429:2: rule__Precedence__RuleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_2_1_in_rule__Precedence__Group_2__1__Impl4947);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2439:1: rule__Precedence__Group_2__2 : rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3 ;
    public final void rule__Precedence__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2443:1: ( rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2444:2: rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__2__Impl_in_rule__Precedence__Group_2__24977);
            rule__Precedence__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__3_in_rule__Precedence__Group_2__24980);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2451:1: rule__Precedence__Group_2__2__Impl : ( ( rule__Precedence__Group_2_2__0 )? ) ;
    public final void rule__Precedence__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2455:1: ( ( ( rule__Precedence__Group_2_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2456:1: ( ( rule__Precedence__Group_2_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2456:1: ( ( rule__Precedence__Group_2_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2457:1: ( rule__Precedence__Group_2_2__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_2_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2458:1: ( rule__Precedence__Group_2_2__0 )?
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2458:2: rule__Precedence__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_2_2__0_in_rule__Precedence__Group_2__2__Impl5007);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2468:1: rule__Precedence__Group_2__3 : rule__Precedence__Group_2__3__Impl rule__Precedence__Group_2__4 ;
    public final void rule__Precedence__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2472:1: ( rule__Precedence__Group_2__3__Impl rule__Precedence__Group_2__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2473:2: rule__Precedence__Group_2__3__Impl rule__Precedence__Group_2__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__3__Impl_in_rule__Precedence__Group_2__35038);
            rule__Precedence__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__4_in_rule__Precedence__Group_2__35041);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2480:1: rule__Precedence__Group_2__3__Impl : ( ( rule__Precedence__Par1Assignment_2_3 ) ) ;
    public final void rule__Precedence__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2484:1: ( ( ( rule__Precedence__Par1Assignment_2_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2485:1: ( ( rule__Precedence__Par1Assignment_2_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2485:1: ( ( rule__Precedence__Par1Assignment_2_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2486:1: ( rule__Precedence__Par1Assignment_2_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_2_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2487:1: ( rule__Precedence__Par1Assignment_2_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2487:2: rule__Precedence__Par1Assignment_2_3
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_2_3_in_rule__Precedence__Group_2__3__Impl5068);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2497:1: rule__Precedence__Group_2__4 : rule__Precedence__Group_2__4__Impl ;
    public final void rule__Precedence__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2501:1: ( rule__Precedence__Group_2__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2502:2: rule__Precedence__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__4__Impl_in_rule__Precedence__Group_2__45098);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2508:1: rule__Precedence__Group_2__4__Impl : ( ( rule__Precedence__SuffixAssignment_2_4 ) ) ;
    public final void rule__Precedence__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2512:1: ( ( ( rule__Precedence__SuffixAssignment_2_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2513:1: ( ( rule__Precedence__SuffixAssignment_2_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2513:1: ( ( rule__Precedence__SuffixAssignment_2_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2514:1: ( rule__Precedence__SuffixAssignment_2_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getSuffixAssignment_2_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2515:1: ( rule__Precedence__SuffixAssignment_2_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2515:2: rule__Precedence__SuffixAssignment_2_4
            {
            pushFollow(FOLLOW_rule__Precedence__SuffixAssignment_2_4_in_rule__Precedence__Group_2__4__Impl5125);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2535:1: rule__Precedence__Group_2_2__0 : rule__Precedence__Group_2_2__0__Impl rule__Precedence__Group_2_2__1 ;
    public final void rule__Precedence__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2539:1: ( rule__Precedence__Group_2_2__0__Impl rule__Precedence__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2540:2: rule__Precedence__Group_2_2__0__Impl rule__Precedence__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2_2__0__Impl_in_rule__Precedence__Group_2_2__05165);
            rule__Precedence__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2_2__1_in_rule__Precedence__Group_2_2__05168);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2547:1: rule__Precedence__Group_2_2__0__Impl : ( ( rule__Precedence__Feature1Assignment_2_2_0 ) ) ;
    public final void rule__Precedence__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2551:1: ( ( ( rule__Precedence__Feature1Assignment_2_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2552:1: ( ( rule__Precedence__Feature1Assignment_2_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2552:1: ( ( rule__Precedence__Feature1Assignment_2_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2553:1: ( rule__Precedence__Feature1Assignment_2_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_2_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2554:1: ( rule__Precedence__Feature1Assignment_2_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2554:2: rule__Precedence__Feature1Assignment_2_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_2_2_0_in_rule__Precedence__Group_2_2__0__Impl5195);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2564:1: rule__Precedence__Group_2_2__1 : rule__Precedence__Group_2_2__1__Impl ;
    public final void rule__Precedence__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2568:1: ( rule__Precedence__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2569:2: rule__Precedence__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2_2__1__Impl_in_rule__Precedence__Group_2_2__15225);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2575:1: rule__Precedence__Group_2_2__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2579:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2580:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2580:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2581:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_2_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_2_2__1__Impl5253); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2598:1: rule__Precedence__Group_3__0 : rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1 ;
    public final void rule__Precedence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2602:1: ( rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2603:2: rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__0__Impl_in_rule__Precedence__Group_3__05288);
            rule__Precedence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__1_in_rule__Precedence__Group_3__05291);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2610:1: rule__Precedence__Group_3__0__Impl : ( ( rule__Precedence__RuletypAssignment_3_0 ) ) ;
    public final void rule__Precedence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2614:1: ( ( ( rule__Precedence__RuletypAssignment_3_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2615:1: ( ( rule__Precedence__RuletypAssignment_3_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2615:1: ( ( rule__Precedence__RuletypAssignment_3_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2616:1: ( rule__Precedence__RuletypAssignment_3_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_3_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2617:1: ( rule__Precedence__RuletypAssignment_3_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2617:2: rule__Precedence__RuletypAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_3_0_in_rule__Precedence__Group_3__0__Impl5318);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2627:1: rule__Precedence__Group_3__1 : rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2 ;
    public final void rule__Precedence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2631:1: ( rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2632:2: rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__1__Impl_in_rule__Precedence__Group_3__15348);
            rule__Precedence__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__2_in_rule__Precedence__Group_3__15351);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2639:1: rule__Precedence__Group_3__1__Impl : ( ( rule__Precedence__RuleAssignment_3_1 ) ) ;
    public final void rule__Precedence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2643:1: ( ( ( rule__Precedence__RuleAssignment_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2644:1: ( ( rule__Precedence__RuleAssignment_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2644:1: ( ( rule__Precedence__RuleAssignment_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2645:1: ( rule__Precedence__RuleAssignment_3_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2646:1: ( rule__Precedence__RuleAssignment_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2646:2: rule__Precedence__RuleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_3_1_in_rule__Precedence__Group_3__1__Impl5378);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2656:1: rule__Precedence__Group_3__2 : rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3 ;
    public final void rule__Precedence__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2660:1: ( rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2661:2: rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__2__Impl_in_rule__Precedence__Group_3__25408);
            rule__Precedence__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__3_in_rule__Precedence__Group_3__25411);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2668:1: rule__Precedence__Group_3__2__Impl : ( ( rule__Precedence__Group_3_2__0 )? ) ;
    public final void rule__Precedence__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2672:1: ( ( ( rule__Precedence__Group_3_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2673:1: ( ( rule__Precedence__Group_3_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2673:1: ( ( rule__Precedence__Group_3_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2674:1: ( rule__Precedence__Group_3_2__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2675:1: ( rule__Precedence__Group_3_2__0 )?
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2675:2: rule__Precedence__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_3_2__0_in_rule__Precedence__Group_3__2__Impl5438);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2685:1: rule__Precedence__Group_3__3 : rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4 ;
    public final void rule__Precedence__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2689:1: ( rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2690:2: rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__3__Impl_in_rule__Precedence__Group_3__35469);
            rule__Precedence__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__4_in_rule__Precedence__Group_3__35472);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2697:1: rule__Precedence__Group_3__3__Impl : ( ( rule__Precedence__Par1Assignment_3_3 ) ) ;
    public final void rule__Precedence__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2701:1: ( ( ( rule__Precedence__Par1Assignment_3_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2702:1: ( ( rule__Precedence__Par1Assignment_3_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2702:1: ( ( rule__Precedence__Par1Assignment_3_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2703:1: ( rule__Precedence__Par1Assignment_3_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_3_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2704:1: ( rule__Precedence__Par1Assignment_3_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2704:2: rule__Precedence__Par1Assignment_3_3
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_3_3_in_rule__Precedence__Group_3__3__Impl5499);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2714:1: rule__Precedence__Group_3__4 : rule__Precedence__Group_3__4__Impl rule__Precedence__Group_3__5 ;
    public final void rule__Precedence__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2718:1: ( rule__Precedence__Group_3__4__Impl rule__Precedence__Group_3__5 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2719:2: rule__Precedence__Group_3__4__Impl rule__Precedence__Group_3__5
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__4__Impl_in_rule__Precedence__Group_3__45529);
            rule__Precedence__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__5_in_rule__Precedence__Group_3__45532);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2726:1: rule__Precedence__Group_3__4__Impl : ( ( rule__Precedence__InfixAssignment_3_4 ) ) ;
    public final void rule__Precedence__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2730:1: ( ( ( rule__Precedence__InfixAssignment_3_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2731:1: ( ( rule__Precedence__InfixAssignment_3_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2731:1: ( ( rule__Precedence__InfixAssignment_3_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2732:1: ( rule__Precedence__InfixAssignment_3_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getInfixAssignment_3_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2733:1: ( rule__Precedence__InfixAssignment_3_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2733:2: rule__Precedence__InfixAssignment_3_4
            {
            pushFollow(FOLLOW_rule__Precedence__InfixAssignment_3_4_in_rule__Precedence__Group_3__4__Impl5559);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2743:1: rule__Precedence__Group_3__5 : rule__Precedence__Group_3__5__Impl rule__Precedence__Group_3__6 ;
    public final void rule__Precedence__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2747:1: ( rule__Precedence__Group_3__5__Impl rule__Precedence__Group_3__6 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2748:2: rule__Precedence__Group_3__5__Impl rule__Precedence__Group_3__6
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__5__Impl_in_rule__Precedence__Group_3__55589);
            rule__Precedence__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__6_in_rule__Precedence__Group_3__55592);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2755:1: rule__Precedence__Group_3__5__Impl : ( ( rule__Precedence__Group_3_5__0 )? ) ;
    public final void rule__Precedence__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2759:1: ( ( ( rule__Precedence__Group_3_5__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2760:1: ( ( rule__Precedence__Group_3_5__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2760:1: ( ( rule__Precedence__Group_3_5__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2761:1: ( rule__Precedence__Group_3_5__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_3_5()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2762:1: ( rule__Precedence__Group_3_5__0 )?
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2762:2: rule__Precedence__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_3_5__0_in_rule__Precedence__Group_3__5__Impl5619);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2772:1: rule__Precedence__Group_3__6 : rule__Precedence__Group_3__6__Impl ;
    public final void rule__Precedence__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2776:1: ( rule__Precedence__Group_3__6__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2777:2: rule__Precedence__Group_3__6__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__6__Impl_in_rule__Precedence__Group_3__65650);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2783:1: rule__Precedence__Group_3__6__Impl : ( ( rule__Precedence__Par2Assignment_3_6 ) ) ;
    public final void rule__Precedence__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2787:1: ( ( ( rule__Precedence__Par2Assignment_3_6 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2788:1: ( ( rule__Precedence__Par2Assignment_3_6 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2788:1: ( ( rule__Precedence__Par2Assignment_3_6 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2789:1: ( rule__Precedence__Par2Assignment_3_6 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar2Assignment_3_6()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2790:1: ( rule__Precedence__Par2Assignment_3_6 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2790:2: rule__Precedence__Par2Assignment_3_6
            {
            pushFollow(FOLLOW_rule__Precedence__Par2Assignment_3_6_in_rule__Precedence__Group_3__6__Impl5677);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2814:1: rule__Precedence__Group_3_2__0 : rule__Precedence__Group_3_2__0__Impl rule__Precedence__Group_3_2__1 ;
    public final void rule__Precedence__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2818:1: ( rule__Precedence__Group_3_2__0__Impl rule__Precedence__Group_3_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2819:2: rule__Precedence__Group_3_2__0__Impl rule__Precedence__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3_2__0__Impl_in_rule__Precedence__Group_3_2__05721);
            rule__Precedence__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3_2__1_in_rule__Precedence__Group_3_2__05724);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2826:1: rule__Precedence__Group_3_2__0__Impl : ( ( rule__Precedence__Feature1Assignment_3_2_0 ) ) ;
    public final void rule__Precedence__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2830:1: ( ( ( rule__Precedence__Feature1Assignment_3_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2831:1: ( ( rule__Precedence__Feature1Assignment_3_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2831:1: ( ( rule__Precedence__Feature1Assignment_3_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2832:1: ( rule__Precedence__Feature1Assignment_3_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_3_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2833:1: ( rule__Precedence__Feature1Assignment_3_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2833:2: rule__Precedence__Feature1Assignment_3_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_3_2_0_in_rule__Precedence__Group_3_2__0__Impl5751);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2843:1: rule__Precedence__Group_3_2__1 : rule__Precedence__Group_3_2__1__Impl ;
    public final void rule__Precedence__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2847:1: ( rule__Precedence__Group_3_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2848:2: rule__Precedence__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3_2__1__Impl_in_rule__Precedence__Group_3_2__15781);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2854:1: rule__Precedence__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2858:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2859:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2859:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2860:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_3_2__1__Impl5809); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2877:1: rule__Precedence__Group_3_5__0 : rule__Precedence__Group_3_5__0__Impl rule__Precedence__Group_3_5__1 ;
    public final void rule__Precedence__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2881:1: ( rule__Precedence__Group_3_5__0__Impl rule__Precedence__Group_3_5__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2882:2: rule__Precedence__Group_3_5__0__Impl rule__Precedence__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3_5__0__Impl_in_rule__Precedence__Group_3_5__05844);
            rule__Precedence__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3_5__1_in_rule__Precedence__Group_3_5__05847);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2889:1: rule__Precedence__Group_3_5__0__Impl : ( ( rule__Precedence__Feature2Assignment_3_5_0 ) ) ;
    public final void rule__Precedence__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2893:1: ( ( ( rule__Precedence__Feature2Assignment_3_5_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2894:1: ( ( rule__Precedence__Feature2Assignment_3_5_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2894:1: ( ( rule__Precedence__Feature2Assignment_3_5_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2895:1: ( rule__Precedence__Feature2Assignment_3_5_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature2Assignment_3_5_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2896:1: ( rule__Precedence__Feature2Assignment_3_5_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2896:2: rule__Precedence__Feature2Assignment_3_5_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature2Assignment_3_5_0_in_rule__Precedence__Group_3_5__0__Impl5874);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2906:1: rule__Precedence__Group_3_5__1 : rule__Precedence__Group_3_5__1__Impl ;
    public final void rule__Precedence__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2910:1: ( rule__Precedence__Group_3_5__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2911:2: rule__Precedence__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3_5__1__Impl_in_rule__Precedence__Group_3_5__15904);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2917:1: rule__Precedence__Group_3_5__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2921:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2922:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2922:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2923:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_3_5_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_3_5__1__Impl5932); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2940:1: rule__Precedence__Group_4__0 : rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1 ;
    public final void rule__Precedence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2944:1: ( rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2945:2: rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__0__Impl_in_rule__Precedence__Group_4__05967);
            rule__Precedence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__1_in_rule__Precedence__Group_4__05970);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2952:1: rule__Precedence__Group_4__0__Impl : ( ( rule__Precedence__RuletypAssignment_4_0 ) ) ;
    public final void rule__Precedence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2956:1: ( ( ( rule__Precedence__RuletypAssignment_4_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2957:1: ( ( rule__Precedence__RuletypAssignment_4_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2957:1: ( ( rule__Precedence__RuletypAssignment_4_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2958:1: ( rule__Precedence__RuletypAssignment_4_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_4_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2959:1: ( rule__Precedence__RuletypAssignment_4_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2959:2: rule__Precedence__RuletypAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_4_0_in_rule__Precedence__Group_4__0__Impl5997);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2969:1: rule__Precedence__Group_4__1 : rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2 ;
    public final void rule__Precedence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2973:1: ( rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2974:2: rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__1__Impl_in_rule__Precedence__Group_4__16027);
            rule__Precedence__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__2_in_rule__Precedence__Group_4__16030);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2981:1: rule__Precedence__Group_4__1__Impl : ( ( rule__Precedence__RuleAssignment_4_1 ) ) ;
    public final void rule__Precedence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2985:1: ( ( ( rule__Precedence__RuleAssignment_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2986:1: ( ( rule__Precedence__RuleAssignment_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2986:1: ( ( rule__Precedence__RuleAssignment_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2987:1: ( rule__Precedence__RuleAssignment_4_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2988:1: ( rule__Precedence__RuleAssignment_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2988:2: rule__Precedence__RuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_4_1_in_rule__Precedence__Group_4__1__Impl6057);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2998:1: rule__Precedence__Group_4__2 : rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3 ;
    public final void rule__Precedence__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3002:1: ( rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3003:2: rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__2__Impl_in_rule__Precedence__Group_4__26087);
            rule__Precedence__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__3_in_rule__Precedence__Group_4__26090);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3010:1: rule__Precedence__Group_4__2__Impl : ( ( rule__Precedence__Group_4_2__0 )? ) ;
    public final void rule__Precedence__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3014:1: ( ( ( rule__Precedence__Group_4_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3015:1: ( ( rule__Precedence__Group_4_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3015:1: ( ( rule__Precedence__Group_4_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3016:1: ( rule__Precedence__Group_4_2__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_4_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3017:1: ( rule__Precedence__Group_4_2__0 )?
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3017:2: rule__Precedence__Group_4_2__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_4_2__0_in_rule__Precedence__Group_4__2__Impl6117);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3027:1: rule__Precedence__Group_4__3 : rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4 ;
    public final void rule__Precedence__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3031:1: ( rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3032:2: rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__3__Impl_in_rule__Precedence__Group_4__36148);
            rule__Precedence__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__4_in_rule__Precedence__Group_4__36151);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3039:1: rule__Precedence__Group_4__3__Impl : ( ( rule__Precedence__Par1Assignment_4_3 ) ) ;
    public final void rule__Precedence__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3043:1: ( ( ( rule__Precedence__Par1Assignment_4_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3044:1: ( ( rule__Precedence__Par1Assignment_4_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3044:1: ( ( rule__Precedence__Par1Assignment_4_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3045:1: ( rule__Precedence__Par1Assignment_4_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_4_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3046:1: ( rule__Precedence__Par1Assignment_4_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3046:2: rule__Precedence__Par1Assignment_4_3
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_4_3_in_rule__Precedence__Group_4__3__Impl6178);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3056:1: rule__Precedence__Group_4__4 : rule__Precedence__Group_4__4__Impl rule__Precedence__Group_4__5 ;
    public final void rule__Precedence__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3060:1: ( rule__Precedence__Group_4__4__Impl rule__Precedence__Group_4__5 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3061:2: rule__Precedence__Group_4__4__Impl rule__Precedence__Group_4__5
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__4__Impl_in_rule__Precedence__Group_4__46208);
            rule__Precedence__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__5_in_rule__Precedence__Group_4__46211);
            rule__Precedence__Group_4__5();

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3068:1: rule__Precedence__Group_4__4__Impl : ( ( rule__Precedence__InfixAssignment_4_4 ) ) ;
    public final void rule__Precedence__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3072:1: ( ( ( rule__Precedence__InfixAssignment_4_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3073:1: ( ( rule__Precedence__InfixAssignment_4_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3073:1: ( ( rule__Precedence__InfixAssignment_4_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3074:1: ( rule__Precedence__InfixAssignment_4_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getInfixAssignment_4_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3075:1: ( rule__Precedence__InfixAssignment_4_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3075:2: rule__Precedence__InfixAssignment_4_4
            {
            pushFollow(FOLLOW_rule__Precedence__InfixAssignment_4_4_in_rule__Precedence__Group_4__4__Impl6238);
            rule__Precedence__InfixAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getInfixAssignment_4_4()); 

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


    // $ANTLR start "rule__Precedence__Group_4__5"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3085:1: rule__Precedence__Group_4__5 : rule__Precedence__Group_4__5__Impl rule__Precedence__Group_4__6 ;
    public final void rule__Precedence__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3089:1: ( rule__Precedence__Group_4__5__Impl rule__Precedence__Group_4__6 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3090:2: rule__Precedence__Group_4__5__Impl rule__Precedence__Group_4__6
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__5__Impl_in_rule__Precedence__Group_4__56268);
            rule__Precedence__Group_4__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__6_in_rule__Precedence__Group_4__56271);
            rule__Precedence__Group_4__6();

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
    // $ANTLR end "rule__Precedence__Group_4__5"


    // $ANTLR start "rule__Precedence__Group_4__5__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3097:1: rule__Precedence__Group_4__5__Impl : ( ( rule__Precedence__Group_4_5__0 )? ) ;
    public final void rule__Precedence__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3101:1: ( ( ( rule__Precedence__Group_4_5__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3102:1: ( ( rule__Precedence__Group_4_5__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3102:1: ( ( rule__Precedence__Group_4_5__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3103:1: ( rule__Precedence__Group_4_5__0 )?
            {
             before(grammarAccess.getPrecedenceAccess().getGroup_4_5()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3104:1: ( rule__Precedence__Group_4_5__0 )?
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3104:2: rule__Precedence__Group_4_5__0
                    {
                    pushFollow(FOLLOW_rule__Precedence__Group_4_5__0_in_rule__Precedence__Group_4__5__Impl6298);
                    rule__Precedence__Group_4_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrecedenceAccess().getGroup_4_5()); 

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
    // $ANTLR end "rule__Precedence__Group_4__5__Impl"


    // $ANTLR start "rule__Precedence__Group_4__6"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3114:1: rule__Precedence__Group_4__6 : rule__Precedence__Group_4__6__Impl ;
    public final void rule__Precedence__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3118:1: ( rule__Precedence__Group_4__6__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3119:2: rule__Precedence__Group_4__6__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__6__Impl_in_rule__Precedence__Group_4__66329);
            rule__Precedence__Group_4__6__Impl();

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
    // $ANTLR end "rule__Precedence__Group_4__6"


    // $ANTLR start "rule__Precedence__Group_4__6__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3125:1: rule__Precedence__Group_4__6__Impl : ( ( rule__Precedence__Par2Assignment_4_6 ) ) ;
    public final void rule__Precedence__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3129:1: ( ( ( rule__Precedence__Par2Assignment_4_6 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3130:1: ( ( rule__Precedence__Par2Assignment_4_6 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3130:1: ( ( rule__Precedence__Par2Assignment_4_6 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3131:1: ( rule__Precedence__Par2Assignment_4_6 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar2Assignment_4_6()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3132:1: ( rule__Precedence__Par2Assignment_4_6 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3132:2: rule__Precedence__Par2Assignment_4_6
            {
            pushFollow(FOLLOW_rule__Precedence__Par2Assignment_4_6_in_rule__Precedence__Group_4__6__Impl6356);
            rule__Precedence__Par2Assignment_4_6();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar2Assignment_4_6()); 

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
    // $ANTLR end "rule__Precedence__Group_4__6__Impl"


    // $ANTLR start "rule__Precedence__Group_4_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3156:1: rule__Precedence__Group_4_2__0 : rule__Precedence__Group_4_2__0__Impl rule__Precedence__Group_4_2__1 ;
    public final void rule__Precedence__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3160:1: ( rule__Precedence__Group_4_2__0__Impl rule__Precedence__Group_4_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3161:2: rule__Precedence__Group_4_2__0__Impl rule__Precedence__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4_2__0__Impl_in_rule__Precedence__Group_4_2__06400);
            rule__Precedence__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4_2__1_in_rule__Precedence__Group_4_2__06403);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3168:1: rule__Precedence__Group_4_2__0__Impl : ( ( rule__Precedence__Feature1Assignment_4_2_0 ) ) ;
    public final void rule__Precedence__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3172:1: ( ( ( rule__Precedence__Feature1Assignment_4_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3173:1: ( ( rule__Precedence__Feature1Assignment_4_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3173:1: ( ( rule__Precedence__Feature1Assignment_4_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3174:1: ( rule__Precedence__Feature1Assignment_4_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1Assignment_4_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3175:1: ( rule__Precedence__Feature1Assignment_4_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3175:2: rule__Precedence__Feature1Assignment_4_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature1Assignment_4_2_0_in_rule__Precedence__Group_4_2__0__Impl6430);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3185:1: rule__Precedence__Group_4_2__1 : rule__Precedence__Group_4_2__1__Impl ;
    public final void rule__Precedence__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3189:1: ( rule__Precedence__Group_4_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3190:2: rule__Precedence__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4_2__1__Impl_in_rule__Precedence__Group_4_2__16460);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3196:1: rule__Precedence__Group_4_2__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3200:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3201:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3201:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3202:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_4_2__1__Impl6488); 
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


    // $ANTLR start "rule__Precedence__Group_4_5__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3219:1: rule__Precedence__Group_4_5__0 : rule__Precedence__Group_4_5__0__Impl rule__Precedence__Group_4_5__1 ;
    public final void rule__Precedence__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3223:1: ( rule__Precedence__Group_4_5__0__Impl rule__Precedence__Group_4_5__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3224:2: rule__Precedence__Group_4_5__0__Impl rule__Precedence__Group_4_5__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4_5__0__Impl_in_rule__Precedence__Group_4_5__06523);
            rule__Precedence__Group_4_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4_5__1_in_rule__Precedence__Group_4_5__06526);
            rule__Precedence__Group_4_5__1();

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
    // $ANTLR end "rule__Precedence__Group_4_5__0"


    // $ANTLR start "rule__Precedence__Group_4_5__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3231:1: rule__Precedence__Group_4_5__0__Impl : ( ( rule__Precedence__Feature2Assignment_4_5_0 ) ) ;
    public final void rule__Precedence__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3235:1: ( ( ( rule__Precedence__Feature2Assignment_4_5_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3236:1: ( ( rule__Precedence__Feature2Assignment_4_5_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3236:1: ( ( rule__Precedence__Feature2Assignment_4_5_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3237:1: ( rule__Precedence__Feature2Assignment_4_5_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFeature2Assignment_4_5_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3238:1: ( rule__Precedence__Feature2Assignment_4_5_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3238:2: rule__Precedence__Feature2Assignment_4_5_0
            {
            pushFollow(FOLLOW_rule__Precedence__Feature2Assignment_4_5_0_in_rule__Precedence__Group_4_5__0__Impl6553);
            rule__Precedence__Feature2Assignment_4_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getFeature2Assignment_4_5_0()); 

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
    // $ANTLR end "rule__Precedence__Group_4_5__0__Impl"


    // $ANTLR start "rule__Precedence__Group_4_5__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3248:1: rule__Precedence__Group_4_5__1 : rule__Precedence__Group_4_5__1__Impl ;
    public final void rule__Precedence__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3252:1: ( rule__Precedence__Group_4_5__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3253:2: rule__Precedence__Group_4_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4_5__1__Impl_in_rule__Precedence__Group_4_5__16583);
            rule__Precedence__Group_4_5__1__Impl();

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
    // $ANTLR end "rule__Precedence__Group_4_5__1"


    // $ANTLR start "rule__Precedence__Group_4_5__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3259:1: rule__Precedence__Group_4_5__1__Impl : ( '=' ) ;
    public final void rule__Precedence__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3263:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3264:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3264:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3265:1: '='
            {
             before(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_5_1()); 
            match(input,35,FOLLOW_35_in_rule__Precedence__Group_4_5__1__Impl6611); 
             after(grammarAccess.getPrecedenceAccess().getEqualsSignKeyword_4_5_1()); 

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
    // $ANTLR end "rule__Precedence__Group_4_5__1__Impl"


    // $ANTLR start "rule__Precedence__Group_5__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3282:1: rule__Precedence__Group_5__0 : rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1 ;
    public final void rule__Precedence__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3286:1: ( rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3287:2: rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__0__Impl_in_rule__Precedence__Group_5__06646);
            rule__Precedence__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__1_in_rule__Precedence__Group_5__06649);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3294:1: rule__Precedence__Group_5__0__Impl : ( ( rule__Precedence__RuletypAssignment_5_0 ) ) ;
    public final void rule__Precedence__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3298:1: ( ( ( rule__Precedence__RuletypAssignment_5_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3299:1: ( ( rule__Precedence__RuletypAssignment_5_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3299:1: ( ( rule__Precedence__RuletypAssignment_5_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3300:1: ( rule__Precedence__RuletypAssignment_5_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_5_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3301:1: ( rule__Precedence__RuletypAssignment_5_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3301:2: rule__Precedence__RuletypAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_5_0_in_rule__Precedence__Group_5__0__Impl6676);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3311:1: rule__Precedence__Group_5__1 : rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2 ;
    public final void rule__Precedence__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3315:1: ( rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3316:2: rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__1__Impl_in_rule__Precedence__Group_5__16706);
            rule__Precedence__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__2_in_rule__Precedence__Group_5__16709);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3323:1: rule__Precedence__Group_5__1__Impl : ( ( rule__Precedence__RuleAssignment_5_1 ) ) ;
    public final void rule__Precedence__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3327:1: ( ( ( rule__Precedence__RuleAssignment_5_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3328:1: ( ( rule__Precedence__RuleAssignment_5_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3328:1: ( ( rule__Precedence__RuleAssignment_5_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3329:1: ( rule__Precedence__RuleAssignment_5_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_5_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3330:1: ( rule__Precedence__RuleAssignment_5_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3330:2: rule__Precedence__RuleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_5_1_in_rule__Precedence__Group_5__1__Impl6736);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3340:1: rule__Precedence__Group_5__2 : rule__Precedence__Group_5__2__Impl rule__Precedence__Group_5__3 ;
    public final void rule__Precedence__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3344:1: ( rule__Precedence__Group_5__2__Impl rule__Precedence__Group_5__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3345:2: rule__Precedence__Group_5__2__Impl rule__Precedence__Group_5__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__2__Impl_in_rule__Precedence__Group_5__26766);
            rule__Precedence__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__3_in_rule__Precedence__Group_5__26769);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3352:1: rule__Precedence__Group_5__2__Impl : ( ( rule__Precedence__Par1Assignment_5_2 ) ) ;
    public final void rule__Precedence__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3356:1: ( ( ( rule__Precedence__Par1Assignment_5_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3357:1: ( ( rule__Precedence__Par1Assignment_5_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3357:1: ( ( rule__Precedence__Par1Assignment_5_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3358:1: ( rule__Precedence__Par1Assignment_5_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_5_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3359:1: ( rule__Precedence__Par1Assignment_5_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3359:2: rule__Precedence__Par1Assignment_5_2
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_5_2_in_rule__Precedence__Group_5__2__Impl6796);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3369:1: rule__Precedence__Group_5__3 : rule__Precedence__Group_5__3__Impl rule__Precedence__Group_5__4 ;
    public final void rule__Precedence__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3373:1: ( rule__Precedence__Group_5__3__Impl rule__Precedence__Group_5__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3374:2: rule__Precedence__Group_5__3__Impl rule__Precedence__Group_5__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__3__Impl_in_rule__Precedence__Group_5__36826);
            rule__Precedence__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__4_in_rule__Precedence__Group_5__36829);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3381:1: rule__Precedence__Group_5__3__Impl : ( ( rule__Precedence__InfixleftAssignment_5_3 ) ) ;
    public final void rule__Precedence__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3385:1: ( ( ( rule__Precedence__InfixleftAssignment_5_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3386:1: ( ( rule__Precedence__InfixleftAssignment_5_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3386:1: ( ( rule__Precedence__InfixleftAssignment_5_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3387:1: ( rule__Precedence__InfixleftAssignment_5_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getInfixleftAssignment_5_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3388:1: ( rule__Precedence__InfixleftAssignment_5_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3388:2: rule__Precedence__InfixleftAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Precedence__InfixleftAssignment_5_3_in_rule__Precedence__Group_5__3__Impl6856);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3398:1: rule__Precedence__Group_5__4 : rule__Precedence__Group_5__4__Impl ;
    public final void rule__Precedence__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3402:1: ( rule__Precedence__Group_5__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3403:2: rule__Precedence__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__4__Impl_in_rule__Precedence__Group_5__46886);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3409:1: rule__Precedence__Group_5__4__Impl : ( ( rule__Precedence__Par2Assignment_5_4 ) ) ;
    public final void rule__Precedence__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3413:1: ( ( ( rule__Precedence__Par2Assignment_5_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3414:1: ( ( rule__Precedence__Par2Assignment_5_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3414:1: ( ( rule__Precedence__Par2Assignment_5_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3415:1: ( rule__Precedence__Par2Assignment_5_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar2Assignment_5_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3416:1: ( rule__Precedence__Par2Assignment_5_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3416:2: rule__Precedence__Par2Assignment_5_4
            {
            pushFollow(FOLLOW_rule__Precedence__Par2Assignment_5_4_in_rule__Precedence__Group_5__4__Impl6913);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3436:1: rule__Precedence__Group_6__0 : rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1 ;
    public final void rule__Precedence__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3440:1: ( rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3441:2: rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__0__Impl_in_rule__Precedence__Group_6__06953);
            rule__Precedence__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_6__1_in_rule__Precedence__Group_6__06956);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3448:1: rule__Precedence__Group_6__0__Impl : ( ( rule__Precedence__RuletypAssignment_6_0 ) ) ;
    public final void rule__Precedence__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3452:1: ( ( ( rule__Precedence__RuletypAssignment_6_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3453:1: ( ( rule__Precedence__RuletypAssignment_6_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3453:1: ( ( rule__Precedence__RuletypAssignment_6_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3454:1: ( rule__Precedence__RuletypAssignment_6_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_6_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3455:1: ( rule__Precedence__RuletypAssignment_6_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3455:2: rule__Precedence__RuletypAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_6_0_in_rule__Precedence__Group_6__0__Impl6983);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3465:1: rule__Precedence__Group_6__1 : rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2 ;
    public final void rule__Precedence__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3469:1: ( rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3470:2: rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__1__Impl_in_rule__Precedence__Group_6__17013);
            rule__Precedence__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_6__2_in_rule__Precedence__Group_6__17016);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3477:1: rule__Precedence__Group_6__1__Impl : ( ( rule__Precedence__RuleAssignment_6_1 ) ) ;
    public final void rule__Precedence__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3481:1: ( ( ( rule__Precedence__RuleAssignment_6_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3482:1: ( ( rule__Precedence__RuleAssignment_6_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3482:1: ( ( rule__Precedence__RuleAssignment_6_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3483:1: ( rule__Precedence__RuleAssignment_6_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_6_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3484:1: ( rule__Precedence__RuleAssignment_6_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3484:2: rule__Precedence__RuleAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_6_1_in_rule__Precedence__Group_6__1__Impl7043);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3494:1: rule__Precedence__Group_6__2 : rule__Precedence__Group_6__2__Impl ;
    public final void rule__Precedence__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3498:1: ( rule__Precedence__Group_6__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3499:2: rule__Precedence__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__2__Impl_in_rule__Precedence__Group_6__27073);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3505:1: rule__Precedence__Group_6__2__Impl : ( ( rule__Precedence__LiteralAssignment_6_2 ) ) ;
    public final void rule__Precedence__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3509:1: ( ( ( rule__Precedence__LiteralAssignment_6_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3510:1: ( ( rule__Precedence__LiteralAssignment_6_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3510:1: ( ( rule__Precedence__LiteralAssignment_6_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3511:1: ( rule__Precedence__LiteralAssignment_6_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getLiteralAssignment_6_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3512:1: ( rule__Precedence__LiteralAssignment_6_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3512:2: rule__Precedence__LiteralAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Precedence__LiteralAssignment_6_2_in_rule__Precedence__Group_6__2__Impl7100);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3528:1: rule__Precedence__Group_7__0 : rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1 ;
    public final void rule__Precedence__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3532:1: ( rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3533:2: rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__0__Impl_in_rule__Precedence__Group_7__07136);
            rule__Precedence__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_7__1_in_rule__Precedence__Group_7__07139);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3540:1: rule__Precedence__Group_7__0__Impl : ( ( rule__Precedence__RuletypAssignment_7_0 ) ) ;
    public final void rule__Precedence__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3544:1: ( ( ( rule__Precedence__RuletypAssignment_7_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3545:1: ( ( rule__Precedence__RuletypAssignment_7_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3545:1: ( ( rule__Precedence__RuletypAssignment_7_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3546:1: ( rule__Precedence__RuletypAssignment_7_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_7_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3547:1: ( rule__Precedence__RuletypAssignment_7_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3547:2: rule__Precedence__RuletypAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_7_0_in_rule__Precedence__Group_7__0__Impl7166);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3557:1: rule__Precedence__Group_7__1 : rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2 ;
    public final void rule__Precedence__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3561:1: ( rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3562:2: rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__1__Impl_in_rule__Precedence__Group_7__17196);
            rule__Precedence__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_7__2_in_rule__Precedence__Group_7__17199);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3569:1: rule__Precedence__Group_7__1__Impl : ( ( rule__Precedence__RuleAssignment_7_1 ) ) ;
    public final void rule__Precedence__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3573:1: ( ( ( rule__Precedence__RuleAssignment_7_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3574:1: ( ( rule__Precedence__RuleAssignment_7_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3574:1: ( ( rule__Precedence__RuleAssignment_7_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3575:1: ( rule__Precedence__RuleAssignment_7_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_7_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3576:1: ( rule__Precedence__RuleAssignment_7_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3576:2: rule__Precedence__RuleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_7_1_in_rule__Precedence__Group_7__1__Impl7226);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3586:1: rule__Precedence__Group_7__2 : rule__Precedence__Group_7__2__Impl ;
    public final void rule__Precedence__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3590:1: ( rule__Precedence__Group_7__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3591:2: rule__Precedence__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__2__Impl_in_rule__Precedence__Group_7__27256);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3597:1: rule__Precedence__Group_7__2__Impl : ( ( rule__Precedence__BracketAssignment_7_2 ) ) ;
    public final void rule__Precedence__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3601:1: ( ( ( rule__Precedence__BracketAssignment_7_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3602:1: ( ( rule__Precedence__BracketAssignment_7_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3602:1: ( ( rule__Precedence__BracketAssignment_7_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3603:1: ( rule__Precedence__BracketAssignment_7_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getBracketAssignment_7_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3604:1: ( rule__Precedence__BracketAssignment_7_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3604:2: rule__Precedence__BracketAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Precedence__BracketAssignment_7_2_in_rule__Precedence__Group_7__2__Impl7283);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3620:1: rule__Precedence__Group_8__0 : rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1 ;
    public final void rule__Precedence__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3624:1: ( rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3625:2: rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__0__Impl_in_rule__Precedence__Group_8__07319);
            rule__Precedence__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_8__1_in_rule__Precedence__Group_8__07322);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3632:1: rule__Precedence__Group_8__0__Impl : ( ( rule__Precedence__RuletypAssignment_8_0 ) ) ;
    public final void rule__Precedence__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3636:1: ( ( ( rule__Precedence__RuletypAssignment_8_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3637:1: ( ( rule__Precedence__RuletypAssignment_8_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3637:1: ( ( rule__Precedence__RuletypAssignment_8_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3638:1: ( rule__Precedence__RuletypAssignment_8_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_8_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3639:1: ( rule__Precedence__RuletypAssignment_8_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3639:2: rule__Precedence__RuletypAssignment_8_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_8_0_in_rule__Precedence__Group_8__0__Impl7349);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3649:1: rule__Precedence__Group_8__1 : rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2 ;
    public final void rule__Precedence__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3653:1: ( rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3654:2: rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__1__Impl_in_rule__Precedence__Group_8__17379);
            rule__Precedence__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_8__2_in_rule__Precedence__Group_8__17382);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3661:1: rule__Precedence__Group_8__1__Impl : ( ( rule__Precedence__RuleAssignment_8_1 ) ) ;
    public final void rule__Precedence__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3665:1: ( ( ( rule__Precedence__RuleAssignment_8_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3666:1: ( ( rule__Precedence__RuleAssignment_8_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3666:1: ( ( rule__Precedence__RuleAssignment_8_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3667:1: ( rule__Precedence__RuleAssignment_8_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_8_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3668:1: ( rule__Precedence__RuleAssignment_8_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3668:2: rule__Precedence__RuleAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_8_1_in_rule__Precedence__Group_8__1__Impl7409);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3678:1: rule__Precedence__Group_8__2 : rule__Precedence__Group_8__2__Impl ;
    public final void rule__Precedence__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3682:1: ( rule__Precedence__Group_8__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3683:2: rule__Precedence__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__2__Impl_in_rule__Precedence__Group_8__27439);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3689:1: rule__Precedence__Group_8__2__Impl : ( ( rule__Precedence__BracesAssignment_8_2 ) ) ;
    public final void rule__Precedence__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3693:1: ( ( ( rule__Precedence__BracesAssignment_8_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3694:1: ( ( rule__Precedence__BracesAssignment_8_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3694:1: ( ( rule__Precedence__BracesAssignment_8_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3695:1: ( rule__Precedence__BracesAssignment_8_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getBracesAssignment_8_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3696:1: ( rule__Precedence__BracesAssignment_8_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3696:2: rule__Precedence__BracesAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Precedence__BracesAssignment_8_2_in_rule__Precedence__Group_8__2__Impl7466);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3712:1: rule__Precedence__Group_9__0 : rule__Precedence__Group_9__0__Impl rule__Precedence__Group_9__1 ;
    public final void rule__Precedence__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3716:1: ( rule__Precedence__Group_9__0__Impl rule__Precedence__Group_9__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3717:2: rule__Precedence__Group_9__0__Impl rule__Precedence__Group_9__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_9__0__Impl_in_rule__Precedence__Group_9__07502);
            rule__Precedence__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_9__1_in_rule__Precedence__Group_9__07505);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3724:1: rule__Precedence__Group_9__0__Impl : ( ( rule__Precedence__RuletypAssignment_9_0 ) ) ;
    public final void rule__Precedence__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3728:1: ( ( ( rule__Precedence__RuletypAssignment_9_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3729:1: ( ( rule__Precedence__RuletypAssignment_9_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3729:1: ( ( rule__Precedence__RuletypAssignment_9_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3730:1: ( rule__Precedence__RuletypAssignment_9_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_9_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3731:1: ( rule__Precedence__RuletypAssignment_9_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3731:2: rule__Precedence__RuletypAssignment_9_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_9_0_in_rule__Precedence__Group_9__0__Impl7532);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3741:1: rule__Precedence__Group_9__1 : rule__Precedence__Group_9__1__Impl rule__Precedence__Group_9__2 ;
    public final void rule__Precedence__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3745:1: ( rule__Precedence__Group_9__1__Impl rule__Precedence__Group_9__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3746:2: rule__Precedence__Group_9__1__Impl rule__Precedence__Group_9__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_9__1__Impl_in_rule__Precedence__Group_9__17562);
            rule__Precedence__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_9__2_in_rule__Precedence__Group_9__17565);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3753:1: rule__Precedence__Group_9__1__Impl : ( ( rule__Precedence__RuleAssignment_9_1 ) ) ;
    public final void rule__Precedence__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3757:1: ( ( ( rule__Precedence__RuleAssignment_9_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3758:1: ( ( rule__Precedence__RuleAssignment_9_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3758:1: ( ( rule__Precedence__RuleAssignment_9_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3759:1: ( rule__Precedence__RuleAssignment_9_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_9_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3760:1: ( rule__Precedence__RuleAssignment_9_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3760:2: rule__Precedence__RuleAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_9_1_in_rule__Precedence__Group_9__1__Impl7592);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3770:1: rule__Precedence__Group_9__2 : rule__Precedence__Group_9__2__Impl ;
    public final void rule__Precedence__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3774:1: ( rule__Precedence__Group_9__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3775:2: rule__Precedence__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_9__2__Impl_in_rule__Precedence__Group_9__27622);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3781:1: rule__Precedence__Group_9__2__Impl : ( ( rule__Precedence__ParenthesisAssignment_9_2 ) ) ;
    public final void rule__Precedence__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3785:1: ( ( ( rule__Precedence__ParenthesisAssignment_9_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3786:1: ( ( rule__Precedence__ParenthesisAssignment_9_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3786:1: ( ( rule__Precedence__ParenthesisAssignment_9_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3787:1: ( rule__Precedence__ParenthesisAssignment_9_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getParenthesisAssignment_9_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3788:1: ( rule__Precedence__ParenthesisAssignment_9_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3788:2: rule__Precedence__ParenthesisAssignment_9_2
            {
            pushFollow(FOLLOW_rule__Precedence__ParenthesisAssignment_9_2_in_rule__Precedence__Group_9__2__Impl7649);
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


    // $ANTLR start "rule__MultID__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3804:1: rule__MultID__Group__0 : rule__MultID__Group__0__Impl rule__MultID__Group__1 ;
    public final void rule__MultID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3808:1: ( rule__MultID__Group__0__Impl rule__MultID__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3809:2: rule__MultID__Group__0__Impl rule__MultID__Group__1
            {
            pushFollow(FOLLOW_rule__MultID__Group__0__Impl_in_rule__MultID__Group__07685);
            rule__MultID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group__1_in_rule__MultID__Group__07688);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3816:1: rule__MultID__Group__0__Impl : ( () ) ;
    public final void rule__MultID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3820:1: ( ( () ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3821:1: ( () )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3821:1: ( () )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3822:1: ()
            {
             before(grammarAccess.getMultIDAccess().getMultIDAction_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3823:1: ()
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3825:1: 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3835:1: rule__MultID__Group__1 : rule__MultID__Group__1__Impl ;
    public final void rule__MultID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3839:1: ( rule__MultID__Group__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3840:2: rule__MultID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group__1__Impl_in_rule__MultID__Group__17746);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3846:1: rule__MultID__Group__1__Impl : ( ( rule__MultID__Alternatives_1 ) ) ;
    public final void rule__MultID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3850:1: ( ( ( rule__MultID__Alternatives_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3851:1: ( ( rule__MultID__Alternatives_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3851:1: ( ( rule__MultID__Alternatives_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3852:1: ( rule__MultID__Alternatives_1 )
            {
             before(grammarAccess.getMultIDAccess().getAlternatives_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3853:1: ( rule__MultID__Alternatives_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3853:2: rule__MultID__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MultID__Alternatives_1_in_rule__MultID__Group__1__Impl7773);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3867:1: rule__MultID__Group_1_1__0 : rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1 ;
    public final void rule__MultID__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3871:1: ( rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3872:2: rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__0__Impl_in_rule__MultID__Group_1_1__07807);
            rule__MultID__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1_1__1_in_rule__MultID__Group_1_1__07810);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3879:1: rule__MultID__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__MultID__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3883:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3884:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3884:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3885:1: '['
            {
             before(grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,39,FOLLOW_39_in_rule__MultID__Group_1_1__0__Impl7838); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3898:1: rule__MultID__Group_1_1__1 : rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2 ;
    public final void rule__MultID__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3902:1: ( rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3903:2: rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__1__Impl_in_rule__MultID__Group_1_1__17869);
            rule__MultID__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1_1__2_in_rule__MultID__Group_1_1__17872);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3910:1: rule__MultID__Group_1_1__1__Impl : ( ( rule__MultID__MiAssignment_1_1_1 )* ) ;
    public final void rule__MultID__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3914:1: ( ( ( rule__MultID__MiAssignment_1_1_1 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3915:1: ( ( rule__MultID__MiAssignment_1_1_1 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3915:1: ( ( rule__MultID__MiAssignment_1_1_1 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3916:1: ( rule__MultID__MiAssignment_1_1_1 )*
            {
             before(grammarAccess.getMultIDAccess().getMiAssignment_1_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3917:1: ( rule__MultID__MiAssignment_1_1_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3917:2: rule__MultID__MiAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MultID__MiAssignment_1_1_1_in_rule__MultID__Group_1_1__1__Impl7899);
            	    rule__MultID__MiAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3927:1: rule__MultID__Group_1_1__2 : rule__MultID__Group_1_1__2__Impl ;
    public final void rule__MultID__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3931:1: ( rule__MultID__Group_1_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3932:2: rule__MultID__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__2__Impl_in_rule__MultID__Group_1_1__27930);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3938:1: rule__MultID__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__MultID__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3942:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3943:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3943:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3944:1: ']'
            {
             before(grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,40,FOLLOW_40_in_rule__MultID__Group_1_1__2__Impl7958); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3963:1: rule__MultString__Group__0 : rule__MultString__Group__0__Impl rule__MultString__Group__1 ;
    public final void rule__MultString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3967:1: ( rule__MultString__Group__0__Impl rule__MultString__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3968:2: rule__MultString__Group__0__Impl rule__MultString__Group__1
            {
            pushFollow(FOLLOW_rule__MultString__Group__0__Impl_in_rule__MultString__Group__07995);
            rule__MultString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group__1_in_rule__MultString__Group__07998);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3975:1: rule__MultString__Group__0__Impl : ( () ) ;
    public final void rule__MultString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3979:1: ( ( () ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3980:1: ( () )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3980:1: ( () )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3981:1: ()
            {
             before(grammarAccess.getMultStringAccess().getMultStringAction_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3982:1: ()
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3984:1: 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3994:1: rule__MultString__Group__1 : rule__MultString__Group__1__Impl ;
    public final void rule__MultString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3998:1: ( rule__MultString__Group__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3999:2: rule__MultString__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group__1__Impl_in_rule__MultString__Group__18056);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4005:1: rule__MultString__Group__1__Impl : ( ( rule__MultString__Alternatives_1 ) ) ;
    public final void rule__MultString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4009:1: ( ( ( rule__MultString__Alternatives_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4010:1: ( ( rule__MultString__Alternatives_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4010:1: ( ( rule__MultString__Alternatives_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4011:1: ( rule__MultString__Alternatives_1 )
            {
             before(grammarAccess.getMultStringAccess().getAlternatives_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4012:1: ( rule__MultString__Alternatives_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4012:2: rule__MultString__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MultString__Alternatives_1_in_rule__MultString__Group__1__Impl8083);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4026:1: rule__MultString__Group_1_1__0 : rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1 ;
    public final void rule__MultString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4030:1: ( rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4031:2: rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__0__Impl_in_rule__MultString__Group_1_1__08117);
            rule__MultString__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1_1__1_in_rule__MultString__Group_1_1__08120);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4038:1: rule__MultString__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__MultString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4042:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4043:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4043:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4044:1: '['
            {
             before(grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,39,FOLLOW_39_in_rule__MultString__Group_1_1__0__Impl8148); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4057:1: rule__MultString__Group_1_1__1 : rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2 ;
    public final void rule__MultString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4061:1: ( rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4062:2: rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__1__Impl_in_rule__MultString__Group_1_1__18179);
            rule__MultString__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1_1__2_in_rule__MultString__Group_1_1__18182);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4069:1: rule__MultString__Group_1_1__1__Impl : ( ( rule__MultString__MsAssignment_1_1_1 )* ) ;
    public final void rule__MultString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4073:1: ( ( ( rule__MultString__MsAssignment_1_1_1 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4074:1: ( ( rule__MultString__MsAssignment_1_1_1 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4074:1: ( ( rule__MultString__MsAssignment_1_1_1 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4075:1: ( rule__MultString__MsAssignment_1_1_1 )*
            {
             before(grammarAccess.getMultStringAccess().getMsAssignment_1_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4076:1: ( rule__MultString__MsAssignment_1_1_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4076:2: rule__MultString__MsAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MultString__MsAssignment_1_1_1_in_rule__MultString__Group_1_1__1__Impl8209);
            	    rule__MultString__MsAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4086:1: rule__MultString__Group_1_1__2 : rule__MultString__Group_1_1__2__Impl ;
    public final void rule__MultString__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4090:1: ( rule__MultString__Group_1_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4091:2: rule__MultString__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__2__Impl_in_rule__MultString__Group_1_1__28240);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4097:1: rule__MultString__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__MultString__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4101:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4102:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4102:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4103:1: ']'
            {
             before(grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,40,FOLLOW_40_in_rule__MultString__Group_1_1__2__Impl8268); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4123:1: rule__Model__ClasAssignment_0 : ( ruleClassType ) ;
    public final void rule__Model__ClasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4127:1: ( ( ruleClassType ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4128:1: ( ruleClassType )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4128:1: ( ruleClassType )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4129:1: ruleClassType
            {
             before(grammarAccess.getModelAccess().getClasClassTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_08310);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4138:1: rule__Model__ProcAssignment_1 : ( ruleProcedure ) ;
    public final void rule__Model__ProcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4142:1: ( ( ruleProcedure ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4143:1: ( ruleProcedure )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4143:1: ( ruleProcedure )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4144:1: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getProcProcedureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_18341);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4153:1: rule__Model__StatemAssignment_2 : ( ruleStatement ) ;
    public final void rule__Model__StatemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4157:1: ( ( ruleStatement ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4158:1: ( ruleStatement )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4158:1: ( ruleStatement )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4159:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatemStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_28372);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4168:1: rule__Model__ExpAssignment_3 : ( ruleExpression ) ;
    public final void rule__Model__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4172:1: ( ( ruleExpression ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4173:1: ( ruleExpression )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4173:1: ( ruleExpression )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4174:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_38403);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4183:1: rule__ClassType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4187:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4188:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4188:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4189:1: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_18434); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4198:1: rule__ClassType__NoclassAssignment_2_0 : ( ( 'NOCLASS' ) ) ;
    public final void rule__ClassType__NoclassAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4202:1: ( ( ( 'NOCLASS' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4203:1: ( ( 'NOCLASS' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4203:1: ( ( 'NOCLASS' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4204:1: ( 'NOCLASS' )
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNOCLASSKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4205:1: ( 'NOCLASS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4206:1: 'NOCLASS'
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNOCLASSKeyword_2_0_0()); 
            match(input,41,FOLLOW_41_in_rule__ClassType__NoclassAssignment_2_08470); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4221:1: rule__ClassType__PrefixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__ClassType__PrefixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4225:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4226:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4226:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4227:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getPrefixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_18509);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4236:1: rule__ClassType__SuffixAssignment_2_2_1 : ( ruleMultID ) ;
    public final void rule__ClassType__SuffixAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4240:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4241:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4241:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4242:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getSuffixMultIDParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_18540);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4251:1: rule__ClassType__BlockingAssignment_2_3_1 : ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) ;
    public final void rule__ClassType__BlockingAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4255:1: ( ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4256:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4256:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4257:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAlternatives_2_3_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4258:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4258:2: rule__ClassType__BlockingAlternatives_2_3_1_0
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_18571);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4267:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4271:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4272:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4272:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4273:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_18604); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4282:1: rule__Procedure__PrefixAssignment_2_0_1 : ( ruleMultID ) ;
    public final void rule__Procedure__PrefixAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4286:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4287:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4287:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4288:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getPrefixMultIDParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_18635);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4297:1: rule__Procedure__SuffixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__Procedure__SuffixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4301:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4302:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4302:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4303:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getSuffixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_18666);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4312:1: rule__Procedure__TypesAssignment_2_2_1 : ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) ;
    public final void rule__Procedure__TypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4316:1: ( ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4317:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4317:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4318:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAlternatives_2_2_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4319:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4319:2: rule__Procedure__TypesAlternatives_2_2_1_0
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_18697);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4328:1: rule__Statement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4332:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4333:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4333:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4334:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_18730); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4343:1: rule__Statement__RepAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__Statement__RepAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4347:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4348:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4348:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4349:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getRepIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_18761); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4358:1: rule__Statement__UntilAssignment_2_0_3 : ( RULE_ID ) ;
    public final void rule__Statement__UntilAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4362:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4363:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4363:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4364:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getUntilIDTerminalRuleCall_2_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_38792); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4373:1: rule__Statement__WhileAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Statement__WhileAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4377:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4378:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4378:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4379:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getWhileIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_18823); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4388:1: rule__Statement__DoAssignment_2_1_3 : ( RULE_ID ) ;
    public final void rule__Statement__DoAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4392:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4393:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4393:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4394:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getDoIDTerminalRuleCall_2_1_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_38854); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4403:1: rule__Statement__ForAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ForAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4407:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4408:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4408:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4409:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getForIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_18885); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4418:1: rule__Statement__VarAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__Statement__VarAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4422:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4423:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4423:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4424:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVarIDTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_18916); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4433:1: rule__Statement__ExAssignment_2_3_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4437:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4438:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4438:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4439:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_18947); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4448:1: rule__Statement__ValAssignment_2_4_1 : ( RULE_ID ) ;
    public final void rule__Statement__ValAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4452:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4453:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4453:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4454:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getValIDTerminalRuleCall_2_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_18978); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4463:1: rule__Statement__ExAssignment_2_4_3 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4467:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4468:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4468:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4469:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_4_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_39009); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4478:1: rule__Expression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4482:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4483:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4483:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4484:1: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_19040); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4493:1: rule__Expression__PrecAssignment_2 : ( rulePrecedence ) ;
    public final void rule__Expression__PrecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4497:1: ( ( rulePrecedence ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4498:1: ( rulePrecedence )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4498:1: ( rulePrecedence )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4499:1: rulePrecedence
            {
             before(grammarAccess.getExpressionAccess().getPrecPrecedenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrecedence_in_rule__Expression__PrecAssignment_29071);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4508:1: rule__Precedence__RuletypAssignment_0_0 : ( ( 'CALLER' ) ) ;
    public final void rule__Precedence__RuletypAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4512:1: ( ( ( 'CALLER' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4513:1: ( ( 'CALLER' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4513:1: ( ( 'CALLER' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4514:1: ( 'CALLER' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4515:1: ( 'CALLER' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4516:1: 'CALLER'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypCALLERKeyword_0_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Precedence__RuletypAssignment_0_09107); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4531:1: rule__Precedence__RuleAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4535:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4536:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4536:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4537:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_0_19146); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4546:1: rule__Precedence__Feature1Assignment_0_2_1 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4550:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4551:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4551:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4552:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_0_2_19177); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4561:1: rule__Precedence__RuletypAssignment_1_0 : ( ( 'PREFIX' ) ) ;
    public final void rule__Precedence__RuletypAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4565:1: ( ( ( 'PREFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4566:1: ( ( 'PREFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4566:1: ( ( 'PREFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4567:1: ( 'PREFIX' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_1_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4568:1: ( 'PREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4569:1: 'PREFIX'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPREFIXKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Precedence__RuletypAssignment_1_09213); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4584:1: rule__Precedence__RuleAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4588:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4589:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4589:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4590:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_1_19252); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4599:1: rule__Precedence__PrefixAssignment_1_2 : ( ruleMultString ) ;
    public final void rule__Precedence__PrefixAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4603:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4604:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4604:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4605:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__PrefixAssignment_1_29283);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4614:1: rule__Precedence__Feature1Assignment_1_3_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4618:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4619:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4619:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4620:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_1_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_1_3_09314); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4629:1: rule__Precedence__Par1Assignment_1_4 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4633:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4634:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4634:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4635:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_1_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_1_49345); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4644:1: rule__Precedence__RuletypAssignment_2_0 : ( ( 'SUFFIX' ) ) ;
    public final void rule__Precedence__RuletypAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4648:1: ( ( ( 'SUFFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4649:1: ( ( 'SUFFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4649:1: ( ( 'SUFFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4650:1: ( 'SUFFIX' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4651:1: ( 'SUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4652:1: 'SUFFIX'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypSUFFIXKeyword_2_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Precedence__RuletypAssignment_2_09381); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4667:1: rule__Precedence__RuleAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4671:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4672:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4672:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4673:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_2_19420); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4682:1: rule__Precedence__Feature1Assignment_2_2_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4686:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4687:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4687:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4688:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_2_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_2_2_09451); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4697:1: rule__Precedence__Par1Assignment_2_3 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4701:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4702:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4702:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4703:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_2_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_2_39482); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4712:1: rule__Precedence__SuffixAssignment_2_4 : ( ruleMultString ) ;
    public final void rule__Precedence__SuffixAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4716:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4717:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4717:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4718:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__SuffixAssignment_2_49513);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4727:1: rule__Precedence__RuletypAssignment_3_0 : ( ( 'INFIX' ) ) ;
    public final void rule__Precedence__RuletypAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4731:1: ( ( ( 'INFIX' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4732:1: ( ( 'INFIX' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4732:1: ( ( 'INFIX' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4733:1: ( 'INFIX' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_3_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4734:1: ( 'INFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4735:1: 'INFIX'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXKeyword_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Precedence__RuletypAssignment_3_09549); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4750:1: rule__Precedence__RuleAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4754:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4755:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4755:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4756:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_3_19588); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4765:1: rule__Precedence__Feature1Assignment_3_2_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4769:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4770:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4770:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4771:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_3_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_3_2_09619); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4780:1: rule__Precedence__Par1Assignment_3_3 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4784:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4785:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4785:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4786:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_3_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_3_39650); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4795:1: rule__Precedence__InfixAssignment_3_4 : ( ruleMultString ) ;
    public final void rule__Precedence__InfixAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4799:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4800:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4800:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4801:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__InfixAssignment_3_49681);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4810:1: rule__Precedence__Feature2Assignment_3_5_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature2Assignment_3_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4814:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4815:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4815:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4816:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_3_5_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature2Assignment_3_5_09712); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4825:1: rule__Precedence__Par2Assignment_3_6 : ( RULE_ID ) ;
    public final void rule__Precedence__Par2Assignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4829:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4830:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4830:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4831:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_3_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_3_69743); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4840:1: rule__Precedence__RuletypAssignment_4_0 : ( ( 'INFIXADD' ) ) ;
    public final void rule__Precedence__RuletypAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4844:1: ( ( ( 'INFIXADD' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4845:1: ( ( 'INFIXADD' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4845:1: ( ( 'INFIXADD' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4846:1: ( 'INFIXADD' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXADDKeyword_4_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4847:1: ( 'INFIXADD' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4848:1: 'INFIXADD'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXADDKeyword_4_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Precedence__RuletypAssignment_4_09779); 
             after(grammarAccess.getPrecedenceAccess().getRuletypINFIXADDKeyword_4_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypINFIXADDKeyword_4_0_0()); 

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4863:1: rule__Precedence__RuleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4867:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4868:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4868:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4869:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_4_19818); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4878:1: rule__Precedence__Feature1Assignment_4_2_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature1Assignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4882:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4883:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4883:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4884:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature1IDTerminalRuleCall_4_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_4_2_09849); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4893:1: rule__Precedence__Par1Assignment_4_3 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4897:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4898:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4898:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4899:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_4_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_4_39880); 
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


    // $ANTLR start "rule__Precedence__InfixAssignment_4_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4908:1: rule__Precedence__InfixAssignment_4_4 : ( ruleMultString ) ;
    public final void rule__Precedence__InfixAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4912:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4913:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4913:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4914:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__InfixAssignment_4_49911);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_4_4_0()); 

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
    // $ANTLR end "rule__Precedence__InfixAssignment_4_4"


    // $ANTLR start "rule__Precedence__Feature2Assignment_4_5_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4923:1: rule__Precedence__Feature2Assignment_4_5_0 : ( RULE_ID ) ;
    public final void rule__Precedence__Feature2Assignment_4_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4927:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4928:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4928:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4929:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_4_5_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Feature2Assignment_4_5_09942); 
             after(grammarAccess.getPrecedenceAccess().getFeature2IDTerminalRuleCall_4_5_0_0()); 

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
    // $ANTLR end "rule__Precedence__Feature2Assignment_4_5_0"


    // $ANTLR start "rule__Precedence__Par2Assignment_4_6"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4938:1: rule__Precedence__Par2Assignment_4_6 : ( RULE_ID ) ;
    public final void rule__Precedence__Par2Assignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4942:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4943:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4943:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4944:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_4_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_4_69973); 
             after(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_4_6_0()); 

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
    // $ANTLR end "rule__Precedence__Par2Assignment_4_6"


    // $ANTLR start "rule__Precedence__RuletypAssignment_5_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4953:1: rule__Precedence__RuletypAssignment_5_0 : ( ( 'INFIXLEFT' ) ) ;
    public final void rule__Precedence__RuletypAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4957:1: ( ( ( 'INFIXLEFT' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4958:1: ( ( 'INFIXLEFT' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4958:1: ( ( 'INFIXLEFT' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4959:1: ( 'INFIXLEFT' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_5_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4960:1: ( 'INFIXLEFT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4961:1: 'INFIXLEFT'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypINFIXLEFTKeyword_5_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Precedence__RuletypAssignment_5_010009); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4976:1: rule__Precedence__RuleAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4980:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4981:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4981:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4982:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_5_110048); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4991:1: rule__Precedence__Par1Assignment_5_2 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4995:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4996:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4996:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4997:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_5_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_5_210079); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5006:1: rule__Precedence__InfixleftAssignment_5_3 : ( ruleMultString ) ;
    public final void rule__Precedence__InfixleftAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5010:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5011:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5011:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5012:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getInfixleftMultStringParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__InfixleftAssignment_5_310110);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5021:1: rule__Precedence__Par2Assignment_5_4 : ( RULE_ID ) ;
    public final void rule__Precedence__Par2Assignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5025:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5026:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5026:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5027:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_5_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_5_410141); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5036:1: rule__Precedence__RuletypAssignment_6_0 : ( ( 'LITERAL' ) ) ;
    public final void rule__Precedence__RuletypAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5040:1: ( ( ( 'LITERAL' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5041:1: ( ( 'LITERAL' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5041:1: ( ( 'LITERAL' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5042:1: ( 'LITERAL' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypLITERALKeyword_6_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5043:1: ( 'LITERAL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5044:1: 'LITERAL'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypLITERALKeyword_6_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Precedence__RuletypAssignment_6_010177); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5059:1: rule__Precedence__RuleAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5063:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5064:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5064:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5065:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_6_110216); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5074:1: rule__Precedence__LiteralAssignment_6_2 : ( ( rule__Precedence__LiteralAlternatives_6_2_0 ) ) ;
    public final void rule__Precedence__LiteralAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5078:1: ( ( ( rule__Precedence__LiteralAlternatives_6_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5079:1: ( ( rule__Precedence__LiteralAlternatives_6_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5079:1: ( ( rule__Precedence__LiteralAlternatives_6_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5080:1: ( rule__Precedence__LiteralAlternatives_6_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getLiteralAlternatives_6_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5081:1: ( rule__Precedence__LiteralAlternatives_6_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5081:2: rule__Precedence__LiteralAlternatives_6_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__LiteralAlternatives_6_2_0_in_rule__Precedence__LiteralAssignment_6_210247);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5090:1: rule__Precedence__RuletypAssignment_7_0 : ( ( 'BRACKET' ) ) ;
    public final void rule__Precedence__RuletypAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5094:1: ( ( ( 'BRACKET' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5095:1: ( ( 'BRACKET' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5095:1: ( ( 'BRACKET' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5096:1: ( 'BRACKET' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_7_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5097:1: ( 'BRACKET' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5098:1: 'BRACKET'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBRACKETKeyword_7_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Precedence__RuletypAssignment_7_010285); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5113:1: rule__Precedence__RuleAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5117:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5118:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5118:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5119:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_7_110324); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5128:1: rule__Precedence__BracketAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__Precedence__BracketAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5132:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5133:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5133:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5134:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_7_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__BracketAssignment_7_210355); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5143:1: rule__Precedence__RuletypAssignment_8_0 : ( ( 'BRACES' ) ) ;
    public final void rule__Precedence__RuletypAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5147:1: ( ( ( 'BRACES' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5148:1: ( ( 'BRACES' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5148:1: ( ( 'BRACES' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5149:1: ( 'BRACES' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_8_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5150:1: ( 'BRACES' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5151:1: 'BRACES'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBRACESKeyword_8_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Precedence__RuletypAssignment_8_010391); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5166:1: rule__Precedence__RuleAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5170:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5171:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5171:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5172:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_8_110430); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5181:1: rule__Precedence__BracesAssignment_8_2 : ( RULE_ID ) ;
    public final void rule__Precedence__BracesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5185:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5186:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5186:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5187:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_8_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__BracesAssignment_8_210461); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5196:1: rule__Precedence__RuletypAssignment_9_0 : ( ( 'PARENTHESIS' ) ) ;
    public final void rule__Precedence__RuletypAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5200:1: ( ( ( 'PARENTHESIS' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5201:1: ( ( 'PARENTHESIS' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5201:1: ( ( 'PARENTHESIS' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5202:1: ( 'PARENTHESIS' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_9_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5203:1: ( 'PARENTHESIS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5204:1: 'PARENTHESIS'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPARENTHESISKeyword_9_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Precedence__RuletypAssignment_9_010497); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5219:1: rule__Precedence__RuleAssignment_9_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5223:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5224:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5224:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5225:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_9_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_9_110536); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5234:1: rule__Precedence__ParenthesisAssignment_9_2 : ( RULE_ID ) ;
    public final void rule__Precedence__ParenthesisAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5238:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5239:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5239:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5240:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_9_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__ParenthesisAssignment_9_210567); 
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


    // $ANTLR start "rule__MultID__MiAssignment_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5249:1: rule__MultID__MiAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__MultID__MiAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5253:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5254:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5254:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5255:1: RULE_ID
            {
             before(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_010598); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5264:1: rule__MultID__MiAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__MultID__MiAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5268:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5269:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5269:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5270:1: RULE_ID
            {
             before(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_1_110629); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5279:1: rule__MultString__MsAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__MultString__MsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5283:1: ( ( RULE_STRING ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5284:1: ( RULE_STRING )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5284:1: ( RULE_STRING )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5285:1: RULE_STRING
            {
             before(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_010660); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5294:1: rule__MultString__MsAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__MultString__MsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5298:1: ( ( RULE_STRING ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5299:1: ( RULE_STRING )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5299:1: ( RULE_STRING )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:5300:1: RULE_STRING
            {
             before(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_1_110691); 
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
    public static final BitSet FOLLOW_ruleMultID_in_entryRuleMultID422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultID429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__0_in_ruleMultID455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__0_in_ruleMultString515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ClasAssignment_0_in_rule__Model__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProcAssignment_1_in_rule__Model__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatemAssignment_2_in_rule__Model__Alternatives587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ExpAssignment_3_in_rule__Model__Alternatives605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__NoclassAssignment_2_0_in_rule__ClassType__Alternatives_2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__0_in_rule__ClassType__Alternatives_2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__0_in_rule__ClassType__Alternatives_2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__0_in_rule__ClassType__Alternatives_2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ClassType__BlockingAlternatives_2_3_1_0726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ClassType__BlockingAlternatives_2_3_1_0746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__0_in_rule__Procedure__Alternatives_2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__0_in_rule__Procedure__Alternatives_2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__0_in_rule__Procedure__Alternatives_2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Procedure__TypesAlternatives_2_2_1_0850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Procedure__TypesAlternatives_2_2_1_0870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Procedure__TypesAlternatives_2_2_1_0890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Procedure__TypesAlternatives_2_2_1_0910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Procedure__TypesAlternatives_2_2_1_0930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__0_in_rule__Statement__Alternatives_2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__0_in_rule__Statement__Alternatives_2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__0_in_rule__Statement__Alternatives_21000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__0_in_rule__Statement__Alternatives_21018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__0_in_rule__Statement__Alternatives_21036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__0_in_rule__Precedence__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__0_in_rule__Precedence__Alternatives1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__0_in_rule__Precedence__Alternatives1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__0_in_rule__Precedence__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__0_in_rule__Precedence__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__0_in_rule__Precedence__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__0_in_rule__Precedence__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__0_in_rule__Precedence__Alternatives1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__0_in_rule__Precedence__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__0_in_rule__Precedence__Alternatives1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Precedence__LiteralAlternatives_6_2_01265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Precedence__LiteralAlternatives_6_2_01285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Precedence__LiteralAlternatives_6_2_01305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Precedence__LiteralAlternatives_6_2_01325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__MiAssignment_1_0_in_rule__MultID__Alternatives_11359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__0_in_rule__MultID__Alternatives_11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__MsAssignment_1_0_in_rule__MultString__Alternatives_11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__0_in_rule__MultString__Alternatives_11428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassType__Group__0__Impl1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11521 = new BitSet(new long[]{0x0000020003800000L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1608 = new BitSet(new long[]{0x0000020003800002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01645 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__01768 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__01771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__01891 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__01894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__11953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__02014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__02017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Procedure__Group__0__Impl2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12076 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2163 = new BitSet(new long[]{0x0000000009800002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02200 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02323 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02446 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Statement__Group__0__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12631 = new BitSet(new long[]{0x00000016A0000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__12816 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__12819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__22876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__22879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__32938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__03003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__03006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13065 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13437 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13746 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__23806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__23809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__33868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Expression__Group__0__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13995 = new BitSet(new long[]{0x0001FC0001800800L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4082 = new BitSet(new long[]{0x0001FC0001800802L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__0__Impl_in_rule__Precedence__Group_0__04119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__1_in_rule__Precedence__Group_0__04122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_0_0_in_rule__Precedence__Group_0__0__Impl4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__1__Impl_in_rule__Precedence__Group_0__14179 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__2_in_rule__Precedence__Group_0__14182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_0_1_in_rule__Precedence__Group_0__1__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__2__Impl_in_rule__Precedence__Group_0__24239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0_2__0_in_rule__Precedence__Group_0__2__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0_2__0__Impl_in_rule__Precedence__Group_0_2__04303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0_2__1_in_rule__Precedence__Group_0_2__04306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Precedence__Group_0_2__0__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0_2__1__Impl_in_rule__Precedence__Group_0_2__14365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_0_2_1_in_rule__Precedence__Group_0_2__1__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__0__Impl_in_rule__Precedence__Group_1__04426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__1_in_rule__Precedence__Group_1__04429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_1_0_in_rule__Precedence__Group_1__0__Impl4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__1__Impl_in_rule__Precedence__Group_1__14486 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__2_in_rule__Precedence__Group_1__14489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_1_1_in_rule__Precedence__Group_1__1__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__2__Impl_in_rule__Precedence__Group_1__24546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__3_in_rule__Precedence__Group_1__24549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__PrefixAssignment_1_2_in_rule__Precedence__Group_1__2__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__3__Impl_in_rule__Precedence__Group_1__34606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__4_in_rule__Precedence__Group_1__34609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1_3__0_in_rule__Precedence__Group_1__3__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__4__Impl_in_rule__Precedence__Group_1__44667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_1_4_in_rule__Precedence__Group_1__4__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1_3__0__Impl_in_rule__Precedence__Group_1_3__04734 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1_3__1_in_rule__Precedence__Group_1_3__04737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_1_3_0_in_rule__Precedence__Group_1_3__0__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1_3__1__Impl_in_rule__Precedence__Group_1_3__14794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_1_3__1__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__0__Impl_in_rule__Precedence__Group_2__04857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__1_in_rule__Precedence__Group_2__04860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_2_0_in_rule__Precedence__Group_2__0__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__1__Impl_in_rule__Precedence__Group_2__14917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__2_in_rule__Precedence__Group_2__14920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_2_1_in_rule__Precedence__Group_2__1__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__2__Impl_in_rule__Precedence__Group_2__24977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__3_in_rule__Precedence__Group_2__24980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2_2__0_in_rule__Precedence__Group_2__2__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__3__Impl_in_rule__Precedence__Group_2__35038 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__4_in_rule__Precedence__Group_2__35041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_2_3_in_rule__Precedence__Group_2__3__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__4__Impl_in_rule__Precedence__Group_2__45098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__SuffixAssignment_2_4_in_rule__Precedence__Group_2__4__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2_2__0__Impl_in_rule__Precedence__Group_2_2__05165 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2_2__1_in_rule__Precedence__Group_2_2__05168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_2_2_0_in_rule__Precedence__Group_2_2__0__Impl5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2_2__1__Impl_in_rule__Precedence__Group_2_2__15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_2_2__1__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__0__Impl_in_rule__Precedence__Group_3__05288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__1_in_rule__Precedence__Group_3__05291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_3_0_in_rule__Precedence__Group_3__0__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__1__Impl_in_rule__Precedence__Group_3__15348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__2_in_rule__Precedence__Group_3__15351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_3_1_in_rule__Precedence__Group_3__1__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__2__Impl_in_rule__Precedence__Group_3__25408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__3_in_rule__Precedence__Group_3__25411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_2__0_in_rule__Precedence__Group_3__2__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__3__Impl_in_rule__Precedence__Group_3__35469 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__4_in_rule__Precedence__Group_3__35472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_3_3_in_rule__Precedence__Group_3__3__Impl5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__4__Impl_in_rule__Precedence__Group_3__45529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__5_in_rule__Precedence__Group_3__45532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InfixAssignment_3_4_in_rule__Precedence__Group_3__4__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__5__Impl_in_rule__Precedence__Group_3__55589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__6_in_rule__Precedence__Group_3__55592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_5__0_in_rule__Precedence__Group_3__5__Impl5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__6__Impl_in_rule__Precedence__Group_3__65650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par2Assignment_3_6_in_rule__Precedence__Group_3__6__Impl5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_2__0__Impl_in_rule__Precedence__Group_3_2__05721 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_2__1_in_rule__Precedence__Group_3_2__05724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_3_2_0_in_rule__Precedence__Group_3_2__0__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_2__1__Impl_in_rule__Precedence__Group_3_2__15781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_3_2__1__Impl5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_5__0__Impl_in_rule__Precedence__Group_3_5__05844 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_5__1_in_rule__Precedence__Group_3_5__05847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature2Assignment_3_5_0_in_rule__Precedence__Group_3_5__0__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3_5__1__Impl_in_rule__Precedence__Group_3_5__15904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_3_5__1__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__0__Impl_in_rule__Precedence__Group_4__05967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__1_in_rule__Precedence__Group_4__05970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_4_0_in_rule__Precedence__Group_4__0__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__1__Impl_in_rule__Precedence__Group_4__16027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__2_in_rule__Precedence__Group_4__16030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_4_1_in_rule__Precedence__Group_4__1__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__2__Impl_in_rule__Precedence__Group_4__26087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__3_in_rule__Precedence__Group_4__26090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_2__0_in_rule__Precedence__Group_4__2__Impl6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__3__Impl_in_rule__Precedence__Group_4__36148 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__4_in_rule__Precedence__Group_4__36151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_4_3_in_rule__Precedence__Group_4__3__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__4__Impl_in_rule__Precedence__Group_4__46208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__5_in_rule__Precedence__Group_4__46211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InfixAssignment_4_4_in_rule__Precedence__Group_4__4__Impl6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__5__Impl_in_rule__Precedence__Group_4__56268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__6_in_rule__Precedence__Group_4__56271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_5__0_in_rule__Precedence__Group_4__5__Impl6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__6__Impl_in_rule__Precedence__Group_4__66329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par2Assignment_4_6_in_rule__Precedence__Group_4__6__Impl6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_2__0__Impl_in_rule__Precedence__Group_4_2__06400 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_2__1_in_rule__Precedence__Group_4_2__06403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature1Assignment_4_2_0_in_rule__Precedence__Group_4_2__0__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_2__1__Impl_in_rule__Precedence__Group_4_2__16460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_4_2__1__Impl6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_5__0__Impl_in_rule__Precedence__Group_4_5__06523 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_5__1_in_rule__Precedence__Group_4_5__06526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Feature2Assignment_4_5_0_in_rule__Precedence__Group_4_5__0__Impl6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4_5__1__Impl_in_rule__Precedence__Group_4_5__16583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Precedence__Group_4_5__1__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__0__Impl_in_rule__Precedence__Group_5__06646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__1_in_rule__Precedence__Group_5__06649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_5_0_in_rule__Precedence__Group_5__0__Impl6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__1__Impl_in_rule__Precedence__Group_5__16706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__2_in_rule__Precedence__Group_5__16709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_5_1_in_rule__Precedence__Group_5__1__Impl6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__2__Impl_in_rule__Precedence__Group_5__26766 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__3_in_rule__Precedence__Group_5__26769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_5_2_in_rule__Precedence__Group_5__2__Impl6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__3__Impl_in_rule__Precedence__Group_5__36826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__4_in_rule__Precedence__Group_5__36829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InfixleftAssignment_5_3_in_rule__Precedence__Group_5__3__Impl6856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__4__Impl_in_rule__Precedence__Group_5__46886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par2Assignment_5_4_in_rule__Precedence__Group_5__4__Impl6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__0__Impl_in_rule__Precedence__Group_6__06953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__1_in_rule__Precedence__Group_6__06956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_6_0_in_rule__Precedence__Group_6__0__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__1__Impl_in_rule__Precedence__Group_6__17013 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__2_in_rule__Precedence__Group_6__17016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_6_1_in_rule__Precedence__Group_6__1__Impl7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__2__Impl_in_rule__Precedence__Group_6__27073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__LiteralAssignment_6_2_in_rule__Precedence__Group_6__2__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__0__Impl_in_rule__Precedence__Group_7__07136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__1_in_rule__Precedence__Group_7__07139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_7_0_in_rule__Precedence__Group_7__0__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__1__Impl_in_rule__Precedence__Group_7__17196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__2_in_rule__Precedence__Group_7__17199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_7_1_in_rule__Precedence__Group_7__1__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__2__Impl_in_rule__Precedence__Group_7__27256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__BracketAssignment_7_2_in_rule__Precedence__Group_7__2__Impl7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__0__Impl_in_rule__Precedence__Group_8__07319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__1_in_rule__Precedence__Group_8__07322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_8_0_in_rule__Precedence__Group_8__0__Impl7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__1__Impl_in_rule__Precedence__Group_8__17379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__2_in_rule__Precedence__Group_8__17382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_8_1_in_rule__Precedence__Group_8__1__Impl7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__2__Impl_in_rule__Precedence__Group_8__27439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__BracesAssignment_8_2_in_rule__Precedence__Group_8__2__Impl7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__0__Impl_in_rule__Precedence__Group_9__07502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__1_in_rule__Precedence__Group_9__07505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_9_0_in_rule__Precedence__Group_9__0__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__1__Impl_in_rule__Precedence__Group_9__17562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__2_in_rule__Precedence__Group_9__17565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_9_1_in_rule__Precedence__Group_9__1__Impl7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_9__2__Impl_in_rule__Precedence__Group_9__27622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__ParenthesisAssignment_9_2_in_rule__Precedence__Group_9__2__Impl7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__0__Impl_in_rule__MultID__Group__07685 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group__1_in_rule__MultID__Group__07688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__1__Impl_in_rule__MultID__Group__17746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Alternatives_1_in_rule__MultID__Group__1__Impl7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__0__Impl_in_rule__MultID__Group_1_1__07807 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__1_in_rule__MultID__Group_1_1__07810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MultID__Group_1_1__0__Impl7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__1__Impl_in_rule__MultID__Group_1_1__17869 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__2_in_rule__MultID__Group_1_1__17872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__MiAssignment_1_1_1_in_rule__MultID__Group_1_1__1__Impl7899 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__2__Impl_in_rule__MultID__Group_1_1__27930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MultID__Group_1_1__2__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__0__Impl_in_rule__MultString__Group__07995 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group__1_in_rule__MultString__Group__07998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__1__Impl_in_rule__MultString__Group__18056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Alternatives_1_in_rule__MultString__Group__1__Impl8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__0__Impl_in_rule__MultString__Group_1_1__08117 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__1_in_rule__MultString__Group_1_1__08120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MultString__Group_1_1__0__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__1__Impl_in_rule__MultString__Group_1_1__18179 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__2_in_rule__MultString__Group_1_1__18182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__MsAssignment_1_1_1_in_rule__MultString__Group_1_1__1__Impl8209 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__2__Impl_in_rule__MultString__Group_1_1__28240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MultString__Group_1_1__2__Impl8268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_08310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_18341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_28372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_38403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_18434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ClassType__NoclassAssignment_2_08470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_18509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_18540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_18571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_18604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_18635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_18666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_18697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_18730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_18761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_38792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_18823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_38854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_18885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_18916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_18947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_18978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_39009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_19040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_rule__Expression__PrecAssignment_29071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Precedence__RuletypAssignment_0_09107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_0_19146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_0_2_19177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Precedence__RuletypAssignment_1_09213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_1_19252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__PrefixAssignment_1_29283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_1_3_09314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_1_49345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Precedence__RuletypAssignment_2_09381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_2_19420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_2_2_09451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_2_39482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__SuffixAssignment_2_49513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Precedence__RuletypAssignment_3_09549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_3_19588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_3_2_09619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_3_39650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__InfixAssignment_3_49681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature2Assignment_3_5_09712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_3_69743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Precedence__RuletypAssignment_4_09779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_4_19818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature1Assignment_4_2_09849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_4_39880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__InfixAssignment_4_49911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Feature2Assignment_4_5_09942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_4_69973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Precedence__RuletypAssignment_5_010009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_5_110048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_5_210079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__InfixleftAssignment_5_310110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_5_410141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Precedence__RuletypAssignment_6_010177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_6_110216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__LiteralAlternatives_6_2_0_in_rule__Precedence__LiteralAssignment_6_210247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Precedence__RuletypAssignment_7_010285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_7_110324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__BracketAssignment_7_210355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Precedence__RuletypAssignment_8_010391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_8_110430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__BracesAssignment_8_210461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Precedence__RuletypAssignment_9_010497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_9_110536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__ParenthesisAssignment_9_210567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_010598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_1_110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_010660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_1_110691 = new BitSet(new long[]{0x0000000000000002L});

}