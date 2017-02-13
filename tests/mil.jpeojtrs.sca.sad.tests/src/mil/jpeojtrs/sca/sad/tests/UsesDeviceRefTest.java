/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad.tests;

import org.junit.Assert;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.sad.UsesDeviceRef;
import mil.jpeojtrs.sca.spd.UsesDevice;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uses Device Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#getUsesDevice() <em>Uses Device</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class UsesDeviceRefTest extends TestCase {

	/**
	 * The fixture for this Uses Device Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceRef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsesDeviceRefTest.class);
	}

	/**
	 * Constructs a new Uses Device Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDeviceRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Uses Device Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UsesDeviceRef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Uses Device Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceRef getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		// END GENERATED CODE
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/HostCollocation_UsesDeviceRef/HostCollocation_UsesDeviceRef.sad.xml");
		setFixture(sad.getPartitioning().getHostCollocation().get(0).getUsesDeviceRef().get(0));
		// BEGIN GENERATED CODE
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

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#getUsesDevice() <em>Uses Device</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.UsesDeviceRef#getUsesDevice()
	 * @generated NOT
	 */
	public void testGetUsesDevice() {
		// END GENERATED CODE
		UsesDevice ud = getFixture().getUsesDevice();
		Assert.assertNotNull(ud);
		Assert.assertEquals("FrontEndTuner_1", ud.getId());
		Assert.assertEquals(true, ud.getProperties().size() > 0);
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.UsesDeviceRef#setUsesDevice(mil.jpeojtrs.sca.spd.UsesDevice) <em>Uses Device</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.UsesDeviceRef#setUsesDevice(mil.jpeojtrs.sca.spd.UsesDevice)
	 * @generated NOT
	 */
	public void testSetUsesDevice() {
		// END GENERATED CODE
		SoftwareAssembly sad = ScaEcoreUtils.getEContainerOfType(getFixture(), SoftwareAssembly.class);
		UsesDevice ud = sad.getUsesDeviceDependencies().getUsesdevice().get(1);
		getFixture().setUsesDevice(ud);
		Assert.assertEquals("FrontEndTuner_2", getFixture().getRefid());
		// BEGIN GENERATED CODE
	}

	// END GENERATED CODE

	public void testId() {
		Assert.assertEquals("FrontEndTuner_1", getFixture().getRefid());
	}

	// BEGIN GENERATED CODE

} // UsesDeviceRefTest
