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
import mil.jpeojtrs.sca.scd.PortType;
import mil.jpeojtrs.sca.scd.PortTypeContainer;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Port Type Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortTypeContainerTest extends TestCase {

	/**
	 * The fixture for this Port Type Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PortTypeContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortTypeContainerTest.class);
	}

	/**
	 * Constructs a new Port Type Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Port Type Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PortTypeContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Port Type Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeContainer getFixture() {
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
		setFixture(ScdFactory.eINSTANCE.createPortTypeContainer());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getComponentFeatures().getPorts().getProvides().get(0).getPortType().get(0));
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

	@Test
	public void test_getType() throws Exception {
		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getType());
		Assert.assertEquals(PortType.DATA, this.fixture.getType());
	}

	@Test
	public void test_setType() throws Exception {
		this.fixture.setType(PortType.DATA);
		Assert.assertNotNull(this.fixture.getType());
		Assert.assertEquals(PortType.DATA, this.fixture.getType());
		this.fixture.setType(null);
		Assert.assertEquals(PortType.CONTROL, this.fixture.getType());
	}

	@Test
	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}

	public void test_isSetType() throws Exception {
		Assert.assertNotNull(this.fixture.isSetType());
		Assert.assertTrue(this.fixture.isSetType());
	}

	public void test_unsetType() throws Exception {
		this.fixture.unsetType();
	}

} //PortTypeContainerTest
