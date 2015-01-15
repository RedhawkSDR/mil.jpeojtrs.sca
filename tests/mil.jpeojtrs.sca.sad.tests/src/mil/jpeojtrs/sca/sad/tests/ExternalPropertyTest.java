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

import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.ExternalProperty;
import mil.jpeojtrs.sca.sad.SadFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.ExternalProperty#resolveExternalID() <em>Resolve External ID</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExternalPropertyTest extends TestCase {

	/**
	 * The fixture for this External Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalProperty fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalPropertyTest.class);
	}

	/**
	 * Constructs a new External Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPropertyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this External Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExternalProperty fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this External Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalProperty getFixture() {
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
		setFixture(SadFactory.eINSTANCE.createExternalProperty());
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
	 * Tests the '{@link mil.jpeojtrs.sca.sad.ExternalProperty#resolveExternalID() <em>Resolve External ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.ExternalProperty#resolveExternalID()
	 * @generated NOT
	 */
	@Test
	public void testResolveExternalID() {
		assertNotNull("fixture", fixture);
		final String TEST_ID = "test_setExternalPropID";
		fixture.setExternalPropID(TEST_ID);

		String externalPropID = fixture.getExternalPropID();
		assertEquals("set/get ExternalPropID", TEST_ID, externalPropID);
		
		String externalId = fixture.resolveExternalID();
		assertEquals("resolveExternalID", TEST_ID, externalId);
	}

} //ExternalPropertyTest
