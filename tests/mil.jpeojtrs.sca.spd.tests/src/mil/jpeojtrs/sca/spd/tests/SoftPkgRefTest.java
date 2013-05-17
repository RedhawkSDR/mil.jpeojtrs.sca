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
import mil.jpeojtrs.sca.spd.Dependency;
import mil.jpeojtrs.sca.spd.ImplRef;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SoftPkgRef;
import mil.jpeojtrs.sca.spd.SpdFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Soft Pkg Ref</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getImplementation() <em>Implementation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getSoftPkg() <em>Soft Pkg</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SoftPkgRefTest extends TestCase {

	/**
	 * The fixture for this Soft Pkg Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftPkgRef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftPkgRefTest.class);
	}

	/**
	 * Constructs a new Soft Pkg Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftPkgRefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Soft Pkg Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SoftPkgRef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Soft Pkg Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftPkgRef getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;
	private SoftPkg softPkg;
	private Dependency dependency;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		this.resourceSet = new ResourceSetImpl();
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/dependency.spd.xml"), true));
		this.dependency = softPkg.getImplementation().get(0).getDependency().get(1);
		this.fixture = this.dependency.getSoftPkgRef();
		this.softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testDevice/testDevice.spd.xml"), true));
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
		this.softPkg = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getSoftPkg()
	 * <em>Soft Pkg</em>}' feature getter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef#getSoftPkg()
	 * @generated NOT
	 */
	public void testGetSoftPkg() {
		// END GENERATED CODE
		Assert.assertNotNull(this.fixture.getSoftPkg());
		Assert.assertEquals("usesdevice.spd.xml", this.fixture.getLocalFile().getName());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '
	 * {@link mil.jpeojtrs.sca.spd.SoftPkgRef#setSoftPkg(mil.jpeojtrs.sca.spd.SoftPkg)
	 * <em>Soft Pkg</em>}' feature setter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef#setSoftPkg(mil.jpeojtrs.sca.spd.SoftPkg)
	 * @generated NOT
	 */
	public void testSetSoftPkg() {
		// END GENERATED CODE
		Assert.assertNotNull(this.fixture.getSoftPkg());
		this.fixture.setLocalFile(null);
		Assert.assertNull(this.fixture.getLocalFile());
		this.fixture.setSoftPkg(this.softPkg);
		Assert.assertNotNull(this.fixture.getSoftPkg());
		//		Assert.assertEquals(this.fixture.getLocalFile().getName(), "../testDevice/testDevice.spd.xml");
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#getImplementation() <em>Implementation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef#getImplementation()
	 * @generated NOT
	 */
	public void testGetImplementation() {
		// END GENERATED CODE
		getFixture().getImplementation();
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.SoftPkgRef#setImplementation(mil.jpeojtrs.sca.spd.Implementation) <em>Implementation</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.SoftPkgRef#setImplementation(mil.jpeojtrs.sca.spd.Implementation)
	 * @generated NOT
	 */
	public void testSetImplementation() {
		// END GENERATED CODE
		getFixture().setImplementation(null);
		// END GENERATED CODE
	}

	/**
	 * @generated NOT
	 */
	public void testSetLocalFile() {
		// END GENERATED CODE
		this.fixture.setSoftPkg(this.softPkg);
		final String oldFileName = this.fixture.getLocalFile().getName();
		final LocalFile localFile = this.softPkg.getImplementation().get(0).getCode().getLocalFile();
		this.fixture.setLocalFile(localFile);
		Assert.assertFalse(oldFileName.equals(this.fixture.getLocalFile().getName()));
		Assert.assertEquals(localFile.getName(), this.fixture.getLocalFile().getName());

		this.fixture.setLocalFile(localFile);
		Assert.assertEquals(localFile.getName(), this.fixture.getLocalFile().getName());
		// BEGIN GENERATED CODE
	}

	public void testParse() throws Exception {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/dependency.spd.xml"), true));
		final Dependency implRefDep = softPkg.getImplementation().get(0).getDependency().get(2);
		Assert.assertNotNull(implRefDep.getSoftPkgRef().getImplRef());
		Assert.assertEquals("DCE:8a018a00-ddbc-4525-99f2-06c923c2a777", implRefDep.getSoftPkgRef().getImplRef().getRefid());

		final ImplRef implRef = SpdFactory.eINSTANCE.createImplRef();
		implRef.setRefid("DCE:8a018a00-ddbc-4525-99f2-06c923c2a778");
		implRefDep.getSoftPkgRef().setImplRef(implRef);
		Assert.assertEquals("DCE:8a018a00-ddbc-4525-99f2-06c923c2a778", implRefDep.getSoftPkgRef().getImplRef().getRefid());
	}

} // SoftPkgRefTest
