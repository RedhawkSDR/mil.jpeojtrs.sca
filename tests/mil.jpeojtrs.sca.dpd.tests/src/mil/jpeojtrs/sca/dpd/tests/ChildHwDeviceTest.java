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
import mil.jpeojtrs.sca.dpd.ChildHwDevice;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.dpd.DevicePkgRef;
import mil.jpeojtrs.sca.dpd.DpdFactory;
import mil.jpeojtrs.sca.dpd.HwDeviceRegistration;
import mil.jpeojtrs.sca.dpd.LocalFile;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Child Hw Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChildHwDeviceTest extends TestCase {

	/**
	 * The fixture for this Child Hw Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildHwDevice fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChildHwDeviceTest.class);
	}

	/**
	 * Constructs a new Child Hw Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildHwDeviceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Child Hw Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ChildHwDevice fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Child Hw Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildHwDevice getFixture() {
		return fixture;
	}

	private HwDeviceRegistration hdReg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DpdFactory.eINSTANCE.createChildHwDevice());
		final ResourceSet resourceSet = new ResourceSetImpl();
		final DevicePkg devPkg = DevicePkg.Util.getDevicePkg(resourceSet.getResource(DpdTests.getURI("testFiles/defaultDevice.dpd.xml"), true));
		this.hdReg = devPkg.getHwDeviceRegistration();
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
		this.hdReg = null;
	}

	public void testParse() throws Exception {
		// Test Child 1
		ChildHwDevice childDev = this.hdReg.getChildHwDevice().get(0);
		Assert.assertNotNull(childDev);

		DevicePkgRef devPkgRef = childDev.getDevicePkgRef();
		HwDeviceRegistration hwDev = childDev.getHwDeviceRegistration();

		Assert.assertTrue((devPkgRef != null && hwDev == null));
		if (devPkgRef == null) {
			throw new NullPointerException();
		}
		Assert.assertEquals("simpleChildDevice.dpd.xml", devPkgRef.getLocalFile().getName());

		// Test Child 2
		childDev = this.hdReg.getChildHwDevice().get(1);
		Assert.assertNotNull(childDev);

		devPkgRef = childDev.getDevicePkgRef();
		hwDev = childDev.getHwDeviceRegistration();

		Assert.assertTrue((devPkgRef == null && hwDev != null));
		if (hwDev == null) {
			throw new NullPointerException();
		}
		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90cdda", hwDev.getId());

		// Test Child 3
		childDev = this.hdReg.getChildHwDevice().get(2);
		Assert.assertNotNull(childDev);

		devPkgRef = childDev.getDevicePkgRef();
		hwDev = childDev.getHwDeviceRegistration();

		Assert.assertTrue((devPkgRef != null && hwDev == null));
		if (devPkgRef == null) {
			throw new NullPointerException();
		}
		Assert.assertEquals("complexChildDevice.dpd.xml", devPkgRef.getLocalFile().getName());
	}

	public void testDeviceRegistration() throws Exception {
		final ChildHwDevice childDev = this.hdReg.getChildHwDevice().get(1);
		Assert.assertNotNull(childDev);
		Assert.assertNotNull(childDev.getHwDeviceRegistration());
		
		HwDeviceRegistration hwdr = DpdFactory.eINSTANCE.createHwDeviceRegistration();
		hwdr.setDescription("Test HWDR");
		hwdr.setId("Frank");
		hwdr.setManufacturer("TestManufacturer");
		hwdr.setModelNumber("42");
		hwdr.setName("Test");

		childDev.setHwDeviceRegistration(hwdr);

		Assert.assertEquals("42", childDev.getHwDeviceRegistration().getModelNumber());
	}

	public void testDeviceRef() throws Exception {
		final ChildHwDevice childDev = this.hdReg.getChildHwDevice().get(0);
		Assert.assertNotNull(childDev);
		Assert.assertNotNull(childDev.getDevicePkgRef());
		
		LocalFile lf = DpdFactory.eINSTANCE.createLocalFile();
		lf.setName("TestDPR.dpd.xml");
		
		DevicePkgRef dpr = DpdFactory.eINSTANCE.createDevicePkgRef();
		dpr.setType("DPD");
		dpr.setLocalFile(lf);
		
		childDev.setDevicePkgRef(dpr);
		
		Assert.assertEquals("TestDPR.dpd.xml", childDev.getDevicePkgRef().getLocalFile().getName());
		Assert.assertEquals("DPD", childDev.getDevicePkgRef().getType());
	}

} //ChildHwDeviceTest
