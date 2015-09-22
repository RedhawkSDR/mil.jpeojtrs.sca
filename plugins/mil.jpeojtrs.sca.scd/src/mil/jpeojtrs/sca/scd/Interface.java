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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The interface element describes an interface that the component, either directly or through inheritance, provides, uses, or supports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.scd.Interface#getInheritsInterfaces <em>Inherits Interfaces</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.Interface#getName <em>Name</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.scd.Interface#getRepid <em>Repid</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInterface()
 * @model extendedMetaData="name='interface' kind='elementOnly'"
 * @generated
 */
public interface Interface extends EObject {

	/**
	 * Returns the value of the '<em><b>Inherits Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.scd.InheritsInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits Interfaces</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInterface_InheritsInterfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inheritsinterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InheritsInterface> getInheritsInterfaces();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name attribute is the character-based non-qualified name of the interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInterface_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repid attribute is the unique repository id of the interface, which has formats specified in the CORBA specification. The repid is also used to reference an interface element elsewhere in the SCD, for example from the inheritsinterface element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repid</em>' attribute.
	 * @see #setRepid(String)
	 * @see mil.jpeojtrs.sca.scd.ScdPackage#getInterface_Repid()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='repid'"
	 * @generated
	 */
	String getRepid();

	/**
	 * Sets the value of the '{@link mil.jpeojtrs.sca.scd.Interface#getRepid <em>Repid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repid</em>' attribute.
	 * @see #getRepid()
	 * @generated
	 */
	void setRepid(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isInstance(Interface obj);

} // Interface
