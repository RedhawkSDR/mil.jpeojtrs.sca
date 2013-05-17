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
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.PortType;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.scd.Uses;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.Uses#getUsesName() <em>Uses Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class UsesTest extends AbstractPortTest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsesTest.class);
	}

	/**
	 * Constructs a new Uses test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uses test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Uses getFixture() {
		return (Uses)fixture;
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
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getComponentFeatures().getPorts().getUses().get(0));
		Assert.assertNotNull(this.fixture);
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
	 * Tests the '{@link mil.jpeojtrs.sca.scd.Uses#getUsesName() <em>Uses Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.Uses#getUsesName()
	 * @generated NOT
	 */
	public void testGetUsesName() {
		// END GENERATED CODE

		Assert.assertNotNull(getFixture().getUsesName());
		Assert.assertEquals("uses_port_virtual", getFixture().getUsesName());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.Uses#setUsesName(java.lang.String) <em>Uses Name</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.Uses#setUsesName(java.lang.String)
	 * @generated NOT
	 */
	public void testSetUsesName() {
		// END GENERATED CODE

		getFixture().setUsesName("New uses name");
		Assert.assertNotNull(getFixture().getUsesName());
		Assert.assertEquals("New uses name", getFixture().getUsesName());

		// END GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.Uses#getInterface() <em>Interface</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.Uses#getInterface()
	 * @generated NOT
	 */
	@Override
	public void testGetInterface() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture.getInterface());
		Assert.assertNotNull(this.fixture.getInterface().getName());
		Assert.assertNotNull(this.fixture.getInterface().getRepid());

		Assert.assertEquals("dataFloat", this.fixture.getInterface().getName());
		Assert.assertEquals("IDL:BULKIO/dataFloat:1.0", this.fixture.getRepID());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.Uses#setInterface(mil.jpeojtrs.sca.scd.Interface) <em>Interface</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.Uses#setInterface(mil.jpeojtrs.sca.scd.Interface)
	 * @generated NOT
	 */
	@Override
    public void testSetInterface() {
		// END GENERATED CODE

		final Interface inter = this.fixture.getInterface();
		Assert.assertNotNull(inter);
		inter.setRepid("New repid");
		this.fixture.setInterface(inter);

		Assert.assertNotNull(this.fixture.getInterface());
		Assert.assertEquals("New repid", this.fixture.getRepID());

		// END GENERATED CODE
	}

	@Test
	public void test_getPortType() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getPortType());
		Assert.assertNotNull(this.fixture.getPortType().get(0));
		Assert.assertNotNull(this.fixture.getPortType().get(0).getType());

		Assert.assertEquals(PortType.DATA, this.fixture.getPortType().get(0).getType());
	}

	@Test
	public void test_getRepID() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getRepID());
		Assert.assertEquals("IDL:BULKIO/dataFloat:1.0", this.fixture.getRepID());
	}

	@Test
	public void test_setRepID() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		this.fixture.setRepID("New repid");
		Assert.assertNotNull(this.fixture.getRepID());
		Assert.assertEquals("New repid", this.fixture.getRepID());

		this.fixture.setRepID(null);
		Assert.assertNull(this.fixture.getRepID());
		Assert.assertNull(this.fixture.getInterface());
	}

	@Test
	public void test_getUsesName() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(getFixture().getUsesName());
		Assert.assertEquals("uses_port_virtual", getFixture().getUsesName());
	}

	@Test
	public void test_setUsesName() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		getFixture().setUsesName("New uses name");
		Assert.assertNotNull(getFixture().getUsesName());
		Assert.assertEquals("New uses name", getFixture().getUsesName());
	}

	@Test
	public void test_toString() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.toString());
	}

} //UsesTest
