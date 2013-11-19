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
package mil.jpeojtrs.sca.dcd.tests;

import org.junit.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.CompositePartOfDevice;
import mil.jpeojtrs.sca.dcd.DcdComponentInstantiation;
import mil.jpeojtrs.sca.dcd.DcdComponentPlacement;
import mil.jpeojtrs.sca.dcd.DcdFactory;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Composite Part Of Device</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getComponent() <em>Component</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CompositePartOfDeviceTest extends TestCase {

	/**
	 * The fixture for this Composite Part Of Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositePartOfDevice fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositePartOfDeviceTest.class);
	}

	/**
	 * Constructs a new Composite Part Of Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositePartOfDeviceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Composite Part Of Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CompositePartOfDevice fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Composite Part Of Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositePartOfDevice getFixture() {
		return fixture;
	}

	private DeviceConfiguration conf;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.conf = DcdTests.getDeviceConfiguration();
		this.setFixture(this.conf.getPartitioning().getComponentPlacement().get(2).getCompositePartOfDevice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testParse() throws Exception {
		Assert.assertNotNull(this.getFixture());
		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90eee5", this.getFixture().getRefID());
		Assert.assertFalse("".equals(this.getFixture().toString()));
	}

	/**
	 * Tests the '
	 * {@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getComponent()
	 * <em>Component</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.dcd.CompositePartOfDevice#getComponent()
	 * @generated NOT
	 */
	public void testGetComponent() {
		// END GENERATED CODE

		Assert.assertNotNull(this.getFixture().getComponent());
		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90eee5", this.getFixture().getComponent().getId());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '
	 * {@link mil.jpeojtrs.sca.dcd.CompositePartOfDevice#setComponent(mil.jpeojtrs.sca.dcd.ComponentInstantiation)
	 * <em>Component</em>}' feature setter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.dcd.CompositePartOfDevice#setComponent(mil.jpeojtrs.sca.dcd.ComponentInstantiation)
	 * @generated NOT
	 */
	public void testSetComponent() {
		// END GENERATED CODE

		final DcdComponentPlacement place = DcdFactory.eINSTANCE.createDcdComponentPlacement();
		place.setComponentFileRef(CompositePartOfDeviceTest.this.conf.getPartitioning().getComponentPlacement().get(0).getComponentFileRef());
		

		final DcdComponentInstantiation inst = DcdFactory.eINSTANCE.createDcdComponentInstantiation();
		inst.setId("TestCompInstRefID");
		inst.setUsageName("TestInstUsage");

		place.getComponentInstantiation().add(inst);

		this.conf.getPartitioning().getComponentPlacement().add(place);

		getFixture().setComponent(inst);

		Assert.assertNotNull(this.getFixture().getComponent());
		Assert.assertEquals("TestCompInstRefID", this.getFixture().getComponent().getId());
		Assert.assertEquals("TestInstUsage", this.getFixture().getComponent().getUsageName());

		getFixture().setComponent(null);
		Assert.assertNull(this.getFixture().getComponent());

		// BEGIN GENERATED CODE
	}

} //CompositePartOfDeviceTest
