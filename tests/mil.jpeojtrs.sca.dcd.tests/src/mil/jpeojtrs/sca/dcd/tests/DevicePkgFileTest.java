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
package mil.jpeojtrs.sca.dcd.tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.dcd.DevicePkgFile;
import mil.jpeojtrs.sca.dpd.DevicePkg;
import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Device Pkg File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getDevicePkg() <em>Device Pkg</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DevicePkgFileTest extends TestCase {

	/**
	 * The fixture for this Device Pkg File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePkgFile fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevicePkgFileTest.class);
	}

	/**
	 * Constructs a new Device Pkg File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevicePkgFileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Device Pkg File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DevicePkgFile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Device Pkg File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicePkgFile getFixture() {
		return fixture;
	}

	private DeviceConfiguration dcd;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.dcd = DcdTests.getDeviceConfiguration();
		this.setFixture(this.dcd.getPartitioning().getComponentPlacement().get(2).getDevicePkgFile());
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
	 * Tests the '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#getDevicePkg() <em>Device Pkg</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.DevicePkgFile#getDevicePkg()
	 * @generated NOT
	 */
	public void testGetDevicePkg() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture.getDevicePkg());
		Assert.assertEquals("DCE:6ea73b3b-3d9e-4dae-a86e-5d8a079e5db2", this.fixture.getDevicePkg().getId());
		Assert.assertEquals("Test Device Package File", this.fixture.getDevicePkg().getDescription());
		Assert.assertEquals("Device", this.fixture.getDevicePkg().getName());
		Assert.assertEquals("", this.fixture.getDevicePkg().getTitle());
		Assert.assertEquals("Test", this.fixture.getDevicePkg().getAuthor().get(0).getName().get(0));
		Assert.assertEquals("DCE:ddb3bfc4-dd17-4a26-97d8-926d98bdc84b", this.fixture.getDevicePkg().getHwDeviceRegistration().getId());
		// This isn't declared in the interface
		//Assert.assertEquals("device", this.fixture.getDevicePkg().getType())

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dcd.DevicePkgFile#setDevicePkg(mil.jpeojtrs.sca.dpd.DevicePkg) <em>Device Pkg</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.dcd.DevicePkgFile#setDevicePkg(mil.jpeojtrs.sca.dpd.DevicePkg)
	 * @generated NOT
	 */
	public void testSetDevicePkg() {
		// END GENERATED CODE
		final DevicePkg devPkg = this.fixture.getDevicePkg();
		devPkg.setName("New name");
		fixture.setDevicePkg(devPkg);
		Assert.assertEquals("New name", this.fixture.getDevicePkg().getName());

		// END GENERATED CODE
	}

	public void testParse() throws Exception {
		Assert.assertNotNull(this.getFixture());
		Assert.assertNotNull(this.getFixture().getLocalFile());
		Assert.assertNotNull(this.getFixture().getDevicePkg());
		Assert.assertEquals("devPkg.dpd.xml", this.getFixture().getLocalFile().getName());
		Assert.assertFalse("".equals(this.getFixture().toString()));
	}

	public void testOther() throws Exception {
		// Set to another localfile first
		final LocalFile localFile = PartitioningFactory.eINSTANCE.createLocalFile();
		localFile.setName("/nodes/defaultNode/devPkg2.dpd.xml");
		getFixture().setLocalFile(localFile);
		Assert.assertNotNull(this.getFixture().getDevicePkg());

		final DevicePkg oldDP = this.getFixture().getDevicePkg();
		getFixture().getLocalFile().setName(null);
		Assert.assertNull(this.getFixture().getDevicePkg());
		getFixture().setDevicePkg(oldDP);

		getFixture().setLocalFile(null);
		Assert.assertNull(this.getFixture().getDevicePkg());
		
		getFixture().setDevicePkg(oldDP);
		Assert.assertNotNull(this.getFixture().getDevicePkg());
		Assert.assertTrue(this.getFixture().getLocalFile().getName(), this.getFixture().getLocalFile().getName().endsWith("devPkg2.dpd.xml"));

	}
} //DevicePkgFileTest
