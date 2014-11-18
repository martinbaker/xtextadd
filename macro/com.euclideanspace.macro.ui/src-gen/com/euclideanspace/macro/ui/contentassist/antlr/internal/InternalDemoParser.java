package com.euclideanspace.macro.ui.contentassist.antlr.internal; 

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
import com.euclideanspace.macro.services.DemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'macro'", "'endmacro'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDemoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDemoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDemoParser.tokenNames; }
    public String getGrammarFileName() { return "../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g"; }


     
     	private DemoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DemoGrammarAccess grammarAccess) {
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
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:61:1: ( ruleModel EOF )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:62:1: ruleModel EOF
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
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:69:1: ruleModel : ( ( rule__Model__ContentsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:73:2: ( ( ( rule__Model__ContentsAssignment ) ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:74:1: ( ( rule__Model__ContentsAssignment ) )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:74:1: ( ( rule__Model__ContentsAssignment ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:75:1: ( rule__Model__ContentsAssignment )
            {
             before(grammarAccess.getModelAccess().getContentsAssignment()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:76:1: ( rule__Model__ContentsAssignment )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:76:2: rule__Model__ContentsAssignment
            {
            pushFollow(FOLLOW_rule__Model__ContentsAssignment_in_ruleModel94);
            rule__Model__ContentsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getContentsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleRecurse"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:88:1: entryRuleRecurse : ruleRecurse EOF ;
    public final void entryRuleRecurse() throws RecognitionException {
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:89:1: ( ruleRecurse EOF )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:90:1: ruleRecurse EOF
            {
             before(grammarAccess.getRecurseRule()); 
            pushFollow(FOLLOW_ruleRecurse_in_entryRuleRecurse121);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getRecurseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurse128); 

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
    // $ANTLR end "entryRuleRecurse"


    // $ANTLR start "ruleRecurse"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:97:1: ruleRecurse : ( ( rule__Recurse__Group__0 ) ) ;
    public final void ruleRecurse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:101:2: ( ( ( rule__Recurse__Group__0 ) ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:102:1: ( ( rule__Recurse__Group__0 ) )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:102:1: ( ( rule__Recurse__Group__0 ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:103:1: ( rule__Recurse__Group__0 )
            {
             before(grammarAccess.getRecurseAccess().getGroup()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:104:1: ( rule__Recurse__Group__0 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:104:2: rule__Recurse__Group__0
            {
            pushFollow(FOLLOW_rule__Recurse__Group__0_in_ruleRecurse154);
            rule__Recurse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecurse"


    // $ANTLR start "entryRuleMacroDef"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:116:1: entryRuleMacroDef : ruleMacroDef EOF ;
    public final void entryRuleMacroDef() throws RecognitionException {
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:117:1: ( ruleMacroDef EOF )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:118:1: ruleMacroDef EOF
            {
             before(grammarAccess.getMacroDefRule()); 
            pushFollow(FOLLOW_ruleMacroDef_in_entryRuleMacroDef181);
            ruleMacroDef();

            state._fsp--;

             after(grammarAccess.getMacroDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacroDef188); 

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
    // $ANTLR end "entryRuleMacroDef"


    // $ANTLR start "ruleMacroDef"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:125:1: ruleMacroDef : ( ( rule__MacroDef__Group__0 ) ) ;
    public final void ruleMacroDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:129:2: ( ( ( rule__MacroDef__Group__0 ) ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:130:1: ( ( rule__MacroDef__Group__0 ) )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:130:1: ( ( rule__MacroDef__Group__0 ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:131:1: ( rule__MacroDef__Group__0 )
            {
             before(grammarAccess.getMacroDefAccess().getGroup()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:132:1: ( rule__MacroDef__Group__0 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:132:2: rule__MacroDef__Group__0
            {
            pushFollow(FOLLOW_rule__MacroDef__Group__0_in_ruleMacroDef214);
            rule__MacroDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMacroDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMacroDef"


    // $ANTLR start "rule__Recurse__Alternatives_1"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:144:1: rule__Recurse__Alternatives_1 : ( ( ( rule__Recurse__MdAssignment_1_0 ) ) | ( ( rule__Recurse__Group_1_1__0 ) ) | ( ( rule__Recurse__NAssignment_1_2 ) ) );
    public final void rule__Recurse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:148:1: ( ( ( rule__Recurse__MdAssignment_1_0 ) ) | ( ( rule__Recurse__Group_1_1__0 ) ) | ( ( rule__Recurse__NAssignment_1_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:149:1: ( ( rule__Recurse__MdAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:149:1: ( ( rule__Recurse__MdAssignment_1_0 ) )
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:150:1: ( rule__Recurse__MdAssignment_1_0 )
                    {
                     before(grammarAccess.getRecurseAccess().getMdAssignment_1_0()); 
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:151:1: ( rule__Recurse__MdAssignment_1_0 )
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:151:2: rule__Recurse__MdAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Recurse__MdAssignment_1_0_in_rule__Recurse__Alternatives_1250);
                    rule__Recurse__MdAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getMdAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:155:6: ( ( rule__Recurse__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:155:6: ( ( rule__Recurse__Group_1_1__0 ) )
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:156:1: ( rule__Recurse__Group_1_1__0 )
                    {
                     before(grammarAccess.getRecurseAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:157:1: ( rule__Recurse__Group_1_1__0 )
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:157:2: rule__Recurse__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Recurse__Group_1_1__0_in_rule__Recurse__Alternatives_1268);
                    rule__Recurse__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:161:6: ( ( rule__Recurse__NAssignment_1_2 ) )
                    {
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:161:6: ( ( rule__Recurse__NAssignment_1_2 ) )
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:162:1: ( rule__Recurse__NAssignment_1_2 )
                    {
                     before(grammarAccess.getRecurseAccess().getNAssignment_1_2()); 
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:163:1: ( rule__Recurse__NAssignment_1_2 )
                    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:163:2: rule__Recurse__NAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__Recurse__NAssignment_1_2_in_rule__Recurse__Alternatives_1286);
                    rule__Recurse__NAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getNAssignment_1_2()); 

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
    // $ANTLR end "rule__Recurse__Alternatives_1"


    // $ANTLR start "rule__Recurse__Group__0"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:174:1: rule__Recurse__Group__0 : rule__Recurse__Group__0__Impl rule__Recurse__Group__1 ;
    public final void rule__Recurse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:178:1: ( rule__Recurse__Group__0__Impl rule__Recurse__Group__1 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:179:2: rule__Recurse__Group__0__Impl rule__Recurse__Group__1
            {
            pushFollow(FOLLOW_rule__Recurse__Group__0__Impl_in_rule__Recurse__Group__0317);
            rule__Recurse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group__1_in_rule__Recurse__Group__0320);
            rule__Recurse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group__0"


    // $ANTLR start "rule__Recurse__Group__0__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:186:1: rule__Recurse__Group__0__Impl : ( () ) ;
    public final void rule__Recurse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:190:1: ( ( () ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:191:1: ( () )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:191:1: ( () )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:192:1: ()
            {
             before(grammarAccess.getRecurseAccess().getRecurseAction_0()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:193:1: ()
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:195:1: 
            {
            }

             after(grammarAccess.getRecurseAccess().getRecurseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group__0__Impl"


    // $ANTLR start "rule__Recurse__Group__1"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:205:1: rule__Recurse__Group__1 : rule__Recurse__Group__1__Impl ;
    public final void rule__Recurse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:209:1: ( rule__Recurse__Group__1__Impl )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:210:2: rule__Recurse__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Recurse__Group__1__Impl_in_rule__Recurse__Group__1378);
            rule__Recurse__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group__1"


    // $ANTLR start "rule__Recurse__Group__1__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:216:1: rule__Recurse__Group__1__Impl : ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) ) ;
    public final void rule__Recurse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:220:1: ( ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:221:1: ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:221:1: ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:222:1: ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:222:1: ( ( rule__Recurse__Alternatives_1 ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:223:1: ( rule__Recurse__Alternatives_1 )
            {
             before(grammarAccess.getRecurseAccess().getAlternatives_1()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:224:1: ( rule__Recurse__Alternatives_1 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:224:2: rule__Recurse__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl407);
            rule__Recurse__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getAlternatives_1()); 

            }

            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:227:1: ( ( rule__Recurse__Alternatives_1 )* )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:228:1: ( rule__Recurse__Alternatives_1 )*
            {
             before(grammarAccess.getRecurseAccess().getAlternatives_1()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:229:1: ( rule__Recurse__Alternatives_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==11||LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:229:2: rule__Recurse__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl419);
            	    rule__Recurse__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRecurseAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Recurse__Group__1__Impl"


    // $ANTLR start "rule__Recurse__Group_1_1__0"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:244:1: rule__Recurse__Group_1_1__0 : rule__Recurse__Group_1_1__0__Impl rule__Recurse__Group_1_1__1 ;
    public final void rule__Recurse__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:248:1: ( rule__Recurse__Group_1_1__0__Impl rule__Recurse__Group_1_1__1 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:249:2: rule__Recurse__Group_1_1__0__Impl rule__Recurse__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_1__0__Impl_in_rule__Recurse__Group_1_1__0456);
            rule__Recurse__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1_1__1_in_rule__Recurse__Group_1_1__0459);
            rule__Recurse__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_1__0"


    // $ANTLR start "rule__Recurse__Group_1_1__0__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:256:1: rule__Recurse__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__Recurse__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:260:1: ( ( '{' ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:261:1: ( '{' )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:261:1: ( '{' )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:262:1: '{'
            {
             before(grammarAccess.getRecurseAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Recurse__Group_1_1__0__Impl487); 
             after(grammarAccess.getRecurseAccess().getLeftCurlyBracketKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_1__0__Impl"


    // $ANTLR start "rule__Recurse__Group_1_1__1"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:275:1: rule__Recurse__Group_1_1__1 : rule__Recurse__Group_1_1__1__Impl rule__Recurse__Group_1_1__2 ;
    public final void rule__Recurse__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:279:1: ( rule__Recurse__Group_1_1__1__Impl rule__Recurse__Group_1_1__2 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:280:2: rule__Recurse__Group_1_1__1__Impl rule__Recurse__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_1__1__Impl_in_rule__Recurse__Group_1_1__1518);
            rule__Recurse__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1_1__2_in_rule__Recurse__Group_1_1__1521);
            rule__Recurse__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_1__1"


    // $ANTLR start "rule__Recurse__Group_1_1__1__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:287:1: rule__Recurse__Group_1_1__1__Impl : ( ( rule__Recurse__RAssignment_1_1_1 ) ) ;
    public final void rule__Recurse__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:291:1: ( ( ( rule__Recurse__RAssignment_1_1_1 ) ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:292:1: ( ( rule__Recurse__RAssignment_1_1_1 ) )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:292:1: ( ( rule__Recurse__RAssignment_1_1_1 ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:293:1: ( rule__Recurse__RAssignment_1_1_1 )
            {
             before(grammarAccess.getRecurseAccess().getRAssignment_1_1_1()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:294:1: ( rule__Recurse__RAssignment_1_1_1 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:294:2: rule__Recurse__RAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Recurse__RAssignment_1_1_1_in_rule__Recurse__Group_1_1__1__Impl548);
            rule__Recurse__RAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getRAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_1__1__Impl"


    // $ANTLR start "rule__Recurse__Group_1_1__2"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:304:1: rule__Recurse__Group_1_1__2 : rule__Recurse__Group_1_1__2__Impl ;
    public final void rule__Recurse__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:308:1: ( rule__Recurse__Group_1_1__2__Impl )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:309:2: rule__Recurse__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_1__2__Impl_in_rule__Recurse__Group_1_1__2578);
            rule__Recurse__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_1__2"


    // $ANTLR start "rule__Recurse__Group_1_1__2__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:315:1: rule__Recurse__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__Recurse__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:319:1: ( ( '}' ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:320:1: ( '}' )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:320:1: ( '}' )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:321:1: '}'
            {
             before(grammarAccess.getRecurseAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,12,FOLLOW_12_in_rule__Recurse__Group_1_1__2__Impl606); 
             after(grammarAccess.getRecurseAccess().getRightCurlyBracketKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_1__2__Impl"


    // $ANTLR start "rule__MacroDef__Group__0"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:340:1: rule__MacroDef__Group__0 : rule__MacroDef__Group__0__Impl rule__MacroDef__Group__1 ;
    public final void rule__MacroDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:344:1: ( rule__MacroDef__Group__0__Impl rule__MacroDef__Group__1 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:345:2: rule__MacroDef__Group__0__Impl rule__MacroDef__Group__1
            {
            pushFollow(FOLLOW_rule__MacroDef__Group__0__Impl_in_rule__MacroDef__Group__0643);
            rule__MacroDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MacroDef__Group__1_in_rule__MacroDef__Group__0646);
            rule__MacroDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__Group__0"


    // $ANTLR start "rule__MacroDef__Group__0__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:352:1: rule__MacroDef__Group__0__Impl : ( 'macro' ) ;
    public final void rule__MacroDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:356:1: ( ( 'macro' ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:357:1: ( 'macro' )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:357:1: ( 'macro' )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:358:1: 'macro'
            {
             before(grammarAccess.getMacroDefAccess().getMacroKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__MacroDef__Group__0__Impl674); 
             after(grammarAccess.getMacroDefAccess().getMacroKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__Group__0__Impl"


    // $ANTLR start "rule__MacroDef__Group__1"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:371:1: rule__MacroDef__Group__1 : rule__MacroDef__Group__1__Impl rule__MacroDef__Group__2 ;
    public final void rule__MacroDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:375:1: ( rule__MacroDef__Group__1__Impl rule__MacroDef__Group__2 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:376:2: rule__MacroDef__Group__1__Impl rule__MacroDef__Group__2
            {
            pushFollow(FOLLOW_rule__MacroDef__Group__1__Impl_in_rule__MacroDef__Group__1705);
            rule__MacroDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MacroDef__Group__2_in_rule__MacroDef__Group__1708);
            rule__MacroDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__Group__1"


    // $ANTLR start "rule__MacroDef__Group__1__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:383:1: rule__MacroDef__Group__1__Impl : ( ( rule__MacroDef__MnAssignment_1 ) ) ;
    public final void rule__MacroDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:387:1: ( ( ( rule__MacroDef__MnAssignment_1 ) ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:388:1: ( ( rule__MacroDef__MnAssignment_1 ) )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:388:1: ( ( rule__MacroDef__MnAssignment_1 ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:389:1: ( rule__MacroDef__MnAssignment_1 )
            {
             before(grammarAccess.getMacroDefAccess().getMnAssignment_1()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:390:1: ( rule__MacroDef__MnAssignment_1 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:390:2: rule__MacroDef__MnAssignment_1
            {
            pushFollow(FOLLOW_rule__MacroDef__MnAssignment_1_in_rule__MacroDef__Group__1__Impl735);
            rule__MacroDef__MnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMacroDefAccess().getMnAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__Group__1__Impl"


    // $ANTLR start "rule__MacroDef__Group__2"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:400:1: rule__MacroDef__Group__2 : rule__MacroDef__Group__2__Impl rule__MacroDef__Group__3 ;
    public final void rule__MacroDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:404:1: ( rule__MacroDef__Group__2__Impl rule__MacroDef__Group__3 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:405:2: rule__MacroDef__Group__2__Impl rule__MacroDef__Group__3
            {
            pushFollow(FOLLOW_rule__MacroDef__Group__2__Impl_in_rule__MacroDef__Group__2765);
            rule__MacroDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MacroDef__Group__3_in_rule__MacroDef__Group__2768);
            rule__MacroDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__Group__2"


    // $ANTLR start "rule__MacroDef__Group__2__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:412:1: rule__MacroDef__Group__2__Impl : ( ( rule__MacroDef__MAssignment_2 ) ) ;
    public final void rule__MacroDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:416:1: ( ( ( rule__MacroDef__MAssignment_2 ) ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:417:1: ( ( rule__MacroDef__MAssignment_2 ) )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:417:1: ( ( rule__MacroDef__MAssignment_2 ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:418:1: ( rule__MacroDef__MAssignment_2 )
            {
             before(grammarAccess.getMacroDefAccess().getMAssignment_2()); 
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:419:1: ( rule__MacroDef__MAssignment_2 )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:419:2: rule__MacroDef__MAssignment_2
            {
            pushFollow(FOLLOW_rule__MacroDef__MAssignment_2_in_rule__MacroDef__Group__2__Impl795);
            rule__MacroDef__MAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMacroDefAccess().getMAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__Group__2__Impl"


    // $ANTLR start "rule__MacroDef__Group__3"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:429:1: rule__MacroDef__Group__3 : rule__MacroDef__Group__3__Impl ;
    public final void rule__MacroDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:433:1: ( rule__MacroDef__Group__3__Impl )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:434:2: rule__MacroDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MacroDef__Group__3__Impl_in_rule__MacroDef__Group__3825);
            rule__MacroDef__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__Group__3"


    // $ANTLR start "rule__MacroDef__Group__3__Impl"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:440:1: rule__MacroDef__Group__3__Impl : ( 'endmacro' ) ;
    public final void rule__MacroDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:444:1: ( ( 'endmacro' ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:445:1: ( 'endmacro' )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:445:1: ( 'endmacro' )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:446:1: 'endmacro'
            {
             before(grammarAccess.getMacroDefAccess().getEndmacroKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__MacroDef__Group__3__Impl853); 
             after(grammarAccess.getMacroDefAccess().getEndmacroKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__Group__3__Impl"


    // $ANTLR start "rule__Model__ContentsAssignment"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:468:1: rule__Model__ContentsAssignment : ( ruleRecurse ) ;
    public final void rule__Model__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:472:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:473:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:473:1: ( ruleRecurse )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:474:1: ruleRecurse
            {
             before(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__Model__ContentsAssignment897);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContentsAssignment"


    // $ANTLR start "rule__Recurse__MdAssignment_1_0"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:483:1: rule__Recurse__MdAssignment_1_0 : ( ruleMacroDef ) ;
    public final void rule__Recurse__MdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:487:1: ( ( ruleMacroDef ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:488:1: ( ruleMacroDef )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:488:1: ( ruleMacroDef )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:489:1: ruleMacroDef
            {
             before(grammarAccess.getRecurseAccess().getMdMacroDefParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMacroDef_in_rule__Recurse__MdAssignment_1_0928);
            ruleMacroDef();

            state._fsp--;

             after(grammarAccess.getRecurseAccess().getMdMacroDefParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__MdAssignment_1_0"


    // $ANTLR start "rule__Recurse__RAssignment_1_1_1"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:498:1: rule__Recurse__RAssignment_1_1_1 : ( ruleRecurse ) ;
    public final void rule__Recurse__RAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:502:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:503:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:503:1: ( ruleRecurse )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:504:1: ruleRecurse
            {
             before(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__Recurse__RAssignment_1_1_1959);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__RAssignment_1_1_1"


    // $ANTLR start "rule__Recurse__NAssignment_1_2"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:513:1: rule__Recurse__NAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Recurse__NAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:517:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:518:1: ( RULE_ID )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:518:1: ( RULE_ID )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:519:1: RULE_ID
            {
             before(grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recurse__NAssignment_1_2990); 
             after(grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__NAssignment_1_2"


    // $ANTLR start "rule__MacroDef__MnAssignment_1"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:528:1: rule__MacroDef__MnAssignment_1 : ( RULE_ID ) ;
    public final void rule__MacroDef__MnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:532:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:533:1: ( RULE_ID )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:533:1: ( RULE_ID )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:534:1: RULE_ID
            {
             before(grammarAccess.getMacroDefAccess().getMnIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MacroDef__MnAssignment_11021); 
             after(grammarAccess.getMacroDefAccess().getMnIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__MnAssignment_1"


    // $ANTLR start "rule__MacroDef__MAssignment_2"
    // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:543:1: rule__MacroDef__MAssignment_2 : ( ruleRecurse ) ;
    public final void rule__MacroDef__MAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:547:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:548:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:548:1: ( ruleRecurse )
            // ../com.euclideanspace.macro.ui/src-gen/com/euclideanspace/macro/ui/contentassist/antlr/internal/InternalDemo.g:549:1: ruleRecurse
            {
             before(grammarAccess.getMacroDefAccess().getMRecurseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__MacroDef__MAssignment_21052);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getMacroDefAccess().getMRecurseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacroDef__MAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContentsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_entryRuleRecurse121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurse128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__0_in_ruleRecurse154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacroDef_in_entryRuleMacroDef181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacroDef188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MacroDef__Group__0_in_ruleMacroDef214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__MdAssignment_1_0_in_rule__Recurse__Alternatives_1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__0_in_rule__Recurse__Alternatives_1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__NAssignment_1_2_in_rule__Recurse__Alternatives_1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__0__Impl_in_rule__Recurse__Group__0317 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_rule__Recurse__Group__1_in_rule__Recurse__Group__0320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__1__Impl_in_rule__Recurse__Group__1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl407 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl419 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__0__Impl_in_rule__Recurse__Group_1_1__0456 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__1_in_rule__Recurse__Group_1_1__0459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Recurse__Group_1_1__0__Impl487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__1__Impl_in_rule__Recurse__Group_1_1__1518 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__2_in_rule__Recurse__Group_1_1__1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__RAssignment_1_1_1_in_rule__Recurse__Group_1_1__1__Impl548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__2__Impl_in_rule__Recurse__Group_1_1__2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Recurse__Group_1_1__2__Impl606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MacroDef__Group__0__Impl_in_rule__MacroDef__Group__0643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MacroDef__Group__1_in_rule__MacroDef__Group__0646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MacroDef__Group__0__Impl674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MacroDef__Group__1__Impl_in_rule__MacroDef__Group__1705 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_rule__MacroDef__Group__2_in_rule__MacroDef__Group__1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MacroDef__MnAssignment_1_in_rule__MacroDef__Group__1__Impl735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MacroDef__Group__2__Impl_in_rule__MacroDef__Group__2765 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MacroDef__Group__3_in_rule__MacroDef__Group__2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MacroDef__MAssignment_2_in_rule__MacroDef__Group__2__Impl795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MacroDef__Group__3__Impl_in_rule__MacroDef__Group__3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MacroDef__Group__3__Impl853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__Model__ContentsAssignment897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacroDef_in_rule__Recurse__MdAssignment_1_0928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__Recurse__RAssignment_1_1_1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recurse__NAssignment_1_2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MacroDef__MnAssignment_11021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__MacroDef__MAssignment_21052 = new BitSet(new long[]{0x0000000000000002L});

}