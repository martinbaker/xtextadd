package com.euclideanspace.phantom1;

	import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.AbstractSplittingTokenSource;
import org.eclipse.xtext.parser.antlr.ITokenAcceptor;

import com.euclideanspace.phantom1.parser.antlr.internal.InternalTest1Lexer;

	public class Test1TokenSource extends AbstractSplittingTokenSource {

	  @Override
	  protected boolean shouldSplitToken(Token token) {
	    return token.getType() == InternalTest1Lexer.RULE_KW_CCURLY;
	  }

	  @Override
	  protected void doSplitToken(Token token, ITokenAcceptor result) {
	    System.out.println("Test1TokenSource - doSplitToken:"+token.getText());
	    result.accept(token);
	    result.accept(new PhantomToken(InternalTest1Lexer.RULE_KW_SEMICOLON,(CommonToken)token));
	  }
	}