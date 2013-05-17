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
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.Provides;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;
import mil.jpeojtrs.sca.scd.Uses;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.Ports#getProvides() <em>Provides</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.Ports#getUses() <em>Uses</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PortsTest extends TestCase {

	/**
	 * The fixture for this Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Ports fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortsTest.class);
	}

	/**
	 * Constructs a new Ports test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ports fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ports getFixture() {
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
		setFixture(ScdFactory.eINSTANCE.createPorts());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getComponentFeatures().getPorts());
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
	 * Tests the '{@link mil.jpeojtrs.sca.scd.Ports#getProvides() <em>Provides</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.Ports#getProvides()
	 * @generated NOT
	 */
	public void testGetProvides() {
		// END GENERATED CODE

		boolean hasPort = false;

		for (final Provides prov : this.fixture.getProvides()) {
			Assert.assertNotNull(prov);

			if (prov.getProvidesName().equals("provides_port")) {
				hasPort = true;
				break;
			}
		}

		Assert.assertTrue(hasPort);

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.Ports#getUses() <em>Uses</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.Ports#getUses()
	 * @generated NOT
	 */
	public void testGetUses() {
		// END GENERATED CODE

		boolean hasPort = false;

		for (final Uses prov : this.fixture.getUses()) {
			Assert.assertNotNull(prov);

			if (prov.getUsesName().equals("uses_port")) {
				hasPort = true;
				break;
			}
		}

		Assert.assertTrue(hasPort);

		// BEGIN GENERATED CODE
	}

	@Test
	public void test_getGroup() throws Exception {
		Assert.assertNotNull(this.fixture.getGroup());
		Assert.assertEquals(3, this.fixture.getGroup().size());
	}

	@Test
	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}

} //PortsTest
