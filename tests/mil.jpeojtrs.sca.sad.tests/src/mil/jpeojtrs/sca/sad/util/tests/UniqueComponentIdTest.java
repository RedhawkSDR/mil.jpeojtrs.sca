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

import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

import org.junit.Assert;
import org.junit.Test;


public class UniqueComponentIdTest {
	@Test
	public void testUniqueCompId() {
		SoftwareAssembly sad = SadFactory.eINSTANCE.createSoftwareAssembly();
		sad.setPartitioning(SadFactory.eINSTANCE.createSadPartitioning());
		sad.getPartitioning().getComponentPlacement().add(SadFactory.eINSTANCE.createSadComponentPlacement());

		// 3 components with the assumption that they are all of the same type
		final String COMPONENT_NAME = "test_comp";
		SadComponentInstantiation comp1 = SadFactory.eINSTANCE.createSadComponentInstantiation();
		SadComponentInstantiation comp2 = SadFactory.eINSTANCE.createSadComponentInstantiation();
		SadComponentInstantiation comp3 = SadFactory.eINSTANCE.createSadComponentInstantiation();
		

		// Default usage name check
		String compId = SoftwareAssembly.Util.createComponentIdentifier(sad, COMPONENT_NAME);
		comp1.setId(compId);
		
		String compUsageName = SoftwareAssembly.Util.createComponentUsageName(sad, comp1.getId());
		comp1.setUsageName(compUsageName);
		
		Assert.assertEquals(compId, "test_comp_1");
		Assert.assertEquals(compUsageName, "test_comp_1");
		
		sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().add(comp1);
		
		//Add a second component, confirm the id increments and set a custom usage name.
		compId = SoftwareAssembly.Util.createComponentIdentifier(sad, COMPONENT_NAME);
		comp2.setId(compId);
		
		compUsageName = SoftwareAssembly.Util.createComponentUsageName(sad, comp2.getId());
		comp2.setUsageName("custom_usage_name");
		
		Assert.assertEquals(compId, "test_comp_2");
		Assert.assertEquals(compUsageName, "test_comp_2");
		
		sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().add(comp2);

		// Add third component to make sure the custom usage name did not mess up future additions
		compId = SoftwareAssembly.Util.createComponentIdentifier(sad, COMPONENT_NAME);
		comp3.setId(compId);
		
		compUsageName = SoftwareAssembly.Util.createComponentUsageName(sad, comp3.getId());
		comp3.setUsageName(compUsageName);
		
		Assert.assertEquals(compId, "test_comp_3");
		Assert.assertEquals(compUsageName, "test_comp_3");
		
		sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().add(comp3);
	}
}
