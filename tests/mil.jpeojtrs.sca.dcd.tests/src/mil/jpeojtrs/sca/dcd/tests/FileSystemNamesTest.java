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

import org.junit.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.dcd.FileSystemNames;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>File System Names</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class FileSystemNamesTest extends TestCase {

	/**
	 * The fixture for this File System Names test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSystemNames fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FileSystemNamesTest.class);
	}

	/**
	 * Constructs a new File System Names test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystemNamesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this File System Names test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FileSystemNames fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this File System Names test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSystemNames getFixture() {
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
		this.setFixture(conf.getFileSystemNames());
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
		Assert.assertEquals(1, this.getFixture().getFileSystemName().size());
		Assert.assertEquals("/mount", this.getFixture().getFileSystemName().get(0).getMountName());
		Assert.assertFalse("".equals(this.getFixture().toString()));
	}

} //FileSystemNamesTest
