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

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.scd.SupportsInterface;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Supports Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.SupportsInterface#getId() <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.SupportsInterface#getInterface() <em>Interface</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SupportsInterfaceTest extends TestCase {

	/**
	 * The fixture for this Supports Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SupportsInterface fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SupportsInterfaceTest.class);
	}

	/**
	 * Constructs a new Supports Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportsInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Supports Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SupportsInterface fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Supports Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportsInterface getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;
	private SoftwareComponent scd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScdFactory.eINSTANCE.createSupportsInterface());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getComponentFeatures().getSupportsInterface().get(0));
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
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getId() <em>Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.SupportsInterface#getId()
	 * @generated NOT
	 */
	public void testGetId() throws Exception {
		// END GENERATED CODE		

		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getId());
		Assert.assertEquals("supportsInterface:IDL:CF/Resource:1.0", this.fixture.getId());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.SupportsInterface#getInterface() <em>Interface</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.SupportsInterface#getInterface()
	 * @generated NOT
	 */
	public void testGetInterface() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture.getInterface());
		Assert.assertNotNull(this.fixture.getInterface().getName());
		Assert.assertNotNull(this.fixture.getInterface().getRepid());

		Assert.assertEquals("Resource", this.fixture.getInterface().getName());
		Assert.assertEquals("IDL:CF/Resource:1.0", this.fixture.getInterface().getRepid());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.SupportsInterface#setInterface(mil.jpeojtrs.sca.scd.Interface) <em>Interface</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.SupportsInterface#setInterface(mil.jpeojtrs.sca.scd.Interface)
	 * @generated NOT
	 */
	public void testSetInterface() {
		// END GENERATED CODE

		final Interface inter = this.fixture.getInterface();
		Assert.assertNotNull(inter);
		inter.setName("New name");
		this.fixture.setInterface(inter);

		Assert.assertNotNull(this.fixture.getInterface());
		Assert.assertEquals("New name", this.fixture.getInterface().getName());

		// END GENERATED CODE
	}

	@Test
	public void test_getRepId() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getRepId());
		Assert.assertEquals("IDL:CF/Resource:1.0", this.fixture.getRepId());
	}

	@Test
	public void test_setRepId() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		this.fixture.setRepId("New repid");
		Assert.assertNotNull(this.fixture.getRepId());
		Assert.assertEquals("New repid", this.fixture.getRepId());
	}

	@Test
	public void test_getSupportsName() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getSupportsName());
		Assert.assertEquals("Resource", this.fixture.getSupportsName());
	}

	@Test
	public void test_setSupportsName() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		this.fixture.setSupportsName("New supports name");
		Assert.assertNotNull(this.fixture.getSupportsName());
		Assert.assertEquals("New supports name", this.fixture.getSupportsName());
	}

	@Test
	public void test_toString() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.toString());
	}

} //SupportsInterfaceTest
