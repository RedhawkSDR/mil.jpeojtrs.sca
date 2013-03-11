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

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dmd.DmdFactory;
import mil.jpeojtrs.sca.dmd.DomainManagerConfiguration;
import mil.jpeojtrs.sca.dmd.DomainManagerSoftPkg;

import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Domain Manager Configuration</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class DomainManagerConfigurationTest extends TestCase {

	/**
	 * The fixture for this Domain Manager Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManagerConfiguration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainManagerConfigurationTest.class);
	}

	/**
	 * Constructs a new Domain Manager Configuration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainManagerConfigurationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Domain Manager Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DomainManagerConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Domain Manager Configuration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainManagerConfiguration getFixture() {
		return fixture;
	}

	private DomainManagerConfiguration domainConfiguration;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.domainConfiguration = DmdTests.getDomainManagerConfiguration();
		this.setFixture(this.domainConfiguration);
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

	public void testParse() throws Exception {
		final DomainManagerConfiguration domainMgrConfig = DmdTests.getTestFileDomainManagerConfiguration();
		Assert.assertNotNull(domainMgrConfig);
		Assert.assertEquals("DCE:eaa4c06b-7291-4139-9dac-1b24141e3698", domainMgrConfig.getId());
		Assert.assertEquals("testDomain", domainMgrConfig.getName());
		Assert.assertEquals("My Test Domain", domainMgrConfig.getDescription());
	}

	public void testSet() throws Exception {
		getFixture().setServices(null);
		Assert.assertNull(getFixture().getServices());

		final DomainManagerSoftPkg dmsp = DmdFactory.eINSTANCE.createDomainManagerSoftPkg();
		dmsp.setLocalFile(DmdFactory.eINSTANCE.createLocalFile());
		dmsp.getLocalFile().setName("DomainManager2.spd.xml");
		getFixture().setDomainManagerSoftPkg(dmsp);
		Assert.assertEquals("DomainManager2.spd.xml", getFixture().getDomainManagerSoftPkg().getLocalFile().getName());
	}

} // DomainManagerConfigurationTest
