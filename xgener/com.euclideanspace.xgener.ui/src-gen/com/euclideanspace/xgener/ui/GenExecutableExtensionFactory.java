/*
 * generated by Xtext
 */
package com.euclideanspace.xgener.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.euclideanspace.xgener.ui.internal.GenActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GenActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GenActivator.getInstance().getInjector(GenActivator.COM_EUCLIDEANSPACE_XGENER_GEN);
	}
	
}
