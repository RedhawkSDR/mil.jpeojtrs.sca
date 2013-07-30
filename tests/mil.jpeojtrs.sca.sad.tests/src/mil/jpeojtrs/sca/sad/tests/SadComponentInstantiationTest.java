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

import junit.textui.TestRunner;
import mil.jpeojtrs.sca.partitioning.tests.ComponentInstantiationTest;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class SadComponentInstantiationTest extends ComponentInstantiationTest {

	/**
	 * The fixture for this Component Instantiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadComponentInstantiation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(final String[] args) {
		TestRunner.run(SadComponentInstantiationTest.class);
	}

	/**
	 * Constructs a new Component Instantiation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadComponentInstantiationTest(final String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Instantiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(final SadComponentInstantiation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Instantiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SadComponentInstantiation getFixture() {
		return this.fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		final SoftwareAssembly assembly = SadTests.getSoftwareAssembly();
		setFixture(assembly.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().get(0));
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

} //SadComponentInstantiationTest
