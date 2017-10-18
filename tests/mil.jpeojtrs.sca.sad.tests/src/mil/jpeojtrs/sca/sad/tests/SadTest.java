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
package mil.jpeojtrs.sca.sad.tests;

import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.prf.StructRef;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

public class SadTest {

	/**
	 * IDE-1806
	 * Test that loading a sad.xml that references a non-existent simpleref property is handled gracefully
	 * @throws URISyntaxException
	 */
	@Test
	public void nonExistentPropertyTest() throws URISyntaxException {
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/NonExistentPropertyWaveform/NonExistentPropertyWaveform.sad.xml");
		SadComponentPlacement placement = sad.getPartitioning().getComponentPlacement().get(0);
		SadComponentInstantiation compInst = placement.getComponentInstantiation().get(0);

		StructRef struct = compInst.getComponentProperties().getStructRef().get(0);
		Assert.assertEquals("DCE:9c3b2f8f-c0fa-4200-a8f9-e03418e46033", struct.getRefID());

		SimpleRef invalidSimple = struct.getSimpleRef().get(0);
		Assert.assertEquals("idonotexist", invalidSimple.getRefID());
		Assert.assertNotNull(invalidSimple.toAny());

		// This previously threw an NPE when the simple.toAny() returned null
		Assert.assertNotNull(struct.toAny());
	}
}
