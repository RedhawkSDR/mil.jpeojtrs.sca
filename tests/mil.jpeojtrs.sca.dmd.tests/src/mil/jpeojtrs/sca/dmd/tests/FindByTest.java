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
package mil.jpeojtrs.sca.dmd.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dmd.DmdFactory;
import mil.jpeojtrs.sca.dmd.DomainManagerConfiguration;
import mil.jpeojtrs.sca.dmd.FindBy;

import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Find By</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FindByTest extends TestCase {

	/**
	 * The fixture for this Find By test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindBy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FindByTest.class);
	}

	/**
	 * Constructs a new Find By test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindByTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Find By test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FindBy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Find By test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindBy getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DmdFactory.eINSTANCE.createFindBy());
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
	}

	public void testParse() throws Exception {
		final DomainManagerConfiguration domainMgrConfig = DmdTests.getDomainManagerConfiguration();
		final FindBy findBy = domainMgrConfig.getServices().getService().get(0).getFindBy();
		Assert.assertNotNull(findBy);
	}

} //FindByTest
