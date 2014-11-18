package com.euclideanspace.whitespaceblock.ui.contentassist.antlr.internal; 

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
import com.euclideanspace.whitespaceblock.services.DemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_LINECONTINUATION", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=5;
    public static final int RULE_BEGIN=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_INT=7;
    public static final int RULE_LINECONTINUATION=9;
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
    public String getGrammarFileName() { return "../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g"; }


     
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:61:1: ( ruleModel EOF )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:62:1: ruleModel EOF
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:69:1: ruleModel : ( ( rule__Model__ContentsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:73:2: ( ( ( rule__Model__ContentsAssignment ) ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:74:1: ( ( rule__Model__ContentsAssignment ) )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:74:1: ( ( rule__Model__ContentsAssignment ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:75:1: ( rule__Model__ContentsAssignment )
            {
             before(grammarAccess.getModelAccess().getContentsAssignment()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:76:1: ( rule__Model__ContentsAssignment )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:76:2: rule__Model__ContentsAssignment
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:88:1: entryRuleRecurse : ruleRecurse EOF ;
    public final void entryRuleRecurse() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_LINECONTINUATION");

        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:92:1: ( ruleRecurse EOF )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:93:1: ruleRecurse EOF
            {
             before(grammarAccess.getRecurseRule()); 
            pushFollow(FOLLOW_ruleRecurse_in_entryRuleRecurse126);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getRecurseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurse133); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleRecurse"


    // $ANTLR start "ruleRecurse"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:103:1: ruleRecurse : ( ( rule__Recurse__Group__0 ) ) ;
    public final void ruleRecurse() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_LINECONTINUATION");
        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:108:2: ( ( ( rule__Recurse__Group__0 ) ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:109:1: ( ( rule__Recurse__Group__0 ) )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:109:1: ( ( rule__Recurse__Group__0 ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:110:1: ( rule__Recurse__Group__0 )
            {
             before(grammarAccess.getRecurseAccess().getGroup()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:111:1: ( rule__Recurse__Group__0 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:111:2: rule__Recurse__Group__0
            {
            pushFollow(FOLLOW_rule__Recurse__Group__0_in_ruleRecurse163);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleRecurse"


    // $ANTLR start "rule__Recurse__Alternatives_1"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:124:1: rule__Recurse__Alternatives_1 : ( ( ( rule__Recurse__NAssignment_1_0 ) ) | ( ( rule__Recurse__Group_1_1__0 ) ) );
    public final void rule__Recurse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:128:1: ( ( ( rule__Recurse__NAssignment_1_0 ) ) | ( ( rule__Recurse__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_BEGIN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:129:1: ( ( rule__Recurse__NAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:129:1: ( ( rule__Recurse__NAssignment_1_0 ) )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:130:1: ( rule__Recurse__NAssignment_1_0 )
                    {
                     before(grammarAccess.getRecurseAccess().getNAssignment_1_0()); 
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:131:1: ( rule__Recurse__NAssignment_1_0 )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:131:2: rule__Recurse__NAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Recurse__NAssignment_1_0_in_rule__Recurse__Alternatives_1199);
                    rule__Recurse__NAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getNAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:135:6: ( ( rule__Recurse__Group_1_1__0 ) )
                    {
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:135:6: ( ( rule__Recurse__Group_1_1__0 ) )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:136:1: ( rule__Recurse__Group_1_1__0 )
                    {
                     before(grammarAccess.getRecurseAccess().getGroup_1_1()); 
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:137:1: ( rule__Recurse__Group_1_1__0 )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:137:2: rule__Recurse__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Recurse__Group_1_1__0_in_rule__Recurse__Alternatives_1217);
                    rule__Recurse__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getGroup_1_1()); 

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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:148:1: rule__Recurse__Group__0 : rule__Recurse__Group__0__Impl rule__Recurse__Group__1 ;
    public final void rule__Recurse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:152:1: ( rule__Recurse__Group__0__Impl rule__Recurse__Group__1 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:153:2: rule__Recurse__Group__0__Impl rule__Recurse__Group__1
            {
            pushFollow(FOLLOW_rule__Recurse__Group__0__Impl_in_rule__Recurse__Group__0248);
            rule__Recurse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group__1_in_rule__Recurse__Group__0251);
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:160:1: rule__Recurse__Group__0__Impl : ( () ) ;
    public final void rule__Recurse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:164:1: ( ( () ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:165:1: ( () )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:165:1: ( () )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:166:1: ()
            {
             before(grammarAccess.getRecurseAccess().getRecurseAction_0()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:167:1: ()
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:169:1: 
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:179:1: rule__Recurse__Group__1 : rule__Recurse__Group__1__Impl ;
    public final void rule__Recurse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:183:1: ( rule__Recurse__Group__1__Impl )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:184:2: rule__Recurse__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Recurse__Group__1__Impl_in_rule__Recurse__Group__1309);
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:190:1: rule__Recurse__Group__1__Impl : ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) ) ;
    public final void rule__Recurse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:194:1: ( ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:195:1: ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:195:1: ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:196:1: ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:196:1: ( ( rule__Recurse__Alternatives_1 ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:197:1: ( rule__Recurse__Alternatives_1 )
            {
             before(grammarAccess.getRecurseAccess().getAlternatives_1()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:198:1: ( rule__Recurse__Alternatives_1 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:198:2: rule__Recurse__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl338);
            rule__Recurse__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getAlternatives_1()); 

            }

            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:201:1: ( ( rule__Recurse__Alternatives_1 )* )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:202:1: ( rule__Recurse__Alternatives_1 )*
            {
             before(grammarAccess.getRecurseAccess().getAlternatives_1()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:203:1: ( rule__Recurse__Alternatives_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_BEGIN||LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:203:2: rule__Recurse__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl350);
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:218:1: rule__Recurse__Group_1_1__0 : rule__Recurse__Group_1_1__0__Impl rule__Recurse__Group_1_1__1 ;
    public final void rule__Recurse__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:222:1: ( rule__Recurse__Group_1_1__0__Impl rule__Recurse__Group_1_1__1 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:223:2: rule__Recurse__Group_1_1__0__Impl rule__Recurse__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_1__0__Impl_in_rule__Recurse__Group_1_1__0387);
            rule__Recurse__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1_1__1_in_rule__Recurse__Group_1_1__0390);
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:230:1: rule__Recurse__Group_1_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Recurse__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:234:1: ( ( RULE_BEGIN ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:235:1: ( RULE_BEGIN )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:235:1: ( RULE_BEGIN )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:236:1: RULE_BEGIN
            {
             before(grammarAccess.getRecurseAccess().getBEGINTerminalRuleCall_1_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Recurse__Group_1_1__0__Impl417); 
             after(grammarAccess.getRecurseAccess().getBEGINTerminalRuleCall_1_1_0()); 

            }


            }

        }
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:247:1: rule__Recurse__Group_1_1__1 : rule__Recurse__Group_1_1__1__Impl rule__Recurse__Group_1_1__2 ;
    public final void rule__Recurse__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:251:1: ( rule__Recurse__Group_1_1__1__Impl rule__Recurse__Group_1_1__2 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:252:2: rule__Recurse__Group_1_1__1__Impl rule__Recurse__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_1__1__Impl_in_rule__Recurse__Group_1_1__1446);
            rule__Recurse__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1_1__2_in_rule__Recurse__Group_1_1__1449);
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:259:1: rule__Recurse__Group_1_1__1__Impl : ( ( rule__Recurse__RAssignment_1_1_1 ) ) ;
    public final void rule__Recurse__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:263:1: ( ( ( rule__Recurse__RAssignment_1_1_1 ) ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:264:1: ( ( rule__Recurse__RAssignment_1_1_1 ) )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:264:1: ( ( rule__Recurse__RAssignment_1_1_1 ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:265:1: ( rule__Recurse__RAssignment_1_1_1 )
            {
             before(grammarAccess.getRecurseAccess().getRAssignment_1_1_1()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:266:1: ( rule__Recurse__RAssignment_1_1_1 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:266:2: rule__Recurse__RAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Recurse__RAssignment_1_1_1_in_rule__Recurse__Group_1_1__1__Impl476);
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:276:1: rule__Recurse__Group_1_1__2 : rule__Recurse__Group_1_1__2__Impl ;
    public final void rule__Recurse__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:280:1: ( rule__Recurse__Group_1_1__2__Impl )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:281:2: rule__Recurse__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_1__2__Impl_in_rule__Recurse__Group_1_1__2506);
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
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:287:1: rule__Recurse__Group_1_1__2__Impl : ( RULE_END ) ;
    public final void rule__Recurse__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:291:1: ( ( RULE_END ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:292:1: ( RULE_END )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:292:1: ( RULE_END )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:293:1: RULE_END
            {
             before(grammarAccess.getRecurseAccess().getENDTerminalRuleCall_1_1_2()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Recurse__Group_1_1__2__Impl533); 
             after(grammarAccess.getRecurseAccess().getENDTerminalRuleCall_1_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__ContentsAssignment"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:311:1: rule__Model__ContentsAssignment : ( ruleRecurse ) ;
    public final void rule__Model__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:315:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:316:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:316:1: ( ruleRecurse )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:317:1: ruleRecurse
            {
             before(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__Model__ContentsAssignment573);
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


    // $ANTLR start "rule__Recurse__NAssignment_1_0"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:326:1: rule__Recurse__NAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Recurse__NAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:330:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:331:1: ( RULE_ID )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:331:1: ( RULE_ID )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:332:1: RULE_ID
            {
             before(grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recurse__NAssignment_1_0604); 
             after(grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__NAssignment_1_0"


    // $ANTLR start "rule__Recurse__RAssignment_1_1_1"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:341:1: rule__Recurse__RAssignment_1_1_1 : ( ruleRecurse ) ;
    public final void rule__Recurse__RAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:345:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:346:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:346:1: ( ruleRecurse )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:347:1: ruleRecurse
            {
             before(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__Recurse__RAssignment_1_1_1635);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContentsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_entryRuleRecurse126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurse133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__0_in_ruleRecurse163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__NAssignment_1_0_in_rule__Recurse__Alternatives_1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__0_in_rule__Recurse__Alternatives_1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__0__Impl_in_rule__Recurse__Group__0248 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Recurse__Group__1_in_rule__Recurse__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__1__Impl_in_rule__Recurse__Group__1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl338 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl350 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__0__Impl_in_rule__Recurse__Group_1_1__0387 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__1_in_rule__Recurse__Group_1_1__0390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Recurse__Group_1_1__0__Impl417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__1__Impl_in_rule__Recurse__Group_1_1__1446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__2_in_rule__Recurse__Group_1_1__1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__RAssignment_1_1_1_in_rule__Recurse__Group_1_1__1__Impl476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_1__2__Impl_in_rule__Recurse__Group_1_1__2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Recurse__Group_1_1__2__Impl533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__Model__ContentsAssignment573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recurse__NAssignment_1_0604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__Recurse__RAssignment_1_1_1635 = new BitSet(new long[]{0x0000000000000002L});

}