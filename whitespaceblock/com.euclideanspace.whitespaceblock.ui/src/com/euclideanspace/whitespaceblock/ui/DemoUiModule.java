/*
 * generated by Xtext
 */
package com.euclideanspace.whitespaceblock.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DemoUiModule extends com.euclideanspace.whitespaceblock.ui.AbstractDemoUiModule {
	public DemoUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.antlr.IContentAssistParser> bindIContentAssistParser() {
		return com.euclideanspace.whitespaceblock.ui.DemoUIParser.class;
	}

}
