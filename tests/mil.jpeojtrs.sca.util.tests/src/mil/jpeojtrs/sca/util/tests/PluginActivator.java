/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package mil.jpeojtrs.sca.util.tests;

import org.eclipse.core.runtime.Plugin;
import org.jacorb.JacorbActivator;
import org.osgi.framework.BundleContext;

/**
 * 
 */
public class PluginActivator extends Plugin {
	@Override
	public void start(BundleContext context) throws Exception {
		JacorbActivator.getDefault().init();
	}
}
