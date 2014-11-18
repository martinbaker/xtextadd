package com.euclideanspace.macro;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
/**
 * Overview of this project here:
 * https://github.com/martinbaker/xtextadd/tree/master/macro
 */

/**
 * This holds the definition for a single macro
 * @author Martin Baker
 */
public class MacroDefinition {
	private List<CommonToken> macroContent = new ArrayList<CommonToken>();
	private String macroName;
	@SuppressWarnings("unused")
	private String scope; // Scopes for macros not supported yet
	
	/**
	 * construct a macro with a given name and content
	 * @param macroName name of macro
	 * @param macroContent content of macro
	 */
	public MacroDefinition(String macroName,List<CommonToken> macroContent){
		this.macroName = macroName;
		this.macroContent = macroContent;
	}
	
	/**
	 * true if this macro has name specified.
	 * @param macroName name of macro
	 * @return true if this macro has name specified.
	 */
	public boolean isName(String macroName){
		return (macroName.equals(this.macroName));
	}
	
	public String getName(){
	  return macroName;
	}
	
	/**
	 * get content of macro
	 * @return content of macro
	 */
	public List<CommonToken> getContent(){
		return macroContent;
	}
	
}
