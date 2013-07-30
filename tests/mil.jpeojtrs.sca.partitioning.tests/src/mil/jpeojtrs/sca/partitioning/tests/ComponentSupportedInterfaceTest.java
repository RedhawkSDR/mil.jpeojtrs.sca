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
package mil.jpeojtrs.sca.partitioning.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Supported Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getInterface() <em>Interface</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ComponentSupportedInterfaceTest extends TestCase {

	/**
	 * The fixture for this Component Supported Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSupportedInterface fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentSupportedInterfaceTest.class);
	}

	/**
	 * Constructs a new Component Supported Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSupportedInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Supported Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentSupportedInterface fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Supported Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSupportedInterface getFixture() {
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
		setFixture(PartitioningFactory.eINSTANCE.createComponentSupportedInterface());
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
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getInterface() <em>Interface</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#getInterface()
	 * @generated NOT
	 */
	public void testGetInterface() {
		// END GENERATED CODE
		Assert.assertEquals(getFixture().getSupportedIdentifier() != null, getFixture().getInterface() != null);
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#setInterface(mil.jpeojtrs.sca.scd.Interface) <em>Interface</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface#setInterface(mil.jpeojtrs.sca.scd.Interface)
	 * @generated NOT
	 */
	public void testSetInterface() {
		// END GENERATED CODE
		getFixture().setInterface(null);
		Assert.assertNull(getFixture().getSupportedIdentifier());
		// END GENERATED CODE
	}

} //ComponentSupportedInterfaceTest
