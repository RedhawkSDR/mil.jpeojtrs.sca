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
package mil.jpeojtrs.sca.sad.tests;

import java.net.URISyntaxException;
import java.net.URL;

import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.util.SdrURIHandler;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sad</b></em>' package.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class SadTests {
	
	private static ResourceSet createResourceSet() throws URISyntaxException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URL url = FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.sad.tests"), new Path("sdr"), null);
		SdrURIHandler handler = new SdrURIHandler(URI.createURI(url.toURI().toString()));
		resourceSet.getURIConverter().getURIHandlers().add(0, handler);
		return resourceSet;
	}
	
	public static SoftwareAssembly getSoftwareAssembly()  throws Exception {
		URI uri = URI.createURI("sdrDom:///waveforms/GenericWaveform/GenericSadFile.sad.xml");
		ResourceSet resourceSet = createResourceSet();
		Resource resource = resourceSet.getResource(uri, true);
		return SoftwareAssembly.Util.getSoftwareAssembly(resource);
	}

} //SadTests
