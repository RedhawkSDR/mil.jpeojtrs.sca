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

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.ResourceFactoryProperties;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Factory Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleRef() <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleSequenceRef() <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructRef() <em>Struct Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructSequenceRef() <em>Struct Sequence Ref</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer() <em>Get Property Container</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ResourceFactoryPropertiesTest extends TestCase {

	/**
	 * The fixture for this Resource Factory Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ResourceFactoryProperties fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceFactoryPropertiesTest.class);
	}

	/**
	 * Constructs a new Resource Factory Properties test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceFactoryPropertiesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Factory Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceFactoryProperties fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Factory Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceFactoryProperties getFixture() {
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
		final SadComponentInstantiation inst = (SadComponentInstantiation) this.sad.eResource().getEObject("DCE:75fb00d8-48c7-4e74-a98b-2e2465a29f6c");
		this.setFixture(inst.getFindComponent().getComponentResourceFactoryRef().getResourceFactoryProperties());
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
	 * Tests the '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleRef() <em>Simple Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleRef()
	 * @generated NOT
	 */
	public void testGetSimpleRef() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getSimpleRef().get(0));
		Assert.assertEquals("DCE:3b5527f4-8488-4b09-bfff-2ec49a90ddb2", this.fixture.getSimpleRef().get(0).getRefID());
		Assert.assertEquals("asdf", this.fixture.getSimpleRef().get(0).getValue());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleSequenceRef() <em>Simple Sequence Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getSimpleSequenceRef()
	 * @generated NOT
	 */
	public void testGetSimpleSequenceRef() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture.getSimpleSequenceRef().get(0));
		Assert.assertEquals("DCE:83ff46f7-965e-4eb0-bd35-c22741978583", this.fixture.getSimpleSequenceRef().get(0).getRefID());
		Assert.assertEquals("1", this.fixture.getSimpleSequenceRef().get(0).getValues().getValue().get(0));
		Assert.assertEquals("2", this.fixture.getSimpleSequenceRef().get(0).getValues().getValue().get(1));

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructRef() <em>Struct Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructRef()
	 * @generated NOT
	 */
	public void testGetStructRef() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture.getStructRef().get(0));
		Assert.assertEquals("DCE:cd67a2f7-7c41-426a-8d9a-fc4dbd0423d1", this.fixture.getStructRef().get(0).getRefID());
		Assert.assertNotNull(this.fixture.getStructRef().get(0).getSimpleRef().get(0));
		Assert.assertEquals("Struct Overriden Value", this.fixture.getStructRef().get(0).getSimpleRef().get(0).getValue());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructSequenceRef() <em>Struct Sequence Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.ResourceFactoryProperties#getStructSequenceRef()
	 * @generated NOT
	 */
	public void testGetStructSequenceRef() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture.getStructSequenceRef().get(0));
		Assert.assertEquals("DCE:dfff8371-15a0-4e5e-9c90-d09425ba3125", this.fixture.getStructSequenceRef().get(0).getRefID());
		Assert.assertNotNull(this.fixture.getStructSequenceRef().get(0).getStructValue().get(0));
		Assert.assertEquals("Struct Sequence Overridden Value", this.fixture.getStructSequenceRef()
		        .get(0)
		        .getStructValue()
		        .get(0)
		        .getSimpleRef()
		        .get(0)
		        .getValue());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer() <em>Get Property Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer()
	 * @generated NOT
	 */
	public void testGetPropertyContainer() {
		// END GENERATED CODE

		// BEGIN GENERATED CODE
	}

	public void test_getGroup() throws Exception {
		Assert.assertNotNull(this.fixture.getGroup());

		Assert.assertEquals(4, this.fixture.getGroup().size());
	}

	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}

} //ResourceFactoryPropertiesTest
