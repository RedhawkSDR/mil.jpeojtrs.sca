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
package mil.jpeojtrs.sca.spd.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.spd.Descriptor;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Descriptor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Descriptor#getComponent() <em>Component</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DescriptorTest extends TestCase {

	/**
	 * The fixture for this Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Descriptor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DescriptorTest.class);
	}

	/**
	 * Constructs a new Descriptor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Descriptor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Descriptor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Descriptor getFixture() {
		return fixture;
	}

	private Descriptor descriptor;
	private ResourceSetImpl resourceSet;
	private SoftwareComponent component;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createDescriptor());
		this.resourceSet = new ResourceSetImpl();
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/defaultCpp.spd.xml"), true));
		this.descriptor = softPkg.getDescriptor();
		this.component = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(SpdTests.getURI("testFiles/SoftwareComponentTest.scd.xml"),
		        true));
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
		this.descriptor = null;
		this.resourceSet = null;
		this.component = null;
	}

	public void testParse() {
		Assert.assertEquals("cppDescriptor", this.descriptor.getName());
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.Descriptor#getComponent()
	 * <em>Component</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.spd.Descriptor#getComponent()
	 * @generated NOT
	 */
	public void testGetComponent() {
		// END GENERATED CODE
		Assert.assertNotNull(this.descriptor.getComponent());
		Assert.assertEquals("IDL:CF/Resource:1.0", this.descriptor.getComponent().getRepId());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '
	 * {@link mil.jpeojtrs.sca.spd.Descriptor#setComponent(mil.jpeojtrs.sca.scd.SoftwareComponent)
	 * <em>Component</em>}' feature setter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.spd.Descriptor#setComponent(mil.jpeojtrs.sca.scd.SoftwareComponent)
	 * @generated NOT
	 */
	public void testSetComponent() {
		// END GENERATED CODE
		this.descriptor.setComponent(this.component);
		Assert.assertEquals("IDL:CF/Resource:1.1", this.descriptor.getComponent().getRepId());

		this.descriptor.setComponent(this.component);
		Assert.assertEquals("2.2", this.descriptor.getComponent().getCorbaVersion());
		// END GENERATED CODE
	}

} // DescriptorTest
