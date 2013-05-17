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
package mil.jpeojtrs.sca.spd.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.PropertyFile;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Property File</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.PropertyFile#getProperties() <em>Properties</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PropertyFileTest extends TestCase {

	/**
	 * The fixture for this Property File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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

	private PropertyFile propertyFile;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createPropertyFile());
		final ResourceSet resourceSet = new ResourceSetImpl();
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(resourceSet.getResource(SpdTests.getURI("testFiles/defaultCpp.spd.xml"), true));
		this.propertyFile = softPkg.getPropertyFile();
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
		this.propertyFile = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.PropertyFile#getProperties()
	 * <em>Properties</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.spd.PropertyFile#getProperties()
	 * @generated NOT
	 */
	public void testGetProperties() {
		// END GENERATED CODE
		Assert.assertNotNull(this.propertyFile.getProperties());
		Assert.assertEquals("PRF", this.propertyFile.getType());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '
	 * {@link mil.jpeojtrs.sca.spd.PropertyFile#setProperties(mil.jpeojtrs.sca.prf.Properties)
	 * <em>Properties</em>}' feature setter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.spd.PropertyFile#setProperties(mil.jpeojtrs.sca.prf.Properties)
	 * @generated NOT
	 */
	public void testSetProperties() {
		// END GENERATED CODE
		final LocalFile lf = SpdFactory.eINSTANCE.createLocalFile();
		lf.setName("defaultCpp.prf.xml");
		this.propertyFile.setLocalFile(lf);
		Assert.assertNotNull(this.propertyFile.getLocalFile());
		Assert.assertEquals("defaultCpp.prf.xml", this.propertyFile.getLocalFile().getName());

		this.propertyFile.setLocalFile(lf);
		Assert.assertNotNull(this.propertyFile.getLocalFile());
		Assert.assertEquals("defaultCpp.prf.xml", this.propertyFile.getLocalFile().getName());

		this.propertyFile.setLocalFile(null);
		// END GENERATED CODE
	}

} // PropertyFileTest
