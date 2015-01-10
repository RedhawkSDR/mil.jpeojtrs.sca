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

import org.junit.Assert;
import junit.framework.TestCase;
import mil.jpeojtrs.sca.partitioning.ComponentPlacement;
import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.spd.SpdPackage;
import mil.jpeojtrs.sca.util.ScaEcoreUtils;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getName() <em>Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ComponentPlacementTest extends TestCase {

	/**
	 * The fixture for this Component Placement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPlacement< ? > fixture = null;

	/**
	 * Constructs a new Component Placement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPlacementTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Placement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentPlacement< ? > fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Placement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPlacement< ? > getFixture() {
		return fixture;
	}

	private static final EStructuralFeature[] NAME_PATH = { PartitioningPackage.Literals.COMPONENT_PLACEMENT__COMPONENT_FILE_REF,
		PartitioningPackage.Literals.COMPONENT_FILE_REF__FILE, PartitioningPackage.Literals.COMPONENT_FILE__SOFT_PKG, SpdPackage.Literals.SOFT_PKG__NAME };

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentPlacement#getName() <em>Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentPlacement#getName()
	 * @generated NOT
	 */
	public void testGetName() {
		// END GENERATED CODE
		final String name = ScaEcoreUtils.getFeature(getFixture(), ComponentPlacementTest.NAME_PATH);
		Assert.assertEquals(name, getFixture().getName());
		// BEGIN GENERATED CODE
	}

} //ComponentPlacementTest
