package com.euclideanspace.pbase.ui;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

public class TutorialUIParser extends com.euclideanspace.pbase.ui.contentassist.antlr.TutorialParser {

  @Override
  protected TokenSource createLexer(CharStream stream) {
    PythonesqueTokenSource tokenSource = new PythonesqueTokenSource();
    tokenSource.setDelegate(super.createLexer(stream));
    return tokenSource;
  }
}