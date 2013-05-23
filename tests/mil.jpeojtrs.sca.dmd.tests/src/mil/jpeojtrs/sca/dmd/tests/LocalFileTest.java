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
import mil.jpeojtrs.sca.dmd.LocalFile;

import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Local File</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class LocalFileTest extends TestCase {

	/**
	 * The fixture for this Local File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalFile fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalFileTest.class);
	}

	/**
	 * Constructs a new Local File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Local File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LocalFile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Local File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalFile getFixture() {
		return fixture;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DmdFactory.eINSTANCE.createLocalFile());
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
		final DomainManagerConfiguration domainMgrConfig = DmdTests.getTestFileDomainManagerConfiguration();
		final LocalFile localFile = domainMgrConfig.getDomainManagerSoftPkg().getLocalFile();
		Assert.assertNotNull(localFile);
		Assert.assertEquals("/mgr/DomainManager.spd.xml", localFile.getName());
	}

} // LocalFileTest
