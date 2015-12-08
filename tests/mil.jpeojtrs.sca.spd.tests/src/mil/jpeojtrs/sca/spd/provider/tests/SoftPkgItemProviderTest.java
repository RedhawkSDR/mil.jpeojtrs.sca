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
package mil.jpeojtrs.sca.spd.provider.tests;

import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.spd.provider.SoftPkgItemProvider;
import mil.jpeojtrs.sca.util.DceUuidUtil;

public class SoftPkgItemProviderTest {

	private SoftPkgItemProvider itemProvider = new SoftPkgItemProvider(null);

	@Test
	public void getText_null() {
		SoftPkg spd = SpdFactory.eINSTANCE.createSoftPkg();
		final String id = DceUuidUtil.createDceUUID();
		spd.setId(id);
		Assert.assertEquals(id, itemProvider.getText(spd));
	}

	@Test
	public void getText_flat() {
		SoftPkg spd = SpdFactory.eINSTANCE.createSoftPkg();
		spd.setId(DceUuidUtil.createDceUUID());
		final String name = "getText_flat";
		spd.setName(name);
		Assert.assertEquals(name, itemProvider.getText(spd));
	}

	@Test
	public void getText_namespaced() {
		SoftPkg spd = SpdFactory.eINSTANCE.createSoftPkg();
		spd.setId(DceUuidUtil.createDceUUID());
		spd.setName("getText_name.spaced");
		Assert.assertEquals("spaced", itemProvider.getText(spd));
	}
}
