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
package mil.jpeojtrs.sca.sad.tests;

import org.junit.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.SimpleRef;
import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.ResourceFactoryProperties;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Component Resource Factory Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getComponent() <em>Component</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ComponentResourceFactoryRefTest extends TestCase {

	/**
	 * The fixture for this Component Resource Factory Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentResourceFactoryRef fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComponentResourceFactoryRefTest.class);
	}

	/**
	 * Constructs a new Component Resource Factory Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentResourceFactoryRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Component Resource Factory Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ComponentResourceFactoryRef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Component Resource Factory Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentResourceFactoryRef getFixture() {
		return fixture;
	}

	private SoftwareAssembly sad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.sad = SadTests.getSoftwareAssembly();
		this.setFixture(this.sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().get(0).getFindComponent()
		        .getComponentResourceFactoryRef());
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
		this.sad = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getComponent() <em>Component</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#getComponent()
	 * @generated NOT
	 */
	public void testGetComponent() {
		// END GENERATED CODE
//		Assert.assertNotNull(getFixture().getComponent());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#setComponent(mil.jpeojtrs.sca.sad.SadComponentInstantiation) <em>Component</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef#setComponent(mil.jpeojtrs.sca.sad.SadComponentInstantiation)
	 * @generated NOT
	 */
	public void testSetComponent() {
		// END GENERATED CODE
		SadComponentInstantiation comp = getFixture().getComponent();
		getFixture().setComponent(null);
		Assert.assertNull(getFixture().getComponent());
		getFixture().setComponent(comp);
		if (comp == null) {
			Assert.assertNull(getFixture().getComponent());
		} else {
			Assert.assertNotNull(getFixture().getComponent());
		}
		// END GENERATED CODE
	}

	public void test_getRefId() throws Exception {
		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.toString());

		Assert.assertEquals("Reader_d05f7b78-a149-424e-a771-a8e183405b9e", this.fixture.getRefid());
	}

	public void test_getResourceFactoryProperties() throws Exception {
		Assert.assertNotNull(this.fixture.getResourceFactoryProperties());
	}

	public void test_setRefId() throws Exception {
		this.fixture.setRefid("New Value");

		Assert.assertNotNull(this.fixture.getRefid());
	}

	public void test_setResourceFactoryProperties() throws Exception {
		final ResourceFactoryProperties props = this.fixture.getResourceFactoryProperties();

		final SimpleRef simple = props.getSimpleRef().get(0);

		simple.setRefID("New value");

		props.getSimpleRef().add(simple);

		this.fixture.setResourceFactoryProperties(props);
	}

	@Test
	public void test_setRefid() throws Exception {
		this.fixture.setRefid("New refid");

		Assert.assertNotNull(this.fixture.getRefid());
		Assert.assertEquals("New refid", this.fixture.getRefid());
	}

	@Test
	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}

} //ComponentResourceFactoryRefTest
