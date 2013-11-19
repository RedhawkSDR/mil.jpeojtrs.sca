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
		Assert.assertEquals("anotherExternalPort", this.fixture.getPort().get(1).getProvidesIndentifier());
		Assert.assertEquals("IDL:BULKIO/dataFloat:1.0", this.fixture.getPort().get(2).getSupportedIdentifier());
	}

} //ExternalPortsTest
