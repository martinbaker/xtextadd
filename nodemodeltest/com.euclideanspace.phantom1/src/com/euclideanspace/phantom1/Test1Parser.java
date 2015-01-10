package com.euclideanspace.phantom1;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

public class Test1Parser extends com.euclideanspace.phantom1.parser.antlr.Test1Parser {

  @Override
  protected TokenSource createLexer(CharStream stream) {
    Test1TokenSource tokenSource = new Test1TokenSource();
    tokenSource.setDelegate(super.createLexer(stream));
    return tokenSource;
  }
}