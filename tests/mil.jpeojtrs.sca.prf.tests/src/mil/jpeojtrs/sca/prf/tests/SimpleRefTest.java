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
package mil.jpeojtrs.sca.prf.tests;

import org.junit.Assert;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.SimpleRef;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Simple Ref</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class SimpleRefTest extends AbstractPropertyRefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleRefTest.class);
	}

	/**
	 * Constructs a new Simple Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleRef getFixture() {
		return (SimpleRef)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		final Properties props = Properties.Util.getProperties(new ResourceSetImpl().getResource(PrfTests.getURI("testFiles/SimpleRefTest.prf.xml"), true));
		final SimpleRef ref = props.getStructSequence().get(0).getStructValue().get(0).getSimpleRef().get(0);
		Assert.assertNotNull(ref);
		setFixture(ref);
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
	}

	public void test_parse() throws Exception {
		final Properties props = Properties.Util.getProperties(new ResourceSetImpl().getResource(PrfTests.getURI("testFiles/SimpleRefTest.prf.xml"), true));
		final SimpleRef ref = props.getStructSequence().get(0).getStructValue().get(0).getSimpleRef().get(0);
		Assert.assertEquals("DCE:37d9f294-6abb-4b7e-967f-8f7e2a83806d", ref.getRefID());
		Assert.assertEquals("t1", ref.getValue());
	}
} //SimpleRefTest
