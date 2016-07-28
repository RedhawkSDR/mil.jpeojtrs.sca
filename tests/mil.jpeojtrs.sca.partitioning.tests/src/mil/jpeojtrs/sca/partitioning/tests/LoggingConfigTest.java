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

import java.net.URISyntaxException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.partitioning.LoggingConfig;
import mil.jpeojtrs.sca.partitioning.PartitioningFactory;
import mil.jpeojtrs.sca.partitioning.util.PartitioningValidator;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Logging Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoggingConfigTest extends TestCase {

	/**
	 * The fixture for this Logging Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoggingConfig fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoggingConfigTest.class);
	}

	/**
	 * Constructs a new Logging Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingConfigTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Logging Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LoggingConfig fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Logging Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoggingConfig getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PartitioningFactory.eINSTANCE.createLoggingConfig());
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

	public void testLoggingConfig_IDE_1336_IDE_1660() throws URISyntaxException {
		BasicDiagnostic diagnostics = new BasicDiagnostic();

		SoftwareAssembly sad = PartitioningTests.loadSADFromDomPath("/waveforms/GenericWaveform/GenericSadFile.sad.xml");
		Assert.assertEquals("Test is using an incorrect sad.xml", "GenericSadFile", sad.getName());
		SadComponentInstantiation comp = sad.getComponentInstantiation("DCE:75fb00d8-48c7-4e74-a98b-2e2465a29f6c");
		Assert.assertNull(comp.getLoggingConfig());
		LoggingConfig loggingConfig = PartitioningFactory.eINSTANCE.createLoggingConfig();
		comp.setLoggingConfig(loggingConfig);

		// Valid logging config
		loggingConfig.setLevel("DEBUG");
		loggingConfig.setUri("http://example.com");
		Assert.assertTrue("Logging Config should be valid", PartitioningValidator.INSTANCE.validateLoggingConfig(loggingConfig, diagnostics, null));

		// Invalid logging level
		loggingConfig.setLevel("BadValue");
		Assert.assertFalse("Logging Config should fail validation", PartitioningValidator.INSTANCE.validateLoggingConfig(loggingConfig, diagnostics, null));
		String errorMsg = ".*" + "is not a valid log level" + ".*";
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(0).getMessage().matches(errorMsg));
		loggingConfig.setLevel("DEBUG");

		// Invalid logging config error
		loggingConfig.setUri("http://ex am ple.com");
		Assert.assertFalse("Logging Config should fail validation", PartitioningValidator.INSTANCE.validateLoggingConfig(loggingConfig, diagnostics, null));
		errorMsg = ".*" + "Illegal character" + ".*";
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(1).getMessage().matches(errorMsg));

		// Invalid protocol error
		loggingConfig.setUri("ftp://example.com");
		Assert.assertFalse("Logging Config should fail validation", PartitioningValidator.INSTANCE.validateLoggingConfig(loggingConfig, diagnostics, null));
		errorMsg = ".*" + "is not a valid protocol" + ".*";
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(2).getMessage().matches(errorMsg));
	}

} //LoggingConfigTest
