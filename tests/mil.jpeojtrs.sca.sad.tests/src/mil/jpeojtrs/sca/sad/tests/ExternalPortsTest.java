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
package mil.jpeojtrs.sca.sad.tests;

import java.net.URISyntaxException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Ports</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalPortsTest extends TestCase {

	/**
	 * The fixture for this External Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ExternalPorts fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalPortsTest.class);
	}

	/**
	 * Constructs a new External Ports test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPortsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this External Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExternalPorts fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this External Ports test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalPorts getFixture() {
		return fixture;
	}

	private SoftwareAssembly sad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.sad = SadTests.getSoftwareAssembly();
		this.setFixture(this.sad.getExternalPorts());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
		this.sad = null;
	}

	public void test_getPort() throws Exception {
		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.toString());

		for (final Port port : this.fixture.getPort()) {
			Assert.assertNotNull(port);
		}

		Assert.assertEquals("externalPort", this.fixture.getPort().get(0).getUsesIdentifier());
		Assert.assertEquals("anotherExternalPort", this.fixture.getPort().get(1).getProvidesIdentifier());
		Assert.assertEquals("IDL:BULKIO/dataFloat:1.0", this.fixture.getPort().get(2).getSupportedIdentifier());
	}

	/**
	 * IDE-1223 Duplicate external port names should be flagged as errors
	 */
	public void test_externalPortNameCollision() throws URISyntaxException {
		// Test for validation errors on external ports with matching ExternalNames
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/ExternalPorts/ExternalPorts.sad.xml");
		Assert.assertEquals("Test is using an incorrect sad.xml", "externalPorts", sad.getName());
		Assert.assertEquals("Wrong number of external ports found", 2, sad.getExternalPorts().getPort().size());
		for (Port port : sad.getExternalPorts().getPort()) {
			Assert.assertEquals("External port names are incorrect", "siggen_external", port.getExternalName());
		}

		BasicDiagnostic diagnostics = new BasicDiagnostic();
		Assert.assertFalse("Validation should fail", Diagnostician.INSTANCE.validate(sad.getExternalPorts(), diagnostics));
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(0).getMessage().matches(".*" + "Duplicate external port names:" + ".*"));

		// Test for validation errors on external ports with matching default names (should just be the port name)
		sad = SadTests.loadSADFromDomPath("/waveforms/ExternalPorts/ExternalPortsDefault.sad.xml");
		Assert.assertEquals("Test is using an incorrect sad.xml", "externalPortsWithDefault", sad.getName());
		Assert.assertEquals("Wrong number of external ports found", 2, sad.getExternalPorts().getPort().size());
		for (Port port : sad.getExternalPorts().getPort()) {
			Assert.assertNull("No external name should be declared", port.getExternalName());
		}

		diagnostics = new BasicDiagnostic();
		Assert.assertFalse("Validation should fail", Diagnostician.INSTANCE.validate(sad.getExternalPorts(), diagnostics));
		Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(0).getMessage().matches(".*" + "Duplicate external port names:" + ".*"));
	}

} //ExternalPortsTest
