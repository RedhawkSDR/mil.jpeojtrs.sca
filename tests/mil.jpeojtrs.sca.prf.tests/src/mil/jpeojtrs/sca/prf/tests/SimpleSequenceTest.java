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
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.Action;
import mil.jpeojtrs.sca.prf.ActionType;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.PropertyValueType;
import mil.jpeojtrs.sca.prf.Range;
import mil.jpeojtrs.sca.prf.SimpleSequence;
import mil.jpeojtrs.sca.prf.Values;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Simple Sequence</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#isComplex() <em>Is Complex</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.SimpleSequence#isOptional() <em>Is Optional</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SimpleSequenceTest extends AbstractPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleSequenceTest.class);
	}

	/**
	 * Constructs a new Simple Sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSequenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleSequence getFixture() {
		return (SimpleSequence) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/SimpleSequenceTest.prf.xml"), true));
		final SimpleSequence simpleSequence = props.getSimpleSequence().get(0);
		Assert.assertNotNull(simpleSequence);
		setFixture(simpleSequence);
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
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#isComplex() <em>Is Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#isComplex()
	 * @generated NOT
	 */
	public void testIsComplex() {
		Assert.assertFalse(getFixture().isComplex());
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.SimpleSequence#isOptional() <em>Is Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.SimpleSequence#isOptional()
	 * @generated NOT
	 */
	public void testIsOptional() {
		Assert.assertFalse(getFixture().isOptional());
	}

	public void test_parse() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/SimpleSequenceTest.prf.xml"), true));
		SimpleSequence simpleSequence = props.getSimpleSequence().get(0);
		Assert.assertNotNull(simpleSequence);
		Assert.assertEquals("DCE:24acefac-62eb-4b7f-9177-cc7d78c76aca", simpleSequence.getId());
		Assert.assertEquals("Name", simpleSequence.getName());
		Assert.assertEquals(AccessType.READONLY, simpleSequence.getMode());
		Assert.assertEquals(PropertyValueType.STRING, simpleSequence.getType());
		Assert.assertNull("complex attribute", simpleSequence.getComplex());
		Assert.assertFalse("isComplex()", simpleSequence.isComplex());
		Assert.assertNull("optional attribute", simpleSequence.getOptional());
		Assert.assertFalse("isOptional()", simpleSequence.isOptional());
		Assert.assertEquals("Sample Description", simpleSequence.getDescription());
		Assert.assertEquals(1, simpleSequence.getValues().getValue().size());
		Assert.assertEquals("Value 1", simpleSequence.getValues().getValue().get(0));
		Assert.assertEquals("Unit", simpleSequence.getUnits());
		Assert.assertEquals("rangeMax", simpleSequence.getRange().getMin()); // On purpose
		Assert.assertEquals("rangeMin", simpleSequence.getRange().getMax()); // On purpose
		Assert.assertEquals(PropertyConfigurationType.TEST, simpleSequence.getKind().get(0).getType());
		Assert.assertEquals(ActionType.EQ, simpleSequence.getAction().getType());

		simpleSequence = props.getSimpleSequence().get(1);
		Assert.assertNotNull(simpleSequence);
		Assert.assertEquals("DCE:37d9f294-6abb-4b7e-967f-8f7e2a838ccc", simpleSequence.getId());
		Assert.assertEquals("Name2", simpleSequence.getName());
		Assert.assertEquals(AccessType.READWRITE, simpleSequence.getMode());
		Assert.assertEquals(PropertyValueType.FLOAT, simpleSequence.getType());
		Assert.assertFalse("complex attribute", simpleSequence.getComplex());
		Assert.assertFalse("isComplex()", simpleSequence.isComplex());
		Assert.assertTrue("optional attribute", simpleSequence.getOptional());
		Assert.assertTrue("isOptional()", simpleSequence.isOptional());

		simpleSequence = props.getSimpleSequence().get(2);
		Assert.assertNotNull(simpleSequence);
		Assert.assertEquals("DCE:37d9f294-6abb-4b7e-967f-8f7e2a838ddd", simpleSequence.getId());
		Assert.assertEquals("Name3", simpleSequence.getName());
		Assert.assertEquals(AccessType.WRITEONLY, simpleSequence.getMode());
		Assert.assertEquals(PropertyValueType.SHORT, simpleSequence.getType());
		Assert.assertTrue("complex attribute", simpleSequence.getComplex());
		Assert.assertTrue("isComplex()", simpleSequence.isComplex());
		Assert.assertFalse("optional attribute", simpleSequence.getOptional());
		Assert.assertFalse("isOptional()", simpleSequence.isOptional());
	}

	public void testExtra() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/SimpleSequenceTest.prf.xml"), true));
		Assert.assertNotNull(props);
		final SimpleSequence simpleSequence = props.getSimpleSequence().get(0);
		Assert.assertNotNull(simpleSequence);

		// Clear out the Range object
		simpleSequence.setRange(null);
		Assert.assertNull(simpleSequence.getRange());

		// test set non null range
		final Range range = PrfFactory.eINSTANCE.createRange();
		range.setMin("1");
		range.setMax("100");
		simpleSequence.setRange(range);
		Assert.assertNotNull(simpleSequence.getRange());
		Assert.assertEquals("1", simpleSequence.getRange().getMin());
		Assert.assertEquals("100", simpleSequence.getRange().getMax());

		// Clear out the Range object
		simpleSequence.setRange(null);
		Assert.assertNull(simpleSequence.getRange());

		// Clear out the Values object
		simpleSequence.setValues(null);
		Assert.assertNull(simpleSequence.getValues());

		// test set non null Values
		final Values values = PrfFactory.eINSTANCE.createValues();
		values.getValue().add("TestString");
		simpleSequence.setValues(values);
		Assert.assertNotNull(simpleSequence.getValues());
		Assert.assertEquals(1, simpleSequence.getValues().getValue().size());
		Assert.assertEquals("TestString", simpleSequence.getValues().getValue().get(0));

		// Clear out the Enumerations object
		simpleSequence.setValues(null);
		Assert.assertNull(simpleSequence.getValues());

		// test set non null action
		final Action act = PrfFactory.eINSTANCE.createAction();
		act.setType(ActionType.GT);
		simpleSequence.setAction(act);
		Assert.assertNotNull(simpleSequence.getAction());
		Assert.assertEquals(ActionType.GT, simpleSequence.getAction().getType());

		// test unsetMode
		simpleSequence.unsetMode();
		Assert.assertFalse(simpleSequence.isSetMode());
		Assert.assertEquals(AccessType.READWRITE, simpleSequence.getMode());

		// test unsetType
		simpleSequence.unsetType();
		Assert.assertFalse(simpleSequence.isSetType());
		Assert.assertEquals(PropertyValueType.STRING, simpleSequence.getType());

		// test set null and non null type
		simpleSequence.setType(null);
		Assert.assertEquals(PropertyValueType.STRING, simpleSequence.getType());
		simpleSequence.setType(PropertyValueType.FLOAT);
		Assert.assertEquals(PropertyValueType.FLOAT, simpleSequence.getType());
	}
} //SimpleSequenceTest
