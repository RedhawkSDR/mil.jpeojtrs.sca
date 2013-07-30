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

import junit.framework.Assert;
import junit.framework.TestCase;
import mil.jpeojtrs.sca.partitioning.ComponentFile;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getSoftPkg() <em>Soft Pkg</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ComponentFileTest extends TestCase {

	/**
	 * The fixture for this Component File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFile fixture = null;

	/**
	 * Constructs a new Component File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentFile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFile getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#getSoftPkg() <em>Soft Pkg</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFile#getSoftPkg()
	 * @generated NOT
	 */
	public void testGetSoftPkg() {
		// END GENERATED CODE
		Assert.assertEquals(this.getFixture().getLocalFile() != null, this.getFixture().getSoftPkg() != null);
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentFile#setSoftPkg(mil.jpeojtrs.sca.spd.SoftPkg) <em>Soft Pkg</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFile#setSoftPkg(mil.jpeojtrs.sca.spd.SoftPkg)
	 * @generated NOT
	 */
	public void testSetSoftPkg() {
		// END GENERATED CODE
		this.getFixture().setSoftPkg(null);
		Assert.assertNull(this.getFixture().getLocalFile());
		// END GENERATED CODE
	}

} //ComponentFileTest
