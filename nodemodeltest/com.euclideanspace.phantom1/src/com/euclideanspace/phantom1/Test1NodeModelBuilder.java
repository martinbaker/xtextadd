package com.euclideanspace.phantom1;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.nodemodel.impl.InvariantChecker;

/**
 * Allow possible customisations to the node model builder.
 * @Author Martin Baker
 */
public class Test1NodeModelBuilder extends NodeModelBuilder{

/*	@Override
	public void addChild(ICompositeNode node, AbstractNode child) {
		if (child == null) {
		  TestFileWriter.out("TestNodeModelBuilder.addChild:null");
		  return;
	    }
		super.addChild(node, child);
		try {			
			TestFileWriter.out("TestNodeModelBuilder.addChild"+
							" add:"+TestFileWriter.showNodeModel(child,false,0)+
							" to:"+TestFileWriter.showNodeModel(node,false,0)+
							"");
		} catch(Exception e) {
			TestFileWriter.out("TestNodeModelBuilder.addChild End error");
		}
	}*/

/*	@Override
	public ILeafNode newLeafNode(int offset, int length, EObject grammarElement, boolean isHidden, SyntaxErrorMessage errorMessage,
			ICompositeNode parent) {
		ILeafNode result = super.newLeafNode(offset, length, grammarElement, isHidden, errorMessage, parent);
		String txt="TestNodeModelBuilder.newLeafNode "+
				" offs="+offset+
				" len="+length+
				" grammarElement="+TestFileWriter.showGrammarElement(grammarElement)
				;
		if (isHidden) txt=txt+" isHidden=true";
		TestFileWriter.out(txt);
		return result;
	}*/
	
	/*@Override
	public ICompositeNode newCompositeNodeAsParentOf(EObject grammarElement, int lookahead, ICompositeNode existing) {
		ICompositeNode result = super.newCompositeNodeAsParentOf(grammarElement, lookahead, existing);
		String sgrammarElement =TestFileWriter.showGrammarElement(grammarElement);
		TestFileWriter.out("TestNodeModelBuilder.newCompositeNodeAsParentOf "+
		  TestFileWriter.showNodeModel(result,false,0)+
		  " lookahead="+lookahead+
		  " grammarElement="+sgrammarElement
		);
		return result;
	}

	@Override
	public ICompositeNode newCompositeNode(EObject grammarElement, int lookahead, ICompositeNode parent) {
		ICompositeNode result = super.newCompositeNode(grammarElement, lookahead, parent);
		String sgrammarElement =TestFileWriter.showGrammarElement(grammarElement);
		TestFileWriter.out("TestNodeModelBuilder.newCompositeNode "+
		  TestFileWriter.showNodeModel(result,false,0)+
		  " lookahead="+lookahead+
		  " grammarElement="+sgrammarElement
		);
		return result;
	}

	@Override
	public ICompositeNode newRootNode(String input) {
		ICompositeNode result = super.newRootNode(input);
		TestFileWriter.out("TestNodeModelBuilder.newRootNode "+
		  TestFileWriter.showNodeModel(result,false,0)+
		  " input="+input
		);
		return result;
	}*/

	@Override
	public ICompositeNode compressAndReturnParent(ICompositeNode compositeNode) {
/*		if (compositeNode==null){
		  TestFileWriter.out("TestNodeModelBuilder.compressAndReturnParent error");
		  return null;
		}
		String in=TestFileWriter.showNodeModel(compositeNode,false,0);
		ICompositeNode par=compositeNode.getParent();
		if (par != null) {
		  in=in+"\n      par="+TestFileWriter.showNodeModel(par,false,0);
		}*/
		ICompositeNode result = super.compressAndReturnParent(compositeNode);
		if (result instanceof org.eclipse.xtext.nodemodel.impl.RootNode){
		  InvariantChecker checker = new InvariantChecker();
		  try{
		    checker.checkInvariant(result);
		    TestFileWriter.out("InvariantChecker no error");
		  } catch(Exception e) {
			TestFileWriter.out("InvariantChecker error="+e);
		  }
		  TestFileWriter.out("TestNodeModelBuilder.compressAndReturnParent\n"+
		    TestFileWriter.showNodeModel(result,true,0));
		}
		return result;
	}


}
