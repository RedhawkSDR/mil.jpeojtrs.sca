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

import org.junit.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.scd.ComponentRepId;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Rep Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.ComponentRepId#getInterface() <em>Interface</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ComponentRepIdTest extends TestCase {

	/**
	 * The fixture for this Component Rep Id test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentRepId fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentRepIdTest.class);
	}

	/**
	 * Constructs a new Component Rep Id test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRepIdTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Rep Id test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentRepId fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Rep Id test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRepId getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet = null;
	private SoftwareComponent scd = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScdFactory.eINSTANCE.createComponentRepId());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getComponentRepID());
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
		this.resourceSet = null;
		this.scd = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.ComponentRepId#getInterface() <em>Interface</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.ComponentRepId#getInterface()
	 * @generated NOT
	 */
	public void testGetInterface() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getInterface());
		Assert.assertNotNull(this.fixture.getInterface().getName());
		Assert.assertNotNull(this.fixture.getInterface().getRepid());

		Assert.assertEquals("Resource", this.fixture.getInterface().getName());
		Assert.assertEquals("IDL:CF/Resource:1.0", this.fixture.getInterface().getRepid());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.ComponentRepId#setInterface(mil.jpeojtrs.sca.scd.Interface) <em>Interface</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.ComponentRepId#setInterface(mil.jpeojtrs.sca.scd.Interface)
	 * @generated NOT
	 */
	public void testSetInterface() {
		// END GENERATED CODE

		final Interface inter = this.fixture.getInterface();
		Assert.assertNotNull(inter);
		inter.setName("new name");
		this.fixture.setInterface(inter);

		Assert.assertNotNull(this.fixture.getInterface());
		Assert.assertEquals("new name", this.fixture.getInterface().getName());

		// END GENERATED CODE
	}

	@Test
	public void test_getRepid() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getRepid());
		Assert.assertEquals("IDL:CF/Resource:1.0", this.fixture.getInterface().getRepid());
	}

	@Test
	public void test_setRepid() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		this.fixture.setRepid("new repid");
		Assert.assertNotNull(this.fixture.getRepid());
		Assert.assertEquals("new repid", this.fixture.getRepid());

		this.fixture.setRepid(null);
		Assert.assertNull(this.fixture.getRepid());

		this.fixture.setInterface(null);
		Assert.assertNull(this.fixture.getInterface());
		Assert.assertNull(this.fixture.getRepid());
	}

	@Test
	public void test_toString() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.toString());
	}

} //ComponentRepIdTest
