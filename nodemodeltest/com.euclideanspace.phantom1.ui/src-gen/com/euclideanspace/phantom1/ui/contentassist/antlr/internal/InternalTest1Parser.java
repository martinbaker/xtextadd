package com.euclideanspace.phantom1.ui.contentassist.antlr.internal; 

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
import com.euclideanspace.phantom1.services.Test1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTest1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KW_OCURLY", "RULE_KW_CCURLY", "RULE_KW_SEMICOLON", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_KW_CCURLY=5;
    public static final int RULE_STRING=9;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_KW_SEMICOLON=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_KW_OCURLY=4;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTest1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTest1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTest1Parser.tokenNames; }
    public String getGrammarFileName() { return "../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g"; }


     
     	private Test1GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Test1GrammarAccess grammarAccess) {
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
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:61:1: ( ruleModel EOF )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:62:1: ruleModel EOF
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
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:69:1: ruleModel : ( ( rule__Model__ContentsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:73:2: ( ( ( rule__Model__ContentsAssignment )* ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:74:1: ( ( rule__Model__ContentsAssignment )* )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:74:1: ( ( rule__Model__ContentsAssignment )* )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:75:1: ( rule__Model__ContentsAssignment )*
            {
             before(grammarAccess.getModelAccess().getContentsAssignment()); 
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:76:1: ( rule__Model__ContentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_KW_OCURLY||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:76:2: rule__Model__ContentsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ContentsAssignment_in_ruleModel94);
            	    rule__Model__ContentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

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
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:88:1: entryRuleRecurse : ruleRecurse EOF ;
    public final void entryRuleRecurse() throws RecognitionException {
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:89:1: ( ruleRecurse EOF )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:90:1: ruleRecurse EOF
            {
             before(grammarAccess.getRecurseRule()); 
            pushFollow(FOLLOW_ruleRecurse_in_entryRuleRecurse122);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getRecurseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurse129); 

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
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:97:1: ruleRecurse : ( ( rule__Recurse__Alternatives ) ) ;
    public final void ruleRecurse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:101:2: ( ( ( rule__Recurse__Alternatives ) ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:102:1: ( ( rule__Recurse__Alternatives ) )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:102:1: ( ( rule__Recurse__Alternatives ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:103:1: ( rule__Recurse__Alternatives )
            {
             before(grammarAccess.getRecurseAccess().getAlternatives()); 
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:104:1: ( rule__Recurse__Alternatives )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:104:2: rule__Recurse__Alternatives
            {
            pushFollow(FOLLOW_rule__Recurse__Alternatives_in_ruleRecurse155);
            rule__Recurse__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__Recurse__Alternatives"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:116:1: rule__Recurse__Alternatives : ( ( ( rule__Recurse__NAssignment_0 ) ) | ( ( rule__Recurse__Group_1__0 ) ) );
    public final void rule__Recurse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:120:1: ( ( ( rule__Recurse__NAssignment_0 ) ) | ( ( rule__Recurse__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_KW_OCURLY) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:121:1: ( ( rule__Recurse__NAssignment_0 ) )
                    {
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:121:1: ( ( rule__Recurse__NAssignment_0 ) )
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:122:1: ( rule__Recurse__NAssignment_0 )
                    {
                     before(grammarAccess.getRecurseAccess().getNAssignment_0()); 
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:123:1: ( rule__Recurse__NAssignment_0 )
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:123:2: rule__Recurse__NAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Recurse__NAssignment_0_in_rule__Recurse__Alternatives191);
                    rule__Recurse__NAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getNAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:127:6: ( ( rule__Recurse__Group_1__0 ) )
                    {
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:127:6: ( ( rule__Recurse__Group_1__0 ) )
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:128:1: ( rule__Recurse__Group_1__0 )
                    {
                     before(grammarAccess.getRecurseAccess().getGroup_1()); 
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:129:1: ( rule__Recurse__Group_1__0 )
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:129:2: rule__Recurse__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Recurse__Group_1__0_in_rule__Recurse__Alternatives209);
                    rule__Recurse__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Recurse__Alternatives"


    // $ANTLR start "rule__Recurse__Group_1__0"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:140:1: rule__Recurse__Group_1__0 : rule__Recurse__Group_1__0__Impl rule__Recurse__Group_1__1 ;
    public final void rule__Recurse__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:144:1: ( rule__Recurse__Group_1__0__Impl rule__Recurse__Group_1__1 )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:145:2: rule__Recurse__Group_1__0__Impl rule__Recurse__Group_1__1
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1__0__Impl_in_rule__Recurse__Group_1__0240);
            rule__Recurse__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1__1_in_rule__Recurse__Group_1__0243);
            rule__Recurse__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1__0"


    // $ANTLR start "rule__Recurse__Group_1__0__Impl"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:152:1: rule__Recurse__Group_1__0__Impl : ( RULE_KW_OCURLY ) ;
    public final void rule__Recurse__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:156:1: ( ( RULE_KW_OCURLY ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:157:1: ( RULE_KW_OCURLY )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:157:1: ( RULE_KW_OCURLY )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:158:1: RULE_KW_OCURLY
            {
             before(grammarAccess.getRecurseAccess().getKW_OCURLYTerminalRuleCall_1_0()); 
            match(input,RULE_KW_OCURLY,FOLLOW_RULE_KW_OCURLY_in_rule__Recurse__Group_1__0__Impl270); 
             after(grammarAccess.getRecurseAccess().getKW_OCURLYTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1__0__Impl"


    // $ANTLR start "rule__Recurse__Group_1__1"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:169:1: rule__Recurse__Group_1__1 : rule__Recurse__Group_1__1__Impl rule__Recurse__Group_1__2 ;
    public final void rule__Recurse__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:173:1: ( rule__Recurse__Group_1__1__Impl rule__Recurse__Group_1__2 )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:174:2: rule__Recurse__Group_1__1__Impl rule__Recurse__Group_1__2
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1__1__Impl_in_rule__Recurse__Group_1__1299);
            rule__Recurse__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1__2_in_rule__Recurse__Group_1__1302);
            rule__Recurse__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1__1"


    // $ANTLR start "rule__Recurse__Group_1__1__Impl"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:181:1: rule__Recurse__Group_1__1__Impl : ( ( rule__Recurse__RAssignment_1_1 ) ) ;
    public final void rule__Recurse__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:185:1: ( ( ( rule__Recurse__RAssignment_1_1 ) ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:186:1: ( ( rule__Recurse__RAssignment_1_1 ) )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:186:1: ( ( rule__Recurse__RAssignment_1_1 ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:187:1: ( rule__Recurse__RAssignment_1_1 )
            {
             before(grammarAccess.getRecurseAccess().getRAssignment_1_1()); 
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:188:1: ( rule__Recurse__RAssignment_1_1 )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:188:2: rule__Recurse__RAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Recurse__RAssignment_1_1_in_rule__Recurse__Group_1__1__Impl329);
            rule__Recurse__RAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getRAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1__1__Impl"


    // $ANTLR start "rule__Recurse__Group_1__2"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:198:1: rule__Recurse__Group_1__2 : rule__Recurse__Group_1__2__Impl rule__Recurse__Group_1__3 ;
    public final void rule__Recurse__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:202:1: ( rule__Recurse__Group_1__2__Impl rule__Recurse__Group_1__3 )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:203:2: rule__Recurse__Group_1__2__Impl rule__Recurse__Group_1__3
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1__2__Impl_in_rule__Recurse__Group_1__2359);
            rule__Recurse__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1__3_in_rule__Recurse__Group_1__2362);
            rule__Recurse__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1__2"


    // $ANTLR start "rule__Recurse__Group_1__2__Impl"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:210:1: rule__Recurse__Group_1__2__Impl : ( RULE_KW_CCURLY ) ;
    public final void rule__Recurse__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:214:1: ( ( RULE_KW_CCURLY ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:215:1: ( RULE_KW_CCURLY )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:215:1: ( RULE_KW_CCURLY )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:216:1: RULE_KW_CCURLY
            {
             before(grammarAccess.getRecurseAccess().getKW_CCURLYTerminalRuleCall_1_2()); 
            match(input,RULE_KW_CCURLY,FOLLOW_RULE_KW_CCURLY_in_rule__Recurse__Group_1__2__Impl389); 
             after(grammarAccess.getRecurseAccess().getKW_CCURLYTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1__2__Impl"


    // $ANTLR start "rule__Recurse__Group_1__3"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:227:1: rule__Recurse__Group_1__3 : rule__Recurse__Group_1__3__Impl ;
    public final void rule__Recurse__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:231:1: ( rule__Recurse__Group_1__3__Impl )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:232:2: rule__Recurse__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1__3__Impl_in_rule__Recurse__Group_1__3418);
            rule__Recurse__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1__3"


    // $ANTLR start "rule__Recurse__Group_1__3__Impl"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:238:1: rule__Recurse__Group_1__3__Impl : ( ( RULE_KW_SEMICOLON )? ) ;
    public final void rule__Recurse__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:242:1: ( ( ( RULE_KW_SEMICOLON )? ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:243:1: ( ( RULE_KW_SEMICOLON )? )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:243:1: ( ( RULE_KW_SEMICOLON )? )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:244:1: ( RULE_KW_SEMICOLON )?
            {
             before(grammarAccess.getRecurseAccess().getKW_SEMICOLONTerminalRuleCall_1_3()); 
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:245:1: ( RULE_KW_SEMICOLON )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_KW_SEMICOLON) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:245:3: RULE_KW_SEMICOLON
                    {
                    match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_rule__Recurse__Group_1__3__Impl446); 

                    }
                    break;

            }

             after(grammarAccess.getRecurseAccess().getKW_SEMICOLONTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1__3__Impl"


    // $ANTLR start "rule__Model__ContentsAssignment"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:264:1: rule__Model__ContentsAssignment : ( ruleRecurse ) ;
    public final void rule__Model__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:268:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:269:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:269:1: ( ruleRecurse )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:270:1: ruleRecurse
            {
             before(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__Model__ContentsAssignment490);
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


    // $ANTLR start "rule__Recurse__NAssignment_0"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:279:1: rule__Recurse__NAssignment_0 : ( RULE_ID ) ;
    public final void rule__Recurse__NAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:283:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:284:1: ( RULE_ID )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:284:1: ( RULE_ID )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:285:1: RULE_ID
            {
             before(grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recurse__NAssignment_0521); 
             after(grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__NAssignment_0"


    // $ANTLR start "rule__Recurse__RAssignment_1_1"
    // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:294:1: rule__Recurse__RAssignment_1_1 : ( ruleRecurse ) ;
    public final void rule__Recurse__RAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:298:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:299:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:299:1: ( ruleRecurse )
            // ../com.euclideanspace.phantom1.ui/src-gen/com/euclideanspace/phantom1/ui/contentassist/antlr/internal/InternalTest1.g:300:1: ruleRecurse
            {
             before(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__Recurse__RAssignment_1_1552);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__RAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContentsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000092L});
    public static final BitSet FOLLOW_ruleRecurse_in_entryRuleRecurse122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurse129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Alternatives_in_ruleRecurse155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__NAssignment_0_in_rule__Recurse__Alternatives191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1__0_in_rule__Recurse__Alternatives209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1__0__Impl_in_rule__Recurse__Group_1__0240 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1__1_in_rule__Recurse__Group_1__0243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OCURLY_in_rule__Recurse__Group_1__0__Impl270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1__1__Impl_in_rule__Recurse__Group_1__1299 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1__2_in_rule__Recurse__Group_1__1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__RAssignment_1_1_in_rule__Recurse__Group_1__1__Impl329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1__2__Impl_in_rule__Recurse__Group_1__2359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1__3_in_rule__Recurse__Group_1__2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_CCURLY_in_rule__Recurse__Group_1__2__Impl389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1__3__Impl_in_rule__Recurse__Group_1__3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_rule__Recurse__Group_1__3__Impl446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__Model__ContentsAssignment490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recurse__NAssignment_0521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__Recurse__RAssignment_1_1552 = new BitSet(new long[]{0x0000000000000002L});

}