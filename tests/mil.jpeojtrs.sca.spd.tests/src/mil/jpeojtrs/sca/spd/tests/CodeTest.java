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
import mil.jpeojtrs.sca.spd.Code;
import mil.jpeojtrs.sca.spd.CodeFileType;
import mil.jpeojtrs.sca.spd.LocalFile;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Code</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class CodeTest extends TestCase {

	/**
	 * The fixture for this Code test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Code fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CodeTest.class);
	}

	/**
	 * Constructs a new Code test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Code test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Code fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Code test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Code getFixture() {
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
		setFixture(SpdFactory.eINSTANCE.createCode());
		this.resourceSet = new ResourceSetImpl();
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

	public void testParse() throws IOException {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/defaultCpp.spd.xml"), true));
		final Code code = softPkg.getImplementation().get(0).getCode();
		Assert.assertEquals(CodeFileType.EXECUTABLE, code.getType());
		Assert.assertEquals("defaultCpp_cpp_impl1/defaultCpp_cpp_impl1", code.getLocalFile().getName());
		Assert.assertEquals("defaultCpp_cpp_impl1/defaultCpp_cpp_impl1", code.getEntryPoint());
		Assert.assertEquals(1024, code.getStackSize().longValue());
		Assert.assertEquals(1, code.getPriority().longValue());
	}
	
	public void testExtra() throws IOException {
		final SoftPkg softPkg = SoftPkg.Util.getSoftPkg(this.resourceSet.getResource(SpdTests.getURI("testFiles/defaultCpp.spd.xml"), true));
		final Code code = softPkg.getImplementation().get(0).getCode();

		code.setType(CodeFileType.SHARED_LIBRARY);
		Assert.assertEquals(CodeFileType.SHARED_LIBRARY_VALUE, code.getType().getValue());
		
		code.setType(null);
		Assert.assertEquals(CodeFileType.EXECUTABLE, code.getType());
		
		code.unsetType();
		Assert.assertEquals(CodeFileType.EXECUTABLE, code.getType());
		Assert.assertFalse(code.isSetType());
		
		final LocalFile lf = SpdFactory.eINSTANCE.createLocalFile();
		lf.setName("testFiles/usesdevice.spd.xml");
		code.setLocalFile(lf);
		Assert.assertEquals("testFiles/usesdevice.spd.xml", code.getLocalFile().getName());
		code.setLocalFile(lf);
		Assert.assertEquals("testFiles/usesdevice.spd.xml", code.getLocalFile().getName());
	}

} // CodeTest
