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
import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.prf.StructSequenceRef;

public class AffinityTest {

	/**
	 * Test usage of the affinity element
	 * @throws URISyntaxException
	 */
	@Test
	public void testLoad() throws URISyntaxException {
		DeviceConfiguration dcd = DcdTests.loadDCDFromDevPath("/nodes/Affinity/DeviceManager.dcd.xml");
		List<DcdComponentPlacement> placements = dcd.getPartitioning().getComponentPlacement();

		DcdComponentInstantiation compInst = placements.get(0).getComponentInstantiation().get(0);
		Assert.assertNull(compInst.getAffinity());
		
		compInst = placements.get(1).getComponentInstantiation().get(0);
		ComponentProperties properties = compInst.getAffinity();
		Assert.assertNotNull(properties);

		SimpleRef simple = properties.getSimpleRef().get(0);
		Assert.assertEquals("simple_id", simple.getRefID());
		Assert.assertEquals("simple_value", simple.getValue());

		SimpleSequenceRef sequence = properties.getSimpleSequenceRef().get(0);
		Assert.assertEquals("simpleSequence_id", sequence.getRefID());
		Assert.assertEquals("simpleSequence_value", sequence.getValues().getValue().get(0));

		StructRef struct = properties.getStructRef().get(0);
		Assert.assertEquals("struct_id", struct.getRefID());
		Assert.assertEquals("struct_value", struct.getSimpleRef().get(0).getValue());

		StructSequenceRef structSequence = properties.getStructSequenceRef().get(0);
		Assert.assertEquals("structSequence_id", structSequence.getRefID());
		Assert.assertEquals("structSequence_value", structSequence.getStructValue().get(0).getSimpleRef().get(0).getValue());
	}

}
