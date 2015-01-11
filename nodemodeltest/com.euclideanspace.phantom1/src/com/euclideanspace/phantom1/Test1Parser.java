package com.euclideanspace.phantom1;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.emf.ecore.EObject;

public class Test1Parser extends com.euclideanspace.phantom1.parser.antlr.Test1Parser {

  @Override
  protected TokenSource createLexer(CharStream stream) {
    Test1TokenSource tokenSource = new Test1TokenSource();
    tokenSource.setDelegate(super.createLexer(stream));
    return tokenSource;
  }
}