package com.euclideanspace.macro;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.AbstractSplittingTokenSource;
import org.eclipse.xtext.parser.antlr.ITokenAcceptor;

import com.euclideanspace.macro.parser.antlr.internal.InternalDemoLexer;

/**
 * Provides a token source for a language that uses macros. 
 * @author Martin Baker
 *
 */
public class MacroTokenSource extends AbstractSplittingTokenSource {

  /** holds macro definitions */
  List<MacroDefinition> macroDef = new ArrayList<MacroDefinition>();
  
  /**
   * state tells us if we are scanning normal syntax or a macro definition:
   * CONTENT - scanning normal syntax.
   * MACROID - scanning macro name
   * MACRO - scanning normal macro
   * @author Martin Baker
   */
  private enum StateValues {CONTENT,MACROID,MACRO}
  StateValues state = StateValues.CONTENT;

  /**
   * holder for macro content while it is being read.
   */
  private List<CommonToken> macroContent = new ArrayList<CommonToken>();
  
  /**
   * holder for name of macro while the macro is being read.
   */
  private String macroName;

  /**
   * When we match a macro name then use this to hold matched macro
   */
  private MacroDefinition macroFound = null;

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
	    if (token.getType() == Token.EOF) return false;
		lastToken = thisToken;
		if (token instanceof CommonToken) thisToken = (CommonToken)token;
		switch (state) {
		  case CONTENT:
			// We first look for a macro definition, then we check for a posible macro call.
			// is this 'macro' token (T__13)
			// FIXME this is not a good way to do it, a change to the grammar could break this.
			// how should this be made safe.
	        if (token.getType() == InternalDemoLexer.T__13){
	          state=StateValues.MACROID;
	          // we don't want the macro definition to be parsed so make it hidden.
	          thisToken.setChannel(Token.HIDDEN_CHANNEL);
	          return false;
	        }
	        //attempt to substitute macro
            if (token.getType() == InternalDemoLexer.RULE_ID){
            	String possibleMacroName = thisToken.getText();
            	macroFound = searchMacros(possibleMacroName);
            	// if macro found then return true
            	return macroFound != null;
            }
	        return false;
		  case MACROID:
			// is this 'endmacro' token (T__14)
			// FIXME this is not a good way to do it, a change to the grammar could break this.
			// how should this be made safe.
		    if (token.getType() == InternalDemoLexer.T__14){
		      state=StateValues.CONTENT;
		      thisToken.setChannel(Token.HIDDEN_CHANNEL);
		      return false;
		    }
            if (token.getType() == InternalDemoLexer.RULE_ID){
            	macroName = thisToken.getText();
            	state=StateValues.MACRO;
            }
            thisToken.setChannel(Token.HIDDEN_CHANNEL);
            return false;
		  case MACRO:
		    // is this 'endmacro' token (T__14)
		    // FIXME this is not a good way to do it, a change to the grammar could break this.
		    // how should this be made safe.
		    if (token.getType() == InternalDemoLexer.T__14){
		      state=StateValues.CONTENT;
		      thisToken.setChannel(Token.HIDDEN_CHANNEL);
      		  macroDef.add(new MacroDefinition(macroName,macroContent));
			  return false;
			}
	        // we are reading a macro definition so append to macro content for now
	        macroContent.add(thisToken);
	        thisToken.setChannel(Token.HIDDEN_CHANNEL);
			return false;
		  default:
		  return false;
		}
  }

  /**
   * Match a name against the list of macro definitions
   * @param possibleMacroName name of possible macro
   * @return matched macro definition or null
   */
  public MacroDefinition searchMacros(String possibleMacroName){
	  for (MacroDefinition def: macroDef){
		if (def.isName(possibleMacroName)) return def;
	  }
	  return null;
  }

  @Override
  protected void doSplitToken(Token token, ITokenAcceptor result) {
	token.setChannel(Token.HIDDEN_CHANNEL); // hide macro call
	result.accept(token);
	if (macroFound!=null) {
		List<CommonToken> content=macroFound.getContent();
		for (CommonToken tok: content) {
			result.accept(tok);
		}
	}
  }

}