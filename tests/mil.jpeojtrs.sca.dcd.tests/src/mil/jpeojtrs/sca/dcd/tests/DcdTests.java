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
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.dcd.tests;

import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.util.ScaFileSystemConstants;
import mil.jpeojtrs.sca.util.SdrURIHandler;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dcd</b></em>' package.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class DcdTests {

	private static ResourceSet createResourceSet() throws URISyntaxException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URL url = FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.dcd.tests"), new Path("sdr"), null);
		SdrURIHandler handler = new SdrURIHandler(URI.createURI(url.toURI().toString()));
		resourceSet.getURIConverter().getURIHandlers().add(0, handler);
		return resourceSet;
	}

	/**
	 * Loads a DCD file from the specified dev file system path.
	 * @param devPath
	 * @return
	 * @throws URISyntaxException
	 */
	public static DeviceConfiguration loadDCDFromDevPath(String devPath) throws URISyntaxException {
		URI uri = URI.createURI(ScaFileSystemConstants.SCHEME_TARGET_SDR_DEV + "://" + devPath);
		ResourceSet resourceSet = createResourceSet();
		Resource resource = resourceSet.getResource(uri, true);
		return DeviceConfiguration.Util.getDeviceConfiguration(resource);
	}

	/**
	 * Gets the default DCD used by most tests.
	 * @return
	 * @throws Exception
	 */
	public static DeviceConfiguration getDeviceConfiguration() throws Exception {
		return loadDCDFromDevPath("/nodes/defaultNode/defaultNode.dcd.xml");
	}

} // DcdTests
