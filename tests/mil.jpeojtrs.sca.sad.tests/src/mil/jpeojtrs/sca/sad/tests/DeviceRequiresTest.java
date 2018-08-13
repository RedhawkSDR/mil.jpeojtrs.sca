/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
package mil.jpeojtrs.sca.sad.tests;

import java.net.URISyntaxException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.partitioning.Requirements;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

public class DeviceRequiresTest {

	@Test
	public void load() throws URISyntaxException {
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/DeviceRequires/DeviceRequires.sad.xml");
		List<SadComponentPlacement> placements = sad.getPartitioning().getComponentPlacement();
		SadComponentInstantiation compInst = placements.get(0).getComponentInstantiation().get(0);

		Requirements requirements = compInst.getDeviceRequires();
		Assert.assertNotNull(requirements);
		Assert.assertEquals(2, requirements.getRequires().size());
		Assert.assertEquals("abc", requirements.getRequires().get(0).getId());
		Assert.assertEquals("def", requirements.getRequires().get(0).getValue());
		Assert.assertEquals("ghi", requirements.getRequires().get(1).getId());
		Assert.assertEquals("jkl", requirements.getRequires().get(1).getValue());
	}
}
