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

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Device Pkg Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevicePkgRefTest extends TestCase {

	/**
	 * The fixture for this Device Pkg Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePkgRef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevicePkgRefTest.class);
	}

	/**
	 * Constructs a new Device Pkg Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePkgRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Device Pkg Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DevicePkgRef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Device Pkg Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePkgRef getFixture() {
		return fixture;
	}

	private ResourceSetImpl resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.resourceSet = new ResourceSetImpl();
		final DevicePkg devPkg = DevicePkg.Util.getDevicePkg(this.resourceSet.getResource(DpdTests.getURI("testFiles/defaultDevice.dpd.xml"), true));
		final HwDeviceRegistration hdr = devPkg.getHwDeviceRegistration();
		final ChildHwDevice childDev = hdr.getChildHwDevice().get(2);

		setFixture(childDev.getDevicePkgRef());
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
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dpd.DevicePkgRef#getDevicePkg() <em>Device Pkg</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.DevicePkgRef#getDevicePkg()
	 * @generated NOT
	 */
	public void testGetDevicePkg() {
		// END GENERATED CODE
		
		
		// PASS
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dpd.DevicePkgRef#setDevicePkg(mil.jpeojtrs.sca.dpd.DevicePkg) <em>Device Pkg</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dpd.DevicePkgRef#setDevicePkg(mil.jpeojtrs.sca.dpd.DevicePkg)
	 * @generated NOT
	 */
	public void testSetDevicePkg() {
		// END GENERATED CODE
		// PASS
		// END GENERATED CODE
	}

	public void testParse() throws Exception {
		final DevicePkgRef dpr = this.getFixture();

		Assert.assertNotNull(dpr);
		Assert.assertNotNull(dpr.getLocalFile());
		Assert.assertEquals("complexChildDevice.dpd.xml", dpr.getLocalFile().getName());
		Assert.assertEquals("DPD", dpr.getType());
	}
	
	public void testChange() throws Exception {
		final DevicePkgRef dpr = this.getFixture();

		LocalFile lf = DpdFactory.eINSTANCE.createLocalFile();
		lf.setName("testDPR.dpd.xml");
		
		dpr.setLocalFile(lf);
		
		Assert.assertNotNull(dpr.getLocalFile());
		Assert.assertEquals("testDPR.dpd.xml", dpr.getLocalFile().getName());
	}

} //DevicePkgRefTest
