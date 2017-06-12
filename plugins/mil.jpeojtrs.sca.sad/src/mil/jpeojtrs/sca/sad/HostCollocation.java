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
package mil.jpeojtrs.sca.sad;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Collocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.HostCollocation#getComponentPlacement <em>Component Placement</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.HostCollocation#getUsesDeviceRef <em>Uses Device Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.HostCollocation#getReservation <em>Reservation</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.HostCollocation#getId <em>Id</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.HostCollocation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getHostCollocation()
 * @model extendedMetaData="name='hostcollocation' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface HostCollocation extends EObject {

	/**
	 * Returns the value of the '<em><b>Component Placement</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.sad.SadComponentPlacement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Placement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Placement</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getHostCollocation_ComponentPlacement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="name='componentplacement' kind='element'"
	 * @generated
	 */
	EList<SadComponentPlacement> getComponentPlacement();

	/**
	 * Returns the value of the '<em><b>Uses Device Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.sad.UsesDeviceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Device Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Device Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getHostCollocation_UsesDeviceRef()
	 * @model containment="true"
	 *        extendedMetaData="name='usesdeviceref' kind='element'"
	 * @generated
	 */
	EList<UsesDeviceRef> getUsesDeviceRef();

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.sad.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 4.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getHostCollocation_Reservation()
	 * @model containment="true"
	 *        extendedMetaData="name='reservation' kind='element'"
	 * @generated
	 */
	EList<Reservation> getReservation();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getHostCollocation_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.HostCollocation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getHostCollocation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.HostCollocation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HostCollocation
