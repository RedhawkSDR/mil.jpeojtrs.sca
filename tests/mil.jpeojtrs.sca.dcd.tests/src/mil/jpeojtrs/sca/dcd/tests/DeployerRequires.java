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
package mil.jpeojtrs.sca.dcd.tests;

import java.net.URISyntaxException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdComponentPlacement;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.partitioning.Requirements;

public class DeployerRequires {

	@Test
	public void load() throws URISyntaxException {
		DeviceConfiguration dcd = DcdTests.loadDCDFromDevPath("/nodes/DeployerRequires/DeviceManager.dcd.xml");
		List<DcdComponentPlacement> placements = dcd.getPartitioning().getComponentPlacement();
		DcdComponentInstantiation compInst = placements.get(0).getComponentInstantiation().get(0);

		Requirements requirements = compInst.getDeployerRequires();
		Assert.assertNotNull(requirements);
		Assert.assertEquals(2, requirements.getRequires().size());
		Assert.assertEquals("abc", requirements.getRequires().get(0).getId());
		Assert.assertEquals("def", requirements.getRequires().get(0).getValue());
		Assert.assertEquals("ghi", requirements.getRequires().get(1).getId());
		Assert.assertEquals("jkl", requirements.getRequires().get(1).getValue());
	}
}
