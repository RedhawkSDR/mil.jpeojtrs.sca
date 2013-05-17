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
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.partitioning.ComponentFileRef;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component File Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#getFile() <em>File</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ComponentFileRefTest extends TestCase {

	/**
	 * The fixture for this Component File Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFileRef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentFileRefTest.class);
	}

	/**
	 * Constructs a new Component File Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFileRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component File Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentFileRef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component File Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFileRef getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartitioningFactory.eINSTANCE.createComponentFileRef());
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

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#getFile() <em>File</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFileRef#getFile()
	 * @generated NOT
	 */
	public void testGetFile() {
		// END GENERATED CODE
		Assert.assertEquals(getFixture().getRefid() != null, getFixture().getFile() != null);
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.partitioning.ComponentFileRef#setFile(mil.jpeojtrs.sca.partitioning.ComponentFile) <em>File</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.partitioning.ComponentFileRef#setFile(mil.jpeojtrs.sca.partitioning.ComponentFile)
	 * @generated NOT
	 */
	public void testSetFile() {
		// END GENERATED CODE
		getFixture().setFile(null);
		Assert.assertNull(getFixture().getRefid());
		// END GENERATED CODE
	}

} //ComponentFileRefTest
