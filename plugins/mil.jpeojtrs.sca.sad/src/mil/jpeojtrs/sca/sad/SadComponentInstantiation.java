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
package mil.jpeojtrs.sca.sad;

import java.math.BigInteger;

import mil.jpeojtrs.sca.partitioning.ComponentInstantiation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getFindComponent <em>Find Component</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getStartOrder <em>Start Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.sad.SadPackage#getSadComponentInstantiation()
 * @model extendedMetaData="name='componentinstantiation' kind='elementOnly' qualified='false'"
 * @generated
 */
public interface SadComponentInstantiation extends ComponentInstantiation {

	/**
	 * Returns the value of the '<em><b>Find Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Find Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Component</em>' containment reference.
	 * @see #setFindComponent(FindComponent)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSadComponentInstantiation_FindComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='findcomponent' namespace='##targetNamespace'"
	 * @generated
	 */
	FindComponent getFindComponent();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getFindComponent <em>Find Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Component</em>' containment reference.
	 * @see #getFindComponent()
	 * @generated
	 */
	void setFindComponent(FindComponent value);

	/**
	 * Returns the value of the '<em><b>Start Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Order</em>' attribute.
	 * @see #setStartOrder(BigInteger)
	 * @see mil.jpeojtrs.sca.sad.SadPackage#getSadComponentInstantiation_StartOrder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='startorder' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getStartOrder();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.sad.SadComponentInstantiation#getStartOrder <em>Start Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Order</em>' attribute.
	 * @see #getStartOrder()
	 * @generated
	 */
	void setStartOrder(BigInteger value);

} // ComponentInstantiation
