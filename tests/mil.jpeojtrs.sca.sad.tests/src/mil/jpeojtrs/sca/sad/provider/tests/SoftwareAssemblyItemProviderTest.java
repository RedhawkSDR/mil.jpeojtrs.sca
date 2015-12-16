/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package mil.jpeojtrs.sca.sad.provider.tests;

import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.sad.provider.SoftwareAssemblyItemProvider;
import mil.jpeojtrs.sca.util.DceUuidUtil;

public class SoftwareAssemblyItemProviderTest {

	private SoftwareAssemblyItemProvider itemProvider = new SoftwareAssemblyItemProvider(null);

	/**
	 * IDE-1482
	 */
	@Test
	public void getText_null() {
		SoftwareAssembly sad = SadFactory.eINSTANCE.createSoftwareAssembly();
		final String id = DceUuidUtil.createDceUUID();
		sad.setId(id);
		Assert.assertEquals(id, itemProvider.getText(sad));
	}

	@Test
	public void getText_flat() {
		SoftwareAssembly sad = SadFactory.eINSTANCE.createSoftwareAssembly();
		sad.setId(DceUuidUtil.createDceUUID());
		final String name = "getText_flat";
		sad.setName(name);
		Assert.assertEquals(name, itemProvider.getText(sad));
	}

	@Test
	public void getText_namespaced() {
		SoftwareAssembly sad = SadFactory.eINSTANCE.createSoftwareAssembly();
		sad.setId(DceUuidUtil.createDceUUID());
		sad.setName("getText_name.spaced");
		Assert.assertEquals("spaced", itemProvider.getText(sad));
	}
}
