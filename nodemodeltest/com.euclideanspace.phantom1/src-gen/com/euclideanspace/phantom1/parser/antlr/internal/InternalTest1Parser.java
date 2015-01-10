package com.euclideanspace.phantom1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.phantom1.services.Test1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTest1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_KW_OCURLY", "RULE_KW_CCURLY", "RULE_KW_SEMICOLON", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_KW_CCURLY=6;
    public static final int RULE_STRING=9;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_KW_SEMICOLON=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_KW_OCURLY=5;
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
    public String getGrammarFileName() { return "../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g"; }



     	private Test1GrammarAccess grammarAccess;
     	
        public InternalTest1Parser(TokenStream input, Test1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected Test1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:76:1: ruleModel returns [EObject current=null] : ( (lv_contents_0_0= ruleRecurse ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:79:28: ( ( (lv_contents_0_0= ruleRecurse ) )* )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:80:1: ( (lv_contents_0_0= ruleRecurse ) )*
            {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:80:1: ( (lv_contents_0_0= ruleRecurse ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_KW_OCURLY)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:81:1: (lv_contents_0_0= ruleRecurse )
            	    {
            	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:81:1: (lv_contents_0_0= ruleRecurse )
            	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:82:3: lv_contents_0_0= ruleRecurse
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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:106:1: entryRuleRecurse returns [EObject current=null] : iv_ruleRecurse= ruleRecurse EOF ;
    public final EObject entryRuleRecurse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecurse = null;


        try {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:107:2: (iv_ruleRecurse= ruleRecurse EOF )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:108:2: iv_ruleRecurse= ruleRecurse EOF
            {
             newCompositeNode(grammarAccess.getRecurseRule()); 
            pushFollow(FOLLOW_ruleRecurse_in_entryRuleRecurse166);
            iv_ruleRecurse=ruleRecurse();

            state._fsp--;

             current =iv_ruleRecurse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurse176); 

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
    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:115:1: ruleRecurse returns [EObject current=null] : ( ( (lv_n_0_0= RULE_ID ) ) | (this_KW_OCURLY_1= RULE_KW_OCURLY ( (lv_r_2_0= ruleRecurse ) ) this_KW_CCURLY_3= RULE_KW_CCURLY (this_KW_SEMICOLON_4= RULE_KW_SEMICOLON )? ) ) ;
    public final EObject ruleRecurse() throws RecognitionException {
        EObject current = null;

        Token lv_n_0_0=null;
        Token this_KW_OCURLY_1=null;
        Token this_KW_CCURLY_3=null;
        Token this_KW_SEMICOLON_4=null;
        EObject lv_r_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:118:28: ( ( ( (lv_n_0_0= RULE_ID ) ) | (this_KW_OCURLY_1= RULE_KW_OCURLY ( (lv_r_2_0= ruleRecurse ) ) this_KW_CCURLY_3= RULE_KW_CCURLY (this_KW_SEMICOLON_4= RULE_KW_SEMICOLON )? ) ) )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:119:1: ( ( (lv_n_0_0= RULE_ID ) ) | (this_KW_OCURLY_1= RULE_KW_OCURLY ( (lv_r_2_0= ruleRecurse ) ) this_KW_CCURLY_3= RULE_KW_CCURLY (this_KW_SEMICOLON_4= RULE_KW_SEMICOLON )? ) )
            {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:119:1: ( ( (lv_n_0_0= RULE_ID ) ) | (this_KW_OCURLY_1= RULE_KW_OCURLY ( (lv_r_2_0= ruleRecurse ) ) this_KW_CCURLY_3= RULE_KW_CCURLY (this_KW_SEMICOLON_4= RULE_KW_SEMICOLON )? ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_KW_OCURLY) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:119:2: ( (lv_n_0_0= RULE_ID ) )
                    {
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:119:2: ( (lv_n_0_0= RULE_ID ) )
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:120:1: (lv_n_0_0= RULE_ID )
                    {
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:120:1: (lv_n_0_0= RULE_ID )
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:121:3: lv_n_0_0= RULE_ID
                    {
                    lv_n_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecurse218); 

                    			newLeafNode(lv_n_0_0, grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRecurseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"n",
                            		lv_n_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:138:6: (this_KW_OCURLY_1= RULE_KW_OCURLY ( (lv_r_2_0= ruleRecurse ) ) this_KW_CCURLY_3= RULE_KW_CCURLY (this_KW_SEMICOLON_4= RULE_KW_SEMICOLON )? )
                    {
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:138:6: (this_KW_OCURLY_1= RULE_KW_OCURLY ( (lv_r_2_0= ruleRecurse ) ) this_KW_CCURLY_3= RULE_KW_CCURLY (this_KW_SEMICOLON_4= RULE_KW_SEMICOLON )? )
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:138:7: this_KW_OCURLY_1= RULE_KW_OCURLY ( (lv_r_2_0= ruleRecurse ) ) this_KW_CCURLY_3= RULE_KW_CCURLY (this_KW_SEMICOLON_4= RULE_KW_SEMICOLON )?
                    {
                    this_KW_OCURLY_1=(Token)match(input,RULE_KW_OCURLY,FOLLOW_RULE_KW_OCURLY_in_ruleRecurse241); 
                     
                        newLeafNode(this_KW_OCURLY_1, grammarAccess.getRecurseAccess().getKW_OCURLYTerminalRuleCall_1_0()); 
                        
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:142:1: ( (lv_r_2_0= ruleRecurse ) )
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:143:1: (lv_r_2_0= ruleRecurse )
                    {
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:143:1: (lv_r_2_0= ruleRecurse )
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:144:3: lv_r_2_0= ruleRecurse
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecurse_in_ruleRecurse261);
                    lv_r_2_0=ruleRecurse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecurseRule());
                    	        }
                           		set(
                           			current, 
                           			"r",
                            		lv_r_2_0, 
                            		"Recurse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_KW_CCURLY_3=(Token)match(input,RULE_KW_CCURLY,FOLLOW_RULE_KW_CCURLY_in_ruleRecurse272); 
                     
                        newLeafNode(this_KW_CCURLY_3, grammarAccess.getRecurseAccess().getKW_CCURLYTerminalRuleCall_1_2()); 
                        
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:164:1: (this_KW_SEMICOLON_4= RULE_KW_SEMICOLON )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_KW_SEMICOLON) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:164:2: this_KW_SEMICOLON_4= RULE_KW_SEMICOLON
                            {
                            this_KW_SEMICOLON_4=(Token)match(input,RULE_KW_SEMICOLON,FOLLOW_RULE_KW_SEMICOLON_in_ruleRecurse283); 
                             
                                newLeafNode(this_KW_SEMICOLON_4, grammarAccess.getRecurseAccess().getKW_SEMICOLONTerminalRuleCall_1_3()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleModel130 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleRecurse_in_entryRuleRecurse166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurse176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecurse218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KW_OCURLY_in_ruleRecurse241 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleRecurse261 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_KW_CCURLY_in_ruleRecurse272 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_KW_SEMICOLON_in_ruleRecurse283 = new BitSet(new long[]{0x0000000000000002L});

}