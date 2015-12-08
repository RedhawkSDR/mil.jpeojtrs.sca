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
package mil.jpeojtrs.sca.dcd.provider.tests;

import org.junit.Assert;
import org.junit.Test;

import mil.jpeojtrs.sca.dcd.DcdFactory;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.dcd.provider.DeviceConfigurationItemProvider;
import mil.jpeojtrs.sca.util.DceUuidUtil;

public class DeviceConfigurationItemProviderTest {

	private DeviceConfigurationItemProvider itemProvider = new DeviceConfigurationItemProvider(null);

	@Test
	public void getText_null() {
		DeviceConfiguration dcd = DcdFactory.eINSTANCE.createDeviceConfiguration();
		final String id = DceUuidUtil.createDceUUID();
		dcd.setId(id);
		Assert.assertEquals(id, itemProvider.getText(dcd));
	}

	@Test
	public void getText_flat() {
		DeviceConfiguration dcd = DcdFactory.eINSTANCE.createDeviceConfiguration();
		dcd.setId(DceUuidUtil.createDceUUID());
		final String name = "getText_flat";
		dcd.setName(name);
		Assert.assertEquals(name, itemProvider.getText(dcd));
	}

	@Test
	public void getText_namespaced() {
		DeviceConfiguration dcd = DcdFactory.eINSTANCE.createDeviceConfiguration();
		dcd.setId(DceUuidUtil.createDceUUID());
		dcd.setName("getText_name.spaced");
		Assert.assertEquals("spaced", itemProvider.getText(dcd));
	}
}
