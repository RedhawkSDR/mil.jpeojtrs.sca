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

import java.io.IOException;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.spd.Dependency;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.PropertyRef;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SoftPkgRef;
import mil.jpeojtrs.sca.spd.SpdFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Dependency#getPropertyRef() <em>Property Ref</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DependencyTest extends TestCase {

	/**
	 * The fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dependency fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependencyTest.class);
	}

	/**
	 * Constructs a new Dependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dependency fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dependency getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createDependency());
		this.resourceSet = new ResourceSetImpl();
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
	 * Tests the '{@link mil.jpeojtrs.sca.spd.Dependency#getPropertyRef() <em>Property Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.Dependency#getPropertyRef()
	 * @generated NOT
	 */
	public void testGetPropertyRef() {
		// END GENERATED CODE
		getFixture().getPropertyRef();
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.Dependency#setPropertyRef(mil.jpeojtrs.sca.spd.PropertyRef) <em>Property Ref</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.Dependency#setPropertyRef(mil.jpeojtrs.sca.spd.PropertyRef)
	 * @generated NOT
	 */
	public void testSetPropertyRef() {
		// END GENERATED CODE
		getFixture().setPropertyRef(null);
		Assert.assertNull(getFixture().getPropertyRef());
		// END GENERATED CODE
	}

	public void testParse() throws IOException {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/dependency.spd.xml"), true));
		final Dependency dep = softPkg.getImplementation().get(0).getDependency().get(0);
		Assert.assertEquals("allocation", dep.getType());
		Assert.assertEquals("DCE:56b2eda0-1dea-47c3-8392-93e496a8a9b5", dep.getPropertyRef().getRefId());
		Assert.assertEquals("400000", dep.getPropertyRef().getValue());
		Assert.assertNull(dep.getSoftPkgRef());
	}

	public void testExtra() throws IOException {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/dependency.spd.xml"), true));
		Dependency dep = softPkg.getImplementation().get(0).getDependency().get(1);
		Assert.assertNotNull(dep);
		Assert.assertEquals("matching", dep.getType());
		Assert.assertNull(dep.getPropertyRef());
		Assert.assertEquals("usesdevice.spd.xml", dep.getSoftPkgRef().getLocalFile().getName());
		Assert.assertEquals("DCE:e0881e04-30aa-46c9-a9d3-6888fe15c151", dep.getSoftPkgRef().getSoftPkg().getId());

		final SoftPkgRef spr = SpdFactory.eINSTANCE.createSoftPkgRef();
		final LocalFile lf = SpdFactory.eINSTANCE.createLocalFile();
		lf.setName("defaultCpp.spd.xml");
		spr.setLocalFile(lf);
		dep.setSoftPkgRef(spr);
		Assert.assertNotNull(dep.getSoftPkgRef());
		Assert.assertEquals("defaultCpp.spd.xml", dep.getSoftPkgRef().getLocalFile().getName());

		dep.setSoftPkgRef(spr);
		Assert.assertNotNull(dep.getSoftPkgRef());
		Assert.assertEquals("defaultCpp.spd.xml", dep.getSoftPkgRef().getLocalFile().getName());

		final PropertyRef pr = SpdFactory.eINSTANCE.createPropertyRef();
		pr.setRefId("DCE:8960856a-b9ff-43a4-bdd6-797beb3d0c44");
		pr.setValue("test");
		dep = softPkg.getImplementation().get(0).getDependency().get(0);
		dep.setPropertyRef(pr);
		Assert.assertNotNull(dep.getPropertyRef());
		Assert.assertEquals("DCE:8960856a-b9ff-43a4-bdd6-797beb3d0c44", dep.getPropertyRef().getRefId());

		dep.setPropertyRef(pr);
		Assert.assertNotNull(dep.getPropertyRef());
		Assert.assertEquals("DCE:8960856a-b9ff-43a4-bdd6-797beb3d0c44", dep.getPropertyRef().getRefId());
	}
} //DependencyTest
