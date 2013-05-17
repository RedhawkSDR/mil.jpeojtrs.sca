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
package mil.jpeojtrs.sca.partitioning.tests;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>partitioning</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitioningTests extends TestSuite {

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
		TestSuite suite = new PartitioningTests("partitioning Tests");
		suite.addTestSuite(DomComponentFileTest.class);
		suite.addTestSuite(DevComponentFileTest.class);
		suite.addTestSuite(ComponentFileRefTest.class);
		suite.addTestSuite(ComponentInstantiationTest.class);
		suite.addTestSuite(ComponentPropertiesTest.class);
		suite.addTestSuite(ComponentSupportedInterfaceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitioningTests(String name) {
		super(name);
	}

	public static URI getURI(final String filePath) throws IOException {
		final URL bundleUrl = FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.partitioning.tests"), new Path(filePath), null);
		if (bundleUrl == null) {
			throw new IOException("Unknown Bundle File: " + filePath);
		}
		final URL url = FileLocator.toFileURL(bundleUrl);
		try {
			return URI.createURI(url.toURI().toString());
		} catch (final URISyntaxException e) {
			IOException ex = new IOException("Invalid URI:" + url);
			ex.initCause(e);
			throw ex;
		}
	}

} //PartitioningTests
