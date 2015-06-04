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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.Kind;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.Simple;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructPropertyConfigurationType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Kind</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class KindTest extends TestCase {

	/**
	 * The fixture for this Kind test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected Kind fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KindTest.class);
	}

	/**
	 * Constructs a new Kind test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Kind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Kind fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Kind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kind getFixture() {
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
		setFixture(PrfFactory.eINSTANCE.createKind());
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
		final Properties props = Properties.Util.getProperties(this.resourceSet.getResource(PrfTests.getURI("testFiles/KindTest.prf.xml"), true));

		Assert.assertEquals("Unexpected number of properties", 10, props.getSimple().size());
		for (final Simple simple : props.getSimple()) {
			final EList<Kind> kind = simple.getKind();
			if (simple.getId().equals("configureid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(PropertyConfigurationType.CONFIGURE, kind.get(0).getType());
			} else if (simple.getId().equals("execparamid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(PropertyConfigurationType.EXECPARAM, kind.get(0).getType());
			} else if (simple.getId().equals("allocationid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(PropertyConfigurationType.ALLOCATION, kind.get(0).getType());
			} else if (simple.getId().equals("factoryparamid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(PropertyConfigurationType.FACTORYPARAM, kind.get(0).getType());
			} else if (simple.getId().equals("testid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(PropertyConfigurationType.TEST, kind.get(0).getType());
			} else if (simple.getId().equals("eventid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(PropertyConfigurationType.EVENT, kind.get(0).getType());
			} else if (simple.getId().equals("messageid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(PropertyConfigurationType.MESSAGE, kind.get(0).getType());
			} else if (simple.getId().equals("propertyid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(PropertyConfigurationType.PROPERTY, kind.get(0).getType());
			} else if (simple.getId().equals("allid")) {
				final List<PropertyConfigurationType> types = new ArrayList<PropertyConfigurationType>();
				types.addAll(Arrays.asList(PropertyConfigurationType.values()));
				for (final Kind k : kind) {
					types.remove(k.getType());
				}
				Assert.assertEquals(0, types.size());
			} else if (simple.getId().equals("noneid")) {
				Assert.assertEquals(0, kind.size());
			} else {
				Assert.fail();
			}
		}

		Assert.assertEquals("Unexpected number of properties", 7, props.getStruct().size());
		for (Struct struct : props.getStruct()) {
			final EList<ConfigurationKind> kind = struct.getConfigurationKind();
			if (struct.getId().equals("structconfigureid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(StructPropertyConfigurationType.CONFIGURE, kind.get(0).getType());
			} else if (struct.getId().equals("structallocationid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, kind.get(0).getType());
			} else if (struct.getId().equals("structfactoryparamid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(StructPropertyConfigurationType.FACTORYPARAM, kind.get(0).getType());
			} else if (struct.getId().equals("structtestid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(StructPropertyConfigurationType.TEST, kind.get(0).getType());
			} else if (struct.getId().equals("structeventid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(StructPropertyConfigurationType.EVENT, kind.get(0).getType());
			} else if (struct.getId().equals("structmessageid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(StructPropertyConfigurationType.MESSAGE, kind.get(0).getType());
			} else if (struct.getId().equals("structpropertyid")) {
				Assert.assertEquals(1, kind.size());
				Assert.assertEquals(StructPropertyConfigurationType.PROPERTY, kind.get(0).getType());
			} else {
				Assert.fail();
			}
		}
	}

	public void test_default() {
		Kind k = PrfFactory.eINSTANCE.createKind();
		Assert.assertFalse(k.isSetType());
		Assert.assertEquals(PropertyConfigurationType.PROPERTY, k.getType());
		k.setType(PropertyConfigurationType.ALLOCATION);
		Assert.assertTrue(k.isSetType());
		Assert.assertEquals(PropertyConfigurationType.ALLOCATION, k.getType());
		k.setType(null);
		Assert.assertEquals(PropertyConfigurationType.PROPERTY, k.getType());
	}
} // KindTest
