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

import java.io.IOException;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg;
import mil.jpeojtrs.sca.partitioning.LocalFile;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.spd.SoftPkg;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Device Manager Soft Pkg</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getSoftPkg() <em>Soft Pkg</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DeviceManagerSoftPkgTest extends TestCase {

	/**
	 * The fixture for this Device Manager Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagerSoftPkg fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeviceManagerSoftPkgTest.class);
	}

	/**
	 * Constructs a new Device Manager Soft Pkg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceManagerSoftPkgTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Device Manager Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeviceManagerSoftPkg fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Device Manager Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceManagerSoftPkg getFixture() {
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
		final DeviceConfiguration conf = DcdTests.getDeviceConfiguration();
		this.setFixture(conf.getDeviceManagerSoftPkg());
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
		Assert.assertNotNull(this.getFixture());
		Assert.assertNotNull(this.getFixture().getLocalFile());
		Assert.assertEquals("/mgr/DeviceManager.spd.xml", this.getFixture().getLocalFile().getName());
		Assert.assertFalse("".equals(this.getFixture().toString()));
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getSoftPkg()
	 * <em>Soft Pkg</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#getSoftPkg()
	 * @generated NOT
	 */
	public void testGetSoftPkg() {
		// END GENERATED CODE

		Assert.assertNotNull(this.getFixture().getSoftPkg());
		Assert.assertEquals("DCE:82f6515a-de05-47f0-8e7a-1c9f621c00ee", this.getFixture().getSoftPkg().getId());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '
	 * {@link mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#setSoftPkg(mil.jpeojtrs.sca.spd.SoftPkg)
	 * <em>Soft Pkg</em>}' feature setter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @throws IOException 
	 * 
	 * @see mil.jpeojtrs.sca.dcd.DeviceManagerSoftPkg#setSoftPkg(mil.jpeojtrs.sca.spd.SoftPkg)
	 * @generated NOT
	 */
	public void testSetSoftPkg() throws IOException {
		// END GENERATED CODE
		ResourceSet resourceSet = fixture.eResource().getResourceSet();
		URI uri = URI.createURI("sdrDev:///mgr/DeviceManager2.spd.xml");
		final Resource resource = resourceSet.getResource(uri, true); 

		final SoftPkg spd = SoftPkg.Util.getSoftPkg(resource);

		getFixture().setSoftPkg(spd);
		Assert.assertNotNull(this.getFixture().getSoftPkg());
		Assert.assertEquals("TestDeviceManager", this.getFixture().getSoftPkg().getName());

		String lf = this.getFixture().getLocalFile().getName();
		lf = lf.substring(1);
		getFixture().getLocalFile().setName(lf);

		//Using a relative path here should NOT work
		Assert.assertNull(this.getFixture().getSoftPkg());

		// Set to another localfile first
		final LocalFile localFile = PartitioningFactory.eINSTANCE.createLocalFile();
		localFile.setName("/mgr/DeviceManager.spd.xml");
		getFixture().setLocalFile(localFile);
		Assert.assertNotNull(this.getFixture().getSoftPkg());

		final SoftPkg oldSP = this.getFixture().getSoftPkg();

		getFixture().getLocalFile().setName(null);
		Assert.assertNull(this.getFixture().getSoftPkg());

		getFixture().setLocalFile(null);
		getFixture().setSoftPkg(oldSP);
		Assert.assertNotNull(this.getFixture().getSoftPkg());
		Assert.assertTrue(this.getFixture().getLocalFile().getName().endsWith("/mgr/DeviceManager.spd.xml"));
		// END GENERATED CODE
	}

} //DeviceManagerSoftPkgTest
