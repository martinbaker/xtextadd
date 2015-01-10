package com.euclideanspace.phantom1;

import java.io.FileWriter;
import java.util.List;

import org.antlr.runtime.ClassicToken;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.nodemodel.BidiIterable;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

/**
 * Customised logging mechanism to try to help me understand xtext better
 * and debug code.
 * @author Martin Baker
 */
public class TestFileWriter {
	static FileWriter writer = null;
	
    static void out(String msg){
    	if (writer==null){
    		try {
    		  writer = new FileWriter("/home/martin/log.txt");
    		} catch (Exception e) {
    			System.out.println("EditorFileWriter:"+e);
    		}
    	}
    	try {
			writer.append(msg+"\n");
			writer.flush();
		} catch (Exception e) {
			System.out.println("EditorFileWriter:"+e);
		}
    }
    
    static public String showGrammarElement(EObject eo){
    	String result = "[eobject="+eo;
		if (eo instanceof org.eclipse.xtext.impl.KeywordImpl){
			org.eclipse.xtext.impl.KeywordImpl rgrammarElement =
					(org.eclipse.xtext.impl.KeywordImpl)eo;			
			result = "[KeywordImpl="+rgrammarElement.eContainerFeatureID()+
					" value="+rgrammarElement.getValue();
		} else if (eo instanceof org.eclipse.xtext.impl.TerminalRuleImpl){
			org.eclipse.xtext.impl.TerminalRuleImpl rgrammarElement =
					(org.eclipse.xtext.impl.TerminalRuleImpl)eo;			
			result = "[TerminalRuleImpl="+rgrammarElement.eContainerFeatureID()+
					" name="+rgrammarElement.getName();
		} else if (eo instanceof org.eclipse.xtext.impl.RuleCallImpl){
			org.eclipse.xtext.impl.RuleCallImpl rgrammarElement =
					(org.eclipse.xtext.impl.RuleCallImpl)eo;
			result = "[RuleCallImpl="+rgrammarElement.eContainerFeatureID();
			result = result + " cardinality="+rgrammarElement.getCardinality();
			AbstractRule ar=rgrammarElement.getRule();
			if (ar !=null) result = result + " ele-name="+ar.getName();;
		} else if (eo instanceof org.eclipse.xtext.impl.ParserRuleImpl){
			org.eclipse.xtext.impl.ParserRuleImpl rgrammarElement =
					(org.eclipse.xtext.impl.ParserRuleImpl)eo;			
			result = " [ParserRuleImpl="+rgrammarElement.eContainerFeatureID()+
					" ele-name="+rgrammarElement.getName();
		}    	
    	return result+"]";
    }
    
    static public String showNodeModel(INode node,boolean recursive,int indent){
    	BidiIterable<INode> ch=null;
        String result = "[unknown";
  	if (node instanceof org.eclipse.xtext.nodemodel.impl.RootNode){
  		org.eclipse.xtext.nodemodel.impl.RootNode rnode =(org.eclipse.xtext.nodemodel.impl.RootNode)node;			
  		result = "[rootnode "+rnode.getIndex();
  		ch=rnode.getChildren();
  	} else if (node instanceof org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement){
  		org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement rnode =(org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement)node;
  		result = "[CompositeNodeWithSemanticElement";
  		if (rnode.hasDirectSemanticElement()) result = result+" dir";
  		ch=rnode.getChildren();
  	} else if (node instanceof org.eclipse.xtext.nodemodel.impl.LeafNode){
  		//org.eclipse.xtext.nodemodel.impl.LeafNode rnode =(org.eclipse.xtext.nodemodel.impl.LeafNode)node;
  		result = "[LeafNode ";
  	} else if (node instanceof org.eclipse.xtext.nodemodel.impl.CompositeNode){
  		org.eclipse.xtext.nodemodel.impl.CompositeNode rnode =(org.eclipse.xtext.nodemodel.impl.CompositeNode)node;
  		result = "[CompositeNode direct="+rnode.hasDirectSemanticElement();
  		result = result+" lookah="+rnode.getLookAhead();
  		ch=rnode.getChildren();
  	}
  	try {
  	  String txt=node.getText();
  	  if (txt != null) {
  		if ("\n".equals(txt)) txt="NL";
  		if ("\r".equals(txt)) txt="NL";
  		if (" ".equals(txt)) txt="WS";
  		result = result + " txt="+txt;	
  	  }
  	} catch (Exception e) {
  		result=result+" err text:"+e;
  	}
  	try {
  	  EObject ge = node.getGrammarElement();
  	  if (ge != null) result = result + " gram="+TestFileWriter.showGrammarElement(ge);
  	  result = result +" lin="+node.getStartLine()+" len="+node.getLength();
  	} catch (Exception e) {
  		result=result+" err-line:"+e;
  	}
  	result = result + " off="+node.getOffset()+":"+node.getEndOffset();
  	result = result + " tot-off="+node.getTotalOffset()+":"+node.getTotalEndOffset()+"]";
  	try {
	  if ((ch != null)&& recursive) for (INode item : ch) {
		String pad="";
		for (int x=1;x<indent+1;x++) pad=pad+"    ";
  	    result=result+"\n"+pad+showNodeModel(item,recursive,indent+1);
  	  }
  	} catch (Exception e) {
  		result=result+" err-line:"+e;
  	}
  	return result;
      }

    static public String showTokenStream(XtextTokenStream tokenStream){
    	@SuppressWarnings("unchecked")
		List<Token> toks=(List<Token>)tokenStream.getTokens();
    	String result="";
    	for (Token tok : toks) {
    		if (tok instanceof CommonToken) {
    			result=result+"\n"+"CommonToken:"+tok.getText();
    		} else if (tok instanceof ClassicToken) {
    			result=result+"\n"+"ClassicToken:"+tok.getText();
    		} else {
    			result=result+"\n"+"Unknown Token:"+tok.getText();    			
    		}
    		result=result+" lin="+tok.getLine()+" index="+tok.getTokenIndex()+" typ="+tok.getType();
    	}
    	return result;
    }

}
