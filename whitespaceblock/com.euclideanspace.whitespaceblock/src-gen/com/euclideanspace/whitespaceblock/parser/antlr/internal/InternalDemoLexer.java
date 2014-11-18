package com.euclideanspace.whitespaceblock.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoLexer extends Lexer {
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

    public InternalDemoLexer() {;} 
    public InternalDemoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDemoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g"; }

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:187:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:187:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:187:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:187:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:187:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:189:10: ( ( '0' .. '9' )+ )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:189:12: ( '0' .. '9' )+
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:189:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:189:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:191:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            int _type = RULE_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:193:12: ( '{|' )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:193:14: '{|'
            {
            match("{|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:195:10: ( '|}' )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:195:12: '|}'
            {
            match("|}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_LINECONTINUATION"
    public final void mRULE_LINECONTINUATION() throws RecognitionException {
        try {
            int _type = RULE_LINECONTINUATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:197:23: ( '\\\\' )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:197:25: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINECONTINUATION"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:199:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:199:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:199:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:199:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:199:39: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:199:40: ( '\\r' )? '\\n'
                    {
                    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:199:40: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:199:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:201:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:201:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:201:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:203:16: ( . )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:203:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:8: ( RULE_ID | RULE_INT | RULE_STRING | RULE_BEGIN | RULE_END | RULE_LINECONTINUATION | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=9;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:10: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 2 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:18: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 3 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:27: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 4 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:39: RULE_BEGIN
                {
                mRULE_BEGIN(); 

                }
                break;
            case 5 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:50: RULE_END
                {
                mRULE_END(); 

                }
                break;
            case 6 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:59: RULE_LINECONTINUATION
                {
                mRULE_LINECONTINUATION(); 

                }
                break;
            case 7 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:81: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 8 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:97: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 9 :
                // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:1:105: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\13\2\uffff\4\13\14\uffff";
    static final String DFA11_eofS =
        "\24\uffff";
    static final String DFA11_minS =
        "\1\0\1\101\2\uffff\2\0\1\174\1\175\14\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\172\2\uffff\2\uffff\1\174\1\175\14\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\1\1\2\4\uffff\1\6\1\7\1\10\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA11_specialS =
        "\1\0\3\uffff\1\1\1\2\16\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\1\13\1\4\1\11\3\13\1\5\10\13\12\3\7\13\32\2\1\13\1\10\1\13\1\1\1\2\1\13\32\2\1\6\1\7\uff83\13",
            "\32\14\4\uffff\1\14\1\uffff\32\14",
            "",
            "",
            "\0\16",
            "\0\16",
            "\1\17",
            "\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_ID | RULE_INT | RULE_STRING | RULE_BEGIN | RULE_END | RULE_LINECONTINUATION | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='^') ) {s = 1;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {s = 2;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 3;}

                        else if ( (LA11_0=='\"') ) {s = 4;}

                        else if ( (LA11_0=='\'') ) {s = 5;}

                        else if ( (LA11_0=='{') ) {s = 6;}

                        else if ( (LA11_0=='|') ) {s = 7;}

                        else if ( (LA11_0=='\\') ) {s = 8;}

                        else if ( (LA11_0=='#') ) {s = 9;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 10;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='$' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='/')||(LA11_0>=':' && LA11_0<='@')||LA11_0=='['||LA11_0==']'||LA11_0=='`'||(LA11_0>='}' && LA11_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_4 = input.LA(1);

                        s = -1;
                        if ( ((LA11_4>='\u0000' && LA11_4<='\uFFFF')) ) {s = 14;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_5 = input.LA(1);

                        s = -1;
                        if ( ((LA11_5>='\u0000' && LA11_5<='\uFFFF')) ) {s = 14;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}