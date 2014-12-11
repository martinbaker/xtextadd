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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'braces'", "'indent'", "'colonSeperated'", "'spaceSeperated'", "'inHeader'", "'inferred'", "'untyped'", "'int'", "'string'", "'bool'", "'float'", "'class'", "'prefix'", "'suffix'", "'blocking'", "'procedure'", "'types'", "'statement'", "'repeat'", "'until'", "'while'", "'do'", "'for'", "'var'", "'='", "'val'", "'expression'", "'infix'", "'infixleft'", "'literal'", "'bracket'", "'parenthesis'", "'['", "']'", "'noclass'"
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


    // $ANTLR start "entryRulePrecidence"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:200:1: entryRulePrecidence : rulePrecidence EOF ;
    public final void entryRulePrecidence() throws RecognitionException {
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:201:1: ( rulePrecidence EOF )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:202:1: rulePrecidence EOF
            {
             before(grammarAccess.getPrecidenceRule()); 
            pushFollow(FOLLOW_rulePrecidence_in_entryRulePrecidence362);
            rulePrecidence();

            state._fsp--;

             after(grammarAccess.getPrecidenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecidence369); 

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
    // $ANTLR end "entryRulePrecidence"


    // $ANTLR start "rulePrecidence"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:209:1: rulePrecidence : ( ( rule__Precidence__Alternatives ) ) ;
    public final void rulePrecidence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:213:2: ( ( ( rule__Precidence__Alternatives ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:214:1: ( ( rule__Precidence__Alternatives ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:214:1: ( ( rule__Precidence__Alternatives ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:215:1: ( rule__Precidence__Alternatives )
            {
             before(grammarAccess.getPrecidenceAccess().getAlternatives()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:216:1: ( rule__Precidence__Alternatives )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:216:2: rule__Precidence__Alternatives
            {
            pushFollow(FOLLOW_rule__Precidence__Alternatives_in_rulePrecidence395);
            rule__Precidence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecidence"


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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:237:1: ruleMultID : ( ( rule__MultID__Alternatives ) ) ;
    public final void ruleMultID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:241:2: ( ( ( rule__MultID__Alternatives ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:242:1: ( ( rule__MultID__Alternatives ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:242:1: ( ( rule__MultID__Alternatives ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:243:1: ( rule__MultID__Alternatives )
            {
             before(grammarAccess.getMultIDAccess().getAlternatives()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:244:1: ( rule__MultID__Alternatives )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:244:2: rule__MultID__Alternatives
            {
            pushFollow(FOLLOW_rule__MultID__Alternatives_in_ruleMultID455);
            rule__MultID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultIDAccess().getAlternatives()); 

            }


            }

        }
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:265:1: ruleMultString : ( ( rule__MultString__Alternatives ) ) ;
    public final void ruleMultString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:269:2: ( ( ( rule__MultString__Alternatives ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:270:1: ( ( rule__MultString__Alternatives ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:270:1: ( ( rule__MultString__Alternatives ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:271:1: ( rule__MultString__Alternatives )
            {
             before(grammarAccess.getMultStringAccess().getAlternatives()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:272:1: ( rule__MultString__Alternatives )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:272:2: rule__MultString__Alternatives
            {
            pushFollow(FOLLOW_rule__MultString__Alternatives_in_ruleMultString515);
            rule__MultString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultStringAccess().getAlternatives()); 

            }


            }

        }
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
            case 45:
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


    // $ANTLR start "rule__Precidence__Alternatives"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:496:1: rule__Precidence__Alternatives : ( ( ( rule__Precidence__Group_0__0 ) ) | ( ( rule__Precidence__Group_1__0 ) ) | ( ( rule__Precidence__Group_2__0 ) ) | ( ( rule__Precidence__Group_3__0 ) ) | ( ( rule__Precidence__Group_4__0 ) ) | ( ( rule__Precidence__Group_5__0 ) ) | ( ( rule__Precidence__Group_6__0 ) ) | ( ( rule__Precidence__Group_7__0 ) ) );
    public final void rule__Precidence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:500:1: ( ( ( rule__Precidence__Group_0__0 ) ) | ( ( rule__Precidence__Group_1__0 ) ) | ( ( rule__Precidence__Group_2__0 ) ) | ( ( rule__Precidence__Group_3__0 ) ) | ( ( rule__Precidence__Group_4__0 ) ) | ( ( rule__Precidence__Group_5__0 ) ) | ( ( rule__Precidence__Group_6__0 ) ) | ( ( rule__Precidence__Group_7__0 ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            case 39:
                {
                alt8=4;
                }
                break;
            case 40:
                {
                alt8=5;
                }
                break;
            case 41:
                {
                alt8=6;
                }
                break;
            case 11:
                {
                alt8=7;
                }
                break;
            case 42:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:501:1: ( ( rule__Precidence__Group_0__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:501:1: ( ( rule__Precidence__Group_0__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:502:1: ( rule__Precidence__Group_0__0 )
                    {
                     before(grammarAccess.getPrecidenceAccess().getGroup_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:503:1: ( rule__Precidence__Group_0__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:503:2: rule__Precidence__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Precidence__Group_0__0_in_rule__Precidence__Alternatives1069);
                    rule__Precidence__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecidenceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:507:6: ( ( rule__Precidence__Group_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:507:6: ( ( rule__Precidence__Group_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:508:1: ( rule__Precidence__Group_1__0 )
                    {
                     before(grammarAccess.getPrecidenceAccess().getGroup_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:509:1: ( rule__Precidence__Group_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:509:2: rule__Precidence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Precidence__Group_1__0_in_rule__Precidence__Alternatives1087);
                    rule__Precidence__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecidenceAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:513:6: ( ( rule__Precidence__Group_2__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:513:6: ( ( rule__Precidence__Group_2__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:514:1: ( rule__Precidence__Group_2__0 )
                    {
                     before(grammarAccess.getPrecidenceAccess().getGroup_2()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:515:1: ( rule__Precidence__Group_2__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:515:2: rule__Precidence__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Precidence__Group_2__0_in_rule__Precidence__Alternatives1105);
                    rule__Precidence__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecidenceAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:519:6: ( ( rule__Precidence__Group_3__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:519:6: ( ( rule__Precidence__Group_3__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:520:1: ( rule__Precidence__Group_3__0 )
                    {
                     before(grammarAccess.getPrecidenceAccess().getGroup_3()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:521:1: ( rule__Precidence__Group_3__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:521:2: rule__Precidence__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Precidence__Group_3__0_in_rule__Precidence__Alternatives1123);
                    rule__Precidence__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecidenceAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:525:6: ( ( rule__Precidence__Group_4__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:525:6: ( ( rule__Precidence__Group_4__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:526:1: ( rule__Precidence__Group_4__0 )
                    {
                     before(grammarAccess.getPrecidenceAccess().getGroup_4()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:527:1: ( rule__Precidence__Group_4__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:527:2: rule__Precidence__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Precidence__Group_4__0_in_rule__Precidence__Alternatives1141);
                    rule__Precidence__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecidenceAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:531:6: ( ( rule__Precidence__Group_5__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:531:6: ( ( rule__Precidence__Group_5__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:532:1: ( rule__Precidence__Group_5__0 )
                    {
                     before(grammarAccess.getPrecidenceAccess().getGroup_5()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:533:1: ( rule__Precidence__Group_5__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:533:2: rule__Precidence__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Precidence__Group_5__0_in_rule__Precidence__Alternatives1159);
                    rule__Precidence__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecidenceAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:537:6: ( ( rule__Precidence__Group_6__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:537:6: ( ( rule__Precidence__Group_6__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:538:1: ( rule__Precidence__Group_6__0 )
                    {
                     before(grammarAccess.getPrecidenceAccess().getGroup_6()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:539:1: ( rule__Precidence__Group_6__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:539:2: rule__Precidence__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Precidence__Group_6__0_in_rule__Precidence__Alternatives1177);
                    rule__Precidence__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecidenceAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:543:6: ( ( rule__Precidence__Group_7__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:543:6: ( ( rule__Precidence__Group_7__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:544:1: ( rule__Precidence__Group_7__0 )
                    {
                     before(grammarAccess.getPrecidenceAccess().getGroup_7()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:545:1: ( rule__Precidence__Group_7__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:545:2: rule__Precidence__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Precidence__Group_7__0_in_rule__Precidence__Alternatives1195);
                    rule__Precidence__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrecidenceAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Precidence__Alternatives"


    // $ANTLR start "rule__Precidence__LiteralAlternatives_4_2_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:554:1: rule__Precidence__LiteralAlternatives_4_2_0 : ( ( 'int' ) | ( 'string' ) | ( 'bool' ) | ( 'float' ) );
    public final void rule__Precidence__LiteralAlternatives_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:558:1: ( ( 'int' ) | ( 'string' ) | ( 'bool' ) | ( 'float' ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:559:1: ( 'int' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:559:1: ( 'int' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:560:1: 'int'
                    {
                     before(grammarAccess.getPrecidenceAccess().getLiteralIntKeyword_4_2_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Precidence__LiteralAlternatives_4_2_01229); 
                     after(grammarAccess.getPrecidenceAccess().getLiteralIntKeyword_4_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:567:6: ( 'string' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:567:6: ( 'string' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:568:1: 'string'
                    {
                     before(grammarAccess.getPrecidenceAccess().getLiteralStringKeyword_4_2_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Precidence__LiteralAlternatives_4_2_01249); 
                     after(grammarAccess.getPrecidenceAccess().getLiteralStringKeyword_4_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:575:6: ( 'bool' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:575:6: ( 'bool' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:576:1: 'bool'
                    {
                     before(grammarAccess.getPrecidenceAccess().getLiteralBoolKeyword_4_2_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__Precidence__LiteralAlternatives_4_2_01269); 
                     after(grammarAccess.getPrecidenceAccess().getLiteralBoolKeyword_4_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:583:6: ( 'float' )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:583:6: ( 'float' )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:584:1: 'float'
                    {
                     before(grammarAccess.getPrecidenceAccess().getLiteralFloatKeyword_4_2_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__Precidence__LiteralAlternatives_4_2_01289); 
                     after(grammarAccess.getPrecidenceAccess().getLiteralFloatKeyword_4_2_0_3()); 

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
    // $ANTLR end "rule__Precidence__LiteralAlternatives_4_2_0"


    // $ANTLR start "rule__MultID__Alternatives"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:596:1: rule__MultID__Alternatives : ( ( RULE_ID ) | ( ( rule__MultID__Group_1__0 ) ) );
    public final void rule__MultID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:600:1: ( ( RULE_ID ) | ( ( rule__MultID__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==43) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:601:1: ( RULE_ID )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:601:1: ( RULE_ID )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:602:1: RULE_ID
                    {
                     before(grammarAccess.getMultIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__Alternatives1323); 
                     after(grammarAccess.getMultIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:607:6: ( ( rule__MultID__Group_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:607:6: ( ( rule__MultID__Group_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:608:1: ( rule__MultID__Group_1__0 )
                    {
                     before(grammarAccess.getMultIDAccess().getGroup_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:609:1: ( rule__MultID__Group_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:609:2: rule__MultID__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultID__Group_1__0_in_rule__MultID__Alternatives1340);
                    rule__MultID__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultIDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultID__Alternatives"


    // $ANTLR start "rule__MultString__Alternatives"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:618:1: rule__MultString__Alternatives : ( ( RULE_STRING ) | ( ( rule__MultString__Group_1__0 ) ) );
    public final void rule__MultString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:622:1: ( ( RULE_STRING ) | ( ( rule__MultString__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==43) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:623:1: ( RULE_STRING )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:623:1: ( RULE_STRING )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:624:1: RULE_STRING
                    {
                     before(grammarAccess.getMultStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__Alternatives1373); 
                     after(grammarAccess.getMultStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:629:6: ( ( rule__MultString__Group_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:629:6: ( ( rule__MultString__Group_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:630:1: ( rule__MultString__Group_1__0 )
                    {
                     before(grammarAccess.getMultStringAccess().getGroup_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:631:1: ( rule__MultString__Group_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:631:2: rule__MultString__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MultString__Group_1__0_in_rule__MultString__Alternatives1390);
                    rule__MultString__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultStringAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultString__Alternatives"


    // $ANTLR start "rule__ClassType__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:642:1: rule__ClassType__Group__0 : rule__ClassType__Group__0__Impl rule__ClassType__Group__1 ;
    public final void rule__ClassType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:646:1: ( rule__ClassType__Group__0__Impl rule__ClassType__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:647:2: rule__ClassType__Group__0__Impl rule__ClassType__Group__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01421);
            rule__ClassType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01424);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:654:1: rule__ClassType__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:658:1: ( ( 'class' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:659:1: ( 'class' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:659:1: ( 'class' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:660:1: 'class'
            {
             before(grammarAccess.getClassTypeAccess().getClassKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ClassType__Group__0__Impl1452); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:673:1: rule__ClassType__Group__1 : rule__ClassType__Group__1__Impl rule__ClassType__Group__2 ;
    public final void rule__ClassType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:677:1: ( rule__ClassType__Group__1__Impl rule__ClassType__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:678:2: rule__ClassType__Group__1__Impl rule__ClassType__Group__2
            {
            pushFollow(FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11483);
            rule__ClassType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11486);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:685:1: rule__ClassType__Group__1__Impl : ( ( rule__ClassType__NameAssignment_1 ) ) ;
    public final void rule__ClassType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:689:1: ( ( ( rule__ClassType__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:690:1: ( ( rule__ClassType__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:690:1: ( ( rule__ClassType__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:691:1: ( rule__ClassType__NameAssignment_1 )
            {
             before(grammarAccess.getClassTypeAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:692:1: ( rule__ClassType__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:692:2: rule__ClassType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1513);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:702:1: rule__ClassType__Group__2 : rule__ClassType__Group__2__Impl ;
    public final void rule__ClassType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:706:1: ( rule__ClassType__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:707:2: rule__ClassType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21543);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:713:1: rule__ClassType__Group__2__Impl : ( ( rule__ClassType__Alternatives_2 )* ) ;
    public final void rule__ClassType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:717:1: ( ( ( rule__ClassType__Alternatives_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:718:1: ( ( rule__ClassType__Alternatives_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:718:1: ( ( rule__ClassType__Alternatives_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:719:1: ( rule__ClassType__Alternatives_2 )*
            {
             before(grammarAccess.getClassTypeAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:720:1: ( rule__ClassType__Alternatives_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=23 && LA12_0<=25)||LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:720:2: rule__ClassType__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1570);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:736:1: rule__ClassType__Group_2_1__0 : rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1 ;
    public final void rule__ClassType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:740:1: ( rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:741:2: rule__ClassType__Group_2_1__0__Impl rule__ClassType__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01607);
            rule__ClassType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01610);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:748:1: rule__ClassType__Group_2_1__0__Impl : ( 'prefix' ) ;
    public final void rule__ClassType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:752:1: ( ( 'prefix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:753:1: ( 'prefix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:753:1: ( 'prefix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:754:1: 'prefix'
            {
             before(grammarAccess.getClassTypeAccess().getPrefixKeyword_2_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1638); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:767:1: rule__ClassType__Group_2_1__1 : rule__ClassType__Group_2_1__1__Impl ;
    public final void rule__ClassType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:771:1: ( rule__ClassType__Group_2_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:772:2: rule__ClassType__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11669);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:778:1: rule__ClassType__Group_2_1__1__Impl : ( ( rule__ClassType__PrefixAssignment_2_1_1 ) ) ;
    public final void rule__ClassType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:782:1: ( ( ( rule__ClassType__PrefixAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:783:1: ( ( rule__ClassType__PrefixAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:783:1: ( ( rule__ClassType__PrefixAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:784:1: ( rule__ClassType__PrefixAssignment_2_1_1 )
            {
             before(grammarAccess.getClassTypeAccess().getPrefixAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:785:1: ( rule__ClassType__PrefixAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:785:2: rule__ClassType__PrefixAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1696);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:799:1: rule__ClassType__Group_2_2__0 : rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1 ;
    public final void rule__ClassType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:803:1: ( rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:804:2: rule__ClassType__Group_2_2__0__Impl rule__ClassType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__01730);
            rule__ClassType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__01733);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:811:1: rule__ClassType__Group_2_2__0__Impl : ( 'suffix' ) ;
    public final void rule__ClassType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:815:1: ( ( 'suffix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:816:1: ( 'suffix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:816:1: ( 'suffix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:817:1: 'suffix'
            {
             before(grammarAccess.getClassTypeAccess().getSuffixKeyword_2_2_0()); 
            match(input,24,FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl1761); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:830:1: rule__ClassType__Group_2_2__1 : rule__ClassType__Group_2_2__1__Impl ;
    public final void rule__ClassType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:834:1: ( rule__ClassType__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:835:2: rule__ClassType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__11792);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:841:1: rule__ClassType__Group_2_2__1__Impl : ( ( rule__ClassType__SuffixAssignment_2_2_1 ) ) ;
    public final void rule__ClassType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:845:1: ( ( ( rule__ClassType__SuffixAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:846:1: ( ( rule__ClassType__SuffixAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:846:1: ( ( rule__ClassType__SuffixAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:847:1: ( rule__ClassType__SuffixAssignment_2_2_1 )
            {
             before(grammarAccess.getClassTypeAccess().getSuffixAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:848:1: ( rule__ClassType__SuffixAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:848:2: rule__ClassType__SuffixAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl1819);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:862:1: rule__ClassType__Group_2_3__0 : rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1 ;
    public final void rule__ClassType__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:866:1: ( rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:867:2: rule__ClassType__Group_2_3__0__Impl rule__ClassType__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__01853);
            rule__ClassType__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__01856);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:874:1: rule__ClassType__Group_2_3__0__Impl : ( 'blocking' ) ;
    public final void rule__ClassType__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:878:1: ( ( 'blocking' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:879:1: ( 'blocking' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:879:1: ( 'blocking' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:880:1: 'blocking'
            {
             before(grammarAccess.getClassTypeAccess().getBlockingKeyword_2_3_0()); 
            match(input,25,FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl1884); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:893:1: rule__ClassType__Group_2_3__1 : rule__ClassType__Group_2_3__1__Impl ;
    public final void rule__ClassType__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:897:1: ( rule__ClassType__Group_2_3__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:898:2: rule__ClassType__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__11915);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:904:1: rule__ClassType__Group_2_3__1__Impl : ( ( rule__ClassType__BlockingAssignment_2_3_1 ) ) ;
    public final void rule__ClassType__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:908:1: ( ( ( rule__ClassType__BlockingAssignment_2_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:909:1: ( ( rule__ClassType__BlockingAssignment_2_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:909:1: ( ( rule__ClassType__BlockingAssignment_2_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:910:1: ( rule__ClassType__BlockingAssignment_2_3_1 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAssignment_2_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:911:1: ( rule__ClassType__BlockingAssignment_2_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:911:2: rule__ClassType__BlockingAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl1942);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:925:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:929:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:930:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01976);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01979);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:937:1: rule__Procedure__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:941:1: ( ( 'procedure' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:942:1: ( 'procedure' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:942:1: ( 'procedure' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:943:1: 'procedure'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Procedure__Group__0__Impl2007); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:956:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:960:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:961:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12038);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12041);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:968:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:972:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:973:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:973:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:974:1: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:975:1: ( rule__Procedure__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:975:2: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2068);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:985:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:989:1: ( rule__Procedure__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:990:2: rule__Procedure__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22098);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:996:1: rule__Procedure__Group__2__Impl : ( ( rule__Procedure__Alternatives_2 )* ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1000:1: ( ( ( rule__Procedure__Alternatives_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1001:1: ( ( rule__Procedure__Alternatives_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1001:1: ( ( rule__Procedure__Alternatives_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1002:1: ( rule__Procedure__Alternatives_2 )*
            {
             before(grammarAccess.getProcedureAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1003:1: ( rule__Procedure__Alternatives_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=24)||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1003:2: rule__Procedure__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2125);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1019:1: rule__Procedure__Group_2_0__0 : rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1 ;
    public final void rule__Procedure__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1023:1: ( rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1024:2: rule__Procedure__Group_2_0__0__Impl rule__Procedure__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02162);
            rule__Procedure__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02165);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1031:1: rule__Procedure__Group_2_0__0__Impl : ( 'prefix' ) ;
    public final void rule__Procedure__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1035:1: ( ( 'prefix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1036:1: ( 'prefix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1036:1: ( 'prefix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1037:1: 'prefix'
            {
             before(grammarAccess.getProcedureAccess().getPrefixKeyword_2_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2193); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1050:1: rule__Procedure__Group_2_0__1 : rule__Procedure__Group_2_0__1__Impl ;
    public final void rule__Procedure__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1054:1: ( rule__Procedure__Group_2_0__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1055:2: rule__Procedure__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12224);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1061:1: rule__Procedure__Group_2_0__1__Impl : ( ( rule__Procedure__PrefixAssignment_2_0_1 ) ) ;
    public final void rule__Procedure__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1065:1: ( ( ( rule__Procedure__PrefixAssignment_2_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1066:1: ( ( rule__Procedure__PrefixAssignment_2_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1066:1: ( ( rule__Procedure__PrefixAssignment_2_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1067:1: ( rule__Procedure__PrefixAssignment_2_0_1 )
            {
             before(grammarAccess.getProcedureAccess().getPrefixAssignment_2_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1068:1: ( rule__Procedure__PrefixAssignment_2_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1068:2: rule__Procedure__PrefixAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2251);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1082:1: rule__Procedure__Group_2_1__0 : rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 ;
    public final void rule__Procedure__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1086:1: ( rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1087:2: rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02285);
            rule__Procedure__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02288);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1094:1: rule__Procedure__Group_2_1__0__Impl : ( 'suffix' ) ;
    public final void rule__Procedure__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1098:1: ( ( 'suffix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1099:1: ( 'suffix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1099:1: ( 'suffix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1100:1: 'suffix'
            {
             before(grammarAccess.getProcedureAccess().getSuffixKeyword_2_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2316); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1113:1: rule__Procedure__Group_2_1__1 : rule__Procedure__Group_2_1__1__Impl ;
    public final void rule__Procedure__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1117:1: ( rule__Procedure__Group_2_1__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1118:2: rule__Procedure__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12347);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1124:1: rule__Procedure__Group_2_1__1__Impl : ( ( rule__Procedure__SuffixAssignment_2_1_1 ) ) ;
    public final void rule__Procedure__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1128:1: ( ( ( rule__Procedure__SuffixAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1129:1: ( ( rule__Procedure__SuffixAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1129:1: ( ( rule__Procedure__SuffixAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1130:1: ( rule__Procedure__SuffixAssignment_2_1_1 )
            {
             before(grammarAccess.getProcedureAccess().getSuffixAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1131:1: ( rule__Procedure__SuffixAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1131:2: rule__Procedure__SuffixAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2374);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1145:1: rule__Procedure__Group_2_2__0 : rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1 ;
    public final void rule__Procedure__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1149:1: ( rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1150:2: rule__Procedure__Group_2_2__0__Impl rule__Procedure__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02408);
            rule__Procedure__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02411);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1157:1: rule__Procedure__Group_2_2__0__Impl : ( 'types' ) ;
    public final void rule__Procedure__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1161:1: ( ( 'types' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1162:1: ( 'types' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1162:1: ( 'types' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1163:1: 'types'
            {
             before(grammarAccess.getProcedureAccess().getTypesKeyword_2_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2439); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1176:1: rule__Procedure__Group_2_2__1 : rule__Procedure__Group_2_2__1__Impl ;
    public final void rule__Procedure__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1180:1: ( rule__Procedure__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1181:2: rule__Procedure__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12470);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1187:1: rule__Procedure__Group_2_2__1__Impl : ( ( rule__Procedure__TypesAssignment_2_2_1 ) ) ;
    public final void rule__Procedure__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1191:1: ( ( ( rule__Procedure__TypesAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1192:1: ( ( rule__Procedure__TypesAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1192:1: ( ( rule__Procedure__TypesAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1193:1: ( rule__Procedure__TypesAssignment_2_2_1 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1194:1: ( rule__Procedure__TypesAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1194:2: rule__Procedure__TypesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2497);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1208:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1212:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1213:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02531);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02534);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1220:1: rule__Statement__Group__0__Impl : ( 'statement' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1224:1: ( ( 'statement' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1225:1: ( 'statement' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1225:1: ( 'statement' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1226:1: 'statement'
            {
             before(grammarAccess.getStatementAccess().getStatementKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Statement__Group__0__Impl2562); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1239:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1243:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1244:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12593);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12596);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1251:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__NameAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1255:1: ( ( ( rule__Statement__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1256:1: ( ( rule__Statement__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1256:1: ( ( rule__Statement__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1257:1: ( rule__Statement__NameAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1258:1: ( rule__Statement__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1258:2: rule__Statement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2623);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1268:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1272:1: ( rule__Statement__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1273:2: rule__Statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22653);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1279:1: rule__Statement__Group__2__Impl : ( ( rule__Statement__Alternatives_2 ) ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1283:1: ( ( ( rule__Statement__Alternatives_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1284:1: ( ( rule__Statement__Alternatives_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1284:1: ( ( rule__Statement__Alternatives_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1285:1: ( rule__Statement__Alternatives_2 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1286:1: ( rule__Statement__Alternatives_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1286:2: rule__Statement__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2680);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1302:1: rule__Statement__Group_2_0__0 : rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1 ;
    public final void rule__Statement__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1306:1: ( rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1307:2: rule__Statement__Group_2_0__0__Impl rule__Statement__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02716);
            rule__Statement__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02719);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1314:1: rule__Statement__Group_2_0__0__Impl : ( 'repeat' ) ;
    public final void rule__Statement__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1318:1: ( ( 'repeat' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1319:1: ( 'repeat' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1319:1: ( 'repeat' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1320:1: 'repeat'
            {
             before(grammarAccess.getStatementAccess().getRepeatKeyword_2_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl2747); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1333:1: rule__Statement__Group_2_0__1 : rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2 ;
    public final void rule__Statement__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1337:1: ( rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1338:2: rule__Statement__Group_2_0__1__Impl rule__Statement__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__12778);
            rule__Statement__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__12781);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1345:1: rule__Statement__Group_2_0__1__Impl : ( ( rule__Statement__RepAssignment_2_0_1 ) ) ;
    public final void rule__Statement__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1349:1: ( ( ( rule__Statement__RepAssignment_2_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1350:1: ( ( rule__Statement__RepAssignment_2_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1350:1: ( ( rule__Statement__RepAssignment_2_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1351:1: ( rule__Statement__RepAssignment_2_0_1 )
            {
             before(grammarAccess.getStatementAccess().getRepAssignment_2_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1352:1: ( rule__Statement__RepAssignment_2_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1352:2: rule__Statement__RepAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl2808);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1362:1: rule__Statement__Group_2_0__2 : rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3 ;
    public final void rule__Statement__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1366:1: ( rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1367:2: rule__Statement__Group_2_0__2__Impl rule__Statement__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__22838);
            rule__Statement__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__22841);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1374:1: rule__Statement__Group_2_0__2__Impl : ( 'until' ) ;
    public final void rule__Statement__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1378:1: ( ( 'until' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1379:1: ( 'until' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1379:1: ( 'until' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1380:1: 'until'
            {
             before(grammarAccess.getStatementAccess().getUntilKeyword_2_0_2()); 
            match(input,30,FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl2869); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1393:1: rule__Statement__Group_2_0__3 : rule__Statement__Group_2_0__3__Impl ;
    public final void rule__Statement__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1397:1: ( rule__Statement__Group_2_0__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1398:2: rule__Statement__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__32900);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1404:1: rule__Statement__Group_2_0__3__Impl : ( ( rule__Statement__UntilAssignment_2_0_3 ) ) ;
    public final void rule__Statement__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1408:1: ( ( ( rule__Statement__UntilAssignment_2_0_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1409:1: ( ( rule__Statement__UntilAssignment_2_0_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1409:1: ( ( rule__Statement__UntilAssignment_2_0_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1410:1: ( rule__Statement__UntilAssignment_2_0_3 )
            {
             before(grammarAccess.getStatementAccess().getUntilAssignment_2_0_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1411:1: ( rule__Statement__UntilAssignment_2_0_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1411:2: rule__Statement__UntilAssignment_2_0_3
            {
            pushFollow(FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl2927);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1429:1: rule__Statement__Group_2_1__0 : rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1 ;
    public final void rule__Statement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1433:1: ( rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1434:2: rule__Statement__Group_2_1__0__Impl rule__Statement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__02965);
            rule__Statement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__02968);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1441:1: rule__Statement__Group_2_1__0__Impl : ( 'while' ) ;
    public final void rule__Statement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1445:1: ( ( 'while' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1446:1: ( 'while' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1446:1: ( 'while' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1447:1: 'while'
            {
             before(grammarAccess.getStatementAccess().getWhileKeyword_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl2996); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1460:1: rule__Statement__Group_2_1__1 : rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2 ;
    public final void rule__Statement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1464:1: ( rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1465:2: rule__Statement__Group_2_1__1__Impl rule__Statement__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13027);
            rule__Statement__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13030);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1472:1: rule__Statement__Group_2_1__1__Impl : ( ( rule__Statement__WhileAssignment_2_1_1 ) ) ;
    public final void rule__Statement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1476:1: ( ( ( rule__Statement__WhileAssignment_2_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1477:1: ( ( rule__Statement__WhileAssignment_2_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1477:1: ( ( rule__Statement__WhileAssignment_2_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1478:1: ( rule__Statement__WhileAssignment_2_1_1 )
            {
             before(grammarAccess.getStatementAccess().getWhileAssignment_2_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1479:1: ( rule__Statement__WhileAssignment_2_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1479:2: rule__Statement__WhileAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3057);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1489:1: rule__Statement__Group_2_1__2 : rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3 ;
    public final void rule__Statement__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1493:1: ( rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1494:2: rule__Statement__Group_2_1__2__Impl rule__Statement__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23087);
            rule__Statement__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23090);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1501:1: rule__Statement__Group_2_1__2__Impl : ( 'do' ) ;
    public final void rule__Statement__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1505:1: ( ( 'do' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1506:1: ( 'do' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1506:1: ( 'do' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1507:1: 'do'
            {
             before(grammarAccess.getStatementAccess().getDoKeyword_2_1_2()); 
            match(input,32,FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3118); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1520:1: rule__Statement__Group_2_1__3 : rule__Statement__Group_2_1__3__Impl ;
    public final void rule__Statement__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1524:1: ( rule__Statement__Group_2_1__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1525:2: rule__Statement__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33149);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1531:1: rule__Statement__Group_2_1__3__Impl : ( ( rule__Statement__DoAssignment_2_1_3 ) ) ;
    public final void rule__Statement__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1535:1: ( ( ( rule__Statement__DoAssignment_2_1_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1536:1: ( ( rule__Statement__DoAssignment_2_1_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1536:1: ( ( rule__Statement__DoAssignment_2_1_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1537:1: ( rule__Statement__DoAssignment_2_1_3 )
            {
             before(grammarAccess.getStatementAccess().getDoAssignment_2_1_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1538:1: ( rule__Statement__DoAssignment_2_1_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1538:2: rule__Statement__DoAssignment_2_1_3
            {
            pushFollow(FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3176);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1556:1: rule__Statement__Group_2_2__0 : rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1 ;
    public final void rule__Statement__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1560:1: ( rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1561:2: rule__Statement__Group_2_2__0__Impl rule__Statement__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03214);
            rule__Statement__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03217);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1568:1: rule__Statement__Group_2_2__0__Impl : ( 'for' ) ;
    public final void rule__Statement__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1572:1: ( ( 'for' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1573:1: ( 'for' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1573:1: ( 'for' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1574:1: 'for'
            {
             before(grammarAccess.getStatementAccess().getForKeyword_2_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3245); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1587:1: rule__Statement__Group_2_2__1 : rule__Statement__Group_2_2__1__Impl ;
    public final void rule__Statement__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1591:1: ( rule__Statement__Group_2_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1592:2: rule__Statement__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13276);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1598:1: rule__Statement__Group_2_2__1__Impl : ( ( rule__Statement__ForAssignment_2_2_1 ) ) ;
    public final void rule__Statement__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1602:1: ( ( ( rule__Statement__ForAssignment_2_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1603:1: ( ( rule__Statement__ForAssignment_2_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1603:1: ( ( rule__Statement__ForAssignment_2_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1604:1: ( rule__Statement__ForAssignment_2_2_1 )
            {
             before(grammarAccess.getStatementAccess().getForAssignment_2_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1605:1: ( rule__Statement__ForAssignment_2_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1605:2: rule__Statement__ForAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3303);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1619:1: rule__Statement__Group_2_3__0 : rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1 ;
    public final void rule__Statement__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1623:1: ( rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1624:2: rule__Statement__Group_2_3__0__Impl rule__Statement__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03337);
            rule__Statement__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03340);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1631:1: rule__Statement__Group_2_3__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1635:1: ( ( 'var' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1636:1: ( 'var' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1636:1: ( 'var' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1637:1: 'var'
            {
             before(grammarAccess.getStatementAccess().getVarKeyword_2_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3368); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1650:1: rule__Statement__Group_2_3__1 : rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2 ;
    public final void rule__Statement__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1654:1: ( rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1655:2: rule__Statement__Group_2_3__1__Impl rule__Statement__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13399);
            rule__Statement__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13402);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1662:1: rule__Statement__Group_2_3__1__Impl : ( ( rule__Statement__VarAssignment_2_3_1 ) ) ;
    public final void rule__Statement__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1666:1: ( ( ( rule__Statement__VarAssignment_2_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1667:1: ( ( rule__Statement__VarAssignment_2_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1667:1: ( ( rule__Statement__VarAssignment_2_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1668:1: ( rule__Statement__VarAssignment_2_3_1 )
            {
             before(grammarAccess.getStatementAccess().getVarAssignment_2_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1669:1: ( rule__Statement__VarAssignment_2_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1669:2: rule__Statement__VarAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3429);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1679:1: rule__Statement__Group_2_3__2 : rule__Statement__Group_2_3__2__Impl ;
    public final void rule__Statement__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1683:1: ( rule__Statement__Group_2_3__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1684:2: rule__Statement__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23459);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1690:1: rule__Statement__Group_2_3__2__Impl : ( ( rule__Statement__Group_2_3_2__0 )? ) ;
    public final void rule__Statement__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1694:1: ( ( ( rule__Statement__Group_2_3_2__0 )? ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1695:1: ( ( rule__Statement__Group_2_3_2__0 )? )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1695:1: ( ( rule__Statement__Group_2_3_2__0 )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1696:1: ( rule__Statement__Group_2_3_2__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_2_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1697:1: ( rule__Statement__Group_2_3_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1697:2: rule__Statement__Group_2_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3486);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1713:1: rule__Statement__Group_2_3_2__0 : rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1 ;
    public final void rule__Statement__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1717:1: ( rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1718:2: rule__Statement__Group_2_3_2__0__Impl rule__Statement__Group_2_3_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03523);
            rule__Statement__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03526);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1725:1: rule__Statement__Group_2_3_2__0__Impl : ( '=' ) ;
    public final void rule__Statement__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1729:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1730:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1730:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1731:1: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_3_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3554); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1744:1: rule__Statement__Group_2_3_2__1 : rule__Statement__Group_2_3_2__1__Impl ;
    public final void rule__Statement__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1748:1: ( rule__Statement__Group_2_3_2__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1749:2: rule__Statement__Group_2_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13585);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1755:1: rule__Statement__Group_2_3_2__1__Impl : ( ( rule__Statement__ExAssignment_2_3_2_1 ) ) ;
    public final void rule__Statement__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1759:1: ( ( ( rule__Statement__ExAssignment_2_3_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1760:1: ( ( rule__Statement__ExAssignment_2_3_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1760:1: ( ( rule__Statement__ExAssignment_2_3_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1761:1: ( rule__Statement__ExAssignment_2_3_2_1 )
            {
             before(grammarAccess.getStatementAccess().getExAssignment_2_3_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1762:1: ( rule__Statement__ExAssignment_2_3_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1762:2: rule__Statement__ExAssignment_2_3_2_1
            {
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3612);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1776:1: rule__Statement__Group_2_4__0 : rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1 ;
    public final void rule__Statement__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1780:1: ( rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1781:2: rule__Statement__Group_2_4__0__Impl rule__Statement__Group_2_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03646);
            rule__Statement__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03649);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1788:1: rule__Statement__Group_2_4__0__Impl : ( 'val' ) ;
    public final void rule__Statement__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1792:1: ( ( 'val' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1793:1: ( 'val' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1793:1: ( 'val' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1794:1: 'val'
            {
             before(grammarAccess.getStatementAccess().getValKeyword_2_4_0()); 
            match(input,36,FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3677); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1807:1: rule__Statement__Group_2_4__1 : rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2 ;
    public final void rule__Statement__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1811:1: ( rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1812:2: rule__Statement__Group_2_4__1__Impl rule__Statement__Group_2_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13708);
            rule__Statement__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13711);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1819:1: rule__Statement__Group_2_4__1__Impl : ( ( rule__Statement__ValAssignment_2_4_1 ) ) ;
    public final void rule__Statement__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1823:1: ( ( ( rule__Statement__ValAssignment_2_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1824:1: ( ( rule__Statement__ValAssignment_2_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1824:1: ( ( rule__Statement__ValAssignment_2_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1825:1: ( rule__Statement__ValAssignment_2_4_1 )
            {
             before(grammarAccess.getStatementAccess().getValAssignment_2_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1826:1: ( rule__Statement__ValAssignment_2_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1826:2: rule__Statement__ValAssignment_2_4_1
            {
            pushFollow(FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl3738);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1836:1: rule__Statement__Group_2_4__2 : rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3 ;
    public final void rule__Statement__Group_2_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1840:1: ( rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1841:2: rule__Statement__Group_2_4__2__Impl rule__Statement__Group_2_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__23768);
            rule__Statement__Group_2_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__23771);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1848:1: rule__Statement__Group_2_4__2__Impl : ( '=' ) ;
    public final void rule__Statement__Group_2_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1852:1: ( ( '=' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1853:1: ( '=' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1853:1: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1854:1: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2_4_2()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl3799); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1867:1: rule__Statement__Group_2_4__3 : rule__Statement__Group_2_4__3__Impl ;
    public final void rule__Statement__Group_2_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1871:1: ( rule__Statement__Group_2_4__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1872:2: rule__Statement__Group_2_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__33830);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1878:1: rule__Statement__Group_2_4__3__Impl : ( ( rule__Statement__ExAssignment_2_4_3 ) ) ;
    public final void rule__Statement__Group_2_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1882:1: ( ( ( rule__Statement__ExAssignment_2_4_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1883:1: ( ( rule__Statement__ExAssignment_2_4_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1883:1: ( ( rule__Statement__ExAssignment_2_4_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1884:1: ( rule__Statement__ExAssignment_2_4_3 )
            {
             before(grammarAccess.getStatementAccess().getExAssignment_2_4_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1885:1: ( rule__Statement__ExAssignment_2_4_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1885:2: rule__Statement__ExAssignment_2_4_3
            {
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl3857);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1903:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1907:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1908:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03895);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03898);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1915:1: rule__Expression__Group__0__Impl : ( 'expression' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1919:1: ( ( 'expression' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1920:1: ( 'expression' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1920:1: ( 'expression' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1921:1: 'expression'
            {
             before(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Expression__Group__0__Impl3926); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1934:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1938:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1939:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13957);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__13960);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1946:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__NameAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1950:1: ( ( ( rule__Expression__NameAssignment_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1951:1: ( ( rule__Expression__NameAssignment_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1951:1: ( ( rule__Expression__NameAssignment_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1952:1: ( rule__Expression__NameAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1953:1: ( rule__Expression__NameAssignment_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1953:2: rule__Expression__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl3987);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1963:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1967:1: ( rule__Expression__Group__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1968:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24017);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1974:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__PrecAssignment_2 )* ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1978:1: ( ( ( rule__Expression__PrecAssignment_2 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1979:1: ( ( rule__Expression__PrecAssignment_2 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1979:1: ( ( rule__Expression__PrecAssignment_2 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1980:1: ( rule__Expression__PrecAssignment_2 )*
            {
             before(grammarAccess.getExpressionAccess().getPrecAssignment_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1981:1: ( rule__Expression__PrecAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==11||(LA15_0>=23 && LA15_0<=24)||(LA15_0>=38 && LA15_0<=42)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1981:2: rule__Expression__PrecAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4044);
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


    // $ANTLR start "rule__Precidence__Group_0__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1997:1: rule__Precidence__Group_0__0 : rule__Precidence__Group_0__0__Impl rule__Precidence__Group_0__1 ;
    public final void rule__Precidence__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2001:1: ( rule__Precidence__Group_0__0__Impl rule__Precidence__Group_0__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2002:2: rule__Precidence__Group_0__0__Impl rule__Precidence__Group_0__1
            {
            pushFollow(FOLLOW_rule__Precidence__Group_0__0__Impl_in_rule__Precidence__Group_0__04081);
            rule__Precidence__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_0__1_in_rule__Precidence__Group_0__04084);
            rule__Precidence__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_0__0"


    // $ANTLR start "rule__Precidence__Group_0__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2009:1: rule__Precidence__Group_0__0__Impl : ( 'prefix' ) ;
    public final void rule__Precidence__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2013:1: ( ( 'prefix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2014:1: ( 'prefix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2014:1: ( 'prefix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2015:1: 'prefix'
            {
             before(grammarAccess.getPrecidenceAccess().getPrefixKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Precidence__Group_0__0__Impl4112); 
             after(grammarAccess.getPrecidenceAccess().getPrefixKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_0__0__Impl"


    // $ANTLR start "rule__Precidence__Group_0__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2028:1: rule__Precidence__Group_0__1 : rule__Precidence__Group_0__1__Impl rule__Precidence__Group_0__2 ;
    public final void rule__Precidence__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2032:1: ( rule__Precidence__Group_0__1__Impl rule__Precidence__Group_0__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2033:2: rule__Precidence__Group_0__1__Impl rule__Precidence__Group_0__2
            {
            pushFollow(FOLLOW_rule__Precidence__Group_0__1__Impl_in_rule__Precidence__Group_0__14143);
            rule__Precidence__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_0__2_in_rule__Precidence__Group_0__14146);
            rule__Precidence__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_0__1"


    // $ANTLR start "rule__Precidence__Group_0__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2040:1: rule__Precidence__Group_0__1__Impl : ( ( rule__Precidence__RuleAssignment_0_1 ) ) ;
    public final void rule__Precidence__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2044:1: ( ( ( rule__Precidence__RuleAssignment_0_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2045:1: ( ( rule__Precidence__RuleAssignment_0_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2045:1: ( ( rule__Precidence__RuleAssignment_0_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2046:1: ( rule__Precidence__RuleAssignment_0_1 )
            {
             before(grammarAccess.getPrecidenceAccess().getRuleAssignment_0_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2047:1: ( rule__Precidence__RuleAssignment_0_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2047:2: rule__Precidence__RuleAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_0_1_in_rule__Precidence__Group_0__1__Impl4173);
            rule__Precidence__RuleAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getRuleAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_0__1__Impl"


    // $ANTLR start "rule__Precidence__Group_0__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2057:1: rule__Precidence__Group_0__2 : rule__Precidence__Group_0__2__Impl rule__Precidence__Group_0__3 ;
    public final void rule__Precidence__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2061:1: ( rule__Precidence__Group_0__2__Impl rule__Precidence__Group_0__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2062:2: rule__Precidence__Group_0__2__Impl rule__Precidence__Group_0__3
            {
            pushFollow(FOLLOW_rule__Precidence__Group_0__2__Impl_in_rule__Precidence__Group_0__24203);
            rule__Precidence__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_0__3_in_rule__Precidence__Group_0__24206);
            rule__Precidence__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_0__2"


    // $ANTLR start "rule__Precidence__Group_0__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2069:1: rule__Precidence__Group_0__2__Impl : ( ( rule__Precidence__PrefixAssignment_0_2 ) ) ;
    public final void rule__Precidence__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2073:1: ( ( ( rule__Precidence__PrefixAssignment_0_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2074:1: ( ( rule__Precidence__PrefixAssignment_0_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2074:1: ( ( rule__Precidence__PrefixAssignment_0_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2075:1: ( rule__Precidence__PrefixAssignment_0_2 )
            {
             before(grammarAccess.getPrecidenceAccess().getPrefixAssignment_0_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2076:1: ( rule__Precidence__PrefixAssignment_0_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2076:2: rule__Precidence__PrefixAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Precidence__PrefixAssignment_0_2_in_rule__Precidence__Group_0__2__Impl4233);
            rule__Precidence__PrefixAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getPrefixAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_0__2__Impl"


    // $ANTLR start "rule__Precidence__Group_0__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2086:1: rule__Precidence__Group_0__3 : rule__Precidence__Group_0__3__Impl ;
    public final void rule__Precidence__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2090:1: ( rule__Precidence__Group_0__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2091:2: rule__Precidence__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Precidence__Group_0__3__Impl_in_rule__Precidence__Group_0__34263);
            rule__Precidence__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_0__3"


    // $ANTLR start "rule__Precidence__Group_0__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2097:1: rule__Precidence__Group_0__3__Impl : ( ( rule__Precidence__Par1Assignment_0_3 ) ) ;
    public final void rule__Precidence__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2101:1: ( ( ( rule__Precidence__Par1Assignment_0_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2102:1: ( ( rule__Precidence__Par1Assignment_0_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2102:1: ( ( rule__Precidence__Par1Assignment_0_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2103:1: ( rule__Precidence__Par1Assignment_0_3 )
            {
             before(grammarAccess.getPrecidenceAccess().getPar1Assignment_0_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2104:1: ( rule__Precidence__Par1Assignment_0_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2104:2: rule__Precidence__Par1Assignment_0_3
            {
            pushFollow(FOLLOW_rule__Precidence__Par1Assignment_0_3_in_rule__Precidence__Group_0__3__Impl4290);
            rule__Precidence__Par1Assignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getPar1Assignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_0__3__Impl"


    // $ANTLR start "rule__Precidence__Group_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2122:1: rule__Precidence__Group_1__0 : rule__Precidence__Group_1__0__Impl rule__Precidence__Group_1__1 ;
    public final void rule__Precidence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2126:1: ( rule__Precidence__Group_1__0__Impl rule__Precidence__Group_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2127:2: rule__Precidence__Group_1__0__Impl rule__Precidence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Precidence__Group_1__0__Impl_in_rule__Precidence__Group_1__04328);
            rule__Precidence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_1__1_in_rule__Precidence__Group_1__04331);
            rule__Precidence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_1__0"


    // $ANTLR start "rule__Precidence__Group_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2134:1: rule__Precidence__Group_1__0__Impl : ( 'suffix' ) ;
    public final void rule__Precidence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2138:1: ( ( 'suffix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2139:1: ( 'suffix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2139:1: ( 'suffix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2140:1: 'suffix'
            {
             before(grammarAccess.getPrecidenceAccess().getSuffixKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Precidence__Group_1__0__Impl4359); 
             after(grammarAccess.getPrecidenceAccess().getSuffixKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_1__0__Impl"


    // $ANTLR start "rule__Precidence__Group_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2153:1: rule__Precidence__Group_1__1 : rule__Precidence__Group_1__1__Impl rule__Precidence__Group_1__2 ;
    public final void rule__Precidence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2157:1: ( rule__Precidence__Group_1__1__Impl rule__Precidence__Group_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2158:2: rule__Precidence__Group_1__1__Impl rule__Precidence__Group_1__2
            {
            pushFollow(FOLLOW_rule__Precidence__Group_1__1__Impl_in_rule__Precidence__Group_1__14390);
            rule__Precidence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_1__2_in_rule__Precidence__Group_1__14393);
            rule__Precidence__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_1__1"


    // $ANTLR start "rule__Precidence__Group_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2165:1: rule__Precidence__Group_1__1__Impl : ( ( rule__Precidence__RuleAssignment_1_1 ) ) ;
    public final void rule__Precidence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2169:1: ( ( ( rule__Precidence__RuleAssignment_1_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2170:1: ( ( rule__Precidence__RuleAssignment_1_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2170:1: ( ( rule__Precidence__RuleAssignment_1_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2171:1: ( rule__Precidence__RuleAssignment_1_1 )
            {
             before(grammarAccess.getPrecidenceAccess().getRuleAssignment_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2172:1: ( rule__Precidence__RuleAssignment_1_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2172:2: rule__Precidence__RuleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_1_1_in_rule__Precidence__Group_1__1__Impl4420);
            rule__Precidence__RuleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getRuleAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_1__1__Impl"


    // $ANTLR start "rule__Precidence__Group_1__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2182:1: rule__Precidence__Group_1__2 : rule__Precidence__Group_1__2__Impl rule__Precidence__Group_1__3 ;
    public final void rule__Precidence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2186:1: ( rule__Precidence__Group_1__2__Impl rule__Precidence__Group_1__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2187:2: rule__Precidence__Group_1__2__Impl rule__Precidence__Group_1__3
            {
            pushFollow(FOLLOW_rule__Precidence__Group_1__2__Impl_in_rule__Precidence__Group_1__24450);
            rule__Precidence__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_1__3_in_rule__Precidence__Group_1__24453);
            rule__Precidence__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_1__2"


    // $ANTLR start "rule__Precidence__Group_1__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2194:1: rule__Precidence__Group_1__2__Impl : ( ( rule__Precidence__Par1Assignment_1_2 ) ) ;
    public final void rule__Precidence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2198:1: ( ( ( rule__Precidence__Par1Assignment_1_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2199:1: ( ( rule__Precidence__Par1Assignment_1_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2199:1: ( ( rule__Precidence__Par1Assignment_1_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2200:1: ( rule__Precidence__Par1Assignment_1_2 )
            {
             before(grammarAccess.getPrecidenceAccess().getPar1Assignment_1_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2201:1: ( rule__Precidence__Par1Assignment_1_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2201:2: rule__Precidence__Par1Assignment_1_2
            {
            pushFollow(FOLLOW_rule__Precidence__Par1Assignment_1_2_in_rule__Precidence__Group_1__2__Impl4480);
            rule__Precidence__Par1Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getPar1Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_1__2__Impl"


    // $ANTLR start "rule__Precidence__Group_1__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2211:1: rule__Precidence__Group_1__3 : rule__Precidence__Group_1__3__Impl ;
    public final void rule__Precidence__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2215:1: ( rule__Precidence__Group_1__3__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2216:2: rule__Precidence__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Precidence__Group_1__3__Impl_in_rule__Precidence__Group_1__34510);
            rule__Precidence__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_1__3"


    // $ANTLR start "rule__Precidence__Group_1__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2222:1: rule__Precidence__Group_1__3__Impl : ( ( rule__Precidence__SuffixAssignment_1_3 ) ) ;
    public final void rule__Precidence__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2226:1: ( ( ( rule__Precidence__SuffixAssignment_1_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2227:1: ( ( rule__Precidence__SuffixAssignment_1_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2227:1: ( ( rule__Precidence__SuffixAssignment_1_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2228:1: ( rule__Precidence__SuffixAssignment_1_3 )
            {
             before(grammarAccess.getPrecidenceAccess().getSuffixAssignment_1_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2229:1: ( rule__Precidence__SuffixAssignment_1_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2229:2: rule__Precidence__SuffixAssignment_1_3
            {
            pushFollow(FOLLOW_rule__Precidence__SuffixAssignment_1_3_in_rule__Precidence__Group_1__3__Impl4537);
            rule__Precidence__SuffixAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getSuffixAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_1__3__Impl"


    // $ANTLR start "rule__Precidence__Group_2__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2247:1: rule__Precidence__Group_2__0 : rule__Precidence__Group_2__0__Impl rule__Precidence__Group_2__1 ;
    public final void rule__Precidence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2251:1: ( rule__Precidence__Group_2__0__Impl rule__Precidence__Group_2__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2252:2: rule__Precidence__Group_2__0__Impl rule__Precidence__Group_2__1
            {
            pushFollow(FOLLOW_rule__Precidence__Group_2__0__Impl_in_rule__Precidence__Group_2__04575);
            rule__Precidence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_2__1_in_rule__Precidence__Group_2__04578);
            rule__Precidence__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__0"


    // $ANTLR start "rule__Precidence__Group_2__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2259:1: rule__Precidence__Group_2__0__Impl : ( 'infix' ) ;
    public final void rule__Precidence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2263:1: ( ( 'infix' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2264:1: ( 'infix' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2264:1: ( 'infix' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2265:1: 'infix'
            {
             before(grammarAccess.getPrecidenceAccess().getInfixKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Precidence__Group_2__0__Impl4606); 
             after(grammarAccess.getPrecidenceAccess().getInfixKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__0__Impl"


    // $ANTLR start "rule__Precidence__Group_2__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2278:1: rule__Precidence__Group_2__1 : rule__Precidence__Group_2__1__Impl rule__Precidence__Group_2__2 ;
    public final void rule__Precidence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2282:1: ( rule__Precidence__Group_2__1__Impl rule__Precidence__Group_2__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2283:2: rule__Precidence__Group_2__1__Impl rule__Precidence__Group_2__2
            {
            pushFollow(FOLLOW_rule__Precidence__Group_2__1__Impl_in_rule__Precidence__Group_2__14637);
            rule__Precidence__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_2__2_in_rule__Precidence__Group_2__14640);
            rule__Precidence__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__1"


    // $ANTLR start "rule__Precidence__Group_2__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2290:1: rule__Precidence__Group_2__1__Impl : ( ( rule__Precidence__RuleAssignment_2_1 ) ) ;
    public final void rule__Precidence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2294:1: ( ( ( rule__Precidence__RuleAssignment_2_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2295:1: ( ( rule__Precidence__RuleAssignment_2_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2295:1: ( ( rule__Precidence__RuleAssignment_2_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2296:1: ( rule__Precidence__RuleAssignment_2_1 )
            {
             before(grammarAccess.getPrecidenceAccess().getRuleAssignment_2_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2297:1: ( rule__Precidence__RuleAssignment_2_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2297:2: rule__Precidence__RuleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_2_1_in_rule__Precidence__Group_2__1__Impl4667);
            rule__Precidence__RuleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getRuleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__1__Impl"


    // $ANTLR start "rule__Precidence__Group_2__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2307:1: rule__Precidence__Group_2__2 : rule__Precidence__Group_2__2__Impl rule__Precidence__Group_2__3 ;
    public final void rule__Precidence__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2311:1: ( rule__Precidence__Group_2__2__Impl rule__Precidence__Group_2__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2312:2: rule__Precidence__Group_2__2__Impl rule__Precidence__Group_2__3
            {
            pushFollow(FOLLOW_rule__Precidence__Group_2__2__Impl_in_rule__Precidence__Group_2__24697);
            rule__Precidence__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_2__3_in_rule__Precidence__Group_2__24700);
            rule__Precidence__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__2"


    // $ANTLR start "rule__Precidence__Group_2__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2319:1: rule__Precidence__Group_2__2__Impl : ( ( rule__Precidence__Par1Assignment_2_2 ) ) ;
    public final void rule__Precidence__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2323:1: ( ( ( rule__Precidence__Par1Assignment_2_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2324:1: ( ( rule__Precidence__Par1Assignment_2_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2324:1: ( ( rule__Precidence__Par1Assignment_2_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2325:1: ( rule__Precidence__Par1Assignment_2_2 )
            {
             before(grammarAccess.getPrecidenceAccess().getPar1Assignment_2_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2326:1: ( rule__Precidence__Par1Assignment_2_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2326:2: rule__Precidence__Par1Assignment_2_2
            {
            pushFollow(FOLLOW_rule__Precidence__Par1Assignment_2_2_in_rule__Precidence__Group_2__2__Impl4727);
            rule__Precidence__Par1Assignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getPar1Assignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__2__Impl"


    // $ANTLR start "rule__Precidence__Group_2__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2336:1: rule__Precidence__Group_2__3 : rule__Precidence__Group_2__3__Impl rule__Precidence__Group_2__4 ;
    public final void rule__Precidence__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2340:1: ( rule__Precidence__Group_2__3__Impl rule__Precidence__Group_2__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2341:2: rule__Precidence__Group_2__3__Impl rule__Precidence__Group_2__4
            {
            pushFollow(FOLLOW_rule__Precidence__Group_2__3__Impl_in_rule__Precidence__Group_2__34757);
            rule__Precidence__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_2__4_in_rule__Precidence__Group_2__34760);
            rule__Precidence__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__3"


    // $ANTLR start "rule__Precidence__Group_2__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2348:1: rule__Precidence__Group_2__3__Impl : ( ( rule__Precidence__InfixAssignment_2_3 ) ) ;
    public final void rule__Precidence__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2352:1: ( ( ( rule__Precidence__InfixAssignment_2_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2353:1: ( ( rule__Precidence__InfixAssignment_2_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2353:1: ( ( rule__Precidence__InfixAssignment_2_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2354:1: ( rule__Precidence__InfixAssignment_2_3 )
            {
             before(grammarAccess.getPrecidenceAccess().getInfixAssignment_2_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2355:1: ( rule__Precidence__InfixAssignment_2_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2355:2: rule__Precidence__InfixAssignment_2_3
            {
            pushFollow(FOLLOW_rule__Precidence__InfixAssignment_2_3_in_rule__Precidence__Group_2__3__Impl4787);
            rule__Precidence__InfixAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getInfixAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__3__Impl"


    // $ANTLR start "rule__Precidence__Group_2__4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2365:1: rule__Precidence__Group_2__4 : rule__Precidence__Group_2__4__Impl ;
    public final void rule__Precidence__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2369:1: ( rule__Precidence__Group_2__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2370:2: rule__Precidence__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Precidence__Group_2__4__Impl_in_rule__Precidence__Group_2__44817);
            rule__Precidence__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__4"


    // $ANTLR start "rule__Precidence__Group_2__4__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2376:1: rule__Precidence__Group_2__4__Impl : ( ( rule__Precidence__Par2Assignment_2_4 ) ) ;
    public final void rule__Precidence__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2380:1: ( ( ( rule__Precidence__Par2Assignment_2_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2381:1: ( ( rule__Precidence__Par2Assignment_2_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2381:1: ( ( rule__Precidence__Par2Assignment_2_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2382:1: ( rule__Precidence__Par2Assignment_2_4 )
            {
             before(grammarAccess.getPrecidenceAccess().getPar2Assignment_2_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2383:1: ( rule__Precidence__Par2Assignment_2_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2383:2: rule__Precidence__Par2Assignment_2_4
            {
            pushFollow(FOLLOW_rule__Precidence__Par2Assignment_2_4_in_rule__Precidence__Group_2__4__Impl4844);
            rule__Precidence__Par2Assignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getPar2Assignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_2__4__Impl"


    // $ANTLR start "rule__Precidence__Group_3__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2403:1: rule__Precidence__Group_3__0 : rule__Precidence__Group_3__0__Impl rule__Precidence__Group_3__1 ;
    public final void rule__Precidence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2407:1: ( rule__Precidence__Group_3__0__Impl rule__Precidence__Group_3__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2408:2: rule__Precidence__Group_3__0__Impl rule__Precidence__Group_3__1
            {
            pushFollow(FOLLOW_rule__Precidence__Group_3__0__Impl_in_rule__Precidence__Group_3__04884);
            rule__Precidence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_3__1_in_rule__Precidence__Group_3__04887);
            rule__Precidence__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__0"


    // $ANTLR start "rule__Precidence__Group_3__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2415:1: rule__Precidence__Group_3__0__Impl : ( 'infixleft' ) ;
    public final void rule__Precidence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2419:1: ( ( 'infixleft' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2420:1: ( 'infixleft' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2420:1: ( 'infixleft' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2421:1: 'infixleft'
            {
             before(grammarAccess.getPrecidenceAccess().getInfixleftKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__Precidence__Group_3__0__Impl4915); 
             after(grammarAccess.getPrecidenceAccess().getInfixleftKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__0__Impl"


    // $ANTLR start "rule__Precidence__Group_3__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2434:1: rule__Precidence__Group_3__1 : rule__Precidence__Group_3__1__Impl rule__Precidence__Group_3__2 ;
    public final void rule__Precidence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2438:1: ( rule__Precidence__Group_3__1__Impl rule__Precidence__Group_3__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2439:2: rule__Precidence__Group_3__1__Impl rule__Precidence__Group_3__2
            {
            pushFollow(FOLLOW_rule__Precidence__Group_3__1__Impl_in_rule__Precidence__Group_3__14946);
            rule__Precidence__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_3__2_in_rule__Precidence__Group_3__14949);
            rule__Precidence__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__1"


    // $ANTLR start "rule__Precidence__Group_3__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2446:1: rule__Precidence__Group_3__1__Impl : ( ( rule__Precidence__RuleAssignment_3_1 ) ) ;
    public final void rule__Precidence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2450:1: ( ( ( rule__Precidence__RuleAssignment_3_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2451:1: ( ( rule__Precidence__RuleAssignment_3_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2451:1: ( ( rule__Precidence__RuleAssignment_3_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2452:1: ( rule__Precidence__RuleAssignment_3_1 )
            {
             before(grammarAccess.getPrecidenceAccess().getRuleAssignment_3_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2453:1: ( rule__Precidence__RuleAssignment_3_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2453:2: rule__Precidence__RuleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_3_1_in_rule__Precidence__Group_3__1__Impl4976);
            rule__Precidence__RuleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getRuleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__1__Impl"


    // $ANTLR start "rule__Precidence__Group_3__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2463:1: rule__Precidence__Group_3__2 : rule__Precidence__Group_3__2__Impl rule__Precidence__Group_3__3 ;
    public final void rule__Precidence__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2467:1: ( rule__Precidence__Group_3__2__Impl rule__Precidence__Group_3__3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2468:2: rule__Precidence__Group_3__2__Impl rule__Precidence__Group_3__3
            {
            pushFollow(FOLLOW_rule__Precidence__Group_3__2__Impl_in_rule__Precidence__Group_3__25006);
            rule__Precidence__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_3__3_in_rule__Precidence__Group_3__25009);
            rule__Precidence__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__2"


    // $ANTLR start "rule__Precidence__Group_3__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2475:1: rule__Precidence__Group_3__2__Impl : ( ( rule__Precidence__Par1Assignment_3_2 ) ) ;
    public final void rule__Precidence__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2479:1: ( ( ( rule__Precidence__Par1Assignment_3_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2480:1: ( ( rule__Precidence__Par1Assignment_3_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2480:1: ( ( rule__Precidence__Par1Assignment_3_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2481:1: ( rule__Precidence__Par1Assignment_3_2 )
            {
             before(grammarAccess.getPrecidenceAccess().getPar1Assignment_3_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2482:1: ( rule__Precidence__Par1Assignment_3_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2482:2: rule__Precidence__Par1Assignment_3_2
            {
            pushFollow(FOLLOW_rule__Precidence__Par1Assignment_3_2_in_rule__Precidence__Group_3__2__Impl5036);
            rule__Precidence__Par1Assignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getPar1Assignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__2__Impl"


    // $ANTLR start "rule__Precidence__Group_3__3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2492:1: rule__Precidence__Group_3__3 : rule__Precidence__Group_3__3__Impl rule__Precidence__Group_3__4 ;
    public final void rule__Precidence__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2496:1: ( rule__Precidence__Group_3__3__Impl rule__Precidence__Group_3__4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2497:2: rule__Precidence__Group_3__3__Impl rule__Precidence__Group_3__4
            {
            pushFollow(FOLLOW_rule__Precidence__Group_3__3__Impl_in_rule__Precidence__Group_3__35066);
            rule__Precidence__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_3__4_in_rule__Precidence__Group_3__35069);
            rule__Precidence__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__3"


    // $ANTLR start "rule__Precidence__Group_3__3__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2504:1: rule__Precidence__Group_3__3__Impl : ( ( rule__Precidence__InfixleftAssignment_3_3 ) ) ;
    public final void rule__Precidence__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2508:1: ( ( ( rule__Precidence__InfixleftAssignment_3_3 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2509:1: ( ( rule__Precidence__InfixleftAssignment_3_3 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2509:1: ( ( rule__Precidence__InfixleftAssignment_3_3 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2510:1: ( rule__Precidence__InfixleftAssignment_3_3 )
            {
             before(grammarAccess.getPrecidenceAccess().getInfixleftAssignment_3_3()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2511:1: ( rule__Precidence__InfixleftAssignment_3_3 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2511:2: rule__Precidence__InfixleftAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Precidence__InfixleftAssignment_3_3_in_rule__Precidence__Group_3__3__Impl5096);
            rule__Precidence__InfixleftAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getInfixleftAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__3__Impl"


    // $ANTLR start "rule__Precidence__Group_3__4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2521:1: rule__Precidence__Group_3__4 : rule__Precidence__Group_3__4__Impl ;
    public final void rule__Precidence__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2525:1: ( rule__Precidence__Group_3__4__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2526:2: rule__Precidence__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Precidence__Group_3__4__Impl_in_rule__Precidence__Group_3__45126);
            rule__Precidence__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__4"


    // $ANTLR start "rule__Precidence__Group_3__4__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2532:1: rule__Precidence__Group_3__4__Impl : ( ( rule__Precidence__Par2Assignment_3_4 ) ) ;
    public final void rule__Precidence__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2536:1: ( ( ( rule__Precidence__Par2Assignment_3_4 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2537:1: ( ( rule__Precidence__Par2Assignment_3_4 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2537:1: ( ( rule__Precidence__Par2Assignment_3_4 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2538:1: ( rule__Precidence__Par2Assignment_3_4 )
            {
             before(grammarAccess.getPrecidenceAccess().getPar2Assignment_3_4()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2539:1: ( rule__Precidence__Par2Assignment_3_4 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2539:2: rule__Precidence__Par2Assignment_3_4
            {
            pushFollow(FOLLOW_rule__Precidence__Par2Assignment_3_4_in_rule__Precidence__Group_3__4__Impl5153);
            rule__Precidence__Par2Assignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getPar2Assignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_3__4__Impl"


    // $ANTLR start "rule__Precidence__Group_4__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2559:1: rule__Precidence__Group_4__0 : rule__Precidence__Group_4__0__Impl rule__Precidence__Group_4__1 ;
    public final void rule__Precidence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2563:1: ( rule__Precidence__Group_4__0__Impl rule__Precidence__Group_4__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2564:2: rule__Precidence__Group_4__0__Impl rule__Precidence__Group_4__1
            {
            pushFollow(FOLLOW_rule__Precidence__Group_4__0__Impl_in_rule__Precidence__Group_4__05193);
            rule__Precidence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_4__1_in_rule__Precidence__Group_4__05196);
            rule__Precidence__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_4__0"


    // $ANTLR start "rule__Precidence__Group_4__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2571:1: rule__Precidence__Group_4__0__Impl : ( 'literal' ) ;
    public final void rule__Precidence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2575:1: ( ( 'literal' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2576:1: ( 'literal' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2576:1: ( 'literal' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2577:1: 'literal'
            {
             before(grammarAccess.getPrecidenceAccess().getLiteralKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__Precidence__Group_4__0__Impl5224); 
             after(grammarAccess.getPrecidenceAccess().getLiteralKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_4__0__Impl"


    // $ANTLR start "rule__Precidence__Group_4__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2590:1: rule__Precidence__Group_4__1 : rule__Precidence__Group_4__1__Impl rule__Precidence__Group_4__2 ;
    public final void rule__Precidence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2594:1: ( rule__Precidence__Group_4__1__Impl rule__Precidence__Group_4__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2595:2: rule__Precidence__Group_4__1__Impl rule__Precidence__Group_4__2
            {
            pushFollow(FOLLOW_rule__Precidence__Group_4__1__Impl_in_rule__Precidence__Group_4__15255);
            rule__Precidence__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_4__2_in_rule__Precidence__Group_4__15258);
            rule__Precidence__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_4__1"


    // $ANTLR start "rule__Precidence__Group_4__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2602:1: rule__Precidence__Group_4__1__Impl : ( ( rule__Precidence__RuleAssignment_4_1 ) ) ;
    public final void rule__Precidence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2606:1: ( ( ( rule__Precidence__RuleAssignment_4_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2607:1: ( ( rule__Precidence__RuleAssignment_4_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2607:1: ( ( rule__Precidence__RuleAssignment_4_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2608:1: ( rule__Precidence__RuleAssignment_4_1 )
            {
             before(grammarAccess.getPrecidenceAccess().getRuleAssignment_4_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2609:1: ( rule__Precidence__RuleAssignment_4_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2609:2: rule__Precidence__RuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_4_1_in_rule__Precidence__Group_4__1__Impl5285);
            rule__Precidence__RuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getRuleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_4__1__Impl"


    // $ANTLR start "rule__Precidence__Group_4__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2619:1: rule__Precidence__Group_4__2 : rule__Precidence__Group_4__2__Impl ;
    public final void rule__Precidence__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2623:1: ( rule__Precidence__Group_4__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2624:2: rule__Precidence__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Precidence__Group_4__2__Impl_in_rule__Precidence__Group_4__25315);
            rule__Precidence__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_4__2"


    // $ANTLR start "rule__Precidence__Group_4__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2630:1: rule__Precidence__Group_4__2__Impl : ( ( rule__Precidence__LiteralAssignment_4_2 ) ) ;
    public final void rule__Precidence__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2634:1: ( ( ( rule__Precidence__LiteralAssignment_4_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2635:1: ( ( rule__Precidence__LiteralAssignment_4_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2635:1: ( ( rule__Precidence__LiteralAssignment_4_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2636:1: ( rule__Precidence__LiteralAssignment_4_2 )
            {
             before(grammarAccess.getPrecidenceAccess().getLiteralAssignment_4_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2637:1: ( rule__Precidence__LiteralAssignment_4_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2637:2: rule__Precidence__LiteralAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Precidence__LiteralAssignment_4_2_in_rule__Precidence__Group_4__2__Impl5342);
            rule__Precidence__LiteralAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getLiteralAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_4__2__Impl"


    // $ANTLR start "rule__Precidence__Group_5__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2653:1: rule__Precidence__Group_5__0 : rule__Precidence__Group_5__0__Impl rule__Precidence__Group_5__1 ;
    public final void rule__Precidence__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2657:1: ( rule__Precidence__Group_5__0__Impl rule__Precidence__Group_5__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2658:2: rule__Precidence__Group_5__0__Impl rule__Precidence__Group_5__1
            {
            pushFollow(FOLLOW_rule__Precidence__Group_5__0__Impl_in_rule__Precidence__Group_5__05378);
            rule__Precidence__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_5__1_in_rule__Precidence__Group_5__05381);
            rule__Precidence__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_5__0"


    // $ANTLR start "rule__Precidence__Group_5__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2665:1: rule__Precidence__Group_5__0__Impl : ( 'bracket' ) ;
    public final void rule__Precidence__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2669:1: ( ( 'bracket' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2670:1: ( 'bracket' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2670:1: ( 'bracket' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2671:1: 'bracket'
            {
             before(grammarAccess.getPrecidenceAccess().getBracketKeyword_5_0()); 
            match(input,41,FOLLOW_41_in_rule__Precidence__Group_5__0__Impl5409); 
             after(grammarAccess.getPrecidenceAccess().getBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_5__0__Impl"


    // $ANTLR start "rule__Precidence__Group_5__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2684:1: rule__Precidence__Group_5__1 : rule__Precidence__Group_5__1__Impl rule__Precidence__Group_5__2 ;
    public final void rule__Precidence__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2688:1: ( rule__Precidence__Group_5__1__Impl rule__Precidence__Group_5__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2689:2: rule__Precidence__Group_5__1__Impl rule__Precidence__Group_5__2
            {
            pushFollow(FOLLOW_rule__Precidence__Group_5__1__Impl_in_rule__Precidence__Group_5__15440);
            rule__Precidence__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_5__2_in_rule__Precidence__Group_5__15443);
            rule__Precidence__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_5__1"


    // $ANTLR start "rule__Precidence__Group_5__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2696:1: rule__Precidence__Group_5__1__Impl : ( ( rule__Precidence__RuleAssignment_5_1 ) ) ;
    public final void rule__Precidence__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2700:1: ( ( ( rule__Precidence__RuleAssignment_5_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2701:1: ( ( rule__Precidence__RuleAssignment_5_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2701:1: ( ( rule__Precidence__RuleAssignment_5_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2702:1: ( rule__Precidence__RuleAssignment_5_1 )
            {
             before(grammarAccess.getPrecidenceAccess().getRuleAssignment_5_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2703:1: ( rule__Precidence__RuleAssignment_5_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2703:2: rule__Precidence__RuleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_5_1_in_rule__Precidence__Group_5__1__Impl5470);
            rule__Precidence__RuleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getRuleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_5__1__Impl"


    // $ANTLR start "rule__Precidence__Group_5__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2713:1: rule__Precidence__Group_5__2 : rule__Precidence__Group_5__2__Impl ;
    public final void rule__Precidence__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2717:1: ( rule__Precidence__Group_5__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2718:2: rule__Precidence__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Precidence__Group_5__2__Impl_in_rule__Precidence__Group_5__25500);
            rule__Precidence__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_5__2"


    // $ANTLR start "rule__Precidence__Group_5__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2724:1: rule__Precidence__Group_5__2__Impl : ( ( rule__Precidence__BracketAssignment_5_2 ) ) ;
    public final void rule__Precidence__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2728:1: ( ( ( rule__Precidence__BracketAssignment_5_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2729:1: ( ( rule__Precidence__BracketAssignment_5_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2729:1: ( ( rule__Precidence__BracketAssignment_5_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2730:1: ( rule__Precidence__BracketAssignment_5_2 )
            {
             before(grammarAccess.getPrecidenceAccess().getBracketAssignment_5_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2731:1: ( rule__Precidence__BracketAssignment_5_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2731:2: rule__Precidence__BracketAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Precidence__BracketAssignment_5_2_in_rule__Precidence__Group_5__2__Impl5527);
            rule__Precidence__BracketAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getBracketAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_5__2__Impl"


    // $ANTLR start "rule__Precidence__Group_6__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2747:1: rule__Precidence__Group_6__0 : rule__Precidence__Group_6__0__Impl rule__Precidence__Group_6__1 ;
    public final void rule__Precidence__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2751:1: ( rule__Precidence__Group_6__0__Impl rule__Precidence__Group_6__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2752:2: rule__Precidence__Group_6__0__Impl rule__Precidence__Group_6__1
            {
            pushFollow(FOLLOW_rule__Precidence__Group_6__0__Impl_in_rule__Precidence__Group_6__05563);
            rule__Precidence__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_6__1_in_rule__Precidence__Group_6__05566);
            rule__Precidence__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_6__0"


    // $ANTLR start "rule__Precidence__Group_6__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2759:1: rule__Precidence__Group_6__0__Impl : ( 'braces' ) ;
    public final void rule__Precidence__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2763:1: ( ( 'braces' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2764:1: ( 'braces' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2764:1: ( 'braces' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2765:1: 'braces'
            {
             before(grammarAccess.getPrecidenceAccess().getBracesKeyword_6_0()); 
            match(input,11,FOLLOW_11_in_rule__Precidence__Group_6__0__Impl5594); 
             after(grammarAccess.getPrecidenceAccess().getBracesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_6__0__Impl"


    // $ANTLR start "rule__Precidence__Group_6__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2778:1: rule__Precidence__Group_6__1 : rule__Precidence__Group_6__1__Impl rule__Precidence__Group_6__2 ;
    public final void rule__Precidence__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2782:1: ( rule__Precidence__Group_6__1__Impl rule__Precidence__Group_6__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2783:2: rule__Precidence__Group_6__1__Impl rule__Precidence__Group_6__2
            {
            pushFollow(FOLLOW_rule__Precidence__Group_6__1__Impl_in_rule__Precidence__Group_6__15625);
            rule__Precidence__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_6__2_in_rule__Precidence__Group_6__15628);
            rule__Precidence__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_6__1"


    // $ANTLR start "rule__Precidence__Group_6__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2790:1: rule__Precidence__Group_6__1__Impl : ( ( rule__Precidence__RuleAssignment_6_1 ) ) ;
    public final void rule__Precidence__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2794:1: ( ( ( rule__Precidence__RuleAssignment_6_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2795:1: ( ( rule__Precidence__RuleAssignment_6_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2795:1: ( ( rule__Precidence__RuleAssignment_6_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2796:1: ( rule__Precidence__RuleAssignment_6_1 )
            {
             before(grammarAccess.getPrecidenceAccess().getRuleAssignment_6_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2797:1: ( rule__Precidence__RuleAssignment_6_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2797:2: rule__Precidence__RuleAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_6_1_in_rule__Precidence__Group_6__1__Impl5655);
            rule__Precidence__RuleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getRuleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_6__1__Impl"


    // $ANTLR start "rule__Precidence__Group_6__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2807:1: rule__Precidence__Group_6__2 : rule__Precidence__Group_6__2__Impl ;
    public final void rule__Precidence__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2811:1: ( rule__Precidence__Group_6__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2812:2: rule__Precidence__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Precidence__Group_6__2__Impl_in_rule__Precidence__Group_6__25685);
            rule__Precidence__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_6__2"


    // $ANTLR start "rule__Precidence__Group_6__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2818:1: rule__Precidence__Group_6__2__Impl : ( ( rule__Precidence__BracesAssignment_6_2 ) ) ;
    public final void rule__Precidence__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2822:1: ( ( ( rule__Precidence__BracesAssignment_6_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2823:1: ( ( rule__Precidence__BracesAssignment_6_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2823:1: ( ( rule__Precidence__BracesAssignment_6_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2824:1: ( rule__Precidence__BracesAssignment_6_2 )
            {
             before(grammarAccess.getPrecidenceAccess().getBracesAssignment_6_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2825:1: ( rule__Precidence__BracesAssignment_6_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2825:2: rule__Precidence__BracesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Precidence__BracesAssignment_6_2_in_rule__Precidence__Group_6__2__Impl5712);
            rule__Precidence__BracesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getBracesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_6__2__Impl"


    // $ANTLR start "rule__Precidence__Group_7__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2841:1: rule__Precidence__Group_7__0 : rule__Precidence__Group_7__0__Impl rule__Precidence__Group_7__1 ;
    public final void rule__Precidence__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2845:1: ( rule__Precidence__Group_7__0__Impl rule__Precidence__Group_7__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2846:2: rule__Precidence__Group_7__0__Impl rule__Precidence__Group_7__1
            {
            pushFollow(FOLLOW_rule__Precidence__Group_7__0__Impl_in_rule__Precidence__Group_7__05748);
            rule__Precidence__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_7__1_in_rule__Precidence__Group_7__05751);
            rule__Precidence__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_7__0"


    // $ANTLR start "rule__Precidence__Group_7__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2853:1: rule__Precidence__Group_7__0__Impl : ( 'parenthesis' ) ;
    public final void rule__Precidence__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2857:1: ( ( 'parenthesis' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2858:1: ( 'parenthesis' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2858:1: ( 'parenthesis' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2859:1: 'parenthesis'
            {
             before(grammarAccess.getPrecidenceAccess().getParenthesisKeyword_7_0()); 
            match(input,42,FOLLOW_42_in_rule__Precidence__Group_7__0__Impl5779); 
             after(grammarAccess.getPrecidenceAccess().getParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_7__0__Impl"


    // $ANTLR start "rule__Precidence__Group_7__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2872:1: rule__Precidence__Group_7__1 : rule__Precidence__Group_7__1__Impl rule__Precidence__Group_7__2 ;
    public final void rule__Precidence__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2876:1: ( rule__Precidence__Group_7__1__Impl rule__Precidence__Group_7__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2877:2: rule__Precidence__Group_7__1__Impl rule__Precidence__Group_7__2
            {
            pushFollow(FOLLOW_rule__Precidence__Group_7__1__Impl_in_rule__Precidence__Group_7__15810);
            rule__Precidence__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_7__2_in_rule__Precidence__Group_7__15813);
            rule__Precidence__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_7__1"


    // $ANTLR start "rule__Precidence__Group_7__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2884:1: rule__Precidence__Group_7__1__Impl : ( ( rule__Precidence__RuleAssignment_7_1 ) ) ;
    public final void rule__Precidence__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2888:1: ( ( ( rule__Precidence__RuleAssignment_7_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2889:1: ( ( rule__Precidence__RuleAssignment_7_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2889:1: ( ( rule__Precidence__RuleAssignment_7_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2890:1: ( rule__Precidence__RuleAssignment_7_1 )
            {
             before(grammarAccess.getPrecidenceAccess().getRuleAssignment_7_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2891:1: ( rule__Precidence__RuleAssignment_7_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2891:2: rule__Precidence__RuleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_7_1_in_rule__Precidence__Group_7__1__Impl5840);
            rule__Precidence__RuleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getRuleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_7__1__Impl"


    // $ANTLR start "rule__Precidence__Group_7__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2901:1: rule__Precidence__Group_7__2 : rule__Precidence__Group_7__2__Impl ;
    public final void rule__Precidence__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2905:1: ( rule__Precidence__Group_7__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2906:2: rule__Precidence__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Precidence__Group_7__2__Impl_in_rule__Precidence__Group_7__25870);
            rule__Precidence__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_7__2"


    // $ANTLR start "rule__Precidence__Group_7__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2912:1: rule__Precidence__Group_7__2__Impl : ( ( rule__Precidence__ParenthesisAssignment_7_2 ) ) ;
    public final void rule__Precidence__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2916:1: ( ( ( rule__Precidence__ParenthesisAssignment_7_2 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2917:1: ( ( rule__Precidence__ParenthesisAssignment_7_2 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2917:1: ( ( rule__Precidence__ParenthesisAssignment_7_2 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2918:1: ( rule__Precidence__ParenthesisAssignment_7_2 )
            {
             before(grammarAccess.getPrecidenceAccess().getParenthesisAssignment_7_2()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2919:1: ( rule__Precidence__ParenthesisAssignment_7_2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2919:2: rule__Precidence__ParenthesisAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Precidence__ParenthesisAssignment_7_2_in_rule__Precidence__Group_7__2__Impl5897);
            rule__Precidence__ParenthesisAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getParenthesisAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Group_7__2__Impl"


    // $ANTLR start "rule__MultID__Group_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2935:1: rule__MultID__Group_1__0 : rule__MultID__Group_1__0__Impl rule__MultID__Group_1__1 ;
    public final void rule__MultID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2939:1: ( rule__MultID__Group_1__0__Impl rule__MultID__Group_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2940:2: rule__MultID__Group_1__0__Impl rule__MultID__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultID__Group_1__0__Impl_in_rule__MultID__Group_1__05933);
            rule__MultID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1__1_in_rule__MultID__Group_1__05936);
            rule__MultID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1__0"


    // $ANTLR start "rule__MultID__Group_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2947:1: rule__MultID__Group_1__0__Impl : ( '[' ) ;
    public final void rule__MultID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2951:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2952:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2952:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2953:1: '['
            {
             before(grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__MultID__Group_1__0__Impl5964); 
             after(grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1__0__Impl"


    // $ANTLR start "rule__MultID__Group_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2966:1: rule__MultID__Group_1__1 : rule__MultID__Group_1__1__Impl rule__MultID__Group_1__2 ;
    public final void rule__MultID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2970:1: ( rule__MultID__Group_1__1__Impl rule__MultID__Group_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2971:2: rule__MultID__Group_1__1__Impl rule__MultID__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultID__Group_1__1__Impl_in_rule__MultID__Group_1__15995);
            rule__MultID__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1__2_in_rule__MultID__Group_1__15998);
            rule__MultID__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1__1"


    // $ANTLR start "rule__MultID__Group_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2978:1: rule__MultID__Group_1__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__MultID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2982:1: ( ( ( RULE_ID )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2983:1: ( ( RULE_ID )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2983:1: ( ( RULE_ID )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2984:1: ( RULE_ID )*
            {
             before(grammarAccess.getMultIDAccess().getIDTerminalRuleCall_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2985:1: ( RULE_ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2985:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__Group_1__1__Impl6026); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMultIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1__1__Impl"


    // $ANTLR start "rule__MultID__Group_1__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2995:1: rule__MultID__Group_1__2 : rule__MultID__Group_1__2__Impl ;
    public final void rule__MultID__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2999:1: ( rule__MultID__Group_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3000:2: rule__MultID__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group_1__2__Impl_in_rule__MultID__Group_1__26057);
            rule__MultID__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1__2"


    // $ANTLR start "rule__MultID__Group_1__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3006:1: rule__MultID__Group_1__2__Impl : ( ']' ) ;
    public final void rule__MultID__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3010:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3011:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3011:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3012:1: ']'
            {
             before(grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,44,FOLLOW_44_in_rule__MultID__Group_1__2__Impl6085); 
             after(grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultID__Group_1__2__Impl"


    // $ANTLR start "rule__MultString__Group_1__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3031:1: rule__MultString__Group_1__0 : rule__MultString__Group_1__0__Impl rule__MultString__Group_1__1 ;
    public final void rule__MultString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3035:1: ( rule__MultString__Group_1__0__Impl rule__MultString__Group_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3036:2: rule__MultString__Group_1__0__Impl rule__MultString__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultString__Group_1__0__Impl_in_rule__MultString__Group_1__06122);
            rule__MultString__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1__1_in_rule__MultString__Group_1__06125);
            rule__MultString__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1__0"


    // $ANTLR start "rule__MultString__Group_1__0__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3043:1: rule__MultString__Group_1__0__Impl : ( '[' ) ;
    public final void rule__MultString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3047:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3048:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3048:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3049:1: '['
            {
             before(grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__MultString__Group_1__0__Impl6153); 
             after(grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1__0__Impl"


    // $ANTLR start "rule__MultString__Group_1__1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3062:1: rule__MultString__Group_1__1 : rule__MultString__Group_1__1__Impl rule__MultString__Group_1__2 ;
    public final void rule__MultString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3066:1: ( rule__MultString__Group_1__1__Impl rule__MultString__Group_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3067:2: rule__MultString__Group_1__1__Impl rule__MultString__Group_1__2
            {
            pushFollow(FOLLOW_rule__MultString__Group_1__1__Impl_in_rule__MultString__Group_1__16184);
            rule__MultString__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1__2_in_rule__MultString__Group_1__16187);
            rule__MultString__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1__1"


    // $ANTLR start "rule__MultString__Group_1__1__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3074:1: rule__MultString__Group_1__1__Impl : ( ( RULE_STRING )* ) ;
    public final void rule__MultString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3078:1: ( ( ( RULE_STRING )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3079:1: ( ( RULE_STRING )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3079:1: ( ( RULE_STRING )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3080:1: ( RULE_STRING )*
            {
             before(grammarAccess.getMultStringAccess().getSTRINGTerminalRuleCall_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3081:1: ( RULE_STRING )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3081:3: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__Group_1__1__Impl6215); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMultStringAccess().getSTRINGTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1__1__Impl"


    // $ANTLR start "rule__MultString__Group_1__2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3091:1: rule__MultString__Group_1__2 : rule__MultString__Group_1__2__Impl ;
    public final void rule__MultString__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3095:1: ( rule__MultString__Group_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3096:2: rule__MultString__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group_1__2__Impl_in_rule__MultString__Group_1__26246);
            rule__MultString__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1__2"


    // $ANTLR start "rule__MultString__Group_1__2__Impl"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3102:1: rule__MultString__Group_1__2__Impl : ( ']' ) ;
    public final void rule__MultString__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3106:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3107:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3107:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3108:1: ']'
            {
             before(grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,44,FOLLOW_44_in_rule__MultString__Group_1__2__Impl6274); 
             after(grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultString__Group_1__2__Impl"


    // $ANTLR start "rule__Model__ClasAssignment_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3128:1: rule__Model__ClasAssignment_0 : ( ruleClassType ) ;
    public final void rule__Model__ClasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3132:1: ( ( ruleClassType ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3133:1: ( ruleClassType )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3133:1: ( ruleClassType )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3134:1: ruleClassType
            {
             before(grammarAccess.getModelAccess().getClasClassTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_06316);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3143:1: rule__Model__ProcAssignment_1 : ( ruleProcedure ) ;
    public final void rule__Model__ProcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3147:1: ( ( ruleProcedure ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3148:1: ( ruleProcedure )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3148:1: ( ruleProcedure )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3149:1: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getProcProcedureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_16347);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3158:1: rule__Model__StatemAssignment_2 : ( ruleStatement ) ;
    public final void rule__Model__StatemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3162:1: ( ( ruleStatement ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3163:1: ( ruleStatement )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3163:1: ( ruleStatement )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3164:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatemStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_26378);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3173:1: rule__Model__ExpAssignment_3 : ( ruleExpression ) ;
    public final void rule__Model__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3177:1: ( ( ruleExpression ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3178:1: ( ruleExpression )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3178:1: ( ruleExpression )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3179:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_36409);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3188:1: rule__ClassType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3192:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3193:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3193:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3194:1: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_16440); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3203:1: rule__ClassType__NoclassAssignment_2_0 : ( ( 'noclass' ) ) ;
    public final void rule__ClassType__NoclassAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3207:1: ( ( ( 'noclass' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3208:1: ( ( 'noclass' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3208:1: ( ( 'noclass' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3209:1: ( 'noclass' )
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3210:1: ( 'noclass' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3211:1: 'noclass'
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0()); 
            match(input,45,FOLLOW_45_in_rule__ClassType__NoclassAssignment_2_06476); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3226:1: rule__ClassType__PrefixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__ClassType__PrefixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3230:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3231:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3231:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3232:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getPrefixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_16515);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3241:1: rule__ClassType__SuffixAssignment_2_2_1 : ( ruleMultID ) ;
    public final void rule__ClassType__SuffixAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3245:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3246:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3246:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3247:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getSuffixMultIDParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_16546);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3256:1: rule__ClassType__BlockingAssignment_2_3_1 : ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) ;
    public final void rule__ClassType__BlockingAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3260:1: ( ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3261:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3261:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3262:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAlternatives_2_3_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3263:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3263:2: rule__ClassType__BlockingAlternatives_2_3_1_0
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_16577);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3272:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3276:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3277:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3277:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3278:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_16610); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3287:1: rule__Procedure__PrefixAssignment_2_0_1 : ( ruleMultID ) ;
    public final void rule__Procedure__PrefixAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3291:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3292:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3292:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3293:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getPrefixMultIDParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_16641);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3302:1: rule__Procedure__SuffixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__Procedure__SuffixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3306:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3307:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3307:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3308:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getSuffixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_16672);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3317:1: rule__Procedure__TypesAssignment_2_2_1 : ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) ;
    public final void rule__Procedure__TypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3321:1: ( ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3322:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3322:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3323:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAlternatives_2_2_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3324:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3324:2: rule__Procedure__TypesAlternatives_2_2_1_0
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_16703);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3333:1: rule__Statement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3337:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3338:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3338:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3339:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_16736); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3348:1: rule__Statement__RepAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__Statement__RepAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3352:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3353:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3353:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3354:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getRepIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_16767); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3363:1: rule__Statement__UntilAssignment_2_0_3 : ( RULE_ID ) ;
    public final void rule__Statement__UntilAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3367:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3368:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3368:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3369:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getUntilIDTerminalRuleCall_2_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_36798); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3378:1: rule__Statement__WhileAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Statement__WhileAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3382:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3383:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3383:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3384:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getWhileIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_16829); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3393:1: rule__Statement__DoAssignment_2_1_3 : ( RULE_ID ) ;
    public final void rule__Statement__DoAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3397:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3398:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3398:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3399:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getDoIDTerminalRuleCall_2_1_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_36860); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3408:1: rule__Statement__ForAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ForAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3412:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3413:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3413:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3414:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getForIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_16891); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3423:1: rule__Statement__VarAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__Statement__VarAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3427:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3428:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3428:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3429:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVarIDTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_16922); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3438:1: rule__Statement__ExAssignment_2_3_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3442:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3443:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3443:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3444:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_16953); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3453:1: rule__Statement__ValAssignment_2_4_1 : ( RULE_ID ) ;
    public final void rule__Statement__ValAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3457:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3458:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3458:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3459:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getValIDTerminalRuleCall_2_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_16984); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3468:1: rule__Statement__ExAssignment_2_4_3 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3472:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3473:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3473:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3474:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_4_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_37015); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3483:1: rule__Expression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3487:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3488:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3488:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3489:1: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_17046); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3498:1: rule__Expression__PrecAssignment_2 : ( rulePrecidence ) ;
    public final void rule__Expression__PrecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3502:1: ( ( rulePrecidence ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3503:1: ( rulePrecidence )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3503:1: ( rulePrecidence )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3504:1: rulePrecidence
            {
             before(grammarAccess.getExpressionAccess().getPrecPrecidenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrecidence_in_rule__Expression__PrecAssignment_27077);
            rulePrecidence();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getPrecPrecidenceParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Precidence__RuleAssignment_0_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3513:1: rule__Precidence__RuleAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3517:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3518:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3518:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3519:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_0_17108); 
             after(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__RuleAssignment_0_1"


    // $ANTLR start "rule__Precidence__PrefixAssignment_0_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3528:1: rule__Precidence__PrefixAssignment_0_2 : ( ruleMultString ) ;
    public final void rule__Precidence__PrefixAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3532:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3533:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3533:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3534:1: ruleMultString
            {
             before(grammarAccess.getPrecidenceAccess().getPrefixMultStringParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precidence__PrefixAssignment_0_27139);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecidenceAccess().getPrefixMultStringParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__PrefixAssignment_0_2"


    // $ANTLR start "rule__Precidence__Par1Assignment_0_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3543:1: rule__Precidence__Par1Assignment_0_3 : ( RULE_ID ) ;
    public final void rule__Precidence__Par1Assignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3547:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3548:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3548:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3549:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_0_37170); 
             after(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Par1Assignment_0_3"


    // $ANTLR start "rule__Precidence__RuleAssignment_1_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3558:1: rule__Precidence__RuleAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3562:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3563:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3563:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3564:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_1_17201); 
             after(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__RuleAssignment_1_1"


    // $ANTLR start "rule__Precidence__Par1Assignment_1_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3573:1: rule__Precidence__Par1Assignment_1_2 : ( RULE_ID ) ;
    public final void rule__Precidence__Par1Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3577:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3578:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3578:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3579:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_1_27232); 
             after(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Par1Assignment_1_2"


    // $ANTLR start "rule__Precidence__SuffixAssignment_1_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3588:1: rule__Precidence__SuffixAssignment_1_3 : ( ruleMultString ) ;
    public final void rule__Precidence__SuffixAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3592:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3593:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3593:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3594:1: ruleMultString
            {
             before(grammarAccess.getPrecidenceAccess().getSuffixMultStringParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precidence__SuffixAssignment_1_37263);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecidenceAccess().getSuffixMultStringParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__SuffixAssignment_1_3"


    // $ANTLR start "rule__Precidence__RuleAssignment_2_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3603:1: rule__Precidence__RuleAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3607:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3608:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3608:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3609:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_2_17294); 
             after(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__RuleAssignment_2_1"


    // $ANTLR start "rule__Precidence__Par1Assignment_2_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3618:1: rule__Precidence__Par1Assignment_2_2 : ( RULE_ID ) ;
    public final void rule__Precidence__Par1Assignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3622:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3623:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3623:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3624:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_2_27325); 
             after(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Par1Assignment_2_2"


    // $ANTLR start "rule__Precidence__InfixAssignment_2_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3633:1: rule__Precidence__InfixAssignment_2_3 : ( ruleMultString ) ;
    public final void rule__Precidence__InfixAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3637:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3638:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3638:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3639:1: ruleMultString
            {
             before(grammarAccess.getPrecidenceAccess().getInfixMultStringParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precidence__InfixAssignment_2_37356);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecidenceAccess().getInfixMultStringParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__InfixAssignment_2_3"


    // $ANTLR start "rule__Precidence__Par2Assignment_2_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3648:1: rule__Precidence__Par2Assignment_2_4 : ( RULE_ID ) ;
    public final void rule__Precidence__Par2Assignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3652:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3653:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3653:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3654:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar2IDTerminalRuleCall_2_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par2Assignment_2_47387); 
             after(grammarAccess.getPrecidenceAccess().getPar2IDTerminalRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Par2Assignment_2_4"


    // $ANTLR start "rule__Precidence__RuleAssignment_3_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3663:1: rule__Precidence__RuleAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3667:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3668:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3668:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3669:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_3_17418); 
             after(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__RuleAssignment_3_1"


    // $ANTLR start "rule__Precidence__Par1Assignment_3_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3678:1: rule__Precidence__Par1Assignment_3_2 : ( RULE_ID ) ;
    public final void rule__Precidence__Par1Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3682:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3683:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3683:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3684:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_3_27449); 
             after(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Par1Assignment_3_2"


    // $ANTLR start "rule__Precidence__InfixleftAssignment_3_3"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3693:1: rule__Precidence__InfixleftAssignment_3_3 : ( ruleMultString ) ;
    public final void rule__Precidence__InfixleftAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3697:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3698:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3698:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3699:1: ruleMultString
            {
             before(grammarAccess.getPrecidenceAccess().getInfixleftMultStringParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precidence__InfixleftAssignment_3_37480);
            ruleMultString();

            state._fsp--;

             after(grammarAccess.getPrecidenceAccess().getInfixleftMultStringParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__InfixleftAssignment_3_3"


    // $ANTLR start "rule__Precidence__Par2Assignment_3_4"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3708:1: rule__Precidence__Par2Assignment_3_4 : ( RULE_ID ) ;
    public final void rule__Precidence__Par2Assignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3712:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3713:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3713:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3714:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar2IDTerminalRuleCall_3_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par2Assignment_3_47511); 
             after(grammarAccess.getPrecidenceAccess().getPar2IDTerminalRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__Par2Assignment_3_4"


    // $ANTLR start "rule__Precidence__RuleAssignment_4_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3723:1: rule__Precidence__RuleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3727:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3728:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3728:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3729:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_4_17542); 
             after(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__RuleAssignment_4_1"


    // $ANTLR start "rule__Precidence__LiteralAssignment_4_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3738:1: rule__Precidence__LiteralAssignment_4_2 : ( ( rule__Precidence__LiteralAlternatives_4_2_0 ) ) ;
    public final void rule__Precidence__LiteralAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3742:1: ( ( ( rule__Precidence__LiteralAlternatives_4_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3743:1: ( ( rule__Precidence__LiteralAlternatives_4_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3743:1: ( ( rule__Precidence__LiteralAlternatives_4_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3744:1: ( rule__Precidence__LiteralAlternatives_4_2_0 )
            {
             before(grammarAccess.getPrecidenceAccess().getLiteralAlternatives_4_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3745:1: ( rule__Precidence__LiteralAlternatives_4_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3745:2: rule__Precidence__LiteralAlternatives_4_2_0
            {
            pushFollow(FOLLOW_rule__Precidence__LiteralAlternatives_4_2_0_in_rule__Precidence__LiteralAssignment_4_27573);
            rule__Precidence__LiteralAlternatives_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPrecidenceAccess().getLiteralAlternatives_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__LiteralAssignment_4_2"


    // $ANTLR start "rule__Precidence__RuleAssignment_5_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3754:1: rule__Precidence__RuleAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3758:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3759:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3759:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3760:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_5_17606); 
             after(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__RuleAssignment_5_1"


    // $ANTLR start "rule__Precidence__BracketAssignment_5_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3769:1: rule__Precidence__BracketAssignment_5_2 : ( RULE_ID ) ;
    public final void rule__Precidence__BracketAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3773:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3774:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3774:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3775:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getBracketIDTerminalRuleCall_5_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__BracketAssignment_5_27637); 
             after(grammarAccess.getPrecidenceAccess().getBracketIDTerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__BracketAssignment_5_2"


    // $ANTLR start "rule__Precidence__RuleAssignment_6_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3784:1: rule__Precidence__RuleAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3788:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3789:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3789:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3790:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_6_17668); 
             after(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__RuleAssignment_6_1"


    // $ANTLR start "rule__Precidence__BracesAssignment_6_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3799:1: rule__Precidence__BracesAssignment_6_2 : ( RULE_ID ) ;
    public final void rule__Precidence__BracesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3803:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3804:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3804:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3805:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getBracesIDTerminalRuleCall_6_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__BracesAssignment_6_27699); 
             after(grammarAccess.getPrecidenceAccess().getBracesIDTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__BracesAssignment_6_2"


    // $ANTLR start "rule__Precidence__RuleAssignment_7_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3814:1: rule__Precidence__RuleAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3818:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3819:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3819:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3820:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_7_17730); 
             after(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__RuleAssignment_7_1"


    // $ANTLR start "rule__Precidence__ParenthesisAssignment_7_2"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3829:1: rule__Precidence__ParenthesisAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__Precidence__ParenthesisAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3833:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3834:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3834:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3835:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getParenthesisIDTerminalRuleCall_7_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__ParenthesisAssignment_7_27761); 
             after(grammarAccess.getPrecidenceAccess().getParenthesisIDTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precidence__ParenthesisAssignment_7_2"

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
    public static final BitSet FOLLOW_rulePrecidence_in_entryRulePrecidence362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecidence369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Alternatives_in_rulePrecidence395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_entryRuleMultID422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultID429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Alternatives_in_ruleMultID455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_entryRuleMultString482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultString489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Alternatives_in_ruleMultString515 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Precidence__Group_0__0_in_rule__Precidence__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__0_in_rule__Precidence__Alternatives1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__0_in_rule__Precidence__Alternatives1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__0_in_rule__Precidence__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__0_in_rule__Precidence__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__0_in_rule__Precidence__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__0_in_rule__Precidence__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__0_in_rule__Precidence__Alternatives1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Precidence__LiteralAlternatives_4_2_01229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Precidence__LiteralAlternatives_4_2_01249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Precidence__LiteralAlternatives_4_2_01269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Precidence__LiteralAlternatives_4_2_01289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__Alternatives1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1__0_in_rule__MultID__Alternatives1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__Alternatives1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1__0_in_rule__MultString__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassType__Group__0__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11483 = new BitSet(new long[]{0x0000200003800000L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1570 = new BitSet(new long[]{0x0000200003800002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01607 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__01730 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__01733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__01853 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__01856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__11915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Procedure__Group__0__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12038 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2125 = new BitSet(new long[]{0x0000000009800002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02162 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02285 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02408 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Statement__Group__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12593 = new BitSet(new long[]{0x00000016A0000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__12778 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__22838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__22841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__32900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__02965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13027 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13399 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13708 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__23768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__23771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__33830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Expression__Group__0__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13957 = new BitSet(new long[]{0x000007C001800800L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__13960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4044 = new BitSet(new long[]{0x000007C001800802L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__0__Impl_in_rule__Precidence__Group_0__04081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__1_in_rule__Precidence__Group_0__04084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Precidence__Group_0__0__Impl4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__1__Impl_in_rule__Precidence__Group_0__14143 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__2_in_rule__Precidence__Group_0__14146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_0_1_in_rule__Precidence__Group_0__1__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__2__Impl_in_rule__Precidence__Group_0__24203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__3_in_rule__Precidence__Group_0__24206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__PrefixAssignment_0_2_in_rule__Precidence__Group_0__2__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__3__Impl_in_rule__Precidence__Group_0__34263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par1Assignment_0_3_in_rule__Precidence__Group_0__3__Impl4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__0__Impl_in_rule__Precidence__Group_1__04328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__1_in_rule__Precidence__Group_1__04331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Precidence__Group_1__0__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__1__Impl_in_rule__Precidence__Group_1__14390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__2_in_rule__Precidence__Group_1__14393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_1_1_in_rule__Precidence__Group_1__1__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__2__Impl_in_rule__Precidence__Group_1__24450 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__3_in_rule__Precidence__Group_1__24453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par1Assignment_1_2_in_rule__Precidence__Group_1__2__Impl4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__3__Impl_in_rule__Precidence__Group_1__34510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__SuffixAssignment_1_3_in_rule__Precidence__Group_1__3__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__0__Impl_in_rule__Precidence__Group_2__04575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__1_in_rule__Precidence__Group_2__04578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Precidence__Group_2__0__Impl4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__1__Impl_in_rule__Precidence__Group_2__14637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__2_in_rule__Precidence__Group_2__14640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_2_1_in_rule__Precidence__Group_2__1__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__2__Impl_in_rule__Precidence__Group_2__24697 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__3_in_rule__Precidence__Group_2__24700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par1Assignment_2_2_in_rule__Precidence__Group_2__2__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__3__Impl_in_rule__Precidence__Group_2__34757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__4_in_rule__Precidence__Group_2__34760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__InfixAssignment_2_3_in_rule__Precidence__Group_2__3__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__4__Impl_in_rule__Precidence__Group_2__44817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par2Assignment_2_4_in_rule__Precidence__Group_2__4__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__0__Impl_in_rule__Precidence__Group_3__04884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__1_in_rule__Precidence__Group_3__04887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Precidence__Group_3__0__Impl4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__1__Impl_in_rule__Precidence__Group_3__14946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__2_in_rule__Precidence__Group_3__14949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_3_1_in_rule__Precidence__Group_3__1__Impl4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__2__Impl_in_rule__Precidence__Group_3__25006 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__3_in_rule__Precidence__Group_3__25009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par1Assignment_3_2_in_rule__Precidence__Group_3__2__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__3__Impl_in_rule__Precidence__Group_3__35066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__4_in_rule__Precidence__Group_3__35069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__InfixleftAssignment_3_3_in_rule__Precidence__Group_3__3__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__4__Impl_in_rule__Precidence__Group_3__45126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par2Assignment_3_4_in_rule__Precidence__Group_3__4__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__0__Impl_in_rule__Precidence__Group_4__05193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__1_in_rule__Precidence__Group_4__05196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Precidence__Group_4__0__Impl5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__1__Impl_in_rule__Precidence__Group_4__15255 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__2_in_rule__Precidence__Group_4__15258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_4_1_in_rule__Precidence__Group_4__1__Impl5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__2__Impl_in_rule__Precidence__Group_4__25315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__LiteralAssignment_4_2_in_rule__Precidence__Group_4__2__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__0__Impl_in_rule__Precidence__Group_5__05378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__1_in_rule__Precidence__Group_5__05381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Precidence__Group_5__0__Impl5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__1__Impl_in_rule__Precidence__Group_5__15440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__2_in_rule__Precidence__Group_5__15443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_5_1_in_rule__Precidence__Group_5__1__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__2__Impl_in_rule__Precidence__Group_5__25500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__BracketAssignment_5_2_in_rule__Precidence__Group_5__2__Impl5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__0__Impl_in_rule__Precidence__Group_6__05563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__1_in_rule__Precidence__Group_6__05566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Precidence__Group_6__0__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__1__Impl_in_rule__Precidence__Group_6__15625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__2_in_rule__Precidence__Group_6__15628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_6_1_in_rule__Precidence__Group_6__1__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__2__Impl_in_rule__Precidence__Group_6__25685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__BracesAssignment_6_2_in_rule__Precidence__Group_6__2__Impl5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__0__Impl_in_rule__Precidence__Group_7__05748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__1_in_rule__Precidence__Group_7__05751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Precidence__Group_7__0__Impl5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__1__Impl_in_rule__Precidence__Group_7__15810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__2_in_rule__Precidence__Group_7__15813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_7_1_in_rule__Precidence__Group_7__1__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__2__Impl_in_rule__Precidence__Group_7__25870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__ParenthesisAssignment_7_2_in_rule__Precidence__Group_7__2__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1__0__Impl_in_rule__MultID__Group_1__05933 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1__1_in_rule__MultID__Group_1__05936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MultID__Group_1__0__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1__1__Impl_in_rule__MultID__Group_1__15995 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1__2_in_rule__MultID__Group_1__15998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__Group_1__1__Impl6026 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MultID__Group_1__2__Impl_in_rule__MultID__Group_1__26057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MultID__Group_1__2__Impl6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1__0__Impl_in_rule__MultString__Group_1__06122 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1__1_in_rule__MultString__Group_1__06125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MultString__Group_1__0__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1__1__Impl_in_rule__MultString__Group_1__16184 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1__2_in_rule__MultString__Group_1__16187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__Group_1__1__Impl6215 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MultString__Group_1__2__Impl_in_rule__MultString__Group_1__26246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MultString__Group_1__2__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_06316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_16347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_26378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_36409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_16440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ClassType__NoclassAssignment_2_06476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_16515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_16546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_16577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_16610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_16641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_16672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_16703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_16736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_16767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_36798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_16829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_36860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_16891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_16922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_16953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_16984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_37015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_17046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecidence_in_rule__Expression__PrecAssignment_27077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_0_17108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precidence__PrefixAssignment_0_27139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_0_37170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_1_17201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_1_27232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precidence__SuffixAssignment_1_37263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_2_17294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_2_27325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precidence__InfixAssignment_2_37356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par2Assignment_2_47387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_3_17418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_3_27449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precidence__InfixleftAssignment_3_37480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par2Assignment_3_47511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_4_17542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__LiteralAlternatives_4_2_0_in_rule__Precidence__LiteralAssignment_4_27573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_5_17606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__BracketAssignment_5_27637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_6_17668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__BracesAssignment_6_27699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_7_17730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__ParenthesisAssignment_7_27761 = new BitSet(new long[]{0x0000000000000002L});

}