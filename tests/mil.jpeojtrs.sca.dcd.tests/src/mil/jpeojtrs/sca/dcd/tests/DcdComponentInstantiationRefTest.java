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

import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiationRef;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.partitioning.tests.ComponentInstantiationRefTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Instantiation Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class DcdComponentInstantiationRefTest extends ComponentInstantiationRefTest {

	/**
	 * The fixture for this Component Instantiation Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DcdComponentInstantiationRef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(DcdComponentInstantiationRefTest.class);
	}

	/**
	 * Constructs a new Component Instantiation Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdComponentInstantiationRefTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Instantiation Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(final DcdComponentInstantiationRef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Instantiation Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DcdComponentInstantiationRef getFixture() {
		return this.fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		final DeviceConfiguration deviceConfiguration = DcdTests.getDeviceConfiguration();
		this.setFixture(deviceConfiguration.getConnections().getConnectInterface().get(0).getUsesPort().getComponentInstantiationRef());
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

} //DcdComponentInstantiationRefTest
