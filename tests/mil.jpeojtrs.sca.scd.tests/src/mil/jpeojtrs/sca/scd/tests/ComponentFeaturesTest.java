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
import mil.jpeojtrs.sca.scd.ComponentFeatures;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.Provides;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.scd.SupportsInterface;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Features</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentFeaturesTest extends TestCase {

	/**
	 * The fixture for this Component Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentFeatures fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentFeaturesTest.class);
	}

	/**
	 * Constructs a new Component Features test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFeaturesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentFeatures fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Features test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFeatures getFixture() {
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
		setFixture(ScdFactory.eINSTANCE.createComponentFeatures());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getComponentFeatures());
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

	@Test
	public void test_getSupportsInterface() throws Exception {
		Assert.assertNotNull(this.fixture);

		boolean hasInterface = false;

		for (final SupportsInterface inter : this.fixture.getSupportsInterface()) {
			Assert.assertNotNull(inter);
			Assert.assertNotNull(inter.getSupportsName());

			if (inter.getSupportsName().equals("PortSupplier")) {
				hasInterface = true;
			}
		}

		Assert.assertTrue(hasInterface);
	}

	@Test
	public void test_getPorts() throws Exception {
		Assert.assertNotNull(this.fixture.getPorts());

		Assert.assertNotNull(this.fixture.getPorts().getProvides().get(0));
		Assert.assertNotNull(this.fixture.getPorts().getUses().get(0));

		Assert.assertEquals("provides_port", this.fixture.getPorts().getProvides().get(0).getProvidesName());
		Assert.assertEquals("uses_port_virtual", this.fixture.getPorts().getUses().get(0).getUsesName());
	}

	@Test
	public void test_setPorts() throws Exception {
		final Ports ports = this.fixture.getPorts();
		Assert.assertNotNull(ports);

		final Provides provides = ports.getProvides().get(0);
		Assert.assertNotNull(provides);
		provides.setProvidesName("New name");

		ports.getProvides().add(provides);

		this.fixture.setPorts(ports);

		Assert.assertNotNull(this.fixture.getPorts());
		Assert.assertEquals("New name", this.fixture.getPorts().getProvides().get(0).getProvidesName());
		
		
		final Ports ports2 = this.fixture.getPorts();
		Assert.assertNotNull(ports2);

		final Provides provides2 = ports2.getProvides().get(0);
		Assert.assertNotNull(provides2);
		provides2.setProvidesName("Retest");

		ports2.getProvides().add(provides2);

		this.fixture.setPorts(ports2);

		Assert.assertNotNull(this.fixture.getPorts());
		Assert.assertEquals("Retest", this.fixture.getPorts().getProvides().get(0).getProvidesName());
	}

} //ComponentFeaturesTest
