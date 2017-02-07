/**
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 */
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.sad.tests;

import org.junit.Assert;
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.partitioning.ComponentFiles;
import mil.jpeojtrs.sca.sad.AssemblyController;
import mil.jpeojtrs.sca.sad.ExternalPorts;
import mil.jpeojtrs.sca.sad.HostCollocation;
import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;
import mil.jpeojtrs.sca.sad.SadComponentPlacement;
import mil.jpeojtrs.sca.sad.SadConnectInterface;
import mil.jpeojtrs.sca.sad.SadConnections;
import mil.jpeojtrs.sca.sad.SadPartitioning;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Software Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentInstantiation(java.lang.String) <em>Get Component Instantiation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentInstantiationsInStartOrder() <em>Get Component Instantiations In Start Order</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getAllComponentInstantiations() <em>Get All Component Instantiations</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SoftwareAssemblyTest extends TestCase {

	/**
	 * The fixture for this Software Assembly test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SoftwareAssembly fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SoftwareAssemblyTest.class);
	}

	/**
	 * Constructs a new Software Assembly test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAssemblyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Software Assembly test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SoftwareAssembly fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Software Assembly test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareAssembly getFixture() {
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
		this.setFixture(this.sad);
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
	 * Tests the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentInstantiation(java.lang.String) <em>Get Component Instantiation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentInstantiation(java.lang.String)
	 * @generated NOT
	 */
	public void testGetComponentInstantiation__String() {
		// END GENERATED CODE
		Assert.assertNull(getFixture().getComponentInstantiation(null));
		Assert.assertNull(getFixture().getComponentInstantiation(""));
		Assert.assertNotNull(getFixture().getAllComponentInstantiations().get(0).getId());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentInstantiationsInStartOrder() <em>Get Component Instantiations In Start Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponentInstantiationsInStartOrder()
	 * @generated NOT
	 */
	public void testGetComponentInstantiationsInStartOrder() {
		// END GENERATED CODE
		EList<SadComponentInstantiation> list = getFixture().getComponentInstantiationsInStartOrder();
		SadComponentInstantiation prev = null;

		for (SadComponentInstantiation inst : list) {
			if (prev != null && inst.getStartOrder() != null) {
				Assert.assertTrue(prev.getStartOrder().compareTo(inst.getStartOrder()) < 0);
			}
			prev = inst;
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getAllComponentInstantiations() <em>Get All Component Instantiations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getAllComponentInstantiations()
	 * @generated NOT
	 */
	public void testGetAllComponentInstantiations() {
		// END GENERATED CODE
		int size = 0;
		size += getFixture().getPartitioning().getComponentPlacement().size();
		for (HostCollocation h : getFixture().getPartitioning().getHostCollocation()) {
			size += h.getComponentPlacement().size();
		}
		Assert.assertEquals(size, getFixture().getAllComponentInstantiations().size());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponents() <em>Components</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getComponents()
	 * @generated NOT
	 */
	public void testGetComponents() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture);

		for (final SadComponentPlacement comp : this.fixture.getPartitioning().getComponentPlacement()) {
			Assert.assertNotNull(comp);
		}

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getConnectInterfaces() <em>Connect Interfaces</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getConnectInterfaces()
	 * @generated NOT
	 */
	public void testGetConnectInterfaces() {
		// END GENERATED CODE

		for (final SadConnectInterface con : this.fixture.getConnections().getConnectInterface()) {
			Assert.assertNotNull(con);
		}

		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.sad.SoftwareAssembly#getHostCollocation() <em>Host Collocation</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.sad.SoftwareAssembly#getHostCollocation()
	 * @generated NOT
	 */
	public void testGetHostCollocation() {
		// END GENERATED CODE

		Assert.assertNotNull(this.fixture.getPartitioning().getHostCollocation().get(0));

		final HostCollocation host = this.fixture.getPartitioning().getHostCollocation().get(0);

		Assert.assertEquals("Host Collocation", host.getName());
		Assert.assertEquals("DCE:46da4d56-44ac-48a8-bae8-56632da98a87", host.getId());

		// BEGIN GENERATED CODE
	}

	public void test_getDescription() throws Exception {
		Assert.assertNotNull(this.fixture.getDescription());
		Assert.assertEquals("A simple waveform, at least it started as one", this.fixture.getDescription());
	}

	public void test_setDescription() throws Exception {
		this.fixture.setDescription("Test-set description");
		Assert.assertNotNull(this.fixture.getDescription());
	}

	public void test_getName() throws Exception {
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertEquals("GenericSadFile", this.fixture.getName());
	}

	public void test_getVersion() throws Exception {
		Assert.assertNotNull(this.fixture.getVersion());
		Assert.assertEquals("Alpha", this.fixture.getVersion());
	}

	public void test_setVersion() throws Exception {
		this.fixture.setVersion("1234123890123 - Revision CAT");
		Assert.assertNotNull(this.fixture.getVersion());
	}

	public void test_getAssemblyController() throws Exception {
		Assert.assertNotNull(this.fixture.getAssemblyController());
		Assert.assertEquals("DCE:75fb00d8-48c7-4e74-a98b-2e2465a29f6c", this.fixture.getAssemblyController().getComponentInstantiationRef().getRefid());
	}

	public void test_getComponentFiles() throws Exception {
		Assert.assertNotNull(this.fixture.getComponentFiles().getComponentFile().get(0));
		Assert.assertEquals("Reader_d05f7b78-a149-424e-a771-a8e183405b9e", this.fixture.getComponentFiles().getComponentFile().get(0).getId());
	}

	public void test_getConnections() throws Exception {
		boolean hasId = false;
		for (final SadConnectInterface inter : this.fixture.getConnections().getConnectInterface()) {
			Assert.assertNotNull(inter);

			if (inter.getId().equals("DCE:a89a195d-5dcc-43f6-8e9d-aefb5686c927")) {
				hasId = true;
				break;
			}
		}

		Assert.assertTrue(hasId);
	}

	public void test_getExternalPorts() throws Exception {
		boolean hasPort = false;
		for (final Port port : this.fixture.getExternalPorts().getPort()) {
			Assert.assertNotNull(port);

			if (port.getUsesIdentifier().equals("externalPort")) {
				hasPort = true;
				break;
			}
		}

		Assert.assertTrue(hasPort);
	}

	public void test_getId() throws Exception {
		Assert.assertNotNull(this.fixture.getId());
		Assert.assertEquals("DCE:df4f0e1c-a242-4b76-ae1d-bef1b63cedfe", this.fixture.getId());
	}

	public void test_getPartitioning() throws Exception {
		Assert.assertNotNull(this.fixture.getPartitioning());
		Assert.assertEquals(2, this.fixture.getPartitioning().getParts().size());
	}

	public void test_setAssemblyController() throws Exception {
		final AssemblyController control = this.fixture.getAssemblyController();
		Assert.assertNotNull(control);
		control.getComponentInstantiationRef().setRefid("New refid");
		this.fixture.setAssemblyController(control);

		Assert.assertNotNull(this.fixture.getAssemblyController());
		Assert.assertEquals("New refid", this.fixture.getAssemblyController().getComponentInstantiationRef().getRefid());
	}

	public void test_setComponentFiles() throws Exception {
		final ComponentFiles files = this.fixture.getComponentFiles();
		Assert.assertNotNull(files);
		files.getComponentFile().get(0).setId("New id");
		this.fixture.setComponentFiles(files);

		Assert.assertNotNull(this.fixture.getComponentFiles());
		Assert.assertEquals("New id", this.fixture.getComponentFiles().getComponentFile().get(0).getId());
	}

	public void test_setConnections() throws Exception {
		final SadConnections connects = this.fixture.getConnections();
		Assert.assertNotNull(connects);
		connects.getConnectInterface().get(0).setId("New id");
		this.fixture.setConnections(connects);

		Assert.assertNotNull(this.fixture.getConnections());
		Assert.assertEquals("New id", this.fixture.getConnections().getConnectInterface().get(0).getId());
	}

	public void test_setExternalPorts() throws Exception {
		final ExternalPorts ports = this.fixture.getExternalPorts();
		Assert.assertNotNull(ports);
		ports.getPort().get(0).setDescription("New description");
		this.fixture.setExternalPorts(ports);

		Assert.assertNotNull(this.fixture.getExternalPorts());
		Assert.assertEquals("New description", this.fixture.getExternalPorts().getPort().get(0).getDescription());
	}

	public void test_setId() throws Exception {
		this.fixture.setId("New id");
		Assert.assertNotNull(this.fixture.getId());
		Assert.assertEquals("New id", this.fixture.getId());
	}

	public void test_setName() throws Exception {
		this.fixture.setName("A new name");
		Assert.assertNotNull(this.fixture.getName());
		Assert.assertEquals("A new name", this.fixture.getName());
	}

	public void test_setPartitioning() throws Exception {
		final SadPartitioning parts = this.fixture.getPartitioning();
		Assert.assertNotNull(parts);
		parts.getHostCollocation().get(0).setId("New id");
		this.fixture.setPartitioning(parts);

		Assert.assertNotNull(this.fixture.getPartitioning().getHostCollocation().get(0).getId());
		Assert.assertEquals("New id", this.fixture.getPartitioning().getHostCollocation().get(0).getId());
	}

	public void test_toString() throws Exception {
		Assert.assertNotNull(this.fixture.toString());
	}

} //SoftwareAssemblyTest
