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
import mil.jpeojtrs.sca.dcd.DomainManager;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Domain Manager</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class DomainManagerTest extends TestCase {

	/**
	 * The fixture for this Domain Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManager fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainManagerTest.class);
	}

	/**
	 * Constructs a new Domain Manager test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainManagerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Domain Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DomainManager fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Domain Manager test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManager getFixture() {
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
		this.setFixture(conf.getDomainManager());
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
		Assert.assertNotNull(this.getFixture().getNamingService());
		Assert.assertEquals("test/test", this.getFixture().getNamingService().getName());
		Assert.assertFalse("".equals(this.getFixture().toString()));
	}

	public void testGetIOR() throws Exception {
		Assert.assertNotNull(this.getFixture());
		// No reference in the xml file
		Assert.assertNull(this.getFixture().getStringifiedObjectRef());
	}

	public void testSetIOR() throws Exception {
		getFixture().setStringifiedObjectRef("BobsIOR");

		Assert.assertEquals("BobsIOR", this.getFixture().getStringifiedObjectRef());
	}

	public void testOther() throws Exception {
		getFixture().setNamingService(null);

		Assert.assertNull(this.getFixture().getNamingService());
	}

} //DomainManagerTest
