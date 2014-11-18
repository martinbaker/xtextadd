package com.euclideanspace.macro;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

/**
 * Overview of this project here:
 * https://github.com/martinbaker/xtextadd/tree/master/macro
 */
public class DemoParser extends com.euclideanspace.macro.parser.antlr.DemoParser {

  @Override
  protected TokenSource createLexer(CharStream stream) {
    MacroTokenSource tokenSource = new MacroTokenSource();
    tokenSource.setDelegate(super.createLexer(stream));
    return tokenSource;
  }

}