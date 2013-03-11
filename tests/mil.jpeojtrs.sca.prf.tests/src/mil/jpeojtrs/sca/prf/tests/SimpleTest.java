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
package mil.jpeojtrs.sca.prf.tests;

import junit.framework.Assert;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.AccessType;
import mil.jpeojtrs.sca.prf.Action;
import mil.jpeojtrs.sca.prf.ActionType;
import mil.jpeojtrs.sca.prf.Enumeration;
import mil.jpeojtrs.sca.prf.Enumerations;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.PropertyValueType;
import mil.jpeojtrs.sca.prf.Range;
import mil.jpeojtrs.sca.prf.Simple;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Simple</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class SimpleTest extends AbstractPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleTest.class);
	}

	/**
	 * Constructs a new Simple test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Simple getFixture() {
		return (Simple)fixture;
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
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/SimpleTest.prf.xml"), true));
		final Simple simple = props.getSimple().get(0);
		setFixture(simple);
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

	public void test_parse() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/SimpleTest.prf.xml"), true));
		Assert.assertNotNull(props);
		Simple simple = props.getSimple().get(0);
		Assert.assertNotNull(simple);
		Assert.assertEquals("Name", simple.getName());
		Assert.assertEquals("My Value", simple.getValue());
		Assert.assertEquals("The units", simple.getUnits());
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		
		Assert.assertEquals("my min", simple.getRange().getMin());
		Assert.assertEquals("my max", simple.getRange().getMax());
		
		Assert.assertEquals(1, simple.getEnumerations().getEnumeration().size());
		Assert.assertEquals("enuLabel", simple.getEnumerations().getEnumeration().get(0).getLabel());
		Assert.assertEquals("enumValue", simple.getEnumerations().getEnumeration().get(0).getValue());
		
		Assert.assertEquals(1, simple.getKind().size());
		Assert.assertEquals(PropertyConfigurationType.CONFIGURE, simple.getKind().get(0).getType());
		
		Assert.assertEquals(ActionType.EXTERNAL, simple.getAction().getType());
		
		simple = props.getSimple().get(1);
		Assert.assertNotNull(simple);
		Assert.assertEquals("Name", simple.getName());
		Assert.assertNull(simple.getValue());
		Assert.assertNull(simple.getUnits());
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		Assert.assertEquals(1, simple.getKind().size());
		Assert.assertEquals(PropertyConfigurationType.CONFIGURE, simple.getKind().get(0).getType());		
		Assert.assertEquals(ActionType.EQ, simple.getAction().getType());
		
		simple = props.getSimple().get(2);
		Assert.assertNotNull(simple);
		Assert.assertNull(simple.getName());
		Assert.assertNull(simple.getValue());
		Assert.assertNull(simple.getUnits());
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		Assert.assertEquals(1, simple.getKind().size());
		Assert.assertEquals(PropertyConfigurationType.CONFIGURE, simple.getKind().get(0).getType());		
		Assert.assertEquals(ActionType.GE, simple.getAction().getType());
		
		simple = props.getSimple().get(3);
		Assert.assertNotNull(simple);
		Assert.assertNull(simple.getName());
		Assert.assertNull(simple.getValue());
		Assert.assertNull(simple.getUnits());
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		Assert.assertEquals(1, simple.getKind().size());
		Assert.assertEquals(PropertyConfigurationType.CONFIGURE, simple.getKind().get(0).getType());		
		Assert.assertEquals(ActionType.GT, simple.getAction().getType());
		
		simple = props.getSimple().get(4);
		Assert.assertNotNull(simple);
		Assert.assertNull(simple.getName());
		Assert.assertNull(simple.getValue());
		Assert.assertNull(simple.getUnits());
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		Assert.assertEquals(1, simple.getKind().size());
		Assert.assertEquals(PropertyConfigurationType.CONFIGURE, simple.getKind().get(0).getType());		
		Assert.assertEquals(ActionType.LE, simple.getAction().getType());
		
		simple = props.getSimple().get(5);
		Assert.assertNotNull(simple);
		Assert.assertNull(simple.getName());
		Assert.assertNull(simple.getValue());
		Assert.assertNull(simple.getUnits());
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		Assert.assertEquals(1, simple.getKind().size());
		Assert.assertEquals(PropertyConfigurationType.CONFIGURE, simple.getKind().get(0).getType());		
		Assert.assertEquals(ActionType.LT, simple.getAction().getType());
		
		simple = props.getSimple().get(6);
		Assert.assertNotNull(simple);
		Assert.assertNull(simple.getName());
		Assert.assertNull(simple.getValue());
		Assert.assertNull(simple.getUnits());
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		Assert.assertEquals(1, simple.getKind().size());
		Assert.assertEquals(PropertyConfigurationType.CONFIGURE, simple.getKind().get(0).getType());		
		Assert.assertEquals(ActionType.NE, simple.getAction().getType());
	}
	
	public void testExtra() throws Exception {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Properties props = Properties.Util.getProperties(resourceSet.getResource(PrfTests.getURI("testFiles/SimpleTest.prf.xml"), true));
		Assert.assertNotNull(props);
		final Simple simple = props.getSimple().get(1);
		Assert.assertNotNull(simple);

		// Clear out the Range object
		simple.setRange(null);
		Assert.assertNull(simple.getRange());

		// test set non null range
		final Range range = PrfFactory.eINSTANCE.createRange();
		range.setMin("1");
		range.setMax("100");
		simple.setRange(range);
		Assert.assertNotNull(simple.getRange());
		Assert.assertEquals("1", simple.getRange().getMin());
		Assert.assertEquals("100", simple.getRange().getMax());
		
		// Clear out the Range object
		simple.setRange(null);
		Assert.assertNull(simple.getRange());

		// Clear out the Enumerations object
		simple.setEnumerations(null);
		Assert.assertNull(simple.getEnumerations());
		
		// test set non null enum
		final Enumerations enums = PrfFactory.eINSTANCE.createEnumerations();
		final Enumeration enu = PrfFactory.eINSTANCE.createEnumeration();
		enu.setLabel("enuTest");
		enu.setValue("enuTestValue");
		enums.getEnumeration().add(enu);
		simple.setEnumerations(enums);
		Assert.assertNotNull(simple.getEnumerations());
		Assert.assertEquals(1, simple.getEnumerations().getEnumeration().size());
		Assert.assertEquals("enuTest", simple.getEnumerations().getEnumeration().get(0).getLabel());
		Assert.assertEquals("enuTestValue", simple.getEnumerations().getEnumeration().get(0).getValue());
		
		// Clear out the Enumerations object
		simple.setEnumerations(null);
		Assert.assertNull(simple.getEnumerations());
		
		// test set non null action
		final Action act = PrfFactory.eINSTANCE.createAction();
		act.setType(ActionType.GT);
		simple.setAction(act);
		Assert.assertNotNull(simple.getAction());
		Assert.assertEquals(ActionType.GT, simple.getAction().getType());

		// test unsetMode
		simple.unsetMode();
		Assert.assertFalse(simple.isSetMode());
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		
		simple.setMode(AccessType.WRITEONLY);
		Assert.assertEquals(AccessType.WRITEONLY, simple.getMode());
		
		simple.setMode(null);
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		
		simple.setMode(AccessType.READWRITE);
		Assert.assertEquals(AccessType.READWRITE, simple.getMode());
		
		// test unsetType
		simple.unsetType();
		Assert.assertFalse(simple.isSetType());
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		
		// test set null and non null type
		simple.setType(null);
		Assert.assertEquals(PropertyValueType.STRING, simple.getType());
		simple.setType(PropertyValueType.FLOAT);
		Assert.assertEquals(PropertyValueType.FLOAT, simple.getType());
	}

} //SimpleTest
