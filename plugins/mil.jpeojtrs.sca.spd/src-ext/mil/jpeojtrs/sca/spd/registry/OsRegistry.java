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
 // BEGIN GENERATED CODE
package mil.jpeojtrs.sca.spd.registry;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * 
 */
public final class OsRegistry {
	private static final String EXT_ID = "mil.jpeojtrs.sca.spd.os";
	private static final String ATT_NAME = "name";

	private OsRegistry() {

	}

	public static List<String> getOsNames() {
		final IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(
				OsRegistry.EXT_ID);

		final List<String> retVal = new ArrayList<String>();

		for (final IConfigurationElement element : elements) {
			retVal.add(element.getAttribute(OsRegistry.ATT_NAME));
		}

		return retVal;
	}
}
