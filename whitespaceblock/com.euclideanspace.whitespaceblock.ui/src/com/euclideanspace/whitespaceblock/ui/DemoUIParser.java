package com.euclideanspace.whitespaceblock.ui;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

public class DemoUIParser extends com.euclideanspace.whitespaceblock.ui.contentassist.antlr.DemoParser {

  @Override
  protected TokenSource createLexer(CharStream stream) {
    PythonesqueTokenSource tokenSource = new PythonesqueTokenSource();
    tokenSource.setDelegate(super.createLexer(stream));
    return tokenSource;
  }
}