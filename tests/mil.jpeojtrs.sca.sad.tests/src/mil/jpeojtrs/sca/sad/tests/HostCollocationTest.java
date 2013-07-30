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

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.HostCollocation;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Host Collocation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HostCollocationTest extends TestCase {

	/**
	 * The fixture for this Host Collocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected HostCollocation fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HostCollocationTest.class);
	}

	/**
	 * Constructs a new Host Collocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostCollocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Host Collocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HostCollocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Host Collocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostCollocation getFixture() {
		return fixture;
	}

	private SoftwareAssembly sad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.sad = SadTests.getSoftwareAssembly();
		this.setFixture(this.sad.getPartitioning().getHostCollocation().get(0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
		this.sad = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.HostCollocation#getComponentPlacement() <em>Component Placement</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.HostCollocation#getComponentPlacement()
	 * @generated NOT
	 */
	public void testGetComponentPlacement() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getComponentPlacement());
		Assert.assertEquals("FrequencyShift", this.fixture.getComponentPlacement().get(0).getName());

		// BEGIN GENERATED CODE
	}

	public void test_getId() throws Exception {
		Assert.assertEquals("DCE:46da4d56-44ac-48a8-bae8-56632da98a87", this.fixture.getId());
	}

	public void test_setId() throws Exception {
		this.fixture.setId("New id");
		Assert.assertNotNull(this.fixture.getId());
		Assert.assertEquals("New id", this.fixture.getId());
	}

	public void test_getName() throws Exception {
		Assert.assertEquals("Host Collocation", this.fixture.getName());
	}

	public void test_setName() throws Exception {
		this.fixture.setName("New name");
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertEquals("New name", this.fixture.getName());
	}

	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}

} //HostCollocationTest
