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
package mil.jpeojtrs.sca.prf.tests;

import org.junit.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Properties</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getSimple() <em>Simple</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getSimpleSequence() <em>Simple Sequence</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getTest() <em>Test</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getStruct() <em>Struct</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Properties#getStructSequence() <em>Struct Sequence</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyContainer#getProperty(java.lang.String) <em>Get Property</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PropertiesTest extends TestCase {

	/**
	 * The fixture for this Properties test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected Properties fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertiesTest.class);
	}

	/**
	 * Constructs a new Properties test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Properties fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Properties getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;
	private Properties props;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PrfFactory.eINSTANCE.createProperties());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.props = Properties.Util.getProperties(this.resourceSet.getResource(PrfTests.getURI("testFiles/PropertiesTest.prf.xml"), true));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
		this.resourceSet = null;
		this.props = null;
	}
	
	public void testParse() {
		Assert.assertNotNull(this.props);
		Assert.assertEquals("Test description", this.props.getDescription());
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.Properties#getSimple()
	 * <em>Simple</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.prf.Properties#getSimple()
	 * @generated NOT
	 */
	public void testGetSimple() {
		// END GENERATED CODE
		Assert.assertNotNull(this.props.getSimple().get(0));
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.Properties#getSimpleSequence()
	 * <em>Simple Sequence</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.prf.Properties#getSimpleSequence()
	 * @generated NOT
	 */
	public void testGetSimpleSequence() {
		// END GENERATED CODE
		Assert.assertNotNull(this.props.getSimpleSequence().get(0));
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.Properties#getTest()
	 * <em>Test</em>}' feature getter. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see mil.jpeojtrs.sca.prf.Properties#getTest()
	 * @generated NOT
	 */
	public void testGetTest() {
		// END GENERATED CODE
		Assert.assertNotNull(this.props.getTest().get(0));
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.Properties#getStruct()
	 * <em>Struct</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.prf.Properties#getStruct()
	 * @generated NOT
	 */
	public void testGetStruct() {
		// END GENERATED CODE
		Assert.assertNotNull(this.props.getStruct().get(0));
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.Properties#getStructSequence()
	 * <em>Struct Sequence</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.prf.Properties#getStructSequence()
	 * @generated NOT
	 */
	public void testGetStructSequence() {
		// END GENERATED CODE
		Assert.assertNotNull(this.props.getStructSequence().get(0));
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.PropertyContainer#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyContainer#getProperty(java.lang.String)
	 * @generated NOT
	 */
	public void testGetProperty__String() {
		// END GENERATED CODE
		Assert.assertNotNull(this.props.getProperty(this.props.getStructSequence().get(0).getId()));
		// BEGIN GENERATED CODE
	}

} //PropertiesTest
