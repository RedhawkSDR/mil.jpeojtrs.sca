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
package mil.jpeojtrs.sca.spd.registry.tests;

import java.util.List;

import mil.jpeojtrs.sca.spd.registry.ProcessorRegistry;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.junit.Assert;
import org.junit.Test;

public class ProcessorRegistryTest {

	private static final String EXT_ID = "mil.jpeojtrs.sca.spd.processor";
	private static final String ATT_NAME = "name";

	@Test
	public void testGetProcessorNames() {
		final List<String> processorList = ProcessorRegistry.getProcessorNames();
		final IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(ProcessorRegistryTest.EXT_ID);
		for (final IConfigurationElement element : elements) {
			final String name = element.getAttribute(ProcessorRegistryTest.ATT_NAME);
			Assert.assertEquals("Processor: " + name + " should be present in the registry", Boolean.TRUE, processorList.contains(name));
		}
	}
}
