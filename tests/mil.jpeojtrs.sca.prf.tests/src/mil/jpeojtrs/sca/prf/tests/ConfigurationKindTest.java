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

import java.util.List;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.ConfigurationKind;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.Struct;
import mil.jpeojtrs.sca.prf.StructPropertyConfigurationType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Configuration Kind</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationKindTest extends TestCase {

	/**
	 * The fixture for this Configuration Kind test case. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ConfigurationKind fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigurationKindTest.class);
	}

	/**
	 * Constructs a new Configuration Kind test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationKindTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Configuration Kind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConfigurationKind fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Configuration Kind test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationKind getFixture() {
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
		setFixture(PrfFactory.eINSTANCE.createConfigurationKind());
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
		final Properties props = Properties.Util.getProperties(this.resourceSet.getResource(PrfTests.getURI("testFiles/ConfigurationKindTest.prf.xml"), true));
		final EList<Struct> structs = props.getStruct();
		Assert.assertEquals(7, structs.size());
		for (final Struct struct : structs) {
			List<ConfigurationKind> configKind = struct.getConfigurationKind();
			if (struct.getId().equals("structconfigure")) {
				Assert.assertEquals(1, configKind.size());
				Assert.assertEquals(StructPropertyConfigurationType.CONFIGURE, struct.getConfigurationKind().get(0).getType());
			} else if (struct.getId().equals("structallocation")) {
				Assert.assertEquals(1, configKind.size());
				Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, configKind.get(0).getType());
			} else if (struct.getId().equals("structfactoryparam")) {
				Assert.assertEquals(1, configKind.size());
				Assert.assertEquals(StructPropertyConfigurationType.FACTORYPARAM, configKind.get(0).getType());
			} else if (struct.getId().equals("structtest")) {
				Assert.assertEquals(1, configKind.size());
				Assert.assertEquals(StructPropertyConfigurationType.TEST, configKind.get(0).getType());
			} else if (struct.getId().equals("structevent")) {
				Assert.assertEquals(1, configKind.size());
				Assert.assertEquals(StructPropertyConfigurationType.EVENT, configKind.get(0).getType());
			} else if (struct.getId().equals("structmessage")) {
				Assert.assertEquals(1, configKind.size());
				Assert.assertEquals(StructPropertyConfigurationType.MESSAGE, configKind.get(0).getType());
			} else if (struct.getId().equals("structproperty")) {
				Assert.assertEquals(1, configKind.size());
				Assert.assertEquals(StructPropertyConfigurationType.PROPERTY, configKind.get(0).getType());
			} else {
				Assert.fail("Unexpected object found during test");
			}
		}
	}

	public void test_default() {
		ConfigurationKind k = PrfFactory.eINSTANCE.createConfigurationKind();
		Assert.assertFalse(k.isSetType());
		Assert.assertEquals(StructPropertyConfigurationType.CONFIGURE, k.getType());
		k.setType(StructPropertyConfigurationType.ALLOCATION);
		Assert.assertTrue(k.isSetType());
		Assert.assertEquals(StructPropertyConfigurationType.ALLOCATION, k.getType());
		k.setType(null);
		Assert.assertEquals(StructPropertyConfigurationType.CONFIGURE, k.getType());
	}

} // ConfigurationKindTest
