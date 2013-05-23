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
package mil.jpeojtrs.sca.dpd.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dpd.DeviceClass;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.dpd.DpdFactory;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;
import mil.jpeojtrs.sca.dpd.LocalFile;
import mil.jpeojtrs.sca.dpd.PropertyFile;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hw Device Registration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwDeviceRegistrationTest extends TestCase {

	/**
	 * The fixture for this Hw Device Registration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDeviceRegistration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HwDeviceRegistrationTest.class);
	}

	/**
	 * Constructs a new Hw Device Registration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDeviceRegistrationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hw Device Registration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HwDeviceRegistration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hw Device Registration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwDeviceRegistration getFixture() {
		return fixture;
	}

	private ResourceSetImpl resourceSet;
	private DevicePkg devPkg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DpdFactory.eINSTANCE.createHwDeviceRegistration());
		this.resourceSet = new ResourceSetImpl();
		this.devPkg = DevicePkg.Util.getDevicePkg(this.resourceSet.getResource(DpdTests.getURI("testFiles/defaultDevice.dpd.xml"), true));
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
		this.resourceSet = null;
		this.devPkg = null;
	}

	public void testParse() throws Exception {
		final HwDeviceRegistration devReg = this.devPkg.getHwDeviceRegistration();

		Assert.assertNotNull(devReg);
		Assert.assertNotNull(devReg.getId());
		Assert.assertNotNull(devReg.getName());
		Assert.assertNotNull(devReg.getVersion());

		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90cdd9", devReg.getId());
		Assert.assertEquals("Test Device Registration", devReg.getName());
		Assert.assertEquals("1,0,0,0", devReg.getVersion());

		Assert.assertNotNull(devReg.getDescription());
		Assert.assertNotNull(devReg.getManufacturer());
		Assert.assertNotNull(devReg.getModelNumber());

		Assert.assertEquals("HW Device Registration Test Description", devReg.getDescription());
		Assert.assertEquals("TestManufacturer", devReg.getManufacturer());
		Assert.assertEquals("1", devReg.getModelNumber());

		Assert.assertNotNull(devReg.getDeviceClass());
		Assert.assertEquals("Device Class 1", devReg.getDeviceClass().getClass_().get(0));

		// Check the child devices
		Assert.assertTrue(devReg.getChildHwDevice().size() == 3);
		Assert.assertNull(devReg.getChildHwDevice().get(0).getHwDeviceRegistration());
		Assert.assertNull(devReg.getChildHwDevice().get(1).getDevicePkgRef());
		Assert.assertNull(devReg.getChildHwDevice().get(2).getHwDeviceRegistration());
		Assert.assertNotNull(devReg.getChildHwDevice().get(0).getDevicePkgRef());
		Assert.assertNotNull(devReg.getChildHwDevice().get(1).getHwDeviceRegistration());
		Assert.assertNotNull(devReg.getChildHwDevice().get(2).getDevicePkgRef());
	}
	
	public void testChanges() {
		final HwDeviceRegistration devReg = this.devPkg.getHwDeviceRegistration();
		
		LocalFile lf = DpdFactory.eINSTANCE.createLocalFile();
		lf.setName("testFile.prf.xml");
		
		PropertyFile file = DpdFactory.eINSTANCE.createPropertyFile();
		file.setType("PRF");
		file.setLocalFile(lf);
		
		devReg.setPropertyFile(file);
		
		Assert.assertEquals("testFile.prf.xml", devReg.getPropertyFile().getLocalFile().getName());

		// change device Class
		
		DeviceClass newClass = DpdFactory.eINSTANCE.createDeviceClass();
		newClass.getClass_().add("NewDeviceClass1");
		newClass.getClass_().add("NewDeviceClass2");
		
		devReg.setDeviceClass(newClass);
		
		Assert.assertTrue(devReg.getDeviceClass().getClass_().size() == 2);
		Assert.assertEquals("NewDeviceClass1", devReg.getDeviceClass().getClass_().get(0));
		Assert.assertEquals("NewDeviceClass2", devReg.getDeviceClass().getClass_().get(1));
	}

} //HwDeviceRegistrationTest
