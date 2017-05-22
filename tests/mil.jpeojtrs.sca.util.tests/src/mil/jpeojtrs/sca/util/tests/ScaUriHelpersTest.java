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
package mil.jpeojtrs.sca.util.tests;

import org.junit.Assert;

import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;
import mil.jpeojtrs.sca.util.ScaUriHelpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScaUriHelpersTest {
	private URI uri;
	private String localFileName;

	@Before
	public void setUp() throws Exception {
		this.uri = URI.createURI("platform:/resource/xcv/xcv.spd.xml");
		this.localFileName = "xcv.prf.xml";
	}

	@After
	public void tearDown() throws Exception {
		this.uri = null;
		this.localFileName = null;
	}

	@Test
	public void getLocalFileResource() throws IOException {
		// Create a ResourceSet, Resource, SPD; it's unimportant that the SPD doesn't exist
		ResourceSet resourceSet = ScaResourceFactoryUtil.createResourceSet();
		Path tempDir = Files.createTempDirectory(ScaUriHelpersTest.class.getSimpleName());
		Resource resource = resourceSet.createResource(URI.createFileURI(tempDir.resolve("NonExistentReference.spd.xml").toString()));
		SoftPkg spd = SpdFactory.eINSTANCE.createSoftPkg();
		resource.getContents().add(spd);

		// Resolve a non-existent path
		Resource localFileResource = ScaUriHelpers.getLocalFileResource("NonExistentSibling.prf.xml", spd, null);
		Assert.assertNull("A Resource should not be returned for non-existent file", localFileResource);

		// Re-resolve the same non-existent path; should *not* return an empty resource with errors
		localFileResource = ScaUriHelpers.getLocalFileResource("NonExistentSibling.prf.xml", spd, null);
		Assert.assertNull("An empty resource with errors should not be returned for a non-existent file", localFileResource);
	}

	@Test
	public void createFileSystemURI() throws Exception {
		URI localURI = ScaUriHelpers.createFileSystemURI(this.localFileName, this.uri, null);

		Assert.assertNotNull(localURI);
		Assert.assertEquals("platform:/resource/xcv/xcv.prf.xml", localURI.toString());

		// path is null
		localURI = ScaUriHelpers.createFileSystemURI(null, this.uri, null);
		Assert.assertNull(localURI);

		// target FS is null, no query params
		localURI = ScaUriHelpers.createFileSystemURI("/" + this.localFileName, URI.createURI("sca:///resource/xcv/xcv.spd.xml"), null);
		Assert.assertNull(localURI);

		// target FS is null, query is dom
		localURI = ScaUriHelpers.createFileSystemURI("/" + this.localFileName, URI.createURI("sca://xcv/xcv.spd.xml?fs=dom"), null);
		Assert.assertNotNull(localURI);
		// TODO Need to validate what this returns, pretty sure it's garbage right now

		// TODO Need to test createFileSystemURI with scheme and query params
	}

}
