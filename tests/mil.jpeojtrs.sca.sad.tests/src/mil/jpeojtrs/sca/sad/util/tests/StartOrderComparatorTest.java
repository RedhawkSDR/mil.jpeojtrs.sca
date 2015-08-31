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
package mil.jpeojtrs.sca.sad.util.tests;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.sad.util.StartOrderComparator;

/**
 * Tests {@link StartOrderComparator}.
 */
public class StartOrderComparatorTest {

	@Test
	public void testNullCompare() {
		StartOrderComparator comparator = new StartOrderComparator(null);
		SadComponentInstantiation compInst = SadFactory.eINSTANCE.createSadComponentInstantiation();
		Assert.assertEquals(0, comparator.compare(null, null));
		Assert.assertEquals(-1, comparator.compare(compInst, null));
		Assert.assertEquals(1, comparator.compare(null, compInst));
	}

	@Test
	public void testEquals() {
		StartOrderComparator comparator = new StartOrderComparator(null);
		SadComponentInstantiation compInst = SadFactory.eINSTANCE.createSadComponentInstantiation();
		Assert.assertEquals(0, comparator.compare(compInst, compInst));
	}

	@Test
	public void testAssemblyControllerCompare() {
		SadComponentInstantiation acCompInst = SadFactory.eINSTANCE.createSadComponentInstantiation();
		acCompInst.setId("ac");
		SadComponentInstantiation noStartCompInst = SadFactory.eINSTANCE.createSadComponentInstantiation();
		noStartCompInst.setId("nostart");
		SadComponentInstantiation startOrderCompInst = SadFactory.eINSTANCE.createSadComponentInstantiation();
		startOrderCompInst.setId("startorder");
		startOrderCompInst.setStartOrder(BigInteger.ONE);

		SoftwareAssembly sad = SadFactory.eINSTANCE.createSoftwareAssembly();
		sad.setPartitioning(SadFactory.eINSTANCE.createSadPartitioning());
		sad.getPartitioning().getComponentPlacement().add(SadFactory.eINSTANCE.createSadComponentPlacement());
		sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().add(startOrderCompInst);
		sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().add(noStartCompInst);
		sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().add(acCompInst);
		sad.setAssemblyController(SadFactory.eINSTANCE.createAssemblyController());
		sad.getAssemblyController().setComponentInstantiationRef(SadFactory.eINSTANCE.createSadComponentInstantiationRef());
		sad.getAssemblyController().getComponentInstantiationRef().setRefid("ac");

		StartOrderComparator comparator = new StartOrderComparator(acCompInst);
		Assert.assertEquals(-1, comparator.compare(acCompInst, noStartCompInst));
		Assert.assertEquals(1, comparator.compare(noStartCompInst, acCompInst));
		Assert.assertEquals(-1, comparator.compare(acCompInst, startOrderCompInst));
		Assert.assertEquals(1, comparator.compare(startOrderCompInst, acCompInst));
		Assert.assertEquals(1, comparator.compare(noStartCompInst, startOrderCompInst));
		Assert.assertEquals(-1, comparator.compare(startOrderCompInst, noStartCompInst));
	}
}
