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
package mil.jpeojtrs.sca.dcd.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Device Configuration</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class DeviceConfigurationTest extends TestCase {

	/**
	 * The fixture for this Device Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceConfigurationTest.class);
	}

	/**
	 * Constructs a new Device Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Device Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeviceConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Device Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceConfiguration getFixture() {
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
		setFixture(DcdTests.getDeviceConfiguration());
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
		Assert.assertNotNull(this.fixture.getId());
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertNotNull(this.fixture.getDescription());
		Assert.assertNotNull(this.fixture.getDeviceManagerSoftPkg());
		Assert.assertNotNull(this.fixture.getComponentFiles());

		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90ddd6", this.fixture.getId());
		Assert.assertEquals("DefaultNode", this.fixture.getName());
		Assert.assertEquals("Test Node Description", this.fixture.getDescription());

		Assert.assertTrue(this.fixture.getComponentFiles().getComponentFile().size() > 0);
		Assert.assertEquals("/mgr/DeviceManager.spd.xml", this.fixture.getDeviceManagerSoftPkg().getLocalFile().getName());

		Assert.assertFalse("".equals(this.getFixture().toString()));
	}

	public void testSet() throws Exception {
		getFixture().setComponentFiles(null);		
		Assert.assertNull(this.fixture.getComponentFiles());

		getFixture().setConnections(null);
		Assert.assertNull(this.fixture.getConnections());
		
		getFixture().setDescription(null);
		Assert.assertNull(this.fixture.getDescription());
		
		getFixture().setFileSystemNames(null);
		Assert.assertNull(this.fixture.getFileSystemNames());
		
		getFixture().setPartitioning(null);
		Assert.assertNull(this.fixture.getPartitioning());
		
		getFixture().setDomainManager(null);
		Assert.assertNull(this.fixture.getDomainManager());
		
		getFixture().setDeviceManagerSoftPkg(null);
		Assert.assertNull(this.fixture.getDeviceManagerSoftPkg());
	}

} //DeviceConfigurationTest
