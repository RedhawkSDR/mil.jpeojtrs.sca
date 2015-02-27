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
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.Enumeration;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Enumeration</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class EnumerationTest extends TestCase {

	/**
	 * The fixture for this Enumeration test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected Enumeration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumerationTest.class);
	}

	/**
	 * Constructs a new Enumeration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enumeration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Enumeration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enumeration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enumeration getFixture() {
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
		setFixture(PrfFactory.eINSTANCE.createEnumeration());
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
		final Properties prf = Properties.Util.getProperties(this.resourceSet.getResource(PrfTests.getURI("testFiles/EnumerationsTest.prf.xml"), true));
		final Enumeration enum1 = prf.getSimple().get(0).getEnumerations().getEnumeration().get(0);
		final Enumeration enum2 = prf.getSimple().get(0).getEnumerations().getEnumeration().get(1);
		Assert.assertEquals("enum1", enum1.getLabel());
		Assert.assertNull(enum1.getValue());
		Assert.assertEquals("enum2", enum2.getLabel());
		Assert.assertEquals("1", enum2.getValue());
	}

} //EnumerationTest
