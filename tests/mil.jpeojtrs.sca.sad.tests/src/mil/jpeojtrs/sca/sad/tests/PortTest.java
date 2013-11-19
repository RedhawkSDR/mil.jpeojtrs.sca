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
import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortTest extends TestCase {

	/**
	 * The fixture for this Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected Port fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortTest.class);
	}

	/**
	 * Constructs a new Port test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Port fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Port test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Port getFixture() {
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
		this.setFixture(this.sad.getExternalPorts().getPort().get(0));
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

	public void test_getDescription() throws Exception {
		Assert.assertNotNull(this.fixture);
		Assert.assertEquals("Sample description", this.fixture.getDescription());
	}

	public void test_getUsesIdentifier() throws Exception {
		Assert.assertEquals("externalPort", this.fixture.getUsesIdentifier());
	}

	public void test_getComponentInstantiationRef() throws Exception {
		Assert.assertEquals("DCE:6fd1d425-e772-4eb4-8acc-416deda4b1aa", this.fixture.getComponentInstantiationRef().getRefid());
	}

	public void test_setDescription() throws Exception {
		getFixture().setDescription("Some description");
		Assert.assertNotNull(this.fixture.getDescription());
		Assert.assertEquals("Some description", this.fixture.getDescription());
	}

	public void test_setUsesIdentifier() throws Exception {
		getFixture().setUsesIdentifier("New Uses identifier");
		Assert.assertNotNull(this.fixture.getUsesIdentifier());
		Assert.assertEquals("New Uses identifier", this.fixture.getUsesIdentifier());
	}

	public void test_setComponentInstantiationRef() throws Exception {
		getFixture().getComponentInstantiationRef().setRefid("New Ref id");
		Assert.assertNotNull(this.fixture.getComponentInstantiationRef());
		Assert.assertEquals("New Ref id", this.fixture.getComponentInstantiationRef().getRefid());
	}

	public void test_getProvidesIdentifier() throws Exception {
		this.setFixture(this.sad.getExternalPorts().getPort().get(1));
		Assert.assertEquals("anotherExternalPort", this.fixture.getProvidesIndentifier());
	}

	public void test_setProvidesIdentifier() throws Exception {
		getFixture().setProvidesIndentifier("New Provides Identifier");
		Assert.assertNotNull(this.fixture.getProvidesIndentifier());
		Assert.assertEquals("New Provides Identifier", this.fixture.getProvidesIndentifier());
	}

	public void test_getSupportedIdentifier() throws Exception {
		this.setFixture(this.sad.getExternalPorts().getPort().get(2));
		Assert.assertEquals("IDL:BULKIO/dataFloat:1.0", this.fixture.getSupportedIdentifier());
	}

	public void test_setSupportedIdentifier() throws Exception {
		getFixture().setSupportedIdentifier("New Identifier");
		Assert.assertNotNull(this.fixture.getSupportedIdentifier());
		Assert.assertEquals("New Identifier", this.fixture.getSupportedIdentifier());
	}

	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}
	

} //PortTest
