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
package mil.jpeojtrs.sca.dcd.tests;

import java.net.URL;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dcd.DeviceConfiguration;
import mil.jpeojtrs.sca.util.SdrURIHandler;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>dcd</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DcdTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new DcdTests("dcd Tests");
		suite.addTestSuite(DcdComponentPlacementTest.class);
		suite.addTestSuite(DcdComponentInstantiationTest.class);
		suite.addTestSuite(DcdPartitioningTest.class);
		suite.addTestSuite(DcdComponentInstantiationRefTest.class);
		suite.addTestSuite(DcdConnectInterfaceTest.class);
		suite.addTestSuite(CompositePartOfDeviceTest.class);
		suite.addTestSuite(DcdDocumentRootTest.class);
		suite.addTestSuite(DeployOnDeviceTest.class);
		suite.addTestSuite(DeviceManagerSoftPkgTest.class);
		suite.addTestSuite(DevicePkgFileTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcdTests(String name) {
		super(name);
	}
	
	public static DeviceConfiguration getDeviceConfiguration()  throws Exception {
		URI uri = URI.createURI("sdrDev:///nodes/defaultNode/defaultNode.dcd.xml");
		ResourceSet resourceSet = new ResourceSetImpl();
		URL url = FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.dcd.tests"), new Path("sdr"), null);
		SdrURIHandler handler = new SdrURIHandler(URI.createURI(url.toURI().toString()));
		resourceSet.getURIConverter().getURIHandlers().add(0, handler);
		Resource resource = resourceSet.getResource(uri, true);
		return DeviceConfiguration.Util.getDeviceConfiguration(resource);
	}


} //DcdTests
