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

import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.partitioning.ComponentProperties;
import mil.jpeojtrs.sca.partitioning.tests.AbstractComponentPropertiesTest;

public class ComponentPropertiesTest extends AbstractComponentPropertiesTest {

	@Override
	protected ComponentProperties getEmptyComponentProperties() throws URISyntaxException {
		DeviceConfiguration dcd = DcdTests.loadDCDFromDevPath("/nodes/nodeEmptyComponentProperties/DeviceManager.dcd.xml");
		return dcd.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().get(0).getComponentProperties();
	}

	@Override
	protected ComponentProperties getBadRefComponentProperties() throws URISyntaxException {
		DeviceConfiguration dcd = DcdTests.loadDCDFromDevPath("/nodes/BadPropertyRefs/DeviceManager.dcd.xml");
		return dcd.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().get(0).getComponentProperties();
	}
}
