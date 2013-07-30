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

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.dcd.FileSystemName;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>File System Name</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class FileSystemNameTest extends TestCase {

	/**
	 * The fixture for this File System Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSystemName fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FileSystemNameTest.class);
	}

	/**
	 * Constructs a new File System Name test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystemNameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this File System Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FileSystemName fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this File System Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSystemName getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		final DeviceConfiguration conf = DcdTests.getDeviceConfiguration();
		this.setFixture(conf.getFileSystemNames().getFileSystemName().get(0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testParse() throws Exception {
		Assert.assertNotNull(this.getFixture());
		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90ffff", this.getFixture().getDeviceID());
		Assert.assertEquals("/mount", this.getFixture().getMountName());
		Assert.assertFalse("".equals(this.getFixture().toString()));
	}

} //FileSystemNameTest
