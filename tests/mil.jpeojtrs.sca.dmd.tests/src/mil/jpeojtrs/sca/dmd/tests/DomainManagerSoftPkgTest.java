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
package mil.jpeojtrs.sca.dmd.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dmd.DomainManagerConfiguration;
import mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg;
import mil.jpeojtrs.sca.spd.SoftPkg;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Domain Manager Soft Pkg</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#getSoftPkg() <em>Soft Pkg</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DomainManagerSoftPkgTest extends TestCase {

	/**
	 * The fixture for this Domain Manager Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManagerSoftPkg fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainManagerSoftPkgTest.class);
	}

	/**
	 * Constructs a new Domain Manager Soft Pkg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainManagerSoftPkgTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Domain Manager Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DomainManagerSoftPkg fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Domain Manager Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManagerSoftPkg getFixture() {
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
		final DomainManagerConfiguration conf = DmdTests.getDomainManagerConfiguration();
		this.setFixture(conf.getDomainManagerSoftPkg());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#getSoftPkg() <em>Soft Pkg</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#getSoftPkg()
	 * @generated NOT
	 */
	public void testGetSoftPkg() {
		// END GENERATED CODE
		Assert.assertNotNull(this.getFixture().getSoftPkg());
		Assert.assertEquals("DCE:82f6515a-de05-47f0-8e7a-1c9f621c00ee", this.getFixture().getSoftPkg().getId());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#setSoftPkg(mil.jpeojtrs.sca.spd.SoftPkg) <em>Soft Pkg</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg#setSoftPkg(mil.jpeojtrs.sca.spd.SoftPkg)
	 * @generated NOT
	 */
	public void testSetSoftPkg() {
		// END GENERATED CODE
		SoftPkg spd = getFixture().getSoftPkg();
		Assert.assertNotNull(this.getFixture().getSoftPkg());
		Assert.assertEquals("DCE:82f6515a-de05-47f0-8e7a-1c9f621c00ee", this.getFixture().getSoftPkg().getId());
		getFixture().setSoftPkg(null);
		Assert.assertNull(getFixture().getSoftPkg());
		Assert.assertNull(getFixture().getLocalFile());
		getFixture().setSoftPkg(spd);
		Assert.assertNotNull(this.getFixture().getSoftPkg());
		Assert.assertNotNull(getFixture().getLocalFile());
		Assert.assertEquals("DCE:82f6515a-de05-47f0-8e7a-1c9f621c00ee", this.getFixture().getSoftPkg().getId());
		// END GENERATED CODE
	}

} // DomainManagerSoftPkgTest
