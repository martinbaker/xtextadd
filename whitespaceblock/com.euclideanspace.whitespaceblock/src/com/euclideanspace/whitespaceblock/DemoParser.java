package com.euclideanspace.whitespaceblock;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

public class DemoParser extends com.euclideanspace.whitespaceblock.parser.antlr.DemoParser {

  @Override
  protected TokenSource createLexer(CharStream stream) {
    PythonesqueTokenSource tokenSource = new PythonesqueTokenSource();
    tokenSource.setDelegate(super.createLexer(stream));
    return tokenSource;
  }

}