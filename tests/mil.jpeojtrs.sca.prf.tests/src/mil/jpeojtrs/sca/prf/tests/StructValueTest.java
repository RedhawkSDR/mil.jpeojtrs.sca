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
import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.prf.Properties;
import mil.jpeojtrs.sca.prf.SimpleSequenceRef;
import mil.jpeojtrs.sca.prf.StructSequence;
import mil.jpeojtrs.sca.prf.StructValue;
import mil.jpeojtrs.sca.prf.Values;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Struct Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#getSimpleRef() <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#getSimpleSequenceRef() <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#getStruct() <em>Struct</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#getIndex() <em>Index</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#toAny() <em>To Any</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#getRef(java.lang.String) <em>Get Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer() <em>Get Property Container</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StructValueTest extends TestCase {

	/**
	 * The fixture for this Struct Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructValueTest.class);
	}

	/**
	 * Constructs a new Struct Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Struct Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StructValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Struct Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructValue getFixture() {
		return fixture;
	}

	private static final ResourceSet resourceSet = new ResourceSetImpl();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		final Properties props = Properties.Util.getProperties(StructValueTest.resourceSet.getResource(PrfTests.getURI("testFiles/StructValueTest.prf.xml"),
			true));
		setFixture(props.getStructSequence().get(0).getStructValue().get(0));
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

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.StructValue#getSimpleRef() <em>Simple Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.StructValue#getSimpleRef()
	 * @generated
	 */
	public void testGetSimpleRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.StructValue#getSimpleSequenceRef() <em>Simple Sequence Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.StructValue#getSimpleSequenceRef()
	 * @generated
	 */
	public void testGetSimpleSequenceRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.StructValue#getStruct() <em>Struct</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.StructValue#getStruct()
	 * @generated NOT
	 */
	public void testGetStruct() {
		// END GENERATED CODE
		Assert.assertNotNull(getFixture().getStruct());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.StructValue#getIndex() <em>Index</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.StructValue#getIndex()
	 * @generated NOT
	 */
	public void testGetIndex() {
		// END GENERATED CODE
		Assert.assertEquals(0, getFixture().getIndex());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.StructValue#toAny() <em>To Any</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.StructValue#toAny()
	 * @generated NOT
	 */
	public void testToAny() {
		// END GENERATED CODE
		Assert.assertNotNull(getFixture().toAny());
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.StructValue#getRef(java.lang.String) <em>Get Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.StructValue#getRef(java.lang.String)
	 * @generated NOT
	 */
	public void testGetRef__String() {
		// END GENERATED CODE
		Assert.assertNull(getFixture().getRef(null));
		Assert.assertNotNull(getFixture().getRef(getFixture().getSimpleRef().get(0).getRefID()));
		// BEGIN GENERATED CODE
	}

	/**
	 * Tests the '{@link mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer() <em>Get Property Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mil.jpeojtrs.sca.prf.PropertyRefContainer#getPropertyContainer()
	 * @generated NOT
	 */
	public void testGetPropertyContainer() {
		// END GENERATED CODE
		Assert.assertNotNull(getFixture().getPropertyContainer());
		// BEGIN GENERATED CODE
	}

	public void test_parse() throws Exception {
		final Properties props = Properties.Util.getProperties(StructValueTest.resourceSet.getResource(PrfTests.getURI("testFiles/StructValueTest.prf.xml"),
			true));
		EList<StructSequence> structSequenceList = props.getStructSequence();
		Assert.assertNotNull(structSequenceList);
		Assert.assertEquals(2, structSequenceList.size());

		StructSequence structSeq = structSequenceList.get(0);
		Assert.assertNotNull(structSeq);

		structSeq = structSequenceList.get(1);
		Assert.assertNotNull(structSeq);
		EList<StructValue> stuctValueList = structSeq.getStructValue();
		Assert.assertNotNull(stuctValueList);
		Assert.assertEquals(2, stuctValueList.size());
		StructValue structValue2 = stuctValueList.get(1);
		Assert.assertNotNull(structValue2);

		EList<SimpleSequenceRef> simpleSeqRefList = structValue2.getSimpleSequenceRef();
		Assert.assertNotNull(simpleSeqRefList);
		Assert.assertEquals(1, simpleSeqRefList.size());
		SimpleSequenceRef simpleSeqRef = simpleSeqRefList.get(0);
		Assert.assertNotNull(simpleSeqRef);
		Assert.assertEquals("DCE:8ab14a5d-00a0-4468-9ab3-7298f7025470", simpleSeqRef.getRefID());

		Values values = simpleSeqRef.getValues();
		Assert.assertNotNull(values);
		EList<String> valueList = values.getValue();
		Assert.assertNotNull(valueList);
		Assert.assertEquals(3, valueList.size());
	}

} //StructValueTest
