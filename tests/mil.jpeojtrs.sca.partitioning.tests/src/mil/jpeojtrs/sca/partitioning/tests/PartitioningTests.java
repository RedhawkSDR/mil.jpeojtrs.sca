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
package mil.jpeojtrs.sca.partitioning.tests;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.util.ScaFileSystemConstants;
import mil.jpeojtrs.sca.util.SdrURIHandler;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>partitioning</b></em>' package.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class PartitioningTests {

	public static URI getURI(final String filePath) throws IOException {
		final URL bundleUrl = FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.partitioning.tests"), new Path(filePath), null);
		if (bundleUrl == null) {
			throw new IOException("Unknown Bundle File: " + filePath);
		}
		final URL url = FileLocator.toFileURL(bundleUrl);
		try {
			return URI.createURI(url.toURI().toString());
		} catch (final URISyntaxException e) {
			IOException ex = new IOException("Invalid URI:" + url);
			ex.initCause(e);
			throw ex;
		}
	}
	
	/**
	 * Loads a SAD file from the specified dom file system path.
	 * @param domPath
	 * @return
	 * @throws URISyntaxException
	 */
	public static SoftwareAssembly loadSADFromDomPath(String domPath) throws URISyntaxException {
		URI uri = URI.createURI(ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM + "://" + domPath);
		ResourceSet resourceSet = createResourceSet();
		Resource resource = resourceSet.getResource(uri, true);
		return SoftwareAssembly.Util.getSoftwareAssembly(resource);
	}
	
	private static ResourceSet createResourceSet() throws URISyntaxException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URL url = FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.partitioning.tests"), new Path("sdr"), null);
		SdrURIHandler handler = new SdrURIHandler(URI.createURI(url.toURI().toString()));
		resourceSet.getURIConverter().getURIHandlers().add(0, handler);
		return resourceSet;
	}

} //PartitioningTests
