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
package mil.jpeojtrs.sca.scd.tests;

import java.io.IOException;
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
 * A test suite for the '<em><b>scd</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScdTests extends TestSuite {

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
		final TestSuite suite = new ScdTests("scd Tests");
		suite.addTestSuite(ComponentFeaturesTest.class);
		suite.addTestSuite(ComponentRepIdTest.class);
		suite.addTestSuite(InheritsInterfaceTest.class);
		suite.addTestSuite(InterfacesTest.class);
		suite.addTestSuite(InterfaceTest.class);
		suite.addTestSuite(LocalFileTest.class);
		suite.addTestSuite(PortsTest.class);
		suite.addTestSuite(PortTypeContainerTest.class);
		suite.addTestSuite(PropertyFileTest.class);
		suite.addTestSuite(ProvidesTest.class);
		suite.addTestSuite(ScdDocumentRootTest.class);
		suite.addTestSuite(SoftwareComponentTest.class);
		suite.addTestSuite(SupportsInterfaceTest.class);
		suite.addTestSuite(UsesTest.class);
		return suite;
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScdTests(String name) {
		super(name);
	}

	public static URI getURI(final String filePath) throws IOException {
		final URL url = FileLocator.toFileURL(FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.scd.tests"), new Path(filePath), null));
		return URI.createURI(url.toString());
	}

} //ScdTests
