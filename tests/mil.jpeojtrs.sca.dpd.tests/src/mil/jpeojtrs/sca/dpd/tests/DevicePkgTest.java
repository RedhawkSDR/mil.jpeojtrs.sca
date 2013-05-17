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
package mil.jpeojtrs.sca.dpd.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.dpd.DpdFactory;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device Pkg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevicePkgTest extends TestCase {

	/**
	 * The fixture for this Device Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePkg fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevicePkgTest.class);
	}

	/**
	 * Constructs a new Device Pkg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePkgTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Device Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DevicePkg fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Device Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePkg getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.resourceSet = new ResourceSetImpl();
		setFixture(DevicePkg.Util.getDevicePkg(this.resourceSet.getResource(DpdTests.getURI("testFiles/defaultDevice.dpd.xml"), true)));
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
		this.resourceSet = null;
	}

	public void testParse() throws Exception {
		final DevicePkg devPkg = this.getFixture();

		Assert.assertNotNull(devPkg.getHwDeviceRegistration());
		Assert.assertNotNull(devPkg.getId());
		Assert.assertNotNull(devPkg.getName());
		Assert.assertNotNull(devPkg.getVersion());
		Assert.assertNotNull(devPkg.getAuthor());
		Assert.assertNotNull(devPkg.getDescription());
		Assert.assertNotNull(devPkg.getTitle());

		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90cdd8", devPkg.getId());
		Assert.assertEquals("defaultDevice", devPkg.getName());
		Assert.assertEquals("1,0,0,0", devPkg.getVersion());
		Assert.assertEquals("Default Test Case DPD file", devPkg.getDescription());
		Assert.assertEquals("Default Test Case", devPkg.getTitle());

		Assert.assertEquals("TestCompany", devPkg.getAuthor().get(0).getCompany());
		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90cdd9", devPkg.getHwDeviceRegistration().getId());
	}
	
	public void testChange() {
		final DevicePkg devPkg = this.getFixture();
		
		HwDeviceRegistration hwdr = DpdFactory.eINSTANCE.createHwDeviceRegistration();
		hwdr.setDescription("Test HWDR");
		hwdr.setId("Frank");
		hwdr.setManufacturer("TestManufacturer");
		hwdr.setModelNumber("42");
		hwdr.setName("Test");
		
		devPkg.setHwDeviceRegistration(hwdr);
		
		Assert.assertEquals("42", devPkg.getHwDeviceRegistration().getModelNumber());
	}

} //DevicePkgTest
