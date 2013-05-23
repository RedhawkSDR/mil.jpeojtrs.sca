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
 // BEGIN GENERATED CODE
package mil.jpeojtrs.sca.prf.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.Kind;
import mil.jpeojtrs.sca.prf.PrfFactory;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.PropertyConfigurationType;
import mil.jpeojtrs.sca.prf.Simple;

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
		for (final Simple simple : props.getSimple()) {
			final EList<Kind> kind = simple.getKind();
			if (simple.getId().equals("DCE:949af1fc-87ec-49a9-92fc-488fce348a0e")) {
				Assert.assertEquals(PropertyConfigurationType.CONFIGURE, kind.get(0).getType());
			} else if (simple.getId().equals("DCE:a0dae7c6-1f49-4cc0-9219-2b669ca392c8")) {
				Assert.assertEquals(PropertyConfigurationType.ALLOCATION, kind.get(0).getType());
			} else if (simple.getId().equals("DCE:753b3ef5-fa23-4c51-9711-c1183ab23cbd")) {
				Assert.assertEquals(PropertyConfigurationType.EXECPARAM, kind.get(0).getType());
			} else if (simple.getId().equals("DCE:193f45bf-bed8-4eed-acc3-144d6ab848a7")) {
				Assert.assertEquals(PropertyConfigurationType.FACTORYPARAM, kind.get(0).getType());
			} else if (simple.getId().equals("DCE:72f5dfb1-cc06-4901-9f8e-a86bb7955381")) {
				Assert.assertEquals(PropertyConfigurationType.TEST, kind.get(0).getType());
			} else if (simple.getId().equals("DCE:c86bcbee-7940-4218-8eca-29e3dcd830fa")) {
				final List<PropertyConfigurationType> types = new ArrayList<PropertyConfigurationType>();
				types.addAll(Arrays.asList(PropertyConfigurationType.values()));
				for (final Kind k : kind) {
					types.remove(k.getType());
					Assert.assertTrue(k.isSetType());
					k.unsetType();
					Assert.assertEquals(PropertyConfigurationType.CONFIGURE, k.getType());
					Assert.assertFalse(k.isSetType());
					k.setType(null);
					Assert.assertEquals(PropertyConfigurationType.CONFIGURE, k.getType());
				}
				Assert.assertEquals(0, types.size());
			} else if (simple.getId().equals("DCE:2aaac878-1416-4199-af3f-bafdde245091")) {
				Assert.assertEquals(0, kind.size());
			} else {
				Assert.fail();
			}
		}
	}
} //KindTest
