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
 // BEGIN GENERATED CODE
package mil.jpeojtrs.sca.prf.tests;

import junit.framework.TestCase;
import mil.jpeojtrs.sca.prf.AbstractPropertyRef;

import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Property Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#getProperty() <em>Property</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#toAny() <em>To Any</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AbstractPropertyRefTest extends TestCase {

	/**
	 * The fixture for this Abstract Property Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPropertyRef<?> fixture = null;

	/**
	 * Constructs a new Abstract Property Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract Property Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractPropertyRef<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract Property Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPropertyRef<?> getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#getProperty() <em>Property</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractPropertyRef#getProperty()
	 * @generated NOT
	 */
	public void testGetProperty() {
		// END GENERATED CODE
		Assert.assertNotNull(getFixture().getProperty());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#setProperty(mil.jpeojtrs.sca.prf.AbstractProperty) <em>Property</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractPropertyRef#setProperty(mil.jpeojtrs.sca.prf.AbstractProperty)
	 * @generated NOT
	 */
	public void testSetProperty() {
		// END GENERATED CODE
		getFixture().setProperty(null);
		Assert.assertNull(getFixture().getProperty());
		// END GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractPropertyRef#toAny() <em>To Any</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractPropertyRef#toAny()
	 * @generated NOT
	 */
	public void testToAny() {
		// END GENERATED CODE
		Assert.assertNotNull(getFixture().toAny());
		// BEGIN GENERATED CODE
	}

} //AbstractPropertyRefTest
