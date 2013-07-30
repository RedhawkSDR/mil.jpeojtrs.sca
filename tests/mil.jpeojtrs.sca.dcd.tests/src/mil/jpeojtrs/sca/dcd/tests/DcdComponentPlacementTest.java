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
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdComponentPlacement;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.partitioning.tests.ComponentPlacementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getParentDevice() <em>Parent Device</em>}</li>
 * </ul>
 * </p>
 * @generated NOT
 */
public class DcdComponentPlacementTest extends ComponentPlacementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(DcdComponentPlacementTest.class);
	}

	private DeviceConfiguration deviceConfiguration;

	/**
	 * Constructs a new Component Placement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdComponentPlacementTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Placement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void setFixture(final DcdComponentPlacement fixture) {
		super.setFixture(fixture);
	}

	/**
	 * Returns the fixture for this Component Placement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected DcdComponentPlacement getFixture() {
		return (DcdComponentPlacement) super.getFixture();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.deviceConfiguration = DcdTests.getDeviceConfiguration();
		final DcdComponentPlacement cp = this.deviceConfiguration.getPartitioning().getComponentPlacement().get(2);
		this.setFixture(cp);
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
	 * Tests the '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getParentDevice() <em>Parent Device</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentPlacement#getParentDevice()
	 * @generated NOT
	 */
	public void testGetParentDevice() {
		// END GENERATED CODE
		Assert.assertNotNull(getFixture().getParentDevice());
		Assert.assertNull(this.deviceConfiguration.getPartitioning().getComponentPlacement().get(0).getParentDevice());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dcd.DcdComponentPlacement#setParentDevice(mil.jpeojtrs.sca.dcd.DcdComponentPlacement) <em>Parent Device</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.DcdComponentPlacement#setParentDevice(mil.jpeojtrs.sca.dcd.DcdComponentPlacement)
	 * @generated NOT
	 */
	public void testSetParentDevice() {
		// END GENERATED CODE
		final DcdComponentInstantiation oldParent = getFixture().getParentDevice();
		getFixture().setParentDevice(null);
		Assert.assertNull(getFixture().getCompositePartOfDevice());
		getFixture().setParentDevice(oldParent);
		Assert.assertNotNull(getFixture().getCompositePartOfDevice());
		// END GENERATED CODE
	}

} //DcdComponentPlacementTest
