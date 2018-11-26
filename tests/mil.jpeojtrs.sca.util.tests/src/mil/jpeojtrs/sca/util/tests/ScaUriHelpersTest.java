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
import mil.jpeojtrs.sca.util.QueryParser;
import mil.jpeojtrs.sca.util.ScaFileSystemConstants;
import mil.jpeojtrs.sca.util.ScaResourceFactoryUtil;
import mil.jpeojtrs.sca.util.ScaUriHelpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

public class ScaUriHelpersTest {

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

	@Test(expected = WrappedException.class)
	public void loadResource_badXml1() {
		ResourceSet set = new ResourceSetImpl();
		try {
			ScaUriHelpers.loadResource(set, URI.createURI("platform:/plugin/mil.jpeojtrs.sca.util.tests/testFiles/badspd1.spd.xml"));
		} finally {
			// No resources should have been added to the set
			Assert.assertTrue(set.getResources().isEmpty());
		}
	}

	@Test(expected = WrappedException.class)
	public void loadResource_badXml2() {
		ResourceSet set = new ResourceSetImpl();
		try {
			ScaUriHelpers.loadResource(set, URI.createURI("platform:/plugin/mil.jpeojtrs.sca.util.tests/testFiles/badspd2.spd.xml"));
		} finally {
			// No resources should have been added to the set
			Assert.assertTrue(set.getResources().isEmpty());
		}
	}

	@Test
	public void loadResource_goodXml() {
		URI uri = URI.createURI("platform:/plugin/mil.jpeojtrs.sca.util.tests/testFiles/goodspd.spd.xml");
		ResourceSet set = new ResourceSetImpl();
		Resource resource = ScaUriHelpers.loadResource(set, uri);

		// We should have the resource and it should be in the resource set
		Assert.assertNotNull(resource);
		Assert.assertEquals(1, set.getResources().size());
		Assert.assertEquals(resource, set.getResources().get(0));

		// We should be able to find the resource in the set via its URI
		Assert.assertEquals(resource, set.getResource(uri, false));
	}

	@Test
	public void createFileSystemURI() throws Exception {
		final URI uri = URI.createURI("platform:/resource/xcv/xcv.spd.xml");
		final String localFileName = "xcv.prf.xml";

		URI localURI = ScaUriHelpers.createFileSystemURI(localFileName, uri, null);
		Assert.assertNotNull(localURI);
		Assert.assertEquals("platform:/resource/xcv/xcv.prf.xml", localURI.toString());

		// path is null
		localURI = ScaUriHelpers.createFileSystemURI(null, uri, null);
		Assert.assertNull(localURI);

		// target FS is null, no query params
		localURI = ScaUriHelpers.createFileSystemURI("/" + localFileName, URI.createURI("sca:///resource/xcv/xcv.spd.xml"), null);
		Assert.assertNull(localURI);

		// target FS is null, query is dom
		localURI = ScaUriHelpers.createFileSystemURI("/" + localFileName, URI.createURI("sca://xcv/xcv.spd.xml?fs=dom"), null);
		Assert.assertNotNull(localURI);
		// TODO Need to validate what this returns, pretty sure it's garbage right now
	}

	/**
	 * Tests {@link ScaUriHelpers#createFileSystemURI(String, URI, String)} using SCA reference URIs in a dom file
	 * system.
	 * @throws Exception
	 */
	@Test
	public void createFileSystemURI_scaDom() throws Exception {
		Map<String, String> query = new HashMap<>();
		query.put(ScaFileSystemConstants.QUERY_PARAM_FS, "file:///a/b/c");
		String queryStr = QueryParser.createQuery(query);
		URI referenceURI = URI.createHierarchicalURI(ScaFileSystemConstants.SCHEME, null, null, new String[] { "ref", "uri" }, queryStr, null);

		// dom reference URI, ask for dom file system
		URI newURI = ScaUriHelpers.createFileSystemURI("/g/h/i", referenceURI, ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM);
		Assert.assertEquals(ScaFileSystemConstants.SCHEME, newURI.scheme());
		Assert.assertEquals("/g/h/i", newURI.path());
		query = QueryParser.parseQuery(newURI.query());
		Assert.assertEquals("file:///a/b/c", query.get(ScaFileSystemConstants.QUERY_PARAM_FS));

		// We'd like to move away from this code, but we support it for now
		// dom reference URI, ask for null (assumes dom file system)
		newURI = ScaUriHelpers.createFileSystemURI("/g/h/i", referenceURI, null);
		Assert.assertEquals(ScaFileSystemConstants.SCHEME, newURI.scheme());
		Assert.assertEquals("/g/h/i", newURI.path());
		query = QueryParser.parseQuery(newURI.query());
		Assert.assertEquals("file:///a/b/c", query.get(ScaFileSystemConstants.QUERY_PARAM_FS));
	}

	/**
	 * Tests {@link ScaUriHelpers#createFileSystemURI(String, URI, String)} using SCA reference URIs in a dev file
	 * system.
	 * @throws Exception
	 */
	@Test
	public void createFileSystemURI_scaDev() throws Exception {
		Map<String, String> query = new HashMap<>();
		query.put(ScaFileSystemConstants.QUERY_PARAM_FS, "file:///a/b/c");
		query.put(ScaFileSystemConstants.QUERY_PARAM_DOM_FS, "file:///d/e/f");
		String queryStr = QueryParser.createQuery(query);
		URI referenceURI = URI.createHierarchicalURI(ScaFileSystemConstants.SCHEME, null, null, new String[] { "ref", "uri" }, queryStr, null);

		// dev reference URI, ask for dev file system
		URI newURI = ScaUriHelpers.createFileSystemURI("/g/h/i", referenceURI, ScaFileSystemConstants.SCHEME_TARGET_SDR_DEV);
		Assert.assertEquals(ScaFileSystemConstants.SCHEME, newURI.scheme());
		Assert.assertEquals("/g/h/i", newURI.path());
		query = QueryParser.parseQuery(newURI.query());
		Assert.assertEquals("file:///a/b/c", query.get(ScaFileSystemConstants.QUERY_PARAM_FS));
		Assert.assertEquals("file:///d/e/f", query.get(ScaFileSystemConstants.QUERY_PARAM_DOM_FS));

		// We'd like to move away from this code, but we support it for now
		// dev reference URI, ask for null (assumes dev file system)
		newURI = ScaUriHelpers.createFileSystemURI("/g/h/i", referenceURI, null);
		Assert.assertEquals(ScaFileSystemConstants.SCHEME, newURI.scheme());
		Assert.assertEquals("/g/h/i", newURI.path());
		query = QueryParser.parseQuery(newURI.query());
		Assert.assertEquals("file:///a/b/c", query.get(ScaFileSystemConstants.QUERY_PARAM_FS));
		Assert.assertEquals("file:///d/e/f", query.get(ScaFileSystemConstants.QUERY_PARAM_DOM_FS));

		// dev reference URI, request dom file system
		newURI = ScaUriHelpers.createFileSystemURI("/g/h/i", referenceURI, ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM);
		Assert.assertEquals(ScaFileSystemConstants.SCHEME, newURI.scheme());
		Assert.assertEquals("/g/h/i", newURI.path());
		query = QueryParser.parseQuery(newURI.query());
		Assert.assertEquals("file:///d/e/f", query.get(ScaFileSystemConstants.QUERY_PARAM_FS));
		Assert.assertFalse(query.containsKey(ScaFileSystemConstants.QUERY_PARAM_DOM_FS));
	}

}
