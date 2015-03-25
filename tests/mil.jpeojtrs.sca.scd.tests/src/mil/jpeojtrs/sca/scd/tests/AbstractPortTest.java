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
package mil.jpeojtrs.sca.scd.tests;

import junit.framework.TestCase;
import mil.jpeojtrs.sca.scd.AbstractPort;

import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.AbstractPort#getInterface() <em>Interface</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.AbstractPort#isBiDirectional() <em>Is Bi Directional</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.AbstractPort#getSibling() <em>Get Sibling</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AbstractPortTest extends TestCase {

	/**
	 * The fixture for this Abstract Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPort fixture = null;

	/**
	 * Constructs a new Abstract Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPortTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractPort fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPort getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.AbstractPort#getInterface() <em>Interface</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.AbstractPort#getInterface()
	 * @generated
	 */
	public void testGetInterface() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.AbstractPort#setInterface(mil.jpeojtrs.sca.scd.Interface) <em>Interface</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.AbstractPort#setInterface(mil.jpeojtrs.sca.scd.Interface)
	 * @generated
	 */
	public void testSetInterface() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.AbstractPort#isBiDirectional() <em>Is Bi Directional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.AbstractPort#isBiDirectional()
	 * @generated NOT
	 */
	public void testIsBiDirectional() {
		// END GENERATED CODE
		Assert.assertFalse(getFixture().isBiDirectional());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.AbstractPort#getSibling() <em>Get Sibling</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.AbstractPort#getSibling()
	 * @generated NOT
	 */
	public void testGetSibling() {
		// END GENERATED CODE
		Assert.assertNull(getFixture().getSibling());
		// BEGIN GENERATED CODE
	}

	/** utility method for subclasses to use
	 * @generated NOT 
	 * */
	protected void testGetSetDescription(final AbstractPort port2, final String expectedDescription) {
		AbstractPort port = getFixture();
		Assert.assertNotNull(port);
		String description = port.getDescription();
		Assert.assertNull(description);
		final String EXPECTED_DESCRIPTION = "Optional Port description.";
		this.fixture.setDescription(EXPECTED_DESCRIPTION);
		Assert.assertEquals("setDescription", EXPECTED_DESCRIPTION, port.getDescription());
		
		Assert.assertNotNull(port2);
		Assert.assertEquals("port2.description", expectedDescription, port2.getDescription());
	}
} // AbstractPortTest
