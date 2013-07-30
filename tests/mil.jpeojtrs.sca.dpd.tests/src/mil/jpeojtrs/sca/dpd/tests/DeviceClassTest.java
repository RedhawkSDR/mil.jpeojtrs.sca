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
 // BEGIN GENERATED CODE
package mil.jpeojtrs.sca.dpd.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dpd.DeviceClass;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.dpd.DpdFactory;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceClassTest extends TestCase {

	/**
	 * The fixture for this Device Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceClass fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceClassTest.class);
	}

	/**
	 * Constructs a new Device Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceClassTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Device Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeviceClass fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Device Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceClass getFixture() {
		return fixture;
	}

	private HwDeviceRegistration hdReg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DpdFactory.eINSTANCE.createDeviceClass());
		final ResourceSet resourceSet = new ResourceSetImpl();
		final DevicePkg devPkg = DevicePkg.Util.getDevicePkg(resourceSet.getResource(DpdTests.getURI("testFiles/defaultDevice.dpd.xml"), true));
		this.hdReg = devPkg.getHwDeviceRegistration();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
		this.hdReg = null;
	}

	public void testClass() throws Exception {
		final DeviceClass devClass = this.hdReg.getDeviceClass();
		Assert.assertNotNull(devClass);
		Assert.assertEquals("Device Class 1", devClass.getClass_().get(0));

	}

} //DeviceClassTest
