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

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.junit.Assert;

import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.PropertyValueType;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructPropertyConfigurationType;
import mil.jpeojtrs.sca.prf.Values;
import mil.jpeojtrs.sca.prf.util.PrfValidator;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Struct</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.Struct#getSimple() <em>Simple</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Struct#getSimpleSequence() <em>Simple Sequence</em>}</li>
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
public class StructTest extends AbstractPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructTest.class);
	}

	/**
	 * Constructs a new Struct test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Struct test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Struct getFixture() {
		return (Struct) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		// END GENERATED CODE
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		final Struct struct = props.getStruct().get(0);
		Assert.assertNotNull(struct);
		setFixture(struct);
		// BEGIN GENERATED CODE
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		// END GENERATED CODE
		setFixture(null);
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.Struct#getSimple() <em>Simple</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @see mil.jpeojtrs.sca.prf.Struct#getSimple()
	 * @generated NOT
	 */
	public void testGetSimple() throws IOException {
		// END GENERATED CODE
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		Struct struct = props.getStruct().get(0);

		Assert.assertNotNull(struct);
		Assert.assertNotNull(struct.getSimple());
		Assert.assertEquals(1, struct.getSimple().size());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.Struct#getSimpleSequence() <em>Simple Sequence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException
	 * @see mil.jpeojtrs.sca.prf.Struct#getSimpleSequence()
	 * @generated NOT
	 */
	public void testGetSimpleSequence() throws IOException {
		// END GENERATED CODE
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		Struct struct = props.getStruct().get(1);

		Assert.assertNotNull(struct);
		Assert.assertNotNull(struct.getSimpleSequence());
		Assert.assertEquals(1, struct.getSimpleSequence().size());
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
		Assert.assertNull(getFixture().getProperty(null));
		// BEGIN GENERATED CODE
	}

	// END GENERATED CODE

	public void test_parse() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		Struct struct = props.getStruct().get(0);
		Assert.assertNotNull(struct);
		Assert.assertEquals("DCE:24acefac-62eb-4b7f-9177-cc7d78c76aca", struct.getId());
		Assert.assertEquals(AccessType.READONLY, struct.getMode());
		Assert.assertEquals("Name", struct.getName());
		Assert.assertEquals("Sample Description", struct.getDescription());

		Assert.assertEquals(1, struct.getSimple().size());
		Assert.assertEquals(PropertyValueType.BOOLEAN, struct.getSimple().get(0).getType());
		Assert.assertEquals("DCE:24acefac-62eb-4b7f-9177-cc7d78c76acb", struct.getSimple().get(0).getId());
		Assert.assertNotNull(struct.getConfigurationKind());
		Assert.assertEquals(StructPropertyConfigurationType.FACTORYPARAM, struct.getConfigurationKind().get(0).getType());

		//////////////////////////////////////////////////////////////////////
		struct = props.getStruct().get(1);
		Assert.assertNotNull(struct);
		Assert.assertEquals("fc79476d-9b0c-4208-abe3-b2967cd03421", struct.getId());
		Assert.assertEquals("testStructNameWithSimpleSeq", struct.getName());
		Assert.assertEquals(AccessType.READWRITE, struct.getMode());

		EList<SimpleSequence> simpleSeqList = struct.getSimpleSequence();
		Assert.assertNotNull(simpleSeqList);
		Assert.assertEquals(1, simpleSeqList.size());
		SimpleSequence simpleSeq = simpleSeqList.get(0);
		Assert.assertEquals(PropertyValueType.SHORT, simpleSeq.getType());
		Assert.assertEquals("testSimpleSequence", simpleSeq.getId());
		Values values = simpleSeq.getValues();
		Assert.assertNotNull(values);
		EList<String> valueList = values.getValue();
		Assert.assertNotNull(valueList);
		Assert.assertEquals(3, valueList.size());

		Assert.assertNotNull(struct.getConfigurationKind());
		Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, struct.getConfigurationKind().get(0).getType());
	}

	public void testExtra() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		Assert.assertNotNull(props);
		final Struct struct = props.getStruct().get(0);
		Assert.assertNotNull(struct);

		// test unsetMode
		struct.unsetMode();
		Assert.assertFalse(struct.isSetMode());
		Assert.assertEquals(AccessType.READWRITE, struct.getMode());

		struct.setMode(AccessType.WRITEONLY);
		Assert.assertEquals(AccessType.WRITEONLY, struct.getMode());

		struct.setMode(null);
		Assert.assertEquals(AccessType.READWRITE, struct.getMode());

		struct.setMode(AccessType.READWRITE);
		Assert.assertEquals(AccessType.READWRITE, struct.getMode());

		// test set null and non null type
		struct.getConfigurationKind().clear();
		final ConfigurationKind ck = PrfFactory.eINSTANCE.createConfigurationKind();
		ck.setType(StructPropertyConfigurationType.ALLOCATION);
		struct.getConfigurationKind().clear();
		struct.getConfigurationKind().add(ck);
		Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, struct.getConfigurationKind().get(0).getType());
		struct.getConfigurationKind().set(0, ck);
		Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, struct.getConfigurationKind().get(0).getType());
	}

	/**
	 * IDE-917
	 */
	public void testEmptyConfigurationKind() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		Assert.assertNotNull(props);
		final Struct struct = props.getStruct().get(0);
		Assert.assertNotNull(struct);

		// test unsetType
		struct.getConfigurationKind().clear();
		Assert.assertTrue(struct.getConfigurationKind().isEmpty());
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		struct.eResource().save(buffer, null);
		String xml = new String(buffer.toByteArray());
		Assert.assertFalse("Empty configuration kind serialized wrong.", xml.contains("configurationkind=\"\""));
	}

	/**
	 * IDE-1215 Optional elements should not create diagnostics due to partial config. when inside struct / struct seq
	 * IDE-1304 - The framework does not allow partial configuration of structures (unless it's an optional element)
	 */
	public void testPartiallyConfiguredStruct() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		Assert.assertNotNull(props);

		// Assert that a partially configured Struct fails EMF validation
		Struct struct = (Struct) props.getProperty("partialConfigStuct");
		Assert.assertNotNull(struct);

		BasicDiagnostic diagnostic = new BasicDiagnostic();
		boolean isValid = Diagnostician.INSTANCE.validate(struct, diagnostic);
		Assert.assertFalse("Partially configured structs should not pass validation", isValid);

		String errorMsg = diagnostic.getChildren().get(0).getMessage();
		String expectedError = PrfValidator.INSTANCE.getResourceLocator().getString("_UI_PartiallyConfiguredStruct_diagnostic");
		expectedError = expectedError.substring(0, expectedError.indexOf("{"));
		Assert.assertTrue("Unexpected error message", errorMsg.matches(".*" + expectedError + ".*"));

		// Assert that properties with 'optional' attribute do not cause a validation error
		struct = (Struct) props.getProperty("partialConfigStuctWithOptional");
		Assert.assertNotNull(struct);

		diagnostic = new BasicDiagnostic();
		isValid = Diagnostician.INSTANCE.validate(struct, diagnostic);
		Assert.assertTrue("Optional elements should not affect validation", isValid);

		// IDE-1215 - Optional elements should not throw EMF warnings when inside a Struct/StructSequence 
		Assert.assertTrue("Optional elements should not affect validation", diagnostic.getChildren().isEmpty());
	}

	/**
	 * IDE-1638 - Structs without child elements should throw an EMF validation error
	 */
	public void testEmptyStruct() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		Assert.assertNotNull(props);

		// Assert that an empty struct fails EMF validation
		Struct struct = (Struct) props.getProperty("emptyStruct");
		Assert.assertNotNull(struct);

		BasicDiagnostic diagnostic = new BasicDiagnostic();
		boolean isValid = Diagnostician.INSTANCE.validate(struct, diagnostic);
		Assert.assertFalse("Empty structs should not pass validation", isValid);

		String errorMsg = diagnostic.getChildren().get(0).getMessage();
		Assert.assertTrue("Unexpected error message", errorMsg.matches(".*" + "must have at least 1 values"));
		Assert.assertEquals("Unexpected error code", EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS, diagnostic.getChildren().get(0).getCode());
	}

	/**
	 * IDE-1344 - Provide validation warning for kind elements on members of a struct/struct seq
	 */
	public void testRedundantConfigurationKind() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/StructTest.prf.xml"), true));
		Assert.assertNotNull(props);

		// Assert that an Struct fails EMF validation
		Struct struct = (Struct) props.getProperty("redundantConfigKind");
		Assert.assertNotNull(struct);

		// Assert that EMF Warning is thrown if a simple contained in a struct has a declared kind type
		Simple simple = (Simple) struct.getProperty("simple");
		Assert.assertNotNull(simple);
		Assert.assertEquals("Simple Kind type is not set", PropertyConfigurationType.PROPERTY, simple.getKind().get(0).getType());

		BasicDiagnostic diagnostic = new BasicDiagnostic();
		Assert.assertTrue(Diagnostician.INSTANCE.validate(simple, diagnostic));
		Assert.assertFalse(diagnostic.getChildren().isEmpty());
		Diagnostic diagResult = diagnostic.getChildren().get(0);
		Assert.assertEquals("Validation should result in a warning", Diagnostic.WARNING, diagResult.getSeverity());
		Assert.assertEquals("Unexpected error message", PrfValidator.INSTANCE.getResourceLocator().getString("_UI_RedundantKind_diagnostic"),
			diagResult.getMessage());

		// Assert that EMF Warning is thrown if a simpleSequence contained in a struct has a declared kind type
		SimpleSequence simpleSequence = (SimpleSequence) struct.getProperty("simpleSequence");
		Assert.assertNotNull(simpleSequence);
		Assert.assertEquals("SimpleSequence Kind type is not set", PropertyConfigurationType.PROPERTY, simpleSequence.getKind().get(0).getType());

		diagnostic = new BasicDiagnostic();
		Assert.assertTrue(Diagnostician.INSTANCE.validate(simpleSequence, diagnostic));
		Assert.assertFalse(diagnostic.getChildren().isEmpty());
		diagResult = diagnostic.getChildren().get(0);
		Assert.assertEquals("Validation should result in a warning", Diagnostic.WARNING, diagResult.getSeverity());
		Assert.assertEquals("Unexpected error message", PrfValidator.INSTANCE.getResourceLocator().getString("_UI_RedundantKind_diagnostic"),
			diagResult.getMessage());
	}
} //StructTest
