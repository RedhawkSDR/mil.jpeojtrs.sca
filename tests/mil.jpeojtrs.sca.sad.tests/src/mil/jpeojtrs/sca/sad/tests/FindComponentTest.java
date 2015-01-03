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
import mil.jpeojtrs.sca.partitioning.NamingService;
import mil.jpeojtrs.sca.sad.ComponentResourceFactoryRef;
import mil.jpeojtrs.sca.sad.FindComponent;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Find Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FindComponentTest extends TestCase {

	/**
	 * The fixture for this Find Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected FindComponent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FindComponentTest.class);
	}

	/**
	 * Constructs a new Find Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindComponentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Find Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FindComponent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Find Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindComponent getFixture() {
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
		this.setFixture(this.sad.getPartitioning().getComponentPlacement().get(0).getComponentInstantiation().get(0).getFindComponent());
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

	public void test_getComponentResourceFactoryRef() throws Exception {
		Assert.assertNotNull(this.fixture);
		Assert.assertEquals("Reader_d05f7b78-a149-424e-a771-a8e183405b9e", this.fixture.getComponentResourceFactoryRef().getRefid());
	}

	public void test_setComponentResourceFactoryRef() throws Exception {
		final ComponentResourceFactoryRef ref = this.fixture.getComponentResourceFactoryRef();
		ref.setRefid("New Ref Id");

		this.fixture.setComponentResourceFactoryRef(ref);
		Assert.assertNotNull(this.fixture.getComponentResourceFactoryRef());
		Assert.assertEquals("New Ref Id", this.fixture.getComponentResourceFactoryRef().getRefid());
	}

	public void test_getNamingService() throws Exception {
		this.setFixture(this.sad.getPartitioning().getHostCollocation().get(0).getComponentPlacement().get(0).getComponentInstantiation().get(0).getFindComponent());

		Assert.assertEquals("FrequencyShift_1", this.fixture.getNamingService().getName());
	}

	public void test_setNamingService() throws Exception {
		this.setFixture(this.sad.getPartitioning().getHostCollocation().get(0).getComponentPlacement().get(0).getComponentInstantiation().get(0).getFindComponent());

		final NamingService name = this.fixture.getNamingService();
		name.setName("New name");

		this.fixture.setNamingService(name);
		Assert.assertNotNull(this.fixture.getNamingService());
		Assert.assertEquals("New name", this.fixture.getNamingService().getName());
	}
} //FindComponentTest
