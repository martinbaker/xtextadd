package com.euclideanspace.whitespaceblock;
import java.util.Stack;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.AbstractSplittingTokenSource;
import org.eclipse.xtext.parser.antlr.ITokenAcceptor;

import com.euclideanspace.whitespaceblock.parser.antlr.internal.InternalDemoLexer;

/**
 * Provides a token source for a language that uses whitespace to deleneate
 * blocks, in a similar way to the Python language. 
 * @author Martin Baker
 *
 */
public class PythonesqueTokenSource extends AbstractSplittingTokenSource {

  /** holds previous indent values */
  Stack<Integer> pile = new Stack<Integer>();
  
  /** holds current indent, that is, a count of the number of spaces or
   * tabs following a new line
   */
  int indent=0;
  
  /**
   * state tells us what part of the line are we currently reading:
   * FIRSTLINE - when reading firstline don't insert BEGIN because we don't need BEGIN-END round whole program.
   * INDENT - where we count the number of spaces or tabs to update indent
   * BODY - we have read a non-space since last newline so we are no longer in indent
   * CONTINUATION - we have just read a continuation token so next line does not alter indent
   * @author Martin Baker
   */
  private enum StateValues {FIRSTLINE,INDENT,BODY,CONTINUATION}
  StateValues state = StateValues.FIRSTLINE;
  
  /**
   * This holds the indent of the first non-empty line
   */
  int initialIndent=0;

  /**
   * tell doSplitToken number of BEGINs to emit
   */
  int indentIncrement=0;

  /**
   * tell doSplitToken number of ENDSs to emit
   */
  int indentDecrement=0;
  
  /**
   * We hold thisToken and lastToken because we need lastToken in doSplitToken.
   * TODO this is a hack, it would be better if AbstractSplittingTokenSource
   * provided this.
   */
  CommonToken thisToken = null;

  /**
   * We hold thisToken and lastToken because we need lastToken in doSplitToken.
   * TODO this is a hack, it would be better if AbstractSplittingTokenSource
   * provided this.
   */
  CommonToken lastToken = null;
  
  @Override
  protected boolean shouldSplitToken(Token token) {
    // if end-of-file then close any remaining blocks
    if (token.getType() == Token.EOF) {
      if (pile.empty()) return false;
      while (!pile.empty()) {
        pile.pop();
        indentDecrement++;
      }
      return true;
    }
	lastToken = thisToken;
	if (token instanceof CommonToken) thisToken = (CommonToken)token;
	switch (state) {
	  case FIRSTLINE:
		if (token.getType() == InternalDemoLexer.RULE_WS) {
		  indent=countSpaces(indent,token.getText());
		  return false;
		} else if (token.getType() == InternalDemoLexer.RULE_SL_COMMENT) {
		  indent=0; // comment contains new line
		  return false;
		} else if (token.getType() == InternalDemoLexer.RULE_LINECONTINUATION) {
		  state = StateValues.CONTINUATION;
		  return false;
		} else {
		  state = StateValues.BODY;
		  initialIndent=indent;
		  return true;
		}
	  case INDENT:
		if (token.getType() == InternalDemoLexer.RULE_WS) {
		  indent=countSpaces(indent,token.getText());
		  return false;
		} else if (token.getType() == InternalDemoLexer.RULE_SL_COMMENT) {
		  indent=0; // comment contains new line
		  return false;
		} else if (token.getType() == InternalDemoLexer.RULE_LINECONTINUATION) {
		  state = StateValues.CONTINUATION;
		  return false;
		} else {
		  state = StateValues.BODY;
		  int peek =initialIndent; // if pile is empty use initialIndent
		  if (!pile.empty()) peek=pile.peek();
		  if (indent == peek) return false;
		  if (indent < peek) {
  		    while (!pile.empty() && indent < peek) {
              pile.pop();
              if (!pile.empty()) peek=pile.peek(); else peek=initialIndent;
			  indentDecrement++;
  		    }
		  }
		  if (indent > peek) {
			  pile.push(indent);
			  indentIncrement++;
		  }
		  return true;
		}
	  case BODY:
	    if (token.getType() == InternalDemoLexer.RULE_WS) {
	    	int c=countSpacesAfterNewline(token.getText());
	    	if (c<0) return false;
	    	indent = c;
	    	state = StateValues.INDENT;
	    	return false;
	    } else if (token.getType() == InternalDemoLexer.RULE_SL_COMMENT) {
	    	indent = 0;
	    	state = StateValues.INDENT;
		} else if (token.getType() == InternalDemoLexer.RULE_LINECONTINUATION) {
			state = StateValues.CONTINUATION;
			return false;
		} else {
			return false;
		}
	  case CONTINUATION:
	    if (token.getType() == InternalDemoLexer.RULE_WS) {
	    	int c=countSpacesAfterNewline(token.getText());
	    	if (c<0) {
	    		// if newline follows CONTINUATION then don't change indent on new line
	    		state = StateValues.BODY;
	    	}
	    	return false;		
		} else if (token.getType() == InternalDemoLexer.RULE_SL_COMMENT) {
    		// if comment follows CONTINUATION then don't change indent on new line
    		state = StateValues.BODY;
    		return false;
		} else if (token.getType() == InternalDemoLexer.RULE_LINECONTINUATION) {
			// changes nothing
			return false;
		} else {
			return false;
		}
	  default:
		  return false;
	}
  }

  @Override
  protected void doSplitToken(Token token, ITokenAcceptor result) {
	while (indentIncrement>0) {
		result.accept(new PhantomToken(InternalDemoLexer.RULE_BEGIN,lastToken));
		indentIncrement--;
	}
	while (indentDecrement>0) {
		result.accept(new PhantomToken(InternalDemoLexer.RULE_END,lastToken));
		indentDecrement--;
	}
    result.accept(token);
  }

  /**
   * count the number of spaces and add to indent.
   * @param currentIndent the number of spaces already read.
   * @param text contains 1 or more whitespace elements.
   * @return new value of indent.
   */
  protected int countSpaces(int currentIndent,String text){
	  int result = currentIndent;
	  if (text == null) return result;
	  char[] charArray = text.toCharArray();
	  for (char c : charArray) {
		  if (c==' ') result++;
		  if (c=='\t') result=result+4;
		  if (c=='\n') result=0;
		  if (c=='\r') result=0;
	  }
	  return result;
  }

  /**
   * returns -1 if no newline, otherwise number of spaces after it
   * @param text contains 1 or more whitespace elements.
   * @return -1 if no newline, otherwise number of spaces after it
   */
  protected int countSpacesAfterNewline(String text){
	  int result = -1;
	  if (text == null) return result;
	  char[] charArray = text.toCharArray();
	  for (char c : charArray) {
		  if (c==' ') if (result > -1) result++;
		  if (c=='\t') if (result > -1) result=result+4;
		  if (c=='\n') result=0;
		  if (c=='\r') result=0;
	  }
	  return result;
  }
}