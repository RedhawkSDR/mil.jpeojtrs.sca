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

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.scd.LocalFile;
import mil.jpeojtrs.sca.scd.PropertyFile;
import mil.jpeojtrs.sca.scd.ScdFactory;
import mil.jpeojtrs.sca.scd.SoftwareComponent;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.PropertyFile#getProperties() <em>Properties</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PropertyFileTest extends TestCase {

	/**
	 * The fixture for this Property File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PropertyFile fixture = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyFileTest.class);
	}

	/**
	 * Constructs a new Property File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFileTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Property File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PropertyFile fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Property File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyFile getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet = null;
	private SoftwareComponent scd = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScdFactory.eINSTANCE.createPropertyFile());
		final ResourceSet set = new ResourceSetImpl();
		this.resourceSet = set;
		this.scd = SoftwareComponent.Util.getSoftwareComponent(this.resourceSet.getResource(ScdTests.getURI("testFiles/sample_component.scd.xml"), true));
		this.setFixture(this.scd.getPropertyFile());
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
		this.scd = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.PropertyFile#getProperties() <em>Properties</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.PropertyFile#getProperties()
	 * @generated NOT
	 */
	public void testGetProperties() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture);
		Assert.assertNotNull(this.fixture.getProperties());

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.scd.PropertyFile#setProperties(mil.jpeojtrs.sca.prf.Properties) <em>Properties</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.scd.PropertyFile#setProperties(mil.jpeojtrs.sca.prf.Properties)
	 * @generated NOT
	 */
	public void testSetProperties() {
		// END GENERATED CODE

		final Properties props = this.fixture.getProperties();
		Assert.assertNotNull(props);
		props.setDescription("New description");
		this.fixture.setProperties(props);

		Assert.assertNotNull(this.fixture.getProperties());
		// END GENERATED CODE
	}

	@Test
	public void test_getLocalFile() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getLocalFile());
		Assert.assertEquals("sample_component.prf.xml", this.fixture.getLocalFile().getName());
	}

	@Test
	public void test_setLocalFile() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		final Properties oldProps = this.fixture.getProperties();
		final LocalFile file = this.fixture.getLocalFile();
		Assert.assertNotNull(file);
		file.setName("New file name");
		this.fixture.setLocalFile(file);

		Assert.assertNotNull(this.fixture.getLocalFile());
		Assert.assertEquals("New file name", this.fixture.getLocalFile().getName());
		
		final LocalFile lf = ScdFactory.eINSTANCE.createLocalFile();
		lf.setName("BadFIleName.prf.xml");
		this.fixture.setLocalFile(lf);
		Assert.assertNotNull(this.fixture.getLocalFile());
		Assert.assertEquals("BadFIleName.prf.xml", this.fixture.getLocalFile().getName());
		
		this.fixture.setLocalFile(null);
		Assert.assertNull(this.fixture.getLocalFile());
		Assert.assertNull(this.fixture.getProperties());
		
		this.fixture.setProperties(oldProps);
		Assert.assertNotNull(this.fixture.getLocalFile());
	}

	@Test
	public void test_getType() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.getType());
		Assert.assertEquals("PRF", this.fixture.getType());
	}

	@Test
	public void test_setType() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		this.fixture.setType("New type");
		Assert.assertNotNull(this.fixture.getType());
		Assert.assertEquals("New type", this.fixture.getType());
	}

	@Test
	public void test_toString() throws Exception { // SUPPRESS CHECKSTYLE METHOD NAME
		Assert.assertNotNull(this.fixture.toString());
	}

} //PropertyFileTest
