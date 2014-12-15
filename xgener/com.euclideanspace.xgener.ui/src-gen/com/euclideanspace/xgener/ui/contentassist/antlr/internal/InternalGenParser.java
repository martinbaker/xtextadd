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


    // $ANTLR start "rule__MultID__Alternatives_1"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:596:1: rule__MultID__Alternatives_1 : ( ( ( rule__MultID__MiAssignment_1_0 ) ) | ( ( rule__MultID__Group_1_1__0 ) ) );
    public final void rule__MultID__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:600:1: ( ( ( rule__MultID__MiAssignment_1_0 ) ) | ( ( rule__MultID__Group_1_1__0 ) ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:601:1: ( ( rule__MultID__MiAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:601:1: ( ( rule__MultID__MiAssignment_1_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:602:1: ( rule__MultID__MiAssignment_1_0 )
                    {
                     before(grammarAccess.getMultIDAccess().getMiAssignment_1_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:603:1: ( rule__MultID__MiAssignment_1_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:603:2: rule__MultID__MiAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MultID__MiAssignment_1_0_in_rule__MultID__Alternatives_11323);
                    rule__MultID__MiAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultIDAccess().getMiAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:607:6: ( ( rule__MultID__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:607:6: ( ( rule__MultID__Group_1_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:608:1: ( rule__MultID__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultIDAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:609:1: ( rule__MultID__Group_1_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:609:2: rule__MultID__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultID__Group_1_1__0_in_rule__MultID__Alternatives_11341);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:618:1: rule__MultString__Alternatives_1 : ( ( ( rule__MultString__MsAssignment_1_0 ) ) | ( ( rule__MultString__Group_1_1__0 ) ) );
    public final void rule__MultString__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:622:1: ( ( ( rule__MultString__MsAssignment_1_0 ) ) | ( ( rule__MultString__Group_1_1__0 ) ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:623:1: ( ( rule__MultString__MsAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:623:1: ( ( rule__MultString__MsAssignment_1_0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:624:1: ( rule__MultString__MsAssignment_1_0 )
                    {
                     before(grammarAccess.getMultStringAccess().getMsAssignment_1_0()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:625:1: ( rule__MultString__MsAssignment_1_0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:625:2: rule__MultString__MsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__MultString__MsAssignment_1_0_in_rule__MultString__Alternatives_11374);
                    rule__MultString__MsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultStringAccess().getMsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:629:6: ( ( rule__MultString__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:629:6: ( ( rule__MultString__Group_1_1__0 ) )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:630:1: ( rule__MultString__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultStringAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:631:1: ( rule__MultString__Group_1_1__0 )
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:631:2: rule__MultString__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultString__Group_1_1__0_in_rule__MultString__Alternatives_11392);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:642:1: rule__ClassType__Group__0 : rule__ClassType__Group__0__Impl rule__ClassType__Group__1 ;
    public final void rule__ClassType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:646:1: ( rule__ClassType__Group__0__Impl rule__ClassType__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:647:2: rule__ClassType__Group__0__Impl rule__ClassType__Group__1
            {
            pushFollow(FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01423);
            rule__ClassType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01426);
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
            match(input,22,FOLLOW_22_in_rule__ClassType__Group__0__Impl1454); 
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
            pushFollow(FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11485);
            rule__ClassType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11488);
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
            pushFollow(FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1515);
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
            pushFollow(FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21545);
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
            	    pushFollow(FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1572);
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
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01609);
            rule__ClassType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01612);
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
            match(input,23,FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1640); 
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
            pushFollow(FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11671);
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
            pushFollow(FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1698);
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
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__01732);
            rule__ClassType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__01735);
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
            match(input,24,FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl1763); 
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
            pushFollow(FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__11794);
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
            pushFollow(FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl1821);
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
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__01855);
            rule__ClassType__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__01858);
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
            match(input,25,FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl1886); 
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
            pushFollow(FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__11917);
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
            pushFollow(FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl1944);
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
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01978);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01981);
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
            match(input,26,FOLLOW_26_in_rule__Procedure__Group__0__Impl2009); 
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
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12040);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12043);
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
            pushFollow(FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2070);
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
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22100);
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
            	    pushFollow(FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2127);
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
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02164);
            rule__Procedure__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02167);
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
            match(input,23,FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2195); 
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
            pushFollow(FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12226);
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
            pushFollow(FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2253);
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
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02287);
            rule__Procedure__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02290);
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
            match(input,24,FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2318); 
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
            pushFollow(FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12349);
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
            pushFollow(FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2376);
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
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02410);
            rule__Procedure__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02413);
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
            match(input,27,FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2441); 
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
            pushFollow(FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12472);
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
            pushFollow(FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2499);
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
            pushFollow(FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02533);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02536);
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
            match(input,28,FOLLOW_28_in_rule__Statement__Group__0__Impl2564); 
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
            pushFollow(FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12595);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12598);
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
            pushFollow(FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2625);
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
            pushFollow(FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22655);
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
            pushFollow(FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2682);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02718);
            rule__Statement__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02721);
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
            match(input,29,FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl2749); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__12780);
            rule__Statement__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__12783);
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
            pushFollow(FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl2810);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__22840);
            rule__Statement__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__22843);
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
            match(input,30,FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl2871); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__32902);
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
            pushFollow(FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl2929);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__02967);
            rule__Statement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__02970);
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
            match(input,31,FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl2998); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13029);
            rule__Statement__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13032);
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
            pushFollow(FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3059);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23089);
            rule__Statement__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23092);
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
            match(input,32,FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3120); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33151);
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
            pushFollow(FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3178);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03216);
            rule__Statement__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03219);
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
            match(input,33,FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3247); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13278);
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
            pushFollow(FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3305);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03339);
            rule__Statement__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03342);
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
            match(input,34,FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3370); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13401);
            rule__Statement__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13404);
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
            pushFollow(FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3431);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23461);
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
                    pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3488);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03525);
            rule__Statement__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03528);
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
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3556); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13587);
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
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3614);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03648);
            rule__Statement__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03651);
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
            match(input,36,FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3679); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13710);
            rule__Statement__Group_2_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13713);
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
            pushFollow(FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl3740);
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
            pushFollow(FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__23770);
            rule__Statement__Group_2_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__23773);
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
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl3801); 
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
            pushFollow(FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__33832);
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
            pushFollow(FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl3859);
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
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03897);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03900);
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
            match(input,37,FOLLOW_37_in_rule__Expression__Group__0__Impl3928); 
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
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13959);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__13962);
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
            pushFollow(FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl3989);
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
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24019);
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
            	    pushFollow(FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4046);
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
            pushFollow(FOLLOW_rule__Precidence__Group_0__0__Impl_in_rule__Precidence__Group_0__04083);
            rule__Precidence__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_0__1_in_rule__Precidence__Group_0__04086);
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
            match(input,23,FOLLOW_23_in_rule__Precidence__Group_0__0__Impl4114); 
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
            pushFollow(FOLLOW_rule__Precidence__Group_0__1__Impl_in_rule__Precidence__Group_0__14145);
            rule__Precidence__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_0__2_in_rule__Precidence__Group_0__14148);
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
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_0_1_in_rule__Precidence__Group_0__1__Impl4175);
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
            pushFollow(FOLLOW_rule__Precidence__Group_0__2__Impl_in_rule__Precidence__Group_0__24205);
            rule__Precidence__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_0__3_in_rule__Precidence__Group_0__24208);
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
            pushFollow(FOLLOW_rule__Precidence__PrefixAssignment_0_2_in_rule__Precidence__Group_0__2__Impl4235);
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
            pushFollow(FOLLOW_rule__Precidence__Group_0__3__Impl_in_rule__Precidence__Group_0__34265);
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
            pushFollow(FOLLOW_rule__Precidence__Par1Assignment_0_3_in_rule__Precidence__Group_0__3__Impl4292);
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
            pushFollow(FOLLOW_rule__Precidence__Group_1__0__Impl_in_rule__Precidence__Group_1__04330);
            rule__Precidence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_1__1_in_rule__Precidence__Group_1__04333);
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
            match(input,24,FOLLOW_24_in_rule__Precidence__Group_1__0__Impl4361); 
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
            pushFollow(FOLLOW_rule__Precidence__Group_1__1__Impl_in_rule__Precidence__Group_1__14392);
            rule__Precidence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_1__2_in_rule__Precidence__Group_1__14395);
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
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_1_1_in_rule__Precidence__Group_1__1__Impl4422);
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
            pushFollow(FOLLOW_rule__Precidence__Group_1__2__Impl_in_rule__Precidence__Group_1__24452);
            rule__Precidence__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_1__3_in_rule__Precidence__Group_1__24455);
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
            pushFollow(FOLLOW_rule__Precidence__Par1Assignment_1_2_in_rule__Precidence__Group_1__2__Impl4482);
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
            pushFollow(FOLLOW_rule__Precidence__Group_1__3__Impl_in_rule__Precidence__Group_1__34512);
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
            pushFollow(FOLLOW_rule__Precidence__SuffixAssignment_1_3_in_rule__Precidence__Group_1__3__Impl4539);
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
            pushFollow(FOLLOW_rule__Precidence__Group_2__0__Impl_in_rule__Precidence__Group_2__04577);
            rule__Precidence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_2__1_in_rule__Precidence__Group_2__04580);
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
            match(input,38,FOLLOW_38_in_rule__Precidence__Group_2__0__Impl4608); 
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
            pushFollow(FOLLOW_rule__Precidence__Group_2__1__Impl_in_rule__Precidence__Group_2__14639);
            rule__Precidence__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_2__2_in_rule__Precidence__Group_2__14642);
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
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_2_1_in_rule__Precidence__Group_2__1__Impl4669);
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
            pushFollow(FOLLOW_rule__Precidence__Group_2__2__Impl_in_rule__Precidence__Group_2__24699);
            rule__Precidence__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_2__3_in_rule__Precidence__Group_2__24702);
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
            pushFollow(FOLLOW_rule__Precidence__Par1Assignment_2_2_in_rule__Precidence__Group_2__2__Impl4729);
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
            pushFollow(FOLLOW_rule__Precidence__Group_2__3__Impl_in_rule__Precidence__Group_2__34759);
            rule__Precidence__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_2__4_in_rule__Precidence__Group_2__34762);
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
            pushFollow(FOLLOW_rule__Precidence__InfixAssignment_2_3_in_rule__Precidence__Group_2__3__Impl4789);
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
            pushFollow(FOLLOW_rule__Precidence__Group_2__4__Impl_in_rule__Precidence__Group_2__44819);
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
            pushFollow(FOLLOW_rule__Precidence__Par2Assignment_2_4_in_rule__Precidence__Group_2__4__Impl4846);
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
            pushFollow(FOLLOW_rule__Precidence__Group_3__0__Impl_in_rule__Precidence__Group_3__04886);
            rule__Precidence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_3__1_in_rule__Precidence__Group_3__04889);
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
            match(input,39,FOLLOW_39_in_rule__Precidence__Group_3__0__Impl4917); 
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
            pushFollow(FOLLOW_rule__Precidence__Group_3__1__Impl_in_rule__Precidence__Group_3__14948);
            rule__Precidence__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_3__2_in_rule__Precidence__Group_3__14951);
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
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_3_1_in_rule__Precidence__Group_3__1__Impl4978);
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
            pushFollow(FOLLOW_rule__Precidence__Group_3__2__Impl_in_rule__Precidence__Group_3__25008);
            rule__Precidence__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_3__3_in_rule__Precidence__Group_3__25011);
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
            pushFollow(FOLLOW_rule__Precidence__Par1Assignment_3_2_in_rule__Precidence__Group_3__2__Impl5038);
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
            pushFollow(FOLLOW_rule__Precidence__Group_3__3__Impl_in_rule__Precidence__Group_3__35068);
            rule__Precidence__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_3__4_in_rule__Precidence__Group_3__35071);
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
            pushFollow(FOLLOW_rule__Precidence__InfixleftAssignment_3_3_in_rule__Precidence__Group_3__3__Impl5098);
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
            pushFollow(FOLLOW_rule__Precidence__Group_3__4__Impl_in_rule__Precidence__Group_3__45128);
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
            pushFollow(FOLLOW_rule__Precidence__Par2Assignment_3_4_in_rule__Precidence__Group_3__4__Impl5155);
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
            pushFollow(FOLLOW_rule__Precidence__Group_4__0__Impl_in_rule__Precidence__Group_4__05195);
            rule__Precidence__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_4__1_in_rule__Precidence__Group_4__05198);
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
            match(input,40,FOLLOW_40_in_rule__Precidence__Group_4__0__Impl5226); 
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
            pushFollow(FOLLOW_rule__Precidence__Group_4__1__Impl_in_rule__Precidence__Group_4__15257);
            rule__Precidence__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_4__2_in_rule__Precidence__Group_4__15260);
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
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_4_1_in_rule__Precidence__Group_4__1__Impl5287);
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
            pushFollow(FOLLOW_rule__Precidence__Group_4__2__Impl_in_rule__Precidence__Group_4__25317);
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
            pushFollow(FOLLOW_rule__Precidence__LiteralAssignment_4_2_in_rule__Precidence__Group_4__2__Impl5344);
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
            pushFollow(FOLLOW_rule__Precidence__Group_5__0__Impl_in_rule__Precidence__Group_5__05380);
            rule__Precidence__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_5__1_in_rule__Precidence__Group_5__05383);
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
            match(input,41,FOLLOW_41_in_rule__Precidence__Group_5__0__Impl5411); 
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
            pushFollow(FOLLOW_rule__Precidence__Group_5__1__Impl_in_rule__Precidence__Group_5__15442);
            rule__Precidence__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_5__2_in_rule__Precidence__Group_5__15445);
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
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_5_1_in_rule__Precidence__Group_5__1__Impl5472);
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
            pushFollow(FOLLOW_rule__Precidence__Group_5__2__Impl_in_rule__Precidence__Group_5__25502);
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
            pushFollow(FOLLOW_rule__Precidence__BracketAssignment_5_2_in_rule__Precidence__Group_5__2__Impl5529);
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
            pushFollow(FOLLOW_rule__Precidence__Group_6__0__Impl_in_rule__Precidence__Group_6__05565);
            rule__Precidence__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_6__1_in_rule__Precidence__Group_6__05568);
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
            match(input,11,FOLLOW_11_in_rule__Precidence__Group_6__0__Impl5596); 
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
            pushFollow(FOLLOW_rule__Precidence__Group_6__1__Impl_in_rule__Precidence__Group_6__15627);
            rule__Precidence__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_6__2_in_rule__Precidence__Group_6__15630);
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
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_6_1_in_rule__Precidence__Group_6__1__Impl5657);
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
            pushFollow(FOLLOW_rule__Precidence__Group_6__2__Impl_in_rule__Precidence__Group_6__25687);
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
            pushFollow(FOLLOW_rule__Precidence__BracesAssignment_6_2_in_rule__Precidence__Group_6__2__Impl5714);
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
            pushFollow(FOLLOW_rule__Precidence__Group_7__0__Impl_in_rule__Precidence__Group_7__05750);
            rule__Precidence__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_7__1_in_rule__Precidence__Group_7__05753);
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
            match(input,42,FOLLOW_42_in_rule__Precidence__Group_7__0__Impl5781); 
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
            pushFollow(FOLLOW_rule__Precidence__Group_7__1__Impl_in_rule__Precidence__Group_7__15812);
            rule__Precidence__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Precidence__Group_7__2_in_rule__Precidence__Group_7__15815);
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
            pushFollow(FOLLOW_rule__Precidence__RuleAssignment_7_1_in_rule__Precidence__Group_7__1__Impl5842);
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
            pushFollow(FOLLOW_rule__Precidence__Group_7__2__Impl_in_rule__Precidence__Group_7__25872);
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
            pushFollow(FOLLOW_rule__Precidence__ParenthesisAssignment_7_2_in_rule__Precidence__Group_7__2__Impl5899);
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


    // $ANTLR start "rule__MultID__Group__0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2935:1: rule__MultID__Group__0 : rule__MultID__Group__0__Impl rule__MultID__Group__1 ;
    public final void rule__MultID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2939:1: ( rule__MultID__Group__0__Impl rule__MultID__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2940:2: rule__MultID__Group__0__Impl rule__MultID__Group__1
            {
            pushFollow(FOLLOW_rule__MultID__Group__0__Impl_in_rule__MultID__Group__05935);
            rule__MultID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group__1_in_rule__MultID__Group__05938);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2947:1: rule__MultID__Group__0__Impl : ( () ) ;
    public final void rule__MultID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2951:1: ( ( () ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2952:1: ( () )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2952:1: ( () )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2953:1: ()
            {
             before(grammarAccess.getMultIDAccess().getMultIDAction_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2954:1: ()
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2956:1: 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2966:1: rule__MultID__Group__1 : rule__MultID__Group__1__Impl ;
    public final void rule__MultID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2970:1: ( rule__MultID__Group__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2971:2: rule__MultID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group__1__Impl_in_rule__MultID__Group__15996);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2977:1: rule__MultID__Group__1__Impl : ( ( rule__MultID__Alternatives_1 ) ) ;
    public final void rule__MultID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2981:1: ( ( ( rule__MultID__Alternatives_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2982:1: ( ( rule__MultID__Alternatives_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2982:1: ( ( rule__MultID__Alternatives_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2983:1: ( rule__MultID__Alternatives_1 )
            {
             before(grammarAccess.getMultIDAccess().getAlternatives_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2984:1: ( rule__MultID__Alternatives_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2984:2: rule__MultID__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MultID__Alternatives_1_in_rule__MultID__Group__1__Impl6023);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:2998:1: rule__MultID__Group_1_1__0 : rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1 ;
    public final void rule__MultID__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3002:1: ( rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3003:2: rule__MultID__Group_1_1__0__Impl rule__MultID__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__0__Impl_in_rule__MultID__Group_1_1__06057);
            rule__MultID__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1_1__1_in_rule__MultID__Group_1_1__06060);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3010:1: rule__MultID__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__MultID__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3014:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3015:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3015:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3016:1: '['
            {
             before(grammarAccess.getMultIDAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,43,FOLLOW_43_in_rule__MultID__Group_1_1__0__Impl6088); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3029:1: rule__MultID__Group_1_1__1 : rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2 ;
    public final void rule__MultID__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3033:1: ( rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3034:2: rule__MultID__Group_1_1__1__Impl rule__MultID__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__1__Impl_in_rule__MultID__Group_1_1__16119);
            rule__MultID__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultID__Group_1_1__2_in_rule__MultID__Group_1_1__16122);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3041:1: rule__MultID__Group_1_1__1__Impl : ( ( rule__MultID__MiAssignment_1_1_1 )* ) ;
    public final void rule__MultID__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3045:1: ( ( ( rule__MultID__MiAssignment_1_1_1 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3046:1: ( ( rule__MultID__MiAssignment_1_1_1 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3046:1: ( ( rule__MultID__MiAssignment_1_1_1 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3047:1: ( rule__MultID__MiAssignment_1_1_1 )*
            {
             before(grammarAccess.getMultIDAccess().getMiAssignment_1_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3048:1: ( rule__MultID__MiAssignment_1_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3048:2: rule__MultID__MiAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MultID__MiAssignment_1_1_1_in_rule__MultID__Group_1_1__1__Impl6149);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3058:1: rule__MultID__Group_1_1__2 : rule__MultID__Group_1_1__2__Impl ;
    public final void rule__MultID__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3062:1: ( rule__MultID__Group_1_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3063:2: rule__MultID__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultID__Group_1_1__2__Impl_in_rule__MultID__Group_1_1__26180);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3069:1: rule__MultID__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__MultID__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3073:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3074:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3074:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3075:1: ']'
            {
             before(grammarAccess.getMultIDAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,44,FOLLOW_44_in_rule__MultID__Group_1_1__2__Impl6208); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3094:1: rule__MultString__Group__0 : rule__MultString__Group__0__Impl rule__MultString__Group__1 ;
    public final void rule__MultString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3098:1: ( rule__MultString__Group__0__Impl rule__MultString__Group__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3099:2: rule__MultString__Group__0__Impl rule__MultString__Group__1
            {
            pushFollow(FOLLOW_rule__MultString__Group__0__Impl_in_rule__MultString__Group__06245);
            rule__MultString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group__1_in_rule__MultString__Group__06248);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3106:1: rule__MultString__Group__0__Impl : ( () ) ;
    public final void rule__MultString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3110:1: ( ( () ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3111:1: ( () )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3111:1: ( () )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3112:1: ()
            {
             before(grammarAccess.getMultStringAccess().getMultStringAction_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3113:1: ()
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3115:1: 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3125:1: rule__MultString__Group__1 : rule__MultString__Group__1__Impl ;
    public final void rule__MultString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3129:1: ( rule__MultString__Group__1__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3130:2: rule__MultString__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group__1__Impl_in_rule__MultString__Group__16306);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3136:1: rule__MultString__Group__1__Impl : ( ( rule__MultString__Alternatives_1 ) ) ;
    public final void rule__MultString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3140:1: ( ( ( rule__MultString__Alternatives_1 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3141:1: ( ( rule__MultString__Alternatives_1 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3141:1: ( ( rule__MultString__Alternatives_1 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3142:1: ( rule__MultString__Alternatives_1 )
            {
             before(grammarAccess.getMultStringAccess().getAlternatives_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3143:1: ( rule__MultString__Alternatives_1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3143:2: rule__MultString__Alternatives_1
            {
            pushFollow(FOLLOW_rule__MultString__Alternatives_1_in_rule__MultString__Group__1__Impl6333);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3157:1: rule__MultString__Group_1_1__0 : rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1 ;
    public final void rule__MultString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3161:1: ( rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3162:2: rule__MultString__Group_1_1__0__Impl rule__MultString__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__0__Impl_in_rule__MultString__Group_1_1__06367);
            rule__MultString__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1_1__1_in_rule__MultString__Group_1_1__06370);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3169:1: rule__MultString__Group_1_1__0__Impl : ( '[' ) ;
    public final void rule__MultString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3173:1: ( ( '[' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3174:1: ( '[' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3174:1: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3175:1: '['
            {
             before(grammarAccess.getMultStringAccess().getLeftSquareBracketKeyword_1_1_0()); 
            match(input,43,FOLLOW_43_in_rule__MultString__Group_1_1__0__Impl6398); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3188:1: rule__MultString__Group_1_1__1 : rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2 ;
    public final void rule__MultString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3192:1: ( rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3193:2: rule__MultString__Group_1_1__1__Impl rule__MultString__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__1__Impl_in_rule__MultString__Group_1_1__16429);
            rule__MultString__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultString__Group_1_1__2_in_rule__MultString__Group_1_1__16432);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3200:1: rule__MultString__Group_1_1__1__Impl : ( ( rule__MultString__MsAssignment_1_1_1 )* ) ;
    public final void rule__MultString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3204:1: ( ( ( rule__MultString__MsAssignment_1_1_1 )* ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3205:1: ( ( rule__MultString__MsAssignment_1_1_1 )* )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3205:1: ( ( rule__MultString__MsAssignment_1_1_1 )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3206:1: ( rule__MultString__MsAssignment_1_1_1 )*
            {
             before(grammarAccess.getMultStringAccess().getMsAssignment_1_1_1()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3207:1: ( rule__MultString__MsAssignment_1_1_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3207:2: rule__MultString__MsAssignment_1_1_1
            	    {
            	    pushFollow(FOLLOW_rule__MultString__MsAssignment_1_1_1_in_rule__MultString__Group_1_1__1__Impl6459);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3217:1: rule__MultString__Group_1_1__2 : rule__MultString__Group_1_1__2__Impl ;
    public final void rule__MultString__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3221:1: ( rule__MultString__Group_1_1__2__Impl )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3222:2: rule__MultString__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MultString__Group_1_1__2__Impl_in_rule__MultString__Group_1_1__26490);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3228:1: rule__MultString__Group_1_1__2__Impl : ( ']' ) ;
    public final void rule__MultString__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3232:1: ( ( ']' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3233:1: ( ']' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3233:1: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3234:1: ']'
            {
             before(grammarAccess.getMultStringAccess().getRightSquareBracketKeyword_1_1_2()); 
            match(input,44,FOLLOW_44_in_rule__MultString__Group_1_1__2__Impl6518); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3254:1: rule__Model__ClasAssignment_0 : ( ruleClassType ) ;
    public final void rule__Model__ClasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3258:1: ( ( ruleClassType ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3259:1: ( ruleClassType )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3259:1: ( ruleClassType )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3260:1: ruleClassType
            {
             before(grammarAccess.getModelAccess().getClasClassTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_06560);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3269:1: rule__Model__ProcAssignment_1 : ( ruleProcedure ) ;
    public final void rule__Model__ProcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3273:1: ( ( ruleProcedure ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3274:1: ( ruleProcedure )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3274:1: ( ruleProcedure )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3275:1: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getProcProcedureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_16591);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3284:1: rule__Model__StatemAssignment_2 : ( ruleStatement ) ;
    public final void rule__Model__StatemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3288:1: ( ( ruleStatement ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3289:1: ( ruleStatement )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3289:1: ( ruleStatement )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3290:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatemStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_26622);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3299:1: rule__Model__ExpAssignment_3 : ( ruleExpression ) ;
    public final void rule__Model__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3303:1: ( ( ruleExpression ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3304:1: ( ruleExpression )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3304:1: ( ruleExpression )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3305:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_36653);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3314:1: rule__ClassType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3318:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3319:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3319:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3320:1: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_16684); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3329:1: rule__ClassType__NoclassAssignment_2_0 : ( ( 'noclass' ) ) ;
    public final void rule__ClassType__NoclassAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3333:1: ( ( ( 'noclass' ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3334:1: ( ( 'noclass' ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3334:1: ( ( 'noclass' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3335:1: ( 'noclass' )
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3336:1: ( 'noclass' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3337:1: 'noclass'
            {
             before(grammarAccess.getClassTypeAccess().getNoclassNoclassKeyword_2_0_0()); 
            match(input,45,FOLLOW_45_in_rule__ClassType__NoclassAssignment_2_06720); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3352:1: rule__ClassType__PrefixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__ClassType__PrefixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3356:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3357:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3357:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3358:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getPrefixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_16759);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3367:1: rule__ClassType__SuffixAssignment_2_2_1 : ( ruleMultID ) ;
    public final void rule__ClassType__SuffixAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3371:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3372:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3372:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3373:1: ruleMultID
            {
             before(grammarAccess.getClassTypeAccess().getSuffixMultIDParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_16790);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3382:1: rule__ClassType__BlockingAssignment_2_3_1 : ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) ;
    public final void rule__ClassType__BlockingAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3386:1: ( ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3387:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3387:1: ( ( rule__ClassType__BlockingAlternatives_2_3_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3388:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            {
             before(grammarAccess.getClassTypeAccess().getBlockingAlternatives_2_3_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3389:1: ( rule__ClassType__BlockingAlternatives_2_3_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3389:2: rule__ClassType__BlockingAlternatives_2_3_1_0
            {
            pushFollow(FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_16821);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3398:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3402:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3403:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3403:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3404:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_16854); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3413:1: rule__Procedure__PrefixAssignment_2_0_1 : ( ruleMultID ) ;
    public final void rule__Procedure__PrefixAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3417:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3418:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3418:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3419:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getPrefixMultIDParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_16885);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3428:1: rule__Procedure__SuffixAssignment_2_1_1 : ( ruleMultID ) ;
    public final void rule__Procedure__SuffixAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3432:1: ( ( ruleMultID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3433:1: ( ruleMultID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3433:1: ( ruleMultID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3434:1: ruleMultID
            {
             before(grammarAccess.getProcedureAccess().getSuffixMultIDParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_16916);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3443:1: rule__Procedure__TypesAssignment_2_2_1 : ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) ;
    public final void rule__Procedure__TypesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3447:1: ( ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3448:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3448:1: ( ( rule__Procedure__TypesAlternatives_2_2_1_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3449:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            {
             before(grammarAccess.getProcedureAccess().getTypesAlternatives_2_2_1_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3450:1: ( rule__Procedure__TypesAlternatives_2_2_1_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3450:2: rule__Procedure__TypesAlternatives_2_2_1_0
            {
            pushFollow(FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_16947);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3459:1: rule__Statement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3463:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3464:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3464:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3465:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_16980); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3474:1: rule__Statement__RepAssignment_2_0_1 : ( RULE_ID ) ;
    public final void rule__Statement__RepAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3478:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3479:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3479:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3480:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getRepIDTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_17011); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3489:1: rule__Statement__UntilAssignment_2_0_3 : ( RULE_ID ) ;
    public final void rule__Statement__UntilAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3493:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3494:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3494:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3495:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getUntilIDTerminalRuleCall_2_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_37042); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3504:1: rule__Statement__WhileAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Statement__WhileAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3508:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3509:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3509:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3510:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getWhileIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_17073); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3519:1: rule__Statement__DoAssignment_2_1_3 : ( RULE_ID ) ;
    public final void rule__Statement__DoAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3523:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3524:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3524:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3525:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getDoIDTerminalRuleCall_2_1_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_37104); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3534:1: rule__Statement__ForAssignment_2_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ForAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3538:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3539:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3539:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3540:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getForIDTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_17135); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3549:1: rule__Statement__VarAssignment_2_3_1 : ( RULE_ID ) ;
    public final void rule__Statement__VarAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3553:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3554:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3554:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3555:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getVarIDTerminalRuleCall_2_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_17166); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3564:1: rule__Statement__ExAssignment_2_3_2_1 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3568:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3569:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3569:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3570:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_17197); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3579:1: rule__Statement__ValAssignment_2_4_1 : ( RULE_ID ) ;
    public final void rule__Statement__ValAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3583:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3584:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3584:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3585:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getValIDTerminalRuleCall_2_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_17228); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3594:1: rule__Statement__ExAssignment_2_4_3 : ( RULE_ID ) ;
    public final void rule__Statement__ExAssignment_2_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3598:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3599:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3599:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3600:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getExIDTerminalRuleCall_2_4_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_37259); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3609:1: rule__Expression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3613:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3614:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3614:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3615:1: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_17290); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3624:1: rule__Expression__PrecAssignment_2 : ( rulePrecidence ) ;
    public final void rule__Expression__PrecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3628:1: ( ( rulePrecidence ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3629:1: ( rulePrecidence )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3629:1: ( rulePrecidence )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3630:1: rulePrecidence
            {
             before(grammarAccess.getExpressionAccess().getPrecPrecidenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrecidence_in_rule__Expression__PrecAssignment_27321);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3639:1: rule__Precidence__RuleAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3643:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3644:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3644:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3645:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_0_17352); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3654:1: rule__Precidence__PrefixAssignment_0_2 : ( ruleMultString ) ;
    public final void rule__Precidence__PrefixAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3658:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3659:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3659:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3660:1: ruleMultString
            {
             before(grammarAccess.getPrecidenceAccess().getPrefixMultStringParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precidence__PrefixAssignment_0_27383);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3669:1: rule__Precidence__Par1Assignment_0_3 : ( RULE_ID ) ;
    public final void rule__Precidence__Par1Assignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3673:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3674:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3674:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3675:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_0_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_0_37414); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3684:1: rule__Precidence__RuleAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3688:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3689:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3689:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3690:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_1_17445); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3699:1: rule__Precidence__Par1Assignment_1_2 : ( RULE_ID ) ;
    public final void rule__Precidence__Par1Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3703:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3704:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3704:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3705:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_1_27476); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3714:1: rule__Precidence__SuffixAssignment_1_3 : ( ruleMultString ) ;
    public final void rule__Precidence__SuffixAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3718:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3719:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3719:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3720:1: ruleMultString
            {
             before(grammarAccess.getPrecidenceAccess().getSuffixMultStringParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precidence__SuffixAssignment_1_37507);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3729:1: rule__Precidence__RuleAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3733:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3734:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3734:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3735:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_2_17538); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3744:1: rule__Precidence__Par1Assignment_2_2 : ( RULE_ID ) ;
    public final void rule__Precidence__Par1Assignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3748:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3749:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3749:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3750:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_2_27569); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3759:1: rule__Precidence__InfixAssignment_2_3 : ( ruleMultString ) ;
    public final void rule__Precidence__InfixAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3763:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3764:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3764:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3765:1: ruleMultString
            {
             before(grammarAccess.getPrecidenceAccess().getInfixMultStringParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precidence__InfixAssignment_2_37600);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3774:1: rule__Precidence__Par2Assignment_2_4 : ( RULE_ID ) ;
    public final void rule__Precidence__Par2Assignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3778:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3779:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3779:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3780:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar2IDTerminalRuleCall_2_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par2Assignment_2_47631); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3789:1: rule__Precidence__RuleAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3793:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3794:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3794:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3795:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_3_17662); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3804:1: rule__Precidence__Par1Assignment_3_2 : ( RULE_ID ) ;
    public final void rule__Precidence__Par1Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3808:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3809:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3809:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3810:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar1IDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_3_27693); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3819:1: rule__Precidence__InfixleftAssignment_3_3 : ( ruleMultString ) ;
    public final void rule__Precidence__InfixleftAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3823:1: ( ( ruleMultString ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3824:1: ( ruleMultString )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3824:1: ( ruleMultString )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3825:1: ruleMultString
            {
             before(grammarAccess.getPrecidenceAccess().getInfixleftMultStringParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_ruleMultString_in_rule__Precidence__InfixleftAssignment_3_37724);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3834:1: rule__Precidence__Par2Assignment_3_4 : ( RULE_ID ) ;
    public final void rule__Precidence__Par2Assignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3838:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3839:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3839:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3840:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getPar2IDTerminalRuleCall_3_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__Par2Assignment_3_47755); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3849:1: rule__Precidence__RuleAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3853:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3854:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3854:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3855:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_4_17786); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3864:1: rule__Precidence__LiteralAssignment_4_2 : ( ( rule__Precidence__LiteralAlternatives_4_2_0 ) ) ;
    public final void rule__Precidence__LiteralAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3868:1: ( ( ( rule__Precidence__LiteralAlternatives_4_2_0 ) ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3869:1: ( ( rule__Precidence__LiteralAlternatives_4_2_0 ) )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3869:1: ( ( rule__Precidence__LiteralAlternatives_4_2_0 ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3870:1: ( rule__Precidence__LiteralAlternatives_4_2_0 )
            {
             before(grammarAccess.getPrecidenceAccess().getLiteralAlternatives_4_2_0()); 
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3871:1: ( rule__Precidence__LiteralAlternatives_4_2_0 )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3871:2: rule__Precidence__LiteralAlternatives_4_2_0
            {
            pushFollow(FOLLOW_rule__Precidence__LiteralAlternatives_4_2_0_in_rule__Precidence__LiteralAssignment_4_27817);
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3880:1: rule__Precidence__RuleAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3884:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3885:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3885:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3886:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_5_17850); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3895:1: rule__Precidence__BracketAssignment_5_2 : ( RULE_ID ) ;
    public final void rule__Precidence__BracketAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3899:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3900:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3900:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3901:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getBracketIDTerminalRuleCall_5_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__BracketAssignment_5_27881); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3910:1: rule__Precidence__RuleAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3914:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3915:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3915:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3916:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_6_17912); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3925:1: rule__Precidence__BracesAssignment_6_2 : ( RULE_ID ) ;
    public final void rule__Precidence__BracesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3929:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3930:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3930:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3931:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getBracesIDTerminalRuleCall_6_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__BracesAssignment_6_27943); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3940:1: rule__Precidence__RuleAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Precidence__RuleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3944:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3945:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3945:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3946:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getRuleIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_7_17974); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3955:1: rule__Precidence__ParenthesisAssignment_7_2 : ( RULE_ID ) ;
    public final void rule__Precidence__ParenthesisAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3959:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3960:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3960:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3961:1: RULE_ID
            {
             before(grammarAccess.getPrecidenceAccess().getParenthesisIDTerminalRuleCall_7_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precidence__ParenthesisAssignment_7_28005); 
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


    // $ANTLR start "rule__MultID__MiAssignment_1_0"
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3970:1: rule__MultID__MiAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__MultID__MiAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3974:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3975:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3975:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3976:1: RULE_ID
            {
             before(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_08036); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3985:1: rule__MultID__MiAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__MultID__MiAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3989:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3990:1: ( RULE_ID )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3990:1: ( RULE_ID )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:3991:1: RULE_ID
            {
             before(grammarAccess.getMultIDAccess().getMiIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_1_18067); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4000:1: rule__MultString__MsAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__MultString__MsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4004:1: ( ( RULE_STRING ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4005:1: ( RULE_STRING )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4005:1: ( RULE_STRING )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4006:1: RULE_STRING
            {
             before(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_08098); 
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
    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4015:1: rule__MultString__MsAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__MultString__MsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4019:1: ( ( RULE_STRING ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4020:1: ( RULE_STRING )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4020:1: ( RULE_STRING )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:4021:1: RULE_STRING
            {
             before(grammarAccess.getMultStringAccess().getMsSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_1_18129); 
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
    public static final BitSet FOLLOW_rulePrecidence_in_entryRulePrecidence362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecidence369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Alternatives_in_rulePrecidence395 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__MultID__MiAssignment_1_0_in_rule__MultID__Alternatives_11323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__0_in_rule__MultID__Alternatives_11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__MsAssignment_1_0_in_rule__MultString__Alternatives_11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__0_in_rule__MultString__Alternatives_11392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__0__Impl_in_rule__ClassType__Group__01423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1_in_rule__ClassType__Group__01426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClassType__Group__0__Impl1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__1__Impl_in_rule__ClassType__Group__11485 = new BitSet(new long[]{0x0000200003800000L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2_in_rule__ClassType__Group__11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__NameAssignment_1_in_rule__ClassType__Group__1__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group__2__Impl_in_rule__ClassType__Group__21545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Alternatives_2_in_rule__ClassType__Group__2__Impl1572 = new BitSet(new long[]{0x0000200003800002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__0__Impl_in_rule__ClassType__Group_2_1__01609 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1_in_rule__ClassType__Group_2_1__01612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ClassType__Group_2_1__0__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_1__1__Impl_in_rule__ClassType__Group_2_1__11671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__PrefixAssignment_2_1_1_in_rule__ClassType__Group_2_1__1__Impl1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__0__Impl_in_rule__ClassType__Group_2_2__01732 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1_in_rule__ClassType__Group_2_2__01735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ClassType__Group_2_2__0__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_2__1__Impl_in_rule__ClassType__Group_2_2__11794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__SuffixAssignment_2_2_1_in_rule__ClassType__Group_2_2__1__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__0__Impl_in_rule__ClassType__Group_2_3__01855 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1_in_rule__ClassType__Group_2_3__01858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ClassType__Group_2_3__0__Impl1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__Group_2_3__1__Impl_in_rule__ClassType__Group_2_3__11917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAssignment_2_3_1_in_rule__ClassType__Group_2_3__1__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__01978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__01981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Procedure__Group__0__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12040 = new BitSet(new long[]{0x0000000009800000L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__NameAssignment_1_in_rule__Procedure__Group__1__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Alternatives_2_in_rule__Procedure__Group__2__Impl2127 = new BitSet(new long[]{0x0000000009800002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__0__Impl_in_rule__Procedure__Group_2_0__02164 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1_in_rule__Procedure__Group_2_0__02167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Procedure__Group_2_0__0__Impl2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_0__1__Impl_in_rule__Procedure__Group_2_0__12226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__PrefixAssignment_2_0_1_in_rule__Procedure__Group_2_0__1__Impl2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__0__Impl_in_rule__Procedure__Group_2_1__02287 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1_in_rule__Procedure__Group_2_1__02290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Procedure__Group_2_1__0__Impl2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_1__1__Impl_in_rule__Procedure__Group_2_1__12349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__SuffixAssignment_2_1_1_in_rule__Procedure__Group_2_1__1__Impl2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__0__Impl_in_rule__Procedure__Group_2_2__02410 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1_in_rule__Procedure__Group_2_2__02413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Procedure__Group_2_2__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group_2_2__1__Impl_in_rule__Procedure__Group_2_2__12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAssignment_2_2_1_in_rule__Procedure__Group_2_2__1__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__0__Impl_in_rule__Statement__Group__02533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group__1_in_rule__Statement__Group__02536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Statement__Group__0__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__1__Impl_in_rule__Statement__Group__12595 = new BitSet(new long[]{0x00000016A0000000L});
    public static final BitSet FOLLOW_rule__Statement__Group__2_in_rule__Statement__Group__12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_1_in_rule__Statement__Group__1__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group__2__Impl_in_rule__Statement__Group__22655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_2_in_rule__Statement__Group__2__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__0__Impl_in_rule__Statement__Group_2_0__02718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1_in_rule__Statement__Group_2_0__02721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Statement__Group_2_0__0__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__1__Impl_in_rule__Statement__Group_2_0__12780 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2_in_rule__Statement__Group_2_0__12783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__RepAssignment_2_0_1_in_rule__Statement__Group_2_0__1__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__2__Impl_in_rule__Statement__Group_2_0__22840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3_in_rule__Statement__Group_2_0__22843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_2_0__2__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_0__3__Impl_in_rule__Statement__Group_2_0__32902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__UntilAssignment_2_0_3_in_rule__Statement__Group_2_0__3__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__0__Impl_in_rule__Statement__Group_2_1__02967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1_in_rule__Statement__Group_2_1__02970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_2_1__0__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__1__Impl_in_rule__Statement__Group_2_1__13029 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2_in_rule__Statement__Group_2_1__13032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__WhileAssignment_2_1_1_in_rule__Statement__Group_2_1__1__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__2__Impl_in_rule__Statement__Group_2_1__23089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3_in_rule__Statement__Group_2_1__23092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_2_1__2__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_1__3__Impl_in_rule__Statement__Group_2_1__33151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__DoAssignment_2_1_3_in_rule__Statement__Group_2_1__3__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__0__Impl_in_rule__Statement__Group_2_2__03216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1_in_rule__Statement__Group_2_2__03219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_2_2__0__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_2__1__Impl_in_rule__Statement__Group_2_2__13278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ForAssignment_2_2_1_in_rule__Statement__Group_2_2__1__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__0__Impl_in_rule__Statement__Group_2_3__03339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1_in_rule__Statement__Group_2_3__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_2_3__0__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__1__Impl_in_rule__Statement__Group_2_3__13401 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2_in_rule__Statement__Group_2_3__13404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__VarAssignment_2_3_1_in_rule__Statement__Group_2_3__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3__2__Impl_in_rule__Statement__Group_2_3__23461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0_in_rule__Statement__Group_2_3__2__Impl3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__0__Impl_in_rule__Statement__Group_2_3_2__03525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1_in_rule__Statement__Group_2_3_2__03528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_3_2__0__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_3_2__1__Impl_in_rule__Statement__Group_2_3_2__13587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_3_2_1_in_rule__Statement__Group_2_3_2__1__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__0__Impl_in_rule__Statement__Group_2_4__03648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1_in_rule__Statement__Group_2_4__03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_2_4__0__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__1__Impl_in_rule__Statement__Group_2_4__13710 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2_in_rule__Statement__Group_2_4__13713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ValAssignment_2_4_1_in_rule__Statement__Group_2_4__1__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__2__Impl_in_rule__Statement__Group_2_4__23770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3_in_rule__Statement__Group_2_4__23773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2_4__2__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2_4__3__Impl_in_rule__Statement__Group_2_4__33832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExAssignment_2_4_3_in_rule__Statement__Group_2_4__3__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__03897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__03900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Expression__Group__0__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__13959 = new BitSet(new long[]{0x000007C001800800L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__13962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__NameAssignment_1_in_rule__Expression__Group__1__Impl3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__24019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__PrecAssignment_2_in_rule__Expression__Group__2__Impl4046 = new BitSet(new long[]{0x000007C001800802L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__0__Impl_in_rule__Precidence__Group_0__04083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__1_in_rule__Precidence__Group_0__04086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Precidence__Group_0__0__Impl4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__1__Impl_in_rule__Precidence__Group_0__14145 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__2_in_rule__Precidence__Group_0__14148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_0_1_in_rule__Precidence__Group_0__1__Impl4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__2__Impl_in_rule__Precidence__Group_0__24205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__3_in_rule__Precidence__Group_0__24208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__PrefixAssignment_0_2_in_rule__Precidence__Group_0__2__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_0__3__Impl_in_rule__Precidence__Group_0__34265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par1Assignment_0_3_in_rule__Precidence__Group_0__3__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__0__Impl_in_rule__Precidence__Group_1__04330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__1_in_rule__Precidence__Group_1__04333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Precidence__Group_1__0__Impl4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__1__Impl_in_rule__Precidence__Group_1__14392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__2_in_rule__Precidence__Group_1__14395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_1_1_in_rule__Precidence__Group_1__1__Impl4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__2__Impl_in_rule__Precidence__Group_1__24452 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__3_in_rule__Precidence__Group_1__24455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par1Assignment_1_2_in_rule__Precidence__Group_1__2__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_1__3__Impl_in_rule__Precidence__Group_1__34512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__SuffixAssignment_1_3_in_rule__Precidence__Group_1__3__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__0__Impl_in_rule__Precidence__Group_2__04577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__1_in_rule__Precidence__Group_2__04580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Precidence__Group_2__0__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__1__Impl_in_rule__Precidence__Group_2__14639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__2_in_rule__Precidence__Group_2__14642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_2_1_in_rule__Precidence__Group_2__1__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__2__Impl_in_rule__Precidence__Group_2__24699 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__3_in_rule__Precidence__Group_2__24702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par1Assignment_2_2_in_rule__Precidence__Group_2__2__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__3__Impl_in_rule__Precidence__Group_2__34759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__4_in_rule__Precidence__Group_2__34762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__InfixAssignment_2_3_in_rule__Precidence__Group_2__3__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_2__4__Impl_in_rule__Precidence__Group_2__44819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par2Assignment_2_4_in_rule__Precidence__Group_2__4__Impl4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__0__Impl_in_rule__Precidence__Group_3__04886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__1_in_rule__Precidence__Group_3__04889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Precidence__Group_3__0__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__1__Impl_in_rule__Precidence__Group_3__14948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__2_in_rule__Precidence__Group_3__14951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_3_1_in_rule__Precidence__Group_3__1__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__2__Impl_in_rule__Precidence__Group_3__25008 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__3_in_rule__Precidence__Group_3__25011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par1Assignment_3_2_in_rule__Precidence__Group_3__2__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__3__Impl_in_rule__Precidence__Group_3__35068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__4_in_rule__Precidence__Group_3__35071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__InfixleftAssignment_3_3_in_rule__Precidence__Group_3__3__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_3__4__Impl_in_rule__Precidence__Group_3__45128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Par2Assignment_3_4_in_rule__Precidence__Group_3__4__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__0__Impl_in_rule__Precidence__Group_4__05195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__1_in_rule__Precidence__Group_4__05198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Precidence__Group_4__0__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__1__Impl_in_rule__Precidence__Group_4__15257 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__2_in_rule__Precidence__Group_4__15260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_4_1_in_rule__Precidence__Group_4__1__Impl5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_4__2__Impl_in_rule__Precidence__Group_4__25317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__LiteralAssignment_4_2_in_rule__Precidence__Group_4__2__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__0__Impl_in_rule__Precidence__Group_5__05380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__1_in_rule__Precidence__Group_5__05383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Precidence__Group_5__0__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__1__Impl_in_rule__Precidence__Group_5__15442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__2_in_rule__Precidence__Group_5__15445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_5_1_in_rule__Precidence__Group_5__1__Impl5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_5__2__Impl_in_rule__Precidence__Group_5__25502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__BracketAssignment_5_2_in_rule__Precidence__Group_5__2__Impl5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__0__Impl_in_rule__Precidence__Group_6__05565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__1_in_rule__Precidence__Group_6__05568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Precidence__Group_6__0__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__1__Impl_in_rule__Precidence__Group_6__15627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__2_in_rule__Precidence__Group_6__15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_6_1_in_rule__Precidence__Group_6__1__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_6__2__Impl_in_rule__Precidence__Group_6__25687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__BracesAssignment_6_2_in_rule__Precidence__Group_6__2__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__0__Impl_in_rule__Precidence__Group_7__05750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__1_in_rule__Precidence__Group_7__05753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Precidence__Group_7__0__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__1__Impl_in_rule__Precidence__Group_7__15812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__2_in_rule__Precidence__Group_7__15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__RuleAssignment_7_1_in_rule__Precidence__Group_7__1__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__Group_7__2__Impl_in_rule__Precidence__Group_7__25872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__ParenthesisAssignment_7_2_in_rule__Precidence__Group_7__2__Impl5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__0__Impl_in_rule__MultID__Group__05935 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group__1_in_rule__MultID__Group__05938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group__1__Impl_in_rule__MultID__Group__15996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Alternatives_1_in_rule__MultID__Group__1__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__0__Impl_in_rule__MultID__Group_1_1__06057 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__1_in_rule__MultID__Group_1_1__06060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MultID__Group_1_1__0__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__1__Impl_in_rule__MultID__Group_1_1__16119 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__2_in_rule__MultID__Group_1_1__16122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultID__MiAssignment_1_1_1_in_rule__MultID__Group_1_1__1__Impl6149 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__MultID__Group_1_1__2__Impl_in_rule__MultID__Group_1_1__26180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MultID__Group_1_1__2__Impl6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__0__Impl_in_rule__MultString__Group__06245 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group__1_in_rule__MultString__Group__06248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group__1__Impl_in_rule__MultString__Group__16306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Alternatives_1_in_rule__MultString__Group__1__Impl6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__0__Impl_in_rule__MultString__Group_1_1__06367 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__1_in_rule__MultString__Group_1_1__06370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MultString__Group_1_1__0__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__1__Impl_in_rule__MultString__Group_1_1__16429 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__2_in_rule__MultString__Group_1_1__16432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultString__MsAssignment_1_1_1_in_rule__MultString__Group_1_1__1__Impl6459 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__MultString__Group_1_1__2__Impl_in_rule__MultString__Group_1_1__26490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MultString__Group_1_1__2__Impl6518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__Model__ClasAssignment_06560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Model__ProcAssignment_16591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatemAssignment_26622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Model__ExpAssignment_36653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__NameAssignment_16684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ClassType__NoclassAssignment_2_06720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__PrefixAssignment_2_1_16759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__ClassType__SuffixAssignment_2_2_16790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__BlockingAlternatives_2_3_1_0_in_rule__ClassType__BlockingAssignment_2_3_16821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__NameAssignment_16854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__PrefixAssignment_2_0_16885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultID_in_rule__Procedure__SuffixAssignment_2_1_16916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__TypesAlternatives_2_2_1_0_in_rule__Procedure__TypesAssignment_2_2_16947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_16980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__RepAssignment_2_0_17011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__UntilAssignment_2_0_37042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__WhileAssignment_2_1_17073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__DoAssignment_2_1_37104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ForAssignment_2_2_17135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__VarAssignment_2_3_17166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_3_2_17197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ValAssignment_2_4_17228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__ExAssignment_2_4_37259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Expression__NameAssignment_17290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecidence_in_rule__Expression__PrecAssignment_27321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_0_17352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precidence__PrefixAssignment_0_27383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_0_37414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_1_17445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_1_27476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precidence__SuffixAssignment_1_37507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_2_17538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_2_27569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precidence__InfixAssignment_2_37600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par2Assignment_2_47631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_3_17662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par1Assignment_3_27693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultString_in_rule__Precidence__InfixleftAssignment_3_37724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__Par2Assignment_3_47755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_4_17786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precidence__LiteralAlternatives_4_2_0_in_rule__Precidence__LiteralAssignment_4_27817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_5_17850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__BracketAssignment_5_27881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_6_17912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__BracesAssignment_6_27943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__RuleAssignment_7_17974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precidence__ParenthesisAssignment_7_28005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_08036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultID__MiAssignment_1_1_18067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_08098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultString__MsAssignment_1_1_18129 = new BitSet(new long[]{0x0000000000000002L});

}