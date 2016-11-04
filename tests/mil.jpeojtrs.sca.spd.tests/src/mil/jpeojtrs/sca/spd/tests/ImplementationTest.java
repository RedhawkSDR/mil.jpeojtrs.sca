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
import mil.jpeojtrs.sca.spd.Code;
import mil.jpeojtrs.sca.spd.CodeFileType;
import mil.jpeojtrs.sca.spd.Compiler;
import mil.jpeojtrs.sca.spd.HumanLanguage;
import mil.jpeojtrs.sca.spd.Implementation;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.ProgrammingLanguage;
import mil.jpeojtrs.sca.spd.PropertyFile;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getOs() <em>Os</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getProcessor() <em>Processor</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#getDependency() <em>Dependency</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#isExecutable() <em>Is Executable</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.spd.Implementation#isSharedLibrary() <em>Is Shared Library</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ImplementationTest extends TestCase {

	/**
	 * The fixture for this Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Implementation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImplementationTest.class);
	}

	/**
	 * Constructs a new Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Implementation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Implementation getFixture() {
		return fixture;
	}

	private ResourceSet resourceSet;
	private Implementation implementation;
	private static final String id = "testID";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpdFactory.eINSTANCE.createImplementation());
		this.resourceSet = new ResourceSetImpl();
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/dependency.spd.xml"), true));
		this.implementation = softPkg.getImplementation().get(0);

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
		this.implementation = null;
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.Implementation#getOs() <em>Os</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.Implementation#getOs()
	 * @generated NOT
	 */
	public void testGetOs() {
		// END GENERATED CODE
		Assert.assertNotNull(this.implementation.getOs().get(0));
		Assert.assertEquals("Linux", this.implementation.getOs().get(0).getName());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.Implementation#getProcessor() <em>Processor</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.Implementation#getProcessor()
	 * @generated NOT
	 */
	public void testGetProcessor() {
		// END GENERATED CODE
		Assert.assertNotNull(this.implementation.getProcessor().get(0));
		Assert.assertEquals("x86", this.implementation.getProcessor().get(0).getName());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.Implementation#getDependency() <em>Dependency</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.Implementation#getDependency()
	 * @generated NOT
	 */
	public void testGetDependency() {
		// END GENERATED CODE
		Assert.assertNotNull(this.implementation.getDependency().get(0));
		Assert.assertEquals("400000", this.implementation.getDependency().get(0).getPropertyRef().getValue());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.Implementation#isExecutable() <em>Is Executable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.Implementation#isExecutable()
	 * @generated NOT
	 */
	public void testIsExecutable() {
		// END GENERATED CODE
		Assert.assertTrue(this.implementation.isExecutable());

		Assert.assertFalse(getFixture().isExecutable());

		getFixture().setCode(SpdFactory.eINSTANCE.createCode());
		Assert.assertFalse(getFixture().isExecutable());

		getFixture().getCode().setType(CodeFileType.EXECUTABLE);
		getFixture().getCode().setEntryPoint("entrypoint");
		Assert.assertTrue(getFixture().isExecutable());

		getFixture().getCode().setType(CodeFileType.SHARED_LIBRARY);
		Assert.assertTrue(getFixture().isExecutable());

		getFixture().getCode().setEntryPoint(null);
		Assert.assertFalse(getFixture().isExecutable());

		getFixture().getCode().setType(CodeFileType.EXECUTABLE);
		Assert.assertFalse(getFixture().isExecutable());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.spd.Implementation#isSharedLibrary() <em>Is Shared Library</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.spd.Implementation#isSharedLibrary()
	 * @generated NOT
	 */
	public void testIsSharedLibrary() {
		// END GENERATED CODE
		Assert.assertFalse(this.implementation.isSharedLibrary());

		Assert.assertFalse(getFixture().isSharedLibrary());

		getFixture().setCode(SpdFactory.eINSTANCE.createCode());
		getFixture().getCode().setType(CodeFileType.EXECUTABLE);
		Assert.assertFalse(getFixture().isSharedLibrary());

		getFixture().getCode().setEntryPoint("entrypoint");
		getFixture().getCode().setType(CodeFileType.SHARED_LIBRARY);
		Assert.assertFalse(getFixture().isSharedLibrary());

		getFixture().getCode().setEntryPoint(null);
		Assert.assertTrue(getFixture().isSharedLibrary());
		// BEGIN GENERATED CODE
	}

	/**
	 * @generated NOT
	 */
	public void testEqualsReflexivity() throws Exception {
		// END GENERATED CODE
		Assert.assertTrue(this.implementation.equals(this.implementation));
		// BEGIN GENERATED CODE
	}

	/**
	 * @generated NOT
	 */
	public void testEqualsSymmetry() throws Exception {
		// END GENERATED CODE
		final Implementation impl = SpdFactory.eINSTANCE.createImplementation();
		final Implementation impl2 = SpdFactory.eINSTANCE.createImplementation();
		impl.setId(ImplementationTest.id);
		impl2.setId(ImplementationTest.id);

		Assert.assertTrue(impl.equals(impl2));
		Assert.assertTrue(impl2.equals(impl));
		// BEGIN GENERATED CODE
	}

	/**
	 * @generated NOT
	 */
	public void testEqualsTransitivity() throws Exception {
		// END GENERATED CODE
		final Implementation impl = SpdFactory.eINSTANCE.createImplementation();
		final Implementation impl2 = SpdFactory.eINSTANCE.createImplementation();
		final Implementation impl3 = SpdFactory.eINSTANCE.createImplementation();
		impl.setId(ImplementationTest.id);
		impl2.setId(ImplementationTest.id);
		impl3.setId(ImplementationTest.id);

		if (impl.equals(impl2) && impl.equals(impl3)) {
			Assert.assertTrue(impl2.equals(impl3));
		} else {
			Assert.assertTrue(impl.equals(impl2));
			Assert.assertTrue(impl.equals(impl3));
		}
		// BEGIN GENERATED CODE
	}

	/**
	 * @generated NOT
	 */
	public void testEqualsNull() throws Exception {
		// END GENERATED CODE
		Assert.assertNotNull(this.implementation);
		Assert.assertFalse(this.implementation.equals(null));
		// BEGIN GENERATED CODE
	}

	/**
	 * @generated NOT
	 */
	public void testHashCode() {
		// END GENERATED CODE
		final Implementation impl = SpdFactory.eINSTANCE.createImplementation();
		final Implementation impl2 = SpdFactory.eINSTANCE.createImplementation();
		final Implementation impl3 = SpdFactory.eINSTANCE.createImplementation();
		impl.setId(ImplementationTest.id);
		impl2.setId(ImplementationTest.id);

		Assert.assertTrue(impl.hashCode() == impl2.hashCode());
		Assert.assertFalse(impl.hashCode() == this.implementation.hashCode());
		Assert.assertFalse(impl.hashCode() == impl3.hashCode());
		// BEGIN GENERATED CODE
	}

	public void testParse() {
		Assert.assertNotNull(this.implementation);
		Assert.assertEquals("DCE:9c4257a0-4281-45c7-85f6-a66adc018c7e", this.implementation.getId());
		Assert.assertEquals("aep_compliant", this.implementation.getAepCompliance().getLiteral());
		Assert.assertEquals("The implementation contains descriptive information about the template for a software component.",
			this.implementation.getDescription());
		Assert.assertNotNull(this.implementation.getCode());
		Assert.assertEquals("Executable", this.implementation.getCode().getType().getName());
		Assert.assertNotNull(this.implementation.getCompiler());
		Assert.assertEquals("/usr/bin/gcc", this.implementation.getCompiler().getName());
		Assert.assertNotNull(this.implementation.getProgrammingLanguage());
		Assert.assertEquals("C++", this.implementation.getProgrammingLanguage().getName());
		Assert.assertNotNull(this.implementation.getHumanLanguage());
		Assert.assertEquals("EN", this.implementation.getHumanLanguage().getName());
		Assert.assertFalse(this.implementation.equals(this.implementation.getCode()));
		Assert.assertNull(this.implementation.getPropertyFile());
	}

	public void testExtra() {
		Assert.assertNotNull(this.implementation);
		Assert.assertEquals("aep_compliant", this.implementation.getAepCompliance().getLiteral());

		this.implementation.unsetAepCompliance();
		Assert.assertEquals("aep_compliant", this.implementation.getAepCompliance().getLiteral());
		Assert.assertFalse(this.implementation.isSetAepCompliance());

		this.implementation.setAepCompliance(null);
		Assert.assertEquals("aep_compliant", this.implementation.getAepCompliance().getLiteral());
		Assert.assertTrue(this.implementation.isSetAepCompliance());

		mil.jpeojtrs.sca.spd.Runtime runtime = SpdFactory.eINSTANCE.createRuntime();
		runtime.setName("OutRun");
		runtime.setVersion("1986");
		this.implementation.setRuntime(runtime);
		Assert.assertNotNull(this.implementation.getRuntime());
		Assert.assertEquals("OutRun", this.implementation.getRuntime().getName());
		this.implementation.setRuntime(runtime);
		Assert.assertEquals("OutRun", this.implementation.getRuntime().getName());

		HumanLanguage hl = SpdFactory.eINSTANCE.createHumanLanguage();
		hl.setName("Latin");
		this.implementation.setHumanLanguage(hl);
		Assert.assertNotNull(this.implementation.getHumanLanguage());
		Assert.assertEquals("Latin", this.implementation.getHumanLanguage().getName());
		this.implementation.setHumanLanguage(hl);
		Assert.assertEquals("Latin", this.implementation.getHumanLanguage().getName());

		ProgrammingLanguage pl = SpdFactory.eINSTANCE.createProgrammingLanguage();
		pl.setName("Ruby");
		this.implementation.setProgrammingLanguage(pl);
		Assert.assertNotNull(this.implementation.getProgrammingLanguage());
		Assert.assertEquals("Ruby", this.implementation.getProgrammingLanguage().getName());
		this.implementation.setProgrammingLanguage(pl);
		Assert.assertEquals("Ruby", this.implementation.getProgrammingLanguage().getName());

		Compiler cplr = SpdFactory.eINSTANCE.createCompiler();
		cplr.setName("/usr/bin/elf90");
		cplr.setVersion("90");
		this.implementation.setCompiler(cplr);
		Assert.assertNotNull(this.implementation.getCompiler());
		Assert.assertEquals("90", this.implementation.getCompiler().getVersion());
		this.implementation.setCompiler(cplr);
		Assert.assertEquals("90", this.implementation.getCompiler().getVersion());

		Code code = SpdFactory.eINSTANCE.createCode();
		code.setEntryPoint("my/entrypoint");
		code.setType(CodeFileType.DRIVER);
		this.implementation.setCode(code);
		Assert.assertNotNull(this.implementation.getCode());
		Assert.assertEquals("my/entrypoint", this.implementation.getCode().getEntryPoint());
		this.implementation.setCode(code);
		Assert.assertEquals("my/entrypoint", this.implementation.getCode().getEntryPoint());

		PropertyFile pf = SpdFactory.eINSTANCE.createPropertyFile();
		LocalFile lf = SpdFactory.eINSTANCE.createLocalFile();
		lf.setName("defaultCpp.prf.xml");
		pf.setType("PRF");
		pf.setLocalFile(lf);
		this.implementation.setPropertyFile(pf);
		Assert.assertNotNull(this.implementation.getPropertyFile());
		Assert.assertEquals("PRF", this.implementation.getPropertyFile().getType());
		this.implementation.setPropertyFile(pf);
		Assert.assertEquals("PRF", this.implementation.getPropertyFile().getType());
		this.implementation.setPropertyFile(null);
		Assert.assertNull(this.implementation.getPropertyFile());
	}
} //ImplementationTest
