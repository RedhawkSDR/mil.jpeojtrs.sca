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
package mil.jpeojtrs.sca.dcd.tests;

import java.net.URISyntaxException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdComponentPlacement;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;

public class LoggingConfigTest {
	
	/**
	 * Test several different usages of the loggingconfig element
	 * @throws URISyntaxException
	 */
	@Test
	public void testLoad() throws URISyntaxException {
		DeviceConfiguration dcd = DcdTests.loadDCDFromDevPath("/nodes/LoggingConfig/DeviceManager.dcd.xml");
		List<DcdComponentPlacement> placements = dcd.getPartitioning().getComponentPlacement();

		DcdComponentInstantiation compInst = placements.get(0).getComponentInstantiation().get(0);
		Assert.assertNotNull(compInst.getLoggingConfig());
		Assert.assertEquals(null, compInst.getLoggingConfig().getLevel());
		Assert.assertEquals("", compInst.getLoggingConfig().getUri());

		compInst = placements.get(1).getComponentInstantiation().get(0);
		Assert.assertNotNull(compInst.getLoggingConfig());
		Assert.assertEquals("level_value", compInst.getLoggingConfig().getLevel());
		Assert.assertEquals("", compInst.getLoggingConfig().getUri());

		compInst = placements.get(2).getComponentInstantiation().get(0);
		Assert.assertNotNull(compInst.getLoggingConfig());
		Assert.assertEquals("", compInst.getLoggingConfig().getLevel());
		Assert.assertEquals("uri_value", compInst.getLoggingConfig().getUri());

		compInst = placements.get(3).getComponentInstantiation().get(0);
		Assert.assertNotNull(compInst.getLoggingConfig());
		Assert.assertEquals("level_value", compInst.getLoggingConfig().getLevel());
		Assert.assertEquals("uri_value", compInst.getLoggingConfig().getUri());
	}

}
