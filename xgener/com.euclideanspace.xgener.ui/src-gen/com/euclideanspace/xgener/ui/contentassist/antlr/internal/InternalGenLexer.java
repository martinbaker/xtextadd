package com.euclideanspace.xgener.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalGenLexer() {;} 
    public InternalGenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:11:7: ( 'BRACES' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:11:9: 'BRACES'
            {
            match("BRACES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:12:7: ( 'INDENT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:12:9: 'INDENT'
            {
            match("INDENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:13:7: ( 'COLONSEPERATED' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:13:9: 'COLONSEPERATED'
            {
            match("COLONSEPERATED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:14:7: ( 'SPACESEPERATED' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:14:9: 'SPACESEPERATED'
            {
            match("SPACESEPERATED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:15:7: ( 'INHEADER' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:15:9: 'INHEADER'
            {
            match("INHEADER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:16:7: ( 'INFERRED' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:16:9: 'INFERRED'
            {
            match("INFERRED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:17:7: ( 'UNTYPED' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:17:9: 'UNTYPED'
            {
            match("UNTYPED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:18:7: ( 'INT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:18:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:19:7: ( 'STRING' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:19:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:20:7: ( 'BOOL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:20:9: 'BOOL'
            {
            match("BOOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:21:7: ( 'FLOAT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:21:9: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:22:7: ( 'CLASS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:22:9: 'CLASS'
            {
            match("CLASS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:23:7: ( 'PREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:23:9: 'PREFIX'
            {
            match("PREFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:24:7: ( 'SUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:24:9: 'SUFFIX'
            {
            match("SUFFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:25:7: ( 'BLOCKING' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:25:9: 'BLOCKING'
            {
            match("BLOCKING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:26:7: ( 'PROCEDURE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:26:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:27:7: ( 'TYPES' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:27:9: 'TYPES'
            {
            match("TYPES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:28:7: ( 'STATEMENT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:28:9: 'STATEMENT'
            {
            match("STATEMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:29:7: ( 'REPEAT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:29:9: 'REPEAT'
            {
            match("REPEAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:30:7: ( 'UNTIL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:30:9: 'UNTIL'
            {
            match("UNTIL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:31:7: ( 'WHILE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:31:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:32:7: ( 'DO' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:32:9: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:33:7: ( 'FOR' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:33:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:34:7: ( 'VAR' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:34:9: 'VAR'
            {
            match("VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:35:7: ( '=' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:35:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:36:7: ( 'VAL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:36:9: 'VAL'
            {
            match("VAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:37:7: ( 'EXPRESSION' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:37:9: 'EXPRESSION'
            {
            match("EXPRESSION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:38:7: ( '.' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:38:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:39:7: ( '[' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:39:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:40:7: ( ']' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:40:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:41:7: ( 'NOCLASS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:41:9: 'NOCLASS'
            {
            match("NOCLASS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:42:7: ( 'CALLER' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:42:9: 'CALLER'
            {
            match("CALLER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:43:7: ( 'INFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:43:9: 'INFIX'
            {
            match("INFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:44:7: ( 'OUTER' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:44:9: 'OUTER'
            {
            match("OUTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:45:7: ( 'INFIXLEFT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:45:9: 'INFIXLEFT'
            {
            match("INFIXLEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:46:7: ( 'LITERAL' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:46:9: 'LITERAL'
            {
            match("LITERAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:47:7: ( 'BRACKET' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:47:9: 'BRACKET'
            {
            match("BRACKET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:48:7: ( 'PARENTHESIS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:48:9: 'PARENTHESIS'
            {
            match("PARENTHESIS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:49:7: ( 'ANGLE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:49:9: 'ANGLE'
            {
            match("ANGLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:50:7: ( 'INNERPREFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:50:9: 'INNERPREFIX'
            {
            match("INNERPREFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:51:7: ( 'INNERSUFFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:51:9: 'INNERSUFFIX'
            {
            match("INNERSUFFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:52:7: ( 'INNERINFIX' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:52:9: 'INNERINFIX'
            {
            match("INNERINFIX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:53:7: ( 'INNERINFIXLEFT' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:53:9: 'INNERINFIXLEFT'
            {
            match("INNERINFIXLEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:54:7: ( 'INNERBRACKET' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:54:9: 'INNERBRACKET'
            {
            match("INNERBRACKET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:55:7: ( 'INNERBRACES' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:55:9: 'INNERBRACES'
            {
            match("INNERBRACES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:56:7: ( 'INNERPARENTHESIS' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:56:9: 'INNERPARENTHESIS'
            {
            match("INNERPARENTHESIS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:57:7: ( 'INNERANGLE' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:57:9: 'INNERANGLE'
            {
            match("INNERANGLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6970:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6970:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6970:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6970:11: '^'
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

            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6970:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:
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
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6972:10: ( ( '0' .. '9' )+ )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6972:12: ( '0' .. '9' )+
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6972:12: ( '0' .. '9' )+
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
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6972:13: '0' .. '9'
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
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6974:61: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6976:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6976:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6976:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6976:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6978:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6978:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6978:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6978:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6978:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6978:41: ( '\\r' )? '\\n'
                    {
                    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6978:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6978:41: '\\r'
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
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6980:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6980:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6980:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6982:16: ( . )
            // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:6982:18: .
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
        // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=54;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:292: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 49 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:300: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 50 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:309: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 51 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:321: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:337: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:353: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // ../com.euclideanspace.xgener.ui/src-gen/com/euclideanspace/xgener/ui/contentassist/antlr/internal/InternalGen.g:1:361: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\14\41\1\uffff\1\41\3\uffff\4\41\1\35\2\uffff\3\35\2\uffff\3\41\1\uffff\17\41\1\131\1\41\1\uffff\1\41\3\uffff\4\41\5\uffff\6\41\1\150\12\41\1\164\6\41\1\uffff\1\173\1\174\6\41\1\u0084\5\41\1\uffff\13\41\1\uffff\6\41\2\uffff\7\41\1\uffff\4\41\1\u00a7\2\41\1\u00ae\6\41\1\u00b5\1\u00b6\3\41\1\u00ba\1\41\1\u00bc\2\41\1\u00bf\1\41\1\u00c1\1\u00c2\2\41\1\u00c5\3\41\1\uffff\6\41\1\uffff\1\u00d0\1\41\1\u00d2\1\41\1\u00d4\1\41\2\uffff\1\u00d6\2\41\1\uffff\1\u00d9\1\uffff\2\41\1\uffff\1\41\2\uffff\1\u00dd\1\41\1\uffff\12\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\u00eb\1\uffff\2\41\1\uffff\1\41\1\u00ef\1\u00f0\1\uffff\1\u00f1\1\u00f2\1\u00f3\12\41\1\uffff\3\41\5\uffff\1\u0101\10\41\1\u010b\1\u010c\2\41\1\uffff\3\41\1\u0113\2\41\1\u0116\2\41\2\uffff\1\41\1\u011a\1\u011b\1\41\1\u011d\1\41\1\uffff\1\41\1\u0120\1\uffff\2\41\1\u0123\2\uffff\1\41\1\uffff\1\41\1\u0126\1\uffff\2\41\1\uffff\2\41\1\uffff\3\41\1\u012e\1\u012f\1\u0130\1\41\3\uffff\1\u0132\1\uffff";
    static final String DFA12_eofS =
        "\u0133\uffff";
    static final String DFA12_minS =
        "\1\0\1\114\1\116\1\101\1\120\1\116\1\114\1\101\1\131\1\105\1\110\1\117\1\101\1\uffff\1\130\3\uffff\1\117\1\125\1\111\1\116\1\101\2\uffff\2\0\1\52\2\uffff\1\101\2\117\1\uffff\1\104\1\114\1\101\1\114\2\101\1\106\1\124\1\117\1\122\1\105\1\122\2\120\1\111\1\60\1\114\1\uffff\1\120\3\uffff\1\103\2\124\1\107\5\uffff\1\103\1\114\1\103\3\105\1\60\1\105\1\117\1\123\1\114\1\103\1\111\1\124\1\106\1\111\1\101\1\60\1\106\1\103\3\105\1\114\1\uffff\2\60\1\122\1\114\2\105\1\114\1\105\1\60\1\113\1\116\1\101\1\122\1\130\1\uffff\1\122\1\116\1\123\2\105\1\116\1\105\1\111\1\120\1\114\1\124\1\uffff\1\111\1\105\1\116\1\123\1\101\1\105\2\uffff\1\105\1\101\2\122\1\105\1\123\1\105\1\uffff\1\111\1\124\1\104\1\122\1\60\1\101\1\123\1\60\1\122\1\123\1\107\1\115\1\130\1\105\2\60\1\130\1\104\1\124\1\60\1\124\1\60\2\123\1\60\1\101\2\60\1\124\1\116\1\60\3\105\1\uffff\1\101\1\125\1\116\1\122\1\116\1\105\1\uffff\1\60\1\105\1\60\1\105\1\60\1\104\2\uffff\1\60\1\125\1\110\1\uffff\1\60\1\uffff\2\123\1\uffff\1\114\2\uffff\1\60\1\107\1\uffff\1\122\1\104\1\106\1\105\1\122\2\106\1\101\1\107\1\120\1\uffff\1\120\1\uffff\1\116\1\uffff\1\60\1\uffff\1\122\1\105\1\uffff\1\111\2\60\1\uffff\3\60\1\124\1\106\1\105\1\106\1\111\1\103\1\114\2\105\1\124\1\uffff\1\105\1\123\1\117\5\uffff\1\60\1\111\1\116\1\111\1\130\2\105\2\122\2\60\1\111\1\116\1\uffff\1\130\1\124\1\130\1\60\1\105\1\123\1\60\2\101\2\uffff\1\123\2\60\1\110\1\60\1\105\1\uffff\1\124\1\60\1\uffff\2\124\1\60\2\uffff\1\105\1\uffff\1\106\1\60\1\uffff\2\105\1\uffff\1\123\1\124\1\uffff\2\104\1\111\3\60\1\123\3\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\122\1\116\1\117\1\125\1\116\1\117\1\122\1\131\1\105\1\110\1\117\1\101\1\uffff\1\130\3\uffff\1\117\1\125\1\111\1\116\1\172\2\uffff\2\uffff\1\57\2\uffff\1\101\2\117\1\uffff\1\124\1\114\1\101\1\114\1\101\1\122\1\106\1\124\1\117\1\122\1\117\1\122\2\120\1\111\1\172\1\122\1\uffff\1\120\3\uffff\1\103\2\124\1\107\5\uffff\1\103\1\114\1\103\2\105\1\111\1\172\1\105\1\117\1\123\1\114\1\103\1\111\1\124\1\106\1\131\1\101\1\172\1\106\1\103\3\105\1\114\1\uffff\2\172\1\122\1\114\2\105\1\114\1\113\1\172\1\113\1\116\1\101\1\122\1\130\1\uffff\1\122\1\116\1\123\2\105\1\116\1\105\1\111\1\120\1\114\1\124\1\uffff\1\111\1\105\1\116\1\123\1\101\1\105\2\uffff\1\105\1\101\2\122\1\105\1\123\1\105\1\uffff\1\111\1\124\1\104\1\122\1\172\2\123\1\172\1\122\1\123\1\107\1\115\1\130\1\105\2\172\1\130\1\104\1\124\1\172\1\124\1\172\2\123\1\172\1\101\2\172\1\124\1\116\1\172\3\105\1\uffff\1\122\1\125\1\116\1\122\1\116\1\105\1\uffff\1\172\1\105\1\172\1\105\1\172\1\104\2\uffff\1\172\1\125\1\110\1\uffff\1\172\1\uffff\2\123\1\uffff\1\114\2\uffff\1\172\1\107\1\uffff\1\122\1\104\1\106\1\105\1\122\2\106\1\101\1\107\1\120\1\uffff\1\120\1\uffff\1\116\1\uffff\1\172\1\uffff\1\122\1\105\1\uffff\1\111\2\172\1\uffff\3\172\1\124\1\106\1\105\1\106\1\111\1\103\1\114\2\105\1\124\1\uffff\1\105\1\123\1\117\5\uffff\1\172\1\111\1\116\1\111\1\130\1\113\1\105\2\122\2\172\1\111\1\116\1\uffff\1\130\1\124\1\130\1\172\1\105\1\123\1\172\2\101\2\uffff\1\123\2\172\1\110\1\172\1\105\1\uffff\1\124\1\172\1\uffff\2\124\1\172\2\uffff\1\105\1\uffff\1\106\1\172\1\uffff\2\105\1\uffff\1\123\1\124\1\uffff\2\104\1\111\3\172\1\123\3\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\15\uffff\1\31\1\uffff\1\34\1\35\1\36\5\uffff\1\60\1\61\3\uffff\1\65\1\66\3\uffff\1\60\21\uffff\1\31\1\uffff\1\34\1\35\1\36\4\uffff\1\61\1\62\1\63\1\64\1\65\30\uffff\1\26\16\uffff\1\10\13\uffff\1\27\6\uffff\1\30\1\32\7\uffff\1\12\42\uffff\1\41\6\uffff\1\14\6\uffff\1\24\1\13\3\uffff\1\21\1\uffff\1\25\2\uffff\1\42\1\uffff\1\47\1\1\2\uffff\1\2\12\uffff\1\40\1\uffff\1\11\1\uffff\1\16\1\uffff\1\15\2\uffff\1\23\3\uffff\1\45\15\uffff\1\7\3\uffff\1\37\1\44\1\17\1\5\1\6\15\uffff\1\43\11\uffff\1\22\1\20\6\uffff\1\52\2\uffff\1\57\3\uffff\1\33\1\50\1\uffff\1\51\2\uffff\1\55\2\uffff\1\46\2\uffff\1\54\7\uffff\1\53\1\3\1\4\1\uffff\1\56";
    static final String DFA12_specialS =
        "\1\0\30\uffff\1\1\1\2\u0118\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\4\35\1\32\6\35\1\17\1\33\12\30\3\35\1\15\3\35\1\25\1\1\1\3\1\13\1\16\1\6\2\27\1\2\2\27\1\24\1\27\1\22\1\23\1\7\1\27\1\11\1\4\1\10\1\5\1\14\1\12\3\27\1\20\1\35\1\21\1\26\1\27\1\35\32\27\uff85\35",
            "\1\40\2\uffff\1\37\2\uffff\1\36",
            "\1\42",
            "\1\45\12\uffff\1\44\2\uffff\1\43",
            "\1\46\3\uffff\1\47\1\50",
            "\1\51",
            "\1\52\2\uffff\1\53",
            "\1\55\20\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\64",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\75",
            "\0\75",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104\1\uffff\1\106\1\uffff\1\105\5\uffff\1\110\5\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\116\20\uffff\1\115",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\11\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\133\5\uffff\1\132",
            "",
            "\1\134",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146\3\uffff\1\147",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\162\17\uffff\1\161",
            "\1\163",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\5\uffff\1\u0083",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\41\7\uffff\13\41\1\u00a6\16\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ac\1\u00ab\6\uffff\1\u00aa\6\uffff\1\u00a8\2\uffff\1\u00a9",
            "\1\u00ad",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00bb",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00bd",
            "\1\u00be",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c0",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c3",
            "\1\u00c4",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00ca\20\uffff\1\u00c9",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d5",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0107\5\uffff\1\u0106",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\12\41\7\uffff\13\41\1\u0112\16\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0114",
            "\1\u0115",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0117",
            "\1\u0118",
            "",
            "",
            "\1\u0119",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u011c",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u011e",
            "",
            "\1\u011f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0121",
            "\1\u0122",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u0124",
            "",
            "\1\u0125",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0131",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='B') ) {s = 1;}

                        else if ( (LA12_0=='I') ) {s = 2;}

                        else if ( (LA12_0=='C') ) {s = 3;}

                        else if ( (LA12_0=='S') ) {s = 4;}

                        else if ( (LA12_0=='U') ) {s = 5;}

                        else if ( (LA12_0=='F') ) {s = 6;}

                        else if ( (LA12_0=='P') ) {s = 7;}

                        else if ( (LA12_0=='T') ) {s = 8;}

                        else if ( (LA12_0=='R') ) {s = 9;}

                        else if ( (LA12_0=='W') ) {s = 10;}

                        else if ( (LA12_0=='D') ) {s = 11;}

                        else if ( (LA12_0=='V') ) {s = 12;}

                        else if ( (LA12_0=='=') ) {s = 13;}

                        else if ( (LA12_0=='E') ) {s = 14;}

                        else if ( (LA12_0=='.') ) {s = 15;}

                        else if ( (LA12_0=='[') ) {s = 16;}

                        else if ( (LA12_0==']') ) {s = 17;}

                        else if ( (LA12_0=='N') ) {s = 18;}

                        else if ( (LA12_0=='O') ) {s = 19;}

                        else if ( (LA12_0=='L') ) {s = 20;}

                        else if ( (LA12_0=='A') ) {s = 21;}

                        else if ( (LA12_0=='^') ) {s = 22;}

                        else if ( ((LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||LA12_0=='M'||LA12_0=='Q'||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 23;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 24;}

                        else if ( (LA12_0=='\"') ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=':' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 61;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 61;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}