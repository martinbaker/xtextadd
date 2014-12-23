
package com.euclideanspace.pbase;


import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.parser.impl.PartialParsingHelper;
import org.eclipse.xtext.util.ReplaceRegion;

public class TutorialPartialParsingHelper extends PartialParsingHelper {
	
/**
 * @author Martin Baker - fix for reconciler error.
 * This is being called with the parameter 'rootNode' not set to root node
 * I have therefore added getRootNode() call.
 * 
 * More information about this bug here:
 * https://github.com/martinbaker/xtextadd/blob/master/pbase/notes/troubleshooting.md
 * I have reported it to Xtext here:
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=455908
 */
@Override
public String insertChangeIntoReplaceRegion(ICompositeNode rootNode, ReplaceRegion region) {
  ICompositeNode reallyrootNode = rootNode.getRootNode();
  final StringBuilder builder = new StringBuilder(reallyrootNode.getText());
  region.shiftBy(0-reallyrootNode.getTotalOffset()).applyTo(builder);
  return builder.toString();
}

}