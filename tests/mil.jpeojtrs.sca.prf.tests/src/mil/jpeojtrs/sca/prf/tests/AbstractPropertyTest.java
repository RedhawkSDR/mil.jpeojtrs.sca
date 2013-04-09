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
package mil.jpeojtrs.sca.prf.tests;

import junit.framework.TestCase;
import mil.jpeojtrs.sca.prf.AbstractProperty;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;

import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractProperty#getMode() <em>Mode</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.AbstractProperty#toAny() <em>To Any</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AbstractPropertyTest extends TestCase {

	/**
	 * The fixture for this Abstract Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractProperty fixture = null;

	/**
	 * Constructs a new Abstract Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractProperty fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractProperty getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#getMode() <em>Mode</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#getMode()
	 * @generated NOT
	 */
	public void testGetMode() {
		// END GENERATED CODE
		AbstractProperty root = getFixture();
		while (root.eContainer() instanceof AbstractProperty) {
			root = (AbstractProperty) root.eContainer();
		}
		Assert.assertEquals(root.getLocalMode(), getFixture().getMode());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#setMode(mil.jpeojtrs.sca.prf.AccessType) <em>Mode</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#setMode(mil.jpeojtrs.sca.prf.AccessType)
	 * @generated NOT
	 */
	public void testSetMode() {
		// END GENERATED CODE
		AbstractProperty root = getFixture();
		while (root.eContainer() instanceof AbstractProperty) {
			root = (AbstractProperty) root.eContainer();
		}
		getFixture().setMode(AccessType.WRITEONLY);
		Assert.assertEquals(root.getLocalMode(), getFixture().getMode());
		getFixture().setMode(AccessType.READONLY);
		Assert.assertEquals(root.getLocalMode(), getFixture().getMode());
		// END GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#unsetMode() <em>unsetMode()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#unsetMode()
	 * @generated NOT
	 */
	public void testUnsetMode() {
		// END GENERATED CODE
		getFixture().setMode(AccessType.WRITEONLY);
		getFixture().getMode();
		getFixture().unsetMode();
		Assert.assertEquals(AccessType.READWRITE, getFixture().getMode());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#isSetMode() <em>isSetMode()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#isSetMode()
	 * @generated NOT
	 */
	public void testIsSetMode() {
		// END GENERATED CODE
		AbstractProperty root = getFixture();
		while (root.eContainer() instanceof AbstractProperty) {
			root = (AbstractProperty) root.eContainer();
		}
		Assert.assertEquals(root.isSetLocalMode(), getFixture().isSetMode());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#isKind(mil.jpeojtrs.sca.prf.PropertyConfigurationType) <em>Is Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#isKind(mil.jpeojtrs.sca.prf.PropertyConfigurationType)
	 * @generated NOT
	 */
	public void testIsKind__PropertyConfigurationType() {
		// END GENERATED CODE
		Assert.assertFalse(getFixture().isKind((PropertyConfigurationType[]) null));
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.AbstractProperty#toAny() <em>To Any</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.AbstractProperty#toAny()
	 * @generated NOT
	 */
	public void testToAny() {
		// END GENERATED CODE
		Assert.assertNotNull(getFixture().toAny());
		// BEGIN GENERATED CODE
	}

} //AbstractPropertyTest
