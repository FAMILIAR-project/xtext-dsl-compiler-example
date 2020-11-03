/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl1.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.mydsl1.ui.internal.Mydsl1Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Mydsl1Activator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		Mydsl1Activator activator = Mydsl1Activator.getInstance();
		return activator != null ? activator.getInjector(Mydsl1Activator.ORG_XTEXT_EXAMPLE_MYDSL1_MYDSL) : null;
	}

}