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
package mil.jpeojtrs.sca.prf.tests;

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
 * <!-- begin-user-doc --> A test suite for the '<em><b>prf</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrfTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static Test suite() {
		final TestSuite suite = new PrfTests("prf Tests");
		suite.addTestSuite(PrfDocumentRootTest.class);
		suite.addTestSuite(ActionTest.class);
		suite.addTestSuite(ConfigurationKindTest.class);
		suite.addTestSuite(EnumerationsTest.class);
		suite.addTestSuite(EnumerationTest.class);
		suite.addTestSuite(InputValueTest.class);
		suite.addTestSuite(KindTest.class);
		suite.addTestSuite(PropertiesTest.class);
		suite.addTestSuite(RangeTest.class);
		suite.addTestSuite(ResultValueTest.class);
		suite.addTestSuite(SimpleRefTest.class);
		suite.addTestSuite(SimpleSequenceTest.class);
		suite.addTestSuite(SimpleTest.class);
		suite.addTestSuite(StructSequenceTest.class);
		suite.addTestSuite(StructTest.class);
		suite.addTestSuite(StructValueTest.class);
		suite.addTestSuite(TestTest.class);
		suite.addTestSuite(ValuesTest.class);
		suite.addTestSuite(PropertyValueTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrfTests(String name) {
		super(name);
	}

	public static URI getURI(final String filePath) throws IOException {
		final URL url = FileLocator.toFileURL(FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.prf.tests"), new Path(filePath), null));
		return URI.createURI(url.toString());
	}

} //PrfTests
