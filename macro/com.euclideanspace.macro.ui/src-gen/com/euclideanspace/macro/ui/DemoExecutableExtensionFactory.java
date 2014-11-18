/*
 * generated by Xtext
 */
package com.euclideanspace.macro.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.euclideanspace.macro.ui.internal.DemoActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DemoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DemoActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DemoActivator.getInstance().getInjector(DemoActivator.COM_EUCLIDEANSPACE_MACRO_DEMO);
	}
	
}
