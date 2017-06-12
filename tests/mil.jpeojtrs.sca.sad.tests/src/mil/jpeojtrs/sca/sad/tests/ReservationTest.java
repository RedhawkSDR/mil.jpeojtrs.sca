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

import java.net.URISyntaxException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.sad.Reservation;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReservationTest extends TestCase {

	/**
	 * The fixture for this Reservation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reservation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReservationTest.class);
	}

	/**
	 * Constructs a new Reservation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reservation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Reservation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reservation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reservation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SadFactory.eINSTANCE.createReservation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	@Test
	public void test_load() throws URISyntaxException {
		SoftwareAssembly sad = SadTests.loadSADFromDomPath("/waveforms/Reservation/Reservation.sad.xml");
		List<Reservation> reservations = sad.getPartitioning().getHostCollocation().get(0).getReservation();

		Assert.assertNotNull(reservations);
		Assert.assertEquals(2, reservations.size());
		Assert.assertEquals("cpucores", reservations.get(0).getKind());
		Assert.assertEquals("3", reservations.get(0).getValue());
		Assert.assertEquals("otherkind", reservations.get(1).getKind());
		Assert.assertEquals("abc", reservations.get(1).getValue());
	}

} //ReservationTest
