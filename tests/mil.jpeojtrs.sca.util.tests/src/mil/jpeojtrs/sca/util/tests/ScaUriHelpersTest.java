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
import mil.jpeojtrs.sca.util.ScaUriHelpers;

import org.eclipse.emf.common.util.URI;
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
	public void test_createFileSystemURI() throws Exception {
		URI localURI = ScaUriHelpers.createFileSystemURI(this.localFileName, this.uri, null);

		Assert.assertNotNull(localURI);
		Assert.assertEquals("platform:/resource/xcv/xcv.prf.xml", localURI.toString());

		// path is null
		localURI = ScaUriHelpers.createFileSystemURI(null, this.uri, null);
		Assert.assertNull(localURI);

		// referenceURI is null
		localURI = ScaUriHelpers.createFileSystemURI(this.localFileName, null, null);
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
