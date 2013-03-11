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

import java.util.UUID;

import junit.framework.Assert;
import mil.jpeojtrs.sca.util.DceUuidUtil;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DceUuidUtilTest {

	private String uuidString;
	private UUID uuid;

	@Before
	public void setUp() throws Exception {
		this.uuidString = DceUuidUtil.createDceUUID();
		this.uuid = new UUID(1, 2);
	}

	@After
	public void tearDown() throws Exception {
		this.uuidString = null;
	}

	@Test
	public void test_createDceUUID() throws Exception {
		Assert.assertNotNull(this.uuidString);
	}

	@Test
	public void test_createDceUUIDWithUUID() throws Exception {
		this.uuidString = DceUuidUtil.createDceUUID(this.uuid);

		Assert.assertNotNull(this.uuidString);
		Assert.assertTrue(DceUuidUtil.isValid(this.uuidString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_createDceUUIDWithUUIDWithBadValues() throws Exception {
		this.uuid = null;
		this.uuidString = DceUuidUtil.createDceUUID(this.uuid);
	}

	@Test
	public void test_createDceUUIDWithUUIDandInteger() throws Exception {
		this.uuidString = DceUuidUtil.createDceUUID(this.uuid, 123); // DEBUG CODE

		Assert.assertNotNull(this.uuidString);
		Assert.assertTrue(DceUuidUtil.isValid(this.uuidString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_createDceUUIDWithUUIDandIntegerBAD() throws Exception {
		this.uuid = null;
		this.uuidString = DceUuidUtil.createDceUUID(this.uuid, 123); // DEBUG CODE
	}

	@Test
	public void test_setVersion() throws Exception {
		this.uuidString = DceUuidUtil.setVersion(this.uuidString, 123); // DEBUG CODE

		Assert.assertNotNull(this.uuidString);
		Assert.assertTrue(DceUuidUtil.isValid(this.uuidString));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_setVersionBAD() throws Exception {
		DceUuidUtil.setVersion("invalid UUID string", 123); // DEBUG CODE
	}

	@Test
	public void test_getVersion() throws Exception {
		this.uuidString = DceUuidUtil.setVersion(this.uuidString, 123); // DEBUG CODE

		Assert.assertNotNull(this.uuidString);
		Assert.assertTrue(DceUuidUtil.isValid(this.uuidString));

		final Integer version = DceUuidUtil.getVersion(this.uuidString);

		Assert.assertEquals(123, version.intValue()); // DEBUG CODE
		Assert.assertNull(DceUuidUtil.getVersion(DceUuidUtil.createDceUUID()));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_getVersionBAD() throws Exception {
		this.uuidString = "DCE:asdf";
		DceUuidUtil.getVersion(this.uuidString);
	}

	@Test
	public void test_isValid() throws Exception {
		Assert.assertTrue(DceUuidUtil.isValid(this.uuidString));
	}

	@Test
	public void test_isValidBad() throws Exception {
		Assert.assertFalse(DceUuidUtil.isValid("DCE:12123123"));
		Assert.assertFalse(DceUuidUtil.isValid(null));
		Assert.assertFalse(DceUuidUtil.isValid("DCE:12:1:2:3:1:2:3"));

	}
}
