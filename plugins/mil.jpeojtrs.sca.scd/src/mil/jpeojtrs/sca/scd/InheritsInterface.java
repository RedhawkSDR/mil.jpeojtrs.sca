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
package mil.jpeojtrs.sca.scd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inherits Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.InheritsInterface#getRepid <em>Repid</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.InheritsInterface#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInheritsInterface()
 * @model extendedMetaData="name='inheritsInterface' kind='empty'"
 * @generated
 */
public interface InheritsInterface extends EObject {

	/**
	 * Returns the value of the '<em><b>Repid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repid attribute is the unique repository id of the interface, which has formats specified in the CORBA specification. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repid</em>' attribute.
	 * @see #setRepid(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInheritsInterface_Repid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='repid'"
	 * @generated
	 */
	String getRepid();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.InheritsInterface#getRepid <em>Repid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repid</em>' attribute.
	 * @see #getRepid()
	 * @generated
	 */
	void setRepid(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInheritsInterface_Interface()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.InheritsInterface#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // InheritsInterface
