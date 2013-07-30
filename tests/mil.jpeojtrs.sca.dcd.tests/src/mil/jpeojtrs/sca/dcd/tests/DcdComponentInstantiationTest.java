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

import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.partitioning.tests.ComponentInstantiationTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class DcdComponentInstantiationTest extends ComponentInstantiationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(DcdComponentInstantiationTest.class);
	}

	/**
	 * Constructs a new Component Instantiation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdComponentInstantiationTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Instantiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void setFixture(final DcdComponentInstantiation fixture) {
		super.setFixture(fixture);
	}

	/**
	 * Returns the fixture for this Component Instantiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected DcdComponentInstantiation getFixture() {
		return (DcdComponentInstantiation) super.getFixture();
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
		final DcdComponentInstantiation ci = deviceConfiguration.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().get(0);
		this.setFixture(ci);
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

} //DcdComponentInstantiationTest
