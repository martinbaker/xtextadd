package com.euclideanspace.whitespaceblock.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.whitespaceblock.services.DemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_STRING", "RULE_LINECONTINUATION", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=6;
    public static final int RULE_BEGIN=5;
    public static final int RULE_ID=4;
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
    public String getGrammarFileName() { return "../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g"; }



     	private DemoGrammarAccess grammarAccess;
     	
        public InternalDemoParser(TokenStream input, DemoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DemoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:76:1: ruleModel returns [EObject current=null] : ( (lv_contents_0_0= ruleRecurse ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:79:28: ( ( (lv_contents_0_0= ruleRecurse ) ) )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:80:1: ( (lv_contents_0_0= ruleRecurse ) )
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:80:1: ( (lv_contents_0_0= ruleRecurse ) )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:81:1: (lv_contents_0_0= ruleRecurse )
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:81:1: (lv_contents_0_0= ruleRecurse )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:82:3: lv_contents_0_0= ruleRecurse
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleRecurse_in_ruleModel130);
            lv_contents_0_0=ruleRecurse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"contents",
                    		lv_contents_0_0, 
                    		"Recurse");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRecurse"
    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:106:1: entryRuleRecurse returns [EObject current=null] : iv_ruleRecurse= ruleRecurse EOF ;
    public final EObject entryRuleRecurse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecurse = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_LINECONTINUATION");
        	
        try {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:110:2: (iv_ruleRecurse= ruleRecurse EOF )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:111:2: iv_ruleRecurse= ruleRecurse EOF
            {
             newCompositeNode(grammarAccess.getRecurseRule()); 
            pushFollow(FOLLOW_ruleRecurse_in_entryRuleRecurse171);
            iv_ruleRecurse=ruleRecurse();

            state._fsp--;

             current =iv_ruleRecurse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurse181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleRecurse"


    // $ANTLR start "ruleRecurse"
    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:121:1: ruleRecurse returns [EObject current=null] : ( () ( ( (lv_n_1_0= RULE_ID ) ) | (this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END ) )+ ) ;
    public final EObject ruleRecurse() throws RecognitionException {
        EObject current = null;

        Token lv_n_1_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_r_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_LINECONTINUATION");
            
        try {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:125:28: ( ( () ( ( (lv_n_1_0= RULE_ID ) ) | (this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END ) )+ ) )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:126:1: ( () ( ( (lv_n_1_0= RULE_ID ) ) | (this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END ) )+ )
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:126:1: ( () ( ( (lv_n_1_0= RULE_ID ) ) | (this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END ) )+ )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:126:2: () ( ( (lv_n_1_0= RULE_ID ) ) | (this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END ) )+
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:126:2: ()
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:127:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecurseAccess().getRecurseAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:132:2: ( ( (lv_n_1_0= RULE_ID ) ) | (this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }
                else if ( (LA1_0==RULE_BEGIN) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:132:3: ( (lv_n_1_0= RULE_ID ) )
            	    {
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:132:3: ( (lv_n_1_0= RULE_ID ) )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:133:1: (lv_n_1_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:133:1: (lv_n_1_0= RULE_ID )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:134:3: lv_n_1_0= RULE_ID
            	    {
            	    lv_n_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecurse237); 

            	    			newLeafNode(lv_n_1_0, grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRecurseRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"n",
            	            		lv_n_1_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:151:6: (this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END )
            	    {
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:151:6: (this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:151:7: this_BEGIN_2= RULE_BEGIN ( (lv_r_3_0= ruleRecurse ) ) this_END_4= RULE_END
            	    {
            	    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleRecurse260); 
            	     
            	        newLeafNode(this_BEGIN_2, grammarAccess.getRecurseAccess().getBEGINTerminalRuleCall_1_1_0()); 
            	        
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:155:1: ( (lv_r_3_0= ruleRecurse ) )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:156:1: (lv_r_3_0= ruleRecurse )
            	    {
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:156:1: (lv_r_3_0= ruleRecurse )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:157:3: lv_r_3_0= ruleRecurse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecurse_in_ruleRecurse280);
            	    lv_r_3_0=ruleRecurse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecurseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"r",
            	            		lv_r_3_0, 
            	            		"Recurse");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_END_4=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleRecurse291); 
            	     
            	        newLeafNode(this_END_4, grammarAccess.getRecurseAccess().getENDTerminalRuleCall_1_1_2()); 
            	        

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleRecurse"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_entryRuleRecurse171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurse181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecurse237 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleRecurse260 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleRecurse280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_END_in_ruleRecurse291 = new BitSet(new long[]{0x0000000000000032L});

}