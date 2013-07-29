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

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.InputValue;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.ResultValue;
import mil.jpeojtrs.sca.prf.Test;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Test</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class TestTest extends TestCase {

	/**
	 * The fixture for this Test test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected Test fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestTest.class);
	}

	/**
	 * Constructs a new Test test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Test test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Test fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Test test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Test getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PrfFactory.eINSTANCE.createTest());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
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
	}

	public void test_parse() throws Exception {
		final Properties props = Properties.Util.getProperties(this.resourceSet.getResource(PrfTests.getURI("testFiles/TestTest.prf.xml"), true));
		Assert.assertNotNull(props.getTest().get(0));
		Assert.assertEquals("Test description", props.getTest().get(0).getDescription());
		Assert.assertEquals("1", props.getTest().get(0).getId());
		Assert.assertEquals(1, props.getTest().get(0).getInputValue().getSimple().size());
		Assert.assertEquals("DCE:753b3ef5-fa23-4c51-9711-c1183ab23cbc", props.getTest().get(0).getInputValue().getSimple().get(0).getId());
		Assert.assertEquals(1, props.getTest().get(0).getResultValue().getSimple().size());
		Assert.assertEquals("DCE:753b3ef5-fa23-4c51-9711-c1183ab23cbd", props.getTest().get(0).getResultValue().getSimple().get(0).getId());
	}

	public void testSet() throws Exception {
		final Properties props = Properties.Util.getProperties(this.resourceSet.getResource(PrfTests.getURI("testFiles/TestTest.prf.xml"), true));
		final InputValue ival = PrfFactory.eINSTANCE.createInputValue();
		final ResultValue rval = PrfFactory.eINSTANCE.createResultValue();
		props.getTest().get(0).setResultValue(rval);
		Assert.assertEquals(rval, props.getTest().get(0).getResultValue());
		props.getTest().get(0).setInputValue(ival);
		Assert.assertEquals(ival, props.getTest().get(0).getInputValue());
	}
} //TestTest
