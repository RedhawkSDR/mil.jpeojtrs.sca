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
import mil.jpeojtrs.sca.partitioning.ConnectInterface;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connect Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getSource() <em>Source</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getTarget() <em>Target</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ConnectInterfaceTest extends TestCase {

	/**
	 * The fixture for this Connect Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectInterface<?, ?, ?> fixture = null;

	/**
	 * Constructs a new Connect Interface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectInterfaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Connect Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConnectInterface<?, ?, ?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Connect Interface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectInterface<?, ?, ?> getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getSource() <em>Source</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getSource()
	 * @generated NOT
	 */
	public void testGetSource() {
		// END GENERATED CODE
		Assert.assertEquals(getFixture().getUsesPort() != null, getFixture().getSource() != null);
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#setSource(mil.jpeojtrs.sca.partitioning.UsesPortStub) <em>Source</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#setSource(mil.jpeojtrs.sca.partitioning.UsesPortStub)
	 * @generated NOT
	 */
	public void testSetSource() {
		// END GENERATED CODE
		getFixture().setSource(null);
		Assert.assertNull(getFixture().getUsesPort());
		// END GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#getTarget() <em>Target</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#getTarget()
	 * @generated NOT
	 */
	public void testGetTarget() {
		// END GENERATED CODE
		final boolean hasTarget = getFixture().getProvidesPort() != null || getFixture().getFindBy() != null
		        || getFixture().getComponentSupportedInterface() != null;
		Assert.assertEquals(hasTarget, getFixture().getTarget() != null);
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ConnectInterface#setTarget(mil.jpeojtrs.sca.partitioning.ConnectionTarget) <em>Target</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ConnectInterface#setTarget(mil.jpeojtrs.sca.partitioning.ConnectionTarget)
	 * @generated NOT
	 */
	public void testSetTarget() {
		// END GENERATED CODE
		getFixture().setTarget(null);
		Assert.assertNull(getFixture().getFindBy());
		Assert.assertNull(getFixture().getProvidesPort());
		Assert.assertNull(getFixture().getComponentSupportedInterface());
		// END GENERATED CODE
	}

} //ConnectInterfaceTest
