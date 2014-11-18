package com.euclideanspace.macro.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.macro.services.DemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g"; }



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
    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:76:1: ruleModel returns [EObject current=null] : ( (lv_contents_0_0= ruleRecurse ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:79:28: ( ( (lv_contents_0_0= ruleRecurse ) ) )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:80:1: ( (lv_contents_0_0= ruleRecurse ) )
            {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:80:1: ( (lv_contents_0_0= ruleRecurse ) )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:81:1: (lv_contents_0_0= ruleRecurse )
            {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:81:1: (lv_contents_0_0= ruleRecurse )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:82:3: lv_contents_0_0= ruleRecurse
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
    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:106:1: entryRuleRecurse returns [EObject current=null] : iv_ruleRecurse= ruleRecurse EOF ;
    public final EObject entryRuleRecurse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecurse = null;


        try {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:107:2: (iv_ruleRecurse= ruleRecurse EOF )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:108:2: iv_ruleRecurse= ruleRecurse EOF
            {
             newCompositeNode(grammarAccess.getRecurseRule()); 
            pushFollow(FOLLOW_ruleRecurse_in_entryRuleRecurse165);
            iv_ruleRecurse=ruleRecurse();

            state._fsp--;

             current =iv_ruleRecurse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurse175); 

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
    // $ANTLR end "entryRuleRecurse"


    // $ANTLR start "ruleRecurse"
    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:115:1: ruleRecurse returns [EObject current=null] : ( () ( ( (lv_md_1_0= ruleMacroDef ) ) | (otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}' ) | ( (lv_n_5_0= RULE_ID ) ) )+ ) ;
    public final EObject ruleRecurse() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_n_5_0=null;
        EObject lv_md_1_0 = null;

        EObject lv_r_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:118:28: ( ( () ( ( (lv_md_1_0= ruleMacroDef ) ) | (otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}' ) | ( (lv_n_5_0= RULE_ID ) ) )+ ) )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:119:1: ( () ( ( (lv_md_1_0= ruleMacroDef ) ) | (otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}' ) | ( (lv_n_5_0= RULE_ID ) ) )+ )
            {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:119:1: ( () ( ( (lv_md_1_0= ruleMacroDef ) ) | (otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}' ) | ( (lv_n_5_0= RULE_ID ) ) )+ )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:119:2: () ( ( (lv_md_1_0= ruleMacroDef ) ) | (otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}' ) | ( (lv_n_5_0= RULE_ID ) ) )+
            {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:119:2: ()
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:120:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecurseAccess().getRecurseAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:125:2: ( ( (lv_md_1_0= ruleMacroDef ) ) | (otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}' ) | ( (lv_n_5_0= RULE_ID ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
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

                }

                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:125:3: ( (lv_md_1_0= ruleMacroDef ) )
            	    {
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:125:3: ( (lv_md_1_0= ruleMacroDef ) )
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:126:1: (lv_md_1_0= ruleMacroDef )
            	    {
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:126:1: (lv_md_1_0= ruleMacroDef )
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:127:3: lv_md_1_0= ruleMacroDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecurseAccess().getMdMacroDefParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMacroDef_in_ruleRecurse231);
            	    lv_md_1_0=ruleMacroDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecurseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"md",
            	            		lv_md_1_0, 
            	            		"MacroDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:144:6: (otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}' )
            	    {
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:144:6: (otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}' )
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:144:8: otherlv_2= '{' ( (lv_r_3_0= ruleRecurse ) ) otherlv_4= '}'
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleRecurse250); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRecurseAccess().getLeftCurlyBracketKeyword_1_1_0());
            	        
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:148:1: ( (lv_r_3_0= ruleRecurse ) )
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:149:1: (lv_r_3_0= ruleRecurse )
            	    {
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:149:1: (lv_r_3_0= ruleRecurse )
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:150:3: lv_r_3_0= ruleRecurse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecurse_in_ruleRecurse271);
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

            	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRecurse283); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRecurseAccess().getRightCurlyBracketKeyword_1_1_2());
            	        

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:171:6: ( (lv_n_5_0= RULE_ID ) )
            	    {
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:171:6: ( (lv_n_5_0= RULE_ID ) )
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:172:1: (lv_n_5_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:172:1: (lv_n_5_0= RULE_ID )
            	    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:173:3: lv_n_5_0= RULE_ID
            	    {
            	    lv_n_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecurse307); 

            	    			newLeafNode(lv_n_5_0, grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRecurseRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"n",
            	            		lv_n_5_0, 
            	            		"ID");
            	    	    

            	    }


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
        }
        return current;
    }
    // $ANTLR end "ruleRecurse"


    // $ANTLR start "entryRuleMacroDef"
    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:197:1: entryRuleMacroDef returns [EObject current=null] : iv_ruleMacroDef= ruleMacroDef EOF ;
    public final EObject entryRuleMacroDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacroDef = null;


        try {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:198:2: (iv_ruleMacroDef= ruleMacroDef EOF )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:199:2: iv_ruleMacroDef= ruleMacroDef EOF
            {
             newCompositeNode(grammarAccess.getMacroDefRule()); 
            pushFollow(FOLLOW_ruleMacroDef_in_entryRuleMacroDef350);
            iv_ruleMacroDef=ruleMacroDef();

            state._fsp--;

             current =iv_ruleMacroDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacroDef360); 

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
    // $ANTLR end "entryRuleMacroDef"


    // $ANTLR start "ruleMacroDef"
    // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:206:1: ruleMacroDef returns [EObject current=null] : (otherlv_0= 'macro' ( (lv_mn_1_0= RULE_ID ) ) ( (lv_m_2_0= ruleRecurse ) ) otherlv_3= 'endmacro' ) ;
    public final EObject ruleMacroDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mn_1_0=null;
        Token otherlv_3=null;
        EObject lv_m_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:209:28: ( (otherlv_0= 'macro' ( (lv_mn_1_0= RULE_ID ) ) ( (lv_m_2_0= ruleRecurse ) ) otherlv_3= 'endmacro' ) )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:210:1: (otherlv_0= 'macro' ( (lv_mn_1_0= RULE_ID ) ) ( (lv_m_2_0= ruleRecurse ) ) otherlv_3= 'endmacro' )
            {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:210:1: (otherlv_0= 'macro' ( (lv_mn_1_0= RULE_ID ) ) ( (lv_m_2_0= ruleRecurse ) ) otherlv_3= 'endmacro' )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:210:3: otherlv_0= 'macro' ( (lv_mn_1_0= RULE_ID ) ) ( (lv_m_2_0= ruleRecurse ) ) otherlv_3= 'endmacro'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleMacroDef397); 

                	newLeafNode(otherlv_0, grammarAccess.getMacroDefAccess().getMacroKeyword_0());
                
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:214:1: ( (lv_mn_1_0= RULE_ID ) )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:215:1: (lv_mn_1_0= RULE_ID )
            {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:215:1: (lv_mn_1_0= RULE_ID )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:216:3: lv_mn_1_0= RULE_ID
            {
            lv_mn_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMacroDef414); 

            			newLeafNode(lv_mn_1_0, grammarAccess.getMacroDefAccess().getMnIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMacroDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mn",
                    		lv_mn_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:232:2: ( (lv_m_2_0= ruleRecurse ) )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:233:1: (lv_m_2_0= ruleRecurse )
            {
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:233:1: (lv_m_2_0= ruleRecurse )
            // ../com.euclideanspace.macro/src-gen/com/euclideanspace/macro/parser/antlr/internal/InternalDemo.g:234:3: lv_m_2_0= ruleRecurse
            {
             
            	        newCompositeNode(grammarAccess.getMacroDefAccess().getMRecurseParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRecurse_in_ruleMacroDef440);
            lv_m_2_0=ruleRecurse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMacroDefRule());
            	        }
                   		set(
                   			current, 
                   			"m",
                    		lv_m_2_0, 
                    		"Recurse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMacroDef452); 

                	newLeafNode(otherlv_3, grammarAccess.getMacroDefAccess().getEndmacroKeyword_3());
                

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
    // $ANTLR end "ruleMacroDef"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_entryRuleRecurse165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurse175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacroDef_in_ruleRecurse231 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_11_in_ruleRecurse250 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleRecurse271 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecurse283 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecurse307 = new BitSet(new long[]{0x0000000000002812L});
    public static final BitSet FOLLOW_ruleMacroDef_in_entryRuleMacroDef350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacroDef360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleMacroDef397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMacroDef414 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleMacroDef440 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMacroDef452 = new BitSet(new long[]{0x0000000000000002L});

}