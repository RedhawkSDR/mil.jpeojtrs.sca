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

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.scd.ScdDocumentRoot;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.ScdDocumentRoot#getSoftwarecomponent() <em>Softwarecomponent</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ScdDocumentRootTest extends TestCase {

	/**
	 * The fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ScdDocumentRoot fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScdDocumentRootTest.class);
	}

	/**
	 * Constructs a new Document Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScdDocumentRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ScdDocumentRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScdDocumentRoot getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet = null;
	private SoftwareComponent scd = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScdFactory.eINSTANCE.createScdDocumentRoot());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture((ScdDocumentRoot) this.scd.eContainer());
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
		this.resourceSet = null;
		this.scd = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.ScdDocumentRoot#getSoftwarecomponent() <em>Softwarecomponent</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.ScdDocumentRoot#getSoftwarecomponent()
	 * @generated NOT
	 */
	public void testGetSoftwarecomponent() {
		// END GENERATED CODE

		//		Assert.assertNotNull(this.fixture);
		//		Assert.assertNotNull(this.fixture.getSoftwarecomponent());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.ScdDocumentRoot#setSoftwarecomponent(mil.jpeojtrs.sca.scd.SoftwareComponent) <em>Softwarecomponent</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.ScdDocumentRoot#setSoftwarecomponent(mil.jpeojtrs.sca.scd.SoftwareComponent)
	 * @generated NOT
	 */
	@Test
	@Ignore
	public void testSetSoftwarecomponent() {
		// END GENERATED CODE

		//		SoftwareComponent scd = this.fixture.getSoftwarecomponent();
		//		scd.setRepId("New repid");
		//		this.fixture.setSoftwarecomponent(scd);
		//		
		//		Assert.assertNotNull(this.fixture.getSoftwarecomponent());

		// END GENERATED CODE
	}

	@Test
	@Ignore
	public void test_getMixed() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		//		Assert.assertNotNull(this.fixture.getMixed());
	}

	@Test
	@Ignore
	public void test_getXMLNSPrefixMap() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		//		Assert.assertNotNull(this.fixture.getXMLNSPrefixMap());
	}

	@Test
	@Ignore
	public void test_getXSISchemaLocation() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		//		Assert.assertNotNull(this.fixture.getXSISchemaLocation());
	}

	@Test
	@Ignore
	public void test_toString() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		//		Assert.assertNotNull(this.fixture.toString());
	}

} //ScdDocumentRootTest
