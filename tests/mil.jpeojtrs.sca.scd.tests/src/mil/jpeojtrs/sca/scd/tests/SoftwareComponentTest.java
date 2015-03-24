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
package mil.jpeojtrs.sca.scd.tests;

import org.junit.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.scd.ComponentFeatures;
import mil.jpeojtrs.sca.scd.ComponentRepId;
import mil.jpeojtrs.sca.scd.ComponentType;
import mil.jpeojtrs.sca.scd.Interface;
import mil.jpeojtrs.sca.scd.Interfaces;
import mil.jpeojtrs.sca.scd.PropertyFile;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getRepId() <em>Rep Id</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SoftwareComponentTest extends TestCase {

	/**
	 * The fixture for this Software Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SoftwareComponent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareComponentTest.class);
	}

	/**
	 * Constructs a new Software Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareComponentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Software Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SoftwareComponent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Software Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareComponent getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScdFactory.eINSTANCE.createSoftwareComponent());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.setFixture(SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true)));

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
		this.resourceSet = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#getRepId() <em>Rep Id</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#getRepId()
	 * @generated NOT
	 */
	public void testGetRepId() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getRepId());
		Assert.assertEquals("IDL:CF/Resource:1.0", this.fixture.getRepId());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.SoftwareComponent#setRepId(java.lang.String) <em>Rep Id</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.SoftwareComponent#setRepId(java.lang.String)
	 * @generated NOT
	 */
	public void testSetRepId() {
		// END GENERATED CODE

		this.fixture.setRepId("New repid");
		Assert.assertNotNull(this.fixture.getRepId());
		Assert.assertEquals("New repid", this.fixture.getRepId());

		this.fixture.setRepId(null);
		Assert.assertNull(this.fixture.getRepId());
		// END GENERATED CODE
	}

	@Test
	public void test_getCorbaVersion() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getCorbaVersion());
		Assert.assertEquals("2.2", this.fixture.getCorbaVersion());
	}

	@Test
	public void test_setCorbaVersion() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		this.fixture.setCorbaVersion("123");
		Assert.assertNotNull(this.fixture.getCorbaVersion());
		Assert.assertEquals("123", this.fixture.getCorbaVersion());
	}

	@Test
	public void test_getComponentRepID() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getComponentRepID());
		Assert.assertEquals("IDL:CF/Resource:1.0", this.fixture.getComponentRepID().getRepid());
	}

	@Test
	public void test_setComponentRepID() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		this.fixture.getComponentRepID().setRepid("New repid");
		Assert.assertNotNull(this.fixture.getComponentRepID());

		Assert.assertEquals("New repid", this.fixture.getComponentRepID().getRepid());

		final ComponentRepId cri = ScdFactory.eINSTANCE.createComponentRepId();
		final Interface iface = ScdFactory.eINSTANCE.createInterface();
		iface.setName("badRep");
		iface.setRepid("badRep");
		cri.setInterface(iface);
		this.fixture.setComponentRepID(cri);
		Assert.assertEquals("badRep", this.fixture.getComponentRepID().getRepid());
		// Check again
		this.fixture.setComponentRepID(cri);
		Assert.assertEquals("badRep", this.fixture.getComponentRepID().getRepid());
	}

	@Test
	public void test_getComponentType() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getComponentType());
		Assert.assertEquals(ComponentType.RESOURCE.toString(), this.fixture.getComponentType());
	}

	@Test
	public void test_setComponentType() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		this.fixture.setComponentType(ComponentType.DEVICE.toString());
		Assert.assertNotNull(this.fixture.getComponentType());
		Assert.assertEquals(ComponentType.DEVICE.toString(), this.fixture.getComponentType());

	}

	@Test
	public void test_getComponentFeatures() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getComponentFeatures());
		Assert.assertNotNull(this.fixture.getComponentFeatures().getPorts().getGroup());
		Assert.assertNotNull(this.fixture.getComponentFeatures().getSupportsInterface());

		Assert.assertEquals(3, this.fixture.getComponentFeatures().getPorts().getGroup().size()); // SUPPRESS CHECKSTYLE MAGIC NUMBER
		Assert.assertEquals(5, this.fixture.getComponentFeatures().getSupportsInterface().size()); // SUPPRESS CHECKSTYLE MAGIC NUMBER

		this.fixture.setComponentFeatures(ScdFactory.eINSTANCE.createComponentFeatures());
		Assert.assertNotNull(this.fixture.getComponentFeatures());
	}

	@Test
	public void test_setComponentFeatures() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		final ComponentFeatures feats = this.fixture.getComponentFeatures();
		Assert.assertNotNull(feats);
		feats.getPorts().getProvides().get(0).setRepID("New value");
		this.fixture.setComponentFeatures(feats);

		Assert.assertNotNull(this.fixture.getComponentFeatures());
		Assert.assertEquals("New value", this.fixture.getComponentFeatures().getPorts().getProvides().get(0).getRepID());
	}

	@Test
	public void test_getInterfaces() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getInterfaces());
		Assert.assertEquals(6, this.fixture.getInterfaces().getInterface().size()); // SUPPRESS CHECKSTYLE MAGIC NUMBER

		Assert.assertEquals("Resource", this.fixture.getInterfaces().getInterface().get(0).getName());
		Assert.assertEquals(4, this.fixture.getInterfaces().getInterface().get(0).getInheritsInterfaces().size()); // SUPPRESS CHECKSTYLE MAGIC NUMBER
		Assert.assertEquals("LifeCycle", this.fixture.getInterfaces().getInterface().get(1).getName());
		Assert.assertEquals("PortSupplier", this.fixture.getInterfaces().getInterface().get(2).getName());
		Assert.assertEquals("PropertySet", this.fixture.getInterfaces().getInterface().get(3).getName()); // SUPPRESS CHECKSTYLE MAGIC NUMBER
		Assert.assertEquals("TestableObject", this.fixture.getInterfaces().getInterface().get(4).getName()); // SUPPRESS CHECKSTYLE MAGIC NUMBER
		Assert.assertEquals("dataFloat", this.fixture.getInterfaces().getInterface().get(5).getName()); // SUPPRESS CHECKSTYLE MAGIC NUMBER
	}

	@Test
	public void test_setInterfaces() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getInterfaces());
		final Interfaces inters = this.fixture.getInterfaces();
		final Interface inter = inters.getInterface().get(0);
		inters.getInterface().clear();
		inter.setName("new name");
		inters.getInterface().add(inter);

		this.fixture.setInterfaces(inters);
		Assert.assertNotNull(this.fixture.getInterfaces());
		Assert.assertEquals("new name", this.fixture.getInterfaces().getInterface().get(0).getName());

		this.fixture.setInterfaces(ScdFactory.eINSTANCE.createInterfaces());
		Assert.assertNotNull(this.fixture.getInterfaces());
		Assert.assertEquals(0, this.fixture.getInterfaces().getInterface().size());
	}

	@Test
	public void test_getPropertyFile() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getPropertyFile());
		Assert.assertNotNull(this.fixture.getPropertyFile().getType());
		Assert.assertNotNull(this.fixture.getPropertyFile().getLocalFile().getName());

		Assert.assertEquals("PRF", this.fixture.getPropertyFile().getType());
		Assert.assertEquals("sample_component.prf.xml", this.fixture.getPropertyFile().getLocalFile().getName());
	}

	@Test
	public void test_setPropertyFile() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		final PropertyFile propFile = this.fixture.getPropertyFile();
		Assert.assertNotNull(propFile);
		propFile.setType("New type");
		this.fixture.setPropertyFile(propFile);

		Assert.assertNotNull(this.fixture.getPropertyFile());
		Assert.assertEquals("New type", this.fixture.getPropertyFile().getType());

		this.fixture.setPropertyFile(ScdFactory.eINSTANCE.createPropertyFile());
		Assert.assertNotNull(this.fixture.getPropertyFile());
		Assert.assertNull(this.fixture.getPropertyFile().getLocalFile());
	}

	@Test
	public void test_toString() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.toString());
	}

} //SoftwareComponentTest
