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
import mil.jpeojtrs.sca.scd.LocalFile;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalFileTest extends TestCase {

	/**
	 * The fixture for this Local File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected LocalFile fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalFileTest.class);
	}

	/**
	 * Constructs a new Local File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Local File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LocalFile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Local File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalFile getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet = null;
	private SoftwareComponent scd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScdFactory.eINSTANCE.createLocalFile());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getPropertyFile().getLocalFile());
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
	public void test_getName() throws Exception {
		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertEquals("sample_component.prf.xml", this.fixture.getName());
	}

	@Test
	public void test_setName() throws Exception {
		this.fixture.setName("New name");
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertEquals("New name", this.fixture.getName());
	}

	@Test
	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}

} //LocalFileTest
