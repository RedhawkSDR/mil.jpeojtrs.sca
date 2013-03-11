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
package mil.jpeojtrs.sca.spd.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.spd.Descriptor;
import mil.jpeojtrs.sca.spd.Implementation;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.PropertyFile;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Soft Pkg</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkg#getImplementation(java.lang.String) <em>Get Implementation</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SoftPkgTest extends TestCase {

	/**
	 * The fixture for this Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftPkg fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftPkgTest.class);
	}

	/**
	 * Constructs a new Soft Pkg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkgTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SoftPkg fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Soft Pkg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftPkg getFixture() {
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
		this.resourceSet = new ResourceSetImpl();
		setFixture(SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/defaultCpp.spd.xml"), true)));
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

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.SoftPkg#getImplementation(java.lang.String) <em>Get Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.SoftPkg#getImplementation(java.lang.String)
	 * @generated NOT
	 */
	public void testGetImplementation__String() {
		// END GENERATED CODE
		Assert.assertNull(getFixture().getImplementation(null));
		Assert.assertNotNull(getFixture().getImplementation(getFixture().getImplementation().get(0).getId()));
		// BEGIN GENERATED CODE
	}

	public void testParse() throws Exception {
		final Implementation implementation = this.fixture.getImplementation().get(0);
		Assert.assertNotNull(implementation);
		Assert.assertEquals("DCE:3b5527f5-8488-4b09-bfff-2ec49a90cdd8", this.fixture.getId());
		Assert.assertEquals("defaultCpp", this.fixture.getName());
		Assert.assertEquals("Title", this.fixture.getTitle());
		Assert.assertEquals("Author", this.fixture.getAuthor().get(0).getName().get(0));
		Assert.assertEquals("Test Component", this.fixture.getDescription());
		Assert.assertNotNull(this.fixture.getPropertyFile());
		Assert.assertEquals("PRF", this.fixture.getPropertyFile().getType());
		Assert.assertNotNull(this.fixture.getDescriptor());
		Assert.assertEquals("cppDescriptor", this.fixture.getDescriptor().getName());
		Assert.assertEquals(2, this.fixture.getImplementation().size());
		Assert.assertEquals("DCE:9c4257a0-4281-45c7-85f6-a66adc018c7e", this.fixture.getImplementation().get(0).getId());
		Assert.assertEquals(0, this.fixture.getUsesDevice().size());
		Assert.assertNotNull(this.fixture.getType());
		Assert.assertEquals("sca_compliant", this.fixture.getType().getLiteral());
		Assert.assertEquals("1.0", this.fixture.getVersion());
	}

	public void testUtilGetSoftPkg() throws Exception {
		Assert.assertEquals(null, SoftPkg.Util.getSoftPkg(null));
		Assert.assertEquals(this.fixture, SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/defaultCpp.spd.xml"), true)));
	}

	public void testUtilIsAggregateDevice() throws Exception {
		Assert.assertEquals(Boolean.TRUE,
		        SoftPkg.Util.isAggregateDevice(SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testDevice/testDevice.spd.xml"), true))));
		Assert.assertEquals(Boolean.FALSE, SoftPkg.Util.isAggregateDevice(this.fixture));
		Assert.assertEquals(Boolean.FALSE, SoftPkg.Util.isAggregateDevice(null));
	}
	
	public void testExtra() {
		final PropertyFile pf = SpdFactory.eINSTANCE.createPropertyFile();
		final LocalFile lf = SpdFactory.eINSTANCE.createLocalFile();
		lf.setName("defaultCpp.prf.xml");
		pf.setType("RH");
		pf.setLocalFile(lf);
		this.fixture.setPropertyFile(pf);
		Assert.assertNotNull(this.fixture.getPropertyFile());
		Assert.assertEquals("RH", this.fixture.getPropertyFile().getType());
		this.fixture.setPropertyFile(pf);
		Assert.assertEquals("RH", this.fixture.getPropertyFile().getType());
		this.fixture.setPropertyFile(null);
		Assert.assertNull(this.fixture.getPropertyFile());

		final Descriptor desc = SpdFactory.eINSTANCE.createDescriptor();
		lf.setName("SoftwareComponentTest.scd.xml");
		desc.setName("TestDescriptor");
		desc.setLocalfile(lf);
		this.fixture.setDescriptor(desc);
		Assert.assertNotNull(this.fixture.getDescriptor());
		Assert.assertEquals("TestDescriptor", this.fixture.getDescriptor().getName());
		this.fixture.setDescriptor(desc);
		Assert.assertEquals("TestDescriptor", this.fixture.getDescriptor().getName());
		this.fixture.setDescriptor(null);
		Assert.assertNull(this.fixture.getDescriptor());
		
		this.fixture.unsetType();
		Assert.assertEquals("sca_compliant", this.fixture.getType().getLiteral());
		Assert.assertFalse(this.fixture.isSetType());

		this.fixture.setType(null);
		Assert.assertEquals("sca_compliant", this.fixture.getType().getLiteral());
		Assert.assertTrue(this.fixture.isSetType());
	}
} // SoftPkgTest
