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
package mil.jpeojtrs.sca.sad.tests;

import java.io.IOException;
import java.net.URL;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sad</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SadTests extends TestSuite {

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
	 * @generated NOT
	 */
	public static Test suite() {
		final TestSuite suite = new SadTests("sad Tests");
		suite.addTestSuite(SadComponentInstantiationTest.class);
		suite.addTestSuite(SadComponentInstantiationRefTest.class);
		suite.addTestSuite(SadConnectInterfaceTest.class);
		suite.addTestSuite(SadPartitioningTest.class);
		suite.addTestSuite(SadComponentPlacementTest.class);
		suite.addTestSuite(ResourceFactoryPropertiesTest.class);
		suite.addTestSuite(SadDocumentRootTest.class);
		suite.addTestSuite(PortTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadTests(String name) {
		super(name);
	}
	
	public static SoftwareAssembly getSoftwareAssembly()  throws Exception {
		URI uri = getURI("sdr/dom/waveforms/GenericWaveform/GenericSadFile.sad.xml");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		return SoftwareAssembly.Util.getSoftwareAssembly(resource);
	}

	private static URI getURI(final String filePath) throws IOException {
		URL url = FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.sad.tests"), new Path(filePath), null);
		Assert.assertNotNull("No such file: mil.jpeojtrs.sca.sad.tests/" + filePath, url);
		URL fileUrl = FileLocator.toFileURL(url);
		return URI.createURI(fileUrl.toString());
	}

} //SadTests
