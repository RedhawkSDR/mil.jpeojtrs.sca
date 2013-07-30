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

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.SadDocumentRoot;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.SadDocumentRoot#getSoftwareassembly() <em>Softwareassembly</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SadDocumentRootTest extends TestCase {

	/**
	 * The fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SadDocumentRoot fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SadDocumentRootTest.class);
	}

	/**
	 * Constructs a new Document Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadDocumentRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SadDocumentRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SadDocumentRoot getFixture() {
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
		sad = SadTests.getSoftwareAssembly();
		setFixture(SadFactory.eINSTANCE.createSadDocumentRoot());
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

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.SadDocumentRoot#getSoftwareassembly() <em>Softwareassembly</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.SadDocumentRoot#getSoftwareassembly()
	 * @generated NOT
	 */
	public void testGetSoftwareassembly() {
		// END GENERATED CODE

		Assert.assertNotNull(this.getFixture());
		getFixture().setSoftwareassembly(sad);
		Assert.assertNotNull(this.getFixture().getSoftwareassembly());
		Assert.assertEquals("GenericSadFile", this.getFixture().getSoftwareassembly().getName());
		Assert.assertEquals("DCE:df4f0e1c-a242-4b76-ae1d-bef1b63cedfe", this.getFixture().getSoftwareassembly().getId());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.SadDocumentRoot#setSoftwareassembly(mil.jpeojtrs.sca.sad.SoftwareAssembly) <em>Softwareassembly</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.SadDocumentRoot#setSoftwareassembly(mil.jpeojtrs.sca.sad.SoftwareAssembly)
	 * @generated NOT
	 */
	public void testSetSoftwareassembly() {
		// END GENERATED CODE
		sad.setName("New name");
		getFixture().setSoftwareassembly(sad);
		Assert.assertEquals("New name", this.getFixture().getSoftwareassembly().getName());

		// END GENERATED CODE
	}

} //SadDocumentRootTest
