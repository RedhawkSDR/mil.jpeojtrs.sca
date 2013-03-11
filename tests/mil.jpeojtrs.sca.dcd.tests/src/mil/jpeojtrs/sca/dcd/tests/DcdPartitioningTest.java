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
import mil.jpeojtrs.sca.dcd.DcdPartitioning;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.partitioning.tests.PartitioningTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Partitioning</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class DcdPartitioningTest extends PartitioningTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(DcdPartitioningTest.class);
	}

	/**
	 * Constructs a new Partitioning test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdPartitioningTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Partitioning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void setFixture(final DcdPartitioning fixture) {
		super.setFixture(fixture);
	}

	/**
	 * Returns the fixture for this Partitioning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected DcdPartitioning getFixture() {
		return (DcdPartitioning) super.getFixture();
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
		this.setFixture(deviceConfiguration.getPartitioning());
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

} //DcdPartitioningTest
