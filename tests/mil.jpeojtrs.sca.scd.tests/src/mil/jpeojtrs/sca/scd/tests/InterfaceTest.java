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
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.Interface#isInstance(mil.jpeojtrs.sca.scd.Interface) <em>Is Instance</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class InterfaceTest extends TestCase {

	/**
	 * The fixture for this Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Interface fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterfaceTest.class);
	}

	/**
	 * Constructs a new Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Interface fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Interface getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;
	SoftwareComponent scd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScdFactory.eINSTANCE.createInterface());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getInterfaces().getInterface().get(0));
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
	 * Tests the '{@link mil.jpeojtrs.sca.scd.Interface#isInstance(mil.jpeojtrs.sca.scd.Interface) <em>Is Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.Interface#isInstance(mil.jpeojtrs.sca.scd.Interface)
	 * @generated NOT
	 */
	public void testIsInstance__Interface() {
		// END GENERATED CODE
		final Interface resourceInterface = this.scd.getInterfaces().getInterface().get(0);
		final Interface lifecycleInterface = this.scd.getInterfaces().getInterface().get(1);
		final Interface portsupplierInterface = this.scd.getInterfaces().getInterface().get(2);
		Assert.assertTrue(resourceInterface.isInstance(resourceInterface));
		Assert.assertTrue(resourceInterface.isInstance(lifecycleInterface));
		Assert.assertTrue(resourceInterface.isInstance(portsupplierInterface));
		Assert.assertFalse(lifecycleInterface.isInstance(portsupplierInterface));
		Assert.assertFalse(resourceInterface.isInstance(null));
		// BEGIN GENERATED CODE
	}

	@Test
	public void test_getInheritsInterfaces() throws Exception {
		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertEquals("Resource", this.fixture.getName());

		Assert.assertNotNull(this.fixture.getInheritsInterfaces().get(0).getRepid());
		Assert.assertEquals("IDL:CF/LifeCycle:1.0", this.fixture.getInheritsInterfaces().get(0).getRepid());
	}

	@Test
	public void test_getName() throws Exception {
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertEquals("Resource", this.fixture.getName());
	}

	@Test
	public void test_setName() throws Exception {
		this.fixture.setName("New name");
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertEquals("New name", this.fixture.getName());
	}

	@Test
	public void test_getRepid() throws Exception {
		Assert.assertNotNull(this.fixture.getRepid());
		Assert.assertEquals("IDL:CF/Resource:1.0", this.fixture.getRepid());
	}

	@Test
	public void test_setRepid() throws Exception {
		this.fixture.setRepid("New repid");
		Assert.assertNotNull(this.fixture.getRepid());
		Assert.assertEquals("New repid", this.fixture.getRepid());
	}

	@Test
	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}

} //InterfaceTest
