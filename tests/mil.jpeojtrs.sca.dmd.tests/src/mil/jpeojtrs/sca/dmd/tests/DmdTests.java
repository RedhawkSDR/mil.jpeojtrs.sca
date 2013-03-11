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

import java.io.IOException;
import java.net.URL;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dmd.DomainManagerConfiguration;

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
 * A test suite for the '<em><b>dmd</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmdTests extends TestSuite {

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
		// END GENERATED CODE
		final TestSuite suite = new DmdTests("dmd Tests");
		suite.addTestSuite(DmdDocumentRootTest.class);
		suite.addTestSuite(DomainFinderTest.class);
		suite.addTestSuite(DomainManagerConfigurationTest.class);
		suite.addTestSuite(DomainManagerSoftPkgTest.class);
		suite.addTestSuite(FindByTest.class);
		suite.addTestSuite(LocalFileTest.class);
		suite.addTestSuite(NamingServiceTest.class);
		suite.addTestSuite(ServicesTest.class);
		suite.addTestSuite(ServiceTest.class);
		return suite;
		// BEGIN GENERATED CODE GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmdTests(String name) {
		super(name);
	}
	
	public static DomainManagerConfiguration getDomainManagerConfiguration()  throws Exception {
		URI uri = getURI("sdr/dom/domain/DomainManager.dmd.xml");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		return DomainManagerConfiguration.Util.getDomainManagerConfiguration(resource);
	}
	
	public static DomainManagerConfiguration getTestFileDomainManagerConfiguration()  throws Exception {
		URI uri = getURI("testFiles/DomainManager.dmd.xml");
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		return DomainManagerConfiguration.Util.getDomainManagerConfiguration(resource);
	}

	private static URI getURI(final String filePath) throws IOException {
		URL url = FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.dmd.tests"), new Path(filePath), null);
		Assert.assertNotNull("No such file: mil.jpeojtrs.sca.dcd.tests/" + filePath, url);
		URL fileUrl = FileLocator.toFileURL(url);
		return URI.createURI(fileUrl.toString());
	}

} //DmdTests
