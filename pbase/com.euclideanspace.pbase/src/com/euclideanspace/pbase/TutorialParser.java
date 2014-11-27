package com.euclideanspace.pbase;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

public class TutorialParser extends com.euclideanspace.pbase.parser.antlr.TutorialParser {

  @Override
  protected TokenSource createLexer(CharStream stream) {
    PythonesqueTokenSource tokenSource = new PythonesqueTokenSource();
    tokenSource.setDelegate(super.createLexer(stream));
    return tokenSource;
  }

}