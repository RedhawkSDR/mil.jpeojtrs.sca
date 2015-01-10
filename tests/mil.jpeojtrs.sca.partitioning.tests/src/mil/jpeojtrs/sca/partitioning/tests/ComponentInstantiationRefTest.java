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
import mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Instantiation Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getInstantiation() <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ComponentInstantiationRefTest extends TestCase {

	/**
	 * The fixture for this Component Instantiation Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstantiationRef< ? > fixture = null;

	/**
	 * Constructs a new Component Instantiation Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiationRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Instantiation Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentInstantiationRef< ? > fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Instantiation Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstantiationRef< ? > getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getInstantiation() <em>Instantiation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#getInstantiation()
	 * @generated NOT
	 */
	public void testGetInstantiation() {
		// END GENERATED CODE
		Assert.assertEquals(getFixture().getRefid() != null, getFixture().getInstantiation() != null);
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#setInstantiation(mil.jpeojtrs.sca.partitioning.ComponentInstantiation) <em>Instantiation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentInstantiationRef#setInstantiation(mil.jpeojtrs.sca.partitioning.ComponentInstantiation)
	 * @generated NOT
	 */
	public void testSetInstantiation() {
		// END GENERATED CODE
		getFixture().setInstantiation(null);
		Assert.assertNull(getFixture().getInstantiation());
		Assert.assertNull(getFixture().getRefid());
		// END GENERATED CODE
	}

} //ComponentInstantiationRefTest
