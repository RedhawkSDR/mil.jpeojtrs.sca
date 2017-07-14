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
import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.ExternalProperty;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SadPluginActivator;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.sad.util.SadValidator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.ExternalProperty#resolveExternalID() <em>Resolve External ID</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExternalPropertyTest extends TestCase {

	/**
	 * The fixture for this External Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalProperty fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalPropertyTest.class);
	}

	/**
	 * Constructs a new External Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalPropertyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this External Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExternalProperty fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this External Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalProperty getFixture() {
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
		setFixture(SadFactory.eINSTANCE.createExternalProperty());
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
	 * Tests the '{@link mil.jpeojtrs.sca.sad.ExternalProperty#resolveExternalID() <em>Resolve External ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.ExternalProperty#resolveExternalID()
	 * @generated NOT
	 */
	@Test
	public void testResolveExternalID() {
		// END GENERATED CODE
		assertNotNull("fixture", fixture);
		final String TEST_ID = "test_setExternalPropID";
		fixture.setExternalPropID(TEST_ID);

		String externalPropID = fixture.getExternalPropID();
		assertEquals("set/get ExternalPropID", TEST_ID, externalPropID);

		String externalId = fixture.resolveExternalID();
		assertEquals("resolveExternalID", TEST_ID, externalId);
		// BEGIN GENERATED CODE
	}

	// END GENERATED CODE

	/**
	 * IDE-1511 - Validate that external properties match a component instantiation
	 * @throws URISyntaxException
	 */
	public void testExternalPropertyRefId_IDE_1511() throws URISyntaxException {
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/ExternalProperties/ExternalProperties.sad.xml");
		Assert.assertEquals("Test is using an incorrect sad.xml", "ExternalProperties", sad.getName());
		Assert.assertEquals("Wrong number of external properties found", 3, sad.getExternalProperties().getProperties().size());
		for (ExternalProperty prop : sad.getExternalProperties().getProperties()) {
			BasicDiagnostic diagnostics = new BasicDiagnostic();
			if (prop.getExternalPropID().matches(".*" + "invalid" + ".*")) {
				Assert.assertFalse("Validation should fail", SadValidator.INSTANCE.validateExternalProperty(prop, diagnostics, null));
				String errorMsg = SadPluginActivator.INSTANCE.getString("_UI_UnkownCompRefId_diagnostic", new Object[] { prop.getExternalPropID() });
				Assert.assertTrue("Unexpected warning message", diagnostics.getChildren().get(0).getMessage().equals(errorMsg));
			} else {
				Assert.assertTrue("Validation should pass", SadValidator.INSTANCE.validateExternalProperty(prop, diagnostics, null));
			}
		}
	}

	// BEGIN GENERATED CODE

} //ExternalPropertyTest
