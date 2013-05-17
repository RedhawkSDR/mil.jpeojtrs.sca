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
package mil.jpeojtrs.sca.spd.tests;

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
 * A test suite for the '<em><b>spd</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdTests extends TestSuite {

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
		final TestSuite suite = new SpdTests("SPD Model Tests");
		suite.addTestSuite(AuthorTest.class);
		suite.addTestSuite(CodeTest.class);
		suite.addTestSuite(CompilerTest.class);
		suite.addTestSuite(DependencyTest.class);
		suite.addTestSuite(DescriptorTest.class);
		suite.addTestSuite(HumanLanguageTest.class);
		suite.addTestSuite(ImplementationTest.class);
		suite.addTestSuite(ImplRefTest.class);
		suite.addTestSuite(LocalFileTest.class);
		suite.addTestSuite(OsTest.class);
		suite.addTestSuite(ProcessorTest.class);
		suite.addTestSuite(ProgrammingLanguageTest.class);
		suite.addTestSuite(PropertyFileTest.class);
		suite.addTestSuite(PropertyRefTest.class);
		suite.addTestSuite(RuntimeTest.class);
		suite.addTestSuite(SoftPkgRefTest.class);
		suite.addTestSuite(SoftPkgTest.class);
		suite.addTestSuite(UsesDeviceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdTests(String name) {
		super(name);
	}

	public static URI getURI(final String filePath) throws IOException {
		final URL url = FileLocator.toFileURL(FileLocator.find(Platform.getBundle("mil.jpeojtrs.sca.spd.tests"), new Path(filePath), null));
		return URI.createURI(url.toString());
	}

} //SpdTests
