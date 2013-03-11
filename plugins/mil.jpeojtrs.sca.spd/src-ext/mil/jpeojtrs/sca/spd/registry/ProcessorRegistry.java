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
package mil.jpeojtrs.sca.spd.registry;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * 
 */
public final class ProcessorRegistry {
	private static final String EXT_ID = "mil.jpeojtrs.sca.spd.processors";
	private static final String ATT_NAME = "name";

	private ProcessorRegistry() {

	}

	public static List<String> getProcessorNames() {
		final IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(ProcessorRegistry.EXT_ID);

		final List<String> retVal = new ArrayList<String>();

		for (final IConfigurationElement element : elements) {
			retVal.add(element.getAttribute(ProcessorRegistry.ATT_NAME));
		}

		return retVal;
	}
}
