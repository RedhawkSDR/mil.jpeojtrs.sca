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
package mil.jpeojtrs.sca.spd.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreValidator;
import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.spd.UsesDevice;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uses Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 * <li>{@link mil.jpeojtrs.sca.spd.UsesDevice#getPropertyRef() <em>Property Ref</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class UsesDeviceTest extends TestCase {

	/**
	 * The fixture for this Uses Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDevice fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsesDeviceTest.class);
	}

	/**
	 * Constructs a new Uses Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesDeviceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Uses Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UsesDevice fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Uses Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesDevice getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createUsesDevice());
		this.resourceSet = new ResourceSetImpl();
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
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.UsesDevice#getPropertyRef() <em>Property Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.UsesDevice#getPropertyRef()
	 * @generated NOT
	 */
	public void testGetPropertyRef() {
		// END GENERATED CODE
		Assert.assertNotNull(getFixture().getPropertyRef());
		// BEGIN GENERATED CODE
	}

	public void testParse() throws IOException {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/usesdevice.spd.xml"), true));
		final UsesDevice usesDevice = softPkg.getImplementation().get(0).getUsesDevice().get(0);
		Assert.assertNotNull(usesDevice);
		Assert.assertEquals("DCE:2f5a27bf-4b1b-47a9-9646-e54664074244", usesDevice.getId());
		Assert.assertEquals("testType", usesDevice.getType());
	}

	public void testNoType() throws IOException {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/usesdevice_no_type.spd.xml"), true));
		final UsesDevice usesDevice = softPkg.getImplementation().get(0).getUsesDevice().get(0);
		Assert.assertNotNull(usesDevice);
		Assert.assertNull("No type should be set", usesDevice.getType());

		// Model validation
		TreeIterator<EObject> allContents = usesDevice.eResource().getAllContents();
		boolean result = false;
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			result = EcoreValidator.INSTANCE.validate(next, diagnostics, null);
			Assert.assertTrue("Ecore model validation failed: " + diagnostics.toString(), result);
		}
	}

	// UsesDevice is valid so long as it contains ANY property, including:
	// - propertyRef/simpleRef/simpleSequenceRef/structRef/structSequenceRef
	public void testNoPropertyRef() throws IOException {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/usesdevice_no_propref.spd.xml"), true));
		final UsesDevice usesDevice = softPkg.getImplementation().get(0).getUsesDevice().get(0);
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		Diagnostician.INSTANCE.validate(usesDevice, diagnostics);
		String errMsg = "Test Failed: ";
		if (diagnostics.getChildren().size() > 0) {
			errMsg = diagnostics.getChildren().get(0).getMessage();
		}
		Assert.assertEquals(errMsg, Diagnostic.OK, diagnostics.getSeverity());
	}

} // UsesDeviceTest
