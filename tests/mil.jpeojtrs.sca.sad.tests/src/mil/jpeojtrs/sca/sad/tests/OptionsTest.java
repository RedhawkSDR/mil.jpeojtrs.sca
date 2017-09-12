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

import java.net.URISyntaxException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.Option;
import mil.jpeojtrs.sca.sad.Options;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionsTest extends TestCase {

	/**
	 * The fixture for this Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Options fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OptionsTest.class);
	}

	/**
	 * Constructs a new Options test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Options fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Options test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Options getFixture() {
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
		setFixture(SadFactory.eINSTANCE.createOptions());
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

	public void testLoad() throws URISyntaxException {
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/OptionsWaveform/OptionsWaveform.sad.xml");
		Assert.assertEquals("Expected two options", 2, sad.getOptions().getOption().size());

		Option opt1 = sad.getOptions().getOption().get(0);
		Assert.assertEquals("AWARE_APPLICATION", opt1.getName());
		Assert.assertEquals("True", opt1.getValue());

		Option opt2 = sad.getOptions().getOption().get(1);
		Assert.assertEquals("STOP_TIMEOUT", opt2.getName());
		Assert.assertEquals("123", opt2.getValue());
	}

	public void testValidate() {
		Options options = SadFactory.eINSTANCE.createOptions();
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		Assert.assertFalse(Diagnostician.INSTANCE.validate(options, diagnostic));

		Option option = SadFactory.eINSTANCE.createOption();
		option.setName("aname");
		option.setValue("avalue");
		options.getOption().add(option);
		diagnostic = new BasicDiagnostic();
		Assert.assertTrue(Diagnostician.INSTANCE.validate(options, diagnostic));
	}
} // OptionsTest
