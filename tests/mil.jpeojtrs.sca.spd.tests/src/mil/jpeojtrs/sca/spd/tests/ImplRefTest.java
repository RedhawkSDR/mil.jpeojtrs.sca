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
package mil.jpeojtrs.sca.spd.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.spd.ImplRef;
import mil.jpeojtrs.sca.spd.SpdFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Impl Ref</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class ImplRefTest extends TestCase {

	/**
	 * The fixture for this Impl Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplRef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplRefTest.class);
	}

	/**
	 * Constructs a new Impl Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Impl Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ImplRef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Impl Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplRef getFixture() {
		return fixture;
	}

	private static final String id = "testRefId";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createImplRef());

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testParse() throws Exception {
		// PASS Not currently supported by IDE
	}

	public void testSetRefId() throws Exception {
		this.fixture.setRefid(ImplRefTest.id);
		Assert.assertEquals(ImplRefTest.id, this.fixture.getRefid());
	}

	public void testGetRefId() throws Exception {
		Assert.assertEquals(null, this.fixture.getRefid());
	}

} // ImplRefTest
