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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'braces'", "'indent'", "'colonSeperated'", "'spaceSeperated'", "'inHeader'", "'inferred'", "'untyped'", "'int'", "'string'", "'bool'", "'float'", "'class'", "'prefix'", "'suffix'", "'blocking'", "'procedure'", "'types'", "'statement'", "'repeat'", "'until'", "'while'", "'do'", "'for'", "'var'", "'='", "'val'", "'expression'", "'['", "']'", "'noclass'", "'caller'", "'infix'", "'infixleft'", "'literal'", "'bracket'", "'parenthesis'"
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
    public static final int T__46=46;
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
            case 40:
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:352:1: rule__ClassType__BlockingAlternatives_2_3_1_0 : ( ( 'braces' ) | ( 'indent' ) );
    public final void rule__ClassType__BlockingAlternatives_2_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:356:1: ( ( 'braces' ) | ( 'indent' ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:357:1: ( 'braces' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:357:1: ( 'braces' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:358:1: 'braces'
                    {
                     before(grammarAccess.getClassTypeAccess().getBlockingBracesKeyword_2_3_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__ClassType__BlockingAlternatives_2_3_1_0726); 
                     after(grammarAccess.getClassTypeAccess().getBlockingBracesKeyword_2_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:365:6: ( 'indent' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:365:6: ( 'indent' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:366:1: 'indent'
                    {
                     before(grammarAccess.getClassTypeAccess().getBlockingIndentKeyword_2_3_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__ClassType__BlockingAlternatives_2_3_1_0746); 
                     after(grammarAccess.getClassTypeAccess().getBlockingIndentKeyword_2_3_1_0_1()); 

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:406:1: rule__Procedure__TypesAlternatives_2_2_1_0 : ( ( 'colonSeperated' ) | ( 'spaceSeperated' ) | ( 'inHeader' ) | ( 'inferred' ) | ( 'untyped' ) );
    public final void rule__Procedure__TypesAlternatives_2_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:410:1: ( ( 'colonSeperated' ) | ( 'spaceSeperated' ) | ( 'inHeader' ) | ( 'inferred' ) | ( 'untyped' ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:411:1: ( 'colonSeperated' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:411:1: ( 'colonSeperated' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:412:1: 'colonSeperated'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesColonSeperatedKeyword_2_2_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Procedure__TypesAlternatives_2_2_1_0850); 
                     after(grammarAccess.getProcedureAccess().getTypesColonSeperatedKeyword_2_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:419:6: ( 'spaceSeperated' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:419:6: ( 'spaceSeperated' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:420:1: 'spaceSeperated'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesSpaceSeperatedKeyword_2_2_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Procedure__TypesAlternatives_2_2_1_0870); 
                     after(grammarAccess.getProcedureAccess().getTypesSpaceSeperatedKeyword_2_2_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:427:6: ( 'inHeader' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:427:6: ( 'inHeader' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:428:1: 'inHeader'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesInHeaderKeyword_2_2_1_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__Procedure__TypesAlternatives_2_2_1_0890); 
                     after(grammarAccess.getProcedureAccess().getTypesInHeaderKeyword_2_2_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:435:6: ( 'inferred' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:435:6: ( 'inferred' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:436:1: 'inferred'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesInferredKeyword_2_2_1_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__Procedure__TypesAlternatives_2_2_1_0910); 
                     after(grammarAccess.getProcedureAccess().getTypesInferredKeyword_2_2_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:443:6: ( 'untyped' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:443:6: ( 'untyped' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:444:1: 'untyped'
                    {
                     before(grammarAccess.getProcedureAccess().getTypesUntypedKeyword_2_2_1_0_4()); 
                    match(input,17,FOLLOW_17_in_rule__Procedure__TypesAlternatives_2_2_1_0930); 
                     after(grammarAccess.getProcedureAccess().getTypesUntypedKeyword_2_2_1_0_4()); 

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:496:1: rule__Precedence__Alternatives : ( ( ( rule__Precedence__Group_0__0 ) ) | ( ( rule__Precedence__Group_1__0 ) ) | ( ( rule__Precedence__Group_2__0 ) ) | ( ( rule__Precedence__Group_3__0 ) ) | ( ( rule__Precedence__Group_4__0 ) ) | ( ( rule__Precedence__Group_5__0 ) ) | ( ( rule__Precedence__Group_6__0 ) ) | ( ( rule__Precedence__Group_7__0 ) ) | ( ( rule__Precedence__Group_8__0 ) ) );
    public final void rule__Precedence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:500:1: ( ( ( rule__Precedence__Group_0__0 ) ) | ( ( rule__Precedence__Group_1__0 ) ) | ( ( rule__Precedence__Group_2__0 ) ) | ( ( rule__Precedence__Group_3__0 ) ) | ( ( rule__Precedence__Group_4__0 ) ) | ( ( rule__Precedence__Group_5__0 ) ) | ( ( rule__Precedence__Group_6__0 ) ) | ( ( rule__Precedence__Group_7__0 ) ) | ( ( rule__Precedence__Group_8__0 ) ) )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 41:
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
            case 42:
                {
                alt8=4;
                }
                break;
            case 43:
                {
                alt8=5;
                }
                break;
            case 44:
                {
                alt8=6;
                }
                break;
            case 45:
                {
                alt8=7;
                }
                break;
            case 11:
                {
                alt8=8;
                }
                break;
            case 46:
                {
                alt8=9;
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

            }
        }
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


    // $ANTLR start "rule__Precedence__LiteralAlternatives_5_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:560:1: rule__Precedence__LiteralAlternatives_5_2_0 : ( ( 'int' ) | ( 'string' ) | ( 'bool' ) | ( 'float' ) );
    public final void rule__Precedence__LiteralAlternatives_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:564:1: ( ( 'int' ) | ( 'string' ) | ( 'bool' ) | ( 'float' ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:565:1: ( 'int' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:565:1: ( 'int' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:566:1: 'int'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralIntKeyword_5_2_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Precedence__LiteralAlternatives_5_2_01247); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralIntKeyword_5_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:573:6: ( 'string' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:573:6: ( 'string' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:574:1: 'string'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralStringKeyword_5_2_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Precedence__LiteralAlternatives_5_2_01267); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralStringKeyword_5_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:581:6: ( 'bool' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:581:6: ( 'bool' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:582:1: 'bool'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralBoolKeyword_5_2_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__Precedence__LiteralAlternatives_5_2_01287); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralBoolKeyword_5_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:589:6: ( 'float' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:589:6: ( 'float' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:590:1: 'float'
                    {
                     before(grammarAccess.getPrecedenceAccess().getLiteralFloatKeyword_5_2_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__Precedence__LiteralAlternatives_5_2_01307); 
                     after(grammarAccess.getPrecedenceAccess().getLiteralFloatKeyword_5_2_0_3()); 

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
    // $ANTLR end "rule__Precedence__LiteralAlternatives_5_2_0"


    // $ANTLR start "rule__MultID__Alternatives_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:602:1: rule__MultID__Alternatives_1 : ( ( ( rule__MultID__MiAssignment_1_0 ) ) | ( ( rule__MultID__Group_1_1__0 ) ) );
    public final void rule__MultID__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:606:1: ( ( ( rule__MultID__MiAssignment_1_0 ) ) | ( ( rule__MultID__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==38) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:607:1: ( ( rule__MultID__MiAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:607:1: ( ( rule__MultID__MiAssignment_1_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:608:1: ( rule__MultID__MiAssignment_1_0 )
                    {
                     before(grammarAccess.getMultIDAccess().getMiAssignment_1_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:609:1: ( rule__MultID__MiAssignment_1_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:609:2: rule__MultID__MiAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MultID__MiAssignment_1_0_in_rule__MultID__Alternatives_11341);
                    rule__MultID__MiAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultIDAccess().getMiAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:613:6: ( ( rule__MultID__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:613:6: ( ( rule__MultID__Group_1_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:614:1: ( rule__MultID__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultIDAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:615:1: ( rule__MultID__Group_1_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:615:2: rule__MultID__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultID__Group_1_1__0_in_rule__MultID__Alternatives_11359);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:624:1: rule__MultString__Alternatives_1 : ( ( ( rule__MultString__MsAssignment_1_0 ) ) | ( ( rule__MultString__Group_1_1__0 ) ) );
    public final void rule__MultString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:628:1: ( ( ( rule__MultString__MsAssignment_1_0 ) ) | ( ( rule__MultString__Group_1_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:629:1: ( ( rule__MultString__MsAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:629:1: ( ( rule__MultString__MsAssignment_1_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:630:1: ( rule__MultString__MsAssignment_1_0 )
                    {
                     before(grammarAccess.getMultStringAccess().getMsAssignment_1_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:631:1: ( rule__MultString__MsAssignment_1_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:631:2: rule__MultString__MsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MultString__MsAssignment_1_0_in_rule__MultString__Alternatives_11392);
                    rule__MultString__MsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultStringAccess().getMsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:635:6: ( ( rule__MultString__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:635:6: ( ( rule__MultString__Group_1_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:636:1: ( rule__MultString__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultStringAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:637:1: ( rule__MultString__Group_1_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:637:2: rule__MultString__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultString__Group_1_1__0_in_rule__MultString__Alternatives_11410);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:648:1: rule__ClassType__Group__0 : rule__ClassType__Group__0__Impl rule__ClassType__Group__1 ;
    public final void rule__ClassType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:652:1: ( rule__ClassType__Group__0__Impl rule__ClassType__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:653:2: rule__ClassType__Group__0__Impl rule__ClassType__Group__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01441);
            rule__ClassType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01444);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:660:1: rule__ClassType__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:664:1: ( ( 'class' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:665:1: ( 'class' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:665:1: ( 'class' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:666:1: 'class'
            {
             before(grammarAccess.getClassTypeAccess().getClassKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ClassType__Group__0__Impl1472); 
             after(grammarAccess.getClassTypeAccess().getClassKeyword_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:679:1: rule__ClassType__Group__1 : rule__ClassType__Group__1__Impl rule__ClassType__Group__2 ;
    public final void rule__ClassType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:683:1: ( rule__ClassType__Group__1__Impl rule__ClassType__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:684:2: rule__ClassType__Group__1__Impl rule__ClassType__Group__2
            {
            pushFollow(FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11503);
            rule__ClassType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11506);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:691:1: rule__ClassType__Group__1__Impl : ( ( rule__ClassType__NameAssignment_1 ) ) ;
    public final void rule__ClassType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:695:1: ( ( ( rule__ClassType__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:696:1: ( ( rule__ClassType__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:696:1: ( ( rule__ClassType__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:697:1: ( rule__ClassType__NameAssignment_1 )
            {
             before(grammarAccess.getClassTypeAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:698:1: ( rule__ClassType__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:698:2: rule__ClassType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1533);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:708:1: rule__ClassType__Group__2 : rule__ClassType__Group__2__Impl ;
    public final void rule__ClassType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:712:1: ( rule__ClassType__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:713:2: rule__ClassType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21563);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:719:1: rule__ClassType__Group__2__Impl : ( ( rule__ClassType__Alternatives_2 )* ) ;
    public final void rule__ClassType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:723:1: ( ( ( rule__ClassType__Alternatives_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:724:1: ( ( rule__ClassType__Alternatives_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:724:1: ( ( rule__ClassType__Alternatives_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:725:1: ( rule__ClassType__Alternatives_2 )*
            {
             before(grammarAccess.getClassTypeAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:726:1: ( rule__ClassType__Alternatives_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=23 && LA12_0<=25)||LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:726:2: rule__ClassType__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1590);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:742:1: rule__ClassType__Group_2_1__0 : rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1 ;
    public final void rule__ClassType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:746:1: ( rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:747:2: rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01627);
            rule__ClassType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01630);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:754:1: rule__ClassType__Group_2_1__0__Impl : ( 'prefix' ) ;
    public final void rule__ClassType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:758:1: ( ( 'prefix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:759:1: ( 'prefix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:759:1: ( 'prefix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:760:1: 'prefix'
            {
             before(grammarAccess.getClassTypeAccess().getPrefixKeyword_2_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1658); 
             after(grammarAccess.getClassTypeAccess().getPrefixKeyword_2_1_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:773:1: rule__ClassType__Group_2_1__1 : rule__ClassType__Group_2_1__1__Impl ;
    public final void rule__ClassType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:777:1: ( rule__ClassType__Group_2_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:778:2: rule__ClassType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11689);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:784:1: rule__ClassType__Group_2_1__1__Impl : ( ( rule__ClassType__PrefixAssignment_2_1_1 ) ) ;
    public final void rule__ClassType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:788:1: ( ( ( rule__ClassType__PrefixAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:789:1: ( ( rule__ClassType__PrefixAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:789:1: ( ( rule__ClassType__PrefixAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:790:1: ( rule__ClassType__PrefixAssignment_2_1_1 )
            {
             before(grammarAccess.getClassTypeAccess().getPrefixAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:791:1: ( rule__ClassType__PrefixAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:791:2: rule__ClassType__PrefixAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1716);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:805:1: rule__ClassType__Group_2_2__0 : rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1 ;
    public final void rule__ClassType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:809:1: ( rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:810:2: rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__01750);
            rule__ClassType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__01753);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:817:1: rule__ClassType__Group_2_2__0__Impl : ( 'suffix' ) ;
    public final void rule__ClassType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:821:1: ( ( 'suffix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:822:1: ( 'suffix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:822:1: ( 'suffix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:823:1: 'suffix'
            {
             before(grammarAccess.getClassTypeAccess().getSuffixKeyword_2_2_0()); 
            match(input,24,FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl1781); 
             after(grammarAccess.getClassTypeAccess().getSuffixKeyword_2_2_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:836:1: rule__ClassType__Group_2_2__1 : rule__ClassType__Group_2_2__1__Impl ;
    public final void rule__ClassType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:840:1: ( rule__ClassType__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:841:2: rule__ClassType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__11812);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:847:1: rule__ClassType__Group_2_2__1__Impl : ( ( rule__ClassType__SuffixAssignment_2_2_1 ) ) ;
    public final void rule__ClassType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:851:1: ( ( ( rule__ClassType__SuffixAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:852:1: ( ( rule__ClassType__SuffixAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:852:1: ( ( rule__ClassType__SuffixAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:853:1: ( rule__ClassType__SuffixAssignment_2_2_1 )
            {
             before(grammarAccess.getClassTypeAccess().getSuffixAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:854:1: ( rule__ClassType__SuffixAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:854:2: rule__ClassType__SuffixAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl1839);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:868:1: rule__ClassType__Group_2_3__0 : rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1 ;
    public final void rule__ClassType__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:872:1: ( rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:873:2: rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__01873);
            rule__ClassType__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__01876);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:880:1: rule__ClassType__Group_2_3__0__Impl : ( 'blocking' ) ;
    public final void rule__ClassType__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:884:1: ( ( 'blocking' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:885:1: ( 'blocking' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:885:1: ( 'blocking' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:886:1: 'blocking'
            {
             before(grammarAccess.getClassTypeAccess().getBlockingKeyword_2_3_0()); 
            match(input,25,FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl1904); 
             after(grammarAccess.getClassTypeAccess().getBlockingKeyword_2_3_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:899:1: rule__ClassType__Group_2_3__1 : rule__ClassType__Group_2_3__1__Impl ;
    public final void rule__ClassType__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:903:1: ( rule__ClassType__Group_2_3__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:904:2: rule__ClassType__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__11935);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:910:1: rule__ClassType__Group_2_3__1__Impl : ( ( rule__ClassType__BlockingAssignment_2_3_1 ) ) ;
    public final void rule__ClassType__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:914:1: ( ( ( rule__ClassType__BlockingAssignment_2_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:915:1: ( ( rule__ClassType__BlockingAssignment_2_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:915:1: ( ( rule__ClassType__BlockingAssignment_2_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:916:1: ( rule__ClassType__BlockingAssignment_2_3_1 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAssignment_2_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:917:1: ( rule__ClassType__BlockingAssignment_2_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:917:2: rule__ClassType__BlockingAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl1962);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:931:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:935:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:936:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01996);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01999);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:943:1: rule__Procedure__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:947:1: ( ( 'procedure' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:948:1: ( 'procedure' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:948:1: ( 'procedure' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:949:1: 'procedure'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Procedure__Group__0__Impl2027); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:962:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:966:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:967:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12058);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12061);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:974:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:978:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:979:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:979:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:980:1: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:981:1: ( rule__Procedure__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:981:2: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2088);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:991:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:995:1: ( rule__Procedure__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:996:2: rule__Procedure__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22118);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1002:1: rule__Procedure__Group__2__Impl : ( ( rule__Procedure__Alternatives_2 )* ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1006:1: ( ( ( rule__Procedure__Alternatives_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1007:1: ( ( rule__Procedure__Alternatives_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1007:1: ( ( rule__Procedure__Alternatives_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1008:1: ( rule__Procedure__Alternatives_2 )*
            {
             before(grammarAccess.getProcedureAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1009:1: ( rule__Procedure__Alternatives_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=24)||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1009:2: rule__Procedure__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2145);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1025:1: rule__Procedure__Group_2_0__0 : rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1 ;
    public final void rule__Procedure__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1029:1: ( rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1030:2: rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02182);
            rule__Procedure__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02185);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1037:1: rule__Procedure__Group_2_0__0__Impl : ( 'prefix' ) ;
    public final void rule__Procedure__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1041:1: ( ( 'prefix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1042:1: ( 'prefix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1042:1: ( 'prefix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1043:1: 'prefix'
            {
             before(grammarAccess.getProcedureAccess().getPrefixKeyword_2_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2213); 
             after(grammarAccess.getProcedureAccess().getPrefixKeyword_2_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1056:1: rule__Procedure__Group_2_0__1 : rule__Procedure__Group_2_0__1__Impl ;
    public final void rule__Procedure__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1060:1: ( rule__Procedure__Group_2_0__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1061:2: rule__Procedure__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12244);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1067:1: rule__Procedure__Group_2_0__1__Impl : ( ( rule__Procedure__PrefixAssignment_2_0_1 ) ) ;
    public final void rule__Procedure__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1071:1: ( ( ( rule__Procedure__PrefixAssignment_2_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1072:1: ( ( rule__Procedure__PrefixAssignment_2_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1072:1: ( ( rule__Procedure__PrefixAssignment_2_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1073:1: ( rule__Procedure__PrefixAssignment_2_0_1 )
            {
             before(grammarAccess.getProcedureAccess().getPrefixAssignment_2_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1074:1: ( rule__Procedure__PrefixAssignment_2_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1074:2: rule__Procedure__PrefixAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2271);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1088:1: rule__Procedure__Group_2_1__0 : rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 ;
    public final void rule__Procedure__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1092:1: ( rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1093:2: rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02305);
            rule__Procedure__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02308);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1100:1: rule__Procedure__Group_2_1__0__Impl : ( 'suffix' ) ;
    public final void rule__Procedure__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1104:1: ( ( 'suffix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1105:1: ( 'suffix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1105:1: ( 'suffix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1106:1: 'suffix'
            {
             before(grammarAccess.getProcedureAccess().getSuffixKeyword_2_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2336); 
             after(grammarAccess.getProcedureAccess().getSuffixKeyword_2_1_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1119:1: rule__Procedure__Group_2_1__1 : rule__Procedure__Group_2_1__1__Impl ;
    public final void rule__Procedure__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1123:1: ( rule__Procedure__Group_2_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1124:2: rule__Procedure__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12367);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1130:1: rule__Procedure__Group_2_1__1__Impl : ( ( rule__Procedure__SuffixAssignment_2_1_1 ) ) ;
    public final void rule__Procedure__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1134:1: ( ( ( rule__Procedure__SuffixAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1135:1: ( ( rule__Procedure__SuffixAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1135:1: ( ( rule__Procedure__SuffixAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1136:1: ( rule__Procedure__SuffixAssignment_2_1_1 )
            {
             before(grammarAccess.getProcedureAccess().getSuffixAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1137:1: ( rule__Procedure__SuffixAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1137:2: rule__Procedure__SuffixAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2394);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1151:1: rule__Procedure__Group_2_2__0 : rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1 ;
    public final void rule__Procedure__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1155:1: ( rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1156:2: rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02428);
            rule__Procedure__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02431);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1163:1: rule__Procedure__Group_2_2__0__Impl : ( 'types' ) ;
    public final void rule__Procedure__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1167:1: ( ( 'types' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1168:1: ( 'types' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1168:1: ( 'types' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1169:1: 'types'
            {
             before(grammarAccess.getProcedureAccess().getTypesKeyword_2_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2459); 
             after(grammarAccess.getProcedureAccess().getTypesKeyword_2_2_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1182:1: rule__Procedure__Group_2_2__1 : rule__Procedure__Group_2_2__1__Impl ;
    public final void rule__Procedure__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1186:1: ( rule__Procedure__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1187:2: rule__Procedure__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12490);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1193:1: rule__Procedure__Group_2_2__1__Impl : ( ( rule__Procedure__TypesAssignment_2_2_1 ) ) ;
    public final void rule__Procedure__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1197:1: ( ( ( rule__Procedure__TypesAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1198:1: ( ( rule__Procedure__TypesAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1198:1: ( ( rule__Procedure__TypesAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1199:1: ( rule__Procedure__TypesAssignment_2_2_1 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1200:1: ( rule__Procedure__TypesAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1200:2: rule__Procedure__TypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2517);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1214:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1218:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1219:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02551);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02554);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1226:1: rule__Statement__Group__0__Impl : ( 'statement' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1230:1: ( ( 'statement' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1231:1: ( 'statement' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1231:1: ( 'statement' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1232:1: 'statement'
            {
             before(grammarAccess.getStatementAccess().getStatementKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Statement__Group__0__Impl2582); 
             after(grammarAccess.getStatementAccess().getStatementKeyword_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1245:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1249:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1250:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12613);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12616);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1257:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__NameAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1261:1: ( ( ( rule__Statement__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1262:1: ( ( rule__Statement__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1262:1: ( ( rule__Statement__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1263:1: ( rule__Statement__NameAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1264:1: ( rule__Statement__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1264:2: rule__Statement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2643);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1274:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1278:1: ( rule__Statement__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1279:2: rule__Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22673);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1285:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__Alternatives_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1289:1: ( ( ( rule__Statement__Alternatives_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1290:1: ( ( rule__Statement__Alternatives_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1290:1: ( ( rule__Statement__Alternatives_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1291:1: ( rule__Statement__Alternatives_2 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1292:1: ( rule__Statement__Alternatives_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1292:2: rule__Statement__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2700);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1308:1: rule__Statement__Group_2_0__0 : rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1 ;
    public final void rule__Statement__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1312:1: ( rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1313:2: rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02736);
            rule__Statement__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02739);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1320:1: rule__Statement__Group_2_0__0__Impl : ( 'repeat' ) ;
    public final void rule__Statement__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1324:1: ( ( 'repeat' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1325:1: ( 'repeat' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1325:1: ( 'repeat' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1326:1: 'repeat'
            {
             before(grammarAccess.getStatementAccess().getRepeatKeyword_2_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl2767); 
             after(grammarAccess.getStatementAccess().getRepeatKeyword_2_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1339:1: rule__Statement__Group_2_0__1 : rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2 ;
    public final void rule__Statement__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1343:1: ( rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1344:2: rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__12798);
            rule__Statement__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__12801);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1351:1: rule__Statement__Group_2_0__1__Impl : ( ( rule__Statement__RepAssignment_2_0_1 ) ) ;
    public final void rule__Statement__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1355:1: ( ( ( rule__Statement__RepAssignment_2_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1356:1: ( ( rule__Statement__RepAssignment_2_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1356:1: ( ( rule__Statement__RepAssignment_2_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1357:1: ( rule__Statement__RepAssignment_2_0_1 )
            {
             before(grammarAccess.getStatementAccess().getRepAssignment_2_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1358:1: ( rule__Statement__RepAssignment_2_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1358:2: rule__Statement__RepAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl2828);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1368:1: rule__Statement__Group_2_0__2 : rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3 ;
    public final void rule__Statement__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1372:1: ( rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1373:2: rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__22858);
            rule__Statement__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__22861);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1380:1: rule__Statement__Group_2_0__2__Impl : ( 'until' ) ;
    public final void rule__Statement__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1384:1: ( ( 'until' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1385:1: ( 'until' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1385:1: ( 'until' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1386:1: 'until'
            {
             before(grammarAccess.getStatementAccess().getUntilKeyword_2_0_2()); 
            match(input,30,FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl2889); 
             after(grammarAccess.getStatementAccess().getUntilKeyword_2_0_2()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1399:1: rule__Statement__Group_2_0__3 : rule__Statement__Group_2_0__3__Impl ;
    public final void rule__Statement__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1403:1: ( rule__Statement__Group_2_0__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1404:2: rule__Statement__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__32920);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1410:1: rule__Statement__Group_2_0__3__Impl : ( ( rule__Statement__UntilAssignment_2_0_3 ) ) ;
    public final void rule__Statement__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1414:1: ( ( ( rule__Statement__UntilAssignment_2_0_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1415:1: ( ( rule__Statement__UntilAssignment_2_0_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1415:1: ( ( rule__Statement__UntilAssignment_2_0_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1416:1: ( rule__Statement__UntilAssignment_2_0_3 )
            {
             before(grammarAccess.getStatementAccess().getUntilAssignment_2_0_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1417:1: ( rule__Statement__UntilAssignment_2_0_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1417:2: rule__Statement__UntilAssignment_2_0_3
            {
            pushFollow(FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl2947);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1435:1: rule__Statement__Group_2_1__0 : rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1 ;
    public final void rule__Statement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1439:1: ( rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1440:2: rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__02985);
            rule__Statement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__02988);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1447:1: rule__Statement__Group_2_1__0__Impl : ( 'while' ) ;
    public final void rule__Statement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1451:1: ( ( 'while' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1452:1: ( 'while' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1452:1: ( 'while' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1453:1: 'while'
            {
             before(grammarAccess.getStatementAccess().getWhileKeyword_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl3016); 
             after(grammarAccess.getStatementAccess().getWhileKeyword_2_1_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1466:1: rule__Statement__Group_2_1__1 : rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2 ;
    public final void rule__Statement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1470:1: ( rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1471:2: rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13047);
            rule__Statement__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13050);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1478:1: rule__Statement__Group_2_1__1__Impl : ( ( rule__Statement__WhileAssignment_2_1_1 ) ) ;
    public final void rule__Statement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1482:1: ( ( ( rule__Statement__WhileAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1483:1: ( ( rule__Statement__WhileAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1483:1: ( ( rule__Statement__WhileAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1484:1: ( rule__Statement__WhileAssignment_2_1_1 )
            {
             before(grammarAccess.getStatementAccess().getWhileAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1485:1: ( rule__Statement__WhileAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1485:2: rule__Statement__WhileAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3077);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1495:1: rule__Statement__Group_2_1__2 : rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3 ;
    public final void rule__Statement__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1499:1: ( rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1500:2: rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23107);
            rule__Statement__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23110);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1507:1: rule__Statement__Group_2_1__2__Impl : ( 'do' ) ;
    public final void rule__Statement__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1511:1: ( ( 'do' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1512:1: ( 'do' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1512:1: ( 'do' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1513:1: 'do'
            {
             before(grammarAccess.getStatementAccess().getDoKeyword_2_1_2()); 
            match(input,32,FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3138); 
             after(grammarAccess.getStatementAccess().getDoKeyword_2_1_2()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1526:1: rule__Statement__Group_2_1__3 : rule__Statement__Group_2_1__3__Impl ;
    public final void rule__Statement__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1530:1: ( rule__Statement__Group_2_1__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1531:2: rule__Statement__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33169);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1537:1: rule__Statement__Group_2_1__3__Impl : ( ( rule__Statement__DoAssignment_2_1_3 ) ) ;
    public final void rule__Statement__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1541:1: ( ( ( rule__Statement__DoAssignment_2_1_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1542:1: ( ( rule__Statement__DoAssignment_2_1_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1542:1: ( ( rule__Statement__DoAssignment_2_1_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1543:1: ( rule__Statement__DoAssignment_2_1_3 )
            {
             before(grammarAccess.getStatementAccess().getDoAssignment_2_1_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1544:1: ( rule__Statement__DoAssignment_2_1_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1544:2: rule__Statement__DoAssignment_2_1_3
            {
            pushFollow(FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3196);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1562:1: rule__Statement__Group_2_2__0 : rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1 ;
    public final void rule__Statement__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1566:1: ( rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1567:2: rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03234);
            rule__Statement__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03237);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1574:1: rule__Statement__Group_2_2__0__Impl : ( 'for' ) ;
    public final void rule__Statement__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1578:1: ( ( 'for' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1579:1: ( 'for' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1579:1: ( 'for' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1580:1: 'for'
            {
             before(grammarAccess.getStatementAccess().getForKeyword_2_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3265); 
             after(grammarAccess.getStatementAccess().getForKeyword_2_2_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1593:1: rule__Statement__Group_2_2__1 : rule__Statement__Group_2_2__1__Impl ;
    public final void rule__Statement__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1597:1: ( rule__Statement__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1598:2: rule__Statement__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13296);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1604:1: rule__Statement__Group_2_2__1__Impl : ( ( rule__Statement__ForAssignment_2_2_1 ) ) ;
    public final void rule__Statement__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1608:1: ( ( ( rule__Statement__ForAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1609:1: ( ( rule__Statement__ForAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1609:1: ( ( rule__Statement__ForAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1610:1: ( rule__Statement__ForAssignment_2_2_1 )
            {
             before(grammarAccess.getStatementAccess().getForAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1611:1: ( rule__Statement__ForAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1611:2: rule__Statement__ForAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3323);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1625:1: rule__Statement__Group_2_3__0 : rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1 ;
    public final void rule__Statement__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1629:1: ( rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1630:2: rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03357);
            rule__Statement__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03360);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1637:1: rule__Statement__Group_2_3__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1641:1: ( ( 'var' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1642:1: ( 'var' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1642:1: ( 'var' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1643:1: 'var'
            {
             before(grammarAccess.getStatementAccess().getVarKeyword_2_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3388); 
             after(grammarAccess.getStatementAccess().getVarKeyword_2_3_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1656:1: rule__Statement__Group_2_3__1 : rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2 ;
    public final void rule__Statement__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1660:1: ( rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1661:2: rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13419);
            rule__Statement__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13422);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1668:1: rule__Statement__Group_2_3__1__Impl : ( ( rule__Statement__VarAssignment_2_3_1 ) ) ;
    public final void rule__Statement__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1672:1: ( ( ( rule__Statement__VarAssignment_2_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1673:1: ( ( rule__Statement__VarAssignment_2_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1673:1: ( ( rule__Statement__VarAssignment_2_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1674:1: ( rule__Statement__VarAssignment_2_3_1 )
            {
             before(grammarAccess.getStatementAccess().getVarAssignment_2_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1675:1: ( rule__Statement__VarAssignment_2_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1675:2: rule__Statement__VarAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3449);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1685:1: rule__Statement__Group_2_3__2 : rule__Statement__Group_2_3__2__Impl ;
    public final void rule__Statement__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1689:1: ( rule__Statement__Group_2_3__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1690:2: rule__Statement__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23479);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1696:1: rule__Statement__Group_2_3__2__Impl : ( ( rule__Statement__Group_2_3_2__0 )? ) ;
    public final void rule__Statement__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1700:1: ( ( ( rule__Statement__Group_2_3_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1701:1: ( ( rule__Statement__Group_2_3_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1701:1: ( ( rule__Statement__Group_2_3_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1702:1: ( rule__Statement__Group_2_3_2__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_2_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1703:1: ( rule__Statement__Group_2_3_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1703:2: rule__Statement__Group_2_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3506);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1719:1: rule__Statement__Group_2_3_2__0 : rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1 ;
    public final void rule__Statement__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1723:1: ( rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1724:2: rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03543);
            rule__Statement__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03546);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1731:1: rule__Statement__Group_2_3_2__0__Impl : ( '=' ) ;
    public final void rule__Statement__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1735:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1736:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1736:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1737:1: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_3_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3574); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1750:1: rule__Statement__Group_2_3_2__1 : rule__Statement__Group_2_3_2__1__Impl ;
    public final void rule__Statement__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1754:1: ( rule__Statement__Group_2_3_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1755:2: rule__Statement__Group_2_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13605);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1761:1: rule__Statement__Group_2_3_2__1__Impl : ( ( rule__Statement__ExAssignment_2_3_2_1 ) ) ;
    public final void rule__Statement__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1765:1: ( ( ( rule__Statement__ExAssignment_2_3_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1766:1: ( ( rule__Statement__ExAssignment_2_3_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1766:1: ( ( rule__Statement__ExAssignment_2_3_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1767:1: ( rule__Statement__ExAssignment_2_3_2_1 )
            {
             before(grammarAccess.getStatementAccess().getExAssignment_2_3_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1768:1: ( rule__Statement__ExAssignment_2_3_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1768:2: rule__Statement__ExAssignment_2_3_2_1
            {
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3632);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1782:1: rule__Statement__Group_2_4__0 : rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1 ;
    public final void rule__Statement__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1786:1: ( rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1787:2: rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03666);
            rule__Statement__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03669);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1794:1: rule__Statement__Group_2_4__0__Impl : ( 'val' ) ;
    public final void rule__Statement__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1798:1: ( ( 'val' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1799:1: ( 'val' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1799:1: ( 'val' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1800:1: 'val'
            {
             before(grammarAccess.getStatementAccess().getValKeyword_2_4_0()); 
            match(input,36,FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3697); 
             after(grammarAccess.getStatementAccess().getValKeyword_2_4_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1813:1: rule__Statement__Group_2_4__1 : rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2 ;
    public final void rule__Statement__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1817:1: ( rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1818:2: rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13728);
            rule__Statement__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13731);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1825:1: rule__Statement__Group_2_4__1__Impl : ( ( rule__Statement__ValAssignment_2_4_1 ) ) ;
    public final void rule__Statement__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1829:1: ( ( ( rule__Statement__ValAssignment_2_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1830:1: ( ( rule__Statement__ValAssignment_2_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1830:1: ( ( rule__Statement__ValAssignment_2_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1831:1: ( rule__Statement__ValAssignment_2_4_1 )
            {
             before(grammarAccess.getStatementAccess().getValAssignment_2_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1832:1: ( rule__Statement__ValAssignment_2_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1832:2: rule__Statement__ValAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl3758);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1842:1: rule__Statement__Group_2_4__2 : rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3 ;
    public final void rule__Statement__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1846:1: ( rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1847:2: rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__23788);
            rule__Statement__Group_2_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__23791);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1854:1: rule__Statement__Group_2_4__2__Impl : ( '=' ) ;
    public final void rule__Statement__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1858:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1859:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1859:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1860:1: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_4_2()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl3819); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1873:1: rule__Statement__Group_2_4__3 : rule__Statement__Group_2_4__3__Impl ;
    public final void rule__Statement__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1877:1: ( rule__Statement__Group_2_4__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1878:2: rule__Statement__Group_2_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__33850);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1884:1: rule__Statement__Group_2_4__3__Impl : ( ( rule__Statement__ExAssignment_2_4_3 ) ) ;
    public final void rule__Statement__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1888:1: ( ( ( rule__Statement__ExAssignment_2_4_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1889:1: ( ( rule__Statement__ExAssignment_2_4_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1889:1: ( ( rule__Statement__ExAssignment_2_4_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1890:1: ( rule__Statement__ExAssignment_2_4_3 )
            {
             before(grammarAccess.getStatementAccess().getExAssignment_2_4_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1891:1: ( rule__Statement__ExAssignment_2_4_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1891:2: rule__Statement__ExAssignment_2_4_3
            {
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl3877);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1909:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1913:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1914:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03915);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03918);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1921:1: rule__Expression__Group__0__Impl : ( 'expression' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1925:1: ( ( 'expression' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1926:1: ( 'expression' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1926:1: ( 'expression' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1927:1: 'expression'
            {
             before(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Expression__Group__0__Impl3946); 
             after(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1940:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1944:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1945:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13977);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__13980);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1952:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__NameAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1956:1: ( ( ( rule__Expression__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1957:1: ( ( rule__Expression__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1957:1: ( ( rule__Expression__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1958:1: ( rule__Expression__NameAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1959:1: ( rule__Expression__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1959:2: rule__Expression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl4007);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1969:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1973:1: ( rule__Expression__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1974:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24037);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1980:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__PrecAssignment_2 )* ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1984:1: ( ( ( rule__Expression__PrecAssignment_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1985:1: ( ( rule__Expression__PrecAssignment_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1985:1: ( ( rule__Expression__PrecAssignment_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1986:1: ( rule__Expression__PrecAssignment_2 )*
            {
             before(grammarAccess.getExpressionAccess().getPrecAssignment_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1987:1: ( rule__Expression__PrecAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||(LA15_0>=23 && LA15_0<=24)||(LA15_0>=41 && LA15_0<=46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1987:2: rule__Expression__PrecAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4064);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2003:1: rule__Precedence__Group_0__0 : rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1 ;
    public final void rule__Precedence__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2007:1: ( rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2008:2: rule__Precedence__Group_0__0__Impl rule__Precedence__Group_0__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0__0__Impl_in_rule__Precedence__Group_0__04101);
            rule__Precedence__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_0__1_in_rule__Precedence__Group_0__04104);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2015:1: rule__Precedence__Group_0__0__Impl : ( ( rule__Precedence__RuletypAssignment_0_0 ) ) ;
    public final void rule__Precedence__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2019:1: ( ( ( rule__Precedence__RuletypAssignment_0_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2020:1: ( ( rule__Precedence__RuletypAssignment_0_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2020:1: ( ( rule__Precedence__RuletypAssignment_0_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2021:1: ( rule__Precedence__RuletypAssignment_0_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2022:1: ( rule__Precedence__RuletypAssignment_0_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2022:2: rule__Precedence__RuletypAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_0_0_in_rule__Precedence__Group_0__0__Impl4131);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2032:1: rule__Precedence__Group_0__1 : rule__Precedence__Group_0__1__Impl ;
    public final void rule__Precedence__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2036:1: ( rule__Precedence__Group_0__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2037:2: rule__Precedence__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_0__1__Impl_in_rule__Precedence__Group_0__14161);
            rule__Precedence__Group_0__1__Impl();

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2043:1: rule__Precedence__Group_0__1__Impl : ( ( rule__Precedence__RuleAssignment_0_1 ) ) ;
    public final void rule__Precedence__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2047:1: ( ( ( rule__Precedence__RuleAssignment_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2048:1: ( ( rule__Precedence__RuleAssignment_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2048:1: ( ( rule__Precedence__RuleAssignment_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2049:1: ( rule__Precedence__RuleAssignment_0_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2050:1: ( rule__Precedence__RuleAssignment_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2050:2: rule__Precedence__RuleAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_0_1_in_rule__Precedence__Group_0__1__Impl4188);
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


    // $ANTLR start "rule__Precedence__Group_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2064:1: rule__Precedence__Group_1__0 : rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1 ;
    public final void rule__Precedence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2068:1: ( rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2069:2: rule__Precedence__Group_1__0__Impl rule__Precedence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__0__Impl_in_rule__Precedence__Group_1__04222);
            rule__Precedence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__1_in_rule__Precedence__Group_1__04225);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2076:1: rule__Precedence__Group_1__0__Impl : ( ( rule__Precedence__RuletypAssignment_1_0 ) ) ;
    public final void rule__Precedence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2080:1: ( ( ( rule__Precedence__RuletypAssignment_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2081:1: ( ( rule__Precedence__RuletypAssignment_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2081:1: ( ( rule__Precedence__RuletypAssignment_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2082:1: ( rule__Precedence__RuletypAssignment_1_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2083:1: ( rule__Precedence__RuletypAssignment_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2083:2: rule__Precedence__RuletypAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_1_0_in_rule__Precedence__Group_1__0__Impl4252);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2093:1: rule__Precedence__Group_1__1 : rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2 ;
    public final void rule__Precedence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2097:1: ( rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2098:2: rule__Precedence__Group_1__1__Impl rule__Precedence__Group_1__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__1__Impl_in_rule__Precedence__Group_1__14282);
            rule__Precedence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__2_in_rule__Precedence__Group_1__14285);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2105:1: rule__Precedence__Group_1__1__Impl : ( ( rule__Precedence__RuleAssignment_1_1 ) ) ;
    public final void rule__Precedence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2109:1: ( ( ( rule__Precedence__RuleAssignment_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2110:1: ( ( rule__Precedence__RuleAssignment_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2110:1: ( ( rule__Precedence__RuleAssignment_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2111:1: ( rule__Precedence__RuleAssignment_1_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2112:1: ( rule__Precedence__RuleAssignment_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2112:2: rule__Precedence__RuleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_1_1_in_rule__Precedence__Group_1__1__Impl4312);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2122:1: rule__Precedence__Group_1__2 : rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3 ;
    public final void rule__Precedence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2126:1: ( rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2127:2: rule__Precedence__Group_1__2__Impl rule__Precedence__Group_1__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__2__Impl_in_rule__Precedence__Group_1__24342);
            rule__Precedence__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_1__3_in_rule__Precedence__Group_1__24345);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2134:1: rule__Precedence__Group_1__2__Impl : ( ( rule__Precedence__PrefixAssignment_1_2 ) ) ;
    public final void rule__Precedence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2138:1: ( ( ( rule__Precedence__PrefixAssignment_1_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2139:1: ( ( rule__Precedence__PrefixAssignment_1_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2139:1: ( ( rule__Precedence__PrefixAssignment_1_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2140:1: ( rule__Precedence__PrefixAssignment_1_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getPrefixAssignment_1_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2141:1: ( rule__Precedence__PrefixAssignment_1_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2141:2: rule__Precedence__PrefixAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Precedence__PrefixAssignment_1_2_in_rule__Precedence__Group_1__2__Impl4372);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2151:1: rule__Precedence__Group_1__3 : rule__Precedence__Group_1__3__Impl ;
    public final void rule__Precedence__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2155:1: ( rule__Precedence__Group_1__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2156:2: rule__Precedence__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_1__3__Impl_in_rule__Precedence__Group_1__34402);
            rule__Precedence__Group_1__3__Impl();

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2162:1: rule__Precedence__Group_1__3__Impl : ( ( rule__Precedence__Par1Assignment_1_3 ) ) ;
    public final void rule__Precedence__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2166:1: ( ( ( rule__Precedence__Par1Assignment_1_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2167:1: ( ( rule__Precedence__Par1Assignment_1_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2167:1: ( ( rule__Precedence__Par1Assignment_1_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2168:1: ( rule__Precedence__Par1Assignment_1_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_1_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2169:1: ( rule__Precedence__Par1Assignment_1_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2169:2: rule__Precedence__Par1Assignment_1_3
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_1_3_in_rule__Precedence__Group_1__3__Impl4429);
            rule__Precedence__Par1Assignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_1_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Precedence__Group_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2187:1: rule__Precedence__Group_2__0 : rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1 ;
    public final void rule__Precedence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2191:1: ( rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2192:2: rule__Precedence__Group_2__0__Impl rule__Precedence__Group_2__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__0__Impl_in_rule__Precedence__Group_2__04467);
            rule__Precedence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__1_in_rule__Precedence__Group_2__04470);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2199:1: rule__Precedence__Group_2__0__Impl : ( ( rule__Precedence__RuletypAssignment_2_0 ) ) ;
    public final void rule__Precedence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2203:1: ( ( ( rule__Precedence__RuletypAssignment_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2204:1: ( ( rule__Precedence__RuletypAssignment_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2204:1: ( ( rule__Precedence__RuletypAssignment_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2205:1: ( rule__Precedence__RuletypAssignment_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2206:1: ( rule__Precedence__RuletypAssignment_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2206:2: rule__Precedence__RuletypAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_2_0_in_rule__Precedence__Group_2__0__Impl4497);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2216:1: rule__Precedence__Group_2__1 : rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2 ;
    public final void rule__Precedence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2220:1: ( rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2221:2: rule__Precedence__Group_2__1__Impl rule__Precedence__Group_2__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__1__Impl_in_rule__Precedence__Group_2__14527);
            rule__Precedence__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__2_in_rule__Precedence__Group_2__14530);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2228:1: rule__Precedence__Group_2__1__Impl : ( ( rule__Precedence__RuleAssignment_2_1 ) ) ;
    public final void rule__Precedence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2232:1: ( ( ( rule__Precedence__RuleAssignment_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2233:1: ( ( rule__Precedence__RuleAssignment_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2233:1: ( ( rule__Precedence__RuleAssignment_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2234:1: ( rule__Precedence__RuleAssignment_2_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2235:1: ( rule__Precedence__RuleAssignment_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2235:2: rule__Precedence__RuleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_2_1_in_rule__Precedence__Group_2__1__Impl4557);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2245:1: rule__Precedence__Group_2__2 : rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3 ;
    public final void rule__Precedence__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2249:1: ( rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2250:2: rule__Precedence__Group_2__2__Impl rule__Precedence__Group_2__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__2__Impl_in_rule__Precedence__Group_2__24587);
            rule__Precedence__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_2__3_in_rule__Precedence__Group_2__24590);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2257:1: rule__Precedence__Group_2__2__Impl : ( ( rule__Precedence__Par1Assignment_2_2 ) ) ;
    public final void rule__Precedence__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2261:1: ( ( ( rule__Precedence__Par1Assignment_2_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2262:1: ( ( rule__Precedence__Par1Assignment_2_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2262:1: ( ( rule__Precedence__Par1Assignment_2_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2263:1: ( rule__Precedence__Par1Assignment_2_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_2_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2264:1: ( rule__Precedence__Par1Assignment_2_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2264:2: rule__Precedence__Par1Assignment_2_2
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_2_2_in_rule__Precedence__Group_2__2__Impl4617);
            rule__Precedence__Par1Assignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_2_2()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2274:1: rule__Precedence__Group_2__3 : rule__Precedence__Group_2__3__Impl ;
    public final void rule__Precedence__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2278:1: ( rule__Precedence__Group_2__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2279:2: rule__Precedence__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_2__3__Impl_in_rule__Precedence__Group_2__34647);
            rule__Precedence__Group_2__3__Impl();

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2285:1: rule__Precedence__Group_2__3__Impl : ( ( rule__Precedence__SuffixAssignment_2_3 ) ) ;
    public final void rule__Precedence__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2289:1: ( ( ( rule__Precedence__SuffixAssignment_2_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2290:1: ( ( rule__Precedence__SuffixAssignment_2_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2290:1: ( ( rule__Precedence__SuffixAssignment_2_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2291:1: ( rule__Precedence__SuffixAssignment_2_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getSuffixAssignment_2_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2292:1: ( rule__Precedence__SuffixAssignment_2_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2292:2: rule__Precedence__SuffixAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Precedence__SuffixAssignment_2_3_in_rule__Precedence__Group_2__3__Impl4674);
            rule__Precedence__SuffixAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getSuffixAssignment_2_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Precedence__Group_3__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2310:1: rule__Precedence__Group_3__0 : rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1 ;
    public final void rule__Precedence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2314:1: ( rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2315:2: rule__Precedence__Group_3__0__Impl rule__Precedence__Group_3__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__0__Impl_in_rule__Precedence__Group_3__04712);
            rule__Precedence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__1_in_rule__Precedence__Group_3__04715);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2322:1: rule__Precedence__Group_3__0__Impl : ( ( rule__Precedence__RuletypAssignment_3_0 ) ) ;
    public final void rule__Precedence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2326:1: ( ( ( rule__Precedence__RuletypAssignment_3_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2327:1: ( ( rule__Precedence__RuletypAssignment_3_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2327:1: ( ( rule__Precedence__RuletypAssignment_3_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2328:1: ( rule__Precedence__RuletypAssignment_3_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_3_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2329:1: ( rule__Precedence__RuletypAssignment_3_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2329:2: rule__Precedence__RuletypAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_3_0_in_rule__Precedence__Group_3__0__Impl4742);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2339:1: rule__Precedence__Group_3__1 : rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2 ;
    public final void rule__Precedence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2343:1: ( rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2344:2: rule__Precedence__Group_3__1__Impl rule__Precedence__Group_3__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__1__Impl_in_rule__Precedence__Group_3__14772);
            rule__Precedence__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__2_in_rule__Precedence__Group_3__14775);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2351:1: rule__Precedence__Group_3__1__Impl : ( ( rule__Precedence__RuleAssignment_3_1 ) ) ;
    public final void rule__Precedence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2355:1: ( ( ( rule__Precedence__RuleAssignment_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2356:1: ( ( rule__Precedence__RuleAssignment_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2356:1: ( ( rule__Precedence__RuleAssignment_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2357:1: ( rule__Precedence__RuleAssignment_3_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2358:1: ( rule__Precedence__RuleAssignment_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2358:2: rule__Precedence__RuleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_3_1_in_rule__Precedence__Group_3__1__Impl4802);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2368:1: rule__Precedence__Group_3__2 : rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3 ;
    public final void rule__Precedence__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2372:1: ( rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2373:2: rule__Precedence__Group_3__2__Impl rule__Precedence__Group_3__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__2__Impl_in_rule__Precedence__Group_3__24832);
            rule__Precedence__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__3_in_rule__Precedence__Group_3__24835);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2380:1: rule__Precedence__Group_3__2__Impl : ( ( rule__Precedence__Par1Assignment_3_2 ) ) ;
    public final void rule__Precedence__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2384:1: ( ( ( rule__Precedence__Par1Assignment_3_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2385:1: ( ( rule__Precedence__Par1Assignment_3_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2385:1: ( ( rule__Precedence__Par1Assignment_3_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2386:1: ( rule__Precedence__Par1Assignment_3_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2387:1: ( rule__Precedence__Par1Assignment_3_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2387:2: rule__Precedence__Par1Assignment_3_2
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_3_2_in_rule__Precedence__Group_3__2__Impl4862);
            rule__Precedence__Par1Assignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_3_2()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2397:1: rule__Precedence__Group_3__3 : rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4 ;
    public final void rule__Precedence__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2401:1: ( rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2402:2: rule__Precedence__Group_3__3__Impl rule__Precedence__Group_3__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__3__Impl_in_rule__Precedence__Group_3__34892);
            rule__Precedence__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_3__4_in_rule__Precedence__Group_3__34895);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2409:1: rule__Precedence__Group_3__3__Impl : ( ( rule__Precedence__InfixAssignment_3_3 ) ) ;
    public final void rule__Precedence__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2413:1: ( ( ( rule__Precedence__InfixAssignment_3_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2414:1: ( ( rule__Precedence__InfixAssignment_3_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2414:1: ( ( rule__Precedence__InfixAssignment_3_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2415:1: ( rule__Precedence__InfixAssignment_3_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getInfixAssignment_3_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2416:1: ( rule__Precedence__InfixAssignment_3_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2416:2: rule__Precedence__InfixAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Precedence__InfixAssignment_3_3_in_rule__Precedence__Group_3__3__Impl4922);
            rule__Precedence__InfixAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getInfixAssignment_3_3()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2426:1: rule__Precedence__Group_3__4 : rule__Precedence__Group_3__4__Impl ;
    public final void rule__Precedence__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2430:1: ( rule__Precedence__Group_3__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2431:2: rule__Precedence__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_3__4__Impl_in_rule__Precedence__Group_3__44952);
            rule__Precedence__Group_3__4__Impl();

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2437:1: rule__Precedence__Group_3__4__Impl : ( ( rule__Precedence__Par2Assignment_3_4 ) ) ;
    public final void rule__Precedence__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2441:1: ( ( ( rule__Precedence__Par2Assignment_3_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2442:1: ( ( rule__Precedence__Par2Assignment_3_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2442:1: ( ( rule__Precedence__Par2Assignment_3_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2443:1: ( rule__Precedence__Par2Assignment_3_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar2Assignment_3_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2444:1: ( rule__Precedence__Par2Assignment_3_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2444:2: rule__Precedence__Par2Assignment_3_4
            {
            pushFollow(FOLLOW_rule__Precedence__Par2Assignment_3_4_in_rule__Precedence__Group_3__4__Impl4979);
            rule__Precedence__Par2Assignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar2Assignment_3_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Precedence__Group_4__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2464:1: rule__Precedence__Group_4__0 : rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1 ;
    public final void rule__Precedence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2468:1: ( rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2469:2: rule__Precedence__Group_4__0__Impl rule__Precedence__Group_4__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__0__Impl_in_rule__Precedence__Group_4__05019);
            rule__Precedence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__1_in_rule__Precedence__Group_4__05022);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2476:1: rule__Precedence__Group_4__0__Impl : ( ( rule__Precedence__RuletypAssignment_4_0 ) ) ;
    public final void rule__Precedence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2480:1: ( ( ( rule__Precedence__RuletypAssignment_4_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2481:1: ( ( rule__Precedence__RuletypAssignment_4_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2481:1: ( ( rule__Precedence__RuletypAssignment_4_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2482:1: ( rule__Precedence__RuletypAssignment_4_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_4_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2483:1: ( rule__Precedence__RuletypAssignment_4_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2483:2: rule__Precedence__RuletypAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_4_0_in_rule__Precedence__Group_4__0__Impl5049);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2493:1: rule__Precedence__Group_4__1 : rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2 ;
    public final void rule__Precedence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2497:1: ( rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2498:2: rule__Precedence__Group_4__1__Impl rule__Precedence__Group_4__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__1__Impl_in_rule__Precedence__Group_4__15079);
            rule__Precedence__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__2_in_rule__Precedence__Group_4__15082);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2505:1: rule__Precedence__Group_4__1__Impl : ( ( rule__Precedence__RuleAssignment_4_1 ) ) ;
    public final void rule__Precedence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2509:1: ( ( ( rule__Precedence__RuleAssignment_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2510:1: ( ( rule__Precedence__RuleAssignment_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2510:1: ( ( rule__Precedence__RuleAssignment_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2511:1: ( rule__Precedence__RuleAssignment_4_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2512:1: ( rule__Precedence__RuleAssignment_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2512:2: rule__Precedence__RuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_4_1_in_rule__Precedence__Group_4__1__Impl5109);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2522:1: rule__Precedence__Group_4__2 : rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3 ;
    public final void rule__Precedence__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2526:1: ( rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2527:2: rule__Precedence__Group_4__2__Impl rule__Precedence__Group_4__3
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__2__Impl_in_rule__Precedence__Group_4__25139);
            rule__Precedence__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__3_in_rule__Precedence__Group_4__25142);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2534:1: rule__Precedence__Group_4__2__Impl : ( ( rule__Precedence__Par1Assignment_4_2 ) ) ;
    public final void rule__Precedence__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2538:1: ( ( ( rule__Precedence__Par1Assignment_4_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2539:1: ( ( rule__Precedence__Par1Assignment_4_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2539:1: ( ( rule__Precedence__Par1Assignment_4_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2540:1: ( rule__Precedence__Par1Assignment_4_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar1Assignment_4_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2541:1: ( rule__Precedence__Par1Assignment_4_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2541:2: rule__Precedence__Par1Assignment_4_2
            {
            pushFollow(FOLLOW_rule__Precedence__Par1Assignment_4_2_in_rule__Precedence__Group_4__2__Impl5169);
            rule__Precedence__Par1Assignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar1Assignment_4_2()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2551:1: rule__Precedence__Group_4__3 : rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4 ;
    public final void rule__Precedence__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2555:1: ( rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2556:2: rule__Precedence__Group_4__3__Impl rule__Precedence__Group_4__4
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__3__Impl_in_rule__Precedence__Group_4__35199);
            rule__Precedence__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_4__4_in_rule__Precedence__Group_4__35202);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2563:1: rule__Precedence__Group_4__3__Impl : ( ( rule__Precedence__InfixleftAssignment_4_3 ) ) ;
    public final void rule__Precedence__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2567:1: ( ( ( rule__Precedence__InfixleftAssignment_4_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2568:1: ( ( rule__Precedence__InfixleftAssignment_4_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2568:1: ( ( rule__Precedence__InfixleftAssignment_4_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2569:1: ( rule__Precedence__InfixleftAssignment_4_3 )
            {
             before(grammarAccess.getPrecedenceAccess().getInfixleftAssignment_4_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2570:1: ( rule__Precedence__InfixleftAssignment_4_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2570:2: rule__Precedence__InfixleftAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Precedence__InfixleftAssignment_4_3_in_rule__Precedence__Group_4__3__Impl5229);
            rule__Precedence__InfixleftAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getInfixleftAssignment_4_3()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2580:1: rule__Precedence__Group_4__4 : rule__Precedence__Group_4__4__Impl ;
    public final void rule__Precedence__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2584:1: ( rule__Precedence__Group_4__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2585:2: rule__Precedence__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_4__4__Impl_in_rule__Precedence__Group_4__45259);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2591:1: rule__Precedence__Group_4__4__Impl : ( ( rule__Precedence__Par2Assignment_4_4 ) ) ;
    public final void rule__Precedence__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2595:1: ( ( ( rule__Precedence__Par2Assignment_4_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2596:1: ( ( rule__Precedence__Par2Assignment_4_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2596:1: ( ( rule__Precedence__Par2Assignment_4_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2597:1: ( rule__Precedence__Par2Assignment_4_4 )
            {
             before(grammarAccess.getPrecedenceAccess().getPar2Assignment_4_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2598:1: ( rule__Precedence__Par2Assignment_4_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2598:2: rule__Precedence__Par2Assignment_4_4
            {
            pushFollow(FOLLOW_rule__Precedence__Par2Assignment_4_4_in_rule__Precedence__Group_4__4__Impl5286);
            rule__Precedence__Par2Assignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getPar2Assignment_4_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Precedence__Group_5__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2618:1: rule__Precedence__Group_5__0 : rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1 ;
    public final void rule__Precedence__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2622:1: ( rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2623:2: rule__Precedence__Group_5__0__Impl rule__Precedence__Group_5__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__0__Impl_in_rule__Precedence__Group_5__05326);
            rule__Precedence__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__1_in_rule__Precedence__Group_5__05329);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2630:1: rule__Precedence__Group_5__0__Impl : ( ( rule__Precedence__RuletypAssignment_5_0 ) ) ;
    public final void rule__Precedence__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2634:1: ( ( ( rule__Precedence__RuletypAssignment_5_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2635:1: ( ( rule__Precedence__RuletypAssignment_5_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2635:1: ( ( rule__Precedence__RuletypAssignment_5_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2636:1: ( rule__Precedence__RuletypAssignment_5_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_5_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2637:1: ( rule__Precedence__RuletypAssignment_5_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2637:2: rule__Precedence__RuletypAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_5_0_in_rule__Precedence__Group_5__0__Impl5356);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2647:1: rule__Precedence__Group_5__1 : rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2 ;
    public final void rule__Precedence__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2651:1: ( rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2652:2: rule__Precedence__Group_5__1__Impl rule__Precedence__Group_5__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__1__Impl_in_rule__Precedence__Group_5__15386);
            rule__Precedence__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_5__2_in_rule__Precedence__Group_5__15389);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2659:1: rule__Precedence__Group_5__1__Impl : ( ( rule__Precedence__RuleAssignment_5_1 ) ) ;
    public final void rule__Precedence__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2663:1: ( ( ( rule__Precedence__RuleAssignment_5_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2664:1: ( ( rule__Precedence__RuleAssignment_5_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2664:1: ( ( rule__Precedence__RuleAssignment_5_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2665:1: ( rule__Precedence__RuleAssignment_5_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_5_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2666:1: ( rule__Precedence__RuleAssignment_5_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2666:2: rule__Precedence__RuleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_5_1_in_rule__Precedence__Group_5__1__Impl5416);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2676:1: rule__Precedence__Group_5__2 : rule__Precedence__Group_5__2__Impl ;
    public final void rule__Precedence__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2680:1: ( rule__Precedence__Group_5__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2681:2: rule__Precedence__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_5__2__Impl_in_rule__Precedence__Group_5__25446);
            rule__Precedence__Group_5__2__Impl();

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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2687:1: rule__Precedence__Group_5__2__Impl : ( ( rule__Precedence__LiteralAssignment_5_2 ) ) ;
    public final void rule__Precedence__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2691:1: ( ( ( rule__Precedence__LiteralAssignment_5_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2692:1: ( ( rule__Precedence__LiteralAssignment_5_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2692:1: ( ( rule__Precedence__LiteralAssignment_5_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2693:1: ( rule__Precedence__LiteralAssignment_5_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getLiteralAssignment_5_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2694:1: ( rule__Precedence__LiteralAssignment_5_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2694:2: rule__Precedence__LiteralAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Precedence__LiteralAssignment_5_2_in_rule__Precedence__Group_5__2__Impl5473);
            rule__Precedence__LiteralAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getLiteralAssignment_5_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Precedence__Group_6__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2710:1: rule__Precedence__Group_6__0 : rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1 ;
    public final void rule__Precedence__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2714:1: ( rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2715:2: rule__Precedence__Group_6__0__Impl rule__Precedence__Group_6__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__0__Impl_in_rule__Precedence__Group_6__05509);
            rule__Precedence__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_6__1_in_rule__Precedence__Group_6__05512);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2722:1: rule__Precedence__Group_6__0__Impl : ( ( rule__Precedence__RuletypAssignment_6_0 ) ) ;
    public final void rule__Precedence__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2726:1: ( ( ( rule__Precedence__RuletypAssignment_6_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2727:1: ( ( rule__Precedence__RuletypAssignment_6_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2727:1: ( ( rule__Precedence__RuletypAssignment_6_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2728:1: ( rule__Precedence__RuletypAssignment_6_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_6_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2729:1: ( rule__Precedence__RuletypAssignment_6_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2729:2: rule__Precedence__RuletypAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_6_0_in_rule__Precedence__Group_6__0__Impl5539);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2739:1: rule__Precedence__Group_6__1 : rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2 ;
    public final void rule__Precedence__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2743:1: ( rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2744:2: rule__Precedence__Group_6__1__Impl rule__Precedence__Group_6__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__1__Impl_in_rule__Precedence__Group_6__15569);
            rule__Precedence__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_6__2_in_rule__Precedence__Group_6__15572);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2751:1: rule__Precedence__Group_6__1__Impl : ( ( rule__Precedence__RuleAssignment_6_1 ) ) ;
    public final void rule__Precedence__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2755:1: ( ( ( rule__Precedence__RuleAssignment_6_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2756:1: ( ( rule__Precedence__RuleAssignment_6_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2756:1: ( ( rule__Precedence__RuleAssignment_6_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2757:1: ( rule__Precedence__RuleAssignment_6_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_6_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2758:1: ( rule__Precedence__RuleAssignment_6_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2758:2: rule__Precedence__RuleAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_6_1_in_rule__Precedence__Group_6__1__Impl5599);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2768:1: rule__Precedence__Group_6__2 : rule__Precedence__Group_6__2__Impl ;
    public final void rule__Precedence__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2772:1: ( rule__Precedence__Group_6__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2773:2: rule__Precedence__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_6__2__Impl_in_rule__Precedence__Group_6__25629);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2779:1: rule__Precedence__Group_6__2__Impl : ( ( rule__Precedence__BracketAssignment_6_2 ) ) ;
    public final void rule__Precedence__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2783:1: ( ( ( rule__Precedence__BracketAssignment_6_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2784:1: ( ( rule__Precedence__BracketAssignment_6_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2784:1: ( ( rule__Precedence__BracketAssignment_6_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2785:1: ( rule__Precedence__BracketAssignment_6_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getBracketAssignment_6_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2786:1: ( rule__Precedence__BracketAssignment_6_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2786:2: rule__Precedence__BracketAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Precedence__BracketAssignment_6_2_in_rule__Precedence__Group_6__2__Impl5656);
            rule__Precedence__BracketAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getBracketAssignment_6_2()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2802:1: rule__Precedence__Group_7__0 : rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1 ;
    public final void rule__Precedence__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2806:1: ( rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2807:2: rule__Precedence__Group_7__0__Impl rule__Precedence__Group_7__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__0__Impl_in_rule__Precedence__Group_7__05692);
            rule__Precedence__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_7__1_in_rule__Precedence__Group_7__05695);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2814:1: rule__Precedence__Group_7__0__Impl : ( ( rule__Precedence__RuletypAssignment_7_0 ) ) ;
    public final void rule__Precedence__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2818:1: ( ( ( rule__Precedence__RuletypAssignment_7_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2819:1: ( ( rule__Precedence__RuletypAssignment_7_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2819:1: ( ( rule__Precedence__RuletypAssignment_7_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2820:1: ( rule__Precedence__RuletypAssignment_7_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_7_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2821:1: ( rule__Precedence__RuletypAssignment_7_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2821:2: rule__Precedence__RuletypAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_7_0_in_rule__Precedence__Group_7__0__Impl5722);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2831:1: rule__Precedence__Group_7__1 : rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2 ;
    public final void rule__Precedence__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2835:1: ( rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2836:2: rule__Precedence__Group_7__1__Impl rule__Precedence__Group_7__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__1__Impl_in_rule__Precedence__Group_7__15752);
            rule__Precedence__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_7__2_in_rule__Precedence__Group_7__15755);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2843:1: rule__Precedence__Group_7__1__Impl : ( ( rule__Precedence__RuleAssignment_7_1 ) ) ;
    public final void rule__Precedence__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2847:1: ( ( ( rule__Precedence__RuleAssignment_7_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2848:1: ( ( rule__Precedence__RuleAssignment_7_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2848:1: ( ( rule__Precedence__RuleAssignment_7_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2849:1: ( rule__Precedence__RuleAssignment_7_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_7_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2850:1: ( rule__Precedence__RuleAssignment_7_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2850:2: rule__Precedence__RuleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_7_1_in_rule__Precedence__Group_7__1__Impl5782);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2860:1: rule__Precedence__Group_7__2 : rule__Precedence__Group_7__2__Impl ;
    public final void rule__Precedence__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2864:1: ( rule__Precedence__Group_7__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2865:2: rule__Precedence__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_7__2__Impl_in_rule__Precedence__Group_7__25812);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2871:1: rule__Precedence__Group_7__2__Impl : ( ( rule__Precedence__BracesAssignment_7_2 ) ) ;
    public final void rule__Precedence__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2875:1: ( ( ( rule__Precedence__BracesAssignment_7_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2876:1: ( ( rule__Precedence__BracesAssignment_7_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2876:1: ( ( rule__Precedence__BracesAssignment_7_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2877:1: ( rule__Precedence__BracesAssignment_7_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getBracesAssignment_7_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2878:1: ( rule__Precedence__BracesAssignment_7_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2878:2: rule__Precedence__BracesAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Precedence__BracesAssignment_7_2_in_rule__Precedence__Group_7__2__Impl5839);
            rule__Precedence__BracesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getBracesAssignment_7_2()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2894:1: rule__Precedence__Group_8__0 : rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1 ;
    public final void rule__Precedence__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2898:1: ( rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2899:2: rule__Precedence__Group_8__0__Impl rule__Precedence__Group_8__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__0__Impl_in_rule__Precedence__Group_8__05875);
            rule__Precedence__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_8__1_in_rule__Precedence__Group_8__05878);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2906:1: rule__Precedence__Group_8__0__Impl : ( ( rule__Precedence__RuletypAssignment_8_0 ) ) ;
    public final void rule__Precedence__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2910:1: ( ( ( rule__Precedence__RuletypAssignment_8_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2911:1: ( ( rule__Precedence__RuletypAssignment_8_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2911:1: ( ( rule__Precedence__RuletypAssignment_8_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2912:1: ( rule__Precedence__RuletypAssignment_8_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypAssignment_8_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2913:1: ( rule__Precedence__RuletypAssignment_8_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2913:2: rule__Precedence__RuletypAssignment_8_0
            {
            pushFollow(FOLLOW_rule__Precedence__RuletypAssignment_8_0_in_rule__Precedence__Group_8__0__Impl5905);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2923:1: rule__Precedence__Group_8__1 : rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2 ;
    public final void rule__Precedence__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2927:1: ( rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2928:2: rule__Precedence__Group_8__1__Impl rule__Precedence__Group_8__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__1__Impl_in_rule__Precedence__Group_8__15935);
            rule__Precedence__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group_8__2_in_rule__Precedence__Group_8__15938);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2935:1: rule__Precedence__Group_8__1__Impl : ( ( rule__Precedence__RuleAssignment_8_1 ) ) ;
    public final void rule__Precedence__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2939:1: ( ( ( rule__Precedence__RuleAssignment_8_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2940:1: ( ( rule__Precedence__RuleAssignment_8_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2940:1: ( ( rule__Precedence__RuleAssignment_8_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2941:1: ( rule__Precedence__RuleAssignment_8_1 )
            {
             before(grammarAccess.getPrecedenceAccess().getRuleAssignment_8_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2942:1: ( rule__Precedence__RuleAssignment_8_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2942:2: rule__Precedence__RuleAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Precedence__RuleAssignment_8_1_in_rule__Precedence__Group_8__1__Impl5965);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2952:1: rule__Precedence__Group_8__2 : rule__Precedence__Group_8__2__Impl ;
    public final void rule__Precedence__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2956:1: ( rule__Precedence__Group_8__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2957:2: rule__Precedence__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group_8__2__Impl_in_rule__Precedence__Group_8__25995);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2963:1: rule__Precedence__Group_8__2__Impl : ( ( rule__Precedence__ParenthesisAssignment_8_2 ) ) ;
    public final void rule__Precedence__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2967:1: ( ( ( rule__Precedence__ParenthesisAssignment_8_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2968:1: ( ( rule__Precedence__ParenthesisAssignment_8_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2968:1: ( ( rule__Precedence__ParenthesisAssignment_8_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2969:1: ( rule__Precedence__ParenthesisAssignment_8_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getParenthesisAssignment_8_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2970:1: ( rule__Precedence__ParenthesisAssignment_8_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2970:2: rule__Precedence__ParenthesisAssignment_8_2
            {
            pushFollow(FOLLOW_rule__Precedence__ParenthesisAssignment_8_2_in_rule__Precedence__Group_8__2__Impl6022);
            rule__Precedence__ParenthesisAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getParenthesisAssignment_8_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__MultID__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2986:1: rule__MultID__Group__0 : rule__MultID__Group__0__Impl rule__MultID__Group__1 ;
    public final void rule__MultID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2990:1: ( rule__MultID__Group__0__Impl rule__MultID__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2991:2: rule__MultID__Group__0__Impl rule__MultID__Group__1
            {
            pushFollow(FOLLOW_rule__MultID__Group__0__Impl_in_rule__MultID__Group__06058);
            rule__MultID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group__1_in_rule__MultID__Group__06061);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2998:1: rule__MultID__Group__0__Impl : ( () ) ;
    public final void rule__MultID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3002:1: ( ( () ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3003:1: ( () )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3003:1: ( () )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3004:1: ()
            {
             before(grammarAccess.getMultIDAccess().getMultIDAction_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3005:1: ()
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3007:1: 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3017:1: rule__MultID__Group__1 : rule__MultID__Group__1__Impl ;
    public final void rule__MultID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3021:1: ( rule__MultID__Group__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3022:2: rule__MultID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group__1__Impl_in_rule__MultID__Group__16119);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3028:1: rule__MultID__Group__1__Impl : ( ( rule__MultID__Alternatives_1 ) ) ;
    public final void rule__MultID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3032:1: ( ( ( rule__MultID__Alternatives_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3033:1: ( ( rule__MultID__Alternatives_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3033:1: ( ( rule__MultID__Alternatives_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3034:1: ( rule__MultID__Alternatives_1 )
            {
             before(grammarAccess.getMultIDAccess().getAlternatives_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3035:1: ( rule__MultID__Alternatives_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3035:2: rule__MultID__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MultID__Alternatives_1_in_rule__MultID__Group__1__Impl6146);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3049:1: rule__MultID__Group_1_1__0 : rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1 ;
    public final void rule__MultID__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3053:1: ( rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3054:2: rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__0__Impl_in_rule__MultID__Group_1_1__06180);
            rule__MultID__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1_1__1_in_rule__MultID__Group_1_1__06183);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3061:1: rule__MultID__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__MultID__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3065:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3066:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3066:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3067:1: '['
            {
             before(grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,38,FOLLOW_38_in_rule__MultID__Group_1_1__0__Impl6211); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3080:1: rule__MultID__Group_1_1__1 : rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2 ;
    public final void rule__MultID__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3084:1: ( rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3085:2: rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__1__Impl_in_rule__MultID__Group_1_1__16242);
            rule__MultID__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1_1__2_in_rule__MultID__Group_1_1__16245);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3092:1: rule__MultID__Group_1_1__1__Impl : ( ( rule__MultID__MiAssignment_1_1_1 )* ) ;
    public final void rule__MultID__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3096:1: ( ( ( rule__MultID__MiAssignment_1_1_1 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3097:1: ( ( rule__MultID__MiAssignment_1_1_1 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3097:1: ( ( rule__MultID__MiAssignment_1_1_1 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3098:1: ( rule__MultID__MiAssignment_1_1_1 )*
            {
             before(grammarAccess.getMultIDAccess().getMiAssignment_1_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3099:1: ( rule__MultID__MiAssignment_1_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3099:2: rule__MultID__MiAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MultID__MiAssignment_1_1_1_in_rule__MultID__Group_1_1__1__Impl6272);
            	    rule__MultID__MiAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3109:1: rule__MultID__Group_1_1__2 : rule__MultID__Group_1_1__2__Impl ;
    public final void rule__MultID__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3113:1: ( rule__MultID__Group_1_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3114:2: rule__MultID__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__2__Impl_in_rule__MultID__Group_1_1__26303);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3120:1: rule__MultID__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__MultID__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3124:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3125:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3125:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3126:1: ']'
            {
             before(grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,39,FOLLOW_39_in_rule__MultID__Group_1_1__2__Impl6331); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3145:1: rule__MultString__Group__0 : rule__MultString__Group__0__Impl rule__MultString__Group__1 ;
    public final void rule__MultString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3149:1: ( rule__MultString__Group__0__Impl rule__MultString__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3150:2: rule__MultString__Group__0__Impl rule__MultString__Group__1
            {
            pushFollow(FOLLOW_rule__MultString__Group__0__Impl_in_rule__MultString__Group__06368);
            rule__MultString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group__1_in_rule__MultString__Group__06371);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3157:1: rule__MultString__Group__0__Impl : ( () ) ;
    public final void rule__MultString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3161:1: ( ( () ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3162:1: ( () )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3162:1: ( () )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3163:1: ()
            {
             before(grammarAccess.getMultStringAccess().getMultStringAction_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3164:1: ()
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3166:1: 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3176:1: rule__MultString__Group__1 : rule__MultString__Group__1__Impl ;
    public final void rule__MultString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3180:1: ( rule__MultString__Group__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3181:2: rule__MultString__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group__1__Impl_in_rule__MultString__Group__16429);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3187:1: rule__MultString__Group__1__Impl : ( ( rule__MultString__Alternatives_1 ) ) ;
    public final void rule__MultString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3191:1: ( ( ( rule__MultString__Alternatives_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3192:1: ( ( rule__MultString__Alternatives_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3192:1: ( ( rule__MultString__Alternatives_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3193:1: ( rule__MultString__Alternatives_1 )
            {
             before(grammarAccess.getMultStringAccess().getAlternatives_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3194:1: ( rule__MultString__Alternatives_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3194:2: rule__MultString__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MultString__Alternatives_1_in_rule__MultString__Group__1__Impl6456);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3208:1: rule__MultString__Group_1_1__0 : rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1 ;
    public final void rule__MultString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3212:1: ( rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3213:2: rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__0__Impl_in_rule__MultString__Group_1_1__06490);
            rule__MultString__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1_1__1_in_rule__MultString__Group_1_1__06493);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3220:1: rule__MultString__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__MultString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3224:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3225:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3225:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3226:1: '['
            {
             before(grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,38,FOLLOW_38_in_rule__MultString__Group_1_1__0__Impl6521); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3239:1: rule__MultString__Group_1_1__1 : rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2 ;
    public final void rule__MultString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3243:1: ( rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3244:2: rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__1__Impl_in_rule__MultString__Group_1_1__16552);
            rule__MultString__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1_1__2_in_rule__MultString__Group_1_1__16555);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3251:1: rule__MultString__Group_1_1__1__Impl : ( ( rule__MultString__MsAssignment_1_1_1 )* ) ;
    public final void rule__MultString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3255:1: ( ( ( rule__MultString__MsAssignment_1_1_1 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3256:1: ( ( rule__MultString__MsAssignment_1_1_1 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3256:1: ( ( rule__MultString__MsAssignment_1_1_1 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3257:1: ( rule__MultString__MsAssignment_1_1_1 )*
            {
             before(grammarAccess.getMultStringAccess().getMsAssignment_1_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3258:1: ( rule__MultString__MsAssignment_1_1_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3258:2: rule__MultString__MsAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MultString__MsAssignment_1_1_1_in_rule__MultString__Group_1_1__1__Impl6582);
            	    rule__MultString__MsAssignment_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3268:1: rule__MultString__Group_1_1__2 : rule__MultString__Group_1_1__2__Impl ;
    public final void rule__MultString__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3272:1: ( rule__MultString__Group_1_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3273:2: rule__MultString__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__2__Impl_in_rule__MultString__Group_1_1__26613);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3279:1: rule__MultString__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__MultString__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3283:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3284:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3284:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3285:1: ']'
            {
             before(grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,39,FOLLOW_39_in_rule__MultString__Group_1_1__2__Impl6641); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3305:1: rule__Model__ClasAssignment_0 : ( ruleClassType ) ;
    public final void rule__Model__ClasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3309:1: ( ( ruleClassType ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3310:1: ( ruleClassType )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3310:1: ( ruleClassType )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3311:1: ruleClassType
            {
             before(grammarAccess.getModelAccess().getClasClassTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_06683);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3320:1: rule__Model__ProcAssignment_1 : ( ruleProcedure ) ;
    public final void rule__Model__ProcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3324:1: ( ( ruleProcedure ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3325:1: ( ruleProcedure )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3325:1: ( ruleProcedure )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3326:1: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getProcProcedureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_16714);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3335:1: rule__Model__StatemAssignment_2 : ( ruleStatement ) ;
    public final void rule__Model__StatemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3339:1: ( ( ruleStatement ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3340:1: ( ruleStatement )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3340:1: ( ruleStatement )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3341:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatemStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_26745);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3350:1: rule__Model__ExpAssignment_3 : ( ruleExpression ) ;
    public final void rule__Model__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3354:1: ( ( ruleExpression ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3355:1: ( ruleExpression )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3355:1: ( ruleExpression )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3356:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_36776);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3365:1: rule__ClassType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3369:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3370:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3370:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3371:1: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_16807); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3380:1: rule__ClassType__NoclassAssignment_2_0 : ( ( 'noclass' ) ) ;
    public final void rule__ClassType__NoclassAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3384:1: ( ( ( 'noclass' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3385:1: ( ( 'noclass' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3385:1: ( ( 'noclass' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3386:1: ( 'noclass' )
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3387:1: ( 'noclass' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3388:1: 'noclass'
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0()); 
            match(input,40,FOLLOW_40_in_rule__ClassType__NoclassAssignment_2_06843); 
             after(grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0()); 

            }

             after(grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3403:1: rule__ClassType__PrefixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__ClassType__PrefixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3407:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3408:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3408:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3409:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getPrefixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_16882);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3418:1: rule__ClassType__SuffixAssignment_2_2_1 : ( ruleMultID ) ;
    public final void rule__ClassType__SuffixAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3422:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3423:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3423:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3424:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getSuffixMultIDParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_16913);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3433:1: rule__ClassType__BlockingAssignment_2_3_1 : ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) ;
    public final void rule__ClassType__BlockingAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3437:1: ( ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3438:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3438:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3439:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAlternatives_2_3_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3440:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3440:2: rule__ClassType__BlockingAlternatives_2_3_1_0
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_16944);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3449:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3453:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3454:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3454:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3455:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_16977); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3464:1: rule__Procedure__PrefixAssignment_2_0_1 : ( ruleMultID ) ;
    public final void rule__Procedure__PrefixAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3468:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3469:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3469:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3470:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getPrefixMultIDParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_17008);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3479:1: rule__Procedure__SuffixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__Procedure__SuffixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3483:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3484:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3484:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3485:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getSuffixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_17039);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3494:1: rule__Procedure__TypesAssignment_2_2_1 : ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) ;
    public final void rule__Procedure__TypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3498:1: ( ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3499:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3499:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3500:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAlternatives_2_2_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3501:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3501:2: rule__Procedure__TypesAlternatives_2_2_1_0
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_17070);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3510:1: rule__Statement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3514:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3515:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3515:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3516:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_17103); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3525:1: rule__Statement__RepAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__Statement__RepAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3529:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3530:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3530:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3531:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getRepIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_17134); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3540:1: rule__Statement__UntilAssignment_2_0_3 : ( RULE_ID ) ;
    public final void rule__Statement__UntilAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3544:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3545:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3545:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3546:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getUntilIDTerminalRuleCall_2_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_37165); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3555:1: rule__Statement__WhileAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Statement__WhileAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3559:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3560:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3560:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3561:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getWhileIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_17196); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3570:1: rule__Statement__DoAssignment_2_1_3 : ( RULE_ID ) ;
    public final void rule__Statement__DoAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3574:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3575:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3575:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3576:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getDoIDTerminalRuleCall_2_1_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_37227); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3585:1: rule__Statement__ForAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ForAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3589:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3590:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3590:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3591:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getForIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_17258); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3600:1: rule__Statement__VarAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__Statement__VarAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3604:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3605:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3605:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3606:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVarIDTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_17289); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3615:1: rule__Statement__ExAssignment_2_3_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3619:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3620:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3620:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3621:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_17320); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3630:1: rule__Statement__ValAssignment_2_4_1 : ( RULE_ID ) ;
    public final void rule__Statement__ValAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3634:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3635:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3635:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3636:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getValIDTerminalRuleCall_2_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_17351); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3645:1: rule__Statement__ExAssignment_2_4_3 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3649:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3650:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3650:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3651:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_4_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_37382); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3660:1: rule__Expression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3664:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3665:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3665:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3666:1: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_17413); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3675:1: rule__Expression__PrecAssignment_2 : ( rulePrecedence ) ;
    public final void rule__Expression__PrecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3679:1: ( ( rulePrecedence ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3680:1: ( rulePrecedence )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3680:1: ( rulePrecedence )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3681:1: rulePrecedence
            {
             before(grammarAccess.getExpressionAccess().getPrecPrecedenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrecedence_in_rule__Expression__PrecAssignment_27444);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3690:1: rule__Precedence__RuletypAssignment_0_0 : ( ( 'caller' ) ) ;
    public final void rule__Precedence__RuletypAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3694:1: ( ( ( 'caller' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3695:1: ( ( 'caller' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3695:1: ( ( 'caller' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3696:1: ( 'caller' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypCallerKeyword_0_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3697:1: ( 'caller' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3698:1: 'caller'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypCallerKeyword_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__Precedence__RuletypAssignment_0_07480); 
             after(grammarAccess.getPrecedenceAccess().getRuletypCallerKeyword_0_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypCallerKeyword_0_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3713:1: rule__Precedence__RuleAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3717:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3718:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3718:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3719:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_0_17519); 
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


    // $ANTLR start "rule__Precedence__RuletypAssignment_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3728:1: rule__Precedence__RuletypAssignment_1_0 : ( ( 'prefix' ) ) ;
    public final void rule__Precedence__RuletypAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3732:1: ( ( ( 'prefix' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3733:1: ( ( 'prefix' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3733:1: ( ( 'prefix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3734:1: ( 'prefix' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPrefixKeyword_1_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3735:1: ( 'prefix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3736:1: 'prefix'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypPrefixKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Precedence__RuletypAssignment_1_07555); 
             after(grammarAccess.getPrecedenceAccess().getRuletypPrefixKeyword_1_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypPrefixKeyword_1_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3751:1: rule__Precedence__RuleAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3755:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3756:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3756:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3757:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_1_17594); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3766:1: rule__Precedence__PrefixAssignment_1_2 : ( ruleMultString ) ;
    public final void rule__Precedence__PrefixAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3770:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3771:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3771:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3772:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getPrefixMultStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__PrefixAssignment_1_27625);
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


    // $ANTLR start "rule__Precedence__Par1Assignment_1_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3781:1: rule__Precedence__Par1Assignment_1_3 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3785:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3786:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3786:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3787:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_1_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_1_37656); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_1_3"


    // $ANTLR start "rule__Precedence__RuletypAssignment_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3796:1: rule__Precedence__RuletypAssignment_2_0 : ( ( 'suffix' ) ) ;
    public final void rule__Precedence__RuletypAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3800:1: ( ( ( 'suffix' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3801:1: ( ( 'suffix' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3801:1: ( ( 'suffix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3802:1: ( 'suffix' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypSuffixKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3803:1: ( 'suffix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3804:1: 'suffix'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypSuffixKeyword_2_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Precedence__RuletypAssignment_2_07692); 
             after(grammarAccess.getPrecedenceAccess().getRuletypSuffixKeyword_2_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypSuffixKeyword_2_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3819:1: rule__Precedence__RuleAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3823:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3824:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3824:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3825:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_2_17731); 
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


    // $ANTLR start "rule__Precedence__Par1Assignment_2_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3834:1: rule__Precedence__Par1Assignment_2_2 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3838:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3839:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3839:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3840:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_2_27762); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_2_2"


    // $ANTLR start "rule__Precedence__SuffixAssignment_2_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3849:1: rule__Precedence__SuffixAssignment_2_3 : ( ruleMultString ) ;
    public final void rule__Precedence__SuffixAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3853:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3854:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3854:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3855:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__SuffixAssignment_2_37793);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getSuffixMultStringParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__SuffixAssignment_2_3"


    // $ANTLR start "rule__Precedence__RuletypAssignment_3_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3864:1: rule__Precedence__RuletypAssignment_3_0 : ( ( 'infix' ) ) ;
    public final void rule__Precedence__RuletypAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3868:1: ( ( ( 'infix' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3869:1: ( ( 'infix' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3869:1: ( ( 'infix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3870:1: ( 'infix' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypInfixKeyword_3_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3871:1: ( 'infix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3872:1: 'infix'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypInfixKeyword_3_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Precedence__RuletypAssignment_3_07829); 
             after(grammarAccess.getPrecedenceAccess().getRuletypInfixKeyword_3_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypInfixKeyword_3_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3887:1: rule__Precedence__RuleAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3891:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3892:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3892:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3893:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_3_17868); 
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


    // $ANTLR start "rule__Precedence__Par1Assignment_3_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3902:1: rule__Precedence__Par1Assignment_3_2 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3906:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3907:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3907:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3908:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_3_27899); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_3_2"


    // $ANTLR start "rule__Precedence__InfixAssignment_3_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3917:1: rule__Precedence__InfixAssignment_3_3 : ( ruleMultString ) ;
    public final void rule__Precedence__InfixAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3921:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3922:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3922:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3923:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__InfixAssignment_3_37930);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getInfixMultStringParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__InfixAssignment_3_3"


    // $ANTLR start "rule__Precedence__Par2Assignment_3_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3932:1: rule__Precedence__Par2Assignment_3_4 : ( RULE_ID ) ;
    public final void rule__Precedence__Par2Assignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3936:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3937:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3937:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3938:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_3_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_3_47961); 
             after(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par2Assignment_3_4"


    // $ANTLR start "rule__Precedence__RuletypAssignment_4_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3947:1: rule__Precedence__RuletypAssignment_4_0 : ( ( 'infixleft' ) ) ;
    public final void rule__Precedence__RuletypAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3951:1: ( ( ( 'infixleft' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3952:1: ( ( 'infixleft' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3952:1: ( ( 'infixleft' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3953:1: ( 'infixleft' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypInfixleftKeyword_4_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3954:1: ( 'infixleft' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3955:1: 'infixleft'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypInfixleftKeyword_4_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Precedence__RuletypAssignment_4_07997); 
             after(grammarAccess.getPrecedenceAccess().getRuletypInfixleftKeyword_4_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypInfixleftKeyword_4_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3970:1: rule__Precedence__RuleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3974:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3975:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3975:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3976:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_4_18036); 
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


    // $ANTLR start "rule__Precedence__Par1Assignment_4_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3985:1: rule__Precedence__Par1Assignment_4_2 : ( RULE_ID ) ;
    public final void rule__Precedence__Par1Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3989:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3990:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3990:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3991:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_4_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_4_28067); 
             after(grammarAccess.getPrecedenceAccess().getPar1IDTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par1Assignment_4_2"


    // $ANTLR start "rule__Precedence__InfixleftAssignment_4_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4000:1: rule__Precedence__InfixleftAssignment_4_3 : ( ruleMultString ) ;
    public final void rule__Precedence__InfixleftAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4004:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4005:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4005:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4006:1: ruleMultString
            {
             before(grammarAccess.getPrecedenceAccess().getInfixleftMultStringParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precedence__InfixleftAssignment_4_38098);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecedenceAccess().getInfixleftMultStringParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__InfixleftAssignment_4_3"


    // $ANTLR start "rule__Precedence__Par2Assignment_4_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4015:1: rule__Precedence__Par2Assignment_4_4 : ( RULE_ID ) ;
    public final void rule__Precedence__Par2Assignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4019:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4020:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4020:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4021:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_4_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_4_48129); 
             after(grammarAccess.getPrecedenceAccess().getPar2IDTerminalRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__Par2Assignment_4_4"


    // $ANTLR start "rule__Precedence__RuletypAssignment_5_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4030:1: rule__Precedence__RuletypAssignment_5_0 : ( ( 'literal' ) ) ;
    public final void rule__Precedence__RuletypAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4034:1: ( ( ( 'literal' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4035:1: ( ( 'literal' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4035:1: ( ( 'literal' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4036:1: ( 'literal' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypLiteralKeyword_5_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4037:1: ( 'literal' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4038:1: 'literal'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypLiteralKeyword_5_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Precedence__RuletypAssignment_5_08165); 
             after(grammarAccess.getPrecedenceAccess().getRuletypLiteralKeyword_5_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypLiteralKeyword_5_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4053:1: rule__Precedence__RuleAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4057:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4058:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4058:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4059:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_5_18204); 
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


    // $ANTLR start "rule__Precedence__LiteralAssignment_5_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4068:1: rule__Precedence__LiteralAssignment_5_2 : ( ( rule__Precedence__LiteralAlternatives_5_2_0 ) ) ;
    public final void rule__Precedence__LiteralAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4072:1: ( ( ( rule__Precedence__LiteralAlternatives_5_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4073:1: ( ( rule__Precedence__LiteralAlternatives_5_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4073:1: ( ( rule__Precedence__LiteralAlternatives_5_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4074:1: ( rule__Precedence__LiteralAlternatives_5_2_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getLiteralAlternatives_5_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4075:1: ( rule__Precedence__LiteralAlternatives_5_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4075:2: rule__Precedence__LiteralAlternatives_5_2_0
            {
            pushFollow(FOLLOW_rule__Precedence__LiteralAlternatives_5_2_0_in_rule__Precedence__LiteralAssignment_5_28235);
            rule__Precedence__LiteralAlternatives_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getLiteralAlternatives_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__LiteralAssignment_5_2"


    // $ANTLR start "rule__Precedence__RuletypAssignment_6_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4084:1: rule__Precedence__RuletypAssignment_6_0 : ( ( 'bracket' ) ) ;
    public final void rule__Precedence__RuletypAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4088:1: ( ( ( 'bracket' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4089:1: ( ( 'bracket' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4089:1: ( ( 'bracket' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4090:1: ( 'bracket' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBracketKeyword_6_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4091:1: ( 'bracket' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4092:1: 'bracket'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBracketKeyword_6_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Precedence__RuletypAssignment_6_08273); 
             after(grammarAccess.getPrecedenceAccess().getRuletypBracketKeyword_6_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypBracketKeyword_6_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4107:1: rule__Precedence__RuleAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4111:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4112:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4112:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4113:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_6_18312); 
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


    // $ANTLR start "rule__Precedence__BracketAssignment_6_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4122:1: rule__Precedence__BracketAssignment_6_2 : ( RULE_ID ) ;
    public final void rule__Precedence__BracketAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4126:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4127:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4127:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4128:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_6_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__BracketAssignment_6_28343); 
             after(grammarAccess.getPrecedenceAccess().getBracketIDTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__BracketAssignment_6_2"


    // $ANTLR start "rule__Precedence__RuletypAssignment_7_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4137:1: rule__Precedence__RuletypAssignment_7_0 : ( ( 'braces' ) ) ;
    public final void rule__Precedence__RuletypAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4141:1: ( ( ( 'braces' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4142:1: ( ( 'braces' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4142:1: ( ( 'braces' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4143:1: ( 'braces' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBracesKeyword_7_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4144:1: ( 'braces' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4145:1: 'braces'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypBracesKeyword_7_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Precedence__RuletypAssignment_7_08379); 
             after(grammarAccess.getPrecedenceAccess().getRuletypBracesKeyword_7_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypBracesKeyword_7_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4160:1: rule__Precedence__RuleAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4164:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4165:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4165:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4166:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_7_18418); 
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


    // $ANTLR start "rule__Precedence__BracesAssignment_7_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4175:1: rule__Precedence__BracesAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__Precedence__BracesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4179:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4180:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4180:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4181:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_7_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__BracesAssignment_7_28449); 
             after(grammarAccess.getPrecedenceAccess().getBracesIDTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__BracesAssignment_7_2"


    // $ANTLR start "rule__Precedence__RuletypAssignment_8_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4190:1: rule__Precedence__RuletypAssignment_8_0 : ( ( 'parenthesis' ) ) ;
    public final void rule__Precedence__RuletypAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4194:1: ( ( ( 'parenthesis' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4195:1: ( ( 'parenthesis' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4195:1: ( ( 'parenthesis' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4196:1: ( 'parenthesis' )
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypParenthesisKeyword_8_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4197:1: ( 'parenthesis' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4198:1: 'parenthesis'
            {
             before(grammarAccess.getPrecedenceAccess().getRuletypParenthesisKeyword_8_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Precedence__RuletypAssignment_8_08485); 
             after(grammarAccess.getPrecedenceAccess().getRuletypParenthesisKeyword_8_0_0()); 

            }

             after(grammarAccess.getPrecedenceAccess().getRuletypParenthesisKeyword_8_0_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4213:1: rule__Precedence__RuleAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__Precedence__RuleAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4217:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4218:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4218:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4219:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getRuleIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_8_18524); 
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


    // $ANTLR start "rule__Precedence__ParenthesisAssignment_8_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4228:1: rule__Precedence__ParenthesisAssignment_8_2 : ( RULE_ID ) ;
    public final void rule__Precedence__ParenthesisAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4232:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4233:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4233:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4234:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_8_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__ParenthesisAssignment_8_28555); 
             after(grammarAccess.getPrecedenceAccess().getParenthesisIDTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precedence__ParenthesisAssignment_8_2"


    // $ANTLR start "rule__MultID__MiAssignment_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4243:1: rule__MultID__MiAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__MultID__MiAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4247:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4248:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4248:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4249:1: RULE_ID
            {
             before(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_08586); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4258:1: rule__MultID__MiAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__MultID__MiAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4262:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4263:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4263:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4264:1: RULE_ID
            {
             before(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_1_18617); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4273:1: rule__MultString__MsAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__MultString__MsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4277:1: ( ( RULE_STRING ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4278:1: ( RULE_STRING )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4278:1: ( RULE_STRING )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4279:1: RULE_STRING
            {
             before(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_08648); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4288:1: rule__MultString__MsAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__MultString__MsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4292:1: ( ( RULE_STRING ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4293:1: ( RULE_STRING )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4293:1: ( RULE_STRING )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4294:1: RULE_STRING
            {
             before(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_1_18679); 
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
    public static final BitSet FOLLOW_18_in_rule__Precedence__LiteralAlternatives_5_2_01247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Precedence__LiteralAlternatives_5_2_01267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Precedence__LiteralAlternatives_5_2_01287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Precedence__LiteralAlternatives_5_2_01307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__MiAssignment_1_0_in_rule__MultID__Alternatives_11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__0_in_rule__MultID__Alternatives_11359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__MsAssignment_1_0_in_rule__MultString__Alternatives_11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__0_in_rule__MultString__Alternatives_11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassType__Group__0__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11503 = new BitSet(new long[]{0x0000010003800000L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1590 = new BitSet(new long[]{0x0000010003800002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01627 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__01750 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__01753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__01873 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__01876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Procedure__Group__0__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12058 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2145 = new BitSet(new long[]{0x0000000009800002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02182 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02305 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02428 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Statement__Group__0__Impl2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12613 = new BitSet(new long[]{0x00000016A0000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__12798 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__12801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__22858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__22861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__32920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__02985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__02988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13047 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13419 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13728 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__23788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__23791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__33850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Expression__Group__0__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13977 = new BitSet(new long[]{0x00007E0001800800L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__13980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4064 = new BitSet(new long[]{0x00007E0001800802L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__0__Impl_in_rule__Precedence__Group_0__04101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__1_in_rule__Precedence__Group_0__04104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_0_0_in_rule__Precedence__Group_0__0__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_0__1__Impl_in_rule__Precedence__Group_0__14161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_0_1_in_rule__Precedence__Group_0__1__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__0__Impl_in_rule__Precedence__Group_1__04222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__1_in_rule__Precedence__Group_1__04225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_1_0_in_rule__Precedence__Group_1__0__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__1__Impl_in_rule__Precedence__Group_1__14282 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__2_in_rule__Precedence__Group_1__14285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_1_1_in_rule__Precedence__Group_1__1__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__2__Impl_in_rule__Precedence__Group_1__24342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__3_in_rule__Precedence__Group_1__24345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__PrefixAssignment_1_2_in_rule__Precedence__Group_1__2__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_1__3__Impl_in_rule__Precedence__Group_1__34402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_1_3_in_rule__Precedence__Group_1__3__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__0__Impl_in_rule__Precedence__Group_2__04467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__1_in_rule__Precedence__Group_2__04470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_2_0_in_rule__Precedence__Group_2__0__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__1__Impl_in_rule__Precedence__Group_2__14527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__2_in_rule__Precedence__Group_2__14530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_2_1_in_rule__Precedence__Group_2__1__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__2__Impl_in_rule__Precedence__Group_2__24587 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__3_in_rule__Precedence__Group_2__24590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_2_2_in_rule__Precedence__Group_2__2__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_2__3__Impl_in_rule__Precedence__Group_2__34647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__SuffixAssignment_2_3_in_rule__Precedence__Group_2__3__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__0__Impl_in_rule__Precedence__Group_3__04712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__1_in_rule__Precedence__Group_3__04715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_3_0_in_rule__Precedence__Group_3__0__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__1__Impl_in_rule__Precedence__Group_3__14772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__2_in_rule__Precedence__Group_3__14775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_3_1_in_rule__Precedence__Group_3__1__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__2__Impl_in_rule__Precedence__Group_3__24832 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__3_in_rule__Precedence__Group_3__24835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_3_2_in_rule__Precedence__Group_3__2__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__3__Impl_in_rule__Precedence__Group_3__34892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__4_in_rule__Precedence__Group_3__34895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InfixAssignment_3_3_in_rule__Precedence__Group_3__3__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_3__4__Impl_in_rule__Precedence__Group_3__44952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par2Assignment_3_4_in_rule__Precedence__Group_3__4__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__0__Impl_in_rule__Precedence__Group_4__05019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__1_in_rule__Precedence__Group_4__05022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_4_0_in_rule__Precedence__Group_4__0__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__1__Impl_in_rule__Precedence__Group_4__15079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__2_in_rule__Precedence__Group_4__15082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_4_1_in_rule__Precedence__Group_4__1__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__2__Impl_in_rule__Precedence__Group_4__25139 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__3_in_rule__Precedence__Group_4__25142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par1Assignment_4_2_in_rule__Precedence__Group_4__2__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__3__Impl_in_rule__Precedence__Group_4__35199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__4_in_rule__Precedence__Group_4__35202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__InfixleftAssignment_4_3_in_rule__Precedence__Group_4__3__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_4__4__Impl_in_rule__Precedence__Group_4__45259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Par2Assignment_4_4_in_rule__Precedence__Group_4__4__Impl5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__0__Impl_in_rule__Precedence__Group_5__05326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__1_in_rule__Precedence__Group_5__05329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_5_0_in_rule__Precedence__Group_5__0__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__1__Impl_in_rule__Precedence__Group_5__15386 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__2_in_rule__Precedence__Group_5__15389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_5_1_in_rule__Precedence__Group_5__1__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_5__2__Impl_in_rule__Precedence__Group_5__25446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__LiteralAssignment_5_2_in_rule__Precedence__Group_5__2__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__0__Impl_in_rule__Precedence__Group_6__05509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__1_in_rule__Precedence__Group_6__05512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_6_0_in_rule__Precedence__Group_6__0__Impl5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__1__Impl_in_rule__Precedence__Group_6__15569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__2_in_rule__Precedence__Group_6__15572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_6_1_in_rule__Precedence__Group_6__1__Impl5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_6__2__Impl_in_rule__Precedence__Group_6__25629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__BracketAssignment_6_2_in_rule__Precedence__Group_6__2__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__0__Impl_in_rule__Precedence__Group_7__05692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__1_in_rule__Precedence__Group_7__05695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_7_0_in_rule__Precedence__Group_7__0__Impl5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__1__Impl_in_rule__Precedence__Group_7__15752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__2_in_rule__Precedence__Group_7__15755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_7_1_in_rule__Precedence__Group_7__1__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_7__2__Impl_in_rule__Precedence__Group_7__25812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__BracesAssignment_7_2_in_rule__Precedence__Group_7__2__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__0__Impl_in_rule__Precedence__Group_8__05875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__1_in_rule__Precedence__Group_8__05878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuletypAssignment_8_0_in_rule__Precedence__Group_8__0__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__1__Impl_in_rule__Precedence__Group_8__15935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__2_in_rule__Precedence__Group_8__15938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__RuleAssignment_8_1_in_rule__Precedence__Group_8__1__Impl5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group_8__2__Impl_in_rule__Precedence__Group_8__25995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__ParenthesisAssignment_8_2_in_rule__Precedence__Group_8__2__Impl6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__0__Impl_in_rule__MultID__Group__06058 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group__1_in_rule__MultID__Group__06061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__1__Impl_in_rule__MultID__Group__16119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Alternatives_1_in_rule__MultID__Group__1__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__0__Impl_in_rule__MultID__Group_1_1__06180 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__1_in_rule__MultID__Group_1_1__06183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MultID__Group_1_1__0__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__1__Impl_in_rule__MultID__Group_1_1__16242 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__2_in_rule__MultID__Group_1_1__16245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__MiAssignment_1_1_1_in_rule__MultID__Group_1_1__1__Impl6272 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__2__Impl_in_rule__MultID__Group_1_1__26303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MultID__Group_1_1__2__Impl6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__0__Impl_in_rule__MultString__Group__06368 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group__1_in_rule__MultString__Group__06371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__1__Impl_in_rule__MultString__Group__16429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Alternatives_1_in_rule__MultString__Group__1__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__0__Impl_in_rule__MultString__Group_1_1__06490 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__1_in_rule__MultString__Group_1_1__06493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MultString__Group_1_1__0__Impl6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__1__Impl_in_rule__MultString__Group_1_1__16552 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__2_in_rule__MultString__Group_1_1__16555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__MsAssignment_1_1_1_in_rule__MultString__Group_1_1__1__Impl6582 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__2__Impl_in_rule__MultString__Group_1_1__26613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__MultString__Group_1_1__2__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_06683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_16714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_26745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_36776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_16807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ClassType__NoclassAssignment_2_06843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_16882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_16913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_16944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_16977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_17008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_17039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_17070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_17103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_17134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_37165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_17196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_37227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_17258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_17289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_17320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_17351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_37382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_17413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_rule__Expression__PrecAssignment_27444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Precedence__RuletypAssignment_0_07480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_0_17519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Precedence__RuletypAssignment_1_07555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_1_17594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__PrefixAssignment_1_27625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_1_37656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Precedence__RuletypAssignment_2_07692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_2_17731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_2_27762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__SuffixAssignment_2_37793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Precedence__RuletypAssignment_3_07829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_3_17868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_3_27899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__InfixAssignment_3_37930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_3_47961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Precedence__RuletypAssignment_4_07997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_4_18036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par1Assignment_4_28067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precedence__InfixleftAssignment_4_38098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__Par2Assignment_4_48129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Precedence__RuletypAssignment_5_08165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_5_18204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__LiteralAlternatives_5_2_0_in_rule__Precedence__LiteralAssignment_5_28235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Precedence__RuletypAssignment_6_08273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_6_18312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__BracketAssignment_6_28343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Precedence__RuletypAssignment_7_08379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_7_18418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__BracesAssignment_7_28449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Precedence__RuletypAssignment_8_08485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__RuleAssignment_8_18524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__ParenthesisAssignment_8_28555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_08586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_1_18617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_08648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_1_18679 = new BitSet(new long[]{0x0000000000000002L});

}