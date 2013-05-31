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
package mil.jpeojtrs.sca.prf;

import org.eclipse.emf.common.util.EList;
import org.omg.CORBA.Any;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#getStruct <em>Struct</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.StructValue#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructValue()
 * @model extendedMetaData="name='structvalue' kind='elementOnly'"
 * @generated
 */
public interface StructValue extends PropertyRefContainer {

	/**
     * Returns the value of the '<em><b>Simple Ref</b></em>' containment reference list.
     * The list contents are of type {@link mil.jpeojtrs.sca.prf.SimpleRef}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Simple Ref</em>' containment reference list.
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructValue_SimpleRef()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='simpleref'"
     * @generated
     */
	EList<SimpleRef> getSimpleRef();

	/**
     * Returns the value of the '<em><b>Struct</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Struct</em>' reference.
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructValue_Struct()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
	Struct getStruct();

	/**
     * Returns the value of the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Index</em>' attribute.
     * @see mil.jpeojtrs.sca.prf.PrfPackage#getStructValue_Index()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
	int getIndex();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model dataType="mil.jpeojtrs.sca.prf.Any"
     * @generated
     */
	Any toAny();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	SimpleRef getRef(String id);

} // StructValue
