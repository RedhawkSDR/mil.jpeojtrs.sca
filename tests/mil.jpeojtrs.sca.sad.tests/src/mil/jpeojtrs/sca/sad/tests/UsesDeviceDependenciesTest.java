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
package mil.jpeojtrs.sca.sad.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.UsesDeviceDependencies;
import mil.jpeojtrs.sca.spd.UsesDevice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uses Device Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsesDeviceDependenciesTest extends TestCase {

	/**
	 * The fixture for this Uses Device Dependencies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceDependencies fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsesDeviceDependenciesTest.class);
	}

	/**
	 * Constructs a new Uses Device Dependencies test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDeviceDependenciesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Uses Device Dependencies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UsesDeviceDependencies fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Uses Device Dependencies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDeviceDependencies getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SadFactory.eINSTANCE.createUsesDeviceDependencies());
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
	 * @generated NOT
	 */
	public void testGetUsesdevice() {
		assertNotNull("fixture", fixture);
		EList<UsesDevice> usesDeviceEList = fixture.getUsesdevice();
		assertNotNull("getUsesdevice", usesDeviceEList);
	}
} //UsesDeviceDependenciesTest
