/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad.tests;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.Option;
import mil.jpeojtrs.sca.sad.SadFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionTest extends TestCase {

	/**
	 * The fixture for this Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Option fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OptionTest.class);
	}

	/**
	 * Constructs a new Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Option fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Option getFixture() {
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
		setFixture(SadFactory.eINSTANCE.createOption());
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

	// END GENERATED CODE

	public void testValidate() {
		Option option = SadFactory.eINSTANCE.createOption();
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		Assert.assertFalse(Diagnostician.INSTANCE.validate(option, diagnostic));

		option.setName("aname");
		diagnostic = new BasicDiagnostic();
		Assert.assertFalse(Diagnostician.INSTANCE.validate(option, diagnostic));

		option.setName(null);
		option.setValue("avalue");
		diagnostic = new BasicDiagnostic();
		Assert.assertFalse(Diagnostician.INSTANCE.validate(option, diagnostic));

		option.setName("aname");
		diagnostic = new BasicDiagnostic();
		Assert.assertTrue(Diagnostician.INSTANCE.validate(option, diagnostic));
	}
} // OptionTest
