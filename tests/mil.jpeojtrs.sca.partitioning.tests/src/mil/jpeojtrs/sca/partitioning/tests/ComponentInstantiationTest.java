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
package mil.jpeojtrs.sca.partitioning.tests;

import junit.framework.TestCase;
import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.scd.Ports;
import mil.jpeojtrs.sca.scd.ScdPackage;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getProvides() <em>Provides</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUses() <em>Uses</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ComponentInstantiationTest extends TestCase {

	/**
	 * The fixture for this Component Instantiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstantiation fixture = null;

	/**
	 * Constructs a new Component Instantiation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Instantiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentInstantiation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Instantiation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstantiation getFixture() {
		return fixture;
	}

	private static final EStructuralFeature[] PORTS_PATH = { PartitioningPackage.Literals.COMPONENT_INSTANTIATION__PLACEMENT,
		PartitioningPackage.Literals.COMPONENT_PLACEMENT__COMPONENT_FILE_REF, PartitioningPackage.Literals.COMPONENT_FILE_REF__FILE,
		PartitioningPackage.Literals.COMPONENT_FILE__SOFT_PKG, SpdPackage.Literals.SOFT_PKG__DESCRIPTOR, SpdPackage.Literals.DESCRIPTOR__COMPONENT,
		ScdPackage.Literals.SOFTWARE_COMPONENT__COMPONENT_FEATURES, ScdPackage.Literals.COMPONENT_FEATURES__PORTS };

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getProvides() <em>Provides</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getProvides()
	 * @generated NOT
	 */
	public void testGetProvides() {
		// END GENERATED CODE
		int size = 0;
		final Ports ports = ScaEcoreUtils.getFeature(getFixture(), ComponentInstantiationTest.PORTS_PATH);
		if (ports != null) {
			size = ports.getProvides().size();
		}
		Assert.assertEquals(size, getFixture().getProvides().size());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUses() <em>Uses</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiation#getUses()
	 * @generated NOT
	 */
	public void testGetUses() {
		// END GENERATED CODE
		int size = 0;
		final Ports ports = ScaEcoreUtils.getFeature(getFixture(), ComponentInstantiationTest.PORTS_PATH);
		if (ports != null) {
			size = ports.getUses().size();
		}
		Assert.assertEquals(size, getFixture().getUses().size());
		// BEGIN GENERATED CODE
	}

} //ComponentInstantiationTest
